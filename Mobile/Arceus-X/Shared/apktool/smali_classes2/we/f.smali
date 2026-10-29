.class public final Lwe/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwe/f$b;
    }
.end annotation


# static fields
.field public static final a:[J

.field public static final b:[J

.field public static final c:[J

.field public static final d:[[Lwe/e$a;

.field public static final e:[Lwe/e$a;

.field public static final f:Ljava/math/BigInteger;

.field public static final g:Ljava/math/BigInteger;

.field public static final h:Ljava/math/BigInteger;

.field public static final i:Ljava/math/BigInteger;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    const-wide/16 v0, 0x2

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v2

    const/16 v3, 0xff

    invoke-virtual {v2, v3}, Ljava/math/BigInteger;->pow(I)Ljava/math/BigInteger;

    move-result-object v2

    const-wide/16 v3, 0x13

    invoke-static {v3, v4}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v2

    sput-object v2, Lwe/f;->f:Ljava/math/BigInteger;

    const-wide/32 v3, -0x1db41

    invoke-static {v3, v4}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v3

    const-wide/32 v4, 0x1db42

    invoke-static {v4, v5}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/math/BigInteger;->modInverse(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v3

    sput-object v3, Lwe/f;->g:Ljava/math/BigInteger;

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v4

    sput-object v4, Lwe/f;->h:Ljava/math/BigInteger;

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    sget-object v1, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    invoke-virtual {v2, v1}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    const-wide/16 v5, 0x4

    invoke-static {v5, v6}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v7

    invoke-virtual {v1, v7}, Ljava/math/BigInteger;->divide(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Ljava/math/BigInteger;->modPow(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    sput-object v0, Lwe/f;->i:Ljava/math/BigInteger;

    new-instance v1, Lwe/f$b;

    const/4 v7, 0x0

    invoke-direct {v1, v7}, Lwe/f$b;-><init>(Lwe/f$a;)V

    invoke-static {v5, v6}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v5

    const-wide/16 v6, 0x5

    invoke-static {v6, v7}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v6

    invoke-virtual {v6, v2}, Ljava/math/BigInteger;->modInverse(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v5

    invoke-virtual {v5, v2}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v2

    invoke-static {v1, v2}, Lwe/f$b;->b(Lwe/f$b;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    invoke-static {v1}, Lwe/f$b;->a(Lwe/f$b;)Ljava/math/BigInteger;

    move-result-object v2

    invoke-static {v2}, Lwe/f;->c(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v2

    invoke-static {v1, v2}, Lwe/f$b;->d(Lwe/f$b;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    invoke-static {v3}, Lwe/f;->d(Ljava/math/BigInteger;)[B

    move-result-object v2

    invoke-static {v2}, Lwe/i;->c([B)[J

    move-result-object v2

    sput-object v2, Lwe/f;->a:[J

    invoke-static {v4}, Lwe/f;->d(Ljava/math/BigInteger;)[B

    move-result-object v2

    invoke-static {v2}, Lwe/i;->c([B)[J

    move-result-object v2

    sput-object v2, Lwe/f;->b:[J

    invoke-static {v0}, Lwe/f;->d(Ljava/math/BigInteger;)[B

    move-result-object v0

    invoke-static {v0}, Lwe/i;->c([B)[J

    move-result-object v0

    sput-object v0, Lwe/f;->c:[J

    const/4 v0, 0x2

    new-array v0, v0, [I

    const/4 v2, 0x1

    const/16 v3, 0x8

    aput v3, v0, v2

    const/4 v2, 0x0

    const/16 v4, 0x20

    aput v4, v0, v2

    const-class v5, Lwe/e$a;

    invoke-static {v5, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [[Lwe/e$a;

    sput-object v0, Lwe/f;->d:[[Lwe/e$a;

    move-object v5, v1

    move v0, v2

    :goto_0
    if-ge v0, v4, :cond_2

    move v6, v2

    move-object v7, v5

    :goto_1
    if-ge v6, v3, :cond_0

    sget-object v8, Lwe/f;->d:[[Lwe/e$a;

    aget-object v8, v8, v0

    invoke-static {v7}, Lwe/f;->b(Lwe/f$b;)Lwe/e$a;

    move-result-object v9

    aput-object v9, v8, v6

    invoke-static {v7, v5}, Lwe/f;->a(Lwe/f$b;Lwe/f$b;)Lwe/f$b;

    move-result-object v7

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_0
    move v6, v2

    :goto_2
    if-ge v6, v3, :cond_1

    invoke-static {v5, v5}, Lwe/f;->a(Lwe/f$b;Lwe/f$b;)Lwe/f$b;

    move-result-object v5

    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    invoke-static {v1, v1}, Lwe/f;->a(Lwe/f$b;Lwe/f$b;)Lwe/f$b;

    move-result-object v0

    new-array v4, v3, [Lwe/e$a;

    sput-object v4, Lwe/f;->e:[Lwe/e$a;

    :goto_3
    if-ge v2, v3, :cond_3

    sget-object v4, Lwe/f;->e:[Lwe/e$a;

    invoke-static {v1}, Lwe/f;->b(Lwe/f$b;)Lwe/e$a;

    move-result-object v5

    aput-object v5, v4, v2

    invoke-static {v1, v0}, Lwe/f;->a(Lwe/f$b;Lwe/f$b;)Lwe/f$b;

    move-result-object v1

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_3
    return-void
.end method

.method public static a(Lwe/f$b;Lwe/f$b;)Lwe/f$b;
    .locals 6

    new-instance v0, Lwe/f$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lwe/f$b;-><init>(Lwe/f$a;)V

    sget-object v1, Lwe/f;->g:Ljava/math/BigInteger;

    invoke-static {p0}, Lwe/f$b;->c(Lwe/f$b;)Ljava/math/BigInteger;

    move-result-object v2

    invoke-static {p1}, Lwe/f$b;->c(Lwe/f$b;)Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v2

    invoke-static {p0}, Lwe/f$b;->a(Lwe/f$b;)Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v2

    invoke-static {p1}, Lwe/f$b;->a(Lwe/f$b;)Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    sget-object v2, Lwe/f;->f:Ljava/math/BigInteger;

    invoke-virtual {v1, v2}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    invoke-static {p0}, Lwe/f$b;->c(Lwe/f$b;)Ljava/math/BigInteger;

    move-result-object v3

    invoke-static {p1}, Lwe/f$b;->a(Lwe/f$b;)Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v3

    invoke-static {p1}, Lwe/f$b;->c(Lwe/f$b;)Ljava/math/BigInteger;

    move-result-object v4

    invoke-static {p0}, Lwe/f$b;->a(Lwe/f$b;)Ljava/math/BigInteger;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v3

    sget-object v4, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    invoke-virtual {v4, v1}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v5

    invoke-virtual {v5, v2}, Ljava/math/BigInteger;->modInverse(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v3

    invoke-static {v0, v3}, Lwe/f$b;->d(Lwe/f$b;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    invoke-static {p0}, Lwe/f$b;->a(Lwe/f$b;)Ljava/math/BigInteger;

    move-result-object v3

    invoke-static {p1}, Lwe/f$b;->a(Lwe/f$b;)Ljava/math/BigInteger;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v3

    invoke-static {p0}, Lwe/f$b;->c(Lwe/f$b;)Ljava/math/BigInteger;

    move-result-object p0

    invoke-static {p1}, Lwe/f$b;->c(Lwe/f$b;)Ljava/math/BigInteger;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p0

    invoke-virtual {v3, p0}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p0

    invoke-virtual {v4, v1}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p1

    invoke-virtual {p1, v2}, Ljava/math/BigInteger;->modInverse(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p0

    invoke-virtual {p0, v2}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p0

    invoke-static {v0, p0}, Lwe/f$b;->b(Lwe/f$b;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    return-object v0
.end method

.method public static b(Lwe/f$b;)Lwe/e$a;
    .locals 6

    new-instance v0, Lwe/e$a;

    invoke-static {p0}, Lwe/f$b;->a(Lwe/f$b;)Ljava/math/BigInteger;

    move-result-object v1

    invoke-static {p0}, Lwe/f$b;->c(Lwe/f$b;)Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    sget-object v2, Lwe/f;->f:Ljava/math/BigInteger;

    invoke-virtual {v1, v2}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    invoke-static {v1}, Lwe/f;->d(Ljava/math/BigInteger;)[B

    move-result-object v1

    invoke-static {v1}, Lwe/i;->c([B)[J

    move-result-object v1

    invoke-static {p0}, Lwe/f$b;->a(Lwe/f$b;)Ljava/math/BigInteger;

    move-result-object v3

    invoke-static {p0}, Lwe/f$b;->c(Lwe/f$b;)Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v3

    invoke-static {v3}, Lwe/f;->d(Ljava/math/BigInteger;)[B

    move-result-object v3

    invoke-static {v3}, Lwe/i;->c([B)[J

    move-result-object v3

    sget-object v4, Lwe/f;->h:Ljava/math/BigInteger;

    invoke-static {p0}, Lwe/f$b;->c(Lwe/f$b;)Ljava/math/BigInteger;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v4

    invoke-static {p0}, Lwe/f$b;->a(Lwe/f$b;)Ljava/math/BigInteger;

    move-result-object p0

    invoke-virtual {v4, p0}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p0

    invoke-virtual {p0, v2}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p0

    invoke-static {p0}, Lwe/f;->d(Ljava/math/BigInteger;)[B

    move-result-object p0

    invoke-static {p0}, Lwe/i;->c([B)[J

    move-result-object p0

    invoke-direct {v0, v1, v3, p0}, Lwe/e$a;-><init>([J[J[J)V

    return-object v0
.end method

.method public static c(Ljava/math/BigInteger;)Ljava/math/BigInteger;
    .locals 5

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Ljava/math/BigInteger;->pow(I)Ljava/math/BigInteger;

    move-result-object v1

    sget-object v2, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    invoke-virtual {v1, v2}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    sget-object v3, Lwe/f;->g:Ljava/math/BigInteger;

    invoke-virtual {p0, v0}, Ljava/math/BigInteger;->pow(I)Ljava/math/BigInteger;

    move-result-object p0

    invoke-virtual {v3, p0}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p0

    invoke-virtual {p0, v2}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p0

    sget-object v2, Lwe/f;->f:Ljava/math/BigInteger;

    invoke-virtual {p0, v2}, Ljava/math/BigInteger;->modInverse(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p0

    const-wide/16 v3, 0x3

    invoke-static {v3, v4}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    const-wide/16 v3, 0x8

    invoke-static {v3, v4}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/math/BigInteger;->divide(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {p0, v1, v2}, Ljava/math/BigInteger;->modPow(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/math/BigInteger;->pow(I)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p0

    invoke-virtual {p0, v2}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p0

    sget-object v0, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    invoke-virtual {p0, v0}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    sget-object p0, Lwe/f;->i:Ljava/math/BigInteger;

    invoke-virtual {v1, p0}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p0

    invoke-virtual {p0, v2}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    :cond_0
    const/4 p0, 0x0

    invoke-virtual {v1, p0}, Ljava/math/BigInteger;->testBit(I)Z

    move-result p0

    if-eqz p0, :cond_1

    invoke-virtual {v2, v1}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p0

    return-object p0

    :cond_1
    return-object v1
.end method

.method public static d(Ljava/math/BigInteger;)[B
    .locals 4

    const/16 v0, 0x20

    new-array v1, v0, [B

    invoke-virtual {p0}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object p0

    array-length v2, p0

    sub-int/2addr v0, v2

    array-length v2, p0

    const/4 v3, 0x0

    invoke-static {p0, v3, v1, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :goto_0
    const/16 p0, 0x10

    if-ge v3, p0, :cond_0

    aget-byte p0, v1, v3

    rsub-int/lit8 v0, v3, 0x1f

    aget-byte v2, v1, v0

    aput-byte v2, v1, v3

    aput-byte p0, v1, v0

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method
