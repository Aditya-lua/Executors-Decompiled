.class public final Lwh/u0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwh/u0$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0018B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\t\u0010\u0008J\u001b\u0010\r\u001a\u00020\u0006*\u00020\n2\u0006\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u000b*\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\u0004\u0018\u00010\n*\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0019"
    }
    d2 = {
        "Lwh/u0;",
        "Landroidx/lifecycle/f;",
        "<init>",
        "()V",
        "Landroidx/lifecycle/s;",
        "owner",
        "",
        "onCreate",
        "(Landroidx/lifecycle/s;)V",
        "onDestroy",
        "Landroid/net/ConnectivityManager;",
        "Lwh/u0$a;",
        "status",
        "e",
        "(Landroid/net/ConnectivityManager;Lwh/u0$a;)V",
        "d",
        "(Landroid/net/ConnectivityManager;)Lwh/u0$a;",
        "Landroid/net/ConnectivityManager$NetworkCallback;",
        "b",
        "Landroid/net/ConnectivityManager$NetworkCallback;",
        "networkCallback",
        "c",
        "(Landroidx/lifecycle/s;)Landroid/net/ConnectivityManager;",
        "connectivityManager",
        "a",
        "NativeShell_googleProdRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lwh/u0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static b:Landroid/net/ConnectivityManager$NetworkCallback;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lwh/u0;

    invoke-direct {v0}, Lwh/u0;-><init>()V

    sput-object v0, Lwh/u0;->a:Lwh/u0;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lwh/u0;Landroid/net/ConnectivityManager;)Lwh/u0$a;
    .locals 0

    invoke-virtual {p0, p1}, Lwh/u0;->d(Landroid/net/ConnectivityManager;)Lwh/u0$a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lwh/u0;Landroid/net/ConnectivityManager;Lwh/u0$a;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lwh/u0;->e(Landroid/net/ConnectivityManager;Lwh/u0$a;)V

    return-void
.end method


# virtual methods
.method public final c(Landroidx/lifecycle/s;)Landroid/net/ConnectivityManager;
    .locals 2

    instance-of v0, p1, Landroid/content/Context;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Landroid/content/Context;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_1

    const-class v0, Landroid/net/ConnectivityManager;

    invoke-static {p1, v0}, Ll2/b;->k(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/net/ConnectivityManager;

    return-object p1

    :cond_1
    return-object v1
.end method

.method public final d(Landroid/net/ConnectivityManager;)Lwh/u0$a;
    .locals 1

    invoke-virtual {p1}, Landroid/net/ConnectivityManager;->getActiveNetwork()Landroid/net/Network;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object p1, Lwh/u0$a;->a:Lwh/u0$a;

    return-object p1

    :cond_0
    invoke-virtual {p1, v0}, Landroid/net/ConnectivityManager;->getNetworkCapabilities(Landroid/net/Network;)Landroid/net/NetworkCapabilities;

    move-result-object p1

    if-nez p1, :cond_1

    sget-object p1, Lwh/u0$a;->a:Lwh/u0$a;

    return-object p1

    :cond_1
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p1, Lwh/u0$a;->b:Lwh/u0$a;

    return-object p1

    :cond_2
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object p1, Lwh/u0$a;->c:Lwh/u0$a;

    return-object p1

    :cond_3
    sget-object p1, Lwh/u0$a;->d:Lwh/u0$a;

    return-object p1
.end method

.method public final e(Landroid/net/ConnectivityManager;Lwh/u0$a;)V
    .locals 0

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    invoke-static {p1}, Lcom/roblox/engine/jni/NativeGLInterface;->reportNetworkStateChanged(I)V

    return-void
.end method

.method public onCreate(Landroidx/lifecycle/s;)V
    .locals 2
    .param p1    # Landroidx/lifecycle/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lwh/u0;->c(Landroidx/lifecycle/s;)Landroid/net/ConnectivityManager;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Lwh/u0;->d(Landroid/net/ConnectivityManager;)Lwh/u0$a;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lwh/u0;->e(Landroid/net/ConnectivityManager;Lwh/u0$a;)V

    new-instance v0, Lwh/u0$b;

    invoke-direct {v0, p1}, Lwh/u0$b;-><init>(Landroid/net/ConnectivityManager;)V

    sput-object v0, Lwh/u0;->b:Landroid/net/ConnectivityManager$NetworkCallback;

    new-instance v0, Landroid/net/NetworkRequest$Builder;

    invoke-direct {v0}, Landroid/net/NetworkRequest$Builder;-><init>()V

    invoke-virtual {v0}, Landroid/net/NetworkRequest$Builder;->build()Landroid/net/NetworkRequest;

    move-result-object v0

    sget-object v1, Lwh/u0;->b:Landroid/net/ConnectivityManager$NetworkCallback;

    if-nez v1, :cond_1

    const-string v1, "networkCallback"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->u(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_1
    invoke-virtual {p1, v0, v1}, Landroid/net/ConnectivityManager;->registerNetworkCallback(Landroid/net/NetworkRequest;Landroid/net/ConnectivityManager$NetworkCallback;)V

    return-void
.end method

.method public onDestroy(Landroidx/lifecycle/s;)V
    .locals 1
    .param p1    # Landroidx/lifecycle/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lwh/u0;->c(Landroidx/lifecycle/s;)Landroid/net/ConnectivityManager;

    move-result-object p1

    if-eqz p1, :cond_1

    sget-object v0, Lwh/u0;->b:Landroid/net/ConnectivityManager$NetworkCallback;

    if-nez v0, :cond_0

    const-string v0, "networkCallback"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->u(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {p1, v0}, Landroid/net/ConnectivityManager;->unregisterNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V

    :cond_1
    return-void
.end method

.method public bridge onPause(Landroidx/lifecycle/s;)V
    .locals 0
    .param p1    # Landroidx/lifecycle/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-super {p0, p1}, Landroidx/lifecycle/f;->onPause(Landroidx/lifecycle/s;)V

    return-void
.end method

.method public bridge onResume(Landroidx/lifecycle/s;)V
    .locals 0
    .param p1    # Landroidx/lifecycle/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-super {p0, p1}, Landroidx/lifecycle/f;->onResume(Landroidx/lifecycle/s;)V

    return-void
.end method

.method public bridge onStart(Landroidx/lifecycle/s;)V
    .locals 0
    .param p1    # Landroidx/lifecycle/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-super {p0, p1}, Landroidx/lifecycle/f;->onStart(Landroidx/lifecycle/s;)V

    return-void
.end method

.method public bridge onStop(Landroidx/lifecycle/s;)V
    .locals 0
    .param p1    # Landroidx/lifecycle/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-super {p0, p1}, Landroidx/lifecycle/f;->onStop(Landroidx/lifecycle/s;)V

    return-void
.end method
