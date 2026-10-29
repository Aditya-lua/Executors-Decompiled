.class public final Lum/p;
.super Lum/t;
.source "SourceFile"


# static fields
.field public static final m:[Ljava/lang/String;


# instance fields
.field public final j:Lxu/f;

.field public k:Ljava/lang/String;

.field public l:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/16 v0, 0x80

    new-array v0, v0, [Ljava/lang/String;

    sput-object v0, Lum/p;->m:[Ljava/lang/String;

    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0x1f

    if-gt v0, v1, :cond_0

    sget-object v1, Lum/p;->m:[Ljava/lang/String;

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
    sget-object v0, Lum/p;->m:[Ljava/lang/String;

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

    return-void
.end method

.method public constructor <init>(Lxu/f;)V
    .locals 1

    invoke-direct {p0}, Lum/t;-><init>()V

    const-string v0, ":"

    iput-object v0, p0, Lum/p;->k:Ljava/lang/String;

    if-eqz p1, :cond_0

    iput-object p1, p0, Lum/p;->j:Lxu/f;

    const/4 p1, 0x6

    invoke-virtual {p0, p1}, Lum/t;->u(I)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "sink == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic Y(Lum/p;)Lxu/f;
    .locals 0

    iget-object p0, p0, Lum/p;->j:Lxu/f;

    return-object p0
.end method

.method public static i0(Lxu/f;Ljava/lang/String;)V
    .locals 7

    sget-object v0, Lum/p;->m:[Ljava/lang/String;

    const/16 v1, 0x22

    invoke-interface {p0, v1}, Lxu/f;->writeByte(I)Lxu/f;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v3, v2, :cond_5

    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v6, 0x80

    if-ge v5, v6, :cond_0

    aget-object v5, v0, v5

    if-nez v5, :cond_2

    goto :goto_2

    :cond_0
    const/16 v6, 0x2028

    if-ne v5, v6, :cond_1

    const-string v5, "\\u2028"

    goto :goto_1

    :cond_1
    const/16 v6, 0x2029

    if-ne v5, v6, :cond_4

    const-string v5, "\\u2029"

    :cond_2
    :goto_1
    if-ge v4, v3, :cond_3

    invoke-interface {p0, p1, v4, v3}, Lxu/f;->K0(Ljava/lang/String;II)Lxu/f;

    :cond_3
    invoke-interface {p0, v5}, Lxu/f;->C0(Ljava/lang/String;)Lxu/f;

    add-int/lit8 v4, v3, 0x1

    :cond_4
    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_5
    if-ge v4, v2, :cond_6

    invoke-interface {p0, p1, v4, v2}, Lxu/f;->K0(Ljava/lang/String;II)Lxu/f;

    :cond_6
    invoke-interface {p0, v1}, Lxu/f;->writeByte(I)Lxu/f;

    return-void
.end method


# virtual methods
.method public F(D)Lum/t;
    .locals 3

    iget-boolean v0, p0, Lum/t;->f:Z

    if-nez v0, :cond_1

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
    iget-boolean v0, p0, Lum/t;->h:Z

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    iput-boolean v0, p0, Lum/t;->h:Z

    invoke-static {p1, p2}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lum/p;->n(Ljava/lang/String;)Lum/t;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-virtual {p0}, Lum/p;->l0()V

    invoke-virtual {p0}, Lum/p;->a0()V

    iget-object v0, p0, Lum/p;->j:Lxu/f;

    invoke-static {p1, p2}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lxu/f;->C0(Ljava/lang/String;)Lxu/f;

    iget-object p1, p0, Lum/t;->d:[I

    iget p2, p0, Lum/t;->a:I

    add-int/lit8 p2, p2, -0x1

    aget v0, p1, p2

    add-int/lit8 v0, v0, 0x1

    aput v0, p1, p2

    return-object p0
.end method

.method public H(J)Lum/t;
    .locals 1

    iget-boolean v0, p0, Lum/t;->h:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lum/t;->h:Z

    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lum/p;->n(Ljava/lang/String;)Lum/t;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0}, Lum/p;->l0()V

    invoke-virtual {p0}, Lum/p;->a0()V

    iget-object v0, p0, Lum/p;->j:Lxu/f;

    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lxu/f;->C0(Ljava/lang/String;)Lxu/f;

    iget-object p1, p0, Lum/t;->d:[I

    iget p2, p0, Lum/t;->a:I

    add-int/lit8 p2, p2, -0x1

    aget v0, p1, p2

    add-int/lit8 v0, v0, 0x1

    aput v0, p1, p2

    return-object p0
.end method

.method public I(Ljava/lang/Boolean;)Lum/t;
    .locals 0

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lum/p;->o()Lum/t;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p0, p1}, Lum/p;->U(Z)Lum/t;

    move-result-object p1

    return-object p1
.end method

.method public L(Ljava/lang/Number;)Lum/t;
    .locals 3

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lum/p;->o()Lum/t;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-boolean v1, p0, Lum/t;->f:Z

    if-nez v1, :cond_2

    const-string v1, "-Infinity"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "Infinity"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "NaN"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Numeric values must be finite, but was "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    iget-boolean p1, p0, Lum/t;->h:Z

    if-eqz p1, :cond_3

    const/4 p1, 0x0

    iput-boolean p1, p0, Lum/t;->h:Z

    invoke-virtual {p0, v0}, Lum/p;->n(Ljava/lang/String;)Lum/t;

    move-result-object p1

    return-object p1

    :cond_3
    invoke-virtual {p0}, Lum/p;->l0()V

    invoke-virtual {p0}, Lum/p;->a0()V

    iget-object p1, p0, Lum/p;->j:Lxu/f;

    invoke-interface {p1, v0}, Lxu/f;->C0(Ljava/lang/String;)Lxu/f;

    iget-object p1, p0, Lum/t;->d:[I

    iget v0, p0, Lum/t;->a:I

    add-int/lit8 v0, v0, -0x1

    aget v1, p1, v0

    add-int/lit8 v1, v1, 0x1

    aput v1, p1, v0

    return-object p0
.end method

.method public M(Ljava/lang/String;)Lum/t;
    .locals 2

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lum/p;->o()Lum/t;

    move-result-object p1

    return-object p1

    :cond_0
    iget-boolean v0, p0, Lum/t;->h:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lum/t;->h:Z

    invoke-virtual {p0, p1}, Lum/p;->n(Ljava/lang/String;)Lum/t;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {p0}, Lum/p;->l0()V

    invoke-virtual {p0}, Lum/p;->a0()V

    iget-object v0, p0, Lum/p;->j:Lxu/f;

    invoke-static {v0, p1}, Lum/p;->i0(Lxu/f;Ljava/lang/String;)V

    iget-object p1, p0, Lum/t;->d:[I

    iget v0, p0, Lum/t;->a:I

    add-int/lit8 v0, v0, -0x1

    aget v1, p1, v0

    add-int/lit8 v1, v1, 0x1

    aput v1, p1, v0

    return-object p0
.end method

.method public U(Z)Lum/t;
    .locals 2

    iget-boolean v0, p0, Lum/t;->h:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lum/p;->l0()V

    invoke-virtual {p0}, Lum/p;->a0()V

    iget-object v0, p0, Lum/p;->j:Lxu/f;

    if-eqz p1, :cond_0

    const-string p1, "true"

    goto :goto_0

    :cond_0
    const-string p1, "false"

    :goto_0
    invoke-interface {v0, p1}, Lxu/f;->C0(Ljava/lang/String;)Lxu/f;

    iget-object p1, p0, Lum/t;->d:[I

    iget v0, p0, Lum/t;->a:I

    add-int/lit8 v0, v0, -0x1

    aget v1, p1, v0

    add-int/lit8 v1, v1, 0x1

    aput v1, p1, v0

    return-object p0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Boolean cannot be used as a map key in JSON at path "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lum/t;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public X()Lxu/f;
    .locals 3

    iget-boolean v0, p0, Lum/t;->h:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lum/p;->l0()V

    invoke-virtual {p0}, Lum/p;->a0()V

    const/16 v0, 0x9

    invoke-virtual {p0, v0}, Lum/t;->u(I)V

    new-instance v0, Lum/p$a;

    invoke-direct {v0, p0}, Lum/p$a;-><init>(Lum/p;)V

    invoke-static {v0}, Lxu/b0;->b(Lxu/p0;)Lxu/f;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "BufferedSink cannot be used as a map key in JSON at path "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lum/t;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final Z()V
    .locals 2

    invoke-virtual {p0}, Lum/t;->r()I

    move-result v0

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lum/p;->j:Lxu/f;

    const/16 v1, 0x2c

    invoke-interface {v0, v1}, Lxu/f;->writeByte(I)Lxu/f;

    goto :goto_0

    :cond_0
    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    :goto_0
    invoke-virtual {p0}, Lum/p;->e0()V

    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lum/t;->v(I)V

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Nesting problem."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public a()Lum/t;
    .locals 3

    iget-boolean v0, p0, Lum/t;->h:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lum/p;->l0()V

    const/4 v0, 0x2

    const/16 v1, 0x5b

    const/4 v2, 0x1

    invoke-virtual {p0, v2, v0, v1}, Lum/p;->f0(IIC)Lum/t;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Array cannot be used as a map key in JSON at path "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lum/t;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final a0()V
    .locals 3

    invoke-virtual {p0}, Lum/t;->r()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x2

    if-eq v0, v1, :cond_5

    if-eq v0, v2, :cond_4

    const/4 v1, 0x4

    if-eq v0, v1, :cond_3

    const/16 v1, 0x9

    if-eq v0, v1, :cond_2

    const/4 v1, 0x6

    const/4 v2, 0x7

    if-eq v0, v1, :cond_6

    if-ne v0, v2, :cond_1

    iget-boolean v0, p0, Lum/t;->f:Z

    if-eqz v0, :cond_0

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
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Sink from valueSink() was not closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    iget-object v0, p0, Lum/p;->j:Lxu/f;

    iget-object v1, p0, Lum/p;->k:Ljava/lang/String;

    invoke-interface {v0, v1}, Lxu/f;->C0(Ljava/lang/String;)Lxu/f;

    const/4 v2, 0x5

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lum/p;->j:Lxu/f;

    const/16 v1, 0x2c

    invoke-interface {v0, v1}, Lxu/f;->writeByte(I)Lxu/f;

    :cond_5
    invoke-virtual {p0}, Lum/p;->e0()V

    :cond_6
    :goto_0
    invoke-virtual {p0, v2}, Lum/t;->v(I)V

    return-void
.end method

.method public final b0(IIC)Lum/t;
    .locals 4

    invoke-virtual {p0}, Lum/t;->r()I

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
    iget-object p1, p0, Lum/p;->l:Ljava/lang/String;

    if-nez p1, :cond_4

    iget p1, p0, Lum/t;->a:I

    iget v1, p0, Lum/t;->i:I

    not-int v2, v1

    if-ne p1, v2, :cond_2

    not-int p1, v1

    iput p1, p0, Lum/t;->i:I

    return-object p0

    :cond_2
    add-int/lit8 v1, p1, -0x1

    iput v1, p0, Lum/t;->a:I

    iget-object v2, p0, Lum/t;->c:[Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v3, v2, v1

    iget-object v1, p0, Lum/t;->d:[I

    add-int/lit8 p1, p1, -0x2

    aget v2, v1, p1

    add-int/lit8 v2, v2, 0x1

    aput v2, v1, p1

    if-ne v0, p2, :cond_3

    invoke-virtual {p0}, Lum/p;->e0()V

    :cond_3
    iget-object p1, p0, Lum/p;->j:Lxu/f;

    invoke-interface {p1, p3}, Lxu/f;->writeByte(I)Lxu/f;

    return-object p0

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Dangling name: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, p0, Lum/p;->l:Ljava/lang/String;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public c()Lum/t;
    .locals 3

    iget-boolean v0, p0, Lum/t;->h:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lum/p;->l0()V

    const/4 v0, 0x5

    const/16 v1, 0x7b

    const/4 v2, 0x3

    invoke-virtual {p0, v2, v0, v1}, Lum/p;->f0(IIC)Lum/t;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Object cannot be used as a map key in JSON at path "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lum/t;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public close()V
    .locals 3

    iget-object v0, p0, Lum/p;->j:Lxu/f;

    invoke-interface {v0}, Lxu/p0;->close()V

    iget v0, p0, Lum/t;->a:I

    const/4 v1, 0x1

    if-gt v0, v1, :cond_1

    if-ne v0, v1, :cond_0

    iget-object v2, p0, Lum/t;->b:[I

    sub-int/2addr v0, v1

    aget v0, v2, v0

    const/4 v1, 0x7

    if-ne v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lum/t;->a:I

    return-void

    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Incomplete document"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public e()Lum/t;
    .locals 3

    const/4 v0, 0x2

    const/16 v1, 0x5d

    const/4 v2, 0x1

    invoke-virtual {p0, v2, v0, v1}, Lum/p;->b0(IIC)Lum/t;

    move-result-object v0

    return-object v0
.end method

.method public final e0()V
    .locals 4

    iget-object v0, p0, Lum/t;->e:Ljava/lang/String;

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lum/p;->j:Lxu/f;

    const/16 v1, 0xa

    invoke-interface {v0, v1}, Lxu/f;->writeByte(I)Lxu/f;

    iget v0, p0, Lum/t;->a:I

    const/4 v1, 0x1

    :goto_0
    if-ge v1, v0, :cond_1

    iget-object v2, p0, Lum/p;->j:Lxu/f;

    iget-object v3, p0, Lum/t;->e:Ljava/lang/String;

    invoke-interface {v2, v3}, Lxu/f;->C0(Ljava/lang/String;)Lxu/f;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public final f0(IIC)Lum/t;
    .locals 4

    iget v0, p0, Lum/t;->a:I

    iget v1, p0, Lum/t;->i:I

    if-ne v0, v1, :cond_1

    iget-object v2, p0, Lum/t;->b:[I

    add-int/lit8 v3, v0, -0x1

    aget v3, v2, v3

    if-eq v3, p1, :cond_0

    add-int/lit8 v0, v0, -0x1

    aget v0, v2, v0

    if-ne v0, p2, :cond_1

    :cond_0
    not-int p1, v1

    iput p1, p0, Lum/t;->i:I

    return-object p0

    :cond_1
    invoke-virtual {p0}, Lum/p;->a0()V

    invoke-virtual {p0}, Lum/t;->d()Z

    invoke-virtual {p0, p1}, Lum/t;->u(I)V

    iget-object p1, p0, Lum/t;->d:[I

    iget p2, p0, Lum/t;->a:I

    add-int/lit8 p2, p2, -0x1

    const/4 v0, 0x0

    aput v0, p1, p2

    iget-object p1, p0, Lum/p;->j:Lxu/f;

    invoke-interface {p1, p3}, Lxu/f;->writeByte(I)Lxu/f;

    return-object p0
.end method

.method public flush()V
    .locals 2

    iget v0, p0, Lum/t;->a:I

    if-eqz v0, :cond_0

    iget-object v0, p0, Lum/p;->j:Lxu/f;

    invoke-interface {v0}, Lxu/f;->flush()V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "JsonWriter is closed."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public g()Lum/t;
    .locals 3

    const/4 v0, 0x0

    iput-boolean v0, p0, Lum/t;->h:Z

    const/4 v0, 0x5

    const/16 v1, 0x7d

    const/4 v2, 0x3

    invoke-virtual {p0, v2, v0, v1}, Lum/p;->b0(IIC)Lum/t;

    move-result-object v0

    return-object v0
.end method

.method public final l0()V
    .locals 2

    iget-object v0, p0, Lum/p;->l:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lum/p;->Z()V

    iget-object v0, p0, Lum/p;->j:Lxu/f;

    iget-object v1, p0, Lum/p;->l:Ljava/lang/String;

    invoke-static {v0, v1}, Lum/p;->i0(Lxu/f;Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lum/p;->l:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public n(Ljava/lang/String;)Lum/t;
    .locals 2

    if-eqz p1, :cond_3

    iget v0, p0, Lum/t;->a:I

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lum/t;->r()I

    move-result v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    const/4 v1, 0x5

    if-ne v0, v1, :cond_1

    :cond_0
    iget-object v0, p0, Lum/p;->l:Ljava/lang/String;

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lum/t;->h:Z

    if-nez v0, :cond_1

    iput-object p1, p0, Lum/p;->l:Ljava/lang/String;

    iget-object v0, p0, Lum/t;->c:[Ljava/lang/String;

    iget v1, p0, Lum/t;->a:I

    add-int/lit8 v1, v1, -0x1

    aput-object p1, v0, v1

    return-object p0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Nesting problem."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "JsonWriter is closed."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "name == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public o()Lum/t;
    .locals 3

    iget-boolean v0, p0, Lum/t;->h:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lum/p;->l:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lum/t;->g:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lum/p;->l0()V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lum/p;->l:Ljava/lang/String;

    return-object p0

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lum/p;->a0()V

    iget-object v0, p0, Lum/p;->j:Lxu/f;

    const-string v1, "null"

    invoke-interface {v0, v1}, Lxu/f;->C0(Ljava/lang/String;)Lxu/f;

    iget-object v0, p0, Lum/t;->d:[I

    iget v1, p0, Lum/t;->a:I

    add-int/lit8 v1, v1, -0x1

    aget v2, v0, v1

    add-int/lit8 v2, v2, 0x1

    aput v2, v0, v1

    return-object p0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "null cannot be used as a map key in JSON at path "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lum/t;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public w(Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1}, Lum/t;->w(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    const-string p1, ": "

    goto :goto_0

    :cond_0
    const-string p1, ":"

    :goto_0
    iput-object p1, p0, Lum/p;->k:Ljava/lang/String;

    return-void
.end method
