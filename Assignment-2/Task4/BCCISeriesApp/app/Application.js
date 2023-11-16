Ext.define('MyApp.Application', {
    extend: 'Ext.app.Application',
    name: 'MyApp',
    requires: ['MyApp.view.SeriesGrid', 'MyApp.controller.SeriesController', 'MyApp.store.SeriesStore'],

    launch: function () {
        Ext.create({
            xtype: 'seriesgrid',
            renderTo: Ext.getBody()
        });
    }
});
