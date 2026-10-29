.class public final Ldf/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpe/a0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldf/y$b;
    }
.end annotation


# static fields
.field public static final a:Lue/b$b;

.field public static final b:Lwe/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwe/h<",
            "Ldf/o;",
            "Lbf/r0$c;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:[B

.field public static final d:[B


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-object v0, Lue/b$b;->b:Lue/b$b;

    sput-object v0, Ldf/y;->a:Lue/b$b;

    invoke-static {}, Lwe/h;->a()Lwe/h$b;

    move-result-object v0

    sget-object v1, Ldf/o;->c:Ldf/o;

    sget-object v2, Lbf/r0$c;->b:Lbf/r0$c;

    invoke-virtual {v0, v1, v2}, Lwe/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lwe/h$b;

    move-result-object v0

    sget-object v1, Ldf/o;->d:Ldf/o;

    sget-object v2, Lbf/r0$c;->c:Lbf/r0$c;

    invoke-virtual {v0, v1, v2}, Lwe/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lwe/h$b;

    move-result-object v0

    sget-object v1, Ldf/o;->e:Ldf/o;

    sget-object v2, Lbf/r0$c;->d:Lbf/r0$c;

    invoke-virtual {v0, v1, v2}, Lwe/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lwe/h$b;

    move-result-object v0

    invoke-virtual {v0}, Lwe/h$b;->b()Lwe/h;

    move-result-object v0

    sput-object v0, Ldf/y;->b:Lwe/h;

    const/4 v0, 0x0

    new-array v1, v0, [B

    sput-object v1, Ldf/y;->c:[B

    const/4 v1, 0x1

    new-array v1, v1, [B

    aput-byte v0, v1, v0

    sput-object v1, Ldf/y;->d:[B

    return-void
.end method

.method public static b(Lbf/t0;)Lpe/a0;
    .locals 9

    :try_start_0
    invoke-static {p0}, Lcf/g0;->c(Lbf/t0;)Lpe/a0;

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

    new-instance v1, Ljava/security/spec/RSAPublicKeySpec;

    invoke-virtual {p0}, Lbf/t0;->d()Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {p0}, Lbf/t0;->e()Lbf/r0;

    move-result-object v3

    invoke-virtual {v3}, Lbf/r0;->e()Ljava/math/BigInteger;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Ljava/security/spec/RSAPublicKeySpec;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    invoke-virtual {v0, v1}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/security/interfaces/RSAPublicKey;

    invoke-virtual {p0}, Lbf/t0;->e()Lbf/r0;

    move-result-object v0

    new-instance v1, Ldf/y$b;

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

    invoke-virtual {p0}, Lbf/t0;->b()Lef/a;

    move-result-object v0

    invoke-virtual {v0}, Lef/a;->d()[B

    move-result-object v6

    invoke-virtual {p0}, Lbf/t0;->e()Lbf/r0;

    move-result-object p0

    invoke-virtual {p0}, Lbf/r0;->h()Lbf/r0$d;

    move-result-object p0

    sget-object v0, Lbf/r0$d;->d:Lbf/r0$d;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    sget-object p0, Ldf/y;->d:[B

    :goto_0
    move-object v7, p0

    goto :goto_1

    :cond_0
    sget-object p0, Ldf/y;->c:[B

    goto :goto_0

    :goto_1
    const/4 v8, 0x0

    invoke-direct/range {v1 .. v8}, Ldf/y$b;-><init>(Ljava/security/interfaces/RSAPublicKey;Ldf/o;Ldf/o;I[B[BLdf/y$a;)V

    return-object v1
.end method
