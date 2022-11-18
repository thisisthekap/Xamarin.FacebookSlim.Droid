using System;
namespace Xamarin.FacebookSlim.Droid
{
    public interface ILoginManagerSlim
    {
        void Login(object activity, string[] permissions, ILoginResultListener loginResultListener);

        void Logout();

        void OnActivityResult(int requestCode, int resultCode, object data);
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
        AccessTokenSlim AccessToken { get; }
        string[] RecentlyGrantedPermissions { get; }
        string[] RecentlyDeniedPermissions { get; }
    }

    public class LoginResultSlimImpl : ILoginResultSlim
    {
        AccessTokenSlim ILoginResultSlim.AccessToken => new AccessTokenSlim();

        string[] ILoginResultSlim.RecentlyGrantedPermissions => null;

        string[] ILoginResultSlim.RecentlyDeniedPermissions => null;
    }

    public class LoginManagerSlimImpl : ILoginManagerSlim
    {
         public void Login(object activity, string[] permissions, ILoginResultListener loginResultListener)
        {
            throw new NotImplementedException();
        }

        public void Logout()
        {
           
        }

        public void OnActivityResult(int requestCode, int resultCode, object data)
        {
        }
    }

    public class LoginManagerSlimFactory
    {
        public static LoginManagerSlimImpl CreateInstance()
        {
            return new LoginManagerSlimImpl();
        }

        public static LoginManagerSlimImpl Instance
        {
            get
            {
                return new LoginManagerSlimImpl();
            }
        }
    }
}

