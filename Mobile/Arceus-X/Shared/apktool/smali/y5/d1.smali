.class public final Ly5/d1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly5/b1;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J!\u0010\r\u001a\u00020\u000c2\u0006\u0010\t\u001a\u00020\u00082\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u000c2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Ly5/d1;",
        "Ly5/b1;",
        "Ly5/s;",
        "processor",
        "Lh6/b;",
        "workTaskExecutor",
        "<init>",
        "(Ly5/s;Lh6/b;)V",
        "Ly5/y;",
        "workSpecId",
        "Landroidx/work/WorkerParameters$a;",
        "runtimeExtras",
        "",
        "e",
        "(Ly5/y;Landroidx/work/WorkerParameters$a;)V",
        "",
        "reason",
        "b",
        "(Ly5/y;I)V",
        "a",
        "Ly5/s;",
        "getProcessor",
        "()Ly5/s;",
        "Lh6/b;",
        "getWorkTaskExecutor",
        "()Lh6/b;",
        "work-runtime_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Ly5/s;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lh6/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ly5/s;Lh6/b;)V
    .locals 1
    .param p1    # Ly5/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lh6/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "processor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workTaskExecutor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly5/d1;->a:Ly5/s;

    iput-object p2, p0, Ly5/d1;->b:Lh6/b;

    return-void
.end method

.method public static synthetic f(Ly5/d1;Ly5/y;Landroidx/work/WorkerParameters$a;)V
    .locals 0

    invoke-static {p0, p1, p2}, Ly5/d1;->g(Ly5/d1;Ly5/y;Landroidx/work/WorkerParameters$a;)V

    return-void
.end method

.method public static final g(Ly5/d1;Ly5/y;Landroidx/work/WorkerParameters$a;)V
    .locals 0

    iget-object p0, p0, Ly5/d1;->a:Ly5/s;

    invoke-virtual {p0, p1, p2}, Ly5/s;->o(Ly5/y;Landroidx/work/WorkerParameters$a;)Z

    return-void
.end method


# virtual methods
.method public b(Ly5/y;I)V
    .locals 4
    .param p1    # Ly5/y;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "workSpecId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ly5/d1;->b:Lh6/b;

    new-instance v1, Lg6/z;

    iget-object v2, p0, Ly5/d1;->a:Ly5/s;

    const/4 v3, 0x0

    invoke-direct {v1, v2, p1, v3, p2}, Lg6/z;-><init>(Ly5/s;Ly5/y;ZI)V

    invoke-interface {v0, v1}, Lh6/b;->d(Ljava/lang/Runnable;)V

    return-void
.end method

.method public e(Ly5/y;Landroidx/work/WorkerParameters$a;)V
    .locals 2
    .param p1    # Ly5/y;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroidx/work/WorkerParameters$a;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "workSpecId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ly5/d1;->b:Lh6/b;

    new-instance v1, Ly5/c1;

    invoke-direct {v1, p0, p1, p2}, Ly5/c1;-><init>(Ly5/d1;Ly5/y;Landroidx/work/WorkerParameters$a;)V

    invoke-interface {v0, v1}, Lh6/b;->d(Ljava/lang/Runnable;)V

    return-void
.end method
