.class public final Lse/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lye/h0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lye/h0<",
            "Lse/l;",
            "Lre/a;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Lre/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lre/m<",
            "Lre/a;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Lye/w$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lye/w$a<",
            "Lse/p;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lse/m;

    invoke-direct {v0}, Lse/m;-><init>()V

    const-class v1, Lse/l;

    const-class v2, Lre/a;

    invoke-static {v0, v1, v2}, Lye/h0;->b(Lye/h0$b;Ljava/lang/Class;Ljava/lang/Class;)Lye/h0;

    move-result-object v0

    sput-object v0, Lse/o;->a:Lye/h0;

    invoke-static {}, Lse/o;->c()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcf/f0$c;->c:Lcf/f0$c;

    invoke-static {}, Lcf/i;->h0()Lcom/google/crypto/tink/shaded/protobuf/a1;

    move-result-object v3

    invoke-static {v0, v2, v1, v3}, Lye/o;->e(Ljava/lang/String;Ljava/lang/Class;Lcf/f0$c;Lcom/google/crypto/tink/shaded/protobuf/a1;)Lre/m;

    move-result-object v0

    sput-object v0, Lse/o;->b:Lre/m;

    new-instance v0, Lse/n;

    invoke-direct {v0}, Lse/n;-><init>()V

    sput-object v0, Lse/o;->c:Lye/w$a;

    return-void
.end method

.method public static synthetic a(Lse/p;Ljava/lang/Integer;)Lse/l;
    .locals 0

    invoke-static {p0, p1}, Lse/o;->b(Lse/p;Ljava/lang/Integer;)Lse/l;

    move-result-object p0

    return-object p0
.end method

.method public static b(Lse/p;Ljava/lang/Integer;)Lse/l;
    .locals 1

    invoke-static {p0}, Lse/o;->f(Lse/p;)V

    invoke-static {}, Lse/l;->b()Lse/l$b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lse/l$b;->e(Lse/p;)Lse/l$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lse/l$b;->c(Ljava/lang/Integer;)Lse/l$b;

    move-result-object p1

    invoke-virtual {p0}, Lse/p;->d()I

    move-result p0

    invoke-static {p0}, Lgf/c;->b(I)Lgf/c;

    move-result-object p0

    invoke-virtual {p1, p0}, Lse/l$b;->d(Lgf/c;)Lse/l$b;

    move-result-object p0

    invoke-virtual {p0}, Lse/l$b;->a()Lse/l;

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
            "Lre/x;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "AES128_EAX"

    sget-object v2, Lse/j1;->c:Lse/p;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lse/p;->b()Lse/p$b;

    move-result-object v1

    const/16 v2, 0x10

    invoke-virtual {v1, v2}, Lse/p$b;->b(I)Lse/p$b;

    move-result-object v1

    invoke-virtual {v1, v2}, Lse/p$b;->c(I)Lse/p$b;

    move-result-object v1

    invoke-virtual {v1, v2}, Lse/p$b;->d(I)Lse/p$b;

    move-result-object v1

    sget-object v3, Lse/p$c;->d:Lse/p$c;

    invoke-virtual {v1, v3}, Lse/p$b;->e(Lse/p$c;)Lse/p$b;

    move-result-object v1

    invoke-virtual {v1}, Lse/p$b;->a()Lse/p;

    move-result-object v1

    const-string v4, "AES128_EAX_RAW"

    invoke-interface {v0, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "AES256_EAX"

    sget-object v4, Lse/j1;->d:Lse/p;

    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lse/p;->b()Lse/p$b;

    move-result-object v1

    invoke-virtual {v1, v2}, Lse/p$b;->b(I)Lse/p$b;

    move-result-object v1

    const/16 v4, 0x20

    invoke-virtual {v1, v4}, Lse/p$b;->c(I)Lse/p$b;

    move-result-object v1

    invoke-virtual {v1, v2}, Lse/p$b;->d(I)Lse/p$b;

    move-result-object v1

    invoke-virtual {v1, v3}, Lse/p$b;->e(Lse/p$c;)Lse/p$b;

    move-result-object v1

    invoke-virtual {v1}, Lse/p$b;->a()Lse/p;

    move-result-object v1

    const-string v2, "AES256_EAX_RAW"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public static e(Z)V
    .locals 3

    sget-object v0, Lwe/b$b;->a:Lwe/b$b;

    invoke-virtual {v0}, Lwe/b$b;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lte/j;->h()V

    invoke-static {}, Lye/a0;->c()Lye/a0;

    move-result-object v0

    sget-object v1, Lse/o;->a:Lye/h0;

    invoke-virtual {v0, v1}, Lye/a0;->d(Lye/h0;)V

    invoke-static {}, Lye/z;->a()Lye/z;

    move-result-object v0

    invoke-static {}, Lse/o;->d()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lye/z;->c(Ljava/util/Map;)V

    invoke-static {}, Lye/w;->f()Lye/w;

    move-result-object v0

    sget-object v1, Lse/o;->c:Lye/w$a;

    const-class v2, Lse/p;

    invoke-virtual {v0, v1, v2}, Lye/w;->b(Lye/w$a;Ljava/lang/Class;)V

    invoke-static {}, Lye/l;->d()Lye/l;

    move-result-object v0

    sget-object v1, Lse/o;->b:Lre/m;

    invoke-virtual {v0, v1, p0}, Lye/l;->g(Lre/m;Z)V

    return-void

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "Registering AES EAX is not supported in FIPS mode"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final f(Lse/p;)V
    .locals 1

    invoke-virtual {p0}, Lse/p;->d()I

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
