.class public final Ldf/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lye/h0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lye/h0<",
            "Ldf/j;",
            "Lre/z;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Lye/h0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lye/h0<",
            "Ldf/o;",
            "Lre/a0;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Lre/y;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lre/y<",
            "Lre/z;",
            ">;"
        }
    .end annotation
.end field

.field public static final d:Lre/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lre/m<",
            "Lre/a0;",
            ">;"
        }
    .end annotation
.end field

.field public static final e:Lye/x$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lye/x$a<",
            "Ldf/i;",
            ">;"
        }
    .end annotation
.end field

.field public static final f:Lye/w$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lye/w$a<",
            "Ldf/i;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ldf/k;

    invoke-direct {v0}, Ldf/k;-><init>()V

    const-class v1, Ldf/j;

    const-class v2, Lre/z;

    invoke-static {v0, v1, v2}, Lye/h0;->b(Lye/h0$b;Ljava/lang/Class;Ljava/lang/Class;)Lye/h0;

    move-result-object v0

    sput-object v0, Ldf/n;->a:Lye/h0;

    new-instance v0, Ldf/l;

    invoke-direct {v0}, Ldf/l;-><init>()V

    const-class v1, Ldf/o;

    const-class v3, Lre/a0;

    invoke-static {v0, v1, v3}, Lye/h0;->b(Lye/h0$b;Ljava/lang/Class;Ljava/lang/Class;)Lye/h0;

    move-result-object v0

    sput-object v0, Ldf/n;->b:Lye/h0;

    invoke-static {}, Ldf/n;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcf/x;->h0()Lcom/google/crypto/tink/shaded/protobuf/a1;

    move-result-object v1

    invoke-static {v0, v2, v1}, Lye/o;->f(Ljava/lang/String;Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/a1;)Lre/y;

    move-result-object v0

    sput-object v0, Ldf/n;->c:Lre/y;

    invoke-static {}, Ldf/p;->a()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcf/f0$c;->e:Lcf/f0$c;

    invoke-static {}, Lcf/y;->g0()Lcom/google/crypto/tink/shaded/protobuf/a1;

    move-result-object v2

    invoke-static {v0, v3, v1, v2}, Lye/o;->e(Ljava/lang/String;Ljava/lang/Class;Lcf/f0$c;Lcom/google/crypto/tink/shaded/protobuf/a1;)Lre/m;

    move-result-object v0

    sput-object v0, Ldf/n;->d:Lre/m;

    new-instance v0, Lse/h;

    invoke-direct {v0}, Lse/h;-><init>()V

    sput-object v0, Ldf/n;->e:Lye/x$a;

    new-instance v0, Ldf/m;

    invoke-direct {v0}, Ldf/m;-><init>()V

    sput-object v0, Ldf/n;->f:Lye/w$a;

    return-void
.end method

.method public static a(Ldf/i;Ljava/lang/Integer;)Ldf/j;
    .locals 2

    invoke-static {}, Lff/i$a;->c()Lff/i$a;

    move-result-object v0

    invoke-virtual {p0}, Ldf/i;->c()Ldf/i$a;

    move-result-object p0

    invoke-virtual {v0}, Lff/i$a;->b()[B

    move-result-object v1

    invoke-static {v1}, Lgf/a;->a([B)Lgf/a;

    move-result-object v1

    invoke-static {p0, v1, p1}, Ldf/o;->c(Ldf/i$a;Lgf/a;Ljava/lang/Integer;)Ldf/o;

    move-result-object p0

    invoke-virtual {v0}, Lff/i$a;->a()[B

    move-result-object p1

    invoke-static {}, Lre/j;->a()Lre/d0;

    move-result-object v0

    invoke-static {p1, v0}, Lgf/c;->a([BLre/d0;)Lgf/c;

    move-result-object p1

    invoke-static {p0, p1}, Ldf/j;->d(Ldf/o;Lgf/c;)Ldf/j;

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
            "Lre/x;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sget-object v1, Ldf/i$a;->b:Ldf/i$a;

    invoke-static {v1}, Ldf/i;->b(Ldf/i$a;)Ldf/i;

    move-result-object v1

    const-string v2, "ED25519"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Ldf/i$a;->e:Ldf/i$a;

    invoke-static {v1}, Ldf/i;->b(Ldf/i$a;)Ldf/i;

    move-result-object v2

    const-string v3, "ED25519_RAW"

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "ED25519WithRawOutput"

    invoke-static {v1}, Ldf/i;->b(Ldf/i$a;)Ldf/i;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public static d(Z)V
    .locals 3

    sget-object v0, Lwe/b$b;->a:Lwe/b$b;

    invoke-virtual {v0}, Lwe/b$b;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lef/n;->k()V

    invoke-static {}, Lye/z;->a()Lye/z;

    move-result-object v0

    invoke-static {}, Ldf/n;->c()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lye/z;->c(Ljava/util/Map;)V

    invoke-static {}, Lye/w;->f()Lye/w;

    move-result-object v0

    sget-object v1, Ldf/n;->f:Lye/w$a;

    const-class v2, Ldf/i;

    invoke-virtual {v0, v1, v2}, Lye/w;->b(Lye/w$a;Ljava/lang/Class;)V

    invoke-static {}, Lye/x;->b()Lye/x;

    move-result-object v0

    sget-object v1, Ldf/n;->e:Lye/x$a;

    invoke-virtual {v0, v1, v2}, Lye/x;->a(Lye/x$a;Ljava/lang/Class;)V

    invoke-static {}, Lye/a0;->c()Lye/a0;

    move-result-object v0

    sget-object v1, Ldf/n;->a:Lye/h0;

    invoke-virtual {v0, v1}, Lye/a0;->d(Lye/h0;)V

    invoke-static {}, Lye/a0;->c()Lye/a0;

    move-result-object v0

    sget-object v1, Ldf/n;->b:Lye/h0;

    invoke-virtual {v0, v1}, Lye/a0;->d(Lye/h0;)V

    invoke-static {}, Lye/l;->d()Lye/l;

    move-result-object v0

    sget-object v1, Ldf/n;->c:Lre/y;

    invoke-virtual {v0, v1, p0}, Lye/l;->g(Lre/m;Z)V

    invoke-static {}, Lye/l;->d()Lye/l;

    move-result-object p0

    sget-object v0, Ldf/n;->d:Lre/m;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lye/l;->g(Lre/m;Z)V

    return-void

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "Registering AES GCM SIV is not supported in FIPS mode"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
