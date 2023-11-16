/*
 * This file launches the application by asking Ext JS to create
 * and launch() the Application class.
 */

Ext.application({
    name: 'MyApp',
    requires: ['MyApp.view.SeriesGrid'],
    launch: function () {
        Ext.create('MyApp.view.SeriesGrid', {
            renderTo: Ext.getBody()
        });
    }
});
