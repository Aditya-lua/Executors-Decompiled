.class public final Lse/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lye/h0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lye/h0<",
            "Lse/f;",
            "Lre/a;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Lre/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lre/m<",
            "Lre/a;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Lye/x$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lye/x$a<",
            "Lse/k;",
            ">;"
        }
    .end annotation
.end field

.field public static final d:Lye/w$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lye/w$a<",
            "Lse/k;",
            ">;"
        }
    .end annotation
.end field

.field public static final e:Lwe/b$b;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lse/g;

    invoke-direct {v0}, Lse/g;-><init>()V

    const-class v1, Lse/f;

    const-class v2, Lre/a;

    invoke-static {v0, v1, v2}, Lye/h0;->b(Lye/h0$b;Ljava/lang/Class;Ljava/lang/Class;)Lye/h0;

    move-result-object v0

    sput-object v0, Lse/j;->a:Lye/h0;

    invoke-static {}, Lse/j;->b()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcf/f0$c;->c:Lcf/f0$c;

    invoke-static {}, Lcf/d;->h0()Lcom/google/crypto/tink/shaded/protobuf/a1;

    move-result-object v3

    invoke-static {v0, v2, v1, v3}, Lye/o;->e(Ljava/lang/String;Ljava/lang/Class;Lcf/f0$c;Lcom/google/crypto/tink/shaded/protobuf/a1;)Lre/m;

    move-result-object v0

    sput-object v0, Lse/j;->b:Lre/m;

    new-instance v0, Lse/h;

    invoke-direct {v0}, Lse/h;-><init>()V

    sput-object v0, Lse/j;->c:Lye/x$a;

    new-instance v0, Lse/i;

    invoke-direct {v0}, Lse/i;-><init>()V

    sput-object v0, Lse/j;->d:Lye/w$a;

    sget-object v0, Lwe/b$b;->b:Lwe/b$b;

    sput-object v0, Lse/j;->e:Lwe/b$b;

    return-void
.end method

.method public static a(Lse/k;Ljava/lang/Integer;)Lse/f;
    .locals 1

    invoke-static {p0}, Lse/j;->e(Lse/k;)V

    invoke-static {}, Lse/f;->b()Lse/f$b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lse/f$b;->f(Lse/k;)Lse/f$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lse/f$b;->e(Ljava/lang/Integer;)Lse/f$b;

    move-result-object p1

    invoke-virtual {p0}, Lse/k;->c()I

    move-result v0

    invoke-static {v0}, Lgf/c;->b(I)Lgf/c;

    move-result-object v0

    invoke-virtual {p1, v0}, Lse/f$b;->c(Lgf/c;)Lse/f$b;

    move-result-object p1

    invoke-virtual {p0}, Lse/k;->e()I

    move-result p0

    invoke-static {p0}, Lgf/c;->b(I)Lgf/c;

    move-result-object p0

    invoke-virtual {p1, p0}, Lse/f$b;->d(Lgf/c;)Lse/f$b;

    move-result-object p0

    invoke-virtual {p0}, Lse/f$b;->a()Lse/f;

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
            "Lre/x;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "AES128_CTR_HMAC_SHA256"

    sget-object v2, Lse/j1;->e:Lse/k;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lse/k;->b()Lse/k$b;

    move-result-object v1

    const/16 v2, 0x10

    invoke-virtual {v1, v2}, Lse/k$b;->b(I)Lse/k$b;

    move-result-object v1

    const/16 v3, 0x20

    invoke-virtual {v1, v3}, Lse/k$b;->d(I)Lse/k$b;

    move-result-object v1

    invoke-virtual {v1, v2}, Lse/k$b;->f(I)Lse/k$b;

    move-result-object v1

    invoke-virtual {v1, v2}, Lse/k$b;->e(I)Lse/k$b;

    move-result-object v1

    sget-object v4, Lse/k$c;->d:Lse/k$c;

    invoke-virtual {v1, v4}, Lse/k$b;->c(Lse/k$c;)Lse/k$b;

    move-result-object v1

    sget-object v5, Lse/k$d;->d:Lse/k$d;

    invoke-virtual {v1, v5}, Lse/k$b;->g(Lse/k$d;)Lse/k$b;

    move-result-object v1

    invoke-virtual {v1}, Lse/k$b;->a()Lse/k;

    move-result-object v1

    const-string v6, "AES128_CTR_HMAC_SHA256_RAW"

    invoke-interface {v0, v6, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "AES256_CTR_HMAC_SHA256"

    sget-object v6, Lse/j1;->f:Lse/k;

    invoke-interface {v0, v1, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lse/k;->b()Lse/k$b;

    move-result-object v1

    invoke-virtual {v1, v3}, Lse/k$b;->b(I)Lse/k$b;

    move-result-object v1

    invoke-virtual {v1, v3}, Lse/k$b;->d(I)Lse/k$b;

    move-result-object v1

    invoke-virtual {v1, v3}, Lse/k$b;->f(I)Lse/k$b;

    move-result-object v1

    invoke-virtual {v1, v2}, Lse/k$b;->e(I)Lse/k$b;

    move-result-object v1

    invoke-virtual {v1, v4}, Lse/k$b;->c(Lse/k$c;)Lse/k$b;

    move-result-object v1

    invoke-virtual {v1, v5}, Lse/k$b;->g(Lse/k$d;)Lse/k$b;

    move-result-object v1

    invoke-virtual {v1}, Lse/k$b;->a()Lse/k;

    move-result-object v1

    const-string v2, "AES256_CTR_HMAC_SHA256_RAW"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public static d(Z)V
    .locals 4

    sget-object v0, Lse/j;->e:Lwe/b$b;

    invoke-virtual {v0}, Lwe/b$b;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Lte/e;->h()V

    invoke-static {}, Lye/a0;->c()Lye/a0;

    move-result-object v1

    sget-object v2, Lse/j;->a:Lye/h0;

    invoke-virtual {v1, v2}, Lye/a0;->d(Lye/h0;)V

    invoke-static {}, Lye/z;->a()Lye/z;

    move-result-object v1

    invoke-static {}, Lse/j;->c()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v1, v2}, Lye/z;->c(Ljava/util/Map;)V

    invoke-static {}, Lye/x;->b()Lye/x;

    move-result-object v1

    sget-object v2, Lse/j;->c:Lye/x$a;

    const-class v3, Lse/k;

    invoke-virtual {v1, v2, v3}, Lye/x;->a(Lye/x$a;Ljava/lang/Class;)V

    invoke-static {}, Lye/w;->f()Lye/w;

    move-result-object v1

    sget-object v2, Lse/j;->d:Lye/w$a;

    invoke-virtual {v1, v2, v3}, Lye/w;->b(Lye/w$a;Ljava/lang/Class;)V

    invoke-static {}, Lye/l;->d()Lye/l;

    move-result-object v1

    sget-object v2, Lse/j;->b:Lre/m;

    invoke-virtual {v1, v2, v0, p0}, Lye/l;->h(Lre/m;Lwe/b$b;Z)V

    return-void

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available."

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static e(Lse/k;)V
    .locals 2

    invoke-virtual {p0}, Lse/k;->c()I

    move-result v0

    const/16 v1, 0x10

    if-eq v0, v1, :cond_1

    invoke-virtual {p0}, Lse/k;->c()I

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
