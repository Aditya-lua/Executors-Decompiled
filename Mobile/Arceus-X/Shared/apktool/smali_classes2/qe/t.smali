.class public final Lqe/t;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lwe/h0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwe/h0<",
            "Lqe/q;",
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
            "Lqe/u;",
            ">;"
        }
    .end annotation
.end field

.field public static final d:Lwe/w$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwe/w$a<",
            "Lqe/u;",
            ">;"
        }
    .end annotation
.end field

.field public static final e:Lue/b$b;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lqe/r;

    invoke-direct {v0}, Lqe/r;-><init>()V

    const-class v1, Lqe/q;

    const-class v2, Lpe/a;

    invoke-static {v0, v1, v2}, Lwe/h0;->b(Lwe/h0$b;Ljava/lang/Class;Ljava/lang/Class;)Lwe/h0;

    move-result-object v0

    sput-object v0, Lqe/t;->a:Lwe/h0;

    invoke-static {}, Lqe/t;->c()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Laf/f0$c;->c:Laf/f0$c;

    invoke-static {}, Laf/l;->f0()Lcom/google/crypto/tink/shaded/protobuf/a1;

    move-result-object v3

    invoke-static {v0, v2, v1, v3}, Lwe/o;->e(Ljava/lang/String;Ljava/lang/Class;Laf/f0$c;Lcom/google/crypto/tink/shaded/protobuf/a1;)Lpe/m;

    move-result-object v0

    sput-object v0, Lqe/t;->b:Lpe/m;

    new-instance v0, Lqe/h;

    invoke-direct {v0}, Lqe/h;-><init>()V

    sput-object v0, Lqe/t;->c:Lwe/x$a;

    new-instance v0, Lqe/s;

    invoke-direct {v0}, Lqe/s;-><init>()V

    sput-object v0, Lqe/t;->d:Lwe/w$a;

    sget-object v0, Lue/b$b;->b:Lue/b$b;

    sput-object v0, Lqe/t;->e:Lue/b$b;

    return-void
.end method

.method public static synthetic a(Lqe/u;Ljava/lang/Integer;)Lqe/q;
    .locals 0

    invoke-static {p0, p1}, Lqe/t;->b(Lqe/u;Ljava/lang/Integer;)Lqe/q;

    move-result-object p0

    return-object p0
.end method

.method public static b(Lqe/u;Ljava/lang/Integer;)Lqe/q;
    .locals 1

    invoke-static {p0}, Lqe/t;->f(Lqe/u;)V

    invoke-static {}, Lqe/q;->b()Lqe/q$b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lqe/q$b;->e(Lqe/u;)Lqe/q$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lqe/q$b;->c(Ljava/lang/Integer;)Lqe/q$b;

    move-result-object p1

    invoke-virtual {p0}, Lqe/u;->d()I

    move-result p0

    invoke-static {p0}, Lef/c;->b(I)Lef/c;

    move-result-object p0

    invoke-virtual {p1, p0}, Lqe/q$b;->d(Lef/c;)Lqe/q$b;

    move-result-object p0

    invoke-virtual {p0}, Lqe/q$b;->a()Lqe/q;

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
            "Lpe/x;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "AES128_GCM"

    sget-object v2, Lqe/j1;->a:Lqe/u;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lqe/u;->b()Lqe/u$b;

    move-result-object v1

    const/16 v2, 0xc

    invoke-virtual {v1, v2}, Lqe/u$b;->b(I)Lqe/u$b;

    move-result-object v1

    const/16 v3, 0x10

    invoke-virtual {v1, v3}, Lqe/u$b;->c(I)Lqe/u$b;

    move-result-object v1

    invoke-virtual {v1, v3}, Lqe/u$b;->d(I)Lqe/u$b;

    move-result-object v1

    sget-object v4, Lqe/u$c;->d:Lqe/u$c;

    invoke-virtual {v1, v4}, Lqe/u$b;->e(Lqe/u$c;)Lqe/u$b;

    move-result-object v1

    invoke-virtual {v1}, Lqe/u$b;->a()Lqe/u;

    move-result-object v1

    const-string v5, "AES128_GCM_RAW"

    invoke-interface {v0, v5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "AES256_GCM"

    sget-object v5, Lqe/j1;->b:Lqe/u;

    invoke-interface {v0, v1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lqe/u;->b()Lqe/u$b;

    move-result-object v1

    invoke-virtual {v1, v2}, Lqe/u$b;->b(I)Lqe/u$b;

    move-result-object v1

    const/16 v2, 0x20

    invoke-virtual {v1, v2}, Lqe/u$b;->c(I)Lqe/u$b;

    move-result-object v1

    invoke-virtual {v1, v3}, Lqe/u$b;->d(I)Lqe/u$b;

    move-result-object v1

    invoke-virtual {v1, v4}, Lqe/u$b;->e(Lqe/u$c;)Lqe/u$b;

    move-result-object v1

    invoke-virtual {v1}, Lqe/u$b;->a()Lqe/u;

    move-result-object v1

    const-string v2, "AES256_GCM_RAW"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public static e(Z)V
    .locals 4

    sget-object v0, Lqe/t;->e:Lue/b$b;

    invoke-virtual {v0}, Lue/b$b;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Lre/p;->g()V

    invoke-static {}, Lwe/a0;->c()Lwe/a0;

    move-result-object v1

    sget-object v2, Lqe/t;->a:Lwe/h0;

    invoke-virtual {v1, v2}, Lwe/a0;->d(Lwe/h0;)V

    invoke-static {}, Lwe/z;->a()Lwe/z;

    move-result-object v1

    invoke-static {}, Lqe/t;->d()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v1, v2}, Lwe/z;->c(Ljava/util/Map;)V

    invoke-static {}, Lwe/x;->b()Lwe/x;

    move-result-object v1

    sget-object v2, Lqe/t;->c:Lwe/x$a;

    const-class v3, Lqe/u;

    invoke-virtual {v1, v2, v3}, Lwe/x;->a(Lwe/x$a;Ljava/lang/Class;)V

    invoke-static {}, Lwe/w;->f()Lwe/w;

    move-result-object v1

    sget-object v2, Lqe/t;->d:Lwe/w$a;

    invoke-virtual {v1, v2, v3}, Lwe/w;->b(Lwe/w$a;Ljava/lang/Class;)V

    invoke-static {}, Lwe/l;->d()Lwe/l;

    move-result-object v1

    sget-object v2, Lqe/t;->b:Lpe/m;

    invoke-virtual {v1, v2, v0, p0}, Lwe/l;->h(Lpe/m;Lue/b$b;Z)V

    return-void

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available."

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final f(Lqe/u;)V
    .locals 1

    invoke-virtual {p0}, Lqe/u;->d()I

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
