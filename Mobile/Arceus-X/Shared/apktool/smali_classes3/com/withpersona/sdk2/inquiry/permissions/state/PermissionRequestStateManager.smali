.class public final Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;
.super Lvr/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$DeviceFeatureRequestState;,
        Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$c;,
        Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState;,
        Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$d;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lvr/c<",
        "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;",
        "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState;",
        "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;",
        "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$d;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0015\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0004./01BG\u0008\u0007\u0012\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0008\u0008\u0001\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002\u00a2\u0006\u0004\u0008\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001aH\u0002\u00a2\u0006\u0004\u0008!\u0010\"J\u000f\u0010#\u001a\u00020\u001aH\u0002\u00a2\u0006\u0004\u0008#\u0010\"R\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010%R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008&\u0010\'R\u0014\u0010\u000c\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008(\u0010)R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008*\u0010+R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008,\u0010-\u00a8\u00062"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;",
        "Lvr/c;",
        "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;",
        "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState;",
        "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;",
        "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$d;",
        "initialProps",
        "Landroidx/lifecycle/l0;",
        "savedStateHandle",
        "Landroid/content/Context;",
        "applicationContext",
        "Lcom/withpersona/sdk2/inquiry/permissions/d$a;",
        "permissionRequestDialogWorkerFactory",
        "Lcom/withpersona/sdk2/inquiry/permissions/a$a;",
        "deviceFeatureRequestWorkerFactory",
        "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
        "trackingEventsLogger",
        "Lku/p0;",
        "coroutineScope",
        "<init>",
        "(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Landroidx/lifecycle/l0;Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/permissions/d$a;Lcom/withpersona/sdk2/inquiry/permissions/a$a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lku/p0;)V",
        "props",
        "x",
        "(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState;",
        "renderProps",
        "renderState",
        "",
        "y",
        "(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState;)V",
        "Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;",
        "output",
        "v",
        "(Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;)V",
        "J",
        "()V",
        "w",
        "e",
        "Landroidx/lifecycle/l0;",
        "f",
        "Landroid/content/Context;",
        "g",
        "Lcom/withpersona/sdk2/inquiry/permissions/d$a;",
        "h",
        "Lcom/withpersona/sdk2/inquiry/permissions/a$a;",
        "i",
        "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
        "c",
        "d",
        "PermissionRequestState",
        "DeviceFeatureRequestState",
        "permissions_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final e:Landroidx/lifecycle/l0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final f:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final g:Lcom/withpersona/sdk2/inquiry/permissions/d$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final h:Lcom/withpersona/sdk2/inquiry/permissions/a$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final i:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Landroidx/lifecycle/l0;Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/permissions/d$a;Lcom/withpersona/sdk2/inquiry/permissions/a$a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lku/p0;)V
    .locals 6
    .param p1    # Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroidx/lifecycle/l0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/withpersona/sdk2/inquiry/permissions/d$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lcom/withpersona/sdk2/inquiry/permissions/a$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Lku/p0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "initialProps"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "savedStateHandle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "applicationContext"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "permissionRequestDialogWorkerFactory"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceFeatureRequestWorkerFactory"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trackingEventsLogger"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p7}, Lvr/c;-><init>(Ljava/lang/Object;Landroidx/lifecycle/l0;Lku/p0;)V

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;->e:Landroidx/lifecycle/l0;

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;->f:Landroid/content/Context;

    iput-object p4, p0, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;->g:Lcom/withpersona/sdk2/inquiry/permissions/d$a;

    iput-object p5, p0, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;->h:Lcom/withpersona/sdk2/inquiry/permissions/a$a;

    iput-object p6, p0, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;->i:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object p1

    invoke-virtual {p1}, Lvr/f;->i()Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;

    move-result-object p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object p1

    invoke-virtual {p0}, Lvr/c;->b()Lnu/c0;

    move-result-object p2

    invoke-interface {p2}, Lnu/c0;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;

    invoke-virtual {p0, p2}, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;->x(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState;

    move-result-object p2

    invoke-virtual {p1, p2}, Lvr/f;->p(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)V

    :cond_0
    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object p1

    new-instance p2, Lup/a;

    invoke-direct {p2, p7, p0}, Lup/a;-><init>(Lku/p0;Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;)V

    invoke-virtual {p1, p2}, Lvr/f;->o(Lkotlin/jvm/functions/Function1;)V

    invoke-static {}, Lku/g1;->d()Lku/l0;

    move-result-object v1

    new-instance v3, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$b;

    const/4 p1, 0x0

    invoke-direct {v3, p0, p1}, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$b;-><init>(Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;Lnt/b;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    move-object v0, p7

    invoke-static/range {v0 .. v5}, Lku/i;->d(Lku/p0;Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lku/d2;

    return-void
.end method

.method public static final A(Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lcom/withpersona/sdk2/inquiry/permissions/a$b;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, Lcom/withpersona/sdk2/inquiry/permissions/a$b$c;

    if-eqz v0, :cond_0

    new-instance p2, Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;->k()Lrp/i0;

    move-result-object p1

    sget-object v0, Lrp/j1;->a:Lrp/j1;

    invoke-direct {p2, p1, v0}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;-><init>(Lrp/i0;Lrp/j1;)V

    invoke-virtual {p0, p2}, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;->v(Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;)V

    goto :goto_0

    :cond_0
    instance-of v0, p2, Lcom/withpersona/sdk2/inquiry/permissions/a$b$a;

    if-eqz v0, :cond_1

    new-instance p2, Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;->k()Lrp/i0;

    move-result-object p1

    sget-object v0, Lrp/j1;->b:Lrp/j1;

    invoke-direct {p2, p1, v0}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;-><init>(Lrp/i0;Lrp/j1;)V

    invoke-virtual {p0, p2}, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;->v(Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;)V

    goto :goto_0

    :cond_1
    instance-of p2, p2, Lcom/withpersona/sdk2/inquiry/permissions/a$b$b;

    if-eqz p2, :cond_2

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;->w()V

    new-instance p2, Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;->k()Lrp/i0;

    move-result-object p1

    sget-object v0, Lrp/j1;->c:Lrp/j1;

    invoke-direct {p2, p1, v0}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;-><init>(Lrp/i0;Lrp/j1;)V

    invoke-virtual {p0, p2}, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;->v(Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;)V

    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0

    :cond_2
    new-instance p0, Ljt/l;

    invoke-direct {p0}, Ljt/l;-><init>()V

    throw p0
.end method

.method public static final B(Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;)Lkotlin/Unit;
    .locals 1

    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object p0

    sget-object v0, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState$RequestPermission;->a:Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState$RequestPermission;

    invoke-virtual {p0, v0}, Lvr/f;->p(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final C(Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)Lkotlin/Unit;
    .locals 2

    new-instance v0, Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;->k()Lrp/i0;

    move-result-object p1

    sget-object v1, Lrp/j1;->b:Lrp/j1;

    invoke-direct {v0, p1, v1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;-><init>(Lrp/i0;Lrp/j1;)V

    invoke-virtual {p0, v0}, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;->v(Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final D(Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lcom/withpersona/sdk2/inquiry/permissions/d$b;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/withpersona/sdk2/inquiry/permissions/d$b$b;->a:Lcom/withpersona/sdk2/inquiry/permissions/d$b$b;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object p0

    sget-object p1, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState$RequestDeviceFeature;->a:Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState$RequestDeviceFeature;

    invoke-virtual {p0, p1}, Lvr/f;->p(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)V

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/withpersona/sdk2/inquiry/permissions/d$b$a;->a:Lcom/withpersona/sdk2/inquiry/permissions/d$b$a;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;->j()Z

    move-result p2

    if-eqz p2, :cond_1

    new-instance p2, Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;->k()Lrp/i0;

    move-result-object p1

    sget-object v0, Lrp/j1;->b:Lrp/j1;

    invoke-direct {p2, p1, v0}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;-><init>(Lrp/i0;Lrp/j1;)V

    invoke-virtual {p0, p2}, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;->v(Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object p0

    sget-object p1, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState$CheckPermissionPermanentlyDenied;->a:Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState$CheckPermissionPermanentlyDenied;

    invoke-virtual {p0, p1}, Lvr/f;->p(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)V

    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0

    :cond_2
    new-instance p0, Ljt/l;

    invoke-direct {p0}, Ljt/l;-><init>()V

    throw p0
.end method

.method public static final E(Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Z)Lkotlin/Unit;
    .locals 1

    if-eqz p2, :cond_0

    new-instance p2, Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;->k()Lrp/i0;

    move-result-object p1

    sget-object v0, Lrp/j1;->b:Lrp/j1;

    invoke-direct {p2, p1, v0}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;-><init>(Lrp/i0;Lrp/j1;)V

    invoke-virtual {p0, p2}, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;->v(Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object p0

    sget-object p1, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState$ShowPermissionPermanentlyDeniedMessage;->a:Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState$ShowPermissionPermanentlyDeniedMessage;

    invoke-virtual {p0, p1}, Lvr/f;->p(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)V

    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final F(Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)Lkotlin/Unit;
    .locals 2

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;->J()V

    new-instance v0, Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;->k()Lrp/i0;

    move-result-object p1

    sget-object v1, Lrp/j1;->c:Lrp/j1;

    invoke-direct {v0, p1, v1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;-><init>(Lrp/i0;Lrp/j1;)V

    invoke-virtual {p0, v0}, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;->v(Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final G(Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)Lkotlin/Unit;
    .locals 2

    new-instance v0, Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;->k()Lrp/i0;

    move-result-object p1

    sget-object v1, Lrp/j1;->b:Lrp/j1;

    invoke-direct {v0, p1, v1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;-><init>(Lrp/i0;Lrp/j1;)V

    invoke-virtual {p0, v0}, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;->v(Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final H(Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;)Lkotlin/Unit;
    .locals 1

    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object p0

    sget-object v0, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$DeviceFeatureRequestState$RequestDeviceFeature;->a:Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$DeviceFeatureRequestState$RequestDeviceFeature;

    invoke-virtual {p0, v0}, Lvr/f;->p(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final I(Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)Lkotlin/Unit;
    .locals 2

    new-instance v0, Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;->k()Lrp/i0;

    move-result-object p1

    sget-object v1, Lrp/j1;->b:Lrp/j1;

    invoke-direct {v0, p1, v1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;-><init>(Lrp/i0;Lrp/j1;)V

    invoke-virtual {p0, v0}, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;->v(Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic g(Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;->z(Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;->F(Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;->G(Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lcom/withpersona/sdk2/inquiry/permissions/d$b;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;->D(Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lcom/withpersona/sdk2/inquiry/permissions/d$b;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;->B(Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lcom/withpersona/sdk2/inquiry/permissions/a$b;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;->A(Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lcom/withpersona/sdk2/inquiry/permissions/a$b;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lku/p0;Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;->r(Lku/p0;Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;->H(Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;->I(Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;->E(Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;->C(Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final r(Lku/p0;Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState;)Lkotlin/Unit;
    .locals 6

    if-nez p2, :cond_0

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0

    :cond_0
    invoke-static {}, Lku/g1;->d()Lku/l0;

    move-result-object v1

    new-instance v3, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$a;

    const/4 v0, 0x0

    invoke-direct {v3, p1, p2, v0}, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$a;-><init>(Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState;Lnt/b;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lku/i;->d(Lku/p0;Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lku/d2;

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final synthetic s(Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;->v(Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;)V

    return-void
.end method

.method public static final synthetic t(Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;->f:Landroid/content/Context;

    return-object p0
.end method

.method public static final synthetic u(Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;->y(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState;)V

    return-void
.end method

.method public static final z(Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;Z)Lkotlin/Unit;
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object p0

    sget-object p1, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState$ShowRequestPermissionRationale;->a:Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState$ShowRequestPermissionRationale;

    invoke-virtual {p0, p1}, Lvr/f;->p(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object p0

    sget-object p1, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState$RequestPermission;->a:Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState$RequestPermission;

    invoke-virtual {p0, p1}, Lvr/f;->p(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)V

    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final J()V
    .locals 4

    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.settings.APPLICATION_DETAILS_SETTINGS"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;->f:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const-string v3, "package"

    invoke-static {v3, v1, v2}, Landroid/net/Uri;->fromParts(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;->f:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public final v(Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;)V
    .locals 7

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;->i:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    new-instance v1, Lcom/withpersona/sdk2/inquiry/tracking/model/PermissionTrackingEventData;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;->a()Lrp/i0;

    move-result-object v2

    invoke-static {v2}, Lrp/n1;->c(Lrp/i0;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;->f()Lrp/j1;

    move-result-object v3

    invoke-static {v3}, Lrp/n1;->b(Lrp/j1;)Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lcom/withpersona/sdk2/inquiry/tracking/model/PermissionTrackingEventData;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v1, v4, v2, v3}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;->logPermissionEvent$default(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lcom/withpersona/sdk2/inquiry/tracking/model/PermissionTrackingEventData;ZILjava/lang/Object;)V

    new-instance v0, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;

    invoke-direct {v0, p1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;-><init>(Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;)V

    invoke-virtual {p0, v0}, Lvr/c;->e(Ljava/lang/Object;)V

    return-void
.end method

.method public final w()V
    .locals 2

    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.settings.LOCATION_SOURCE_SETTINGS"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;->f:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public final x(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState;
    .locals 1
    .param p1    # Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "props"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState$CheckPermissionState;->a:Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState$CheckPermissionState;

    return-object p1
.end method

.method public final y(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState;)V
    .locals 12

    sget-object v0, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState$CheckPermissionState;->a:Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState$CheckPermissionState;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object p2

    new-instance v0, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$f;

    invoke-direct {v0, p0, p1, v1}, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$f;-><init>(Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lnt/b;)V

    const-string p1, "check_permission_state"

    invoke-virtual {p2, p1, v0}, Lvr/f;->m(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void

    :cond_0
    sget-object v0, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState$CheckPermissionRationaleState;->a:Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState$CheckPermissionRationaleState;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lvr/c;->c()Lnu/c0;

    move-result-object p2

    new-instance v0, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$d$b;

    new-instance v1, Lrp/i;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;->k()Lrp/i0;

    move-result-object p1

    new-instance v3, Lup/c;

    invoke-direct {v3, p0}, Lup/c;-><init>(Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;)V

    invoke-direct {v1, p1, v2, v3}, Lrp/i;-><init>(Lrp/i0;ZLkotlin/jvm/functions/Function1;)V

    invoke-direct {v0, v1}, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$d$b;-><init>(Lrp/i;)V

    invoke-interface {p2, v0}, Lnu/c0;->setValue(Ljava/lang/Object;)V

    return-void

    :cond_1
    sget-object v0, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState$ShowRequestPermissionRationale;->a:Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState$ShowRequestPermissionRationale;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const-string v3, "getString(...)"

    if-eqz v0, :cond_4

    iget-object p2, p0, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;->i:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    new-instance v4, Lcom/withpersona/sdk2/inquiry/tracking/model/PermissionTrackingEventData;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;->k()Lrp/i0;

    move-result-object v0

    invoke-static {v0}, Lrp/n1;->c(Lrp/i0;)Ljava/lang/String;

    move-result-object v5

    const/4 v8, 0x4

    const/4 v9, 0x0

    const-string v6, "permission_sheet_presented"

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v9}, Lcom/withpersona/sdk2/inquiry/tracking/model/PermissionTrackingEventData;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v0, 0x2

    invoke-static {p2, v4, v2, v0, v1}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;->logPermissionEvent$default(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lcom/withpersona/sdk2/inquiry/tracking/model/PermissionTrackingEventData;ZILjava/lang/Object;)V

    invoke-virtual {p0}, Lvr/c;->c()Lnu/c0;

    move-result-object p2

    new-instance v0, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$d$a;

    new-instance v4, Lrp/h;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;->getTitle()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;->n()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;->m()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;->f:Landroid/content/Context;

    sget v2, Lvp/g;->D:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_2
    move-object v7, v1

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;->p()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;

    move-result-object v8

    new-instance v9, Lup/d;

    invoke-direct {v9, p0}, Lup/d;-><init>(Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;)V

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;->i()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_3

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;->f:Landroid/content/Context;

    sget v2, Lvp/g;->C:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_3
    move-object v10, v1

    new-instance v11, Lup/e;

    invoke-direct {v11, p0, p1}, Lup/e;-><init>(Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)V

    invoke-direct/range {v4 .. v11}, Lrp/h;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    invoke-direct {v0, v4}, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$d$a;-><init>(Lrp/h;)V

    invoke-interface {p2, v0}, Lnu/c0;->setValue(Ljava/lang/Object;)V

    return-void

    :cond_4
    sget-object v0, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState$RequestPermission;->a:Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState$RequestPermission;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object p2

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;->g:Lcom/withpersona/sdk2/inquiry/permissions/d$a;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;->k()Lrp/i0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/withpersona/sdk2/inquiry/permissions/d$a;->a(Lrp/i0;)Lcom/withpersona/sdk2/inquiry/permissions/d;

    move-result-object v0

    new-instance v1, Lup/f;

    invoke-direct {v1, p0, p1}, Lup/f;-><init>(Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)V

    invoke-virtual {p2, v0, v1}, Lvr/f;->n(Lvr/h;Lkotlin/jvm/functions/Function1;)V

    return-void

    :cond_5
    sget-object v0, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState$RequestDeviceFeature;->a:Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState$RequestDeviceFeature;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;->q()Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object p1

    sget-object p2, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$DeviceFeatureRequestState$CheckDeviceFeatureState;->a:Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$DeviceFeatureRequestState$CheckDeviceFeatureState;

    invoke-virtual {p1, p2}, Lvr/f;->p(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)V

    return-void

    :cond_6
    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object p2

    new-instance v0, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$g;

    invoke-direct {v0, p0, p1, v1}, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$g;-><init>(Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lnt/b;)V

    const-string p1, "request_device_feature"

    invoke-virtual {p2, p1, v0}, Lvr/f;->m(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void

    :cond_7
    sget-object v0, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState$CheckPermissionPermanentlyDenied;->a:Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState$CheckPermissionPermanentlyDenied;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {p0}, Lvr/c;->c()Lnu/c0;

    move-result-object p2

    new-instance v0, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$d$b;

    new-instance v1, Lrp/i;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;->k()Lrp/i0;

    move-result-object v2

    new-instance v3, Lup/g;

    invoke-direct {v3, p0, p1}, Lup/g;-><init>(Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)V

    const/4 p1, 0x1

    invoke-direct {v1, v2, p1, v3}, Lrp/i;-><init>(Lrp/i0;ZLkotlin/jvm/functions/Function1;)V

    invoke-direct {v0, v1}, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$d$b;-><init>(Lrp/i;)V

    invoke-interface {p2, v0}, Lnu/c0;->setValue(Ljava/lang/Object;)V

    return-void

    :cond_8
    sget-object v0, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState$ShowPermissionPermanentlyDeniedMessage;->a:Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState$ShowPermissionPermanentlyDeniedMessage;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-virtual {p0}, Lvr/c;->c()Lnu/c0;

    move-result-object p2

    new-instance v0, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$d$a;

    new-instance v4, Lrp/h;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;->getTitle()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;->o()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;->m()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_9

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;->f:Landroid/content/Context;

    sget v2, Lvp/g;->E:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_9
    move-object v7, v1

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;->p()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;

    move-result-object v8

    new-instance v9, Lup/h;

    invoke-direct {v9, p0, p1}, Lup/h;-><init>(Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)V

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;->i()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_a

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;->f:Landroid/content/Context;

    sget v2, Lvp/g;->C:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_a
    move-object v10, v1

    new-instance v11, Lup/i;

    invoke-direct {v11, p0, p1}, Lup/i;-><init>(Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)V

    invoke-direct/range {v4 .. v11}, Lrp/h;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    invoke-direct {v0, v4}, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$d$a;-><init>(Lrp/h;)V

    invoke-interface {p2, v0}, Lnu/c0;->setValue(Ljava/lang/Object;)V

    return-void

    :cond_b
    sget-object v0, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$DeviceFeatureRequestState$CheckDeviceFeatureState;->a:Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$DeviceFeatureRequestState$CheckDeviceFeatureState;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object p2

    new-instance v0, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$e;

    invoke-direct {v0, p0, p1, v1}, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$e;-><init>(Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lnt/b;)V

    const-string p1, "check_device_feature_state"

    invoke-virtual {p2, p1, v0}, Lvr/f;->m(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void

    :cond_c
    sget-object v0, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$DeviceFeatureRequestState$ShowDeviceFeaturePrompt;->a:Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$DeviceFeatureRequestState$ShowDeviceFeaturePrompt;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-virtual {p0}, Lvr/c;->c()Lnu/c0;

    move-result-object p2

    new-instance v0, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$d$a;

    new-instance v1, Lrp/h;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;->g()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_d

    const-string v2, "Couldn\'t access location feature"

    :cond_d
    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;->f()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_e

    const-string v3, "Location is turned off, please allow access to your device\'s location feature"

    :cond_e
    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;->m()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_f

    const-string v4, "Allow"

    :cond_f
    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;->p()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;

    move-result-object v5

    new-instance v6, Lup/j;

    invoke-direct {v6, p0}, Lup/j;-><init>(Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;)V

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;->a()Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_10

    const-string v7, "Cancel"

    :cond_10
    new-instance v8, Lup/k;

    invoke-direct {v8, p0, p1}, Lup/k;-><init>(Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)V

    invoke-direct/range {v1 .. v8}, Lrp/h;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    invoke-direct {v0, v1}, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$d$a;-><init>(Lrp/h;)V

    invoke-interface {p2, v0}, Lnu/c0;->setValue(Ljava/lang/Object;)V

    return-void

    :cond_11
    sget-object v0, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$DeviceFeatureRequestState$RequestDeviceFeature;->a:Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$DeviceFeatureRequestState$RequestDeviceFeature;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_12

    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object p2

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;->h:Lcom/withpersona/sdk2/inquiry/permissions/a$a;

    invoke-interface {v0}, Lcom/withpersona/sdk2/inquiry/permissions/a$a;->a()Lcom/withpersona/sdk2/inquiry/permissions/a;

    move-result-object v0

    new-instance v1, Lup/b;

    invoke-direct {v1, p0, p1}, Lup/b;-><init>(Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)V

    invoke-virtual {p2, v0, v1}, Lvr/f;->n(Lvr/h;Lkotlin/jvm/functions/Function1;)V

    return-void

    :cond_12
    sget-object p1, Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState$Complete;->a:Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState$Complete;

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_13

    return-void

    :cond_13
    new-instance p1, Ljt/l;

    invoke-direct {p1}, Ljt/l;-><init>()V

    throw p1
.end method
