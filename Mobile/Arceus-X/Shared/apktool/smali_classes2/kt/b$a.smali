.class public final Lkt/b$a;
.super Lkotlin/collections/f;
.source "SourceFile"

# interfaces
.implements Ljava/util/List;
.implements Ljava/util/RandomAccess;
.implements Ljava/io/Serializable;
.implements Lau/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkt/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkt/b$a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lkotlin/collections/f<",
        "TE;>;",
        "Ljava/util/List<",
        "TE;>;",
        "Ljava/util/RandomAccess;",
        "Ljava/io/Serializable;",
        "Lau/d;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u000b\n\u0002\u0010)\n\u0002\u0008\u0002\n\u0002\u0010+\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0008\u0012\n\u0002\u0010\u0000\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0008\u001a\u0018\u0000*\u0004\u0008\u0001\u0010\u00012\u0008\u0012\u0004\u0012\u00028\u00010\u00022\u00060\u0003j\u0002`\u00042\u0008\u0012\u0004\u0012\u00028\u00010\u00052\u00060\u0006j\u0002`\u0007:\u0001WBC\u0012\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000c\u001a\u00020\n\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0000\u0012\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00028\u00012\u0006\u0010\u0015\u001a\u00020\nH\u0096\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J \u0010\u0019\u001a\u00028\u00012\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00028\u0001H\u0096\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00028\u0001H\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00028\u0001H\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u001cJ\u0016\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u001eH\u0096\u0002\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0015\u0010\"\u001a\u0008\u0012\u0004\u0012\u00028\u00010!H\u0016\u00a2\u0006\u0004\u0008\"\u0010#J\u001d\u0010\"\u001a\u0008\u0012\u0004\u0012\u00028\u00010!2\u0006\u0010\u0015\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\"\u0010$J\u0017\u0010%\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00028\u0001H\u0016\u00a2\u0006\u0004\u0008%\u0010&J\u001f\u0010%\u001a\u00020\'2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00028\u0001H\u0016\u00a2\u0006\u0004\u0008%\u0010(J\u001d\u0010+\u001a\u00020\u00122\u000c\u0010*\u001a\u0008\u0012\u0004\u0012\u00028\u00010)H\u0016\u00a2\u0006\u0004\u0008+\u0010,J%\u0010+\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\n2\u000c\u0010*\u001a\u0008\u0012\u0004\u0012\u00028\u00010)H\u0016\u00a2\u0006\u0004\u0008+\u0010-J\u000f\u0010.\u001a\u00020\'H\u0016\u00a2\u0006\u0004\u0008.\u0010/J\u0017\u00100\u001a\u00028\u00012\u0006\u0010\u0015\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u00080\u0010\u0017J\u0017\u00101\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00028\u0001H\u0016\u00a2\u0006\u0004\u00081\u0010&J\u001d\u00102\u001a\u00020\u00122\u000c\u0010*\u001a\u0008\u0012\u0004\u0012\u00028\u00010)H\u0016\u00a2\u0006\u0004\u00082\u0010,J\u001d\u00103\u001a\u00020\u00122\u000c\u0010*\u001a\u0008\u0012\u0004\u0012\u00028\u00010)H\u0016\u00a2\u0006\u0004\u00083\u0010,J%\u00106\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u00104\u001a\u00020\n2\u0006\u00105\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u00086\u00107J)\u0010:\u001a\u0008\u0012\u0004\u0012\u00028\u00020\u0008\"\u0004\u0008\u0002\u001082\u000c\u00109\u001a\u0008\u0012\u0004\u0012\u00028\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008:\u0010;J\u0017\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010<0\u0008H\u0016\u00a2\u0006\u0004\u0008:\u0010=J\u001a\u0010?\u001a\u00020\u00122\u0008\u0010>\u001a\u0004\u0018\u00010<H\u0096\u0002\u00a2\u0006\u0004\u0008?\u0010&J\u000f\u0010@\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008@\u0010AJ\u000f\u0010C\u001a\u00020BH\u0016\u00a2\u0006\u0004\u0008C\u0010DJ\u000f\u0010E\u001a\u00020\'H\u0002\u00a2\u0006\u0004\u0008E\u0010/J\u000f\u0010F\u001a\u00020\'H\u0002\u00a2\u0006\u0004\u0008F\u0010/J\u000f\u0010G\u001a\u00020\'H\u0002\u00a2\u0006\u0004\u0008G\u0010/J\u001b\u0010I\u001a\u00020\u00122\n\u0010>\u001a\u0006\u0012\u0002\u0008\u00030HH\u0002\u00a2\u0006\u0004\u0008I\u0010JJ\u001f\u0010L\u001a\u00020\'2\u0006\u0010K\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00028\u0001H\u0002\u00a2\u0006\u0004\u0008L\u0010(J-\u0010K\u001a\u00020\'2\u0006\u0010K\u001a\u00020\n2\u000c\u0010*\u001a\u0008\u0012\u0004\u0012\u00028\u00010)2\u0006\u0010M\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008K\u0010NJ\u0017\u0010O\u001a\u00028\u00012\u0006\u0010K\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008O\u0010\u0017J\u001f\u0010R\u001a\u00020\'2\u0006\u0010P\u001a\u00020\n2\u0006\u0010Q\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008R\u0010SJ5\u0010U\u001a\u00020\n2\u0006\u0010P\u001a\u00020\n2\u0006\u0010Q\u001a\u00020\n2\u000c\u0010*\u001a\u0008\u0012\u0004\u0012\u00028\u00010)2\u0006\u0010T\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\u0008U\u0010VR\u001c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008W\u0010XR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00080\u0010YR\u0016\u0010\u000c\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008Z\u0010YR\u001c\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008[\u0010\\R\u001a\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008]\u0010^R\u0014\u0010_\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008W\u0010AR\u0014\u0010a\u001a\u00020\u00128BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008`\u0010\u0014\u00a8\u0006b"
    }
    d2 = {
        "Lkt/b$a;",
        "E",
        "",
        "Ljava/util/RandomAccess;",
        "Lkotlin/collections/RandomAccess;",
        "Lkotlin/collections/f;",
        "Ljava/io/Serializable;",
        "Lkotlin/io/Serializable;",
        "",
        "backing",
        "",
        "offset",
        "length",
        "parent",
        "Lkt/b;",
        "root",
        "<init>",
        "([Ljava/lang/Object;IILkt/b$a;Lkt/b;)V",
        "",
        "isEmpty",
        "()Z",
        "index",
        "get",
        "(I)Ljava/lang/Object;",
        "element",
        "set",
        "(ILjava/lang/Object;)Ljava/lang/Object;",
        "indexOf",
        "(Ljava/lang/Object;)I",
        "lastIndexOf",
        "",
        "iterator",
        "()Ljava/util/Iterator;",
        "",
        "listIterator",
        "()Ljava/util/ListIterator;",
        "(I)Ljava/util/ListIterator;",
        "add",
        "(Ljava/lang/Object;)Z",
        "",
        "(ILjava/lang/Object;)V",
        "",
        "elements",
        "addAll",
        "(Ljava/util/Collection;)Z",
        "(ILjava/util/Collection;)Z",
        "clear",
        "()V",
        "b",
        "remove",
        "removeAll",
        "retainAll",
        "fromIndex",
        "toIndex",
        "subList",
        "(II)Ljava/util/List;",
        "T",
        "array",
        "toArray",
        "([Ljava/lang/Object;)[Ljava/lang/Object;",
        "",
        "()[Ljava/lang/Object;",
        "other",
        "equals",
        "hashCode",
        "()I",
        "",
        "toString",
        "()Ljava/lang/String;",
        "u",
        "l",
        "m",
        "",
        "p",
        "(Ljava/util/List;)Z",
        "i",
        "k",
        "n",
        "(ILjava/util/Collection;I)V",
        "x",
        "rangeOffset",
        "rangeLength",
        "y",
        "(II)V",
        "retain",
        "A",
        "(IILjava/util/Collection;Z)I",
        "a",
        "[Ljava/lang/Object;",
        "I",
        "c",
        "d",
        "Lkt/b$a;",
        "e",
        "Lkt/b;",
        "size",
        "t",
        "isReadOnly",
        "kotlin-stdlib"
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
.field public a:[Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[TE;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:I

.field public c:I

.field public final d:Lkt/b$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkt/b$a<",
            "TE;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final e:Lkt/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkt/b<",
            "TE;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>([Ljava/lang/Object;IILkt/b$a;Lkt/b;)V
    .locals 1
    .param p1    # [Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lkt/b$a;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Lkt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TE;II",
            "Lkt/b$a<",
            "TE;>;",
            "Lkt/b<",
            "TE;>;)V"
        }
    .end annotation

    const-string v0, "backing"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "root"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lkotlin/collections/f;-><init>()V

    iput-object p1, p0, Lkt/b$a;->a:[Ljava/lang/Object;

    iput p2, p0, Lkt/b$a;->b:I

    iput p3, p0, Lkt/b$a;->c:I

    iput-object p4, p0, Lkt/b$a;->d:Lkt/b$a;

    iput-object p5, p0, Lkt/b$a;->e:Lkt/b;

    invoke-static {p5}, Lkt/b;->g(Lkt/b;)I

    move-result p1

    iput p1, p0, Ljava/util/AbstractList;->modCount:I

    return-void
.end method

.method public static final synthetic c(Lkt/b$a;)[Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lkt/b$a;->a:[Ljava/lang/Object;

    return-object p0
.end method

.method public static final synthetic d(Lkt/b$a;)I
    .locals 0

    iget p0, p0, Lkt/b$a;->c:I

    return p0
.end method

.method public static final synthetic e(Lkt/b$a;)I
    .locals 0

    iget p0, p0, Ljava/util/AbstractList;->modCount:I

    return p0
.end method

.method public static final synthetic f(Lkt/b$a;)I
    .locals 0

    iget p0, p0, Lkt/b$a;->b:I

    return p0
.end method

.method public static final synthetic g(Lkt/b$a;)Lkt/b;
    .locals 0

    iget-object p0, p0, Lkt/b$a;->e:Lkt/b;

    return-object p0
.end method

.method private final l()V
    .locals 2

    iget-object v0, p0, Lkt/b$a;->e:Lkt/b;

    invoke-static {v0}, Lkt/b;->g(Lkt/b;)I

    move-result v0

    iget v1, p0, Ljava/util/AbstractList;->modCount:I

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0
.end method

.method private final u()V
    .locals 1

    iget v0, p0, Ljava/util/AbstractList;->modCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ljava/util/AbstractList;->modCount:I

    return-void
.end method


# virtual methods
.method public final A(IILjava/util/Collection;Z)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/Collection<",
            "+TE;>;Z)I"
        }
    .end annotation

    iget-object v0, p0, Lkt/b$a;->d:Lkt/b$a;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2, p3, p4}, Lkt/b$a;->A(IILjava/util/Collection;Z)I

    move-result p1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lkt/b$a;->e:Lkt/b;

    invoke-static {v0, p1, p2, p3, p4}, Lkt/b;->m(Lkt/b;IILjava/util/Collection;Z)I

    move-result p1

    :goto_0
    if-lez p1, :cond_1

    invoke-direct {p0}, Lkt/b$a;->u()V

    :cond_1
    iget p2, p0, Lkt/b$a;->c:I

    sub-int/2addr p2, p1

    iput p2, p0, Lkt/b$a;->c:I

    return p1
.end method

.method public a()I
    .locals 1

    invoke-direct {p0}, Lkt/b$a;->l()V

    iget v0, p0, Lkt/b$a;->c:I

    return v0
.end method

.method public add(ILjava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITE;)V"
        }
    .end annotation

    .line 4
    invoke-virtual {p0}, Lkt/b$a;->m()V

    .line 5
    invoke-direct {p0}, Lkt/b$a;->l()V

    .line 6
    sget-object v0, Lkotlin/collections/d;->a:Lkotlin/collections/d$a;

    iget v1, p0, Lkt/b$a;->c:I

    invoke-virtual {v0, p1, v1}, Lkotlin/collections/d$a;->c(II)V

    .line 7
    iget v0, p0, Lkt/b$a;->b:I

    add-int/2addr v0, p1

    invoke-virtual {p0, v0, p2}, Lkt/b$a;->k(ILjava/lang/Object;)V

    return-void
.end method

.method public add(Ljava/lang/Object;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)Z"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lkt/b$a;->m()V

    .line 2
    invoke-direct {p0}, Lkt/b$a;->l()V

    .line 3
    iget v0, p0, Lkt/b$a;->b:I

    iget v1, p0, Lkt/b$a;->c:I

    add-int/2addr v0, v1

    invoke-virtual {p0, v0, p1}, Lkt/b$a;->k(ILjava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method

.method public addAll(ILjava/util/Collection;)Z
    .locals 2
    .param p2    # Ljava/util/Collection;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Collection<",
            "+TE;>;)Z"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-virtual {p0}, Lkt/b$a;->m()V

    .line 6
    invoke-direct {p0}, Lkt/b$a;->l()V

    .line 7
    sget-object v0, Lkotlin/collections/d;->a:Lkotlin/collections/d$a;

    iget v1, p0, Lkt/b$a;->c:I

    invoke-virtual {v0, p1, v1}, Lkotlin/collections/d$a;->c(II)V

    .line 8
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    move-result v0

    .line 9
    iget v1, p0, Lkt/b$a;->b:I

    add-int/2addr v1, p1

    invoke-virtual {p0, v1, p2, v0}, Lkt/b$a;->i(ILjava/util/Collection;I)V

    if-lez v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public addAll(Ljava/util/Collection;)Z
    .locals 3
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

    .line 1
    invoke-virtual {p0}, Lkt/b$a;->m()V

    .line 2
    invoke-direct {p0}, Lkt/b$a;->l()V

    .line 3
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v0

    .line 4
    iget v1, p0, Lkt/b$a;->b:I

    iget v2, p0, Lkt/b$a;->c:I

    add-int/2addr v1, v2

    invoke-virtual {p0, v1, p1, v0}, Lkt/b$a;->i(ILjava/util/Collection;I)V

    if-lez v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public b(I)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    invoke-virtual {p0}, Lkt/b$a;->m()V

    invoke-direct {p0}, Lkt/b$a;->l()V

    sget-object v0, Lkotlin/collections/d;->a:Lkotlin/collections/d$a;

    iget v1, p0, Lkt/b$a;->c:I

    invoke-virtual {v0, p1, v1}, Lkotlin/collections/d$a;->b(II)V

    iget v0, p0, Lkt/b$a;->b:I

    add-int/2addr v0, p1

    invoke-virtual {p0, v0}, Lkt/b$a;->x(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public clear()V
    .locals 2

    invoke-virtual {p0}, Lkt/b$a;->m()V

    invoke-direct {p0}, Lkt/b$a;->l()V

    iget v0, p0, Lkt/b$a;->b:I

    iget v1, p0, Lkt/b$a;->c:I

    invoke-virtual {p0, v0, v1}, Lkt/b$a;->y(II)V

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    invoke-direct {p0}, Lkt/b$a;->l()V

    if-eq p1, p0, :cond_1

    instance-of v0, p1, Ljava/util/List;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lkt/b$a;->p(Ljava/util/List;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public get(I)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    invoke-direct {p0}, Lkt/b$a;->l()V

    sget-object v0, Lkotlin/collections/d;->a:Lkotlin/collections/d$a;

    iget v1, p0, Lkt/b$a;->c:I

    invoke-virtual {v0, p1, v1}, Lkotlin/collections/d$a;->b(II)V

    iget-object v0, p0, Lkt/b$a;->a:[Ljava/lang/Object;

    iget v1, p0, Lkt/b$a;->b:I

    add-int/2addr v1, p1

    aget-object p1, v0, v1

    return-object p1
.end method

.method public hashCode()I
    .locals 3

    invoke-direct {p0}, Lkt/b$a;->l()V

    iget-object v0, p0, Lkt/b$a;->a:[Ljava/lang/Object;

    iget v1, p0, Lkt/b$a;->b:I

    iget v2, p0, Lkt/b$a;->c:I

    invoke-static {v0, v1, v2}, Lkt/c;->b([Ljava/lang/Object;II)I

    move-result v0

    return v0
.end method

.method public final i(ILjava/util/Collection;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Collection<",
            "+TE;>;I)V"
        }
    .end annotation

    invoke-direct {p0}, Lkt/b$a;->u()V

    iget-object v0, p0, Lkt/b$a;->d:Lkt/b$a;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2, p3}, Lkt/b$a;->i(ILjava/util/Collection;I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lkt/b$a;->e:Lkt/b;

    invoke-static {v0, p1, p2, p3}, Lkt/b;->c(Lkt/b;ILjava/util/Collection;I)V

    :goto_0
    iget-object p1, p0, Lkt/b$a;->e:Lkt/b;

    invoke-static {p1}, Lkt/b;->e(Lkt/b;)[Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lkt/b$a;->a:[Ljava/lang/Object;

    iget p1, p0, Lkt/b$a;->c:I

    add-int/2addr p1, p3

    iput p1, p0, Lkt/b$a;->c:I

    return-void
.end method

.method public indexOf(Ljava/lang/Object;)I
    .locals 3

    invoke-direct {p0}, Lkt/b$a;->l()V

    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Lkt/b$a;->c:I

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Lkt/b$a;->a:[Ljava/lang/Object;

    iget v2, p0, Lkt/b$a;->b:I

    add-int/2addr v2, v0

    aget-object v1, v1, v2

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method public isEmpty()Z
    .locals 1

    invoke-direct {p0}, Lkt/b$a;->l()V

    iget v0, p0, Lkt/b$a;->c:I

    if-nez v0, :cond_0

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

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lkt/b$a;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    return-object v0
.end method

.method public final k(ILjava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITE;)V"
        }
    .end annotation

    invoke-direct {p0}, Lkt/b$a;->u()V

    iget-object v0, p0, Lkt/b$a;->d:Lkt/b$a;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lkt/b$a;->k(ILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lkt/b$a;->e:Lkt/b;

    invoke-static {v0, p1, p2}, Lkt/b;->d(Lkt/b;ILjava/lang/Object;)V

    :goto_0
    iget-object p1, p0, Lkt/b$a;->e:Lkt/b;

    invoke-static {p1}, Lkt/b;->e(Lkt/b;)[Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lkt/b$a;->a:[Ljava/lang/Object;

    iget p1, p0, Lkt/b$a;->c:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lkt/b$a;->c:I

    return-void
.end method

.method public lastIndexOf(Ljava/lang/Object;)I
    .locals 3

    invoke-direct {p0}, Lkt/b$a;->l()V

    iget v0, p0, Lkt/b$a;->c:I

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    iget-object v1, p0, Lkt/b$a;->a:[Ljava/lang/Object;

    iget v2, p0, Lkt/b$a;->b:I

    add-int/2addr v2, v0

    aget-object v1, v1, v2

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return v0

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method public listIterator()Ljava/util/ListIterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ListIterator<",
            "TE;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0}, Lkt/b$a;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    return-object v0
.end method

.method public listIterator(I)Ljava/util/ListIterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/ListIterator<",
            "TE;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 2
    invoke-direct {p0}, Lkt/b$a;->l()V

    .line 3
    sget-object v0, Lkotlin/collections/d;->a:Lkotlin/collections/d$a;

    iget v1, p0, Lkt/b$a;->c:I

    invoke-virtual {v0, p1, v1}, Lkotlin/collections/d$a;->c(II)V

    .line 4
    new-instance v0, Lkt/b$a$a;

    invoke-direct {v0, p0, p1}, Lkt/b$a$a;-><init>(Lkt/b$a;I)V

    return-object v0
.end method

.method public final m()V
    .locals 1

    invoke-virtual {p0}, Lkt/b$a;->t()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final p(Ljava/util/List;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "*>;)Z"
        }
    .end annotation

    iget-object v0, p0, Lkt/b$a;->a:[Ljava/lang/Object;

    iget v1, p0, Lkt/b$a;->b:I

    iget v2, p0, Lkt/b$a;->c:I

    invoke-static {v0, v1, v2, p1}, Lkt/c;->a([Ljava/lang/Object;IILjava/util/List;)Z

    move-result p1

    return p1
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 0

    invoke-virtual {p0}, Lkt/b$a;->m()V

    invoke-direct {p0}, Lkt/b$a;->l()V

    invoke-virtual {p0, p1}, Lkt/b$a;->indexOf(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    invoke-virtual {p0, p1}, Lkt/b$a;->b(I)Ljava/lang/Object;

    :cond_0
    if-ltz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public removeAll(Ljava/util/Collection;)Z
    .locals 3
    .param p1    # Ljava/util/Collection;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "*>;)Z"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lkt/b$a;->m()V

    invoke-direct {p0}, Lkt/b$a;->l()V

    iget v0, p0, Lkt/b$a;->b:I

    iget v1, p0, Lkt/b$a;->c:I

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, p1, v2}, Lkt/b$a;->A(IILjava/util/Collection;Z)I

    move-result p1

    if-lez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v2
.end method

.method public retainAll(Ljava/util/Collection;)Z
    .locals 3
    .param p1    # Ljava/util/Collection;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "*>;)Z"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lkt/b$a;->m()V

    invoke-direct {p0}, Lkt/b$a;->l()V

    iget v0, p0, Lkt/b$a;->b:I

    iget v1, p0, Lkt/b$a;->c:I

    const/4 v2, 0x1

    invoke-virtual {p0, v0, v1, p1, v2}, Lkt/b$a;->A(IILjava/util/Collection;Z)I

    move-result p1

    if-lez p1, :cond_0

    return v2

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITE;)TE;"
        }
    .end annotation

    invoke-virtual {p0}, Lkt/b$a;->m()V

    invoke-direct {p0}, Lkt/b$a;->l()V

    sget-object v0, Lkotlin/collections/d;->a:Lkotlin/collections/d$a;

    iget v1, p0, Lkt/b$a;->c:I

    invoke-virtual {v0, p1, v1}, Lkotlin/collections/d$a;->b(II)V

    iget-object v0, p0, Lkt/b$a;->a:[Ljava/lang/Object;

    iget v1, p0, Lkt/b$a;->b:I

    add-int v2, v1, p1

    aget-object v2, v0, v2

    add-int/2addr v1, p1

    aput-object p2, v0, v1

    return-object v2
.end method

.method public subList(II)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Ljava/util/List<",
            "TE;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lkotlin/collections/d;->a:Lkotlin/collections/d$a;

    iget v1, p0, Lkt/b$a;->c:I

    invoke-virtual {v0, p1, p2, v1}, Lkotlin/collections/d$a;->d(III)V

    new-instance v2, Lkt/b$a;

    iget-object v3, p0, Lkt/b$a;->a:[Ljava/lang/Object;

    iget v0, p0, Lkt/b$a;->b:I

    add-int v4, v0, p1

    sub-int v5, p2, p1

    iget-object v7, p0, Lkt/b$a;->e:Lkt/b;

    move-object v6, p0

    invoke-direct/range {v2 .. v7}, Lkt/b$a;-><init>([Ljava/lang/Object;IILkt/b$a;Lkt/b;)V

    return-object v2
.end method

.method public final t()Z
    .locals 1

    iget-object v0, p0, Lkt/b$a;->e:Lkt/b;

    invoke-static {v0}, Lkt/b;->i(Lkt/b;)Z

    move-result v0

    return v0
.end method

.method public toArray()[Ljava/lang/Object;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 6
    invoke-direct {p0}, Lkt/b$a;->l()V

    .line 7
    iget-object v0, p0, Lkt/b$a;->a:[Ljava/lang/Object;

    iget v1, p0, Lkt/b$a;->b:I

    iget v2, p0, Lkt/b$a;->c:I

    add-int/2addr v2, v1

    invoke-static {v0, v1, v2}, Lkotlin/collections/l;->n([Ljava/lang/Object;II)[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 4
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

    .line 1
    invoke-direct {p0}, Lkt/b$a;->l()V

    .line 2
    array-length v0, p1

    iget v1, p0, Lkt/b$a;->c:I

    if-ge v0, v1, :cond_0

    .line 3
    iget-object v0, p0, Lkt/b$a;->a:[Ljava/lang/Object;

    iget v2, p0, Lkt/b$a;->b:I

    add-int/2addr v1, v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-static {v0, v2, v1, p1}, Ljava/util/Arrays;->copyOfRange([Ljava/lang/Object;IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object p1

    const-string v0, "copyOfRange(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    .line 4
    :cond_0
    iget-object v0, p0, Lkt/b$a;->a:[Ljava/lang/Object;

    iget v2, p0, Lkt/b$a;->b:I

    add-int/2addr v1, v2

    const/4 v3, 0x0

    invoke-static {v0, p1, v3, v2, v1}, Lkotlin/collections/l;->i([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    .line 5
    iget v0, p0, Lkt/b$a;->c:I

    invoke-static {v0, p1}, Lkotlin/collections/o;->e(I[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-direct {p0}, Lkt/b$a;->l()V

    iget-object v0, p0, Lkt/b$a;->a:[Ljava/lang/Object;

    iget v1, p0, Lkt/b$a;->b:I

    iget v2, p0, Lkt/b$a;->c:I

    invoke-static {v0, v1, v2, p0}, Lkt/c;->c([Ljava/lang/Object;IILjava/util/Collection;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final x(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    invoke-direct {p0}, Lkt/b$a;->u()V

    iget-object v0, p0, Lkt/b$a;->d:Lkt/b$a;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lkt/b$a;->x(I)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lkt/b$a;->e:Lkt/b;

    invoke-static {v0, p1}, Lkt/b;->k(Lkt/b;I)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    iget v0, p0, Lkt/b$a;->c:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lkt/b$a;->c:I

    return-object p1
.end method

.method public final y(II)V
    .locals 1

    if-lez p2, :cond_0

    invoke-direct {p0}, Lkt/b$a;->u()V

    :cond_0
    iget-object v0, p0, Lkt/b$a;->d:Lkt/b$a;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1, p2}, Lkt/b$a;->y(II)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lkt/b$a;->e:Lkt/b;

    invoke-static {v0, p1, p2}, Lkt/b;->l(Lkt/b;II)V

    :goto_0
    iget p1, p0, Lkt/b$a;->c:I

    sub-int/2addr p1, p2

    iput p1, p0, Lkt/b$a;->c:I

    return-void
.end method
