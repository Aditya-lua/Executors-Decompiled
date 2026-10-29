.class public final Lqe/n1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lwe/w$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwe/w$a<",
            "Lqe/o1;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Lwe/h0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwe/h0<",
            "Lqe/k1;",
            "Lpe/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lqe/l1;

    invoke-direct {v0}, Lqe/l1;-><init>()V

    sput-object v0, Lqe/n1;->a:Lwe/w$a;

    new-instance v0, Lqe/m1;

    invoke-direct {v0}, Lqe/m1;-><init>()V

    const-class v1, Lqe/k1;

    const-class v2, Lpe/a;

    invoke-static {v0, v1, v2}, Lwe/h0;->b(Lwe/h0$b;Ljava/lang/Class;Ljava/lang/Class;)Lwe/h0;

    move-result-object v0

    sput-object v0, Lqe/n1;->b:Lwe/h0;

    return-void
.end method

.method public static synthetic a(Lqe/o1;Ljava/lang/Integer;)Lqe/k1;
    .locals 0

    invoke-static {p0, p1}, Lqe/n1;->b(Lqe/o1;Ljava/lang/Integer;)Lqe/k1;

    move-result-object p0

    return-object p0
.end method

.method public static b(Lqe/o1;Ljava/lang/Integer;)Lqe/k1;
    .locals 1

    const/16 v0, 0x20

    invoke-static {v0}, Lef/c;->b(I)Lef/c;

    move-result-object v0

    invoke-static {p0, v0, p1}, Lqe/k1;->b(Lqe/o1;Lef/c;Ljava/lang/Integer;)Lqe/k1;

    move-result-object p0

    return-object p0
.end method

.method public static c()Ljava/util/Map;
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

    const-string v1, "XAES_256_GCM_192_BIT_NONCE"

    sget-object v2, Lqe/j1;->i:Lqe/o1;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "XAES_256_GCM_192_BIT_NONCE_NO_PREFIX"

    sget-object v2, Lqe/j1;->j:Lqe/o1;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "XAES_256_GCM_160_BIT_NONCE_NO_PREFIX"

    sget-object v2, Lqe/j1;->k:Lqe/o1;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "X_AES_GCM_8_BYTE_SALT_NO_PREFIX"

    sget-object v2, Lqe/j1;->l:Lqe/o1;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public static d(Z)V
    .locals 2

    invoke-static {}, Lre/q0;->g()V

    invoke-static {}, Lwe/z;->a()Lwe/z;

    move-result-object p0

    invoke-static {}, Lqe/n1;->c()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0, v0}, Lwe/z;->c(Ljava/util/Map;)V

    invoke-static {}, Lwe/a0;->c()Lwe/a0;

    move-result-object p0

    sget-object v0, Lqe/n1;->b:Lwe/h0;

    invoke-virtual {p0, v0}, Lwe/a0;->d(Lwe/h0;)V

    invoke-static {}, Lwe/w;->f()Lwe/w;

    move-result-object p0

    sget-object v0, Lqe/n1;->a:Lwe/w$a;

    const-class v1, Lqe/o1;

    invoke-virtual {p0, v0, v1}, Lwe/w;->b(Lwe/w$a;Ljava/lang/Class;)V

    return-void
.end method
