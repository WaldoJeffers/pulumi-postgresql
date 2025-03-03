// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.postgresql;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.postgresql.DatabaseArgs;
import com.pulumi.postgresql.Utilities;
import com.pulumi.postgresql.inputs.DatabaseState;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="postgresql:index/database:Database")
public class Database extends com.pulumi.resources.CustomResource {
    /**
     * If `false` then no one can connect to this
     * database. The default is `true`, allowing connections (except as restricted by
     * other mechanisms, such as `GRANT` or `REVOKE CONNECT`).
     * 
     */
    @Export(name="allowConnections", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> allowConnections;

    /**
     * @return If `false` then no one can connect to this
     * database. The default is `true`, allowing connections (except as restricted by
     * other mechanisms, such as `GRANT` or `REVOKE CONNECT`).
     * 
     */
    public Output<Optional<Boolean>> allowConnections() {
        return Codegen.optional(this.allowConnections);
    }
    /**
     * How many concurrent connections can be
     * established to this database. `-1` (the default) means no limit.
     * 
     */
    @Export(name="connectionLimit", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> connectionLimit;

    /**
     * @return How many concurrent connections can be
     * established to this database. `-1` (the default) means no limit.
     * 
     */
    public Output<Optional<Integer>> connectionLimit() {
        return Codegen.optional(this.connectionLimit);
    }
    /**
     * Character set encoding to use in the new database
     * 
     */
    @Export(name="encoding", type=String.class, parameters={})
    private Output<String> encoding;

    /**
     * @return Character set encoding to use in the new database
     * 
     */
    public Output<String> encoding() {
        return this.encoding;
    }
    /**
     * If `true`, then this database can be cloned by any
     * user with `CREATEDB` privileges; if `false` (the default), then only
     * superusers or the owner of the database can clone it.
     * 
     */
    @Export(name="isTemplate", type=Boolean.class, parameters={})
    private Output<Boolean> isTemplate;

    /**
     * @return If `true`, then this database can be cloned by any
     * user with `CREATEDB` privileges; if `false` (the default), then only
     * superusers or the owner of the database can clone it.
     * 
     */
    public Output<Boolean> isTemplate() {
        return this.isTemplate;
    }
    /**
     * Collation order (LC_COLLATE) to use in the new database
     * 
     */
    @Export(name="lcCollate", type=String.class, parameters={})
    private Output<String> lcCollate;

    /**
     * @return Collation order (LC_COLLATE) to use in the new database
     * 
     */
    public Output<String> lcCollate() {
        return this.lcCollate;
    }
    /**
     * Character classification (LC_CTYPE) to use in the new database
     * 
     */
    @Export(name="lcCtype", type=String.class, parameters={})
    private Output<String> lcCtype;

    /**
     * @return Character classification (LC_CTYPE) to use in the new database
     * 
     */
    public Output<String> lcCtype() {
        return this.lcCtype;
    }
    /**
     * The name of the database. Must be unique on the PostgreSQL
     * server instance where it is configured.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the database. Must be unique on the PostgreSQL
     * server instance where it is configured.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The role name of the user who will own the database, or
     * `DEFAULT` to use the default (namely, the user executing the command). To
     * create a database owned by another role or to change the owner of an existing
     * database, you must be a direct or indirect member of the specified role, or
     * the username in the provider is a superuser.
     * 
     */
    @Export(name="owner", type=String.class, parameters={})
    private Output<String> owner;

    /**
     * @return The role name of the user who will own the database, or
     * `DEFAULT` to use the default (namely, the user executing the command). To
     * create a database owned by another role or to change the owner of an existing
     * database, you must be a direct or indirect member of the specified role, or
     * the username in the provider is a superuser.
     * 
     */
    public Output<String> owner() {
        return this.owner;
    }
    /**
     * The name of the tablespace that will be
     * associated with the database, or `DEFAULT` to use the template database&#39;s
     * tablespace.  This tablespace will be the default tablespace used for objects
     * created in this database.
     * 
     */
    @Export(name="tablespaceName", type=String.class, parameters={})
    private Output<String> tablespaceName;

    /**
     * @return The name of the tablespace that will be
     * associated with the database, or `DEFAULT` to use the template database&#39;s
     * tablespace.  This tablespace will be the default tablespace used for objects
     * created in this database.
     * 
     */
    public Output<String> tablespaceName() {
        return this.tablespaceName;
    }
    /**
     * The name of the template from which to create the new database
     * 
     */
    @Export(name="template", type=String.class, parameters={})
    private Output<String> template;

    /**
     * @return The name of the template from which to create the new database
     * 
     */
    public Output<String> template() {
        return this.template;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Database(String name) {
        this(name, DatabaseArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Database(String name, @Nullable DatabaseArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Database(String name, @Nullable DatabaseArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("postgresql:index/database:Database", name, args == null ? DatabaseArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Database(String name, Output<String> id, @Nullable DatabaseState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("postgresql:index/database:Database", name, state, makeResourceOptions(options, id));
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
    public static Database get(String name, Output<String> id, @Nullable DatabaseState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Database(name, id, state, options);
    }
}
