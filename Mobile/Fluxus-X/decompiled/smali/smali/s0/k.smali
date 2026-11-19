.class public final Ls0/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg0/f1$j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls0/k$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0008\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\nB\u0013\u0008\u0002\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000f\u0010\u000c\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000e\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0010\u0010\rJ\u000f\u0010\u0011\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\rJ\u000f\u0010\u0012\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\rR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u001c\u00a8\u0006\u001e"
    }
    d2 = {
        "Ls0/k;",
        "Lg0/f1$j;",
        "screenFlash",
        "<init>",
        "(Lg0/f1$j;)V",
        "",
        "expirationTimeMillis",
        "Lg0/f1$k;",
        "screenFlashListener",
        "",
        "a",
        "(JLg0/f1$k;)V",
        "clear",
        "()V",
        "h",
        "()Lg0/f1$j;",
        "f",
        "e",
        "d",
        "Lg0/f1$j;",
        "Ljava/lang/Object;",
        "b",
        "Ljava/lang/Object;",
        "lock",
        "",
        "c",
        "Z",
        "isClearScreenFlashPending",
        "Lg0/f1$k;",
        "pendingListener",
        "camera-core_release"
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
.field public static final e:Ls0/k$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Lg0/f1$j;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final b:Ljava/lang/Object;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public c:Z

.field public d:Lg0/f1$k;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ls0/k$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ls0/k$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ls0/k;->e:Ls0/k$a;

    return-void
.end method

.method public constructor <init>(Lg0/f1$j;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls0/k;->a:Lg0/f1$j;

    .line 3
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls0/k;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lg0/f1$j;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ls0/k;-><init>(Lg0/f1$j;)V

    return-void
.end method

.method public static synthetic b(Ls0/k;)V
    .locals 0

    invoke-static {p0}, Ls0/k;->c(Ls0/k;)V

    return-void
.end method

.method public static final c(Ls0/k;)V
    .locals 3

    iget-object v0, p0, Ls0/k;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ls0/k;->d:Lg0/f1$k;

    if-nez v1, :cond_0

    const-string v1, "ScreenFlashWrapper"

    const-string v2, "apply: pendingListener is null!"

    invoke-static {v1, v2}, Lg0/r1;->l(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    invoke-virtual {p0}, Ls0/k;->e()V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw p0
.end method

.method public static final g(Lg0/f1$j;)Ls0/k;
    .locals 1
    .param p0    # Lg0/f1$j;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Ls0/k;->e:Ls0/k$a;

    invoke-virtual {v0, p0}, Ls0/k$a;->a(Lg0/f1$j;)Ls0/k;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(JLg0/f1$k;)V
    .locals 2
    .param p3    # Lg0/f1$k;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "screenFlashListener"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ls0/k;->b:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, Ls0/k;->c:Z

    iput-object p3, p0, Ls0/k;->d:Lg0/f1$k;

    sget-object p3, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    iget-object p3, p0, Ls0/k;->a:Lg0/f1$j;

    if-eqz p3, :cond_0

    new-instance v0, Ls0/j;

    invoke-direct {v0, p0}, Ls0/j;-><init>(Ls0/k;)V

    invoke-interface {p3, p1, p2, v0}, Lg0/f1$j;->a(JLg0/f1$k;)V

    return-void

    :cond_0
    const-string p1, "ScreenFlashWrapper"

    const-string p2, "apply: screenFlash is null!"

    invoke-static {p1, p2}, Lg0/r1;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Ls0/k;->e()V

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public clear()V
    .locals 0

    invoke-virtual {p0}, Ls0/k;->d()V

    return-void
.end method

.method public final d()V
    .locals 3

    iget-object v0, p0, Ls0/k;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Ls0/k;->c:Z

    if-eqz v1, :cond_1

    iget-object v1, p0, Ls0/k;->a:Lg0/f1$j;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Lg0/f1$j;->clear()V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    const-string v1, "ScreenFlashWrapper"

    const-string v2, "completePendingScreenFlashClear: screenFlash is null!"

    invoke-static {v1, v2}, Lg0/r1;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const-string v1, "ScreenFlashWrapper"

    const-string v2, "completePendingScreenFlashClear: none pending!"

    invoke-static {v1, v2}, Lg0/r1;->l(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    const/4 v1, 0x0

    iput-boolean v1, p0, Ls0/k;->c:Z

    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw v1
.end method

.method public final e()V
    .locals 2

    iget-object v0, p0, Ls0/k;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ls0/k;->d:Lg0/f1$k;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Lg0/f1$k;->a()V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    const/4 v1, 0x0

    iput-object v1, p0, Ls0/k;->d:Lg0/f1$k;

    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw v1
.end method

.method public final f()V
    .locals 0

    invoke-virtual {p0}, Ls0/k;->e()V

    invoke-virtual {p0}, Ls0/k;->d()V

    return-void
.end method

.method public final h()Lg0/f1$j;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Ls0/k;->a:Lg0/f1$j;

    return-object v0
.end method
