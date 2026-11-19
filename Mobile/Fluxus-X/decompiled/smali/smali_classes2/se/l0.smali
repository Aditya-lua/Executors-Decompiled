.class public Lse/l0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lre/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lre/m<",
            "Lre/a;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Lye/w$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lye/w$a<",
            "Lse/u0;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Lye/h0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lye/h0<",
            "Lse/t0;",
            "Lre/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    invoke-static {}, Lse/l0;->d()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcf/f0$c;->c:Lcf/f0$c;

    invoke-static {}, Lcf/n0;->f0()Lcom/google/crypto/tink/shaded/protobuf/a1;

    move-result-object v2

    const-class v3, Lre/a;

    invoke-static {v0, v3, v1, v2}, Lye/o;->e(Ljava/lang/String;Ljava/lang/Class;Lcf/f0$c;Lcom/google/crypto/tink/shaded/protobuf/a1;)Lre/m;

    move-result-object v0

    sput-object v0, Lse/l0;->a:Lre/m;

    new-instance v0, Lse/j0;

    invoke-direct {v0}, Lse/j0;-><init>()V

    sput-object v0, Lse/l0;->b:Lye/w$a;

    new-instance v0, Lse/k0;

    invoke-direct {v0}, Lse/k0;-><init>()V

    const-class v1, Lse/t0;

    invoke-static {v0, v1, v3}, Lye/h0;->b(Lye/h0$b;Ljava/lang/Class;Ljava/lang/Class;)Lye/h0;

    move-result-object v0

    sput-object v0, Lse/l0;->c:Lye/h0;

    return-void
.end method

.method public static synthetic a(Lse/u0;Ljava/lang/Integer;)Lse/t0;
    .locals 0

    invoke-static {p0, p1}, Lse/l0;->e(Lse/u0;Ljava/lang/Integer;)Lse/t0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lse/t0;)Lre/a;
    .locals 0

    invoke-static {p0}, Lse/l0;->c(Lse/t0;)Lre/a;

    move-result-object p0

    return-object p0
.end method

.method public static c(Lse/t0;)Lre/a;
    .locals 3

    invoke-virtual {p0}, Lse/t0;->d()Lse/u0;

    move-result-object v0

    invoke-virtual {v0}, Lse/u0;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lse/t0;->d()Lse/u0;

    move-result-object v1

    invoke-virtual {v1}, Lse/u0;->c()Lse/c;

    move-result-object v1

    invoke-static {v0}, Lre/u;->a(Ljava/lang/String;)Lre/t;

    move-result-object v2

    invoke-interface {v2, v0}, Lre/t;->b(Ljava/lang/String;)Lre/a;

    move-result-object v0

    invoke-static {v1, v0}, Lse/i0;->d(Lse/c;Lre/a;)Lre/a;

    move-result-object v0

    invoke-virtual {p0}, Lse/t0;->c()Lgf/a;

    move-result-object p0

    invoke-static {v0, p0}, Lte/j0;->c(Lre/a;Lgf/a;)Lre/a;

    move-result-object p0

    return-object p0
.end method

.method public static d()Ljava/lang/String;
    .locals 1

    const-string v0, "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey"

    return-object v0
.end method

.method public static e(Lse/u0;Ljava/lang/Integer;)Lse/t0;
    .locals 0

    invoke-static {p0, p1}, Lse/t0;->b(Lse/u0;Ljava/lang/Integer;)Lse/t0;

    move-result-object p0

    return-object p0
.end method

.method public static f(Z)V
    .locals 3

    sget-object v0, Lwe/b$b;->a:Lwe/b$b;

    invoke-virtual {v0}, Lwe/b$b;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lse/z0;->h()V

    invoke-static {}, Lye/w;->f()Lye/w;

    move-result-object v0

    sget-object v1, Lse/l0;->b:Lye/w$a;

    const-class v2, Lse/u0;

    invoke-virtual {v0, v1, v2}, Lye/w;->b(Lye/w$a;Ljava/lang/Class;)V

    invoke-static {}, Lye/a0;->c()Lye/a0;

    move-result-object v0

    sget-object v1, Lse/l0;->c:Lye/h0;

    invoke-virtual {v0, v1}, Lye/a0;->d(Lye/h0;)V

    invoke-static {}, Lye/l;->d()Lye/l;

    move-result-object v0

    sget-object v1, Lse/l0;->a:Lre/m;

    invoke-virtual {v0, v1, p0}, Lye/l;->g(Lre/m;Z)V

    return-void

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "Registering KMS Envelope AEAD is not supported in FIPS mode"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
