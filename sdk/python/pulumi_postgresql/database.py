# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from . import _utilities, _tables

__all__ = ['Database']


class Database(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 allow_connections: Optional[pulumi.Input[bool]] = None,
                 connection_limit: Optional[pulumi.Input[float]] = None,
                 encoding: Optional[pulumi.Input[str]] = None,
                 is_template: Optional[pulumi.Input[bool]] = None,
                 lc_collate: Optional[pulumi.Input[str]] = None,
                 lc_ctype: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 owner: Optional[pulumi.Input[str]] = None,
                 tablespace_name: Optional[pulumi.Input[str]] = None,
                 template: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Create a Database resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] allow_connections: If `false` then no one can connect to this
               database. The default is `true`, allowing connections (except as restricted by
               other mechanisms, such as `GRANT` or `REVOKE CONNECT`).
        :param pulumi.Input[float] connection_limit: How many concurrent connections can be
               established to this database. `-1` (the default) means no limit.
        :param pulumi.Input[str] encoding: Character set encoding to use in the new database
        :param pulumi.Input[bool] is_template: If `true`, then this database can be cloned by any
               user with `CREATEDB` privileges; if `false` (the default), then only
               superusers or the owner of the database can clone it.
        :param pulumi.Input[str] lc_collate: Collation order (LC_COLLATE) to use in the new database
        :param pulumi.Input[str] lc_ctype: Character classification (LC_CTYPE) to use in the new database
        :param pulumi.Input[str] name: The name of the database. Must be unique on the PostgreSQL
               server instance where it is configured.
        :param pulumi.Input[str] owner: The role name of the user who will own the database, or
               `DEFAULT` to use the default (namely, the user executing the command). To
               create a database owned by another role or to change the owner of an existing
               database, you must be a direct or indirect member of the specified role, or
               the username in the provider is a superuser.
        :param pulumi.Input[str] tablespace_name: The name of the tablespace that will be
               associated with the database, or `DEFAULT` to use the template database's
               tablespace.  This tablespace will be the default tablespace used for objects
               created in this database.
        :param pulumi.Input[str] template: The name of the template from which to create the new database
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['allow_connections'] = allow_connections
            __props__['connection_limit'] = connection_limit
            __props__['encoding'] = encoding
            __props__['is_template'] = is_template
            __props__['lc_collate'] = lc_collate
            __props__['lc_ctype'] = lc_ctype
            __props__['name'] = name
            __props__['owner'] = owner
            __props__['tablespace_name'] = tablespace_name
            __props__['template'] = template
        super(Database, __self__).__init__(
            'postgresql:index/database:Database',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            allow_connections: Optional[pulumi.Input[bool]] = None,
            connection_limit: Optional[pulumi.Input[float]] = None,
            encoding: Optional[pulumi.Input[str]] = None,
            is_template: Optional[pulumi.Input[bool]] = None,
            lc_collate: Optional[pulumi.Input[str]] = None,
            lc_ctype: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            owner: Optional[pulumi.Input[str]] = None,
            tablespace_name: Optional[pulumi.Input[str]] = None,
            template: Optional[pulumi.Input[str]] = None) -> 'Database':
        """
        Get an existing Database resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] allow_connections: If `false` then no one can connect to this
               database. The default is `true`, allowing connections (except as restricted by
               other mechanisms, such as `GRANT` or `REVOKE CONNECT`).
        :param pulumi.Input[float] connection_limit: How many concurrent connections can be
               established to this database. `-1` (the default) means no limit.
        :param pulumi.Input[str] encoding: Character set encoding to use in the new database
        :param pulumi.Input[bool] is_template: If `true`, then this database can be cloned by any
               user with `CREATEDB` privileges; if `false` (the default), then only
               superusers or the owner of the database can clone it.
        :param pulumi.Input[str] lc_collate: Collation order (LC_COLLATE) to use in the new database
        :param pulumi.Input[str] lc_ctype: Character classification (LC_CTYPE) to use in the new database
        :param pulumi.Input[str] name: The name of the database. Must be unique on the PostgreSQL
               server instance where it is configured.
        :param pulumi.Input[str] owner: The role name of the user who will own the database, or
               `DEFAULT` to use the default (namely, the user executing the command). To
               create a database owned by another role or to change the owner of an existing
               database, you must be a direct or indirect member of the specified role, or
               the username in the provider is a superuser.
        :param pulumi.Input[str] tablespace_name: The name of the tablespace that will be
               associated with the database, or `DEFAULT` to use the template database's
               tablespace.  This tablespace will be the default tablespace used for objects
               created in this database.
        :param pulumi.Input[str] template: The name of the template from which to create the new database
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["allow_connections"] = allow_connections
        __props__["connection_limit"] = connection_limit
        __props__["encoding"] = encoding
        __props__["is_template"] = is_template
        __props__["lc_collate"] = lc_collate
        __props__["lc_ctype"] = lc_ctype
        __props__["name"] = name
        __props__["owner"] = owner
        __props__["tablespace_name"] = tablespace_name
        __props__["template"] = template
        return Database(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="allowConnections")
    def allow_connections(self) -> pulumi.Output[Optional[bool]]:
        """
        If `false` then no one can connect to this
        database. The default is `true`, allowing connections (except as restricted by
        other mechanisms, such as `GRANT` or `REVOKE CONNECT`).
        """
        return pulumi.get(self, "allow_connections")

    @property
    @pulumi.getter(name="connectionLimit")
    def connection_limit(self) -> pulumi.Output[Optional[float]]:
        """
        How many concurrent connections can be
        established to this database. `-1` (the default) means no limit.
        """
        return pulumi.get(self, "connection_limit")

    @property
    @pulumi.getter
    def encoding(self) -> pulumi.Output[str]:
        """
        Character set encoding to use in the new database
        """
        return pulumi.get(self, "encoding")

    @property
    @pulumi.getter(name="isTemplate")
    def is_template(self) -> pulumi.Output[bool]:
        """
        If `true`, then this database can be cloned by any
        user with `CREATEDB` privileges; if `false` (the default), then only
        superusers or the owner of the database can clone it.
        """
        return pulumi.get(self, "is_template")

    @property
    @pulumi.getter(name="lcCollate")
    def lc_collate(self) -> pulumi.Output[str]:
        """
        Collation order (LC_COLLATE) to use in the new database
        """
        return pulumi.get(self, "lc_collate")

    @property
    @pulumi.getter(name="lcCtype")
    def lc_ctype(self) -> pulumi.Output[str]:
        """
        Character classification (LC_CTYPE) to use in the new database
        """
        return pulumi.get(self, "lc_ctype")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the database. Must be unique on the PostgreSQL
        server instance where it is configured.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def owner(self) -> pulumi.Output[str]:
        """
        The role name of the user who will own the database, or
        `DEFAULT` to use the default (namely, the user executing the command). To
        create a database owned by another role or to change the owner of an existing
        database, you must be a direct or indirect member of the specified role, or
        the username in the provider is a superuser.
        """
        return pulumi.get(self, "owner")

    @property
    @pulumi.getter(name="tablespaceName")
    def tablespace_name(self) -> pulumi.Output[str]:
        """
        The name of the tablespace that will be
        associated with the database, or `DEFAULT` to use the template database's
        tablespace.  This tablespace will be the default tablespace used for objects
        created in this database.
        """
        return pulumi.get(self, "tablespace_name")

    @property
    @pulumi.getter
    def template(self) -> pulumi.Output[str]:
        """
        The name of the template from which to create the new database
        """
        return pulumi.get(self, "template")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

