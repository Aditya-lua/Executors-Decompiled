.class public final Lqe/s1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lwe/h0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwe/h0<",
            "Lqe/p1;",
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
            "Lqe/t1;",
            ">;"
        }
    .end annotation
.end field

.field public static final d:Lwe/w$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwe/w$a<",
            "Lqe/t1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lqe/q1;

    invoke-direct {v0}, Lqe/q1;-><init>()V

    const-class v1, Lqe/p1;

    const-class v2, Lpe/a;

    invoke-static {v0, v1, v2}, Lwe/h0;->b(Lwe/h0$b;Ljava/lang/Class;Ljava/lang/Class;)Lwe/h0;

    move-result-object v0

    sput-object v0, Lqe/s1;->a:Lwe/h0;

    invoke-static {}, Lqe/s1;->d()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Laf/f0$c;->c:Laf/f0$c;

    invoke-static {}, Laf/c1;->f0()Lcom/google/crypto/tink/shaded/protobuf/a1;

    move-result-object v3

    invoke-static {v0, v2, v1, v3}, Lwe/o;->e(Ljava/lang/String;Ljava/lang/Class;Laf/f0$c;Lcom/google/crypto/tink/shaded/protobuf/a1;)Lpe/m;

    move-result-object v0

    sput-object v0, Lqe/s1;->b:Lpe/m;

    new-instance v0, Lqe/h;

    invoke-direct {v0}, Lqe/h;-><init>()V

    sput-object v0, Lqe/s1;->c:Lwe/x$a;

    new-instance v0, Lqe/r1;

    invoke-direct {v0}, Lqe/r1;-><init>()V

    sput-object v0, Lqe/s1;->d:Lwe/w$a;

    return-void
.end method

.method public static synthetic a(Lqe/p1;)Lpe/a;
    .locals 0

    invoke-static {p0}, Lqe/s1;->b(Lqe/p1;)Lpe/a;

    move-result-object p0

    return-object p0
.end method

.method public static b(Lqe/p1;)Lpe/a;
    .locals 1

    invoke-static {}, Lre/r0;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lre/r0;->c(Lqe/p1;)Lpe/a;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {p0}, Ldf/b0;->c(Lqe/p1;)Lpe/a;

    move-result-object p0

    return-object p0
.end method

.method public static c(Lqe/t1;Ljava/lang/Integer;)Lqe/p1;
    .locals 1

    invoke-virtual {p0}, Lqe/t1;->c()Lqe/t1$a;

    move-result-object p0

    const/16 v0, 0x20

    invoke-static {v0}, Lef/c;->b(I)Lef/c;

    move-result-object v0

    invoke-static {p0, v0, p1}, Lqe/p1;->b(Lqe/t1$a;Lef/c;Ljava/lang/Integer;)Lqe/p1;

    move-result-object p0

    return-object p0
.end method

.method public static d()Ljava/lang/String;
    .locals 1

    const-string v0, "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key"

    return-object v0
.end method

.method public static e()Ljava/util/Map;
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

    sget-object v1, Lqe/t1$a;->b:Lqe/t1$a;

    invoke-static {v1}, Lqe/t1;->b(Lqe/t1$a;)Lqe/t1;

    move-result-object v1

    const-string v2, "XCHACHA20_POLY1305"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lqe/t1$a;->d:Lqe/t1$a;

    invoke-static {v1}, Lqe/t1;->b(Lqe/t1$a;)Lqe/t1;

    move-result-object v1

    const-string v2, "XCHACHA20_POLY1305_RAW"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public static f(Z)V
    .locals 3

    sget-object v0, Lue/b$b;->a:Lue/b$b;

    invoke-virtual {v0}, Lue/b$b;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lre/w0;->g()V

    invoke-static {}, Lwe/a0;->c()Lwe/a0;

    move-result-object v0

    sget-object v1, Lqe/s1;->a:Lwe/h0;

    invoke-virtual {v0, v1}, Lwe/a0;->d(Lwe/h0;)V

    invoke-static {}, Lwe/z;->a()Lwe/z;

    move-result-object v0

    invoke-static {}, Lqe/s1;->e()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lwe/z;->c(Ljava/util/Map;)V

    invoke-static {}, Lwe/w;->f()Lwe/w;

    move-result-object v0

    sget-object v1, Lqe/s1;->d:Lwe/w$a;

    const-class v2, Lqe/t1;

    invoke-virtual {v0, v1, v2}, Lwe/w;->b(Lwe/w$a;Ljava/lang/Class;)V

    invoke-static {}, Lwe/x;->b()Lwe/x;

    move-result-object v0

    sget-object v1, Lqe/s1;->c:Lwe/x$a;

    invoke-virtual {v0, v1, v2}, Lwe/x;->a(Lwe/x$a;Ljava/lang/Class;)V

    invoke-static {}, Lwe/l;->d()Lwe/l;

    move-result-object v0

    sget-object v1, Lqe/s1;->b:Lpe/m;

    invoke-virtual {v0, v1, p0}, Lwe/l;->g(Lpe/m;Z)V

    return-void

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "Registering XChaCha20Poly1305 is not supported in FIPS mode"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
