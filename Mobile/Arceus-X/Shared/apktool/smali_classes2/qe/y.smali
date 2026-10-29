.class public final Lqe/y;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lwe/h0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwe/h0<",
            "Lqe/v;",
            "Lpe/a;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Lwe/w$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwe/w$a<",
            "Lqe/z;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Lwe/x$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwe/x$a<",
            "Lqe/z;",
            ">;"
        }
    .end annotation
.end field

.field public static final d:Lpe/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpe/m<",
            "Lpe/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lqe/w;

    invoke-direct {v0}, Lqe/w;-><init>()V

    const-class v1, Lqe/v;

    const-class v2, Lpe/a;

    invoke-static {v0, v1, v2}, Lwe/h0;->b(Lwe/h0$b;Ljava/lang/Class;Ljava/lang/Class;)Lwe/h0;

    move-result-object v0

    sput-object v0, Lqe/y;->a:Lwe/h0;

    new-instance v0, Lqe/x;

    invoke-direct {v0}, Lqe/x;-><init>()V

    sput-object v0, Lqe/y;->b:Lwe/w$a;

    new-instance v0, Lqe/h;

    invoke-direct {v0}, Lqe/h;-><init>()V

    sput-object v0, Lqe/y;->c:Lwe/x$a;

    sget-object v0, Laf/f0$c;->c:Laf/f0$c;

    invoke-static {}, Laf/n;->f0()Lcom/google/crypto/tink/shaded/protobuf/a1;

    move-result-object v1

    const-string v3, "type.googleapis.com/google.crypto.tink.AesGcmSivKey"

    invoke-static {v3, v2, v0, v1}, Lwe/o;->e(Ljava/lang/String;Ljava/lang/Class;Laf/f0$c;Lcom/google/crypto/tink/shaded/protobuf/a1;)Lpe/m;

    move-result-object v0

    sput-object v0, Lqe/y;->d:Lpe/m;

    return-void
.end method

.method public static synthetic a(Lqe/z;Ljava/lang/Integer;)Lqe/v;
    .locals 0

    invoke-static {p0, p1}, Lqe/y;->c(Lqe/z;Ljava/lang/Integer;)Lqe/v;

    move-result-object p0

    return-object p0
.end method

.method public static b()Z
    .locals 1

    :try_start_0
    const-string v0, "AES/GCM-SIV/NoPadding"

    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljavax/crypto/NoSuchPaddingException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    return v0

    :catch_0
    const/4 v0, 0x0

    return v0
.end method

.method public static c(Lqe/z;Ljava/lang/Integer;)Lqe/v;
    .locals 1

    invoke-static {}, Lqe/v;->b()Lqe/v$b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lqe/v$b;->e(Lqe/z;)Lqe/v$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lqe/v$b;->c(Ljava/lang/Integer;)Lqe/v$b;

    move-result-object p1

    invoke-virtual {p0}, Lqe/z;->c()I

    move-result p0

    invoke-static {p0}, Lef/c;->b(I)Lef/c;

    move-result-object p0

    invoke-virtual {p1, p0}, Lqe/v$b;->d(Lef/c;)Lqe/v$b;

    move-result-object p0

    invoke-virtual {p0}, Lqe/v$b;->a()Lqe/v;

    move-result-object p0

    return-object p0
.end method

.method public static d()Ljava/util/Map;
    .locals 5
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

    invoke-static {}, Lqe/z;->b()Lqe/z$b;

    move-result-object v1

    const/16 v2, 0x10

    invoke-virtual {v1, v2}, Lqe/z$b;->b(I)Lqe/z$b;

    move-result-object v1

    sget-object v3, Lqe/z$c;->b:Lqe/z$c;

    invoke-virtual {v1, v3}, Lqe/z$b;->c(Lqe/z$c;)Lqe/z$b;

    move-result-object v1

    invoke-virtual {v1}, Lqe/z$b;->a()Lqe/z;

    move-result-object v1

    const-string v4, "AES128_GCM_SIV"

    invoke-interface {v0, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lqe/z;->b()Lqe/z$b;

    move-result-object v1

    invoke-virtual {v1, v2}, Lqe/z$b;->b(I)Lqe/z$b;

    move-result-object v1

    sget-object v2, Lqe/z$c;->d:Lqe/z$c;

    invoke-virtual {v1, v2}, Lqe/z$b;->c(Lqe/z$c;)Lqe/z$b;

    move-result-object v1

    invoke-virtual {v1}, Lqe/z$b;->a()Lqe/z;

    move-result-object v1

    const-string v4, "AES128_GCM_SIV_RAW"

    invoke-interface {v0, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lqe/z;->b()Lqe/z$b;

    move-result-object v1

    const/16 v4, 0x20

    invoke-virtual {v1, v4}, Lqe/z$b;->b(I)Lqe/z$b;

    move-result-object v1

    invoke-virtual {v1, v3}, Lqe/z$b;->c(Lqe/z$c;)Lqe/z$b;

    move-result-object v1

    invoke-virtual {v1}, Lqe/z$b;->a()Lqe/z;

    move-result-object v1

    const-string v3, "AES256_GCM_SIV"

    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lqe/z;->b()Lqe/z$b;

    move-result-object v1

    invoke-virtual {v1, v4}, Lqe/z$b;->b(I)Lqe/z$b;

    move-result-object v1

    invoke-virtual {v1, v2}, Lqe/z$b;->c(Lqe/z$c;)Lqe/z$b;

    move-result-object v1

    invoke-virtual {v1}, Lqe/z$b;->a()Lqe/z;

    move-result-object v1

    const-string v2, "AES256_GCM_SIV_RAW"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public static e(Z)V
    .locals 3

    sget-object v0, Lue/b$b;->a:Lue/b$b;

    invoke-virtual {v0}, Lue/b$b;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lre/u;->g()V

    invoke-static {}, Lqe/y;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lwe/a0;->c()Lwe/a0;

    move-result-object v0

    sget-object v1, Lqe/y;->a:Lwe/h0;

    invoke-virtual {v0, v1}, Lwe/a0;->d(Lwe/h0;)V

    invoke-static {}, Lwe/z;->a()Lwe/z;

    move-result-object v0

    invoke-static {}, Lqe/y;->d()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lwe/z;->c(Ljava/util/Map;)V

    invoke-static {}, Lwe/x;->b()Lwe/x;

    move-result-object v0

    sget-object v1, Lqe/y;->c:Lwe/x$a;

    const-class v2, Lqe/z;

    invoke-virtual {v0, v1, v2}, Lwe/x;->a(Lwe/x$a;Ljava/lang/Class;)V

    invoke-static {}, Lwe/w;->f()Lwe/w;

    move-result-object v0

    sget-object v1, Lqe/y;->b:Lwe/w$a;

    invoke-virtual {v0, v1, v2}, Lwe/w;->b(Lwe/w$a;Ljava/lang/Class;)V

    invoke-static {}, Lwe/l;->d()Lwe/l;

    move-result-object v0

    sget-object v1, Lqe/y;->d:Lpe/m;

    invoke-virtual {v0, v1, p0}, Lwe/l;->g(Lpe/m;Z)V

    :cond_0
    return-void

    :cond_1
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "Registering AES GCM SIV is not supported in FIPS mode"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
