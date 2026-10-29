.class public final Ldf/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpe/z;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldf/x$b;
    }
.end annotation


# static fields
.field public static final a:Lue/b$b;

.field public static final b:[B

.field public static final c:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lue/b$b;->b:Lue/b$b;

    sput-object v0, Ldf/x;->a:Lue/b$b;

    const/4 v0, 0x0

    new-array v1, v0, [B

    sput-object v1, Ldf/x;->b:[B

    const/4 v1, 0x1

    new-array v1, v1, [B

    aput-byte v0, v1, v0

    sput-object v1, Ldf/x;->c:[B

    return-void
.end method

.method public static b(Lbf/s0;)Lpe/z;
    .locals 11

    :try_start_0
    invoke-static {p0}, Lcf/f0;->b(Lbf/s0;)Lpe/z;

    move-result-object p0
    :try_end_0
    .catch Ljava/security/NoSuchProviderException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    sget-object v0, Ldf/m;->h:Ldf/m;

    const-string v1, "RSA"

    invoke-virtual {v0, v1}, Ldf/m;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/KeyFactory;

    new-instance v1, Ljava/security/spec/RSAPrivateCrtKeySpec;

    invoke-virtual {p0}, Lbf/s0;->l()Lbf/t0;

    move-result-object v2

    invoke-virtual {v2}, Lbf/t0;->d()Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {p0}, Lbf/s0;->f()Lbf/r0;

    move-result-object v3

    invoke-virtual {v3}, Lbf/r0;->e()Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {p0}, Lbf/s0;->k()Lef/b;

    move-result-object v4

    invoke-static {}, Lpe/j;->a()Lpe/d0;

    move-result-object v5

    invoke-virtual {v4, v5}, Lef/b;->b(Lpe/d0;)Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {p0}, Lbf/s0;->i()Lef/b;

    move-result-object v5

    invoke-static {}, Lpe/j;->a()Lpe/d0;

    move-result-object v6

    invoke-virtual {v5, v6}, Lef/b;->b(Lpe/d0;)Ljava/math/BigInteger;

    move-result-object v5

    invoke-virtual {p0}, Lbf/s0;->j()Lef/b;

    move-result-object v6

    invoke-static {}, Lpe/j;->a()Lpe/d0;

    move-result-object v7

    invoke-virtual {v6, v7}, Lef/b;->b(Lpe/d0;)Ljava/math/BigInteger;

    move-result-object v6

    invoke-virtual {p0}, Lbf/s0;->g()Lef/b;

    move-result-object v7

    invoke-static {}, Lpe/j;->a()Lpe/d0;

    move-result-object v8

    invoke-virtual {v7, v8}, Lef/b;->b(Lpe/d0;)Ljava/math/BigInteger;

    move-result-object v7

    invoke-virtual {p0}, Lbf/s0;->h()Lef/b;

    move-result-object v8

    invoke-static {}, Lpe/j;->a()Lpe/d0;

    move-result-object v9

    invoke-virtual {v8, v9}, Lef/b;->b(Lpe/d0;)Ljava/math/BigInteger;

    move-result-object v8

    invoke-virtual {p0}, Lbf/s0;->e()Lef/b;

    move-result-object v9

    invoke-static {}, Lpe/j;->a()Lpe/d0;

    move-result-object v10

    invoke-virtual {v9, v10}, Lef/b;->b(Lpe/d0;)Ljava/math/BigInteger;

    move-result-object v9

    invoke-direct/range {v1 .. v9}, Ljava/security/spec/RSAPrivateCrtKeySpec;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    invoke-virtual {v0, v1}, Ljava/security/KeyFactory;->generatePrivate(Ljava/security/spec/KeySpec;)Ljava/security/PrivateKey;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/security/interfaces/RSAPrivateCrtKey;

    invoke-virtual {p0}, Lbf/s0;->f()Lbf/r0;

    move-result-object v0

    new-instance v1, Ldf/x$b;

    sget-object v3, Ldf/y;->b:Lwe/h;

    invoke-virtual {v0}, Lbf/r0;->g()Lbf/r0$c;

    move-result-object v4

    invoke-virtual {v3, v4}, Lwe/h;->c(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object v3

    check-cast v3, Ldf/o;

    sget-object v4, Ldf/y;->b:Lwe/h;

    invoke-virtual {v0}, Lbf/r0;->c()Lbf/r0$c;

    move-result-object v5

    invoke-virtual {v4, v5}, Lwe/h;->c(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object v4

    check-cast v4, Ldf/o;

    invoke-virtual {v0}, Lbf/r0;->f()I

    move-result v5

    invoke-virtual {p0}, Lbf/b1;->b()Lef/a;

    move-result-object v0

    invoke-virtual {v0}, Lef/a;->d()[B

    move-result-object v6

    invoke-virtual {p0}, Lbf/s0;->f()Lbf/r0;

    move-result-object p0

    invoke-virtual {p0}, Lbf/r0;->h()Lbf/r0$d;

    move-result-object p0

    sget-object v0, Lbf/r0$d;->d:Lbf/r0$d;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    sget-object p0, Ldf/x;->c:[B

    :goto_0
    move-object v7, p0

    goto :goto_1

    :cond_0
    sget-object p0, Ldf/x;->b:[B

    goto :goto_0

    :goto_1
    const/4 v8, 0x0

    invoke-direct/range {v1 .. v8}, Ldf/x$b;-><init>(Ljava/security/interfaces/RSAPrivateCrtKey;Ldf/o;Ldf/o;I[B[BLdf/x$a;)V

    return-object v1
.end method
