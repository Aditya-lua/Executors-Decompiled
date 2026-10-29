.class public final synthetic Lrp/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrp/k0;->a:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;

    iput-object p2, p0, Lrp/k0;->b:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lrp/k0;->a:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;

    iget-object v1, p0, Lrp/k0;->b:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;

    check-cast p1, Lym/r$c;

    invoke-static {v0, v1, p1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;->r(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lym/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
