.class public final Lff/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lre/a0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lff/y$b;
    }
.end annotation


# static fields
.field public static final a:Lwe/b$b;

.field public static final b:Lye/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lye/h<",
            "Lff/o;",
            "Ldf/r0$c;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:[B

.field public static final d:[B


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-object v0, Lwe/b$b;->b:Lwe/b$b;

    sput-object v0, Lff/y;->a:Lwe/b$b;

    invoke-static {}, Lye/h;->a()Lye/h$b;

    move-result-object v0

    sget-object v1, Lff/o;->c:Lff/o;

    sget-object v2, Ldf/r0$c;->b:Ldf/r0$c;

    invoke-virtual {v0, v1, v2}, Lye/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lye/h$b;

    move-result-object v0

    sget-object v1, Lff/o;->d:Lff/o;

    sget-object v2, Ldf/r0$c;->c:Ldf/r0$c;

    invoke-virtual {v0, v1, v2}, Lye/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lye/h$b;

    move-result-object v0

    sget-object v1, Lff/o;->e:Lff/o;

    sget-object v2, Ldf/r0$c;->d:Ldf/r0$c;

    invoke-virtual {v0, v1, v2}, Lye/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lye/h$b;

    move-result-object v0

    invoke-virtual {v0}, Lye/h$b;->b()Lye/h;

    move-result-object v0

    sput-object v0, Lff/y;->b:Lye/h;

    const/4 v0, 0x0

    new-array v1, v0, [B

    sput-object v1, Lff/y;->c:[B

    const/4 v1, 0x1

    new-array v1, v1, [B

    aput-byte v0, v1, v0

    sput-object v1, Lff/y;->d:[B

    return-void
.end method

.method public static b(Ldf/t0;)Lre/a0;
    .locals 9

    :try_start_0
    invoke-static {p0}, Lef/g0;->c(Ldf/t0;)Lre/a0;

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

    new-instance v1, Ljava/security/spec/RSAPublicKeySpec;

    invoke-virtual {p0}, Ldf/t0;->d()Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {p0}, Ldf/t0;->e()Ldf/r0;

    move-result-object v3

    invoke-virtual {v3}, Ldf/r0;->e()Ljava/math/BigInteger;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Ljava/security/spec/RSAPublicKeySpec;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    invoke-virtual {v0, v1}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/security/interfaces/RSAPublicKey;

    invoke-virtual {p0}, Ldf/t0;->e()Ldf/r0;

    move-result-object v0

    new-instance v1, Lff/y$b;

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

    invoke-virtual {p0}, Ldf/t0;->b()Lgf/a;

    move-result-object v0

    invoke-virtual {v0}, Lgf/a;->d()[B

    move-result-object v6

    invoke-virtual {p0}, Ldf/t0;->e()Ldf/r0;

    move-result-object p0

    invoke-virtual {p0}, Ldf/r0;->h()Ldf/r0$d;

    move-result-object p0

    sget-object v0, Ldf/r0$d;->d:Ldf/r0$d;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    sget-object p0, Lff/y;->d:[B

    :goto_0
    move-object v7, p0

    goto :goto_1

    :cond_0
    sget-object p0, Lff/y;->c:[B

    goto :goto_0

    :goto_1
    const/4 v8, 0x0

    invoke-direct/range {v1 .. v8}, Lff/y$b;-><init>(Ljava/security/interfaces/RSAPublicKey;Lff/o;Lff/o;I[B[BLff/y$a;)V

    return-object v1
.end method
