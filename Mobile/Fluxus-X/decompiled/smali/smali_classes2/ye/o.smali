.class public Lye/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lre/m;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lye/o$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<P:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lre/m<",
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

.field public final c:Lcf/f0$c;

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
.method public constructor <init>(Ljava/lang/String;Ljava/lang/Class;Lcf/f0$c;Lcom/google/crypto/tink/shaded/protobuf/a1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TP;>;",
            "Lcf/f0$c;",
            "Lcom/google/crypto/tink/shaded/protobuf/a1<",
            "+",
            "Lcom/google/crypto/tink/shaded/protobuf/s0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p4, p0, Lye/o;->d:Lcom/google/crypto/tink/shaded/protobuf/a1;

    iput-object p1, p0, Lye/o;->a:Ljava/lang/String;

    iput-object p2, p0, Lye/o;->b:Ljava/lang/Class;

    iput-object p3, p0, Lye/o;->c:Lcf/f0$c;

    return-void
.end method

.method public static e(Ljava/lang/String;Ljava/lang/Class;Lcf/f0$c;Lcom/google/crypto/tink/shaded/protobuf/a1;)Lre/m;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<P:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TP;>;",
            "Lcf/f0$c;",
            "Lcom/google/crypto/tink/shaded/protobuf/a1<",
            "+",
            "Lcom/google/crypto/tink/shaded/protobuf/s0;",
            ">;)",
            "Lre/m<",
            "TP;>;"
        }
    .end annotation

    new-instance v0, Lye/o;

    invoke-direct {v0, p0, p1, p2, p3}, Lye/o;-><init>(Ljava/lang/String;Ljava/lang/Class;Lcf/f0$c;Lcom/google/crypto/tink/shaded/protobuf/a1;)V

    return-object v0
.end method

.method public static f(Ljava/lang/String;Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/a1;)Lre/y;
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
            "Lre/y<",
            "TP;>;"
        }
    .end annotation

    new-instance v0, Lye/o$a;

    invoke-direct {v0, p0, p1, p2}, Lye/o$a;-><init>(Ljava/lang/String;Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/a1;)V

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

    iget-object v0, p0, Lye/o;->b:Ljava/lang/Class;

    return-object v0
.end method

.method public final b(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcf/f0;
    .locals 3

    invoke-static {}, Lcf/h0;->h0()Lcf/h0$b;

    move-result-object v0

    iget-object v1, p0, Lye/o;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcf/h0$b;->F(Ljava/lang/String;)Lcf/h0$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcf/h0$b;->G(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcf/h0$b;

    move-result-object p1

    sget-object v0, Lcf/p0;->e:Lcf/p0;

    invoke-virtual {p1, v0}, Lcf/h0$b;->D(Lcf/p0;)Lcf/h0$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->q()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p1

    check-cast p1, Lcf/h0;

    invoke-static {p1}, Lye/m0;->b(Lcf/h0;)Lye/m0;

    move-result-object p1

    invoke-static {}, Lye/d0;->c()Lye/d0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lye/d0;->h(Lye/p0;)Lre/x;

    move-result-object p1

    invoke-static {}, Lye/w;->f()Lye/w;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lye/w;->c(Lre/x;Ljava/lang/Integer;)Lre/l;

    move-result-object p1

    invoke-static {}, Lye/d0;->c()Lye/d0;

    move-result-object v0

    const-class v1, Lye/l0;

    invoke-static {}, Lre/j;->a()Lre/d0;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lye/d0;->n(Lre/l;Ljava/lang/Class;Lre/d0;)Lye/p0;

    move-result-object p1

    check-cast p1, Lye/l0;

    invoke-static {}, Lcf/f0;->h0()Lcf/f0$b;

    move-result-object v0

    invoke-virtual {p1}, Lye/l0;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcf/f0$b;->F(Ljava/lang/String;)Lcf/f0$b;

    move-result-object v0

    invoke-virtual {p1}, Lye/l0;->g()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcf/f0$b;->G(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcf/f0$b;

    move-result-object v0

    invoke-virtual {p1}, Lye/l0;->d()Lcf/f0$c;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcf/f0$b;->D(Lcf/f0$c;)Lcf/f0$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->q()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p1

    check-cast p1, Lcf/f0;

    return-object p1
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lye/o;->a:Ljava/lang/String;

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

    iget-object v0, p0, Lye/o;->a:Ljava/lang/String;

    iget-object v1, p0, Lye/o;->c:Lcf/f0$c;

    sget-object v2, Lcf/p0;->e:Lcf/p0;

    const/4 v3, 0x0

    invoke-static {v0, p1, v1, v2, v3}, Lye/l0;->b(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/h;Lcf/f0$c;Lcf/p0;Ljava/lang/Integer;)Lye/l0;

    move-result-object p1

    invoke-static {}, Lye/d0;->c()Lye/d0;

    move-result-object v0

    invoke-static {}, Lre/j;->a()Lre/d0;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lye/d0;->f(Lye/p0;Lre/d0;)Lre/l;

    move-result-object p1

    invoke-static {}, Lye/a0;->c()Lye/a0;

    move-result-object v0

    iget-object v1, p0, Lye/o;->b:Ljava/lang/Class;

    invoke-virtual {v0, p1, v1}, Lye/a0;->b(Lre/l;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
