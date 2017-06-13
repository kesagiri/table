

Ext.onReady(function(){
    Ext.QuickTips.init();


    Ext.state.Manager.setProvider(new Ext.state.CookieProvider());

    var renderAddress = function (addresses){
        var result = addresses.reduce(function(acc, address){
            return address.city +" "+ address.street +" "+ address.house;
        }, "");
        console.log(result);
        return result;

    };

    var store = new Ext.data.JsonStore({

        autoDestroy: true,
        url: '/clients',
        storeId: 'myStore',
        autoLoad: true,
        idProperty: 'id',
        fields: [
                {name: 'id', type: 'int'},
                {name: 'firstName',  type: 'string'},
                {name: 'lastName',       type: 'string'},
                {name: 'addresses',  type: 'array'}
        ]
    });

    console.log(store.load())
    // create the Grid
    var grid = new Ext.grid.GridPanel({
        store: store,
        columns: [
            {
                id       :'id',
                header   : 'Id',
                width    : 20,
                sortable : true,
                dataIndex: 'id'
            },
            {
                header   : 'First Name',
                width    : 100,
                sortable : true,
                dataIndex: 'firstName'
            },
            {
                header   : 'Last Name',
                width    : 100,
                sortable : true,
                dataIndex: 'lastName'
            },
            {
                header   : 'Addresses',
                width    : 100,
                sortable : true,
                dataIndex: 'addresses',
                renderer: renderAddress
            }
        ],
        stripeRows: true,
        height: 350,
        width: 500,
        title: 'Our Clients',
        // config options for stateful behavior
        //stateful: true,
        stateId: 'grid'
    });

    // render the grid to the specified div in the page
    grid.render('groups-grid');
});
