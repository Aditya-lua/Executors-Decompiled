.class public final Ldf/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpe/a0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldf/w$b;
    }
.end annotation


# static fields
.field public static final a:Lue/b$b;

.field public static final b:[B

.field public static final c:[B

.field public static final d:Lwe/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwe/h<",
            "Ldf/o;",
            "Lbf/j0$c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-object v0, Lue/b$b;->b:Lue/b$b;

    sput-object v0, Ldf/w;->a:Lue/b$b;

    const/4 v0, 0x0

    new-array v1, v0, [B

    sput-object v1, Ldf/w;->b:[B

    const/4 v1, 0x1

    new-array v1, v1, [B

    aput-byte v0, v1, v0

    sput-object v1, Ldf/w;->c:[B

    invoke-static {}, Lwe/h;->a()Lwe/h$b;

    move-result-object v0

    sget-object v1, Ldf/o;->c:Ldf/o;

    sget-object v2, Lbf/j0$c;->b:Lbf/j0$c;

    invoke-virtual {v0, v1, v2}, Lwe/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lwe/h$b;

    move-result-object v0

    sget-object v1, Ldf/o;->d:Ldf/o;

    sget-object v2, Lbf/j0$c;->c:Lbf/j0$c;

    invoke-virtual {v0, v1, v2}, Lwe/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lwe/h$b;

    move-result-object v0

    sget-object v1, Ldf/o;->e:Ldf/o;

    sget-object v2, Lbf/j0$c;->d:Lbf/j0$c;

    invoke-virtual {v0, v1, v2}, Lwe/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lwe/h$b;

    move-result-object v0

    invoke-virtual {v0}, Lwe/h$b;->b()Lwe/h;

    move-result-object v0

    sput-object v0, Ldf/w;->d:Lwe/h;

    return-void
.end method

.method public static b(Lbf/l0;)Lpe/a0;
    .locals 7

    :try_start_0
    invoke-static {p0}, Lcf/x;->c(Lbf/l0;)Lpe/a0;

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

    invoke-virtual {p0}, Lbf/l0;->d()Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {p0}, Lbf/l0;->e()Lbf/j0;

    move-result-object v3

    invoke-virtual {v3}, Lbf/j0;->e()Ljava/math/BigInteger;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Ljava/security/spec/RSAPublicKeySpec;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    invoke-virtual {v0, v1}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/security/interfaces/RSAPublicKey;

    new-instance v1, Ldf/w$b;

    sget-object v0, Ldf/w;->d:Lwe/h;

    invoke-virtual {p0}, Lbf/l0;->e()Lbf/j0;

    move-result-object v3

    invoke-virtual {v3}, Lbf/j0;->c()Lbf/j0$c;

    move-result-object v3

    invoke-virtual {v0, v3}, Lwe/h;->c(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ldf/o;

    invoke-virtual {p0}, Lbf/l0;->b()Lef/a;

    move-result-object v0

    invoke-virtual {v0}, Lef/a;->d()[B

    move-result-object v4

    invoke-virtual {p0}, Lbf/l0;->e()Lbf/j0;

    move-result-object p0

    invoke-virtual {p0}, Lbf/j0;->f()Lbf/j0$d;

    move-result-object p0

    sget-object v0, Lbf/j0$d;->d:Lbf/j0$d;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    sget-object p0, Ldf/w;->c:[B

    :goto_0
    move-object v5, p0

    goto :goto_1

    :cond_0
    sget-object p0, Ldf/w;->b:[B

    goto :goto_0

    :goto_1
    const/4 v6, 0x0

    invoke-direct/range {v1 .. v6}, Ldf/w$b;-><init>(Ljava/security/interfaces/RSAPublicKey;Ldf/o;[B[BLdf/w$a;)V

    return-object v1
.end method
