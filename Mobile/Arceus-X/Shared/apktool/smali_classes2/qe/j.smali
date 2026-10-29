.class public final Lqe/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lwe/h0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwe/h0<",
            "Lqe/f;",
            "Lpe/a;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Lpe/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpe/m<",
            "Lpe/a;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Lwe/x$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwe/x$a<",
            "Lqe/k;",
            ">;"
        }
    .end annotation
.end field

.field public static final d:Lwe/w$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwe/w$a<",
            "Lqe/k;",
            ">;"
        }
    .end annotation
.end field

.field public static final e:Lue/b$b;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lqe/g;

    invoke-direct {v0}, Lqe/g;-><init>()V

    const-class v1, Lqe/f;

    const-class v2, Lpe/a;

    invoke-static {v0, v1, v2}, Lwe/h0;->b(Lwe/h0$b;Ljava/lang/Class;Ljava/lang/Class;)Lwe/h0;

    move-result-object v0

    sput-object v0, Lqe/j;->a:Lwe/h0;

    invoke-static {}, Lqe/j;->b()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Laf/f0$c;->c:Laf/f0$c;

    invoke-static {}, Laf/d;->h0()Lcom/google/crypto/tink/shaded/protobuf/a1;

    move-result-object v3

    invoke-static {v0, v2, v1, v3}, Lwe/o;->e(Ljava/lang/String;Ljava/lang/Class;Laf/f0$c;Lcom/google/crypto/tink/shaded/protobuf/a1;)Lpe/m;

    move-result-object v0

    sput-object v0, Lqe/j;->b:Lpe/m;

    new-instance v0, Lqe/h;

    invoke-direct {v0}, Lqe/h;-><init>()V

    sput-object v0, Lqe/j;->c:Lwe/x$a;

    new-instance v0, Lqe/i;

    invoke-direct {v0}, Lqe/i;-><init>()V

    sput-object v0, Lqe/j;->d:Lwe/w$a;

    sget-object v0, Lue/b$b;->b:Lue/b$b;

    sput-object v0, Lqe/j;->e:Lue/b$b;

    return-void
.end method

.method public static a(Lqe/k;Ljava/lang/Integer;)Lqe/f;
    .locals 1

    invoke-static {p0}, Lqe/j;->e(Lqe/k;)V

    invoke-static {}, Lqe/f;->b()Lqe/f$b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lqe/f$b;->f(Lqe/k;)Lqe/f$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lqe/f$b;->e(Ljava/lang/Integer;)Lqe/f$b;

    move-result-object p1

    invoke-virtual {p0}, Lqe/k;->c()I

    move-result v0

    invoke-static {v0}, Lef/c;->b(I)Lef/c;

    move-result-object v0

    invoke-virtual {p1, v0}, Lqe/f$b;->c(Lef/c;)Lqe/f$b;

    move-result-object p1

    invoke-virtual {p0}, Lqe/k;->e()I

    move-result p0

    invoke-static {p0}, Lef/c;->b(I)Lef/c;

    move-result-object p0

    invoke-virtual {p1, p0}, Lqe/f$b;->d(Lef/c;)Lqe/f$b;

    move-result-object p0

    invoke-virtual {p0}, Lqe/f$b;->a()Lqe/f;

    move-result-object p0

    return-object p0
.end method

.method public static b()Ljava/lang/String;
    .locals 1

    const-string v0, "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey"

    return-object v0
.end method

.method public static c()Ljava/util/Map;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lpe/x;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "AES128_CTR_HMAC_SHA256"

    sget-object v2, Lqe/j1;->e:Lqe/k;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lqe/k;->b()Lqe/k$b;

    move-result-object v1

    const/16 v2, 0x10

    invoke-virtual {v1, v2}, Lqe/k$b;->b(I)Lqe/k$b;

    move-result-object v1

    const/16 v3, 0x20

    invoke-virtual {v1, v3}, Lqe/k$b;->d(I)Lqe/k$b;

    move-result-object v1

    invoke-virtual {v1, v2}, Lqe/k$b;->f(I)Lqe/k$b;

    move-result-object v1

    invoke-virtual {v1, v2}, Lqe/k$b;->e(I)Lqe/k$b;

    move-result-object v1

    sget-object v4, Lqe/k$c;->d:Lqe/k$c;

    invoke-virtual {v1, v4}, Lqe/k$b;->c(Lqe/k$c;)Lqe/k$b;

    move-result-object v1

    sget-object v5, Lqe/k$d;->d:Lqe/k$d;

    invoke-virtual {v1, v5}, Lqe/k$b;->g(Lqe/k$d;)Lqe/k$b;

    move-result-object v1

    invoke-virtual {v1}, Lqe/k$b;->a()Lqe/k;

    move-result-object v1

    const-string v6, "AES128_CTR_HMAC_SHA256_RAW"

    invoke-interface {v0, v6, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "AES256_CTR_HMAC_SHA256"

    sget-object v6, Lqe/j1;->f:Lqe/k;

    invoke-interface {v0, v1, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lqe/k;->b()Lqe/k$b;

    move-result-object v1

    invoke-virtual {v1, v3}, Lqe/k$b;->b(I)Lqe/k$b;

    move-result-object v1

    invoke-virtual {v1, v3}, Lqe/k$b;->d(I)Lqe/k$b;

    move-result-object v1

    invoke-virtual {v1, v3}, Lqe/k$b;->f(I)Lqe/k$b;

    move-result-object v1

    invoke-virtual {v1, v2}, Lqe/k$b;->e(I)Lqe/k$b;

    move-result-object v1

    invoke-virtual {v1, v4}, Lqe/k$b;->c(Lqe/k$c;)Lqe/k$b;

    move-result-object v1

    invoke-virtual {v1, v5}, Lqe/k$b;->g(Lqe/k$d;)Lqe/k$b;

    move-result-object v1

    invoke-virtual {v1}, Lqe/k$b;->a()Lqe/k;

    move-result-object v1

    const-string v2, "AES256_CTR_HMAC_SHA256_RAW"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public static d(Z)V
    .locals 4

    sget-object v0, Lqe/j;->e:Lue/b$b;

    invoke-virtual {v0}, Lue/b$b;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Lre/e;->h()V

    invoke-static {}, Lwe/a0;->c()Lwe/a0;

    move-result-object v1

    sget-object v2, Lqe/j;->a:Lwe/h0;

    invoke-virtual {v1, v2}, Lwe/a0;->d(Lwe/h0;)V

    invoke-static {}, Lwe/z;->a()Lwe/z;

    move-result-object v1

    invoke-static {}, Lqe/j;->c()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v1, v2}, Lwe/z;->c(Ljava/util/Map;)V

    invoke-static {}, Lwe/x;->b()Lwe/x;

    move-result-object v1

    sget-object v2, Lqe/j;->c:Lwe/x$a;

    const-class v3, Lqe/k;

    invoke-virtual {v1, v2, v3}, Lwe/x;->a(Lwe/x$a;Ljava/lang/Class;)V

    invoke-static {}, Lwe/w;->f()Lwe/w;

    move-result-object v1

    sget-object v2, Lqe/j;->d:Lwe/w$a;

    invoke-virtual {v1, v2, v3}, Lwe/w;->b(Lwe/w$a;Ljava/lang/Class;)V

    invoke-static {}, Lwe/l;->d()Lwe/l;

    move-result-object v1

    sget-object v2, Lqe/j;->b:Lpe/m;

    invoke-virtual {v1, v2, v0, p0}, Lwe/l;->h(Lpe/m;Lue/b$b;Z)V

    return-void

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available."

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static e(Lqe/k;)V
    .locals 2

    invoke-virtual {p0}, Lqe/k;->c()I

    move-result v0

    const/16 v1, 0x10

    if-eq v0, v1, :cond_1

    invoke-virtual {p0}, Lqe/k;->c()I

    move-result p0

    const/16 v0, 0x20

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "AES key size must be 16 or 32 bytes"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    return-void
.end method
