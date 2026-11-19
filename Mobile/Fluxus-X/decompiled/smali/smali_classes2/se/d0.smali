.class public final Lse/d0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lye/h0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lye/h0<",
            "Lse/a0;",
            "Lre/a;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Lye/w$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lye/w$a<",
            "Lse/e0;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Lre/m;
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

    new-instance v0, Lse/b0;

    invoke-direct {v0}, Lse/b0;-><init>()V

    const-class v1, Lse/a0;

    const-class v2, Lre/a;

    invoke-static {v0, v1, v2}, Lye/h0;->b(Lye/h0$b;Ljava/lang/Class;Ljava/lang/Class;)Lye/h0;

    move-result-object v0

    sput-object v0, Lse/d0;->a:Lye/h0;

    new-instance v0, Lse/c0;

    invoke-direct {v0}, Lse/c0;-><init>()V

    sput-object v0, Lse/d0;->b:Lye/w$a;

    invoke-static {}, Lse/d0;->d()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcf/f0$c;->c:Lcf/f0$c;

    invoke-static {}, Lcf/p;->f0()Lcom/google/crypto/tink/shaded/protobuf/a1;

    move-result-object v3

    invoke-static {v0, v2, v1, v3}, Lye/o;->e(Ljava/lang/String;Ljava/lang/Class;Lcf/f0$c;Lcom/google/crypto/tink/shaded/protobuf/a1;)Lre/m;

    move-result-object v0

    sput-object v0, Lse/d0;->c:Lre/m;

    return-void
.end method

.method public static synthetic a(Lse/a0;)Lre/a;
    .locals 0

    invoke-static {p0}, Lse/d0;->b(Lse/a0;)Lre/a;

    move-result-object p0

    return-object p0
.end method

.method public static b(Lse/a0;)Lre/a;
    .locals 1

    invoke-static {}, Lte/v;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lte/v;->d(Lse/a0;)Lre/a;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {p0}, Lff/f;->c(Lse/a0;)Lre/a;

    move-result-object p0

    return-object p0
.end method

.method public static c(Lse/e0;Ljava/lang/Integer;)Lse/a0;
    .locals 1

    invoke-virtual {p0}, Lse/e0;->c()Lse/e0$a;

    move-result-object p0

    const/16 v0, 0x20

    invoke-static {v0}, Lgf/c;->b(I)Lgf/c;

    move-result-object v0

    invoke-static {p0, v0, p1}, Lse/a0;->b(Lse/e0$a;Lgf/c;Ljava/lang/Integer;)Lse/a0;

    move-result-object p0

    return-object p0
.end method

.method public static d()Ljava/lang/String;
    .locals 1

    const-string v0, "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key"

    return-object v0
.end method

.method public static e()Ljava/util/Map;
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

    sget-object v1, Lse/e0$a;->b:Lse/e0$a;

    invoke-static {v1}, Lse/e0;->b(Lse/e0$a;)Lse/e0;

    move-result-object v1

    const-string v2, "CHACHA20_POLY1305"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lse/e0$a;->d:Lse/e0$a;

    invoke-static {v1}, Lse/e0;->b(Lse/e0$a;)Lse/e0;

    move-result-object v1

    const-string v2, "CHACHA20_POLY1305_RAW"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public static f(Z)V
    .locals 3

    sget-object v0, Lwe/b$b;->a:Lwe/b$b;

    invoke-virtual {v0}, Lwe/b$b;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lte/a0;->g()V

    invoke-static {}, Lye/a0;->c()Lye/a0;

    move-result-object v0

    sget-object v1, Lse/d0;->a:Lye/h0;

    invoke-virtual {v0, v1}, Lye/a0;->d(Lye/h0;)V

    invoke-static {}, Lye/w;->f()Lye/w;

    move-result-object v0

    sget-object v1, Lse/d0;->b:Lye/w$a;

    const-class v2, Lse/e0;

    invoke-virtual {v0, v1, v2}, Lye/w;->b(Lye/w$a;Ljava/lang/Class;)V

    invoke-static {}, Lye/z;->a()Lye/z;

    move-result-object v0

    invoke-static {}, Lse/d0;->e()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lye/z;->c(Ljava/util/Map;)V

    invoke-static {}, Lye/l;->d()Lye/l;

    move-result-object v0

    sget-object v1, Lse/d0;->c:Lre/m;

    invoke-virtual {v0, v1, p0}, Lye/l;->g(Lre/m;Z)V

    return-void

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "Registering ChaCha20Poly1305 is not supported in FIPS mode"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
