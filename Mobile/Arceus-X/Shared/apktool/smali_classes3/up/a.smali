.class public final synthetic Lup/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lku/p0;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;


# direct methods
.method public synthetic constructor <init>(Lku/p0;Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lup/a;->a:Lku/p0;

    iput-object p2, p0, Lup/a;->b:Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lup/a;->a:Lku/p0;

    iget-object v1, p0, Lup/a;->b:Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState;

    invoke-static {v0, v1, p1}, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;->m(Lku/p0;Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
