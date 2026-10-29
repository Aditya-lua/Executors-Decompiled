.class public final Lxe/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lwe/w$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwe/w$a<",
            "Lxe/f;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Lwe/h0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwe/h0<",
            "Lxe/a;",
            "Lxe/g;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Lwe/h0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwe/h0<",
            "Lxe/a;",
            "Lpe/w;",
            ">;"
        }
    .end annotation
.end field

.field public static final d:Lpe/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpe/m<",
            "Lpe/w;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lxe/b;

    invoke-direct {v0}, Lxe/b;-><init>()V

    sput-object v0, Lxe/e;->a:Lwe/w$a;

    new-instance v0, Lxe/c;

    invoke-direct {v0}, Lxe/c;-><init>()V

    const-class v1, Lxe/g;

    const-class v2, Lxe/a;

    invoke-static {v0, v2, v1}, Lwe/h0;->b(Lwe/h0$b;Ljava/lang/Class;Ljava/lang/Class;)Lwe/h0;

    move-result-object v0

    sput-object v0, Lxe/e;->b:Lwe/h0;

    new-instance v0, Lxe/d;

    invoke-direct {v0}, Lxe/d;-><init>()V

    const-class v1, Lpe/w;

    invoke-static {v0, v2, v1}, Lwe/h0;->b(Lwe/h0$b;Ljava/lang/Class;Ljava/lang/Class;)Lwe/h0;

    move-result-object v0

    sput-object v0, Lxe/e;->c:Lwe/h0;

    sget-object v0, Laf/f0$c;->c:Laf/f0$c;

    invoke-static {}, Laf/a;->h0()Lcom/google/crypto/tink/shaded/protobuf/a1;

    move-result-object v2

    const-string v3, "type.googleapis.com/google.crypto.tink.AesCmacKey"

    invoke-static {v3, v1, v0, v2}, Lwe/o;->e(Ljava/lang/String;Ljava/lang/Class;Laf/f0$c;Lcom/google/crypto/tink/shaded/protobuf/a1;)Lpe/m;

    move-result-object v0

    sput-object v0, Lxe/e;->d:Lpe/m;

    return-void
.end method

.method public static synthetic a(Lxe/a;)Lpe/w;
    .locals 0

    invoke-static {p0}, Lxe/e;->f(Lxe/a;)Lpe/w;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lxe/a;)Lxe/g;
    .locals 0

    invoke-static {p0}, Lxe/e;->e(Lxe/a;)Lxe/g;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lxe/f;Ljava/lang/Integer;)Lxe/a;
    .locals 0

    invoke-static {p0, p1}, Lxe/e;->d(Lxe/f;Ljava/lang/Integer;)Lxe/a;

    move-result-object p0

    return-object p0
.end method

.method public static d(Lxe/f;Ljava/lang/Integer;)Lxe/a;
    .locals 1

    invoke-static {p0}, Lxe/e;->i(Lxe/f;)V

    invoke-static {}, Lxe/a;->b()Lxe/a$b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lxe/a$b;->e(Lxe/f;)Lxe/a$b;

    move-result-object v0

    invoke-virtual {p0}, Lxe/f;->d()I

    move-result p0

    invoke-static {p0}, Lef/c;->b(I)Lef/c;

    move-result-object p0

    invoke-virtual {v0, p0}, Lxe/a$b;->c(Lef/c;)Lxe/a$b;

    move-result-object p0

    invoke-virtual {p0, p1}, Lxe/a$b;->d(Ljava/lang/Integer;)Lxe/a$b;

    move-result-object p0

    invoke-virtual {p0}, Lxe/a$b;->a()Lxe/a;

    move-result-object p0

    return-object p0
.end method

.method public static e(Lxe/a;)Lxe/g;
    .locals 1

    invoke-virtual {p0}, Lxe/a;->e()Lxe/f;

    move-result-object v0

    invoke-static {v0}, Lxe/e;->i(Lxe/f;)V

    new-instance v0, Lye/g;

    invoke-direct {v0, p0}, Lye/g;-><init>(Lxe/a;)V

    return-object v0
.end method

.method public static f(Lxe/a;)Lpe/w;
    .locals 1

    invoke-virtual {p0}, Lxe/a;->e()Lxe/f;

    move-result-object v0

    invoke-static {v0}, Lxe/e;->i(Lxe/f;)V

    invoke-static {p0}, Ldf/t;->c(Lxe/a;)Lpe/w;

    move-result-object p0

    return-object p0
.end method

.method public static g()Ljava/util/Map;
    .locals 3
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

    sget-object v1, Lxe/z;->e:Lxe/f;

    const-string v2, "AES_CMAC"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "AES256_CMAC"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lxe/f;->b()Lxe/f$b;

    move-result-object v1

    const/16 v2, 0x20

    invoke-virtual {v1, v2}, Lxe/f$b;->b(I)Lxe/f$b;

    move-result-object v1

    const/16 v2, 0x10

    invoke-virtual {v1, v2}, Lxe/f$b;->c(I)Lxe/f$b;

    move-result-object v1

    sget-object v2, Lxe/f$c;->e:Lxe/f$c;

    invoke-virtual {v1, v2}, Lxe/f$b;->d(Lxe/f$c;)Lxe/f$b;

    move-result-object v1

    invoke-virtual {v1}, Lxe/f$b;->a()Lxe/f;

    move-result-object v1

    const-string v2, "AES256_CMAC_RAW"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public static h(Z)V
    .locals 3

    sget-object v0, Lue/b$b;->a:Lue/b$b;

    invoke-virtual {v0}, Lue/b$b;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lye/e;->h()V

    invoke-static {}, Lwe/w;->f()Lwe/w;

    move-result-object v0

    sget-object v1, Lxe/e;->a:Lwe/w$a;

    const-class v2, Lxe/f;

    invoke-virtual {v0, v1, v2}, Lwe/w;->b(Lwe/w$a;Ljava/lang/Class;)V

    invoke-static {}, Lwe/a0;->c()Lwe/a0;

    move-result-object v0

    sget-object v1, Lxe/e;->b:Lwe/h0;

    invoke-virtual {v0, v1}, Lwe/a0;->d(Lwe/h0;)V

    invoke-static {}, Lwe/a0;->c()Lwe/a0;

    move-result-object v0

    sget-object v1, Lxe/e;->c:Lwe/h0;

    invoke-virtual {v0, v1}, Lwe/a0;->d(Lwe/h0;)V

    invoke-static {}, Lwe/z;->a()Lwe/z;

    move-result-object v0

    invoke-static {}, Lxe/e;->g()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lwe/z;->c(Ljava/util/Map;)V

    invoke-static {}, Lwe/l;->d()Lwe/l;

    move-result-object v0

    sget-object v1, Lxe/e;->d:Lpe/m;

    invoke-virtual {v0, v1, p0}, Lwe/l;->g(Lpe/m;Z)V

    return-void

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "Registering AES CMAC is not supported in FIPS mode"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static i(Lxe/f;)V
    .locals 1

    invoke-virtual {p0}, Lxe/f;->d()I

    move-result p0

    const/16 v0, 0x20

    if-ne p0, v0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "AesCmacKey size wrong, must be 32 bytes"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
