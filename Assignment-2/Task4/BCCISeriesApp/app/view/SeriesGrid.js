Ext.define('MyApp.view.SeriesGrid', {
    extend: 'Ext.grid.Grid',
    xtype: 'seriesgrid',
    title: 'Series Grid',
    store: {
        type: 'seriesstore'
    },
    columns: [
        { text: 'Series ID', dataIndex: 'seriesId', flex: 1 },
        { text: 'Name', dataIndex: 'name', flex: 1 },
        { text: 'Start Date', dataIndex: 'startDate', flex: 1 },
        { text: 'End Date', dataIndex: 'endDate', flex: 1 }
    ],
    listeners: {
        select: 'onSeriesRowClick'
    }
});
