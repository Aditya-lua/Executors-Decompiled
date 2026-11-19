.class public final Lau/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Map;
.implements Ljava/io/Serializable;
.implements Lqu/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lau/d$a;,
        Lau/d$b;,
        Lau/d$c;,
        Lau/d$d;,
        Lau/d$e;,
        Lau/d$f;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Map<",
        "TK;TV;>;",
        "Ljava/io/Serializable;",
        "Lqu/e;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00ac\u0001\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0008\u0002\n\u0002\u0010\u0015\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0017\n\u0002\u0010$\n\u0002\u0008\u0003\n\u0002\u0010&\n\u0002\u0008\u0003\n\u0002\u0010\u001e\n\u0002\u0008\u0012\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010#\n\u0002\u0008\u0003\n\u0002\u0010\u001f\n\u0002\u0008\u0003\n\u0002\u0010\'\n\u0002\u0008\u0005\u0008\u0000\u0018\u0000 \u0016*\u0004\u0008\u0000\u0010\u0001*\u0004\u0008\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005:\u0006afghcdBG\u0008\u0002\u0012\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u000e\u0010\u0008\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0006\u0010\u000e\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000f\u0010\u0010B\t\u0008\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0011B\u0011\u0008\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000f\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0011J\u0017\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0013J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u0013J\u0015\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0006H\u0002\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u000c2\u0006\u0010 \u001a\u00028\u0000H\u0002\u00a2\u0006\u0004\u0008!\u0010\"J\u0017\u0010$\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u0019H\u0002\u00a2\u0006\u0004\u0008$\u0010%J\u0017\u0010\'\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\'\u0010\u0013J\u0017\u0010)\u001a\u00020\u00192\u0006\u0010(\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008)\u0010\u001bJ\u0017\u0010*\u001a\u00020\u000c2\u0006\u0010 \u001a\u00028\u0000H\u0002\u00a2\u0006\u0004\u0008*\u0010\"J\u0017\u0010,\u001a\u00020\u000c2\u0006\u0010+\u001a\u00028\u0001H\u0002\u00a2\u0006\u0004\u0008,\u0010\"J\u0017\u0010.\u001a\u00020\u00142\u0006\u0010-\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008.\u0010\u0013J\u0017\u00100\u001a\u00020\u00142\u0006\u0010/\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u00080\u0010\u0013J\u001f\u00103\u001a\u00020\u00192\u000e\u00102\u001a\n\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u000301H\u0002\u00a2\u0006\u0004\u00083\u00104J#\u00107\u001a\u00020\u00192\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000105H\u0002\u00a2\u0006\u0004\u00087\u00108J)\u0010;\u001a\u00020\u00192\u0018\u0010:\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010509H\u0002\u00a2\u0006\u0004\u0008;\u0010<J\u0019\u0010=\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000101\u00a2\u0006\u0004\u0008=\u0010>J\u000f\u0010?\u001a\u00020\u0019H\u0016\u00a2\u0006\u0004\u0008?\u0010@J\u0017\u0010A\u001a\u00020\u00192\u0006\u0010 \u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\u0008A\u0010BJ\u0017\u0010C\u001a\u00020\u00192\u0006\u0010+\u001a\u00028\u0001H\u0016\u00a2\u0006\u0004\u0008C\u0010BJ\u001a\u0010D\u001a\u0004\u0018\u00018\u00012\u0006\u0010 \u001a\u00028\u0000H\u0096\u0002\u00a2\u0006\u0004\u0008D\u0010EJ!\u0010F\u001a\u0004\u0018\u00018\u00012\u0006\u0010 \u001a\u00028\u00002\u0006\u0010+\u001a\u00028\u0001H\u0016\u00a2\u0006\u0004\u0008F\u0010GJ%\u0010H\u001a\u00020\u00142\u0014\u0010:\u001a\u0010\u0012\u0006\u0008\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000101H\u0016\u00a2\u0006\u0004\u0008H\u0010IJ\u0019\u0010J\u001a\u0004\u0018\u00018\u00012\u0006\u0010 \u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\u0008J\u0010EJ\u000f\u0010K\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\u0008K\u0010\u0011J\u001a\u0010M\u001a\u00020\u00192\u0008\u00102\u001a\u0004\u0018\u00010LH\u0096\u0002\u00a2\u0006\u0004\u0008M\u0010BJ\u000f\u0010N\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008N\u0010OJ\u000f\u0010Q\u001a\u00020PH\u0016\u00a2\u0006\u0004\u0008Q\u0010RJ\u000f\u0010S\u001a\u00020\u0014H\u0000\u00a2\u0006\u0004\u0008S\u0010\u0011J\u0017\u0010(\u001a\u00020\u000c2\u0006\u0010 \u001a\u00028\u0000H\u0000\u00a2\u0006\u0004\u0008(\u0010\"J\u0017\u0010T\u001a\u00020\u00192\u0006\u0010 \u001a\u00028\u0000H\u0000\u00a2\u0006\u0004\u0008T\u0010BJ#\u0010U\u001a\u00020\u00192\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000105H\u0000\u00a2\u0006\u0004\u0008U\u00108J\u001b\u0010\u0016\u001a\u00020\u00192\n\u0010$\u001a\u0006\u0012\u0002\u0008\u000309H\u0000\u00a2\u0006\u0004\u0008\u0016\u0010<J#\u0010\u0001\u001a\u00020\u00192\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000105H\u0000\u00a2\u0006\u0004\u0008\u0001\u00108J\u0017\u0010W\u001a\u00020\u00192\u0006\u0010V\u001a\u00028\u0001H\u0000\u00a2\u0006\u0004\u0008W\u0010BJ\u001b\u0010Y\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010XH\u0000\u00a2\u0006\u0004\u0008Y\u0010ZJ\u001b\u0010\\\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010[H\u0000\u00a2\u0006\u0004\u0008\\\u0010]J\u001b\u0010_\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010^H\u0000\u00a2\u0006\u0004\u0008_\u0010`R\u001c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008a\u0010bR\u001e\u0010\u0008\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008c\u0010bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008d\u0010eR\u0016\u0010\u000b\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008f\u0010eR\u0016\u0010\r\u001a\u00020\u000c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008g\u0010\u0015R\u0016\u0010\u000e\u001a\u00020\u000c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008h\u0010\u0015R\u0016\u0010j\u001a\u00020\u000c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008i\u0010\u0015R\u0016\u0010l\u001a\u00020\u000c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008k\u0010\u0015R$\u0010n\u001a\u00020\u000c2\u0006\u0010+\u001a\u00020\u000c8\u0016@RX\u0096\u000e\u00a2\u0006\u000c\n\u0004\u0008(\u0010\u0015\u001a\u0004\u0008m\u0010OR\u001e\u0010q\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010o8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010pR\u001e\u0010t\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008=\u0010sR$\u0010w\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010u8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008S\u0010vR$\u0010z\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\u00198\u0000@BX\u0080\u000e\u00a2\u0006\u000c\n\u0004\u0008$\u0010x\u001a\u0004\u0008y\u0010@R\u0014\u0010|\u001a\u00020\u000c8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008{\u0010OR\u001b\u0010\u0080\u0001\u001a\u0008\u0012\u0004\u0012\u00028\u00000}8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008~\u0010\u007fR\u001e\u0010\u0084\u0001\u001a\t\u0012\u0004\u0012\u00028\u00010\u0081\u00018VX\u0096\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u0082\u0001\u0010\u0083\u0001R)\u0010\u0087\u0001\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0085\u00010}8VX\u0096\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u0086\u0001\u0010\u007fR\u0016\u0010\u0089\u0001\u001a\u00020\u000c8@X\u0080\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u0088\u0001\u0010O\u00a8\u0006\u008a\u0001"
    }
    d2 = {
        "Lau/d;",
        "K",
        "V",
        "",
        "Ljava/io/Serializable;",
        "Lkotlin/io/Serializable;",
        "",
        "keysArray",
        "valuesArray",
        "",
        "presenceArray",
        "hashArray",
        "",
        "maxProbeDistance",
        "length",
        "<init>",
        "([Ljava/lang/Object;[Ljava/lang/Object;[I[III)V",
        "()V",
        "initialCapacity",
        "(I)V",
        "",
        "I",
        "n",
        "s",
        "extraCapacity",
        "",
        "P",
        "(I)Z",
        "minCapacity",
        "r",
        "j",
        "()[Ljava/lang/Object;",
        "key",
        "D",
        "(Ljava/lang/Object;)I",
        "updateHashArray",
        "m",
        "(Z)V",
        "newHashSize",
        "J",
        "i",
        "H",
        "u",
        "value",
        "w",
        "index",
        "L",
        "removedHash",
        "M",
        "",
        "other",
        "p",
        "(Ljava/util/Map;)Z",
        "",
        "entry",
        "G",
        "(Ljava/util/Map$Entry;)Z",
        "",
        "from",
        "F",
        "(Ljava/util/Collection;)Z",
        "k",
        "()Ljava/util/Map;",
        "isEmpty",
        "()Z",
        "containsKey",
        "(Ljava/lang/Object;)Z",
        "containsValue",
        "get",
        "(Ljava/lang/Object;)Ljava/lang/Object;",
        "put",
        "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;",
        "putAll",
        "(Ljava/util/Map;)V",
        "remove",
        "clear",
        "",
        "equals",
        "hashCode",
        "()I",
        "",
        "toString",
        "()Ljava/lang/String;",
        "l",
        "N",
        "o",
        "element",
        "O",
        "Lau/d$e;",
        "E",
        "()Lau/d$e;",
        "Lau/d$f;",
        "Q",
        "()Lau/d$f;",
        "Lau/d$b;",
        "t",
        "()Lau/d$b;",
        "a",
        "[Ljava/lang/Object;",
        "b",
        "c",
        "[I",
        "d",
        "e",
        "f",
        "g",
        "hashShift",
        "h",
        "modCount",
        "B",
        "size",
        "Lau/f;",
        "Lau/f;",
        "keysView",
        "Lau/g;",
        "Lau/g;",
        "valuesView",
        "Lau/e;",
        "Lau/e;",
        "entriesView",
        "Z",
        "isReadOnly$kotlin_stdlib",
        "isReadOnly",
        "z",
        "hashSize",
        "",
        "A",
        "()Ljava/util/Set;",
        "keys",
        "",
        "C",
        "()Ljava/util/Collection;",
        "values",
        "",
        "y",
        "entries",
        "x",
        "capacity",
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


# static fields
.field public static final n:Lau/d$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final o:Lau/d;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public a:[Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[TK;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public b:[Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[TV;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public c:[I
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public d:[I
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public e:I

.field public f:I

.field public g:I

.field public h:I

.field public i:I

.field public j:Lau/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lau/f<",
            "TK;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public k:Lau/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lau/g<",
            "TV;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public l:Lau/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lau/e<",
            "TK;TV;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public m:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lau/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lau/d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lau/d;->n:Lau/d$a;

    new-instance v0, Lau/d;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lau/d;-><init>(I)V

    const/4 v1, 0x1

    iput-boolean v1, v0, Lau/d;->m:Z

    sput-object v0, Lau/d;->o:Lau/d;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/16 v0, 0x8

    .line 9
    invoke-direct {p0, v0}, Lau/d;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 7

    .line 10
    invoke-static {p1}, Lau/c;->d(I)[Ljava/lang/Object;

    move-result-object v1

    .line 11
    new-array v3, p1, [I

    .line 12
    sget-object v0, Lau/d;->n:Lau/d$a;

    invoke-static {v0, p1}, Lau/d$a;->a(Lau/d$a;I)I

    move-result p1

    new-array v4, p1, [I

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    .line 13
    invoke-direct/range {v0 .. v6}, Lau/d;-><init>([Ljava/lang/Object;[Ljava/lang/Object;[I[III)V

    return-void
.end method

.method public constructor <init>([Ljava/lang/Object;[Ljava/lang/Object;[I[III)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TK;[TV;[I[III)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lau/d;->a:[Ljava/lang/Object;

    .line 3
    iput-object p2, p0, Lau/d;->b:[Ljava/lang/Object;

    .line 4
    iput-object p3, p0, Lau/d;->c:[I

    .line 5
    iput-object p4, p0, Lau/d;->d:[I

    .line 6
    iput p5, p0, Lau/d;->e:I

    .line 7
    iput p6, p0, Lau/d;->f:I

    .line 8
    sget-object p1, Lau/d;->n:Lau/d$a;

    invoke-virtual {p0}, Lau/d;->z()I

    move-result p2

    invoke-static {p1, p2}, Lau/d$a;->b(Lau/d$a;I)I

    move-result p1

    iput p1, p0, Lau/d;->g:I

    return-void
.end method

.method private final I()V
    .locals 1

    iget v0, p0, Lau/d;->h:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lau/d;->h:I

    return-void
.end method

.method public static final synthetic a(Lau/d;)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0}, Lau/d;->j()[Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b()Lau/d;
    .locals 1

    sget-object v0, Lau/d;->o:Lau/d;

    return-object v0
.end method

.method public static final synthetic c(Lau/d;)[Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lau/d;->a:[Ljava/lang/Object;

    return-object p0
.end method

.method public static final synthetic d(Lau/d;)I
    .locals 0

    iget p0, p0, Lau/d;->f:I

    return p0
.end method

.method public static final synthetic e(Lau/d;)I
    .locals 0

    iget p0, p0, Lau/d;->h:I

    return p0
.end method

.method public static final synthetic f(Lau/d;)[I
    .locals 0

    iget-object p0, p0, Lau/d;->c:[I

    return-object p0
.end method

.method public static final synthetic g(Lau/d;)[Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lau/d;->b:[Ljava/lang/Object;

    return-object p0
.end method

.method public static final synthetic h(Lau/d;I)V
    .locals 0

    invoke-virtual {p0, p1}, Lau/d;->L(I)V

    return-void
.end method

.method private final r(I)V
    .locals 2

    if-ltz p1, :cond_2

    invoke-virtual {p0}, Lau/d;->x()I

    move-result v0

    if-le p1, v0, :cond_1

    sget-object v0, Lkotlin/collections/d;->a:Lkotlin/collections/d$a;

    invoke-virtual {p0}, Lau/d;->x()I

    move-result v1

    invoke-virtual {v0, v1, p1}, Lkotlin/collections/d$a;->e(II)I

    move-result p1

    iget-object v0, p0, Lau/d;->a:[Ljava/lang/Object;

    invoke-static {v0, p1}, Lau/c;->e([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lau/d;->a:[Ljava/lang/Object;

    iget-object v0, p0, Lau/d;->b:[Ljava/lang/Object;

    if-eqz v0, :cond_0

    invoke-static {v0, p1}, Lau/c;->e([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lau/d;->b:[Ljava/lang/Object;

    iget-object v0, p0, Lau/d;->c:[I

    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    const-string v1, "copyOf(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lau/d;->c:[I

    sget-object v0, Lau/d;->n:Lau/d$a;

    invoke-static {v0, p1}, Lau/d$a;->a(Lau/d$a;I)I

    move-result p1

    invoke-virtual {p0}, Lau/d;->z()I

    move-result v0

    if-le p1, v0, :cond_1

    invoke-virtual {p0, p1}, Lau/d;->J(I)V

    :cond_1
    return-void

    :cond_2
    new-instance p1, Ljava/lang/OutOfMemoryError;

    invoke-direct {p1}, Ljava/lang/OutOfMemoryError;-><init>()V

    throw p1
.end method

.method private final s(I)V
    .locals 1

    invoke-virtual {p0, p1}, Lau/d;->P(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lau/d;->m(Z)V

    return-void

    :cond_0
    iget v0, p0, Lau/d;->f:I

    add-int/2addr v0, p1

    invoke-direct {p0, v0}, Lau/d;->r(I)V

    return-void
.end method


# virtual methods
.method public A()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "TK;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lau/d;->j:Lau/f;

    if-nez v0, :cond_0

    new-instance v0, Lau/f;

    invoke-direct {v0, p0}, Lau/f;-><init>(Lau/d;)V

    iput-object v0, p0, Lau/d;->j:Lau/f;

    :cond_0
    return-object v0
.end method

.method public B()I
    .locals 1

    iget v0, p0, Lau/d;->i:I

    return v0
.end method

.method public C()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "TV;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lau/d;->k:Lau/g;

    if-nez v0, :cond_0

    new-instance v0, Lau/g;

    invoke-direct {v0, p0}, Lau/g;-><init>(Lau/d;)V

    iput-object v0, p0, Lau/d;->k:Lau/g;

    :cond_0
    return-object v0
.end method

.method public final D(Ljava/lang/Object;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)I"
        }
    .end annotation

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    const v0, -0x61c88647

    mul-int/2addr p1, v0

    iget v0, p0, Lau/d;->g:I

    ushr-int/2addr p1, v0

    return p1
.end method

.method public final E()Lau/d$e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lau/d$e<",
            "TK;TV;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lau/d$e;

    invoke-direct {v0, p0}, Lau/d$e;-><init>(Lau/d;)V

    return-object v0
.end method

.method public final F(Ljava/util/Collection;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Ljava/util/Map$Entry<",
            "+TK;+TV;>;>;)Z"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v0

    invoke-direct {p0, v0}, Lau/d;->s(I)V

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-virtual {p0, v0}, Lau/d;->G(Ljava/util/Map$Entry;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_2
    return v1
.end method

.method public final G(Ljava/util/Map$Entry;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map$Entry<",
            "+TK;+TV;>;)Z"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Lau/d;->i(Ljava/lang/Object;)I

    move-result v0

    invoke-virtual {p0}, Lau/d;->j()[Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x1

    if-ltz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    aput-object p1, v1, v0

    return v2

    :cond_0
    neg-int v0, v0

    sub-int/2addr v0, v2

    aget-object v3, v1, v0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    aput-object p1, v1, v0

    return v2

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final H(I)Z
    .locals 5

    iget-object v0, p0, Lau/d;->a:[Ljava/lang/Object;

    aget-object v0, v0, p1

    invoke-virtual {p0, v0}, Lau/d;->D(Ljava/lang/Object;)I

    move-result v0

    iget v1, p0, Lau/d;->e:I

    :goto_0
    iget-object v2, p0, Lau/d;->d:[I

    aget v3, v2, v0

    const/4 v4, 0x1

    if-nez v3, :cond_0

    add-int/lit8 v1, p1, 0x1

    aput v1, v2, v0

    iget-object v1, p0, Lau/d;->c:[I

    aput v0, v1, p1

    return v4

    :cond_0
    add-int/lit8 v1, v1, -0x1

    if-gez v1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    add-int/lit8 v2, v0, -0x1

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lau/d;->z()I

    move-result v0

    sub-int/2addr v0, v4

    goto :goto_0

    :cond_2
    move v0, v2

    goto :goto_0
.end method

.method public final J(I)V
    .locals 3

    invoke-direct {p0}, Lau/d;->I()V

    iget v0, p0, Lau/d;->f:I

    invoke-virtual {p0}, Lau/d;->size()I

    move-result v1

    const/4 v2, 0x0

    if-le v0, v1, :cond_0

    invoke-virtual {p0, v2}, Lau/d;->m(Z)V

    :cond_0
    new-array v0, p1, [I

    iput-object v0, p0, Lau/d;->d:[I

    sget-object v0, Lau/d;->n:Lau/d$a;

    invoke-static {v0, p1}, Lau/d$a;->b(Lau/d$a;I)I

    move-result p1

    iput p1, p0, Lau/d;->g:I

    :goto_0
    iget p1, p0, Lau/d;->f:I

    if-ge v2, p1, :cond_2

    add-int/lit8 p1, v2, 0x1

    invoke-virtual {p0, v2}, Lau/d;->H(I)Z

    move-result v0

    if-eqz v0, :cond_1

    move v2, p1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    return-void
.end method

.method public final K(Ljava/util/Map$Entry;)Z
    .locals 3
    .param p1    # Ljava/util/Map$Entry;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map$Entry<",
            "+TK;+TV;>;)Z"
        }
    .end annotation

    const-string v0, "entry"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lau/d;->l()V

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Lau/d;->u(Ljava/lang/Object;)I

    move-result v0

    const/4 v1, 0x0

    if-gez v0, :cond_0

    return v1

    :cond_0
    iget-object v2, p0, Lau/d;->b:[Ljava/lang/Object;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    aget-object v2, v2, v0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    return v1

    :cond_1
    invoke-virtual {p0, v0}, Lau/d;->L(I)V

    const/4 p1, 0x1

    return p1
.end method

.method public final L(I)V
    .locals 2

    iget-object v0, p0, Lau/d;->a:[Ljava/lang/Object;

    invoke-static {v0, p1}, Lau/c;->f([Ljava/lang/Object;I)V

    iget-object v0, p0, Lau/d;->b:[Ljava/lang/Object;

    if-eqz v0, :cond_0

    invoke-static {v0, p1}, Lau/c;->f([Ljava/lang/Object;I)V

    :cond_0
    iget-object v0, p0, Lau/d;->c:[I

    aget v0, v0, p1

    invoke-virtual {p0, v0}, Lau/d;->M(I)V

    iget-object v0, p0, Lau/d;->c:[I

    const/4 v1, -0x1

    aput v1, v0, p1

    invoke-virtual {p0}, Lau/d;->size()I

    move-result p1

    add-int/2addr p1, v1

    iput p1, p0, Lau/d;->i:I

    invoke-direct {p0}, Lau/d;->I()V

    return-void
.end method

.method public final M(I)V
    .locals 9

    iget v0, p0, Lau/d;->e:I

    mul-int/lit8 v0, v0, 0x2

    invoke-virtual {p0}, Lau/d;->z()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    invoke-static {v0, v1}, Lkotlin/ranges/d;->f(II)I

    move-result v0

    const/4 v1, 0x0

    move v2, v0

    move v3, v1

    move v0, p1

    :cond_0
    add-int/lit8 v4, p1, -0x1

    if-nez p1, :cond_1

    invoke-virtual {p0}, Lau/d;->z()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    :cond_1
    move p1, v4

    :goto_0
    add-int/lit8 v3, v3, 0x1

    iget v4, p0, Lau/d;->e:I

    if-le v3, v4, :cond_2

    iget-object p1, p0, Lau/d;->d:[I

    aput v1, p1, v0

    return-void

    :cond_2
    iget-object v4, p0, Lau/d;->d:[I

    aget v5, v4, p1

    if-nez v5, :cond_3

    aput v1, v4, v0

    return-void

    :cond_3
    const/4 v6, -0x1

    if-gez v5, :cond_4

    aput v6, v4, v0

    :goto_1
    move v0, p1

    move v3, v1

    goto :goto_2

    :cond_4
    iget-object v4, p0, Lau/d;->a:[Ljava/lang/Object;

    add-int/lit8 v7, v5, -0x1

    aget-object v4, v4, v7

    invoke-virtual {p0, v4}, Lau/d;->D(Ljava/lang/Object;)I

    move-result v4

    sub-int/2addr v4, p1

    invoke-virtual {p0}, Lau/d;->z()I

    move-result v8

    add-int/lit8 v8, v8, -0x1

    and-int/2addr v4, v8

    if-lt v4, v3, :cond_5

    iget-object v3, p0, Lau/d;->d:[I

    aput v5, v3, v0

    iget-object v3, p0, Lau/d;->c:[I

    aput v0, v3, v7

    goto :goto_1

    :cond_5
    :goto_2
    add-int/2addr v2, v6

    if-gez v2, :cond_0

    iget-object p1, p0, Lau/d;->d:[I

    aput v6, p1, v0

    return-void
.end method

.method public final N(Ljava/lang/Object;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)Z"
        }
    .end annotation

    invoke-virtual {p0}, Lau/d;->l()V

    invoke-virtual {p0, p1}, Lau/d;->u(Ljava/lang/Object;)I

    move-result p1

    if-gez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p0, p1}, Lau/d;->L(I)V

    const/4 p1, 0x1

    return p1
.end method

.method public final O(Ljava/lang/Object;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)Z"
        }
    .end annotation

    invoke-virtual {p0}, Lau/d;->l()V

    invoke-virtual {p0, p1}, Lau/d;->w(Ljava/lang/Object;)I

    move-result p1

    if-gez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p0, p1}, Lau/d;->L(I)V

    const/4 p1, 0x1

    return p1
.end method

.method public final P(I)Z
    .locals 3

    invoke-virtual {p0}, Lau/d;->x()I

    move-result v0

    iget v1, p0, Lau/d;->f:I

    sub-int/2addr v0, v1

    invoke-virtual {p0}, Lau/d;->size()I

    move-result v2

    sub-int/2addr v1, v2

    if-ge v0, p1, :cond_0

    add-int/2addr v0, v1

    if-lt v0, p1, :cond_0

    invoke-virtual {p0}, Lau/d;->x()I

    move-result p1

    div-int/lit8 p1, p1, 0x4

    if-lt v1, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final Q()Lau/d$f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lau/d$f<",
            "TK;TV;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lau/d$f;

    invoke-direct {v0, p0}, Lau/d$f;-><init>(Lau/d;)V

    return-object v0
.end method

.method public clear()V
    .locals 6

    invoke-virtual {p0}, Lau/d;->l()V

    iget v0, p0, Lau/d;->f:I

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x0

    if-ltz v0, :cond_1

    move v2, v1

    :goto_0
    iget-object v3, p0, Lau/d;->c:[I

    aget v4, v3, v2

    if-ltz v4, :cond_0

    iget-object v5, p0, Lau/d;->d:[I

    aput v1, v5, v4

    const/4 v4, -0x1

    aput v4, v3, v2

    :cond_0
    if-eq v2, v0, :cond_1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lau/d;->a:[Ljava/lang/Object;

    iget v2, p0, Lau/d;->f:I

    invoke-static {v0, v1, v2}, Lau/c;->g([Ljava/lang/Object;II)V

    iget-object v0, p0, Lau/d;->b:[Ljava/lang/Object;

    if-eqz v0, :cond_2

    iget v2, p0, Lau/d;->f:I

    invoke-static {v0, v1, v2}, Lau/c;->g([Ljava/lang/Object;II)V

    :cond_2
    iput v1, p0, Lau/d;->i:I

    iput v1, p0, Lau/d;->f:I

    invoke-direct {p0}, Lau/d;->I()V

    return-void
.end method

.method public containsKey(Ljava/lang/Object;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lau/d;->u(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public containsValue(Ljava/lang/Object;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lau/d;->w(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final bridge entrySet()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lau/d;->y()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    if-eq p1, p0, :cond_1

    instance-of v0, p1, Ljava/util/Map;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/util/Map;

    invoke-virtual {p0, p1}, Lau/d;->p(Ljava/util/Map;)Z

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

.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")TV;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-virtual {p0, p1}, Lau/d;->u(Ljava/lang/Object;)I

    move-result p1

    if-gez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Lau/d;->b:[Ljava/lang/Object;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    aget-object p1, v0, p1

    return-object p1
.end method

.method public hashCode()I
    .locals 3

    invoke-virtual {p0}, Lau/d;->t()Lau/d$b;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0}, Lau/d$d;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0}, Lau/d$b;->l()I

    move-result v2

    add-int/2addr v1, v2

    goto :goto_0

    :cond_0
    return v1
.end method

.method public final i(Ljava/lang/Object;)I
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)I"
        }
    .end annotation

    invoke-virtual {p0}, Lau/d;->l()V

    :goto_0
    invoke-virtual {p0, p1}, Lau/d;->D(Ljava/lang/Object;)I

    move-result v0

    iget v1, p0, Lau/d;->e:I

    mul-int/lit8 v1, v1, 0x2

    invoke-virtual {p0}, Lau/d;->z()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    invoke-static {v1, v2}, Lkotlin/ranges/d;->f(II)I

    move-result v1

    const/4 v2, 0x0

    :goto_1
    iget-object v3, p0, Lau/d;->d:[I

    aget v3, v3, v0

    const/4 v4, 0x1

    if-gtz v3, :cond_2

    iget v1, p0, Lau/d;->f:I

    invoke-virtual {p0}, Lau/d;->x()I

    move-result v3

    if-lt v1, v3, :cond_0

    invoke-direct {p0, v4}, Lau/d;->s(I)V

    goto :goto_0

    :cond_0
    iget v1, p0, Lau/d;->f:I

    add-int/lit8 v3, v1, 0x1

    iput v3, p0, Lau/d;->f:I

    iget-object v5, p0, Lau/d;->a:[Ljava/lang/Object;

    aput-object p1, v5, v1

    iget-object p1, p0, Lau/d;->c:[I

    aput v0, p1, v1

    iget-object p1, p0, Lau/d;->d:[I

    aput v3, p1, v0

    invoke-virtual {p0}, Lau/d;->size()I

    move-result p1

    add-int/2addr p1, v4

    iput p1, p0, Lau/d;->i:I

    invoke-direct {p0}, Lau/d;->I()V

    iget p1, p0, Lau/d;->e:I

    if-le v2, p1, :cond_1

    iput v2, p0, Lau/d;->e:I

    :cond_1
    return v1

    :cond_2
    iget-object v5, p0, Lau/d;->a:[Ljava/lang/Object;

    add-int/lit8 v6, v3, -0x1

    aget-object v5, v5, v6

    invoke-static {v5, p1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    neg-int p1, v3

    return p1

    :cond_3
    add-int/lit8 v2, v2, 0x1

    if-le v2, v1, :cond_4

    invoke-virtual {p0}, Lau/d;->z()I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    invoke-virtual {p0, v0}, Lau/d;->J(I)V

    goto :goto_0

    :cond_4
    add-int/lit8 v3, v0, -0x1

    if-nez v0, :cond_5

    invoke-virtual {p0}, Lau/d;->z()I

    move-result v0

    sub-int/2addr v0, v4

    goto :goto_1

    :cond_5
    move v0, v3

    goto :goto_1
.end method

.method public isEmpty()Z
    .locals 1

    invoke-virtual {p0}, Lau/d;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final j()[Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[TV;"
        }
    .end annotation

    iget-object v0, p0, Lau/d;->b:[Ljava/lang/Object;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lau/d;->x()I

    move-result v0

    invoke-static {v0}, Lau/c;->d(I)[Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lau/d;->b:[Ljava/lang/Object;

    return-object v0
.end method

.method public final k()Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "TK;TV;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-virtual {p0}, Lau/d;->l()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lau/d;->m:Z

    invoke-virtual {p0}, Lau/d;->size()I

    move-result v0

    if-lez v0, :cond_0

    return-object p0

    :cond_0
    sget-object v0, Lau/d;->o:Lau/d;

    const-string v1, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final bridge keySet()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "TK;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lau/d;->A()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final l()V
    .locals 1

    iget-boolean v0, p0, Lau/d;->m:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final m(Z)V
    .locals 7

    iget-object v0, p0, Lau/d;->b:[Ljava/lang/Object;

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    iget v3, p0, Lau/d;->f:I

    if-ge v1, v3, :cond_3

    iget-object v3, p0, Lau/d;->c:[I

    aget v4, v3, v1

    if-ltz v4, :cond_2

    iget-object v5, p0, Lau/d;->a:[Ljava/lang/Object;

    aget-object v6, v5, v1

    aput-object v6, v5, v2

    if-eqz v0, :cond_0

    aget-object v5, v0, v1

    aput-object v5, v0, v2

    :cond_0
    if-eqz p1, :cond_1

    aput v4, v3, v2

    iget-object v3, p0, Lau/d;->d:[I

    add-int/lit8 v5, v2, 0x1

    aput v5, v3, v4

    :cond_1
    add-int/lit8 v2, v2, 0x1

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    iget-object p1, p0, Lau/d;->a:[Ljava/lang/Object;

    invoke-static {p1, v2, v3}, Lau/c;->g([Ljava/lang/Object;II)V

    if-eqz v0, :cond_4

    iget p1, p0, Lau/d;->f:I

    invoke-static {v0, v2, p1}, Lau/c;->g([Ljava/lang/Object;II)V

    :cond_4
    iput v2, p0, Lau/d;->f:I

    return-void
.end method

.method public final n(Ljava/util/Collection;)Z
    .locals 2
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

    const-string v0, "m"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    :try_start_0
    check-cast v0, Ljava/util/Map$Entry;

    invoke-virtual {p0, v0}, Lau/d;->o(Ljava/util/Map$Entry;)Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v0, :cond_0

    nop

    :catch_0
    :cond_1
    return v1

    :cond_2
    const/4 p1, 0x1

    return p1
.end method

.method public final o(Ljava/util/Map$Entry;)Z
    .locals 2
    .param p1    # Ljava/util/Map$Entry;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map$Entry<",
            "+TK;+TV;>;)Z"
        }
    .end annotation

    const-string v0, "entry"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Lau/d;->u(Ljava/lang/Object;)I

    move-result v0

    if-gez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v1, p0, Lau/d;->b:[Ljava/lang/Object;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    aget-object v0, v1, v0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final p(Ljava/util/Map;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "**>;)Z"
        }
    .end annotation

    invoke-virtual {p0}, Lau/d;->size()I

    move-result v0

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v1

    if-ne v0, v1, :cond_0

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-virtual {p0, p1}, Lau/d;->n(Ljava/util/Collection;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)TV;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-virtual {p0}, Lau/d;->l()V

    invoke-virtual {p0, p1}, Lau/d;->i(Ljava/lang/Object;)I

    move-result p1

    invoke-virtual {p0}, Lau/d;->j()[Ljava/lang/Object;

    move-result-object v0

    if-gez p1, :cond_0

    neg-int p1, p1

    add-int/lit8 p1, p1, -0x1

    aget-object v1, v0, p1

    aput-object p2, v0, p1

    return-object v1

    :cond_0
    aput-object p2, v0, p1

    const/4 p1, 0x0

    return-object p1
.end method

.method public putAll(Ljava/util/Map;)V
    .locals 1
    .param p1    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "+TK;+TV;>;)V"
        }
    .end annotation

    const-string v0, "from"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lau/d;->l()V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-virtual {p0, p1}, Lau/d;->F(Ljava/util/Collection;)Z

    return-void
.end method

.method public remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")TV;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-virtual {p0}, Lau/d;->l()V

    invoke-virtual {p0, p1}, Lau/d;->u(Ljava/lang/Object;)I

    move-result p1

    if-gez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Lau/d;->b:[Ljava/lang/Object;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    aget-object v0, v0, p1

    invoke-virtual {p0, p1}, Lau/d;->L(I)V

    return-object v0
.end method

.method public final bridge size()I
    .locals 1

    invoke-virtual {p0}, Lau/d;->B()I

    move-result v0

    return v0
.end method

.method public final t()Lau/d$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lau/d$b<",
            "TK;TV;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lau/d$b;

    invoke-direct {v0, p0}, Lau/d$b;-><init>(Lau/d;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lau/d;->size()I

    move-result v1

    mul-int/lit8 v1, v1, 0x3

    add-int/lit8 v1, v1, 0x2

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lau/d;->t()Lau/d$b;

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v1}, Lau/d$d;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    if-lez v2, :cond_0

    const-string v3, ", "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    invoke-virtual {v1, v0}, Lau/d$b;->k(Ljava/lang/StringBuilder;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final u(Ljava/lang/Object;)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)I"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lau/d;->D(Ljava/lang/Object;)I

    move-result v0

    iget v1, p0, Lau/d;->e:I

    :goto_0
    iget-object v2, p0, Lau/d;->d:[I

    aget v2, v2, v0

    const/4 v3, -0x1

    if-nez v2, :cond_0

    return v3

    :cond_0
    if-lez v2, :cond_1

    iget-object v4, p0, Lau/d;->a:[Ljava/lang/Object;

    add-int/lit8 v2, v2, -0x1

    aget-object v4, v4, v2

    invoke-static {v4, p1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    return v2

    :cond_1
    add-int/2addr v1, v3

    if-gez v1, :cond_2

    return v3

    :cond_2
    add-int/lit8 v2, v0, -0x1

    if-nez v0, :cond_3

    invoke-virtual {p0}, Lau/d;->z()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_3
    move v0, v2

    goto :goto_0
.end method

.method public final bridge values()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "TV;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lau/d;->C()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public final w(Ljava/lang/Object;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)I"
        }
    .end annotation

    iget v0, p0, Lau/d;->f:I

    :cond_0
    const/4 v1, -0x1

    add-int/2addr v0, v1

    if-ltz v0, :cond_1

    iget-object v1, p0, Lau/d;->c:[I

    aget v1, v1, v0

    if-ltz v1, :cond_0

    iget-object v1, p0, Lau/d;->b:[Ljava/lang/Object;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    aget-object v1, v1, v0

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return v0

    :cond_1
    return v1
.end method

.method public final x()I
    .locals 1

    iget-object v0, p0, Lau/d;->a:[Ljava/lang/Object;

    array-length v0, v0

    return v0
.end method

.method public y()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lau/d;->l:Lau/e;

    if-nez v0, :cond_0

    new-instance v0, Lau/e;

    invoke-direct {v0, p0}, Lau/e;-><init>(Lau/d;)V

    iput-object v0, p0, Lau/d;->l:Lau/e;

    :cond_0
    return-object v0
.end method

.method public final z()I
    .locals 1

    iget-object v0, p0, Lau/d;->d:[I

    array-length v0, v0

    return v0
.end method
