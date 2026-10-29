.class public final synthetic Lup/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lup/c;->a:Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lup/c;->a:Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v0, p1}, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;->g(Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;Z)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
