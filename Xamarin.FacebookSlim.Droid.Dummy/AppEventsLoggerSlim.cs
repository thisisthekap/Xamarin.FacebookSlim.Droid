using System;
namespace Xamarin.FacebookSlim.Droid.Dummy
{
    public class AppEventsLoggerSlim
    {
        public static AppEventsLoggerSlim NewLogger(object context)
        {
            return new AppEventsLoggerSlim();
        }

        public void LogEvent(string appEvent, object ventProperties) {
           
        }
    }
}

