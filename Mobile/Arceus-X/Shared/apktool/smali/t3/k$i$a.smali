.class public final Lt3/k$i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnu/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt3/k$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lnu/i;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u00020\u0001\"\u0004\u0008\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "T",
        "",
        "it",
        "b",
        "(Lkotlin/Unit;Lnt/b;)Ljava/lang/Object;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic a:Lt3/k;
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

    iput-object p1, p0, Lt3/k$i$a;->a:Lt3/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lkotlin/Unit;Lnt/b;)Ljava/lang/Object;
    .locals 1
    .param p1    # Lkotlin/Unit;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Unit;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object p1, p0, Lt3/k$i$a;->a:Lt3/k;

    invoke-static {p1}, Lt3/k;->d(Lt3/k;)Lt3/l;

    move-result-object p1

    invoke-virtual {p1}, Lt3/l;->a()Lt3/d0;

    move-result-object p1

    instance-of p1, p1, Lt3/r;

    if-nez p1, :cond_1

    iget-object p1, p0, Lt3/k$i$a;->a:Lt3/k;

    const/4 v0, 0x1

    invoke-static {p1, v0, p2}, Lt3/k;->l(Lt3/k;ZLnt/b;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_1
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Unit;

    invoke-virtual {p0, p1, p2}, Lt3/k$i$a;->b(Lkotlin/Unit;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
