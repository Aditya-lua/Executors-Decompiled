.class public final Lcf/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpe/z;


# instance fields
.field public final a:Lpe/z;

.field public final b:[B

.field public final c:[B


# direct methods
.method public constructor <init>(Lpe/z;[B[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcf/o;->a:Lpe/z;

    iput-object p2, p0, Lcf/o;->b:[B

    iput-object p3, p0, Lcf/o;->c:[B

    return-void
.end method

.method public static b(Lwe/p;)Lpe/z;
    .locals 3

    invoke-static {}, Lpe/j;->a()Lpe/d0;

    move-result-object v0

    invoke-virtual {p0, v0}, Lwe/p;->b(Lpe/d0;)Lwe/l0;

    move-result-object p0

    invoke-static {}, Laf/f0;->h0()Laf/f0$b;

    move-result-object v0

    invoke-virtual {p0}, Lwe/l0;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Laf/f0$b;->D(Ljava/lang/String;)Laf/f0$b;

    move-result-object v0

    invoke-virtual {p0}, Lwe/l0;->g()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Laf/f0$b;->E(Lcom/google/crypto/tink/shaded/protobuf/h;)Laf/f0$b;

    move-result-object v0

    invoke-virtual {p0}, Lwe/l0;->d()Laf/f0$c;

    move-result-object v1

    invoke-virtual {v0, v1}, Laf/f0$b;->C(Laf/f0$c;)Laf/f0$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->o()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object v0

    check-cast v0, Laf/f0;

    const-class v1, Lpe/z;

    invoke-static {v0, v1}, Lpe/b0;->c(Laf/f0;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpe/z;

    new-instance v1, Lcf/o;

    invoke-static {p0}, Lcf/p;->d(Lwe/l0;)[B

    move-result-object v2

    invoke-static {p0}, Lcf/p;->c(Lwe/l0;)[B

    move-result-object p0

    invoke-direct {v1, v0, v2, p0}, Lcf/o;-><init>(Lpe/z;[B[B)V

    return-object v1
.end method


# virtual methods
.method public a([B)[B
    .locals 2

    iget-object v0, p0, Lcf/o;->c:[B

    array-length v1, v0

    if-nez v1, :cond_0

    iget-object v0, p0, Lcf/o;->a:Lpe/z;

    invoke-interface {v0, p1}, Lpe/z;->a([B)[B

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcf/o;->a:Lpe/z;

    filled-new-array {p1, v0}, [[B

    move-result-object p1

    invoke-static {p1}, Ldf/e;->a([[B)[B

    move-result-object p1

    invoke-interface {v1, p1}, Lpe/z;->a([B)[B

    move-result-object p1

    :goto_0
    iget-object v0, p0, Lcf/o;->b:[B

    array-length v1, v0

    if-nez v1, :cond_1

    return-object p1

    :cond_1
    filled-new-array {v0, p1}, [[B

    move-result-object p1

    invoke-static {p1}, Ldf/e;->a([[B)[B

    move-result-object p1

    return-object p1
.end method
