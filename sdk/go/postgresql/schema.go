// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package postgresql

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type Schema struct {
	pulumi.CustomResourceState

	// The DATABASE in which where this schema will be created. (Default: The database used by your `provider` configuration)
	Database pulumi.StringOutput `pulumi:"database"`
	// When true, will also drop all the objects that are contained in the schema. (Default: false)
	DropCascade pulumi.BoolPtrOutput `pulumi:"dropCascade"`
	// When true, use the existing schema if it exists. (Default: true)
	IfNotExists pulumi.BoolPtrOutput `pulumi:"ifNotExists"`
	// The name of the schema. Must be unique in the PostgreSQL
	// database instance where it is configured.
	Name pulumi.StringOutput `pulumi:"name"`
	// The ROLE who owns the schema.
	Owner pulumi.StringOutput `pulumi:"owner"`
	// Can be specified multiple times for each policy.  Each
	// policy block supports fields documented below.
	//
	// Deprecated: Use postgresql_grant resource instead (with object_type="schema")
	Policies SchemaPolicyArrayOutput `pulumi:"policies"`
}

// NewSchema registers a new resource with the given unique name, arguments, and options.
func NewSchema(ctx *pulumi.Context,
	name string, args *SchemaArgs, opts ...pulumi.ResourceOption) (*Schema, error) {
	if args == nil {
		args = &SchemaArgs{}
	}

	var resource Schema
	err := ctx.RegisterResource("postgresql:index/schema:Schema", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSchema gets an existing Schema resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSchema(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SchemaState, opts ...pulumi.ResourceOption) (*Schema, error) {
	var resource Schema
	err := ctx.ReadResource("postgresql:index/schema:Schema", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Schema resources.
type schemaState struct {
	// The DATABASE in which where this schema will be created. (Default: The database used by your `provider` configuration)
	Database *string `pulumi:"database"`
	// When true, will also drop all the objects that are contained in the schema. (Default: false)
	DropCascade *bool `pulumi:"dropCascade"`
	// When true, use the existing schema if it exists. (Default: true)
	IfNotExists *bool `pulumi:"ifNotExists"`
	// The name of the schema. Must be unique in the PostgreSQL
	// database instance where it is configured.
	Name *string `pulumi:"name"`
	// The ROLE who owns the schema.
	Owner *string `pulumi:"owner"`
	// Can be specified multiple times for each policy.  Each
	// policy block supports fields documented below.
	//
	// Deprecated: Use postgresql_grant resource instead (with object_type="schema")
	Policies []SchemaPolicy `pulumi:"policies"`
}

type SchemaState struct {
	// The DATABASE in which where this schema will be created. (Default: The database used by your `provider` configuration)
	Database pulumi.StringPtrInput
	// When true, will also drop all the objects that are contained in the schema. (Default: false)
	DropCascade pulumi.BoolPtrInput
	// When true, use the existing schema if it exists. (Default: true)
	IfNotExists pulumi.BoolPtrInput
	// The name of the schema. Must be unique in the PostgreSQL
	// database instance where it is configured.
	Name pulumi.StringPtrInput
	// The ROLE who owns the schema.
	Owner pulumi.StringPtrInput
	// Can be specified multiple times for each policy.  Each
	// policy block supports fields documented below.
	//
	// Deprecated: Use postgresql_grant resource instead (with object_type="schema")
	Policies SchemaPolicyArrayInput
}

func (SchemaState) ElementType() reflect.Type {
	return reflect.TypeOf((*schemaState)(nil)).Elem()
}

type schemaArgs struct {
	// The DATABASE in which where this schema will be created. (Default: The database used by your `provider` configuration)
	Database *string `pulumi:"database"`
	// When true, will also drop all the objects that are contained in the schema. (Default: false)
	DropCascade *bool `pulumi:"dropCascade"`
	// When true, use the existing schema if it exists. (Default: true)
	IfNotExists *bool `pulumi:"ifNotExists"`
	// The name of the schema. Must be unique in the PostgreSQL
	// database instance where it is configured.
	Name *string `pulumi:"name"`
	// The ROLE who owns the schema.
	Owner *string `pulumi:"owner"`
	// Can be specified multiple times for each policy.  Each
	// policy block supports fields documented below.
	//
	// Deprecated: Use postgresql_grant resource instead (with object_type="schema")
	Policies []SchemaPolicy `pulumi:"policies"`
}

// The set of arguments for constructing a Schema resource.
type SchemaArgs struct {
	// The DATABASE in which where this schema will be created. (Default: The database used by your `provider` configuration)
	Database pulumi.StringPtrInput
	// When true, will also drop all the objects that are contained in the schema. (Default: false)
	DropCascade pulumi.BoolPtrInput
	// When true, use the existing schema if it exists. (Default: true)
	IfNotExists pulumi.BoolPtrInput
	// The name of the schema. Must be unique in the PostgreSQL
	// database instance where it is configured.
	Name pulumi.StringPtrInput
	// The ROLE who owns the schema.
	Owner pulumi.StringPtrInput
	// Can be specified multiple times for each policy.  Each
	// policy block supports fields documented below.
	//
	// Deprecated: Use postgresql_grant resource instead (with object_type="schema")
	Policies SchemaPolicyArrayInput
}

func (SchemaArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*schemaArgs)(nil)).Elem()
}

type SchemaInput interface {
	pulumi.Input

	ToSchemaOutput() SchemaOutput
	ToSchemaOutputWithContext(ctx context.Context) SchemaOutput
}

func (*Schema) ElementType() reflect.Type {
	return reflect.TypeOf((*Schema)(nil))
}

func (i *Schema) ToSchemaOutput() SchemaOutput {
	return i.ToSchemaOutputWithContext(context.Background())
}

func (i *Schema) ToSchemaOutputWithContext(ctx context.Context) SchemaOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SchemaOutput)
}

func (i *Schema) ToSchemaPtrOutput() SchemaPtrOutput {
	return i.ToSchemaPtrOutputWithContext(context.Background())
}

func (i *Schema) ToSchemaPtrOutputWithContext(ctx context.Context) SchemaPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SchemaPtrOutput)
}

type SchemaPtrInput interface {
	pulumi.Input

	ToSchemaPtrOutput() SchemaPtrOutput
	ToSchemaPtrOutputWithContext(ctx context.Context) SchemaPtrOutput
}

type schemaPtrType SchemaArgs

func (*schemaPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**Schema)(nil))
}

func (i *schemaPtrType) ToSchemaPtrOutput() SchemaPtrOutput {
	return i.ToSchemaPtrOutputWithContext(context.Background())
}

func (i *schemaPtrType) ToSchemaPtrOutputWithContext(ctx context.Context) SchemaPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SchemaPtrOutput)
}

// SchemaArrayInput is an input type that accepts SchemaArray and SchemaArrayOutput values.
// You can construct a concrete instance of `SchemaArrayInput` via:
//
//          SchemaArray{ SchemaArgs{...} }
type SchemaArrayInput interface {
	pulumi.Input

	ToSchemaArrayOutput() SchemaArrayOutput
	ToSchemaArrayOutputWithContext(context.Context) SchemaArrayOutput
}

type SchemaArray []SchemaInput

func (SchemaArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*Schema)(nil))
}

func (i SchemaArray) ToSchemaArrayOutput() SchemaArrayOutput {
	return i.ToSchemaArrayOutputWithContext(context.Background())
}

func (i SchemaArray) ToSchemaArrayOutputWithContext(ctx context.Context) SchemaArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SchemaArrayOutput)
}

// SchemaMapInput is an input type that accepts SchemaMap and SchemaMapOutput values.
// You can construct a concrete instance of `SchemaMapInput` via:
//
//          SchemaMap{ "key": SchemaArgs{...} }
type SchemaMapInput interface {
	pulumi.Input

	ToSchemaMapOutput() SchemaMapOutput
	ToSchemaMapOutputWithContext(context.Context) SchemaMapOutput
}

type SchemaMap map[string]SchemaInput

func (SchemaMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*Schema)(nil))
}

func (i SchemaMap) ToSchemaMapOutput() SchemaMapOutput {
	return i.ToSchemaMapOutputWithContext(context.Background())
}

func (i SchemaMap) ToSchemaMapOutputWithContext(ctx context.Context) SchemaMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SchemaMapOutput)
}

type SchemaOutput struct {
	*pulumi.OutputState
}

func (SchemaOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*Schema)(nil))
}

func (o SchemaOutput) ToSchemaOutput() SchemaOutput {
	return o
}

func (o SchemaOutput) ToSchemaOutputWithContext(ctx context.Context) SchemaOutput {
	return o
}

func (o SchemaOutput) ToSchemaPtrOutput() SchemaPtrOutput {
	return o.ToSchemaPtrOutputWithContext(context.Background())
}

func (o SchemaOutput) ToSchemaPtrOutputWithContext(ctx context.Context) SchemaPtrOutput {
	return o.ApplyT(func(v Schema) *Schema {
		return &v
	}).(SchemaPtrOutput)
}

type SchemaPtrOutput struct {
	*pulumi.OutputState
}

func (SchemaPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Schema)(nil))
}

func (o SchemaPtrOutput) ToSchemaPtrOutput() SchemaPtrOutput {
	return o
}

func (o SchemaPtrOutput) ToSchemaPtrOutputWithContext(ctx context.Context) SchemaPtrOutput {
	return o
}

type SchemaArrayOutput struct{ *pulumi.OutputState }

func (SchemaArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]Schema)(nil))
}

func (o SchemaArrayOutput) ToSchemaArrayOutput() SchemaArrayOutput {
	return o
}

func (o SchemaArrayOutput) ToSchemaArrayOutputWithContext(ctx context.Context) SchemaArrayOutput {
	return o
}

func (o SchemaArrayOutput) Index(i pulumi.IntInput) SchemaOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) Schema {
		return vs[0].([]Schema)[vs[1].(int)]
	}).(SchemaOutput)
}

type SchemaMapOutput struct{ *pulumi.OutputState }

func (SchemaMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]Schema)(nil))
}

func (o SchemaMapOutput) ToSchemaMapOutput() SchemaMapOutput {
	return o
}

func (o SchemaMapOutput) ToSchemaMapOutputWithContext(ctx context.Context) SchemaMapOutput {
	return o
}

func (o SchemaMapOutput) MapIndex(k pulumi.StringInput) SchemaOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) Schema {
		return vs[0].(map[string]Schema)[vs[1].(string)]
	}).(SchemaOutput)
}

func init() {
	pulumi.RegisterOutputType(SchemaOutput{})
	pulumi.RegisterOutputType(SchemaPtrOutput{})
	pulumi.RegisterOutputType(SchemaArrayOutput{})
	pulumi.RegisterOutputType(SchemaMapOutput{})
}
