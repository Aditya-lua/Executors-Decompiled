.class public abstract Lcom/google/crypto/tink/shaded/protobuf/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/crypto/tink/shaded/protobuf/i$c;,
        Lcom/google/crypto/tink/shaded/protobuf/i$b;
    }
.end annotation


# static fields
.field public static volatile f:I = 0x64


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:Lcom/google/crypto/tink/shaded/protobuf/j;

.field public e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    sget v0, Lcom/google/crypto/tink/shaded/protobuf/i;->f:I

    iput v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    const v0, 0x7fffffff

    .line 4
    iput v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->c:I

    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->e:Z

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/crypto/tink/shaded/protobuf/i$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/i;-><init>()V

    return-void
.end method

.method public static c(I)I
    .locals 1

    ushr-int/lit8 v0, p0, 0x1

    and-int/lit8 p0, p0, 0x1

    neg-int p0, p0

    xor-int/2addr p0, v0

    return p0
.end method

.method public static d(J)J
    .locals 4

    const/4 v0, 0x1

    ushr-long v0, p0, v0

    const-wide/16 v2, 0x1

    and-long/2addr p0, v2

    neg-long p0, p0

    xor-long/2addr p0, v0

    return-wide p0
.end method

.method public static g(Ljava/io/InputStream;)Lcom/google/crypto/tink/shaded/protobuf/i;
    .locals 1

    const/16 v0, 0x1000

    invoke-static {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/i;->h(Ljava/io/InputStream;I)Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object p0

    return-object p0
.end method

.method public static h(Ljava/io/InputStream;I)Lcom/google/crypto/tink/shaded/protobuf/i;
    .locals 2

    if-lez p1, :cond_1

    if-nez p0, :cond_0

    sget-object p0, Lcom/google/crypto/tink/shaded/protobuf/a0;->d:[B

    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/i;->i([B)Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/i$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/i$c;-><init>(Ljava/io/InputStream;ILcom/google/crypto/tink/shaded/protobuf/i$a;)V

    return-object v0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "bufferSize must be > 0"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static i([B)Lcom/google/crypto/tink/shaded/protobuf/i;
    .locals 2

    const/4 v0, 0x0

    array-length v1, p0

    invoke-static {p0, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/i;->j([BII)Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object p0

    return-object p0
.end method

.method public static j([BII)Lcom/google/crypto/tink/shaded/protobuf/i;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0}, Lcom/google/crypto/tink/shaded/protobuf/i;->k([BIIZ)Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object p0

    return-object p0
.end method

.method public static k([BIIZ)Lcom/google/crypto/tink/shaded/protobuf/i;
    .locals 6

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/i$b;

    const/4 v5, 0x0

    move-object v1, p0

    move v2, p1

    move v3, p2

    move v4, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/crypto/tink/shaded/protobuf/i$b;-><init>([BIIZLcom/google/crypto/tink/shaded/protobuf/i$a;)V

    :try_start_0
    invoke-virtual {v0, v3}, Lcom/google/crypto/tink/shaded/protobuf/i$b;->m(I)I
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/b0; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    move-object p0, v0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method


# virtual methods
.method public abstract A()Ljava/lang/String;
.end method

.method public abstract B()Ljava/lang/String;
.end method

.method public abstract C()I
.end method

.method public abstract D()I
.end method

.method public abstract E()J
.end method

.method public abstract F(I)Z
.end method

.method public G()V
    .locals 2

    :cond_0
    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/i;->C()I

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/i;->b()V

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:I

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/i;->F(I)Z

    move-result v0

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:I

    if-nez v0, :cond_0

    :goto_0
    return-void
.end method

.method public abstract a(I)V
.end method

.method public b()V
    .locals 2

    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->a:I

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->b:I

    if-ge v0, v1, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/b0;->i()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object v0

    throw v0
.end method

.method public abstract e()I
.end method

.method public abstract f()Z
.end method

.method public abstract l(I)V
.end method

.method public abstract m(I)I
.end method

.method public abstract n()Z
.end method

.method public abstract o()Lcom/google/crypto/tink/shaded/protobuf/h;
.end method

.method public abstract p()D
.end method

.method public abstract q()I
.end method

.method public abstract r()I
.end method

.method public abstract s()J
.end method

.method public abstract t()F
.end method

.method public abstract u()I
.end method

.method public abstract v()J
.end method

.method public abstract w()I
.end method

.method public abstract x()J
.end method

.method public abstract y()I
.end method

.method public abstract z()J
.end method
