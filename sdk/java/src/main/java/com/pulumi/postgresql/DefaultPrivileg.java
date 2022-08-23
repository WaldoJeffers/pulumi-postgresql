// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.postgresql;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.postgresql.DefaultPrivilegArgs;
import com.pulumi.postgresql.Utilities;
import com.pulumi.postgresql.inputs.DefaultPrivilegState;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The ``postgresql.DefaultPrivileges`` resource creates and manages default privileges given to a user for a database schema.
 * 
 * &gt; **Note:** This resource needs Postgresql version 9 or above.
 * 
 * ## Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.postgresql.DefaultPrivileges;
 * import com.pulumi.postgresql.DefaultPrivilegesArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var readOnlyTables = new DefaultPrivileges(&#34;readOnlyTables&#34;, DefaultPrivilegesArgs.builder()        
 *             .database(&#34;test_db&#34;)
 *             .objectType(&#34;table&#34;)
 *             .owner(&#34;db_owner&#34;)
 *             .privileges(&#34;SELECT&#34;)
 *             .role(&#34;test_role&#34;)
 *             .schema(&#34;public&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Examples
 * 
 * Revoke default privileges for functions for &#34;public&#34; role:
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.postgresql.DefaultPrivileges;
 * import com.pulumi.postgresql.DefaultPrivilegesArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var revokePublic = new DefaultPrivileges(&#34;revokePublic&#34;, DefaultPrivilegesArgs.builder()        
 *             .database(postgresql_database.example_db().name())
 *             .role(&#34;public&#34;)
 *             .owner(&#34;object_owner&#34;)
 *             .objectType(&#34;function&#34;)
 *             .privileges()
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * @deprecated
 * postgresql.DefaultPrivileg has been deprecated in favor of postgresql.DefaultPrivileges
 * 
 */
@Deprecated /* postgresql.DefaultPrivileg has been deprecated in favor of postgresql.DefaultPrivileges */
@ResourceType(type="postgresql:index/defaultPrivileg:DefaultPrivileg")
public class DefaultPrivileg extends com.pulumi.resources.CustomResource {
    /**
     * The database to grant default privileges for this role.
     * 
     */
    @Export(name="database", type=String.class, parameters={})
    private Output<String> database;

    /**
     * @return The database to grant default privileges for this role.
     * 
     */
    public Output<String> database() {
        return this.database;
    }
    /**
     * The PostgreSQL object type to set the default privileges on (one of: table, sequence, function, type).
     * 
     */
    @Export(name="objectType", type=String.class, parameters={})
    private Output<String> objectType;

    /**
     * @return The PostgreSQL object type to set the default privileges on (one of: table, sequence, function, type).
     * 
     */
    public Output<String> objectType() {
        return this.objectType;
    }
    /**
     * Role for which apply default privileges (You can change default privileges only for objects that will be created by yourself or by roles that you are a member of).
     * 
     */
    @Export(name="owner", type=String.class, parameters={})
    private Output<String> owner;

    /**
     * @return Role for which apply default privileges (You can change default privileges only for objects that will be created by yourself or by roles that you are a member of).
     * 
     */
    public Output<String> owner() {
        return this.owner;
    }
    /**
     * The list of privileges to apply as default privileges. An empty list could be provided to revoke all default privileges for this role.
     * 
     */
    @Export(name="privileges", type=List.class, parameters={String.class})
    private Output<List<String>> privileges;

    /**
     * @return The list of privileges to apply as default privileges. An empty list could be provided to revoke all default privileges for this role.
     * 
     */
    public Output<List<String>> privileges() {
        return this.privileges;
    }
    /**
     * The name of the role to which grant default privileges on.
     * 
     */
    @Export(name="role", type=String.class, parameters={})
    private Output<String> role;

    /**
     * @return The name of the role to which grant default privileges on.
     * 
     */
    public Output<String> role() {
        return this.role;
    }
    /**
     * The database schema to set default privileges for this role.
     * 
     */
    @Export(name="schema", type=String.class, parameters={})
    private Output</* @Nullable */ String> schema;

    /**
     * @return The database schema to set default privileges for this role.
     * 
     */
    public Output<Optional<String>> schema() {
        return Codegen.optional(this.schema);
    }
    /**
     * Permit the grant recipient to grant it to others
     * 
     */
    @Export(name="withGrantOption", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> withGrantOption;

    /**
     * @return Permit the grant recipient to grant it to others
     * 
     */
    public Output<Optional<Boolean>> withGrantOption() {
        return Codegen.optional(this.withGrantOption);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DefaultPrivileg(String name) {
        this(name, DefaultPrivilegArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DefaultPrivileg(String name, DefaultPrivilegArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DefaultPrivileg(String name, DefaultPrivilegArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("postgresql:index/defaultPrivileg:DefaultPrivileg", name, args == null ? DefaultPrivilegArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DefaultPrivileg(String name, Output<String> id, @Nullable DefaultPrivilegState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("postgresql:index/defaultPrivileg:DefaultPrivileg", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static DefaultPrivileg get(String name, Output<String> id, @Nullable DefaultPrivilegState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DefaultPrivileg(name, id, state, options);
    }
}
