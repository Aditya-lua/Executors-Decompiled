.class public final synthetic Lrp/m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;

.field public final synthetic d:Lym/k$a;


# direct methods
.method public synthetic constructor <init>(ZLcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lym/k$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lrp/m0;->a:Z

    iput-object p2, p0, Lrp/m0;->b:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;

    iput-object p3, p0, Lrp/m0;->c:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;

    iput-object p4, p0, Lrp/m0;->d:Lym/k$a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-boolean v0, p0, Lrp/m0;->a:Z

    iget-object v1, p0, Lrp/m0;->b:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;

    iget-object v2, p0, Lrp/m0;->c:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;

    iget-object v3, p0, Lrp/m0;->d:Lym/k$a;

    check-cast p1, Lym/r$c;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;->D(ZLcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lym/k$a;Lym/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
