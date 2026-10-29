.class public final synthetic Lrp/z0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;

.field public final synthetic b:Lym/k$a;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrp/z0;->a:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;

    iput-object p2, p0, Lrp/z0;->b:Lym/k$a;

    iput-object p3, p0, Lrp/z0;->c:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lrp/z0;->a:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;

    iget-object v1, p0, Lrp/z0;->b:Lym/k$a;

    iget-object v2, p0, Lrp/z0;->c:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/permissions/d$b;

    invoke-static {v0, v1, v2, p1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;->u(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lcom/withpersona/sdk2/inquiry/permissions/d$b;)Lym/r;

    move-result-object p1

    return-object p1
.end method
