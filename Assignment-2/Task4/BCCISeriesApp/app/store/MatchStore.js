Ext.define('MyApp.store.MatchStore', {
    extend: 'Ext.data.Store',
    model: 'MyApp.model.Match',
    data: [
        {
            matchId: 1,
            matchDate: Ext.Date.add(new Date(), Ext.Date.DAY, 2), // 2 days from the current date
            team1: 'India',
            team2: 'New Zealand',
            venue: 'Chinnaswamy Stadium',
            seriesId: 1
        }
        
    ]
});
