.class public final Lef/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lre/a0;


# instance fields
.field public final a:Lre/a0;

.field public final b:[B

.field public final c:[B


# direct methods
.method public constructor <init>(Lre/a0;[B[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lef/p;->a:Lre/a0;

    iput-object p2, p0, Lef/p;->b:[B

    iput-object p3, p0, Lef/p;->c:[B

    return-void
.end method

.method public static b(Lye/p;)Lre/a0;
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

    const-class v1, Lre/a0;

    invoke-static {v0, v1}, Lre/b0;->c(Lcf/f0;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lre/a0;

    new-instance v1, Lef/p;

    invoke-static {p0}, Lef/p;->d(Lye/l0;)[B

    move-result-object v2

    invoke-static {p0}, Lef/p;->c(Lye/l0;)[B

    move-result-object p0

    invoke-direct {v1, v0, v2, p0}, Lef/p;-><init>(Lre/a0;[B[B)V

    return-object v1
.end method

.method public static c(Lye/l0;)[B
    .locals 1

    invoke-virtual {p0}, Lye/l0;->e()Lcf/p0;

    move-result-object p0

    sget-object v0, Lcf/p0;->d:Lcf/p0;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    new-array p0, p0, [B

    aput-byte v0, p0, v0

    return-object p0

    :cond_0
    new-array p0, v0, [B

    return-object p0
.end method

.method public static d(Lye/l0;)[B
    .locals 2

    sget-object v0, Lef/p$a;->a:[I

    invoke-virtual {p0}, Lye/l0;->e()Lcf/p0;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 p0, 0x4

    if-ne v0, p0, :cond_0

    sget-object p0, Lye/e0;->a:Lgf/a;

    invoke-virtual {p0}, Lgf/a;->d()[B

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "unknown output prefix type"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    invoke-virtual {p0}, Lye/l0;->c()Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-static {p0}, Lye/e0;->b(I)Lgf/a;

    move-result-object p0

    invoke-virtual {p0}, Lgf/a;->d()[B

    move-result-object p0

    return-object p0

    :cond_2
    invoke-virtual {p0}, Lye/l0;->c()Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-static {p0}, Lye/e0;->a(I)Lgf/a;

    move-result-object p0

    invoke-virtual {p0}, Lgf/a;->d()[B

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a([B[B)V
    .locals 2

    iget-object v0, p0, Lef/p;->b:[B

    array-length v1, v0

    if-nez v1, :cond_0

    iget-object v1, p0, Lef/p;->c:[B

    array-length v1, v1

    if-nez v1, :cond_0

    iget-object v0, p0, Lef/p;->a:Lre/a0;

    invoke-interface {v0, p1, p2}, Lre/a0;->a([B[B)V

    return-void

    :cond_0
    invoke-static {v0, p1}, Lye/s0;->e([B[B)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lef/p;->c:[B

    array-length v1, v0

    if-eqz v1, :cond_1

    filled-new-array {p2, v0}, [[B

    move-result-object p2

    invoke-static {p2}, Lff/e;->a([[B)[B

    move-result-object p2

    :cond_1
    iget-object v0, p0, Lef/p;->b:[B

    array-length v0, v0

    array-length v1, p1

    invoke-static {p1, v0, v1}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p1

    iget-object v0, p0, Lef/p;->a:Lre/a0;

    invoke-interface {v0, p1, p2}, Lre/a0;->a([B[B)V

    return-void

    :cond_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Invalid signature (output prefix mismatch)"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
