Ext.define('MyApp.store.SeriesStore', {
    extend: 'Ext.data.Store',
    model: 'MyApp.model.Series',
    data: [
        {
            seriesId: 1,
            name: 'T20 Series',
            startDate: new Date(), // Current date
            endDate: Ext.Date.add(new Date(), Ext.Date.DAY, 7) // 7 days from the current date
        }
        
    ]
});
