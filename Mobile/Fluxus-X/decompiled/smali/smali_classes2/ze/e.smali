.class public final Lze/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lye/w$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lye/w$a<",
            "Lze/f;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Lye/h0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lye/h0<",
            "Lze/a;",
            "Lze/g;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Lye/h0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lye/h0<",
            "Lze/a;",
            "Lre/w;",
            ">;"
        }
    .end annotation
.end field

.field public static final d:Lre/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lre/m<",
            "Lre/w;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lze/b;

    invoke-direct {v0}, Lze/b;-><init>()V

    sput-object v0, Lze/e;->a:Lye/w$a;

    new-instance v0, Lze/c;

    invoke-direct {v0}, Lze/c;-><init>()V

    const-class v1, Lze/g;

    const-class v2, Lze/a;

    invoke-static {v0, v2, v1}, Lye/h0;->b(Lye/h0$b;Ljava/lang/Class;Ljava/lang/Class;)Lye/h0;

    move-result-object v0

    sput-object v0, Lze/e;->b:Lye/h0;

    new-instance v0, Lze/d;

    invoke-direct {v0}, Lze/d;-><init>()V

    const-class v1, Lre/w;

    invoke-static {v0, v2, v1}, Lye/h0;->b(Lye/h0$b;Ljava/lang/Class;Ljava/lang/Class;)Lye/h0;

    move-result-object v0

    sput-object v0, Lze/e;->c:Lye/h0;

    sget-object v0, Lcf/f0$c;->c:Lcf/f0$c;

    invoke-static {}, Lcf/a;->h0()Lcom/google/crypto/tink/shaded/protobuf/a1;

    move-result-object v2

    const-string v3, "type.googleapis.com/google.crypto.tink.AesCmacKey"

    invoke-static {v3, v1, v0, v2}, Lye/o;->e(Ljava/lang/String;Ljava/lang/Class;Lcf/f0$c;Lcom/google/crypto/tink/shaded/protobuf/a1;)Lre/m;

    move-result-object v0

    sput-object v0, Lze/e;->d:Lre/m;

    return-void
.end method

.method public static synthetic a(Lze/a;)Lre/w;
    .locals 0

    invoke-static {p0}, Lze/e;->f(Lze/a;)Lre/w;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lze/a;)Lze/g;
    .locals 0

    invoke-static {p0}, Lze/e;->e(Lze/a;)Lze/g;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lze/f;Ljava/lang/Integer;)Lze/a;
    .locals 0

    invoke-static {p0, p1}, Lze/e;->d(Lze/f;Ljava/lang/Integer;)Lze/a;

    move-result-object p0

    return-object p0
.end method

.method public static d(Lze/f;Ljava/lang/Integer;)Lze/a;
    .locals 1

    invoke-static {p0}, Lze/e;->i(Lze/f;)V

    invoke-static {}, Lze/a;->b()Lze/a$b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lze/a$b;->e(Lze/f;)Lze/a$b;

    move-result-object v0

    invoke-virtual {p0}, Lze/f;->d()I

    move-result p0

    invoke-static {p0}, Lgf/c;->b(I)Lgf/c;

    move-result-object p0

    invoke-virtual {v0, p0}, Lze/a$b;->c(Lgf/c;)Lze/a$b;

    move-result-object p0

    invoke-virtual {p0, p1}, Lze/a$b;->d(Ljava/lang/Integer;)Lze/a$b;

    move-result-object p0

    invoke-virtual {p0}, Lze/a$b;->a()Lze/a;

    move-result-object p0

    return-object p0
.end method

.method public static e(Lze/a;)Lze/g;
    .locals 1

    invoke-virtual {p0}, Lze/a;->e()Lze/f;

    move-result-object v0

    invoke-static {v0}, Lze/e;->i(Lze/f;)V

    new-instance v0, Laf/g;

    invoke-direct {v0, p0}, Laf/g;-><init>(Lze/a;)V

    return-object v0
.end method

.method public static f(Lze/a;)Lre/w;
    .locals 1

    invoke-virtual {p0}, Lze/a;->e()Lze/f;

    move-result-object v0

    invoke-static {v0}, Lze/e;->i(Lze/f;)V

    invoke-static {p0}, Lff/t;->c(Lze/a;)Lre/w;

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
            "Lre/x;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sget-object v1, Lze/z;->e:Lze/f;

    const-string v2, "AES_CMAC"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "AES256_CMAC"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lze/f;->b()Lze/f$b;

    move-result-object v1

    const/16 v2, 0x20

    invoke-virtual {v1, v2}, Lze/f$b;->b(I)Lze/f$b;

    move-result-object v1

    const/16 v2, 0x10

    invoke-virtual {v1, v2}, Lze/f$b;->c(I)Lze/f$b;

    move-result-object v1

    sget-object v2, Lze/f$c;->e:Lze/f$c;

    invoke-virtual {v1, v2}, Lze/f$b;->d(Lze/f$c;)Lze/f$b;

    move-result-object v1

    invoke-virtual {v1}, Lze/f$b;->a()Lze/f;

    move-result-object v1

    const-string v2, "AES256_CMAC_RAW"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public static h(Z)V
    .locals 3

    sget-object v0, Lwe/b$b;->a:Lwe/b$b;

    invoke-virtual {v0}, Lwe/b$b;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Laf/e;->h()V

    invoke-static {}, Lye/w;->f()Lye/w;

    move-result-object v0

    sget-object v1, Lze/e;->a:Lye/w$a;

    const-class v2, Lze/f;

    invoke-virtual {v0, v1, v2}, Lye/w;->b(Lye/w$a;Ljava/lang/Class;)V

    invoke-static {}, Lye/a0;->c()Lye/a0;

    move-result-object v0

    sget-object v1, Lze/e;->b:Lye/h0;

    invoke-virtual {v0, v1}, Lye/a0;->d(Lye/h0;)V

    invoke-static {}, Lye/a0;->c()Lye/a0;

    move-result-object v0

    sget-object v1, Lze/e;->c:Lye/h0;

    invoke-virtual {v0, v1}, Lye/a0;->d(Lye/h0;)V

    invoke-static {}, Lye/z;->a()Lye/z;

    move-result-object v0

    invoke-static {}, Lze/e;->g()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lye/z;->c(Ljava/util/Map;)V

    invoke-static {}, Lye/l;->d()Lye/l;

    move-result-object v0

    sget-object v1, Lze/e;->d:Lre/m;

    invoke-virtual {v0, v1, p0}, Lye/l;->g(Lre/m;Z)V

    return-void

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "Registering AES CMAC is not supported in FIPS mode"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static i(Lze/f;)V
    .locals 1

    invoke-virtual {p0}, Lze/f;->d()I

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
