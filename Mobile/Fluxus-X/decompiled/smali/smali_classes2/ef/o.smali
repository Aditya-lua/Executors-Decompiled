.class public final Lef/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lre/z;


# instance fields
.field public final a:Lre/z;

.field public final b:[B

.field public final c:[B


# direct methods
.method public constructor <init>(Lre/z;[B[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lef/o;->a:Lre/z;

    iput-object p2, p0, Lef/o;->b:[B

    iput-object p3, p0, Lef/o;->c:[B

    return-void
.end method

.method public static b(Lye/p;)Lre/z;
    .locals 3

    invoke-static {}, Lre/j;->a()Lre/d0;

    move-result-object v0

    invoke-virtual {p0, v0}, Lye/p;->b(Lre/d0;)Lye/l0;

    move-result-object p0

    invoke-static {}, Lcf/f0;->h0()Lcf/f0$b;

    move-result-object v0

    invoke-virtual {p0}, Lye/l0;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcf/f0$b;->F(Ljava/lang/String;)Lcf/f0$b;

    move-result-object v0

    invoke-virtual {p0}, Lye/l0;->g()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcf/f0$b;->G(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcf/f0$b;

    move-result-object v0

    invoke-virtual {p0}, Lye/l0;->d()Lcf/f0$c;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcf/f0$b;->D(Lcf/f0$c;)Lcf/f0$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->q()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object v0

    check-cast v0, Lcf/f0;

    const-class v1, Lre/z;

    invoke-static {v0, v1}, Lre/b0;->c(Lcf/f0;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lre/z;

    new-instance v1, Lef/o;

    invoke-static {p0}, Lef/p;->d(Lye/l0;)[B

    move-result-object v2

    invoke-static {p0}, Lef/p;->c(Lye/l0;)[B

    move-result-object p0

    invoke-direct {v1, v0, v2, p0}, Lef/o;-><init>(Lre/z;[B[B)V

    return-object v1
.end method


# virtual methods
.method public a([B)[B
    .locals 2

    iget-object v0, p0, Lef/o;->c:[B

    array-length v1, v0

    if-nez v1, :cond_0

    iget-object v0, p0, Lef/o;->a:Lre/z;

    invoke-interface {v0, p1}, Lre/z;->a([B)[B

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lef/o;->a:Lre/z;

    filled-new-array {p1, v0}, [[B

    move-result-object p1

    invoke-static {p1}, Lff/e;->a([[B)[B

    move-result-object p1

    invoke-interface {v1, p1}, Lre/z;->a([B)[B

    move-result-object p1

    :goto_0
    iget-object v0, p0, Lef/o;->b:[B

    array-length v1, v0

    if-nez v1, :cond_1

    return-object p1

    :cond_1
    filled-new-array {v0, p1}, [[B

    move-result-object p1

    invoke-static {p1}, Lff/e;->a([[B)[B

    move-result-object p1

    return-object p1
.end method
