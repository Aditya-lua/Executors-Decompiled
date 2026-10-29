.class public final Lwe/w;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwe/w$a;
    }
.end annotation


# static fields
.field public static final b:Lwe/w$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwe/w$a<",
            "Lwe/q;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Lwe/w;


# instance fields
.field public final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "Lpe/x;",
            ">;",
            "Lwe/w$a<",
            "+",
            "Lpe/x;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lwe/v;

    invoke-direct {v0}, Lwe/v;-><init>()V

    sput-object v0, Lwe/w;->b:Lwe/w$a;

    invoke-static {}, Lwe/w;->g()Lwe/w;

    move-result-object v0

    sput-object v0, Lwe/w;->c:Lwe/w;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lwe/w;->a:Ljava/util/Map;

    return-void
.end method

.method public static synthetic a(Lwe/q;Ljava/lang/Integer;)Lwe/p;
    .locals 0

    invoke-static {p0, p1}, Lwe/w;->e(Lwe/q;Ljava/lang/Integer;)Lwe/p;

    move-result-object p0

    return-object p0
.end method

.method public static e(Lwe/q;Ljava/lang/Integer;)Lwe/p;
    .locals 3

    invoke-virtual {p0}, Lwe/q;->b()Lwe/m0;

    move-result-object p0

    invoke-virtual {p0}, Lwe/m0;->d()Laf/h0;

    move-result-object p0

    invoke-static {}, Lwe/l;->d()Lwe/l;

    move-result-object v0

    invoke-virtual {p0}, Laf/h0;->f0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lwe/l;->c(Ljava/lang/String;)Lpe/m;

    move-result-object v0

    invoke-static {}, Lwe/l;->d()Lwe/l;

    move-result-object v1

    invoke-virtual {p0}, Laf/h0;->f0()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lwe/l;->f(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Laf/h0;->g0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-interface {v0, v1}, Lpe/m;->b(Lcom/google/crypto/tink/shaded/protobuf/h;)Laf/f0;

    move-result-object v0

    invoke-virtual {v0}, Laf/f0;->f0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Laf/f0;->g0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v2

    invoke-virtual {v0}, Laf/f0;->e0()Laf/f0$c;

    move-result-object v0

    invoke-virtual {p0}, Laf/h0;->e0()Laf/p0;

    move-result-object p0

    invoke-static {v1, v2, v0, p0, p1}, Lwe/l0;->b(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/h;Laf/f0$c;Laf/p0;Ljava/lang/Integer;)Lwe/l0;

    move-result-object p0

    new-instance p1, Lwe/p;

    invoke-static {}, Lpe/j;->a()Lpe/d0;

    move-result-object v0

    invoke-direct {p1, p0, v0}, Lwe/p;-><init>(Lwe/l0;Lpe/d0;)V

    return-object p1

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "Creating new keys is not allowed."

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static f()Lwe/w;
    .locals 1

    sget-object v0, Lwe/w;->c:Lwe/w;

    return-object v0
.end method

.method public static g()Lwe/w;
    .locals 3

    new-instance v0, Lwe/w;

    invoke-direct {v0}, Lwe/w;-><init>()V

    :try_start_0
    sget-object v1, Lwe/w;->b:Lwe/w$a;

    const-class v2, Lwe/q;

    invoke-virtual {v0, v1, v2}, Lwe/w;->b(Lwe/w$a;Ljava/lang/Class;)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "unexpected error."

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method


# virtual methods
.method public declared-synchronized b(Lwe/w$a;Ljava/lang/Class;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ParametersT:",
            "Lpe/x;",
            ">(",
            "Lwe/w$a<",
            "TParametersT;>;",
            "Ljava/lang/Class<",
            "TParametersT;>;)V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lwe/w;->a:Ljava/util/Map;

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwe/w$a;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Different key creator for parameters class "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " already inserted"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lwe/w;->a:Ljava/util/Map;

    invoke-interface {v0, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public c(Lpe/x;Ljava/lang/Integer;)Lpe/l;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lwe/w;->d(Lpe/x;Ljava/lang/Integer;)Lpe/l;

    move-result-object p1

    return-object p1
.end method

.method public final declared-synchronized d(Lpe/x;Ljava/lang/Integer;)Lpe/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ParametersT:",
            "Lpe/x;",
            ">(TParametersT;",
            "Ljava/lang/Integer;",
            ")",
            "Lpe/l;"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    iget-object v1, p0, Lwe/w;->a:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwe/w$a;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Lwe/w$a;->a(Lpe/x;Ljava/lang/Integer;)Lpe/l;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    :try_start_1
    new-instance p2, Ljava/security/GeneralSecurityException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Cannot create a new key for parameters "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ": no key creator for this class was registered."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p2

    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
