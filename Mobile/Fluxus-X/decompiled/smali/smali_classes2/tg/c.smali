.class public Ltg/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;
.implements Ljava/io/Flushable;


# static fields
.field public static final l:Ljava/util/regex/Pattern;

.field public static final m:[Ljava/lang/String;

.field public static final n:[Ljava/lang/String;


# instance fields
.field public final a:Ljava/io/Writer;

.field public b:[I

.field public c:I

.field public d:Llg/e;

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:Z

.field public h:Llg/x;

.field public i:Z

.field public j:Ljava/lang/String;

.field public k:Z


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const-string v0, "-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ltg/c;->l:Ljava/util/regex/Pattern;

    const/16 v0, 0x80

    new-array v0, v0, [Ljava/lang/String;

    sput-object v0, Ltg/c;->m:[Ljava/lang/String;

    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0x1f

    if-gt v0, v1, :cond_0

    sget-object v1, Ltg/c;->m:[Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    const-string v3, "\\u%04x"

    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    sget-object v0, Ltg/c;->m:[Ljava/lang/String;

    const/16 v1, 0x22

    const-string v2, "\\\""

    aput-object v2, v0, v1

    const/16 v1, 0x5c

    const-string v2, "\\\\"

    aput-object v2, v0, v1

    const/16 v1, 0x9

    const-string v2, "\\t"

    aput-object v2, v0, v1

    const/16 v1, 0x8

    const-string v2, "\\b"

    aput-object v2, v0, v1

    const/16 v1, 0xa

    const-string v2, "\\n"

    aput-object v2, v0, v1

    const/16 v1, 0xd

    const-string v2, "\\r"

    aput-object v2, v0, v1

    const/16 v1, 0xc

    const-string v2, "\\f"

    aput-object v2, v0, v1

    invoke-virtual {v0}, [Ljava/lang/String;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    sput-object v0, Ltg/c;->n:[Ljava/lang/String;

    const/16 v1, 0x3c

    const-string v2, "\\u003c"

    aput-object v2, v0, v1

    const/16 v1, 0x3e

    const-string v2, "\\u003e"

    aput-object v2, v0, v1

    const/16 v1, 0x26

    const-string v2, "\\u0026"

    aput-object v2, v0, v1

    const/16 v1, 0x3d

    const-string v2, "\\u003d"

    aput-object v2, v0, v1

    const/16 v1, 0x27

    const-string v2, "\\u0027"

    aput-object v2, v0, v1

    return-void
.end method

.method public constructor <init>(Ljava/io/Writer;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x20

    new-array v0, v0, [I

    iput-object v0, p0, Ltg/c;->b:[I

    const/4 v0, 0x0

    iput v0, p0, Ltg/c;->c:I

    const/4 v0, 0x6

    invoke-virtual {p0, v0}, Ltg/c;->y(I)V

    sget-object v0, Llg/x;->b:Llg/x;

    iput-object v0, p0, Ltg/c;->h:Llg/x;

    const/4 v0, 0x1

    iput-boolean v0, p0, Ltg/c;->k:Z

    const-string v0, "out == null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Ltg/c;->a:Ljava/io/Writer;

    sget-object p1, Llg/e;->d:Llg/e;

    invoke-virtual {p0, p1}, Ltg/c;->A(Llg/e;)V

    return-void
.end method

.method public static a(Ljava/lang/Class;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Ljava/lang/Number;",
            ">;)Z"
        }
    .end annotation

    const-class v0, Ljava/lang/Integer;

    if-eq p0, v0, :cond_1

    const-class v0, Ljava/lang/Long;

    if-eq p0, v0, :cond_1

    const-class v0, Ljava/lang/Byte;

    if-eq p0, v0, :cond_1

    const-class v0, Ljava/lang/Short;

    if-eq p0, v0, :cond_1

    const-class v0, Ljava/math/BigDecimal;

    if-eq p0, v0, :cond_1

    const-class v0, Ljava/math/BigInteger;

    if-eq p0, v0, :cond_1

    const-class v0, Ljava/util/concurrent/atomic/AtomicInteger;

    if-eq p0, v0, :cond_1

    const-class v0, Ljava/util/concurrent/atomic/AtomicLong;

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public final A(Llg/e;)V
    .locals 1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Ltg/c;->d:Llg/e;

    const-string v0, ","

    iput-object v0, p0, Ltg/c;->f:Ljava/lang/String;

    invoke-virtual {p1}, Llg/e;->c()Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, ": "

    iput-object p1, p0, Ltg/c;->e:Ljava/lang/String;

    iget-object p1, p0, Ltg/c;->d:Llg/e;

    invoke-virtual {p1}, Llg/e;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, ", "

    iput-object p1, p0, Ltg/c;->f:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-string p1, ":"

    iput-object p1, p0, Ltg/c;->e:Ljava/lang/String;

    :cond_1
    :goto_0
    iget-object p1, p0, Ltg/c;->d:Llg/e;

    invoke-virtual {p1}, Llg/e;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Ltg/c;->d:Llg/e;

    invoke-virtual {p1}, Llg/e;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    iput-boolean p1, p0, Ltg/c;->g:Z

    return-void
.end method

.method public final E(Z)V
    .locals 0

    iput-boolean p1, p0, Ltg/c;->i:Z

    return-void
.end method

.method public final I(Z)V
    .locals 0

    iput-boolean p1, p0, Ltg/c;->k:Z

    return-void
.end method

.method public final K(Llg/x;)V
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Ltg/c;->h:Llg/x;

    return-void
.end method

.method public final L(Ljava/lang/String;)V
    .locals 8

    iget-boolean v0, p0, Ltg/c;->i:Z

    if-eqz v0, :cond_0

    sget-object v0, Ltg/c;->n:[Ljava/lang/String;

    goto :goto_0

    :cond_0
    sget-object v0, Ltg/c;->m:[Ljava/lang/String;

    :goto_0
    iget-object v1, p0, Ltg/c;->a:Ljava/io/Writer;

    const/16 v2, 0x22

    invoke-virtual {v1, v2}, Ljava/io/Writer;->write(I)V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v3, 0x0

    move v4, v3

    :goto_1
    if-ge v3, v1, :cond_6

    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v6, 0x80

    if-ge v5, v6, :cond_1

    aget-object v5, v0, v5

    if-nez v5, :cond_3

    goto :goto_3

    :cond_1
    const/16 v6, 0x2028

    if-ne v5, v6, :cond_2

    const-string v5, "\\u2028"

    goto :goto_2

    :cond_2
    const/16 v6, 0x2029

    if-ne v5, v6, :cond_5

    const-string v5, "\\u2029"

    :cond_3
    :goto_2
    if-ge v4, v3, :cond_4

    iget-object v6, p0, Ltg/c;->a:Ljava/io/Writer;

    sub-int v7, v3, v4

    invoke-virtual {v6, p1, v4, v7}, Ljava/io/Writer;->write(Ljava/lang/String;II)V

    :cond_4
    iget-object v4, p0, Ltg/c;->a:Ljava/io/Writer;

    invoke-virtual {v4, v5}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    add-int/lit8 v4, v3, 0x1

    :cond_5
    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_6
    if-ge v4, v1, :cond_7

    iget-object v0, p0, Ltg/c;->a:Ljava/io/Writer;

    sub-int/2addr v1, v4

    invoke-virtual {v0, p1, v4, v1}, Ljava/io/Writer;->write(Ljava/lang/String;II)V

    :cond_7
    iget-object p1, p0, Ltg/c;->a:Ljava/io/Writer;

    invoke-virtual {p1, v2}, Ljava/io/Writer;->write(I)V

    return-void
.end method

.method public N(D)Ltg/c;
    .locals 3

    invoke-virtual {p0}, Ltg/c;->c0()V

    iget-object v0, p0, Ltg/c;->h:Llg/x;

    sget-object v1, Llg/x;->a:Llg/x;

    if-eq v0, v1, :cond_1

    invoke-static {p1, p2}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1, p2}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Numeric values must be finite, but was "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    invoke-virtual {p0}, Ltg/c;->c()V

    iget-object v0, p0, Ltg/c;->a:Ljava/io/Writer;

    invoke-static {p1, p2}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    return-object p0
.end method

.method public O(J)Ltg/c;
    .locals 1

    invoke-virtual {p0}, Ltg/c;->c0()V

    invoke-virtual {p0}, Ltg/c;->c()V

    iget-object v0, p0, Ltg/c;->a:Ljava/io/Writer;

    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    return-object p0
.end method

.method public Q(Ljava/lang/Boolean;)Ltg/c;
    .locals 1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Ltg/c;->s()Ltg/c;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0}, Ltg/c;->c0()V

    invoke-virtual {p0}, Ltg/c;->c()V

    iget-object v0, p0, Ltg/c;->a:Ljava/io/Writer;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "true"

    goto :goto_0

    :cond_1
    const-string p1, "false"

    :goto_0
    invoke-virtual {v0, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    return-object p0
.end method

.method public T(Ljava/lang/Number;)Ltg/c;
    .locals 4

    if-nez p1, :cond_0

    invoke-virtual {p0}, Ltg/c;->s()Ltg/c;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0}, Ltg/c;->c0()V

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1}, Ltg/c;->a(Ljava/lang/Class;)Z

    move-result v1

    if-nez v1, :cond_5

    const-string v1, "-Infinity"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, "Infinity"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, "NaN"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    const-class v1, Ljava/lang/Float;

    if-eq p1, v1, :cond_5

    const-class v1, Ljava/lang/Double;

    if-eq p1, v1, :cond_5

    sget-object v1, Ltg/c;->l:Ljava/util/regex/Pattern;

    invoke-virtual {v1, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "String created by "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is not a valid JSON number: "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    :goto_0
    iget-object p1, p0, Ltg/c;->h:Llg/x;

    sget-object v1, Llg/x;->a:Llg/x;

    if-ne p1, v1, :cond_4

    goto :goto_1

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Numeric values must be finite, but was "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    :goto_1
    invoke-virtual {p0}, Ltg/c;->c()V

    iget-object p1, p0, Ltg/c;->a:Ljava/io/Writer;

    invoke-virtual {p1, v0}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    return-object p0
.end method

.method public Y(Ljava/lang/String;)Ltg/c;
    .locals 0

    if-nez p1, :cond_0

    invoke-virtual {p0}, Ltg/c;->s()Ltg/c;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0}, Ltg/c;->c0()V

    invoke-virtual {p0}, Ltg/c;->c()V

    invoke-virtual {p0, p1}, Ltg/c;->L(Ljava/lang/String;)V

    return-object p0
.end method

.method public final b()V
    .locals 2

    invoke-virtual {p0}, Ltg/c;->w()I

    move-result v0

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ltg/c;->a:Ljava/io/Writer;

    iget-object v1, p0, Ltg/c;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    :goto_0
    invoke-virtual {p0}, Ltg/c;->r()V

    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Ltg/c;->z(I)V

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Nesting problem."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b0(Z)Ltg/c;
    .locals 1

    invoke-virtual {p0}, Ltg/c;->c0()V

    invoke-virtual {p0}, Ltg/c;->c()V

    iget-object v0, p0, Ltg/c;->a:Ljava/io/Writer;

    if-eqz p1, :cond_0

    const-string p1, "true"

    goto :goto_0

    :cond_0
    const-string p1, "false"

    :goto_0
    invoke-virtual {v0, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    return-object p0
.end method

.method public final c()V
    .locals 3

    invoke-virtual {p0}, Ltg/c;->w()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x2

    if-eq v0, v1, :cond_5

    if-eq v0, v2, :cond_4

    const/4 v1, 0x4

    if-eq v0, v1, :cond_3

    const/4 v1, 0x6

    const/4 v2, 0x7

    if-eq v0, v1, :cond_2

    if-ne v0, v2, :cond_1

    iget-object v0, p0, Ltg/c;->h:Llg/x;

    sget-object v1, Llg/x;->a:Llg/x;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "JSON must have only one top-level value."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Nesting problem."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    invoke-virtual {p0, v2}, Ltg/c;->z(I)V

    return-void

    :cond_3
    iget-object v0, p0, Ltg/c;->a:Ljava/io/Writer;

    iget-object v1, p0, Ltg/c;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    const/4 v0, 0x5

    invoke-virtual {p0, v0}, Ltg/c;->z(I)V

    return-void

    :cond_4
    iget-object v0, p0, Ltg/c;->a:Ljava/io/Writer;

    iget-object v1, p0, Ltg/c;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    invoke-virtual {p0}, Ltg/c;->r()V

    return-void

    :cond_5
    invoke-virtual {p0, v2}, Ltg/c;->z(I)V

    invoke-virtual {p0}, Ltg/c;->r()V

    return-void
.end method

.method public final c0()V
    .locals 1

    iget-object v0, p0, Ltg/c;->j:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ltg/c;->b()V

    iget-object v0, p0, Ltg/c;->j:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ltg/c;->L(Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-object v0, p0, Ltg/c;->j:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public close()V
    .locals 3

    iget-object v0, p0, Ltg/c;->a:Ljava/io/Writer;

    invoke-virtual {v0}, Ljava/io/Writer;->close()V

    iget v0, p0, Ltg/c;->c:I

    const/4 v1, 0x1

    if-gt v0, v1, :cond_1

    if-ne v0, v1, :cond_0

    iget-object v2, p0, Ltg/c;->b:[I

    sub-int/2addr v0, v1

    aget v0, v2, v0

    const/4 v1, 0x7

    if-ne v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Ltg/c;->c:I

    return-void

    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Incomplete document"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public d()Ltg/c;
    .locals 2

    invoke-virtual {p0}, Ltg/c;->c0()V

    const/4 v0, 0x1

    const/16 v1, 0x5b

    invoke-virtual {p0, v0, v1}, Ltg/c;->u(IC)Ltg/c;

    move-result-object v0

    return-object v0
.end method

.method public e()Ltg/c;
    .locals 2

    invoke-virtual {p0}, Ltg/c;->c0()V

    const/4 v0, 0x3

    const/16 v1, 0x7b

    invoke-virtual {p0, v0, v1}, Ltg/c;->u(IC)Ltg/c;

    move-result-object v0

    return-object v0
.end method

.method public final f(IIC)Ltg/c;
    .locals 1

    invoke-virtual {p0}, Ltg/c;->w()I

    move-result v0

    if-eq v0, p2, :cond_1

    if-ne v0, p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Nesting problem."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iget-object p1, p0, Ltg/c;->j:Ljava/lang/String;

    if-nez p1, :cond_3

    iget p1, p0, Ltg/c;->c:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Ltg/c;->c:I

    if-ne v0, p2, :cond_2

    invoke-virtual {p0}, Ltg/c;->r()V

    :cond_2
    iget-object p1, p0, Ltg/c;->a:Ljava/io/Writer;

    invoke-virtual {p1, p3}, Ljava/io/Writer;->write(I)V

    return-object p0

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Dangling name: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, p0, Ltg/c;->j:Ljava/lang/String;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public flush()V
    .locals 2

    iget v0, p0, Ltg/c;->c:I

    if-eqz v0, :cond_0

    iget-object v0, p0, Ltg/c;->a:Ljava/io/Writer;

    invoke-virtual {v0}, Ljava/io/Writer;->flush()V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "JsonWriter is closed."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public g()Ltg/c;
    .locals 3

    const/4 v0, 0x2

    const/16 v1, 0x5d

    const/4 v2, 0x1

    invoke-virtual {p0, v2, v0, v1}, Ltg/c;->f(IIC)Ltg/c;

    move-result-object v0

    return-object v0
.end method

.method public h()Ltg/c;
    .locals 3

    const/4 v0, 0x5

    const/16 v1, 0x7d

    const/4 v2, 0x3

    invoke-virtual {p0, v2, v0, v1}, Ltg/c;->f(IIC)Ltg/c;

    move-result-object v0

    return-object v0
.end method

.method public final k()Z
    .locals 1

    iget-boolean v0, p0, Ltg/c;->k:Z

    return v0
.end method

.method public final m()Llg/x;
    .locals 1

    iget-object v0, p0, Ltg/c;->h:Llg/x;

    return-object v0
.end method

.method public final n()Z
    .locals 1

    iget-boolean v0, p0, Ltg/c;->i:Z

    return v0
.end method

.method public o()Z
    .locals 2

    iget-object v0, p0, Ltg/c;->h:Llg/x;

    sget-object v1, Llg/x;->a:Llg/x;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public p(Ljava/lang/String;)Ltg/c;
    .locals 2

    const-string v0, "name == null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iget-object v0, p0, Ltg/c;->j:Ljava/lang/String;

    if-nez v0, :cond_2

    invoke-virtual {p0}, Ltg/c;->w()I

    move-result v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Please begin an object before writing a name."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iput-object p1, p0, Ltg/c;->j:Ljava/lang/String;

    return-object p0

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Already wrote a name, expecting a value."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final r()V
    .locals 4

    iget-boolean v0, p0, Ltg/c;->g:Z

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Ltg/c;->a:Ljava/io/Writer;

    iget-object v1, p0, Ltg/c;->d:Llg/e;

    invoke-virtual {v1}, Llg/e;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    iget v0, p0, Ltg/c;->c:I

    const/4 v1, 0x1

    :goto_0
    if-ge v1, v0, :cond_1

    iget-object v2, p0, Ltg/c;->a:Ljava/io/Writer;

    iget-object v3, p0, Ltg/c;->d:Llg/e;

    invoke-virtual {v3}, Llg/e;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public s()Ltg/c;
    .locals 2

    iget-object v0, p0, Ltg/c;->j:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Ltg/c;->k:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ltg/c;->c0()V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Ltg/c;->j:Ljava/lang/String;

    return-object p0

    :cond_1
    :goto_0
    invoke-virtual {p0}, Ltg/c;->c()V

    iget-object v0, p0, Ltg/c;->a:Ljava/io/Writer;

    const-string v1, "null"

    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    return-object p0
.end method

.method public final u(IC)Ltg/c;
    .locals 0

    invoke-virtual {p0}, Ltg/c;->c()V

    invoke-virtual {p0, p1}, Ltg/c;->y(I)V

    iget-object p1, p0, Ltg/c;->a:Ljava/io/Writer;

    invoke-virtual {p1, p2}, Ljava/io/Writer;->write(I)V

    return-object p0
.end method

.method public final w()I
    .locals 2

    iget v0, p0, Ltg/c;->c:I

    if-eqz v0, :cond_0

    iget-object v1, p0, Ltg/c;->b:[I

    add-int/lit8 v0, v0, -0x1

    aget v0, v1, v0

    return v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "JsonWriter is closed."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final y(I)V
    .locals 3

    iget v0, p0, Ltg/c;->c:I

    iget-object v1, p0, Ltg/c;->b:[I

    array-length v2, v1

    if-ne v0, v2, :cond_0

    mul-int/lit8 v0, v0, 0x2

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    iput-object v0, p0, Ltg/c;->b:[I

    :cond_0
    iget-object v0, p0, Ltg/c;->b:[I

    iget v1, p0, Ltg/c;->c:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ltg/c;->c:I

    aput p1, v0, v1

    return-void
.end method

.method public final z(I)V
    .locals 2

    iget-object v0, p0, Ltg/c;->b:[I

    iget v1, p0, Ltg/c;->c:I

    add-int/lit8 v1, v1, -0x1

    aput p1, v0, v1

    return-void
.end method
