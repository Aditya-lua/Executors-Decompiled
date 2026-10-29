.class public Lwe/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpe/m;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwe/o$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<P:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lpe/m<",
        "TP;>;"
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TP;>;"
        }
    .end annotation
.end field

.field public final c:Laf/f0$c;

.field public final d:Lcom/google/crypto/tink/shaded/protobuf/a1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/crypto/tink/shaded/protobuf/a1<",
            "+",
            "Lcom/google/crypto/tink/shaded/protobuf/s0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/Class;Laf/f0$c;Lcom/google/crypto/tink/shaded/protobuf/a1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TP;>;",
            "Laf/f0$c;",
            "Lcom/google/crypto/tink/shaded/protobuf/a1<",
            "+",
            "Lcom/google/crypto/tink/shaded/protobuf/s0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p4, p0, Lwe/o;->d:Lcom/google/crypto/tink/shaded/protobuf/a1;

    iput-object p1, p0, Lwe/o;->a:Ljava/lang/String;

    iput-object p2, p0, Lwe/o;->b:Ljava/lang/Class;

    iput-object p3, p0, Lwe/o;->c:Laf/f0$c;

    return-void
.end method

.method public static e(Ljava/lang/String;Ljava/lang/Class;Laf/f0$c;Lcom/google/crypto/tink/shaded/protobuf/a1;)Lpe/m;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<P:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TP;>;",
            "Laf/f0$c;",
            "Lcom/google/crypto/tink/shaded/protobuf/a1<",
            "+",
            "Lcom/google/crypto/tink/shaded/protobuf/s0;",
            ">;)",
            "Lpe/m<",
            "TP;>;"
        }
    .end annotation

    new-instance v0, Lwe/o;

    invoke-direct {v0, p0, p1, p2, p3}, Lwe/o;-><init>(Ljava/lang/String;Ljava/lang/Class;Laf/f0$c;Lcom/google/crypto/tink/shaded/protobuf/a1;)V

    return-object v0
.end method

.method public static f(Ljava/lang/String;Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/a1;)Lpe/y;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<P:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TP;>;",
            "Lcom/google/crypto/tink/shaded/protobuf/a1<",
            "+",
            "Lcom/google/crypto/tink/shaded/protobuf/s0;",
            ">;)",
            "Lpe/y<",
            "TP;>;"
        }
    .end annotation

    new-instance v0, Lwe/o$a;

    invoke-direct {v0, p0, p1, p2}, Lwe/o$a;-><init>(Ljava/lang/String;Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/a1;)V

    return-object v0
.end method


# virtual methods
.method public final a()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "TP;>;"
        }
    .end annotation

    iget-object v0, p0, Lwe/o;->b:Ljava/lang/Class;

    return-object v0
.end method

.method public final b(Lcom/google/crypto/tink/shaded/protobuf/h;)Laf/f0;
    .locals 3

    invoke-static {}, Laf/h0;->h0()Laf/h0$b;

    move-result-object v0

    iget-object v1, p0, Lwe/o;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Laf/h0$b;->D(Ljava/lang/String;)Laf/h0$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Laf/h0$b;->E(Lcom/google/crypto/tink/shaded/protobuf/h;)Laf/h0$b;

    move-result-object p1

    sget-object v0, Laf/p0;->e:Laf/p0;

    invoke-virtual {p1, v0}, Laf/h0$b;->C(Laf/p0;)Laf/h0$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->o()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p1

    check-cast p1, Laf/h0;

    invoke-static {p1}, Lwe/m0;->b(Laf/h0;)Lwe/m0;

    move-result-object p1

    invoke-static {}, Lwe/d0;->c()Lwe/d0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lwe/d0;->h(Lwe/p0;)Lpe/x;

    move-result-object p1

    invoke-static {}, Lwe/w;->f()Lwe/w;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lwe/w;->c(Lpe/x;Ljava/lang/Integer;)Lpe/l;

    move-result-object p1

    invoke-static {}, Lwe/d0;->c()Lwe/d0;

    move-result-object v0

    const-class v1, Lwe/l0;

    invoke-static {}, Lpe/j;->a()Lpe/d0;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lwe/d0;->n(Lpe/l;Ljava/lang/Class;Lpe/d0;)Lwe/p0;

    move-result-object p1

    check-cast p1, Lwe/l0;

    invoke-static {}, Laf/f0;->h0()Laf/f0$b;

    move-result-object v0

    invoke-virtual {p1}, Lwe/l0;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Laf/f0$b;->D(Ljava/lang/String;)Laf/f0$b;

    move-result-object v0

    invoke-virtual {p1}, Lwe/l0;->g()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Laf/f0$b;->E(Lcom/google/crypto/tink/shaded/protobuf/h;)Laf/f0$b;

    move-result-object v0

    invoke-virtual {p1}, Lwe/l0;->d()Laf/f0$c;

    move-result-object p1

    invoke-virtual {v0, p1}, Laf/f0$b;->C(Laf/f0$c;)Laf/f0$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->o()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p1

    check-cast p1, Laf/f0;

    return-object p1
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lwe/o;->a:Ljava/lang/String;

    return-object v0
.end method

.method public d(Lcom/google/crypto/tink/shaded/protobuf/h;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/crypto/tink/shaded/protobuf/h;",
            ")TP;"
        }
    .end annotation

    iget-object v0, p0, Lwe/o;->a:Ljava/lang/String;

    iget-object v1, p0, Lwe/o;->c:Laf/f0$c;

    sget-object v2, Laf/p0;->e:Laf/p0;

    const/4 v3, 0x0

    invoke-static {v0, p1, v1, v2, v3}, Lwe/l0;->b(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/h;Laf/f0$c;Laf/p0;Ljava/lang/Integer;)Lwe/l0;

    move-result-object p1

    invoke-static {}, Lwe/d0;->c()Lwe/d0;

    move-result-object v0

    invoke-static {}, Lpe/j;->a()Lpe/d0;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lwe/d0;->f(Lwe/p0;Lpe/d0;)Lpe/l;

    move-result-object p1

    invoke-static {}, Lwe/a0;->c()Lwe/a0;

    move-result-object v0

    iget-object v1, p0, Lwe/o;->b:Ljava/lang/Class;

    invoke-virtual {v0, p1, v1}, Lwe/a0;->b(Lpe/l;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
