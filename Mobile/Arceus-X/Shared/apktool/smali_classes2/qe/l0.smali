.class public Lqe/l0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lpe/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpe/m<",
            "Lpe/a;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Lwe/w$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwe/w$a<",
            "Lqe/u0;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Lwe/h0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwe/h0<",
            "Lqe/t0;",
            "Lpe/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    invoke-static {}, Lqe/l0;->d()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Laf/f0$c;->c:Laf/f0$c;

    invoke-static {}, Laf/n0;->f0()Lcom/google/crypto/tink/shaded/protobuf/a1;

    move-result-object v2

    const-class v3, Lpe/a;

    invoke-static {v0, v3, v1, v2}, Lwe/o;->e(Ljava/lang/String;Ljava/lang/Class;Laf/f0$c;Lcom/google/crypto/tink/shaded/protobuf/a1;)Lpe/m;

    move-result-object v0

    sput-object v0, Lqe/l0;->a:Lpe/m;

    new-instance v0, Lqe/j0;

    invoke-direct {v0}, Lqe/j0;-><init>()V

    sput-object v0, Lqe/l0;->b:Lwe/w$a;

    new-instance v0, Lqe/k0;

    invoke-direct {v0}, Lqe/k0;-><init>()V

    const-class v1, Lqe/t0;

    invoke-static {v0, v1, v3}, Lwe/h0;->b(Lwe/h0$b;Ljava/lang/Class;Ljava/lang/Class;)Lwe/h0;

    move-result-object v0

    sput-object v0, Lqe/l0;->c:Lwe/h0;

    return-void
.end method

.method public static synthetic a(Lqe/u0;Ljava/lang/Integer;)Lqe/t0;
    .locals 0

    invoke-static {p0, p1}, Lqe/l0;->e(Lqe/u0;Ljava/lang/Integer;)Lqe/t0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lqe/t0;)Lpe/a;
    .locals 0

    invoke-static {p0}, Lqe/l0;->c(Lqe/t0;)Lpe/a;

    move-result-object p0

    return-object p0
.end method

.method public static c(Lqe/t0;)Lpe/a;
    .locals 3

    invoke-virtual {p0}, Lqe/t0;->d()Lqe/u0;

    move-result-object v0

    invoke-virtual {v0}, Lqe/u0;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lqe/t0;->d()Lqe/u0;

    move-result-object v1

    invoke-virtual {v1}, Lqe/u0;->c()Lqe/c;

    move-result-object v1

    invoke-static {v0}, Lpe/u;->a(Ljava/lang/String;)Lpe/t;

    move-result-object v2

    invoke-interface {v2, v0}, Lpe/t;->b(Ljava/lang/String;)Lpe/a;

    move-result-object v0

    invoke-static {v1, v0}, Lqe/i0;->d(Lqe/c;Lpe/a;)Lpe/a;

    move-result-object v0

    invoke-virtual {p0}, Lqe/t0;->c()Lef/a;

    move-result-object p0

    invoke-static {v0, p0}, Lre/j0;->c(Lpe/a;Lef/a;)Lpe/a;

    move-result-object p0

    return-object p0
.end method

.method public static d()Ljava/lang/String;
    .locals 1

    const-string v0, "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey"

    return-object v0
.end method

.method public static e(Lqe/u0;Ljava/lang/Integer;)Lqe/t0;
    .locals 0

    invoke-static {p0, p1}, Lqe/t0;->b(Lqe/u0;Ljava/lang/Integer;)Lqe/t0;

    move-result-object p0

    return-object p0
.end method

.method public static f(Z)V
    .locals 3

    sget-object v0, Lue/b$b;->a:Lue/b$b;

    invoke-virtual {v0}, Lue/b$b;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lqe/z0;->h()V

    invoke-static {}, Lwe/w;->f()Lwe/w;

    move-result-object v0

    sget-object v1, Lqe/l0;->b:Lwe/w$a;

    const-class v2, Lqe/u0;

    invoke-virtual {v0, v1, v2}, Lwe/w;->b(Lwe/w$a;Ljava/lang/Class;)V

    invoke-static {}, Lwe/a0;->c()Lwe/a0;

    move-result-object v0

    sget-object v1, Lqe/l0;->c:Lwe/h0;

    invoke-virtual {v0, v1}, Lwe/a0;->d(Lwe/h0;)V

    invoke-static {}, Lwe/l;->d()Lwe/l;

    move-result-object v0

    sget-object v1, Lqe/l0;->a:Lpe/m;

    invoke-virtual {v0, v1, p0}, Lwe/l;->g(Lpe/m;Z)V

    return-void

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "Registering KMS Envelope AEAD is not supported in FIPS mode"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
