using System;
namespace Xamarin.FacebookSlim.Droid.Dummy
{
    public interface ILoginManagerSlim
    {
        void Login(object activity, string[] permissions, LoginResultListener loginResultListener);

        void Logout();
    }

    public interface ILoginResultListener
    {
        void OnCanceled();
        void OnError(Exception exception);
        void OnSuccess(ILoginResultSlim loginResult);
    }

    public class LoginResultListener : ILoginResultListener
    {
        public void OnCanceled()
        {
           
        }

        public void OnError(Exception exception)
        {
            
        }

        public void OnSuccess(ILoginResultSlim loginResult)
        {
            
        }
    }

    public interface ILoginResultSlim
    {
        AccessTokenSlim AccessToken();
        string[] RecentlyGrantedPermissions();
        string[] RecentlyDeniedPermissions();
    }

    public class LoginResultSlimImpl : ILoginResultSlim
    {
        public AccessTokenSlim AccessToken()
        {
            return new AccessTokenSlim();
        }

        public string[] RecentlyDeniedPermissions()
        {
            return null;
        }

        public string[] RecentlyGrantedPermissions()
        {
            return null;
        }
    }

    public class LoginManagerSlimImpl : ILoginManagerSlim
    {
        public void Login(object activity, string[] permissions, LoginResultListener loginResultListener)
        {
           
        }

        public void Logout()
        {
           
        }
    }

    public class LoginManagerSlimFactory
    {
        public static LoginManagerSlimImpl CreateInstance()
        {
            return new LoginManagerSlimImpl();
        }
    }
}

