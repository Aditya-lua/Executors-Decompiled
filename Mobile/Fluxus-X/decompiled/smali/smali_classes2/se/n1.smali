.class public final Lse/n1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lye/w$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lye/w$a<",
            "Lse/o1;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Lye/h0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lye/h0<",
            "Lse/k1;",
            "Lre/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lse/l1;

    invoke-direct {v0}, Lse/l1;-><init>()V

    sput-object v0, Lse/n1;->a:Lye/w$a;

    new-instance v0, Lse/m1;

    invoke-direct {v0}, Lse/m1;-><init>()V

    const-class v1, Lse/k1;

    const-class v2, Lre/a;

    invoke-static {v0, v1, v2}, Lye/h0;->b(Lye/h0$b;Ljava/lang/Class;Ljava/lang/Class;)Lye/h0;

    move-result-object v0

    sput-object v0, Lse/n1;->b:Lye/h0;

    return-void
.end method

.method public static synthetic a(Lse/o1;Ljava/lang/Integer;)Lse/k1;
    .locals 0

    invoke-static {p0, p1}, Lse/n1;->b(Lse/o1;Ljava/lang/Integer;)Lse/k1;

    move-result-object p0

    return-object p0
.end method

.method public static b(Lse/o1;Ljava/lang/Integer;)Lse/k1;
    .locals 1

    const/16 v0, 0x20

    invoke-static {v0}, Lgf/c;->b(I)Lgf/c;

    move-result-object v0

    invoke-static {p0, v0, p1}, Lse/k1;->b(Lse/o1;Lgf/c;Ljava/lang/Integer;)Lse/k1;

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
            "Lre/x;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "XAES_256_GCM_192_BIT_NONCE"

    sget-object v2, Lse/j1;->i:Lse/o1;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "XAES_256_GCM_192_BIT_NONCE_NO_PREFIX"

    sget-object v2, Lse/j1;->j:Lse/o1;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "XAES_256_GCM_160_BIT_NONCE_NO_PREFIX"

    sget-object v2, Lse/j1;->k:Lse/o1;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "X_AES_GCM_8_BYTE_SALT_NO_PREFIX"

    sget-object v2, Lse/j1;->l:Lse/o1;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public static d(Z)V
    .locals 2

    invoke-static {}, Lte/q0;->g()V

    invoke-static {}, Lye/z;->a()Lye/z;

    move-result-object p0

    invoke-static {}, Lse/n1;->c()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0, v0}, Lye/z;->c(Ljava/util/Map;)V

    invoke-static {}, Lye/a0;->c()Lye/a0;

    move-result-object p0

    sget-object v0, Lse/n1;->b:Lye/h0;

    invoke-virtual {p0, v0}, Lye/a0;->d(Lye/h0;)V

    invoke-static {}, Lye/w;->f()Lye/w;

    move-result-object p0

    sget-object v0, Lse/n1;->a:Lye/w$a;

    const-class v1, Lse/o1;

    invoke-virtual {p0, v0, v1}, Lye/w;->b(Lye/w$a;Ljava/lang/Class;)V

    return-void
.end method
