// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Immutable;

namespace Pulumi.PostgreSql
{
    public static class Config
    {
        private static readonly Pulumi.Config __config = new Pulumi.Config("postgresql");
        /// <summary>
        /// SSL client certificate if required by the database.
        /// </summary>
        public static Pulumi.PostgreSql.Config.Types.Clientcert? Clientcert { get; set; } = __config.GetObject<Pulumi.PostgreSql.Config.Types.Clientcert>("clientcert");

        /// <summary>
        /// Maximum wait for connection, in seconds. Zero or not specified means wait indefinitely.
        /// </summary>
        public static int? ConnectTimeout { get; set; } = __config.GetInt32("connectTimeout") ?? Utilities.GetEnvInt32("PGCONNECT_TIMEOUT") ?? 180;

        /// <summary>
        /// The name of the database to connect to in order to conenct to (defaults to `postgres`).
        /// </summary>
        public static string? Database { get; set; } = __config.Get("database") ?? Utilities.GetEnv("PGDATABASE") ?? "postgres";

        /// <summary>
        /// Database username associated to the connected user (for user name maps)
        /// </summary>
        public static string? DatabaseUsername { get; set; } = __config.Get("databaseUsername");

        /// <summary>
        /// Specify the expected version of PostgreSQL.
        /// </summary>
        public static string? ExpectedVersion { get; set; } = __config.Get("expectedVersion");

        /// <summary>
        /// Name of PostgreSQL server address to connect to
        /// </summary>
        public static string? Host { get; set; } = __config.Get("host") ?? Utilities.GetEnv("PGHOST");

        /// <summary>
        /// Maximum number of connections to establish to the database. Zero means unlimited.
        /// </summary>
        public static int? MaxConnections { get; set; } = __config.GetInt32("maxConnections");

        /// <summary>
        /// Password to be used if the PostgreSQL server demands password authentication
        /// </summary>
        public static string? Password { get; set; } = __config.Get("password") ?? Utilities.GetEnv("PGPASSWORD");

        /// <summary>
        /// The PostgreSQL port number to connect to at the server host, or socket file name extension for Unix-domain connections
        /// </summary>
        public static int? Port { get; set; } = __config.GetInt32("port") ?? Utilities.GetEnvInt32("PGPORT") ?? 5432;

        public static string? SslMode { get; set; } = __config.Get("sslMode");

        /// <summary>
        /// This option determines whether or with what priority a secure SSL TCP/IP connection will be negotiated with the
        /// PostgreSQL server
        /// </summary>
        public static string? Sslmode { get; set; } = __config.Get("sslmode") ?? Utilities.GetEnv("PGSSLMODE");

        /// <summary>
        /// The SSL server root certificate file path. The file must contain PEM encoded data.
        /// </summary>
        public static string? Sslrootcert { get; set; } = __config.Get("sslrootcert");

        /// <summary>
        /// Specify if the user to connect as is a Postgres superuser or not.If not, some feature might be disabled (e.g.:
        /// Refreshing state password from Postgres)
        /// </summary>
        public static bool? Superuser { get; set; } = __config.GetBoolean("superuser");

        /// <summary>
        /// PostgreSQL user name to connect as
        /// </summary>
        public static string? Username { get; set; } = __config.Get("username") ?? Utilities.GetEnv("PGUSER") ?? "postgres";

        public static class Types
        {

             public class Clientcert
             {
                public string Cert { get; set; }
                public string Key { get; set; }
            }
        }
    }
}
