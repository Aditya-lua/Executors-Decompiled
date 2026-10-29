.class public final Lw1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Collection;
.implements Ljava/util/Set;
.implements Lau/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw1/b$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Collection<",
        "TE;>;",
        "Ljava/util/Set<",
        "TE;>;",
        "Lau/b;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0010#\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u000b\n\u0002\u0010\u0011\n\u0002\u0008\t\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010)\n\u0002\u0008\u0002\n\u0002\u0010\u001e\n\u0002\u0008\u0006\n\u0002\u0010\u0015\n\u0002\u0008\u0012\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0008\u0012\u0004\u0012\u00028\u00000\u0003:\u00015B\u0013\u0008\u0007\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\u000c\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u000c\u0010\u0007J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0096\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00042\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u0010J\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u0010J\u0015\u0010\u001c\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u001c\u0010\u0017J\u0015\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u001d\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\'\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u001d\"\u0004\u0008\u0001\u0010 2\u000c\u0010!\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u001d\u00a2\u0006\u0004\u0008\u001e\u0010\"J\u001a\u0010$\u001a\u00020\u000e2\u0008\u0010#\u001a\u0004\u0018\u00010\u0011H\u0096\u0002\u00a2\u0006\u0004\u0008$\u0010\u0010J\u000f\u0010%\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008%\u0010&J\u000f\u0010(\u001a\u00020\'H\u0016\u00a2\u0006\u0004\u0008(\u0010)J\u0016\u0010+\u001a\u0008\u0012\u0004\u0012\u00028\u00000*H\u0096\u0002\u00a2\u0006\u0004\u0008+\u0010,J\u001d\u0010/\u001a\u00020\u000e2\u000c\u0010.\u001a\u0008\u0012\u0004\u0012\u00028\u00000-H\u0016\u00a2\u0006\u0004\u0008/\u00100J\u001d\u00101\u001a\u00020\u000e2\u000c\u0010.\u001a\u0008\u0012\u0004\u0012\u00028\u00000-H\u0016\u00a2\u0006\u0004\u00081\u00100J\u001d\u00102\u001a\u00020\u000e2\u000c\u0010.\u001a\u0008\u0012\u0004\u0012\u00028\u00000-H\u0016\u00a2\u0006\u0004\u00082\u00100J\u001d\u00103\u001a\u00020\u000e2\u000c\u0010.\u001a\u0008\u0012\u0004\u0012\u00028\u00000-H\u0016\u00a2\u0006\u0004\u00083\u00100R\"\u0010;\u001a\u0002048\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u00085\u00106\u001a\u0004\u00087\u00108\"\u0004\u00089\u0010:R*\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u001d8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000c\u0010<\u001a\u0004\u0008=\u0010\u001f\"\u0004\u0008>\u0010?R\"\u0010C\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008=\u0010@\u001a\u0004\u0008A\u0010&\"\u0004\u0008B\u0010\u0007R\u0014\u0010E\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008D\u0010&\u00a8\u0006F"
    }
    d2 = {
        "Lw1/b;",
        "E",
        "",
        "",
        "",
        "capacity",
        "<init>",
        "(I)V",
        "",
        "clear",
        "()V",
        "minimumCapacity",
        "b",
        "element",
        "",
        "contains",
        "(Ljava/lang/Object;)Z",
        "",
        "key",
        "indexOf",
        "(Ljava/lang/Object;)I",
        "index",
        "m",
        "(I)Ljava/lang/Object;",
        "isEmpty",
        "()Z",
        "add",
        "remove",
        "g",
        "",
        "toArray",
        "()[Ljava/lang/Object;",
        "T",
        "array",
        "([Ljava/lang/Object;)[Ljava/lang/Object;",
        "other",
        "equals",
        "hashCode",
        "()I",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "iterator",
        "()Ljava/util/Iterator;",
        "",
        "elements",
        "containsAll",
        "(Ljava/util/Collection;)Z",
        "addAll",
        "removeAll",
        "retainAll",
        "",
        "a",
        "[I",
        "d",
        "()[I",
        "k",
        "([I)V",
        "hashes",
        "[Ljava/lang/Object;",
        "c",
        "i",
        "([Ljava/lang/Object;)V",
        "I",
        "f",
        "l",
        "_size",
        "e",
        "size",
        "collection"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public a:[I
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public b:[Ljava/lang/Object;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public c:I


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1}, Lw1/b;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    sget-object v0, Lx1/a;->a:[I

    iput-object v0, p0, Lw1/b;->a:[I

    .line 4
    sget-object v0, Lx1/a;->c:[Ljava/lang/Object;

    iput-object v0, p0, Lw1/b;->b:[Ljava/lang/Object;

    if-lez p1, :cond_0

    .line 5
    invoke-static {p0, p1}, Lw1/d;->a(Lw1/b;I)V

    :cond_0
    return-void
.end method

.method public synthetic constructor <init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 6
    :cond_0
    invoke-direct {p0, p1}, Lw1/b;-><init>(I)V

    return-void
.end method


# virtual methods
.method public add(Ljava/lang/Object;)Z
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)Z"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual {v0}, Lw1/b;->f()I

    move-result v2

    const/4 v3, 0x0

    if-nez v1, :cond_0

    invoke-static {v0}, Lw1/d;->d(Lw1/b;)I

    move-result v4

    move v5, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v4

    invoke-static {v0, v1, v4}, Lw1/d;->c(Lw1/b;Ljava/lang/Object;I)I

    move-result v5

    move/from16 v16, v5

    move v5, v4

    move/from16 v4, v16

    :goto_0
    if-ltz v4, :cond_1

    return v3

    :cond_1
    not-int v4, v4

    invoke-virtual {v0}, Lw1/b;->d()[I

    move-result-object v6

    array-length v6, v6

    const/4 v7, 0x1

    if-lt v2, v6, :cond_6

    const/16 v6, 0x8

    if-lt v2, v6, :cond_2

    shr-int/lit8 v6, v2, 0x1

    add-int/2addr v6, v2

    goto :goto_1

    :cond_2
    const/4 v8, 0x4

    if-lt v2, v8, :cond_3

    goto :goto_1

    :cond_3
    move v6, v8

    :goto_1
    invoke-virtual {v0}, Lw1/b;->d()[I

    move-result-object v8

    invoke-virtual {v0}, Lw1/b;->c()[Ljava/lang/Object;

    move-result-object v15

    invoke-static {v0, v6}, Lw1/d;->a(Lw1/b;I)V

    invoke-virtual {v0}, Lw1/b;->f()I

    move-result v6

    if-ne v2, v6, :cond_5

    invoke-virtual {v0}, Lw1/b;->d()[I

    move-result-object v6

    array-length v6, v6

    if-nez v6, :cond_4

    move v3, v7

    :cond_4
    if-nez v3, :cond_6

    invoke-virtual {v0}, Lw1/b;->d()[I

    move-result-object v9

    array-length v12, v8

    const/4 v13, 0x6

    const/4 v14, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v8 .. v14}, Lkotlin/collections/l;->k([I[IIIIILjava/lang/Object;)[I

    invoke-virtual {v0}, Lw1/b;->c()[Ljava/lang/Object;

    move-result-object v10

    array-length v13, v15

    const/4 v14, 0x6

    move-object v9, v15

    const/4 v15, 0x0

    const/4 v12, 0x0

    invoke-static/range {v9 .. v15}, Lkotlin/collections/l;->l([Ljava/lang/Object;[Ljava/lang/Object;IIIILjava/lang/Object;)[Ljava/lang/Object;

    goto :goto_2

    :cond_5
    new-instance v1, Ljava/util/ConcurrentModificationException;

    invoke-direct {v1}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v1

    :cond_6
    :goto_2
    if-ge v4, v2, :cond_7

    invoke-virtual {v0}, Lw1/b;->d()[I

    move-result-object v3

    invoke-virtual {v0}, Lw1/b;->d()[I

    move-result-object v6

    add-int/lit8 v8, v4, 0x1

    invoke-static {v3, v6, v8, v4, v2}, Lkotlin/collections/l;->g([I[IIII)[I

    invoke-virtual {v0}, Lw1/b;->c()[Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0}, Lw1/b;->c()[Ljava/lang/Object;

    move-result-object v6

    invoke-static {v3, v6, v8, v4, v2}, Lkotlin/collections/l;->i([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    :cond_7
    invoke-virtual {v0}, Lw1/b;->f()I

    move-result v3

    if-ne v2, v3, :cond_8

    invoke-virtual {v0}, Lw1/b;->d()[I

    move-result-object v2

    array-length v2, v2

    if-ge v4, v2, :cond_8

    invoke-virtual {v0}, Lw1/b;->d()[I

    move-result-object v2

    aput v5, v2, v4

    invoke-virtual {v0}, Lw1/b;->c()[Ljava/lang/Object;

    move-result-object v2

    aput-object v1, v2, v4

    invoke-virtual {v0}, Lw1/b;->f()I

    move-result v1

    add-int/2addr v1, v7

    invoke-virtual {v0, v1}, Lw1/b;->l(I)V

    return v7

    :cond_8
    new-instance v1, Ljava/util/ConcurrentModificationException;

    invoke-direct {v1}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v1
.end method

.method public addAll(Ljava/util/Collection;)Z
    .locals 2
    .param p1    # Ljava/util/Collection;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+TE;>;)Z"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lw1/b;->f()I

    move-result v0

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual {p0, v0}, Lw1/b;->b(I)V

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v1}, Lw1/b;->add(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    goto :goto_0

    :cond_0
    return v0
.end method

.method public final b(I)V
    .locals 10

    invoke-virtual {p0}, Lw1/b;->f()I

    move-result v0

    invoke-virtual {p0}, Lw1/b;->d()[I

    move-result-object v1

    array-length v1, v1

    if-ge v1, p1, :cond_0

    invoke-virtual {p0}, Lw1/b;->d()[I

    move-result-object v2

    invoke-virtual {p0}, Lw1/b;->c()[Ljava/lang/Object;

    move-result-object v1

    invoke-static {p0, p1}, Lw1/d;->a(Lw1/b;I)V

    invoke-virtual {p0}, Lw1/b;->f()I

    move-result p1

    if-lez p1, :cond_0

    invoke-virtual {p0}, Lw1/b;->d()[I

    move-result-object v3

    invoke-virtual {p0}, Lw1/b;->f()I

    move-result v6

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v8}, Lkotlin/collections/l;->k([I[IIIIILjava/lang/Object;)[I

    invoke-virtual {p0}, Lw1/b;->c()[Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {p0}, Lw1/b;->f()I

    move-result v7

    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v6, 0x0

    move-object v3, v1

    invoke-static/range {v3 .. v9}, Lkotlin/collections/l;->l([Ljava/lang/Object;[Ljava/lang/Object;IIIILjava/lang/Object;)[Ljava/lang/Object;

    :cond_0
    invoke-virtual {p0}, Lw1/b;->f()I

    move-result p1

    if-ne p1, v0, :cond_1

    return-void

    :cond_1
    new-instance p1, Ljava/util/ConcurrentModificationException;

    invoke-direct {p1}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw p1
.end method

.method public final c()[Ljava/lang/Object;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lw1/b;->b:[Ljava/lang/Object;

    return-object v0
.end method

.method public clear()V
    .locals 1

    invoke-virtual {p0}, Lw1/b;->f()I

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lx1/a;->a:[I

    invoke-virtual {p0, v0}, Lw1/b;->k([I)V

    sget-object v0, Lx1/a;->c:[Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lw1/b;->i([Ljava/lang/Object;)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lw1/b;->l(I)V

    :cond_0
    invoke-virtual {p0}, Lw1/b;->f()I

    move-result v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lw1/b;->indexOf(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public containsAll(Ljava/util/Collection;)Z
    .locals 1
    .param p1    # Ljava/util/Collection;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Lw1/b;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public final d()[I
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lw1/b;->a:[I

    return-object v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, Lw1/b;->c:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ljava/util/Set;

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    invoke-virtual {p0}, Lw1/b;->size()I

    move-result v1

    move-object v3, p1

    check-cast v3, Ljava/util/Set;

    invoke-interface {v3}, Ljava/util/Set;->size()I

    move-result v3

    if-eq v1, v3, :cond_1

    return v2

    :cond_1
    :try_start_0
    invoke-virtual {p0}, Lw1/b;->f()I

    move-result v1

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_3

    invoke-virtual {p0, v3}, Lw1/b;->m(I)Ljava/lang/Object;

    move-result-object v4

    move-object v5, p1

    check-cast v5, Ljava/util/Set;

    invoke-interface {v5, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v4, :cond_2

    return v2

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    return v0

    :catch_0
    :cond_4
    return v2
.end method

.method public final f()I
    .locals 1

    iget v0, p0, Lw1/b;->c:I

    return v0
.end method

.method public final g(I)Ljava/lang/Object;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    invoke-virtual {p0}, Lw1/b;->f()I

    move-result v0

    invoke-virtual {p0}, Lw1/b;->c()[Ljava/lang/Object;

    move-result-object v1

    aget-object v1, v1, p1

    const/4 v2, 0x1

    if-gt v0, v2, :cond_0

    invoke-virtual {p0}, Lw1/b;->clear()V

    return-object v1

    :cond_0
    add-int/lit8 v3, v0, -0x1

    invoke-virtual {p0}, Lw1/b;->d()[I

    move-result-object v4

    array-length v4, v4

    const/16 v5, 0x8

    if-le v4, v5, :cond_3

    invoke-virtual {p0}, Lw1/b;->f()I

    move-result v4

    invoke-virtual {p0}, Lw1/b;->d()[I

    move-result-object v6

    array-length v6, v6

    div-int/lit8 v6, v6, 0x3

    if-ge v4, v6, :cond_3

    invoke-virtual {p0}, Lw1/b;->f()I

    move-result v4

    if-le v4, v5, :cond_1

    invoke-virtual {p0}, Lw1/b;->f()I

    move-result v4

    invoke-virtual {p0}, Lw1/b;->f()I

    move-result v5

    shr-int/lit8 v2, v5, 0x1

    add-int v5, v4, v2

    :cond_1
    invoke-virtual {p0}, Lw1/b;->d()[I

    move-result-object v6

    invoke-virtual {p0}, Lw1/b;->c()[Ljava/lang/Object;

    move-result-object v2

    invoke-static {p0, v5}, Lw1/d;->a(Lw1/b;I)V

    if-lez p1, :cond_2

    invoke-virtual {p0}, Lw1/b;->d()[I

    move-result-object v7

    const/4 v11, 0x6

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move v10, p1

    invoke-static/range {v6 .. v12}, Lkotlin/collections/l;->k([I[IIIIILjava/lang/Object;)[I

    invoke-virtual {p0}, Lw1/b;->c()[Ljava/lang/Object;

    move-result-object v8

    const/4 v12, 0x6

    const/4 v13, 0x0

    move v11, v10

    const/4 v10, 0x0

    move-object v7, v2

    invoke-static/range {v7 .. v13}, Lkotlin/collections/l;->l([Ljava/lang/Object;[Ljava/lang/Object;IIIILjava/lang/Object;)[Ljava/lang/Object;

    move v10, v11

    goto :goto_0

    :cond_2
    move v10, p1

    move-object v7, v2

    :goto_0
    if-ge v10, v3, :cond_5

    invoke-virtual {p0}, Lw1/b;->d()[I

    move-result-object p1

    add-int/lit8 v2, v10, 0x1

    invoke-static {v6, p1, v10, v2, v0}, Lkotlin/collections/l;->g([I[IIII)[I

    invoke-virtual {p0}, Lw1/b;->c()[Ljava/lang/Object;

    move-result-object p1

    invoke-static {v7, p1, v10, v2, v0}, Lkotlin/collections/l;->i([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    goto :goto_1

    :cond_3
    move v10, p1

    if-ge v10, v3, :cond_4

    invoke-virtual {p0}, Lw1/b;->d()[I

    move-result-object p1

    invoke-virtual {p0}, Lw1/b;->d()[I

    move-result-object v2

    add-int/lit8 v4, v10, 0x1

    invoke-static {p1, v2, v10, v4, v0}, Lkotlin/collections/l;->g([I[IIII)[I

    invoke-virtual {p0}, Lw1/b;->c()[Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0}, Lw1/b;->c()[Ljava/lang/Object;

    move-result-object v2

    invoke-static {p1, v2, v10, v4, v0}, Lkotlin/collections/l;->i([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    :cond_4
    invoke-virtual {p0}, Lw1/b;->c()[Ljava/lang/Object;

    move-result-object p1

    const/4 v2, 0x0

    aput-object v2, p1, v3

    :cond_5
    :goto_1
    invoke-virtual {p0}, Lw1/b;->f()I

    move-result p1

    if-ne v0, p1, :cond_6

    invoke-virtual {p0, v3}, Lw1/b;->l(I)V

    return-object v1

    :cond_6
    new-instance p1, Ljava/util/ConcurrentModificationException;

    invoke-direct {p1}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw p1
.end method

.method public hashCode()I
    .locals 5

    invoke-virtual {p0}, Lw1/b;->d()[I

    move-result-object v0

    invoke-virtual {p0}, Lw1/b;->f()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v2, v1, :cond_0

    aget v4, v0, v2

    add-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return v3
.end method

.method public final i([Ljava/lang/Object;)V
    .locals 1
    .param p1    # [Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lw1/b;->b:[Ljava/lang/Object;

    return-void
.end method

.method public final indexOf(Ljava/lang/Object;)I
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    if-nez p1, :cond_0

    invoke-static {p0}, Lw1/d;->d(Lw1/b;)I

    move-result p1

    return p1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-static {p0, p1, v0}, Lw1/d;->c(Lw1/b;Ljava/lang/Object;I)I

    move-result p1

    return p1
.end method

.method public isEmpty()Z
    .locals 1

    invoke-virtual {p0}, Lw1/b;->f()I

    move-result v0

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TE;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lw1/b$a;

    invoke-direct {v0, p0}, Lw1/b$a;-><init>(Lw1/b;)V

    return-object v0
.end method

.method public final k([I)V
    .locals 1
    .param p1    # [I
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lw1/b;->a:[I

    return-void
.end method

.method public final l(I)V
    .locals 0

    iput p1, p0, Lw1/b;->c:I

    return-void
.end method

.method public final m(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    invoke-virtual {p0}, Lw1/b;->c()[Ljava/lang/Object;

    move-result-object v0

    aget-object p1, v0, p1

    return-object p1
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lw1/b;->indexOf(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    invoke-virtual {p0, p1}, Lw1/b;->g(I)Ljava/lang/Object;

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public removeAll(Ljava/util/Collection;)Z
    .locals 2
    .param p1    # Ljava/util/Collection;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v1}, Lw1/b;->remove(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    goto :goto_0

    :cond_0
    return v0
.end method

.method public retainAll(Ljava/util/Collection;)Z
    .locals 5
    .param p1    # Ljava/util/Collection;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lw1/b;->f()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    const/4 v2, 0x0

    :goto_0
    const/4 v3, -0x1

    if-ge v3, v0, :cond_1

    move-object v3, p1

    check-cast v3, Ljava/lang/Iterable;

    invoke-virtual {p0}, Lw1/b;->c()[Ljava/lang/Object;

    move-result-object v4

    aget-object v4, v4, v0

    invoke-static {v3, v4}, Lkotlin/collections/CollectionsKt;->W(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {p0, v0}, Lw1/b;->g(I)Ljava/lang/Object;

    move v2, v1

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    return v2
.end method

.method public final bridge size()I
    .locals 1

    invoke-virtual {p0}, Lw1/b;->e()I

    move-result v0

    return v0
.end method

.method public final toArray()[Ljava/lang/Object;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lw1/b;->b:[Ljava/lang/Object;

    const/4 v1, 0x0

    iget v2, p0, Lw1/b;->c:I

    invoke-static {v0, v1, v2}, Lkotlin/collections/l;->n([Ljava/lang/Object;II)[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 3
    .param p1    # [Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)[TT;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "array"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget v0, p0, Lw1/b;->c:I

    invoke-static {p1, v0}, Lw1/c;->a([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    .line 3
    iget-object v0, p0, Lw1/b;->b:[Ljava/lang/Object;

    const/4 v1, 0x0

    iget v2, p0, Lw1/b;->c:I

    invoke-static {v0, p1, v1, v1, v2}, Lkotlin/collections/l;->i([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    .line 4
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 4
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-virtual {p0}, Lw1/b;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "{}"

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lw1/b;->f()I

    move-result v0

    mul-int/lit8 v0, v0, 0xe

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const/16 v0, 0x7b

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lw1/b;->f()I

    move-result v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_3

    if-lez v2, :cond_1

    const-string v3, ", "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    invoke-virtual {p0, v2}, Lw1/b;->m(I)Ljava/lang/Object;

    move-result-object v3

    if-eq v3, p0, :cond_2

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_2
    const-string v3, "(this Set)"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    const/16 v0, 0x7d

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
