.class public final Lxe/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lwe/h0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwe/h0<",
            "Lxe/i;",
            "Lxe/g;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Lwe/h0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwe/h0<",
            "Lxe/i;",
            "Lpe/w;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Lpe/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpe/m<",
            "Lpe/w;",
            ">;"
        }
    .end annotation
.end field

.field public static final d:Lwe/x$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwe/x$a<",
            "Lxe/o;",
            ">;"
        }
    .end annotation
.end field

.field public static final e:Lwe/w$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwe/w$a<",
            "Lxe/o;",
            ">;"
        }
    .end annotation
.end field

.field public static final f:Lue/b$b;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lxe/j;

    invoke-direct {v0}, Lxe/j;-><init>()V

    const-class v1, Lxe/g;

    const-class v2, Lxe/i;

    invoke-static {v0, v2, v1}, Lwe/h0;->b(Lwe/h0$b;Ljava/lang/Class;Ljava/lang/Class;)Lwe/h0;

    move-result-object v0

    sput-object v0, Lxe/n;->a:Lwe/h0;

    new-instance v0, Lxe/k;

    invoke-direct {v0}, Lxe/k;-><init>()V

    const-class v1, Lpe/w;

    invoke-static {v0, v2, v1}, Lwe/h0;->b(Lwe/h0$b;Ljava/lang/Class;Ljava/lang/Class;)Lwe/h0;

    move-result-object v0

    sput-object v0, Lxe/n;->b:Lwe/h0;

    sget-object v0, Laf/f0$c;->c:Laf/f0$c;

    invoke-static {}, Laf/c0;->i0()Lcom/google/crypto/tink/shaded/protobuf/a1;

    move-result-object v2

    const-string v3, "type.googleapis.com/google.crypto.tink.HmacKey"

    invoke-static {v3, v1, v0, v2}, Lwe/o;->e(Ljava/lang/String;Ljava/lang/Class;Laf/f0$c;Lcom/google/crypto/tink/shaded/protobuf/a1;)Lpe/m;

    move-result-object v0

    sput-object v0, Lxe/n;->c:Lpe/m;

    new-instance v0, Lqe/h;

    invoke-direct {v0}, Lqe/h;-><init>()V

    sput-object v0, Lxe/n;->d:Lwe/x$a;

    new-instance v0, Lxe/l;

    invoke-direct {v0}, Lxe/l;-><init>()V

    sput-object v0, Lxe/n;->e:Lwe/w$a;

    sget-object v0, Lue/b$b;->b:Lue/b$b;

    sput-object v0, Lxe/n;->f:Lue/b$b;

    return-void
.end method

.method public static synthetic a()Lpe/o;
    .locals 2

    invoke-static {}, Lxe/o;->b()Lxe/o$b;

    move-result-object v0

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Lxe/o$b;->c(I)Lxe/o$b;

    move-result-object v0

    const/16 v1, 0x10

    invoke-virtual {v0, v1}, Lxe/o$b;->d(I)Lxe/o$b;

    move-result-object v0

    sget-object v1, Lxe/o$c;->d:Lxe/o$c;

    invoke-virtual {v0, v1}, Lxe/o$b;->b(Lxe/o$c;)Lxe/o$b;

    move-result-object v0

    sget-object v1, Lxe/o$d;->b:Lxe/o$d;

    invoke-virtual {v0, v1}, Lxe/o$b;->e(Lxe/o$d;)Lxe/o$b;

    move-result-object v0

    invoke-virtual {v0}, Lxe/o$b;->a()Lxe/o;

    move-result-object v0

    invoke-static {v0}, Lpe/o;->a(Lpe/x;)Lpe/o;

    move-result-object v0

    return-object v0
.end method

.method public static b(Lxe/o;Ljava/lang/Integer;)Lxe/i;
    .locals 1

    invoke-static {}, Lxe/i;->b()Lxe/i$b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lxe/i$b;->e(Lxe/o;)Lxe/i$b;

    move-result-object v0

    invoke-virtual {p0}, Lxe/o;->e()I

    move-result p0

    invoke-static {p0}, Lef/c;->b(I)Lef/c;

    move-result-object p0

    invoke-virtual {v0, p0}, Lxe/i$b;->d(Lef/c;)Lxe/i$b;

    move-result-object p0

    invoke-virtual {p0, p1}, Lxe/i$b;->c(Ljava/lang/Integer;)Lxe/i$b;

    move-result-object p0

    invoke-virtual {p0}, Lxe/i$b;->a()Lxe/i;

    move-result-object p0

    return-object p0
.end method

.method public static final c()Lpe/o;
    .locals 1

    new-instance v0, Lxe/m;

    invoke-direct {v0}, Lxe/m;-><init>()V

    invoke-static {v0}, Lwe/r0;->a(Lwe/r0$a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpe/o;

    return-object v0
.end method

.method public static d()Ljava/util/Map;
    .locals 9
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

    const-string v1, "HMAC_SHA256_128BITTAG"

    sget-object v2, Lxe/z;->a:Lxe/o;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lxe/o;->b()Lxe/o$b;

    move-result-object v1

    const/16 v2, 0x20

    invoke-virtual {v1, v2}, Lxe/o$b;->c(I)Lxe/o$b;

    move-result-object v1

    const/16 v3, 0x10

    invoke-virtual {v1, v3}, Lxe/o$b;->d(I)Lxe/o$b;

    move-result-object v1

    sget-object v4, Lxe/o$d;->e:Lxe/o$d;

    invoke-virtual {v1, v4}, Lxe/o$b;->e(Lxe/o$d;)Lxe/o$b;

    move-result-object v1

    sget-object v5, Lxe/o$c;->d:Lxe/o$c;

    invoke-virtual {v1, v5}, Lxe/o$b;->b(Lxe/o$c;)Lxe/o$b;

    move-result-object v1

    invoke-virtual {v1}, Lxe/o$b;->a()Lxe/o;

    move-result-object v1

    const-string v6, "HMAC_SHA256_128BITTAG_RAW"

    invoke-interface {v0, v6, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lxe/o;->b()Lxe/o$b;

    move-result-object v1

    invoke-virtual {v1, v2}, Lxe/o$b;->c(I)Lxe/o$b;

    move-result-object v1

    invoke-virtual {v1, v2}, Lxe/o$b;->d(I)Lxe/o$b;

    move-result-object v1

    sget-object v6, Lxe/o$d;->b:Lxe/o$d;

    invoke-virtual {v1, v6}, Lxe/o$b;->e(Lxe/o$d;)Lxe/o$b;

    move-result-object v1

    invoke-virtual {v1, v5}, Lxe/o$b;->b(Lxe/o$c;)Lxe/o$b;

    move-result-object v1

    invoke-virtual {v1}, Lxe/o$b;->a()Lxe/o;

    move-result-object v1

    const-string v7, "HMAC_SHA256_256BITTAG"

    invoke-interface {v0, v7, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lxe/o;->b()Lxe/o$b;

    move-result-object v1

    invoke-virtual {v1, v2}, Lxe/o$b;->c(I)Lxe/o$b;

    move-result-object v1

    invoke-virtual {v1, v2}, Lxe/o$b;->d(I)Lxe/o$b;

    move-result-object v1

    invoke-virtual {v1, v4}, Lxe/o$b;->e(Lxe/o$d;)Lxe/o$b;

    move-result-object v1

    invoke-virtual {v1, v5}, Lxe/o$b;->b(Lxe/o$c;)Lxe/o$b;

    move-result-object v1

    invoke-virtual {v1}, Lxe/o$b;->a()Lxe/o;

    move-result-object v1

    const-string v5, "HMAC_SHA256_256BITTAG_RAW"

    invoke-interface {v0, v5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lxe/o;->b()Lxe/o$b;

    move-result-object v1

    const/16 v5, 0x40

    invoke-virtual {v1, v5}, Lxe/o$b;->c(I)Lxe/o$b;

    move-result-object v1

    invoke-virtual {v1, v3}, Lxe/o$b;->d(I)Lxe/o$b;

    move-result-object v1

    invoke-virtual {v1, v6}, Lxe/o$b;->e(Lxe/o$d;)Lxe/o$b;

    move-result-object v1

    sget-object v7, Lxe/o$c;->f:Lxe/o$c;

    invoke-virtual {v1, v7}, Lxe/o$b;->b(Lxe/o$c;)Lxe/o$b;

    move-result-object v1

    invoke-virtual {v1}, Lxe/o$b;->a()Lxe/o;

    move-result-object v1

    const-string v8, "HMAC_SHA512_128BITTAG"

    invoke-interface {v0, v8, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lxe/o;->b()Lxe/o$b;

    move-result-object v1

    invoke-virtual {v1, v5}, Lxe/o$b;->c(I)Lxe/o$b;

    move-result-object v1

    invoke-virtual {v1, v3}, Lxe/o$b;->d(I)Lxe/o$b;

    move-result-object v1

    invoke-virtual {v1, v4}, Lxe/o$b;->e(Lxe/o$d;)Lxe/o$b;

    move-result-object v1

    invoke-virtual {v1, v7}, Lxe/o$b;->b(Lxe/o$c;)Lxe/o$b;

    move-result-object v1

    invoke-virtual {v1}, Lxe/o$b;->a()Lxe/o;

    move-result-object v1

    const-string v3, "HMAC_SHA512_128BITTAG_RAW"

    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lxe/o;->b()Lxe/o$b;

    move-result-object v1

    invoke-virtual {v1, v5}, Lxe/o$b;->c(I)Lxe/o$b;

    move-result-object v1

    invoke-virtual {v1, v2}, Lxe/o$b;->d(I)Lxe/o$b;

    move-result-object v1

    invoke-virtual {v1, v6}, Lxe/o$b;->e(Lxe/o$d;)Lxe/o$b;

    move-result-object v1

    invoke-virtual {v1, v7}, Lxe/o$b;->b(Lxe/o$c;)Lxe/o$b;

    move-result-object v1

    invoke-virtual {v1}, Lxe/o$b;->a()Lxe/o;

    move-result-object v1

    const-string v3, "HMAC_SHA512_256BITTAG"

    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lxe/o;->b()Lxe/o$b;

    move-result-object v1

    invoke-virtual {v1, v5}, Lxe/o$b;->c(I)Lxe/o$b;

    move-result-object v1

    invoke-virtual {v1, v2}, Lxe/o$b;->d(I)Lxe/o$b;

    move-result-object v1

    invoke-virtual {v1, v4}, Lxe/o$b;->e(Lxe/o$d;)Lxe/o$b;

    move-result-object v1

    invoke-virtual {v1, v7}, Lxe/o$b;->b(Lxe/o$c;)Lxe/o$b;

    move-result-object v1

    invoke-virtual {v1}, Lxe/o$b;->a()Lxe/o;

    move-result-object v1

    const-string v2, "HMAC_SHA512_256BITTAG_RAW"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "HMAC_SHA512_512BITTAG"

    sget-object v2, Lxe/z;->d:Lxe/o;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lxe/o;->b()Lxe/o$b;

    move-result-object v1

    invoke-virtual {v1, v5}, Lxe/o$b;->c(I)Lxe/o$b;

    move-result-object v1

    invoke-virtual {v1, v5}, Lxe/o$b;->d(I)Lxe/o$b;

    move-result-object v1

    invoke-virtual {v1, v4}, Lxe/o$b;->e(Lxe/o$d;)Lxe/o$b;

    move-result-object v1

    invoke-virtual {v1, v7}, Lxe/o$b;->b(Lxe/o$c;)Lxe/o$b;

    move-result-object v1

    invoke-virtual {v1}, Lxe/o$b;->a()Lxe/o;

    move-result-object v1

    const-string v2, "HMAC_SHA512_512BITTAG_RAW"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public static e(Z)V
    .locals 4

    sget-object v0, Lxe/n;->f:Lue/b$b;

    invoke-virtual {v0}, Lue/b$b;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Lye/m;->h()V

    invoke-static {}, Lwe/a0;->c()Lwe/a0;

    move-result-object v1

    sget-object v2, Lxe/n;->a:Lwe/h0;

    invoke-virtual {v1, v2}, Lwe/a0;->d(Lwe/h0;)V

    invoke-static {}, Lwe/a0;->c()Lwe/a0;

    move-result-object v1

    sget-object v2, Lxe/n;->b:Lwe/h0;

    invoke-virtual {v1, v2}, Lwe/a0;->d(Lwe/h0;)V

    invoke-static {}, Lwe/z;->a()Lwe/z;

    move-result-object v1

    invoke-static {}, Lxe/n;->d()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v1, v2}, Lwe/z;->c(Ljava/util/Map;)V

    invoke-static {}, Lwe/w;->f()Lwe/w;

    move-result-object v1

    sget-object v2, Lxe/n;->e:Lwe/w$a;

    const-class v3, Lxe/o;

    invoke-virtual {v1, v2, v3}, Lwe/w;->b(Lwe/w$a;Ljava/lang/Class;)V

    invoke-static {}, Lwe/x;->b()Lwe/x;

    move-result-object v1

    sget-object v2, Lxe/n;->d:Lwe/x$a;

    invoke-virtual {v1, v2, v3}, Lwe/x;->a(Lwe/x$a;Ljava/lang/Class;)V

    invoke-static {}, Lwe/l;->d()Lwe/l;

    move-result-object v1

    sget-object v2, Lxe/n;->c:Lpe/m;

    invoke-virtual {v1, v2, v0, p0}, Lwe/l;->h(Lpe/m;Lue/b$b;Z)V

    return-void

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "Can not use HMAC in FIPS-mode, as BoringCrypto module is not available."

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
