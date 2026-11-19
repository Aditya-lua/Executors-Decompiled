.class public final Lnv/f;
.super Lnv/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        ">",
        "Lnv/g;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u000e\n\u0002\u0008\u0007\u0008\u0002\u0018\u0000*\u0008\u0008\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B%\u0012\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0008\u0010\tJ1\u0010\u000b\u001a\u00020\u0003\"\u0008\u0008\u0001\u0010\n*\u00020\u00012\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u00042\u0008\u0010\u0006\u001a\u0004\u0018\u00018\u0001H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ*\u0010\r\u001a\u0004\u0018\u00018\u0001\"\u0008\u0008\u0001\u0010\n*\u00020\u00012\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u0012R\u0014\u0010\u0006\u001a\u00028\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lnv/f;",
        "",
        "K",
        "Lnv/g;",
        "Lxu/c;",
        "key",
        "value",
        "next",
        "<init>",
        "(Lxu/c;Ljava/lang/Object;Lnv/g;)V",
        "T",
        "b",
        "(Lxu/c;Ljava/lang/Object;)Lnv/g;",
        "a",
        "(Lxu/c;)Ljava/lang/Object;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "Lxu/c;",
        "Ljava/lang/Object;",
        "c",
        "Lnv/g;",
        "okhttp"
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
.field public final a:Lxu/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lxu/c<",
            "TK;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TK;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lnv/g;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lxu/c;Ljava/lang/Object;Lnv/g;)V
    .locals 1
    .param p1    # Lxu/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lnv/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxu/c<",
            "TK;>;TK;",
            "Lnv/g;",
            ")V"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "next"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lnv/g;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lnv/f;->a:Lxu/c;

    iput-object p2, p0, Lnv/f;->b:Ljava/lang/Object;

    iput-object p3, p0, Lnv/f;->c:Lnv/g;

    return-void
.end method

.method public static synthetic c(Lnv/f;)Lnv/f;
    .locals 0

    invoke-static {p0}, Lnv/f;->e(Lnv/f;)Lnv/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lnv/f;)Ljava/lang/CharSequence;
    .locals 0

    invoke-static {p0}, Lnv/f;->f(Lnv/f;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lnv/f;)Lnv/f;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lnv/f;->c:Lnv/g;

    instance-of v0, p0, Lnv/f;

    if-eqz v0, :cond_0

    check-cast p0, Lnv/f;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final f(Lnv/f;)Ljava/lang/CharSequence;
    .locals 2

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lnv/f;->a:Lxu/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x3d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object p0, p0, Lnv/f;->b:Ljava/lang/Object;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lxu/c;)Ljava/lang/Object;
    .locals 1
    .param p1    # Lxu/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lxu/c<",
            "TT;>;)TT;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lnv/f;->a:Lxu/c;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lou/a;->a(Lxu/c;)Ljava/lang/Class;

    move-result-object p1

    iget-object v0, p0, Lnv/f;->b:Ljava/lang/Object;

    invoke-virtual {p1, v0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Lnv/f;->c:Lnv/g;

    invoke-virtual {v0, p1}, Lnv/g;->a(Lxu/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public b(Lxu/c;Ljava/lang/Object;)Lnv/g;
    .locals 4
    .param p1    # Lxu/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lxu/c<",
            "TT;>;TT;)",
            "Lnv/g;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lnv/f;->a:Lxu/c;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnv/f;->c:Lnv/g;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lnv/f;->c:Lnv/g;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lnv/g;->b(Lxu/c;Ljava/lang/Object;)Lnv/g;

    move-result-object v0

    iget-object v1, p0, Lnv/f;->c:Lnv/g;

    if-ne v0, v1, :cond_1

    move-object v0, p0

    goto :goto_0

    :cond_1
    new-instance v1, Lnv/f;

    iget-object v2, p0, Lnv/f;->a:Lxu/c;

    iget-object v3, p0, Lnv/f;->b:Ljava/lang/Object;

    invoke-direct {v1, v2, v3, v0}, Lnv/f;-><init>(Lxu/c;Ljava/lang/Object;Lnv/g;)V

    move-object v0, v1

    :goto_0
    if-eqz p2, :cond_2

    new-instance v1, Lnv/f;

    invoke-direct {v1, p1, p2, v0}, Lnv/f;-><init>(Lxu/c;Ljava/lang/Object;Lnv/g;)V

    return-object v1

    :cond_2
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lnv/d;

    invoke-direct {v0}, Lnv/d;-><init>()V

    invoke-static {p0, v0}, Lyu/m;->h(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;

    move-result-object v0

    invoke-static {v0}, Lyu/p;->z(Lkotlin/sequences/Sequence;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->y0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/Iterable;

    new-instance v7, Lnv/e;

    invoke-direct {v7}, Lnv/e;-><init>()V

    const/16 v8, 0x19

    const/4 v9, 0x0

    const/4 v2, 0x0

    const-string v3, "{"

    const-string v4, "}"

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v9}, Lkotlin/collections/CollectionsKt;->m0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
