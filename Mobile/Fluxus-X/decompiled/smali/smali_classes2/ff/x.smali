.class public final Lff/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lre/z;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lff/x$b;
    }
.end annotation


# static fields
.field public static final a:Lwe/b$b;

.field public static final b:[B

.field public static final c:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lwe/b$b;->b:Lwe/b$b;

    sput-object v0, Lff/x;->a:Lwe/b$b;

    const/4 v0, 0x0

    new-array v1, v0, [B

    sput-object v1, Lff/x;->b:[B

    const/4 v1, 0x1

    new-array v1, v1, [B

    aput-byte v0, v1, v0

    sput-object v1, Lff/x;->c:[B

    return-void
.end method

.method public static b(Ldf/s0;)Lre/z;
    .locals 11

    :try_start_0
    invoke-static {p0}, Lef/f0;->b(Ldf/s0;)Lre/z;

    move-result-object p0
    :try_end_0
    .catch Ljava/security/NoSuchProviderException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    sget-object v0, Lff/m;->h:Lff/m;

    const-string v1, "RSA"

    invoke-virtual {v0, v1}, Lff/m;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/KeyFactory;

    new-instance v1, Ljava/security/spec/RSAPrivateCrtKeySpec;

    invoke-virtual {p0}, Ldf/s0;->l()Ldf/t0;

    move-result-object v2

    invoke-virtual {v2}, Ldf/t0;->d()Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {p0}, Ldf/s0;->f()Ldf/r0;

    move-result-object v3

    invoke-virtual {v3}, Ldf/r0;->e()Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {p0}, Ldf/s0;->k()Lgf/b;

    move-result-object v4

    invoke-static {}, Lre/j;->a()Lre/d0;

    move-result-object v5

    invoke-virtual {v4, v5}, Lgf/b;->b(Lre/d0;)Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {p0}, Ldf/s0;->i()Lgf/b;

    move-result-object v5

    invoke-static {}, Lre/j;->a()Lre/d0;

    move-result-object v6

    invoke-virtual {v5, v6}, Lgf/b;->b(Lre/d0;)Ljava/math/BigInteger;

    move-result-object v5

    invoke-virtual {p0}, Ldf/s0;->j()Lgf/b;

    move-result-object v6

    invoke-static {}, Lre/j;->a()Lre/d0;

    move-result-object v7

    invoke-virtual {v6, v7}, Lgf/b;->b(Lre/d0;)Ljava/math/BigInteger;

    move-result-object v6

    invoke-virtual {p0}, Ldf/s0;->g()Lgf/b;

    move-result-object v7

    invoke-static {}, Lre/j;->a()Lre/d0;

    move-result-object v8

    invoke-virtual {v7, v8}, Lgf/b;->b(Lre/d0;)Ljava/math/BigInteger;

    move-result-object v7

    invoke-virtual {p0}, Ldf/s0;->h()Lgf/b;

    move-result-object v8

    invoke-static {}, Lre/j;->a()Lre/d0;

    move-result-object v9

    invoke-virtual {v8, v9}, Lgf/b;->b(Lre/d0;)Ljava/math/BigInteger;

    move-result-object v8

    invoke-virtual {p0}, Ldf/s0;->e()Lgf/b;

    move-result-object v9

    invoke-static {}, Lre/j;->a()Lre/d0;

    move-result-object v10

    invoke-virtual {v9, v10}, Lgf/b;->b(Lre/d0;)Ljava/math/BigInteger;

    move-result-object v9

    invoke-direct/range {v1 .. v9}, Ljava/security/spec/RSAPrivateCrtKeySpec;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    invoke-virtual {v0, v1}, Ljava/security/KeyFactory;->generatePrivate(Ljava/security/spec/KeySpec;)Ljava/security/PrivateKey;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/security/interfaces/RSAPrivateCrtKey;

    invoke-virtual {p0}, Ldf/s0;->f()Ldf/r0;

    move-result-object v0

    new-instance v1, Lff/x$b;

    sget-object v3, Lff/y;->b:Lye/h;

    invoke-virtual {v0}, Ldf/r0;->g()Ldf/r0$c;

    move-result-object v4

    invoke-virtual {v3, v4}, Lye/h;->c(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object v3

    check-cast v3, Lff/o;

    sget-object v4, Lff/y;->b:Lye/h;

    invoke-virtual {v0}, Ldf/r0;->c()Ldf/r0$c;

    move-result-object v5

    invoke-virtual {v4, v5}, Lye/h;->c(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object v4

    check-cast v4, Lff/o;

    invoke-virtual {v0}, Ldf/r0;->f()I

    move-result v5

    invoke-virtual {p0}, Ldf/b1;->b()Lgf/a;

    move-result-object v0

    invoke-virtual {v0}, Lgf/a;->d()[B

    move-result-object v6

    invoke-virtual {p0}, Ldf/s0;->f()Ldf/r0;

    move-result-object p0

    invoke-virtual {p0}, Ldf/r0;->h()Ldf/r0$d;

    move-result-object p0

    sget-object v0, Ldf/r0$d;->d:Ldf/r0$d;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    sget-object p0, Lff/x;->c:[B

    :goto_0
    move-object v7, p0

    goto :goto_1

    :cond_0
    sget-object p0, Lff/x;->b:[B

    goto :goto_0

    :goto_1
    const/4 v8, 0x0

    invoke-direct/range {v1 .. v8}, Lff/x$b;-><init>(Ljava/security/interfaces/RSAPrivateCrtKey;Lff/o;Lff/o;I[B[BLff/x$a;)V

    return-object v1
.end method
