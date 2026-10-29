.class public final Lz/q2;
.super Ln0/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz/q2$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB%\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\rJ\u001b\u0010\u0011\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00100\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000b*\u0006\u0012\u0002\u0008\u00030\u000fH\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u0019\u00a8\u0006\u001d"
    }
    d2 = {
        "Lz/q2;",
        "Ln0/b;",
        "",
        "",
        "initialCameraIds",
        "La0/p0;",
        "cameraManager",
        "Ljava/util/concurrent/Executor;",
        "systemCallbackExecutor",
        "<init>",
        "(Ljava/util/List;La0/p0;Ljava/util/concurrent/Executor;)V",
        "",
        "g",
        "()V",
        "h",
        "Lne/x;",
        "Lg0/s;",
        "b",
        "()Lne/x;",
        "q",
        "(Lne/x;)V",
        "f",
        "La0/p0;",
        "Ljava/util/concurrent/Executor;",
        "Landroid/hardware/camera2/CameraManager$AvailabilityCallback;",
        "Landroid/hardware/camera2/CameraManager$AvailabilityCallback;",
        "systemAvailabilityCallback",
        "i",
        "a",
        "camera-camera2_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final i:Lz/q2$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final f:La0/p0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final g:Ljava/util/concurrent/Executor;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public h:Landroid/hardware/camera2/CameraManager$AvailabilityCallback;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lz/q2$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lz/q2$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lz/q2;->i:Lz/q2$a;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;La0/p0;Ljava/util/concurrent/Executor;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # La0/p0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/concurrent/Executor;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "La0/p0;",
            "Ljava/util/concurrent/Executor;",
            ")V"
        }
    .end annotation

    const-string v0, "initialCameraIds"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cameraManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "systemCallbackExecutor"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Ln0/b;-><init>(Ljava/util/List;)V

    iput-object p2, p0, Lz/q2;->f:La0/p0;

    iput-object p3, p0, Lz/q2;->g:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public static synthetic l(Lz/q2;Ly1/c$a;)V
    .locals 0

    invoke-static {p0, p1}, Lz/q2;->p(Lz/q2;Ly1/c$a;)V

    return-void
.end method

.method public static synthetic m(Lz/q2;Ly1/c$a;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, Lz/q2;->o(Lz/q2;Ly1/c$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic n(Lz/q2;Lne/x;)V
    .locals 0

    invoke-virtual {p0, p1}, Lz/q2;->q(Lne/x;)V

    return-void
.end method

.method public static final o(Lz/q2;Ly1/c$a;)Ljava/lang/Object;
    .locals 2

    const-string v0, "completer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lz/q2;->g:Ljava/util/concurrent/Executor;

    new-instance v1, Lz/o2;

    invoke-direct {v1, p0, p1}, Lz/o2;-><init>(Lz/q2;Ly1/c$a;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    const-string p0, "FetchData for CameraAvailability"

    return-object p0
.end method

.method public static final p(Lz/q2;Ly1/c$a;)V
    .locals 12

    const-string v1, "Camera2PresenceSrc"

    :try_start_0
    iget-object v0, p0, Lz/q2;->f:La0/p0;

    invoke-virtual {v0}, La0/p0;->d()[Ljava/lang/String;

    move-result-object v0

    const-string v2, "getCameraIdList(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Ljava/util/ArrayList;

    array-length v2, v0

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    array-length v2, v0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_0

    aget-object v6, v0, v4

    sget-object v5, Lg0/s;->c:Lg0/s$a;

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const/4 v9, 0x6

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Lg0/s$a;->d(Lg0/s$a;Ljava/lang/String;Ljava/lang/String;Ln0/e2;ILjava/lang/Object;)Lg0/s;

    move-result-object v5

    invoke-interface {v3, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "[FetchData] Refreshed camera list: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v10, 0x3f

    const/4 v11, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v3 .. v11}, Lkotlin/collections/CollectionsKt;->m0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0, v3}, Ln0/b;->i(Ljava/util/List;)V

    invoke-virtual {p1, v3}, Ly1/c$a;->c(Ljava/lang/Object;)Z
    :try_end_0
    .catch La0/f; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_1
    const-string v2, "[FetchData] Failed to get camera list for refresh."

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    invoke-static {v0}, Lz/a3;->a(La0/f;)Lg0/x;

    move-result-object v0

    const-string v1, "createFrom(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Ln0/b;->j(Ljava/lang/Throwable;)V

    invoke-virtual {p1, v0}, Ly1/c$a;->f(Ljava/lang/Throwable;)Z

    return-void
.end method


# virtual methods
.method public b()Lne/x;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lne/x<",
            "Ljava/util/List<",
            "Lg0/s;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lz/p2;

    invoke-direct {v0, p0}, Lz/p2;-><init>(Lz/q2;)V

    invoke-static {v0}, Ly1/c;->a(Ly1/c$c;)Lne/x;

    move-result-object v0

    const-string v1, "getFuture(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public g()V
    .locals 3

    iget-object v0, p0, Lz/q2;->h:Landroid/hardware/camera2/CameraManager$AvailabilityCallback;

    const-string v1, "Camera2PresenceSrc"

    if-eqz v0, :cond_0

    const-string v0, "Monitoring already started. Unregistering existing callback."

    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lz/q2;->h()V

    :cond_0
    const-string v0, "Starting system availability monitoring."

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Lz/q2$b;

    invoke-direct {v0, p0}, Lz/q2$b;-><init>(Lz/q2;)V

    iput-object v0, p0, Lz/q2;->h:Landroid/hardware/camera2/CameraManager$AvailabilityCallback;

    iget-object v1, p0, Lz/q2;->f:La0/p0;

    iget-object v2, p0, Lz/q2;->g:Ljava/util/concurrent/Executor;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v1, v2, v0}, La0/p0;->g(Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraManager$AvailabilityCallback;)V

    invoke-virtual {p0}, Lz/q2;->b()Lne/x;

    move-result-object v0

    invoke-virtual {p0, v0}, Lz/q2;->q(Lne/x;)V

    return-void
.end method

.method public h()V
    .locals 4

    const-string v0, "Stopping system availability monitoring."

    const-string v1, "Camera2PresenceSrc"

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lz/q2;->h:Landroid/hardware/camera2/CameraManager$AvailabilityCallback;

    if-eqz v0, :cond_0

    const/4 v2, 0x0

    :try_start_0
    iget-object v3, p0, Lz/q2;->f:La0/p0;

    invoke-virtual {v3, v0}, La0/p0;->h(Landroid/hardware/camera2/CameraManager$AvailabilityCallback;)V

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    iput-object v2, p0, Lz/q2;->h:Landroid/hardware/camera2/CameraManager$AvailabilityCallback;

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_0
    move-exception v0

    :try_start_1
    const-string v3, "Failed to unregister system availability callback."

    invoke-static {v1, v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :goto_1
    iput-object v2, p0, Lz/q2;->h:Landroid/hardware/camera2/CameraManager$AvailabilityCallback;

    throw v0

    :cond_0
    :goto_2
    return-void
.end method

.method public final q(Lne/x;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lne/x<",
            "*>;)V"
        }
    .end annotation

    invoke-static {p1}, Lr0/n;->z(Lne/x;)Lne/x;

    return-void
.end method
