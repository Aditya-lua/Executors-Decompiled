.class public final Lqe/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lwe/h0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwe/h0<",
            "Lqe/l;",
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

.field public static final c:Lwe/w$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwe/w$a<",
            "Lqe/p;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lqe/m;

    invoke-direct {v0}, Lqe/m;-><init>()V

    const-class v1, Lqe/l;

    const-class v2, Lpe/a;

    invoke-static {v0, v1, v2}, Lwe/h0;->b(Lwe/h0$b;Ljava/lang/Class;Ljava/lang/Class;)Lwe/h0;

    move-result-object v0

    sput-object v0, Lqe/o;->a:Lwe/h0;

    invoke-static {}, Lqe/o;->c()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Laf/f0$c;->c:Laf/f0$c;

    invoke-static {}, Laf/i;->h0()Lcom/google/crypto/tink/shaded/protobuf/a1;

    move-result-object v3

    invoke-static {v0, v2, v1, v3}, Lwe/o;->e(Ljava/lang/String;Ljava/lang/Class;Laf/f0$c;Lcom/google/crypto/tink/shaded/protobuf/a1;)Lpe/m;

    move-result-object v0

    sput-object v0, Lqe/o;->b:Lpe/m;

    new-instance v0, Lqe/n;

    invoke-direct {v0}, Lqe/n;-><init>()V

    sput-object v0, Lqe/o;->c:Lwe/w$a;

    return-void
.end method

.method public static synthetic a(Lqe/p;Ljava/lang/Integer;)Lqe/l;
    .locals 0

    invoke-static {p0, p1}, Lqe/o;->b(Lqe/p;Ljava/lang/Integer;)Lqe/l;

    move-result-object p0

    return-object p0
.end method

.method public static b(Lqe/p;Ljava/lang/Integer;)Lqe/l;
    .locals 1

    invoke-static {p0}, Lqe/o;->f(Lqe/p;)V

    invoke-static {}, Lqe/l;->b()Lqe/l$b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lqe/l$b;->e(Lqe/p;)Lqe/l$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lqe/l$b;->c(Ljava/lang/Integer;)Lqe/l$b;

    move-result-object p1

    invoke-virtual {p0}, Lqe/p;->d()I

    move-result p0

    invoke-static {p0}, Lef/c;->b(I)Lef/c;

    move-result-object p0

    invoke-virtual {p1, p0}, Lqe/l$b;->d(Lef/c;)Lqe/l$b;

    move-result-object p0

    invoke-virtual {p0}, Lqe/l$b;->a()Lqe/l;

    move-result-object p0

    return-object p0
.end method

.method public static c()Ljava/lang/String;
    .locals 1

    const-string v0, "type.googleapis.com/google.crypto.tink.AesEaxKey"

    return-object v0
.end method

.method public static d()Ljava/util/Map;
    .locals 5
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

    const-string v1, "AES128_EAX"

    sget-object v2, Lqe/j1;->c:Lqe/p;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lqe/p;->b()Lqe/p$b;

    move-result-object v1

    const/16 v2, 0x10

    invoke-virtual {v1, v2}, Lqe/p$b;->b(I)Lqe/p$b;

    move-result-object v1

    invoke-virtual {v1, v2}, Lqe/p$b;->c(I)Lqe/p$b;

    move-result-object v1

    invoke-virtual {v1, v2}, Lqe/p$b;->d(I)Lqe/p$b;

    move-result-object v1

    sget-object v3, Lqe/p$c;->d:Lqe/p$c;

    invoke-virtual {v1, v3}, Lqe/p$b;->e(Lqe/p$c;)Lqe/p$b;

    move-result-object v1

    invoke-virtual {v1}, Lqe/p$b;->a()Lqe/p;

    move-result-object v1

    const-string v4, "AES128_EAX_RAW"

    invoke-interface {v0, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "AES256_EAX"

    sget-object v4, Lqe/j1;->d:Lqe/p;

    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lqe/p;->b()Lqe/p$b;

    move-result-object v1

    invoke-virtual {v1, v2}, Lqe/p$b;->b(I)Lqe/p$b;

    move-result-object v1

    const/16 v4, 0x20

    invoke-virtual {v1, v4}, Lqe/p$b;->c(I)Lqe/p$b;

    move-result-object v1

    invoke-virtual {v1, v2}, Lqe/p$b;->d(I)Lqe/p$b;

    move-result-object v1

    invoke-virtual {v1, v3}, Lqe/p$b;->e(Lqe/p$c;)Lqe/p$b;

    move-result-object v1

    invoke-virtual {v1}, Lqe/p$b;->a()Lqe/p;

    move-result-object v1

    const-string v2, "AES256_EAX_RAW"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public static e(Z)V
    .locals 3

    sget-object v0, Lue/b$b;->a:Lue/b$b;

    invoke-virtual {v0}, Lue/b$b;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lre/j;->h()V

    invoke-static {}, Lwe/a0;->c()Lwe/a0;

    move-result-object v0

    sget-object v1, Lqe/o;->a:Lwe/h0;

    invoke-virtual {v0, v1}, Lwe/a0;->d(Lwe/h0;)V

    invoke-static {}, Lwe/z;->a()Lwe/z;

    move-result-object v0

    invoke-static {}, Lqe/o;->d()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lwe/z;->c(Ljava/util/Map;)V

    invoke-static {}, Lwe/w;->f()Lwe/w;

    move-result-object v0

    sget-object v1, Lqe/o;->c:Lwe/w$a;

    const-class v2, Lqe/p;

    invoke-virtual {v0, v1, v2}, Lwe/w;->b(Lwe/w$a;Ljava/lang/Class;)V

    invoke-static {}, Lwe/l;->d()Lwe/l;

    move-result-object v0

    sget-object v1, Lqe/o;->b:Lpe/m;

    invoke-virtual {v0, v1, p0}, Lwe/l;->g(Lpe/m;Z)V

    return-void

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "Registering AES EAX is not supported in FIPS mode"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final f(Lqe/p;)V
    .locals 1

    invoke-virtual {p0}, Lqe/p;->d()I

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
