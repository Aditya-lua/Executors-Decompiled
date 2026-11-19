.class public final Lcf/t$b;
.super Lcom/google/crypto/tink/shaded/protobuf/y$a;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/t0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcf/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/crypto/tink/shaded/protobuf/y$a<",
        "Lcf/t;",
        "Lcf/t$b;",
        ">;",
        "Lcom/google/crypto/tink/shaded/protobuf/t0;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 2
    invoke-static {}, Lcf/t;->Z()Lcf/t;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;-><init>(Lcom/google/crypto/tink/shaded/protobuf/y;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcf/t$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcf/t$b;-><init>()V

    return-void
.end method


# virtual methods
.method public D(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcf/t$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->t()V

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/y$a;->b:Lcom/google/crypto/tink/shaded/protobuf/y;

    check-cast v0, Lcf/t;

    invoke-static {v0, p1}, Lcf/t;->b0(Lcf/t;Lcom/google/crypto/tink/shaded/protobuf/h;)V

    return-object p0
.end method

.method public F(Lcf/u;)Lcf/t$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->t()V

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/y$a;->b:Lcom/google/crypto/tink/shaded/protobuf/y;

    check-cast v0, Lcf/t;

    invoke-static {v0, p1}, Lcf/t;->a0(Lcf/t;Lcf/u;)V

    return-object p0
.end method

.method public bridge synthetic K(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/p;)Lcom/google/crypto/tink/shaded/protobuf/s0$a;
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->y(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/p;)Lcom/google/crypto/tink/shaded/protobuf/y$a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic N(Lcom/google/crypto/tink/shaded/protobuf/s0;)Lcom/google/crypto/tink/shaded/protobuf/s0$a;
    .locals 0

    invoke-super {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/a$a;->o(Lcom/google/crypto/tink/shaded/protobuf/s0;)Lcom/google/crypto/tink/shaded/protobuf/a$a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic build()Lcom/google/crypto/tink/shaded/protobuf/s0;
    .locals 1

    invoke-super {p0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->q()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-super {p0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->s()Lcom/google/crypto/tink/shaded/protobuf/y$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic d()Lcom/google/crypto/tink/shaded/protobuf/s0;
    .locals 1

    invoke-super {p0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->r()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic f()Lcom/google/crypto/tink/shaded/protobuf/s0;
    .locals 1

    invoke-super {p0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->v()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic l(Lcom/google/crypto/tink/shaded/protobuf/a;)Lcom/google/crypto/tink/shaded/protobuf/a$a;
    .locals 0

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/y;

    invoke-super {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->x(Lcom/google/crypto/tink/shaded/protobuf/y;)Lcom/google/crypto/tink/shaded/protobuf/y$a;

    move-result-object p1

    return-object p1
.end method
