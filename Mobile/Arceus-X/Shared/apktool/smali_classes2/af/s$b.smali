.class public final Laf/s$b;
.super Lcom/google/crypto/tink/shaded/protobuf/y$a;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/t0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Laf/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/crypto/tink/shaded/protobuf/y$a<",
        "Laf/s;",
        "Laf/s$b;",
        ">;",
        "Lcom/google/crypto/tink/shaded/protobuf/t0;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 2
    invoke-static {}, Laf/s;->Z()Laf/s;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;-><init>(Lcom/google/crypto/tink/shaded/protobuf/y;)V

    return-void
.end method

.method public synthetic constructor <init>(Laf/s$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Laf/s$b;-><init>()V

    return-void
.end method


# virtual methods
.method public C(Laf/z;)Laf/s$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->r()V

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/y$a;->b:Lcom/google/crypto/tink/shaded/protobuf/y;

    check-cast v0, Laf/s;

    invoke-static {v0, p1}, Laf/s;->b0(Laf/s;Laf/z;)V

    return-object p0
.end method

.method public D(Laf/v;)Laf/s$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->r()V

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/y$a;->b:Lcom/google/crypto/tink/shaded/protobuf/y;

    check-cast v0, Laf/s;

    invoke-static {v0, p1}, Laf/s;->c0(Laf/s;Laf/v;)V

    return-object p0
.end method

.method public E(Laf/b0;)Laf/s$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->r()V

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/y$a;->b:Lcom/google/crypto/tink/shaded/protobuf/y;

    check-cast v0, Laf/s;

    invoke-static {v0, p1}, Laf/s;->a0(Laf/s;Laf/b0;)V

    return-object p0
.end method

.method public bridge synthetic F(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/p;)Lcom/google/crypto/tink/shaded/protobuf/s0$a;
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->w(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/p;)Lcom/google/crypto/tink/shaded/protobuf/y$a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic H(Lcom/google/crypto/tink/shaded/protobuf/s0;)Lcom/google/crypto/tink/shaded/protobuf/s0$a;
    .locals 0

    invoke-super {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/a$a;->k(Lcom/google/crypto/tink/shaded/protobuf/s0;)Lcom/google/crypto/tink/shaded/protobuf/a$a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic build()Lcom/google/crypto/tink/shaded/protobuf/s0;
    .locals 1

    invoke-super {p0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->o()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-super {p0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->q()Lcom/google/crypto/tink/shaded/protobuf/y$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic d()Lcom/google/crypto/tink/shaded/protobuf/s0;
    .locals 1

    invoke-super {p0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->p()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic f()Lcom/google/crypto/tink/shaded/protobuf/s0;
    .locals 1

    invoke-super {p0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->t()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic j(Lcom/google/crypto/tink/shaded/protobuf/a;)Lcom/google/crypto/tink/shaded/protobuf/a$a;
    .locals 0

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/y;

    invoke-super {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->v(Lcom/google/crypto/tink/shaded/protobuf/y;)Lcom/google/crypto/tink/shaded/protobuf/y$a;

    move-result-object p1

    return-object p1
.end method
