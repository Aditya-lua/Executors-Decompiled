.class public final Lse/y;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lye/h0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lye/h0<",
            "Lse/v;",
            "Lre/a;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Lye/w$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lye/w$a<",
            "Lse/z;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Lye/x$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lye/x$a<",
            "Lse/z;",
            ">;"
        }
    .end annotation
.end field

.field public static final d:Lre/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lre/m<",
            "Lre/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lse/w;

    invoke-direct {v0}, Lse/w;-><init>()V

    const-class v1, Lse/v;

    const-class v2, Lre/a;

    invoke-static {v0, v1, v2}, Lye/h0;->b(Lye/h0$b;Ljava/lang/Class;Ljava/lang/Class;)Lye/h0;

    move-result-object v0

    sput-object v0, Lse/y;->a:Lye/h0;

    new-instance v0, Lse/x;

    invoke-direct {v0}, Lse/x;-><init>()V

    sput-object v0, Lse/y;->b:Lye/w$a;

    new-instance v0, Lse/h;

    invoke-direct {v0}, Lse/h;-><init>()V

    sput-object v0, Lse/y;->c:Lye/x$a;

    sget-object v0, Lcf/f0$c;->c:Lcf/f0$c;

    invoke-static {}, Lcf/n;->f0()Lcom/google/crypto/tink/shaded/protobuf/a1;

    move-result-object v1

    const-string v3, "type.googleapis.com/google.crypto.tink.AesGcmSivKey"

    invoke-static {v3, v2, v0, v1}, Lye/o;->e(Ljava/lang/String;Ljava/lang/Class;Lcf/f0$c;Lcom/google/crypto/tink/shaded/protobuf/a1;)Lre/m;

    move-result-object v0

    sput-object v0, Lse/y;->d:Lre/m;

    return-void
.end method

.method public static synthetic a(Lse/z;Ljava/lang/Integer;)Lse/v;
    .locals 0

    invoke-static {p0, p1}, Lse/y;->c(Lse/z;Ljava/lang/Integer;)Lse/v;

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

.method public static c(Lse/z;Ljava/lang/Integer;)Lse/v;
    .locals 1

    invoke-static {}, Lse/v;->b()Lse/v$b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lse/v$b;->e(Lse/z;)Lse/v$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lse/v$b;->c(Ljava/lang/Integer;)Lse/v$b;

    move-result-object p1

    invoke-virtual {p0}, Lse/z;->c()I

    move-result p0

    invoke-static {p0}, Lgf/c;->b(I)Lgf/c;

    move-result-object p0

    invoke-virtual {p1, p0}, Lse/v$b;->d(Lgf/c;)Lse/v$b;

    move-result-object p0

    invoke-virtual {p0}, Lse/v$b;->a()Lse/v;

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
            "Lre/x;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {}, Lse/z;->b()Lse/z$b;

    move-result-object v1

    const/16 v2, 0x10

    invoke-virtual {v1, v2}, Lse/z$b;->b(I)Lse/z$b;

    move-result-object v1

    sget-object v3, Lse/z$c;->b:Lse/z$c;

    invoke-virtual {v1, v3}, Lse/z$b;->c(Lse/z$c;)Lse/z$b;

    move-result-object v1

    invoke-virtual {v1}, Lse/z$b;->a()Lse/z;

    move-result-object v1

    const-string v4, "AES128_GCM_SIV"

    invoke-interface {v0, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lse/z;->b()Lse/z$b;

    move-result-object v1

    invoke-virtual {v1, v2}, Lse/z$b;->b(I)Lse/z$b;

    move-result-object v1

    sget-object v2, Lse/z$c;->d:Lse/z$c;

    invoke-virtual {v1, v2}, Lse/z$b;->c(Lse/z$c;)Lse/z$b;

    move-result-object v1

    invoke-virtual {v1}, Lse/z$b;->a()Lse/z;

    move-result-object v1

    const-string v4, "AES128_GCM_SIV_RAW"

    invoke-interface {v0, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lse/z;->b()Lse/z$b;

    move-result-object v1

    const/16 v4, 0x20

    invoke-virtual {v1, v4}, Lse/z$b;->b(I)Lse/z$b;

    move-result-object v1

    invoke-virtual {v1, v3}, Lse/z$b;->c(Lse/z$c;)Lse/z$b;

    move-result-object v1

    invoke-virtual {v1}, Lse/z$b;->a()Lse/z;

    move-result-object v1

    const-string v3, "AES256_GCM_SIV"

    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lse/z;->b()Lse/z$b;

    move-result-object v1

    invoke-virtual {v1, v4}, Lse/z$b;->b(I)Lse/z$b;

    move-result-object v1

    invoke-virtual {v1, v2}, Lse/z$b;->c(Lse/z$c;)Lse/z$b;

    move-result-object v1

    invoke-virtual {v1}, Lse/z$b;->a()Lse/z;

    move-result-object v1

    const-string v2, "AES256_GCM_SIV_RAW"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public static e(Z)V
    .locals 3

    sget-object v0, Lwe/b$b;->a:Lwe/b$b;

    invoke-virtual {v0}, Lwe/b$b;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lte/u;->g()V

    invoke-static {}, Lse/y;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lye/a0;->c()Lye/a0;

    move-result-object v0

    sget-object v1, Lse/y;->a:Lye/h0;

    invoke-virtual {v0, v1}, Lye/a0;->d(Lye/h0;)V

    invoke-static {}, Lye/z;->a()Lye/z;

    move-result-object v0

    invoke-static {}, Lse/y;->d()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lye/z;->c(Ljava/util/Map;)V

    invoke-static {}, Lye/x;->b()Lye/x;

    move-result-object v0

    sget-object v1, Lse/y;->c:Lye/x$a;

    const-class v2, Lse/z;

    invoke-virtual {v0, v1, v2}, Lye/x;->a(Lye/x$a;Ljava/lang/Class;)V

    invoke-static {}, Lye/w;->f()Lye/w;

    move-result-object v0

    sget-object v1, Lse/y;->b:Lye/w$a;

    invoke-virtual {v0, v1, v2}, Lye/w;->b(Lye/w$a;Ljava/lang/Class;)V

    invoke-static {}, Lye/l;->d()Lye/l;

    move-result-object v0

    sget-object v1, Lse/y;->d:Lre/m;

    invoke-virtual {v0, v1, p0}, Lye/l;->g(Lre/m;Z)V

    :cond_0
    return-void

    :cond_1
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "Registering AES GCM SIV is not supported in FIPS mode"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
