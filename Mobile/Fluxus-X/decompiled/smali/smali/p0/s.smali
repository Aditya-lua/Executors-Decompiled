.class public Lp0/s;
.super Landroidx/lifecycle/b0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<I:",
        "Ljava/lang/Object;",
        "O:",
        "Ljava/lang/Object;",
        ">",
        "Landroidx/lifecycle/b0<",
        "TO;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u000b\u0008\u0016\u0018\u0000*\u0004\u0008\u0000\u0010\u0001*\u0004\u0008\u0001\u0010\u00022\u0008\u0012\u0004\u0012\u00028\u00010\u0003B#\u0012\u0006\u0010\u0004\u001a\u00028\u0001\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001b\u0010\u000c\u001a\u00020\u000b2\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00028\u00000\t\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0011\u0010\u000e\u001a\u0004\u0018\u00018\u0001H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00028\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lp0/s;",
        "I",
        "O",
        "Landroidx/lifecycle/b0;",
        "initialValue",
        "Lt/a;",
        "mapFunction",
        "<init>",
        "(Ljava/lang/Object;Lt/a;)V",
        "Landroidx/lifecycle/a0;",
        "liveDataSource",
        "",
        "u",
        "(Landroidx/lifecycle/a0;)V",
        "f",
        "()Ljava/lang/Object;",
        "m",
        "Ljava/lang/Object;",
        "n",
        "Lt/a;",
        "o",
        "Landroidx/lifecycle/a0;",
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


# instance fields
.field public final m:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TO;"
        }
    .end annotation
.end field

.field public final n:Lt/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt/a<",
            "TI;TO;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public o:Landroidx/lifecycle/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/a0<",
            "TI;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lt/a;)V
    .locals 1
    .param p2    # Lt/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TO;",
            "Lt/a<",
            "TI;TO;>;)V"
        }
    .end annotation

    const-string v0, "mapFunction"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/lifecycle/b0;-><init>()V

    iput-object p1, p0, Lp0/s;->m:Ljava/lang/Object;

    iput-object p2, p0, Lp0/s;->n:Lt/a;

    return-void
.end method

.method public static synthetic r(Lp0/s;Landroidx/lifecycle/a0;)V
    .locals 0

    invoke-static {p0, p1}, Lp0/s;->v(Lp0/s;Landroidx/lifecycle/a0;)V

    return-void
.end method

.method public static synthetic s(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lp0/s;->x(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic t(Lp0/s;Ljava/lang/Object;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lp0/s;->w(Lp0/s;Ljava/lang/Object;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final v(Lp0/s;Landroidx/lifecycle/a0;)V
    .locals 2

    new-instance v0, Lp0/q;

    invoke-direct {v0, p0}, Lp0/q;-><init>(Lp0/s;)V

    new-instance v1, Lp0/r;

    invoke-direct {v1, v0}, Lp0/r;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-super {p0, p1, v1}, Landroidx/lifecycle/b0;->p(Landroidx/lifecycle/a0;Landroidx/lifecycle/e0;)V

    return-void
.end method

.method public static final w(Lp0/s;Ljava/lang/Object;)Lkotlin/Unit;
    .locals 1

    iget-object v0, p0, Lp0/s;->n:Lt/a;

    invoke-interface {v0, p1}, Lt/a;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/lifecycle/d0;->o(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final x(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public f()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TO;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lp0/s;->o:Landroidx/lifecycle/a0;

    if-nez v0, :cond_0

    iget-object v0, p0, Lp0/s;->m:Ljava/lang/Object;

    return-object v0

    :cond_0
    iget-object v1, p0, Lp0/s;->n:Lt/a;

    invoke-virtual {v0}, Landroidx/lifecycle/a0;->f()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v1, v0}, Lt/a;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final u(Landroidx/lifecycle/a0;)V
    .locals 1
    .param p1    # Landroidx/lifecycle/a0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/a0<",
            "TI;>;)V"
        }
    .end annotation

    const-string v0, "liveDataSource"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lp0/s;->o:Landroidx/lifecycle/a0;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-super {p0, v0}, Landroidx/lifecycle/b0;->q(Landroidx/lifecycle/a0;)V

    :cond_0
    iput-object p1, p0, Lp0/s;->o:Landroidx/lifecycle/a0;

    new-instance v0, Lp0/p;

    invoke-direct {v0, p0, p1}, Lp0/p;-><init>(Lp0/s;Landroidx/lifecycle/a0;)V

    invoke-static {v0}, Lp0/z;->e(Ljava/lang/Runnable;)V

    return-void
.end method
