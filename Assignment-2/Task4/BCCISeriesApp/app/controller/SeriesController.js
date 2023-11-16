Ext.define('MyApp.controller.SeriesController', {
    extend: 'Ext.app.ViewController',
    alias: 'controller.seriescontroller',

    onSeriesRowClick: function (grid, record) {
        // Handle logic for displaying match details for the selected series
        // You may open another grid or a window to show match details

        // Assuming you have a MatchGrid defined and MatchStore loaded
        var matchGrid = Ext.create('MyApp.view.MatchGrid', {
            seriesId: record.get('seriesId')
        });

        // Assuming you have a window to show match details
        var matchDetailsWindow = Ext.create('Ext.window.Window', {
            title: 'Match Details',
            width: 600,
            height: 400,
            layout: 'fit',
            items: [matchGrid]
        });

        matchDetailsWindow.show();
    }
});
