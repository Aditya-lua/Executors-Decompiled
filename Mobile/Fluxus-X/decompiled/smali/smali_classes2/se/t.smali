.class public final Lse/t;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lye/h0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lye/h0<",
            "Lse/q;",
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
            "Lse/u;",
            ">;"
        }
    .end annotation
.end field

.field public static final d:Lye/w$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lye/w$a<",
            "Lse/u;",
            ">;"
        }
    .end annotation
.end field

.field public static final e:Lwe/b$b;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lse/r;

    invoke-direct {v0}, Lse/r;-><init>()V

    const-class v1, Lse/q;

    const-class v2, Lre/a;

    invoke-static {v0, v1, v2}, Lye/h0;->b(Lye/h0$b;Ljava/lang/Class;Ljava/lang/Class;)Lye/h0;

    move-result-object v0

    sput-object v0, Lse/t;->a:Lye/h0;

    invoke-static {}, Lse/t;->c()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcf/f0$c;->c:Lcf/f0$c;

    invoke-static {}, Lcf/l;->f0()Lcom/google/crypto/tink/shaded/protobuf/a1;

    move-result-object v3

    invoke-static {v0, v2, v1, v3}, Lye/o;->e(Ljava/lang/String;Ljava/lang/Class;Lcf/f0$c;Lcom/google/crypto/tink/shaded/protobuf/a1;)Lre/m;

    move-result-object v0

    sput-object v0, Lse/t;->b:Lre/m;

    new-instance v0, Lse/h;

    invoke-direct {v0}, Lse/h;-><init>()V

    sput-object v0, Lse/t;->c:Lye/x$a;

    new-instance v0, Lse/s;

    invoke-direct {v0}, Lse/s;-><init>()V

    sput-object v0, Lse/t;->d:Lye/w$a;

    sget-object v0, Lwe/b$b;->b:Lwe/b$b;

    sput-object v0, Lse/t;->e:Lwe/b$b;

    return-void
.end method

.method public static synthetic a(Lse/u;Ljava/lang/Integer;)Lse/q;
    .locals 0

    invoke-static {p0, p1}, Lse/t;->b(Lse/u;Ljava/lang/Integer;)Lse/q;

    move-result-object p0

    return-object p0
.end method

.method public static b(Lse/u;Ljava/lang/Integer;)Lse/q;
    .locals 1

    invoke-static {p0}, Lse/t;->f(Lse/u;)V

    invoke-static {}, Lse/q;->b()Lse/q$b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lse/q$b;->e(Lse/u;)Lse/q$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lse/q$b;->c(Ljava/lang/Integer;)Lse/q$b;

    move-result-object p1

    invoke-virtual {p0}, Lse/u;->d()I

    move-result p0

    invoke-static {p0}, Lgf/c;->b(I)Lgf/c;

    move-result-object p0

    invoke-virtual {p1, p0}, Lse/q$b;->d(Lgf/c;)Lse/q$b;

    move-result-object p0

    invoke-virtual {p0}, Lse/q$b;->a()Lse/q;

    move-result-object p0

    return-object p0
.end method

.method public static c()Ljava/lang/String;
    .locals 1

    const-string v0, "type.googleapis.com/google.crypto.tink.AesGcmKey"

    return-object v0
.end method

.method public static d()Ljava/util/Map;
    .locals 6
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

    const-string v1, "AES128_GCM"

    sget-object v2, Lse/j1;->a:Lse/u;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lse/u;->b()Lse/u$b;

    move-result-object v1

    const/16 v2, 0xc

    invoke-virtual {v1, v2}, Lse/u$b;->b(I)Lse/u$b;

    move-result-object v1

    const/16 v3, 0x10

    invoke-virtual {v1, v3}, Lse/u$b;->c(I)Lse/u$b;

    move-result-object v1

    invoke-virtual {v1, v3}, Lse/u$b;->d(I)Lse/u$b;

    move-result-object v1

    sget-object v4, Lse/u$c;->d:Lse/u$c;

    invoke-virtual {v1, v4}, Lse/u$b;->e(Lse/u$c;)Lse/u$b;

    move-result-object v1

    invoke-virtual {v1}, Lse/u$b;->a()Lse/u;

    move-result-object v1

    const-string v5, "AES128_GCM_RAW"

    invoke-interface {v0, v5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "AES256_GCM"

    sget-object v5, Lse/j1;->b:Lse/u;

    invoke-interface {v0, v1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lse/u;->b()Lse/u$b;

    move-result-object v1

    invoke-virtual {v1, v2}, Lse/u$b;->b(I)Lse/u$b;

    move-result-object v1

    const/16 v2, 0x20

    invoke-virtual {v1, v2}, Lse/u$b;->c(I)Lse/u$b;

    move-result-object v1

    invoke-virtual {v1, v3}, Lse/u$b;->d(I)Lse/u$b;

    move-result-object v1

    invoke-virtual {v1, v4}, Lse/u$b;->e(Lse/u$c;)Lse/u$b;

    move-result-object v1

    invoke-virtual {v1}, Lse/u$b;->a()Lse/u;

    move-result-object v1

    const-string v2, "AES256_GCM_RAW"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public static e(Z)V
    .locals 4

    sget-object v0, Lse/t;->e:Lwe/b$b;

    invoke-virtual {v0}, Lwe/b$b;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Lte/p;->g()V

    invoke-static {}, Lye/a0;->c()Lye/a0;

    move-result-object v1

    sget-object v2, Lse/t;->a:Lye/h0;

    invoke-virtual {v1, v2}, Lye/a0;->d(Lye/h0;)V

    invoke-static {}, Lye/z;->a()Lye/z;

    move-result-object v1

    invoke-static {}, Lse/t;->d()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v1, v2}, Lye/z;->c(Ljava/util/Map;)V

    invoke-static {}, Lye/x;->b()Lye/x;

    move-result-object v1

    sget-object v2, Lse/t;->c:Lye/x$a;

    const-class v3, Lse/u;

    invoke-virtual {v1, v2, v3}, Lye/x;->a(Lye/x$a;Ljava/lang/Class;)V

    invoke-static {}, Lye/w;->f()Lye/w;

    move-result-object v1

    sget-object v2, Lse/t;->d:Lye/w$a;

    invoke-virtual {v1, v2, v3}, Lye/w;->b(Lye/w$a;Ljava/lang/Class;)V

    invoke-static {}, Lye/l;->d()Lye/l;

    move-result-object v1

    sget-object v2, Lse/t;->b:Lre/m;

    invoke-virtual {v1, v2, v0, p0}, Lye/l;->h(Lre/m;Lwe/b$b;Z)V

    return-void

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available."

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final f(Lse/u;)V
    .locals 1

    invoke-virtual {p0}, Lse/u;->d()I

    move-result p0

    const/16 v0, 0x18

    if-eq p0, v0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "192 bit AES GCM Parameters are not valid"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
