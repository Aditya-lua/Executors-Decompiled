.class public final synthetic Lup/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lup/f;->a:Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;

    iput-object p2, p0, Lup/f;->b:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lup/f;->a:Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;

    iget-object v1, p0, Lup/f;->b:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/permissions/d$b;

    invoke-static {v0, v1, p1}, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;->j(Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lcom/withpersona/sdk2/inquiry/permissions/d$b;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
