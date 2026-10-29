.class public final Lcom/google/crypto/tink/shaded/protobuf/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/h1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/crypto/tink/shaded/protobuf/k0$c;
    }
.end annotation


# static fields
.field public static final b:Lcom/google/crypto/tink/shaded/protobuf/r0;


# instance fields
.field public final a:Lcom/google/crypto/tink/shaded/protobuf/r0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/k0$a;

    invoke-direct {v0}, Lcom/google/crypto/tink/shaded/protobuf/k0$a;-><init>()V

    sput-object v0, Lcom/google/crypto/tink/shaded/protobuf/k0;->b:Lcom/google/crypto/tink/shaded/protobuf/r0;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/k0;->c()Lcom/google/crypto/tink/shaded/protobuf/r0;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/k0;-><init>(Lcom/google/crypto/tink/shaded/protobuf/r0;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/crypto/tink/shaded/protobuf/r0;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    const-string v0, "messageInfoFactory"

    invoke-static {p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/a0;->b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/r0;

    iput-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/k0;->a:Lcom/google/crypto/tink/shaded/protobuf/r0;

    return-void
.end method

.method public static b(Lcom/google/crypto/tink/shaded/protobuf/q0;)Z
    .locals 1

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/k0$b;->a:[I

    invoke-interface {p0}, Lcom/google/crypto/tink/shaded/protobuf/q0;->c()Lcom/google/crypto/tink/shaded/protobuf/b1;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_0

    return v0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static c()Lcom/google/crypto/tink/shaded/protobuf/r0;
    .locals 5

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/k0$c;

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/x;->c()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object v1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/k0;->d()Lcom/google/crypto/tink/shaded/protobuf/r0;

    move-result-object v2

    const/4 v3, 0x2

    new-array v3, v3, [Lcom/google/crypto/tink/shaded/protobuf/r0;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v1, 0x1

    aput-object v2, v3, v1

    invoke-direct {v0, v3}, Lcom/google/crypto/tink/shaded/protobuf/k0$c;-><init>([Lcom/google/crypto/tink/shaded/protobuf/r0;)V

    return-object v0
.end method

.method public static d()Lcom/google/crypto/tink/shaded/protobuf/r0;
    .locals 3

    sget-boolean v0, Lcom/google/crypto/tink/shaded/protobuf/c1;->d:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/k0;->b:Lcom/google/crypto/tink/shaded/protobuf/r0;

    return-object v0

    :cond_0
    :try_start_0
    const-string v0, "com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v1, "getInstance"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0, v2, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/r0;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/k0;->b:Lcom/google/crypto/tink/shaded/protobuf/r0;

    return-object v0
.end method

.method public static e(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/q0;)Lcom/google/crypto/tink/shaded/protobuf/g1;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lcom/google/crypto/tink/shaded/protobuf/q0;",
            ")",
            "Lcom/google/crypto/tink/shaded/protobuf/g1<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/k0;->f(Ljava/lang/Class;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/z0;->b()Lcom/google/crypto/tink/shaded/protobuf/x0;

    move-result-object v4

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/i0;->b()Lcom/google/crypto/tink/shaded/protobuf/g0;

    move-result-object v5

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/i1;->L()Lcom/google/crypto/tink/shaded/protobuf/n1;

    move-result-object v6

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/k0;->b(Lcom/google/crypto/tink/shaded/protobuf/q0;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/s;->b()Lcom/google/crypto/tink/shaded/protobuf/q;

    move-result-object v1

    :cond_0
    move-object v7, v1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p0;->b()Lcom/google/crypto/tink/shaded/protobuf/n0;

    move-result-object v8

    move-object v2, p0

    move-object v3, p1

    invoke-static/range {v2 .. v8}, Lcom/google/crypto/tink/shaded/protobuf/v0;->S(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/q0;Lcom/google/crypto/tink/shaded/protobuf/x0;Lcom/google/crypto/tink/shaded/protobuf/g0;Lcom/google/crypto/tink/shaded/protobuf/n1;Lcom/google/crypto/tink/shaded/protobuf/q;Lcom/google/crypto/tink/shaded/protobuf/n0;)Lcom/google/crypto/tink/shaded/protobuf/v0;

    move-result-object p0

    return-object p0

    :cond_1
    move-object v0, p0

    move-object v3, p1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/z0;->a()Lcom/google/crypto/tink/shaded/protobuf/x0;

    move-result-object v2

    move-object p0, v1

    move-object v1, v3

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/i0;->a()Lcom/google/crypto/tink/shaded/protobuf/g0;

    move-result-object v3

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/i1;->K()Lcom/google/crypto/tink/shaded/protobuf/n1;

    move-result-object v4

    invoke-static {v1}, Lcom/google/crypto/tink/shaded/protobuf/k0;->b(Lcom/google/crypto/tink/shaded/protobuf/q0;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/s;->a()Lcom/google/crypto/tink/shaded/protobuf/q;

    move-result-object p0

    :cond_2
    move-object v5, p0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p0;->a()Lcom/google/crypto/tink/shaded/protobuf/n0;

    move-result-object v6

    invoke-static/range {v0 .. v6}, Lcom/google/crypto/tink/shaded/protobuf/v0;->S(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/q0;Lcom/google/crypto/tink/shaded/protobuf/x0;Lcom/google/crypto/tink/shaded/protobuf/g0;Lcom/google/crypto/tink/shaded/protobuf/n1;Lcom/google/crypto/tink/shaded/protobuf/q;Lcom/google/crypto/tink/shaded/protobuf/n0;)Lcom/google/crypto/tink/shaded/protobuf/v0;

    move-result-object p0

    return-object p0
.end method

.method public static f(Ljava/lang/Class;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    sget-boolean v0, Lcom/google/crypto/tink/shaded/protobuf/c1;->d:Z

    if-nez v0, :cond_1

    const-class v0, Lcom/google/crypto/tink/shaded/protobuf/y;

    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public a(Ljava/lang/Class;)Lcom/google/crypto/tink/shaded/protobuf/g1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Lcom/google/crypto/tink/shaded/protobuf/g1<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/i1;->H(Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/k0;->a:Lcom/google/crypto/tink/shaded/protobuf/r0;

    invoke-interface {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/r0;->a(Ljava/lang/Class;)Lcom/google/crypto/tink/shaded/protobuf/q0;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/crypto/tink/shaded/protobuf/q0;->a()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/k0;->f(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/i1;->L()Lcom/google/crypto/tink/shaded/protobuf/n1;

    move-result-object p1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/s;->b()Lcom/google/crypto/tink/shaded/protobuf/q;

    move-result-object v1

    invoke-interface {v0}, Lcom/google/crypto/tink/shaded/protobuf/q0;->b()Lcom/google/crypto/tink/shaded/protobuf/s0;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/w0;->m(Lcom/google/crypto/tink/shaded/protobuf/n1;Lcom/google/crypto/tink/shaded/protobuf/q;Lcom/google/crypto/tink/shaded/protobuf/s0;)Lcom/google/crypto/tink/shaded/protobuf/w0;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/i1;->K()Lcom/google/crypto/tink/shaded/protobuf/n1;

    move-result-object p1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/s;->a()Lcom/google/crypto/tink/shaded/protobuf/q;

    move-result-object v1

    invoke-interface {v0}, Lcom/google/crypto/tink/shaded/protobuf/q0;->b()Lcom/google/crypto/tink/shaded/protobuf/s0;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/w0;->m(Lcom/google/crypto/tink/shaded/protobuf/n1;Lcom/google/crypto/tink/shaded/protobuf/q;Lcom/google/crypto/tink/shaded/protobuf/s0;)Lcom/google/crypto/tink/shaded/protobuf/w0;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-static {p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/k0;->e(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/q0;)Lcom/google/crypto/tink/shaded/protobuf/g1;

    move-result-object p1

    return-object p1
.end method
