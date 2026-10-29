.class public final Ll0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll0/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll0/a$a;,
        Ll0/a$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0006\u0008\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ#\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u00020\u000b2\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J?\u0010\u0016\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u00062\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u000c2\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00132\u000e\u0008\u0002\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u000cH\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0018\u00a8\u0006\u0019"
    }
    d2 = {
        "Ll0/a;",
        "Ll0/c;",
        "Ln0/o0;",
        "cameraInfoInternal",
        "<init>",
        "(Ln0/o0;)V",
        "Lg0/g2;",
        "sessionConfig",
        "Ll0/b;",
        "a",
        "(Lg0/g2;)Ll0/b;",
        "Li0/b;",
        "",
        "Lg0/w2;",
        "useCases",
        "Ll0/b$d;",
        "d",
        "(Li0/b;Ljava/util/List;)Ll0/b$d;",
        "orderedPreferredFeatures",
        "",
        "index",
        "currentOptionalFeatures",
        "b",
        "(Lg0/g2;Ljava/util/List;ILjava/util/List;)Ll0/b;",
        "Ln0/o0;",
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
.field public static final b:Ll0/a$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Ln0/o0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ll0/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll0/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ll0/a;->b:Ll0/a$a;

    return-void
.end method

.method public constructor <init>(Ln0/o0;)V
    .locals 1
    .param p1    # Ln0/o0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "cameraInfoInternal"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll0/a;->a:Ln0/o0;

    return-void
.end method

.method public static synthetic c(Ll0/a;Lg0/g2;Ljava/util/List;ILjava/util/List;ILjava/lang/Object;)Ll0/b;
    .locals 0

    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_0

    const/4 p3, 0x0

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    invoke-static {}, Lkotlin/collections/p;->k()Ljava/util/List;

    move-result-object p4

    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, Ll0/a;->b(Lg0/g2;Ljava/util/List;ILjava/util/List;)Ll0/b;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lg0/g2;)Ll0/b;
    .locals 10
    .param p1    # Lg0/g2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "sessionConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lg0/g2;->k()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1}, Lg0/g2;->h()Ljava/util/Set;

    move-result-object v1

    invoke-virtual {p1}, Lg0/g2;->g()Ljava/util/List;

    move-result-object v2

    move-object v3, v1

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1

    move-object v3, v2

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Must have at least one required or preferred feature"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    move-object v3, v0

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lg0/w2;

    sget-object v5, Lj0/c;->c:Lj0/c$a;

    invoke-virtual {v5, v4}, Lj0/c$a;->b(Lg0/w2;)Lj0/c;

    move-result-object v5

    sget-object v6, Lj0/c;->h:Lj0/c;

    if-ne v5, v6, :cond_2

    new-instance p1, Ll0/b$c;

    invoke-direct {p1, v4}, Ll0/b$c;-><init>(Lg0/w2;)V

    return-object p1

    :cond_3
    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Li0/b;

    invoke-virtual {p0, v3, v0}, Ll0/a;->d(Li0/b;Ljava/util/List;)Ll0/b$d;

    move-result-object v3

    if-eqz v3, :cond_4

    return-object v3

    :cond_5
    check-cast v2, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_6
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const-string v3, "DefaultFeatureGroupResolver"

    if-eqz v2, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Li0/b;

    invoke-virtual {p0, v4, v0}, Ll0/a;->d(Li0/b;Ljava/util/List;)Ll0/b$d;

    move-result-object v4

    if-eqz v4, :cond_7

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "resolveFeatureGroup: filtered out preferred feature due to "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v3, v6}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_7
    const/4 v4, 0x0

    :goto_2
    if-nez v4, :cond_6

    invoke-interface {v5, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_8
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "resolveFeatureGroup: filteredPreferredFeatures = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v8, 0xc

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v3, p0

    move-object v4, p1

    invoke-static/range {v3 .. v9}, Ll0/a;->c(Ll0/a;Lg0/g2;Ljava/util/List;ILjava/util/List;ILjava/lang/Object;)Ll0/b;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lg0/g2;Ljava/util/List;ILjava/util/List;)Ll0/b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg0/g2;",
            "Ljava/util/List<",
            "+",
            "Li0/b;",
            ">;I",
            "Ljava/util/List<",
            "+",
            "Li0/b;",
            ">;)",
            "Ll0/b;"
        }
    .end annotation

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-lt p3, v0, :cond_1

    invoke-virtual {p1}, Lg0/g2;->h()Ljava/util/Set;

    move-result-object p2

    check-cast p4, Ljava/lang/Iterable;

    invoke-static {p2, p4}, Lkotlin/collections/r0;->i(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p2

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "getFeatureListResolvedByPriority: features = "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p4, ", useCases = "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lg0/g2;->k()Ljava/util/List;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    const-string p4, "DefaultFeatureGroupResolver"

    invoke-static {p4, p3}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p3, p0, Ll0/a;->a:Ln0/o0;

    new-instance p4, Lj0/b;

    invoke-direct {p4, p2}, Lj0/b;-><init>(Ljava/util/Set;)V

    invoke-interface {p3, p4, p1}, Ln0/o0;->A(Lj0/b;Lg0/g2;)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Ll0/b$a;

    new-instance p3, Lj0/b;

    invoke-direct {p3, p2}, Lj0/b;-><init>(Ljava/util/Set;)V

    invoke-direct {p1, p3}, Ll0/b$a;-><init>(Lj0/b;)V

    return-object p1

    :cond_0
    sget-object p1, Ll0/b$b;->a:Ll0/b$b;

    return-object p1

    :cond_1
    add-int/lit8 v0, p3, 0x1

    move-object v1, p4

    check-cast v1, Ljava/util/Collection;

    invoke-interface {p2, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    invoke-static {v1, p3}, Lkotlin/collections/CollectionsKt;->x0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object p3

    invoke-virtual {p0, p1, p2, v0, p3}, Ll0/a;->b(Lg0/g2;Ljava/util/List;ILjava/util/List;)Ll0/b;

    move-result-object p3

    instance-of v1, p3, Ll0/b$a;

    if-eqz v1, :cond_2

    return-object p3

    :cond_2
    invoke-virtual {p0, p1, p2, v0, p4}, Ll0/a;->b(Lg0/g2;Ljava/util/List;ILjava/util/List;)Ll0/b;

    move-result-object p1

    return-object p1
.end method

.method public final d(Li0/b;Ljava/util/List;)Ll0/b$d;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li0/b;",
            "Ljava/util/List<",
            "+",
            "Lg0/w2;",
            ">;)",
            "Ll0/b$d;"
        }
    .end annotation

    check-cast p2, Ljava/lang/Iterable;

    instance-of v0, p2, Ljava/util/Collection;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    move-object v3, p2

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1

    :cond_0
    move v3, v2

    goto :goto_0

    :cond_1
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lg0/w2;

    instance-of v4, v4, Lg0/f1;

    if-eqz v4, :cond_2

    move v3, v1

    :goto_0
    if-eqz v0, :cond_3

    move-object v0, p2

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_4
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg0/w2;

    instance-of v4, v0, Lg0/a2;

    if-nez v4, :cond_5

    invoke-static {v0}, Ls0/f;->e0(Lg0/w2;)Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_5
    move v2, v1

    :cond_6
    :goto_1
    invoke-virtual {p1}, Li0/b;->c()Lk0/b;

    move-result-object p2

    sget-object v0, Ll0/a$b;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v0, p2

    const/4 v0, 0x0

    if-eq p2, v1, :cond_a

    const/4 v1, 0x2

    if-eq p2, v1, :cond_8

    const/4 v1, 0x3

    if-eq p2, v1, :cond_8

    const/4 v1, 0x4

    if-ne p2, v1, :cond_7

    goto :goto_2

    :cond_7
    new-instance p1, Ljt/l;

    invoke-direct {p1}, Ljt/l;-><init>()V

    throw p1

    :cond_8
    :goto_2
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lj0/c;->d:Lj0/c;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " or "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Lj0/c;->f:Lj0/c;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    if-nez v2, :cond_9

    goto :goto_3

    :cond_9
    move-object p2, v0

    goto :goto_3

    :cond_a
    sget-object p2, Lj0/c;->e:Lj0/c;

    invoke-virtual {p2}, Lj0/c;->toString()Ljava/lang/String;

    move-result-object p2

    if-nez v3, :cond_9

    :goto_3
    if-eqz p2, :cond_b

    new-instance v0, Ll0/b$d;

    invoke-direct {v0, p2, p1}, Ll0/b$d;-><init>(Ljava/lang/String;Li0/b;)V

    :cond_b
    return-object v0
.end method
