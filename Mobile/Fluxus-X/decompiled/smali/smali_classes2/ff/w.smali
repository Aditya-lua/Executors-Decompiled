.class public final Lff/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lre/a0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lff/w$b;
    }
.end annotation


# static fields
.field public static final a:Lwe/b$b;

.field public static final b:[B

.field public static final c:[B

.field public static final d:Lye/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lye/h<",
            "Lff/o;",
            "Ldf/j0$c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-object v0, Lwe/b$b;->b:Lwe/b$b;

    sput-object v0, Lff/w;->a:Lwe/b$b;

    const/4 v0, 0x0

    new-array v1, v0, [B

    sput-object v1, Lff/w;->b:[B

    const/4 v1, 0x1

    new-array v1, v1, [B

    aput-byte v0, v1, v0

    sput-object v1, Lff/w;->c:[B

    invoke-static {}, Lye/h;->a()Lye/h$b;

    move-result-object v0

    sget-object v1, Lff/o;->c:Lff/o;

    sget-object v2, Ldf/j0$c;->b:Ldf/j0$c;

    invoke-virtual {v0, v1, v2}, Lye/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lye/h$b;

    move-result-object v0

    sget-object v1, Lff/o;->d:Lff/o;

    sget-object v2, Ldf/j0$c;->c:Ldf/j0$c;

    invoke-virtual {v0, v1, v2}, Lye/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lye/h$b;

    move-result-object v0

    sget-object v1, Lff/o;->e:Lff/o;

    sget-object v2, Ldf/j0$c;->d:Ldf/j0$c;

    invoke-virtual {v0, v1, v2}, Lye/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lye/h$b;

    move-result-object v0

    invoke-virtual {v0}, Lye/h$b;->b()Lye/h;

    move-result-object v0

    sput-object v0, Lff/w;->d:Lye/h;

    return-void
.end method

.method public static b(Ldf/l0;)Lre/a0;
    .locals 7

    :try_start_0
    invoke-static {p0}, Lef/x;->c(Ldf/l0;)Lre/a0;

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

    invoke-virtual {p0}, Ldf/l0;->d()Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {p0}, Ldf/l0;->e()Ldf/j0;

    move-result-object v3

    invoke-virtual {v3}, Ldf/j0;->e()Ljava/math/BigInteger;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Ljava/security/spec/RSAPublicKeySpec;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    invoke-virtual {v0, v1}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/security/interfaces/RSAPublicKey;

    new-instance v1, Lff/w$b;

    sget-object v0, Lff/w;->d:Lye/h;

    invoke-virtual {p0}, Ldf/l0;->e()Ldf/j0;

    move-result-object v3

    invoke-virtual {v3}, Ldf/j0;->c()Ldf/j0$c;

    move-result-object v3

    invoke-virtual {v0, v3}, Lye/h;->c(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lff/o;

    invoke-virtual {p0}, Ldf/l0;->b()Lgf/a;

    move-result-object v0

    invoke-virtual {v0}, Lgf/a;->d()[B

    move-result-object v4

    invoke-virtual {p0}, Ldf/l0;->e()Ldf/j0;

    move-result-object p0

    invoke-virtual {p0}, Ldf/j0;->f()Ldf/j0$d;

    move-result-object p0

    sget-object v0, Ldf/j0$d;->d:Ldf/j0$d;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    sget-object p0, Lff/w;->c:[B

    :goto_0
    move-object v5, p0

    goto :goto_1

    :cond_0
    sget-object p0, Lff/w;->b:[B

    goto :goto_0

    :goto_1
    const/4 v6, 0x0

    invoke-direct/range {v1 .. v6}, Lff/w$b;-><init>(Ljava/security/interfaces/RSAPublicKey;Lff/o;[B[BLff/w$a;)V

    return-object v1
.end method
