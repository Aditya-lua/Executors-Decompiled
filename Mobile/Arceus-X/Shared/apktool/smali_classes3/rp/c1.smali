.class public final synthetic Lrp/c1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;

.field public final synthetic b:Lym/k$a;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrp/c1;->a:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;

    iput-object p2, p0, Lrp/c1;->b:Lym/k$a;

    iput-object p3, p0, Lrp/c1;->c:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lrp/c1;->a:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;

    iget-object v1, p0, Lrp/c1;->b:Lym/k$a;

    iget-object v2, p0, Lrp/c1;->c:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;

    invoke-static {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;->s(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
