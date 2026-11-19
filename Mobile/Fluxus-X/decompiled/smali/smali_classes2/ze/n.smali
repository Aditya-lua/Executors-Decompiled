.class public final Lze/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lye/h0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lye/h0<",
            "Lze/i;",
            "Lze/g;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Lye/h0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lye/h0<",
            "Lze/i;",
            "Lre/w;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Lre/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lre/m<",
            "Lre/w;",
            ">;"
        }
    .end annotation
.end field

.field public static final d:Lye/x$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lye/x$a<",
            "Lze/o;",
            ">;"
        }
    .end annotation
.end field

.field public static final e:Lye/w$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lye/w$a<",
            "Lze/o;",
            ">;"
        }
    .end annotation
.end field

.field public static final f:Lwe/b$b;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lze/j;

    invoke-direct {v0}, Lze/j;-><init>()V

    const-class v1, Lze/g;

    const-class v2, Lze/i;

    invoke-static {v0, v2, v1}, Lye/h0;->b(Lye/h0$b;Ljava/lang/Class;Ljava/lang/Class;)Lye/h0;

    move-result-object v0

    sput-object v0, Lze/n;->a:Lye/h0;

    new-instance v0, Lze/k;

    invoke-direct {v0}, Lze/k;-><init>()V

    const-class v1, Lre/w;

    invoke-static {v0, v2, v1}, Lye/h0;->b(Lye/h0$b;Ljava/lang/Class;Ljava/lang/Class;)Lye/h0;

    move-result-object v0

    sput-object v0, Lze/n;->b:Lye/h0;

    sget-object v0, Lcf/f0$c;->c:Lcf/f0$c;

    invoke-static {}, Lcf/c0;->i0()Lcom/google/crypto/tink/shaded/protobuf/a1;

    move-result-object v2

    const-string v3, "type.googleapis.com/google.crypto.tink.HmacKey"

    invoke-static {v3, v1, v0, v2}, Lye/o;->e(Ljava/lang/String;Ljava/lang/Class;Lcf/f0$c;Lcom/google/crypto/tink/shaded/protobuf/a1;)Lre/m;

    move-result-object v0

    sput-object v0, Lze/n;->c:Lre/m;

    new-instance v0, Lse/h;

    invoke-direct {v0}, Lse/h;-><init>()V

    sput-object v0, Lze/n;->d:Lye/x$a;

    new-instance v0, Lze/l;

    invoke-direct {v0}, Lze/l;-><init>()V

    sput-object v0, Lze/n;->e:Lye/w$a;

    sget-object v0, Lwe/b$b;->b:Lwe/b$b;

    sput-object v0, Lze/n;->f:Lwe/b$b;

    return-void
.end method

.method public static synthetic a()Lre/o;
    .locals 2

    invoke-static {}, Lze/o;->b()Lze/o$b;

    move-result-object v0

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Lze/o$b;->c(I)Lze/o$b;

    move-result-object v0

    const/16 v1, 0x10

    invoke-virtual {v0, v1}, Lze/o$b;->d(I)Lze/o$b;

    move-result-object v0

    sget-object v1, Lze/o$c;->d:Lze/o$c;

    invoke-virtual {v0, v1}, Lze/o$b;->b(Lze/o$c;)Lze/o$b;

    move-result-object v0

    sget-object v1, Lze/o$d;->b:Lze/o$d;

    invoke-virtual {v0, v1}, Lze/o$b;->e(Lze/o$d;)Lze/o$b;

    move-result-object v0

    invoke-virtual {v0}, Lze/o$b;->a()Lze/o;

    move-result-object v0

    invoke-static {v0}, Lre/o;->a(Lre/x;)Lre/o;

    move-result-object v0

    return-object v0
.end method

.method public static b(Lze/o;Ljava/lang/Integer;)Lze/i;
    .locals 1

    invoke-static {}, Lze/i;->b()Lze/i$b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lze/i$b;->e(Lze/o;)Lze/i$b;

    move-result-object v0

    invoke-virtual {p0}, Lze/o;->e()I

    move-result p0

    invoke-static {p0}, Lgf/c;->b(I)Lgf/c;

    move-result-object p0

    invoke-virtual {v0, p0}, Lze/i$b;->d(Lgf/c;)Lze/i$b;

    move-result-object p0

    invoke-virtual {p0, p1}, Lze/i$b;->c(Ljava/lang/Integer;)Lze/i$b;

    move-result-object p0

    invoke-virtual {p0}, Lze/i$b;->a()Lze/i;

    move-result-object p0

    return-object p0
.end method

.method public static final c()Lre/o;
    .locals 1

    new-instance v0, Lze/m;

    invoke-direct {v0}, Lze/m;-><init>()V

    invoke-static {v0}, Lye/r0;->a(Lye/r0$a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lre/o;

    return-object v0
.end method

.method public static d()Ljava/util/Map;
    .locals 9
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

    const-string v1, "HMAC_SHA256_128BITTAG"

    sget-object v2, Lze/z;->a:Lze/o;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lze/o;->b()Lze/o$b;

    move-result-object v1

    const/16 v2, 0x20

    invoke-virtual {v1, v2}, Lze/o$b;->c(I)Lze/o$b;

    move-result-object v1

    const/16 v3, 0x10

    invoke-virtual {v1, v3}, Lze/o$b;->d(I)Lze/o$b;

    move-result-object v1

    sget-object v4, Lze/o$d;->e:Lze/o$d;

    invoke-virtual {v1, v4}, Lze/o$b;->e(Lze/o$d;)Lze/o$b;

    move-result-object v1

    sget-object v5, Lze/o$c;->d:Lze/o$c;

    invoke-virtual {v1, v5}, Lze/o$b;->b(Lze/o$c;)Lze/o$b;

    move-result-object v1

    invoke-virtual {v1}, Lze/o$b;->a()Lze/o;

    move-result-object v1

    const-string v6, "HMAC_SHA256_128BITTAG_RAW"

    invoke-interface {v0, v6, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lze/o;->b()Lze/o$b;

    move-result-object v1

    invoke-virtual {v1, v2}, Lze/o$b;->c(I)Lze/o$b;

    move-result-object v1

    invoke-virtual {v1, v2}, Lze/o$b;->d(I)Lze/o$b;

    move-result-object v1

    sget-object v6, Lze/o$d;->b:Lze/o$d;

    invoke-virtual {v1, v6}, Lze/o$b;->e(Lze/o$d;)Lze/o$b;

    move-result-object v1

    invoke-virtual {v1, v5}, Lze/o$b;->b(Lze/o$c;)Lze/o$b;

    move-result-object v1

    invoke-virtual {v1}, Lze/o$b;->a()Lze/o;

    move-result-object v1

    const-string v7, "HMAC_SHA256_256BITTAG"

    invoke-interface {v0, v7, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lze/o;->b()Lze/o$b;

    move-result-object v1

    invoke-virtual {v1, v2}, Lze/o$b;->c(I)Lze/o$b;

    move-result-object v1

    invoke-virtual {v1, v2}, Lze/o$b;->d(I)Lze/o$b;

    move-result-object v1

    invoke-virtual {v1, v4}, Lze/o$b;->e(Lze/o$d;)Lze/o$b;

    move-result-object v1

    invoke-virtual {v1, v5}, Lze/o$b;->b(Lze/o$c;)Lze/o$b;

    move-result-object v1

    invoke-virtual {v1}, Lze/o$b;->a()Lze/o;

    move-result-object v1

    const-string v5, "HMAC_SHA256_256BITTAG_RAW"

    invoke-interface {v0, v5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lze/o;->b()Lze/o$b;

    move-result-object v1

    const/16 v5, 0x40

    invoke-virtual {v1, v5}, Lze/o$b;->c(I)Lze/o$b;

    move-result-object v1

    invoke-virtual {v1, v3}, Lze/o$b;->d(I)Lze/o$b;

    move-result-object v1

    invoke-virtual {v1, v6}, Lze/o$b;->e(Lze/o$d;)Lze/o$b;

    move-result-object v1

    sget-object v7, Lze/o$c;->f:Lze/o$c;

    invoke-virtual {v1, v7}, Lze/o$b;->b(Lze/o$c;)Lze/o$b;

    move-result-object v1

    invoke-virtual {v1}, Lze/o$b;->a()Lze/o;

    move-result-object v1

    const-string v8, "HMAC_SHA512_128BITTAG"

    invoke-interface {v0, v8, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lze/o;->b()Lze/o$b;

    move-result-object v1

    invoke-virtual {v1, v5}, Lze/o$b;->c(I)Lze/o$b;

    move-result-object v1

    invoke-virtual {v1, v3}, Lze/o$b;->d(I)Lze/o$b;

    move-result-object v1

    invoke-virtual {v1, v4}, Lze/o$b;->e(Lze/o$d;)Lze/o$b;

    move-result-object v1

    invoke-virtual {v1, v7}, Lze/o$b;->b(Lze/o$c;)Lze/o$b;

    move-result-object v1

    invoke-virtual {v1}, Lze/o$b;->a()Lze/o;

    move-result-object v1

    const-string v3, "HMAC_SHA512_128BITTAG_RAW"

    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lze/o;->b()Lze/o$b;

    move-result-object v1

    invoke-virtual {v1, v5}, Lze/o$b;->c(I)Lze/o$b;

    move-result-object v1

    invoke-virtual {v1, v2}, Lze/o$b;->d(I)Lze/o$b;

    move-result-object v1

    invoke-virtual {v1, v6}, Lze/o$b;->e(Lze/o$d;)Lze/o$b;

    move-result-object v1

    invoke-virtual {v1, v7}, Lze/o$b;->b(Lze/o$c;)Lze/o$b;

    move-result-object v1

    invoke-virtual {v1}, Lze/o$b;->a()Lze/o;

    move-result-object v1

    const-string v3, "HMAC_SHA512_256BITTAG"

    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lze/o;->b()Lze/o$b;

    move-result-object v1

    invoke-virtual {v1, v5}, Lze/o$b;->c(I)Lze/o$b;

    move-result-object v1

    invoke-virtual {v1, v2}, Lze/o$b;->d(I)Lze/o$b;

    move-result-object v1

    invoke-virtual {v1, v4}, Lze/o$b;->e(Lze/o$d;)Lze/o$b;

    move-result-object v1

    invoke-virtual {v1, v7}, Lze/o$b;->b(Lze/o$c;)Lze/o$b;

    move-result-object v1

    invoke-virtual {v1}, Lze/o$b;->a()Lze/o;

    move-result-object v1

    const-string v2, "HMAC_SHA512_256BITTAG_RAW"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "HMAC_SHA512_512BITTAG"

    sget-object v2, Lze/z;->d:Lze/o;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lze/o;->b()Lze/o$b;

    move-result-object v1

    invoke-virtual {v1, v5}, Lze/o$b;->c(I)Lze/o$b;

    move-result-object v1

    invoke-virtual {v1, v5}, Lze/o$b;->d(I)Lze/o$b;

    move-result-object v1

    invoke-virtual {v1, v4}, Lze/o$b;->e(Lze/o$d;)Lze/o$b;

    move-result-object v1

    invoke-virtual {v1, v7}, Lze/o$b;->b(Lze/o$c;)Lze/o$b;

    move-result-object v1

    invoke-virtual {v1}, Lze/o$b;->a()Lze/o;

    move-result-object v1

    const-string v2, "HMAC_SHA512_512BITTAG_RAW"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public static e(Z)V
    .locals 4

    sget-object v0, Lze/n;->f:Lwe/b$b;

    invoke-virtual {v0}, Lwe/b$b;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Laf/m;->h()V

    invoke-static {}, Lye/a0;->c()Lye/a0;

    move-result-object v1

    sget-object v2, Lze/n;->a:Lye/h0;

    invoke-virtual {v1, v2}, Lye/a0;->d(Lye/h0;)V

    invoke-static {}, Lye/a0;->c()Lye/a0;

    move-result-object v1

    sget-object v2, Lze/n;->b:Lye/h0;

    invoke-virtual {v1, v2}, Lye/a0;->d(Lye/h0;)V

    invoke-static {}, Lye/z;->a()Lye/z;

    move-result-object v1

    invoke-static {}, Lze/n;->d()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v1, v2}, Lye/z;->c(Ljava/util/Map;)V

    invoke-static {}, Lye/w;->f()Lye/w;

    move-result-object v1

    sget-object v2, Lze/n;->e:Lye/w$a;

    const-class v3, Lze/o;

    invoke-virtual {v1, v2, v3}, Lye/w;->b(Lye/w$a;Ljava/lang/Class;)V

    invoke-static {}, Lye/x;->b()Lye/x;

    move-result-object v1

    sget-object v2, Lze/n;->d:Lye/x$a;

    invoke-virtual {v1, v2, v3}, Lye/x;->a(Lye/x$a;Ljava/lang/Class;)V

    invoke-static {}, Lye/l;->d()Lye/l;

    move-result-object v1

    sget-object v2, Lze/n;->c:Lre/m;

    invoke-virtual {v1, v2, v0, p0}, Lye/l;->h(Lre/m;Lwe/b$b;Z)V

    return-void

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "Can not use HMAC in FIPS-mode, as BoringCrypto module is not available."

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
