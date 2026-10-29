.class public final Landroidx/lifecycle/u$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/lifecycle/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\u000c2\u0008\u0010\t\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\r\u0010\u000eR\"\u0010\u0014\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\r\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011\"\u0004\u0008\u0012\u0010\u0013R\"\u0010\u001b\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0010\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018\"\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001c"
    }
    d2 = {
        "Landroidx/lifecycle/u$b;",
        "",
        "Landroidx/lifecycle/r;",
        "observer",
        "Landroidx/lifecycle/l$b;",
        "initialState",
        "<init>",
        "(Landroidx/lifecycle/r;Landroidx/lifecycle/l$b;)V",
        "Landroidx/lifecycle/s;",
        "owner",
        "Landroidx/lifecycle/l$a;",
        "event",
        "",
        "a",
        "(Landroidx/lifecycle/s;Landroidx/lifecycle/l$a;)V",
        "Landroidx/lifecycle/l$b;",
        "b",
        "()Landroidx/lifecycle/l$b;",
        "setState",
        "(Landroidx/lifecycle/l$b;)V",
        "state",
        "Landroidx/lifecycle/p;",
        "Landroidx/lifecycle/p;",
        "getLifecycleObserver",
        "()Landroidx/lifecycle/p;",
        "setLifecycleObserver",
        "(Landroidx/lifecycle/p;)V",
        "lifecycleObserver",
        "lifecycle-runtime"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public a:Landroidx/lifecycle/l$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public b:Landroidx/lifecycle/p;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/lifecycle/r;Landroidx/lifecycle/l$b;)V
    .locals 1
    .param p1    # Landroidx/lifecycle/r;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Landroidx/lifecycle/l$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "initialState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {p1}, Landroidx/lifecycle/z;->f(Ljava/lang/Object;)Landroidx/lifecycle/p;

    move-result-object p1

    iput-object p1, p0, Landroidx/lifecycle/u$b;->b:Landroidx/lifecycle/p;

    iput-object p2, p0, Landroidx/lifecycle/u$b;->a:Landroidx/lifecycle/l$b;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/lifecycle/s;Landroidx/lifecycle/l$a;)V
    .locals 3
    .param p1    # Landroidx/lifecycle/s;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Landroidx/lifecycle/l$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "event"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Landroidx/lifecycle/l$a;->b()Landroidx/lifecycle/l$b;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/u;->k:Landroidx/lifecycle/u$a;

    iget-object v2, p0, Landroidx/lifecycle/u$b;->a:Landroidx/lifecycle/l$b;

    invoke-virtual {v1, v2, v0}, Landroidx/lifecycle/u$a;->b(Landroidx/lifecycle/l$b;Landroidx/lifecycle/l$b;)Landroidx/lifecycle/l$b;

    move-result-object v1

    iput-object v1, p0, Landroidx/lifecycle/u$b;->a:Landroidx/lifecycle/l$b;

    iget-object v1, p0, Landroidx/lifecycle/u$b;->b:Landroidx/lifecycle/p;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v1, p1, p2}, Landroidx/lifecycle/p;->g(Landroidx/lifecycle/s;Landroidx/lifecycle/l$a;)V

    iput-object v0, p0, Landroidx/lifecycle/u$b;->a:Landroidx/lifecycle/l$b;

    return-void
.end method

.method public final b()Landroidx/lifecycle/l$b;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Landroidx/lifecycle/u$b;->a:Landroidx/lifecycle/l$b;

    return-object v0
.end method
