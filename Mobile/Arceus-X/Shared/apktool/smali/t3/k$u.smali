.class public final Lt3/k$u;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt3/k;-><init>(Lt3/e0;Ljava/util/List;Lt3/e;Lku/p0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/m;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Throwable;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\u0008\u0000\u0010\u00002\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "T",
        "",
        "it",
        "",
        "a",
        "(Ljava/lang/Throwable;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic i:Lt3/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt3/k<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lt3/k;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt3/k<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lt3/k$u;->i:Lt3/k;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 2
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    if-eqz p1, :cond_0

    iget-object v0, p0, Lt3/k$u;->i:Lt3/k;

    invoke-static {v0}, Lt3/k;->d(Lt3/k;)Lt3/l;

    move-result-object v0

    new-instance v1, Lt3/r;

    invoke-direct {v1, p1}, Lt3/r;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, Lt3/l;->c(Lt3/d0;)Lt3/d0;

    :cond_0
    iget-object p1, p0, Lt3/k$u;->i:Lt3/k;

    invoke-static {p1}, Lt3/k;->g(Lt3/k;)Ljt/h;

    move-result-object p1

    invoke-interface {p1}, Ljt/h;->isInitialized()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lt3/k$u;->i:Lt3/k;

    invoke-virtual {p1}, Lt3/k;->s()Lt3/f0;

    move-result-object p1

    invoke-interface {p1}, Lt3/c;->close()V

    :cond_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lt3/k$u;->a(Ljava/lang/Throwable;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
