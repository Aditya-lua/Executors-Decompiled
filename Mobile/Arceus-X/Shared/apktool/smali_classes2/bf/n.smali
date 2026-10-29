.class public final Lbf/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lwe/h0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwe/h0<",
            "Lbf/j;",
            "Lpe/z;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Lwe/h0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwe/h0<",
            "Lbf/o;",
            "Lpe/a0;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Lpe/y;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpe/y<",
            "Lpe/z;",
            ">;"
        }
    .end annotation
.end field

.field public static final d:Lpe/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpe/m<",
            "Lpe/a0;",
            ">;"
        }
    .end annotation
.end field

.field public static final e:Lwe/x$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwe/x$a<",
            "Lbf/i;",
            ">;"
        }
    .end annotation
.end field

.field public static final f:Lwe/w$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwe/w$a<",
            "Lbf/i;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lbf/k;

    invoke-direct {v0}, Lbf/k;-><init>()V

    const-class v1, Lbf/j;

    const-class v2, Lpe/z;

    invoke-static {v0, v1, v2}, Lwe/h0;->b(Lwe/h0$b;Ljava/lang/Class;Ljava/lang/Class;)Lwe/h0;

    move-result-object v0

    sput-object v0, Lbf/n;->a:Lwe/h0;

    new-instance v0, Lbf/l;

    invoke-direct {v0}, Lbf/l;-><init>()V

    const-class v1, Lbf/o;

    const-class v3, Lpe/a0;

    invoke-static {v0, v1, v3}, Lwe/h0;->b(Lwe/h0$b;Ljava/lang/Class;Ljava/lang/Class;)Lwe/h0;

    move-result-object v0

    sput-object v0, Lbf/n;->b:Lwe/h0;

    invoke-static {}, Lbf/n;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Laf/x;->h0()Lcom/google/crypto/tink/shaded/protobuf/a1;

    move-result-object v1

    invoke-static {v0, v2, v1}, Lwe/o;->f(Ljava/lang/String;Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/a1;)Lpe/y;

    move-result-object v0

    sput-object v0, Lbf/n;->c:Lpe/y;

    invoke-static {}, Lbf/p;->a()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Laf/f0$c;->e:Laf/f0$c;

    invoke-static {}, Laf/y;->g0()Lcom/google/crypto/tink/shaded/protobuf/a1;

    move-result-object v2

    invoke-static {v0, v3, v1, v2}, Lwe/o;->e(Ljava/lang/String;Ljava/lang/Class;Laf/f0$c;Lcom/google/crypto/tink/shaded/protobuf/a1;)Lpe/m;

    move-result-object v0

    sput-object v0, Lbf/n;->d:Lpe/m;

    new-instance v0, Lqe/h;

    invoke-direct {v0}, Lqe/h;-><init>()V

    sput-object v0, Lbf/n;->e:Lwe/x$a;

    new-instance v0, Lbf/m;

    invoke-direct {v0}, Lbf/m;-><init>()V

    sput-object v0, Lbf/n;->f:Lwe/w$a;

    return-void
.end method

.method public static a(Lbf/i;Ljava/lang/Integer;)Lbf/j;
    .locals 2

    invoke-static {}, Ldf/i$a;->c()Ldf/i$a;

    move-result-object v0

    invoke-virtual {p0}, Lbf/i;->c()Lbf/i$a;

    move-result-object p0

    invoke-virtual {v0}, Ldf/i$a;->b()[B

    move-result-object v1

    invoke-static {v1}, Lef/a;->a([B)Lef/a;

    move-result-object v1

    invoke-static {p0, v1, p1}, Lbf/o;->c(Lbf/i$a;Lef/a;Ljava/lang/Integer;)Lbf/o;

    move-result-object p0

    invoke-virtual {v0}, Ldf/i$a;->a()[B

    move-result-object p1

    invoke-static {}, Lpe/j;->a()Lpe/d0;

    move-result-object v0

    invoke-static {p1, v0}, Lef/c;->a([BLpe/d0;)Lef/c;

    move-result-object p1

    invoke-static {p0, p1}, Lbf/j;->d(Lbf/o;Lef/c;)Lbf/j;

    move-result-object p0

    return-object p0
.end method

.method public static b()Ljava/lang/String;
    .locals 1

    const-string v0, "type.googleapis.com/google.crypto.tink.Ed25519PrivateKey"

    return-object v0
.end method

.method public static c()Ljava/util/Map;
    .locals 4
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

    sget-object v1, Lbf/i$a;->b:Lbf/i$a;

    invoke-static {v1}, Lbf/i;->b(Lbf/i$a;)Lbf/i;

    move-result-object v1

    const-string v2, "ED25519"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lbf/i$a;->e:Lbf/i$a;

    invoke-static {v1}, Lbf/i;->b(Lbf/i$a;)Lbf/i;

    move-result-object v2

    const-string v3, "ED25519_RAW"

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "ED25519WithRawOutput"

    invoke-static {v1}, Lbf/i;->b(Lbf/i$a;)Lbf/i;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public static d(Z)V
    .locals 3

    sget-object v0, Lue/b$b;->a:Lue/b$b;

    invoke-virtual {v0}, Lue/b$b;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcf/n;->k()V

    invoke-static {}, Lwe/z;->a()Lwe/z;

    move-result-object v0

    invoke-static {}, Lbf/n;->c()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lwe/z;->c(Ljava/util/Map;)V

    invoke-static {}, Lwe/w;->f()Lwe/w;

    move-result-object v0

    sget-object v1, Lbf/n;->f:Lwe/w$a;

    const-class v2, Lbf/i;

    invoke-virtual {v0, v1, v2}, Lwe/w;->b(Lwe/w$a;Ljava/lang/Class;)V

    invoke-static {}, Lwe/x;->b()Lwe/x;

    move-result-object v0

    sget-object v1, Lbf/n;->e:Lwe/x$a;

    invoke-virtual {v0, v1, v2}, Lwe/x;->a(Lwe/x$a;Ljava/lang/Class;)V

    invoke-static {}, Lwe/a0;->c()Lwe/a0;

    move-result-object v0

    sget-object v1, Lbf/n;->a:Lwe/h0;

    invoke-virtual {v0, v1}, Lwe/a0;->d(Lwe/h0;)V

    invoke-static {}, Lwe/a0;->c()Lwe/a0;

    move-result-object v0

    sget-object v1, Lbf/n;->b:Lwe/h0;

    invoke-virtual {v0, v1}, Lwe/a0;->d(Lwe/h0;)V

    invoke-static {}, Lwe/l;->d()Lwe/l;

    move-result-object v0

    sget-object v1, Lbf/n;->c:Lpe/y;

    invoke-virtual {v0, v1, p0}, Lwe/l;->g(Lpe/m;Z)V

    invoke-static {}, Lwe/l;->d()Lwe/l;

    move-result-object p0

    sget-object v0, Lbf/n;->d:Lpe/m;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lwe/l;->g(Lpe/m;Z)V

    return-void

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "Registering AES GCM SIV is not supported in FIPS mode"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
