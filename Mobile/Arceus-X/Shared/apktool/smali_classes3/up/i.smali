.class public final synthetic Lup/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lup/i;->a:Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;

    iput-object p2, p0, Lup/i;->b:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lup/i;->a:Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;

    iget-object v1, p0, Lup/i;->b:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;

    invoke-static {v0, v1}, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;->i(Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
