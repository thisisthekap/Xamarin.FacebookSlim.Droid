using System;

namespace Xamarin.FacebookSlim.Droid.Dummy
{
    public interface IAccessTokenSlim
    {
        DateTime Expires { get; }

        string[] Permissions { get; }

        string[] DeclinedPermissions { get; }

        string[] ExpiredPermissions { get; }

        DateTime Token { get; }

        DateTime LastRefresh { get; }

        string ApplicationId { get; }

        string UserId { get; }

        DateTime DataAccessExpirationTime { get; }

        string GraphDomain { get; }
    }

    public class AccessTokenSlim : IAccessTokenSlim
    {
        public DateTime Expires { get; }

        public string[] Permissions { get; }

        public string[] DeclinedPermissions { get; }

        public string[] ExpiredPermissions { get; }

        public DateTime Token { get; }

        public DateTime LastRefresh { get; }

        public string ApplicationId { get; }

        public string UserId { get; }

        public DateTime DataAccessExpirationTime { get; }

        public string GraphDomain { get; }
    }
}

