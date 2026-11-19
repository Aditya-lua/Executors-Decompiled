.class public Lte/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lre/a;


# instance fields
.field public final a:Lre/a;

.field public final b:[B


# direct methods
.method public constructor <init>(Lre/a;[B)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lte/j0;->a:Lre/a;

    array-length p1, p2

    if-eqz p1, :cond_1

    array-length p1, p2

    const/4 v0, 0x5

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "identifier has an invalid length"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iput-object p2, p0, Lte/j0;->b:[B

    return-void
.end method

.method public static c(Lre/a;Lgf/a;)Lre/a;
    .locals 1

    new-instance v0, Lte/j0;

    invoke-virtual {p1}, Lgf/a;->d()[B

    move-result-object p1

    invoke-direct {v0, p0, p1}, Lte/j0;-><init>(Lre/a;[B)V

    return-object v0
.end method

.method public static d(Lye/p;)Lre/a;
    .locals 4

    invoke-static {}, Lre/j;->a()Lre/d0;

    move-result-object v0

    invoke-virtual {p0, v0}, Lye/p;->b(Lre/d0;)Lye/l0;

    move-result-object v0

    invoke-static {}, Lcf/f0;->h0()Lcf/f0$b;

    move-result-object v1

    invoke-virtual {v0}, Lye/l0;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcf/f0$b;->F(Ljava/lang/String;)Lcf/f0$b;

    move-result-object v1

    invoke-virtual {v0}, Lye/l0;->g()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcf/f0$b;->G(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcf/f0$b;

    move-result-object v1

    invoke-virtual {v0}, Lye/l0;->d()Lcf/f0$c;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcf/f0$b;->D(Lcf/f0$c;)Lcf/f0$b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->q()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object v1

    check-cast v1, Lcf/f0;

    invoke-static {}, Lye/o0;->d()Lye/o0;

    move-result-object v2

    const-class v3, Lre/a;

    invoke-virtual {v2, v1, v3}, Lye/o0;->e(Lcf/f0;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lre/a;

    invoke-virtual {v0}, Lye/l0;->e()Lcf/p0;

    move-result-object v0

    sget-object v2, Lte/j0$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    const/4 v3, 0x1

    if-eq v2, v3, :cond_2

    const/4 v3, 0x2

    if-eq v2, v3, :cond_1

    const/4 v3, 0x3

    if-eq v2, v3, :cond_1

    const/4 v3, 0x4

    if-ne v2, v3, :cond_0

    invoke-virtual {p0}, Lye/p;->a()Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-static {p0}, Lye/e0;->b(I)Lgf/a;

    move-result-object p0

    invoke-virtual {p0}, Lgf/a;->d()[B

    move-result-object p0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "unknown output prefix type "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    invoke-virtual {p0}, Lye/p;->a()Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-static {p0}, Lye/e0;->a(I)Lgf/a;

    move-result-object p0

    invoke-virtual {p0}, Lgf/a;->d()[B

    move-result-object p0

    goto :goto_0

    :cond_2
    sget-object p0, Lye/e0;->a:Lgf/a;

    invoke-virtual {p0}, Lgf/a;->d()[B

    move-result-object p0

    :goto_0
    new-instance v0, Lte/j0;

    invoke-direct {v0, v1, p0}, Lte/j0;-><init>(Lre/a;[B)V

    return-object v0
.end method


# virtual methods
.method public a([B[B)[B
    .locals 2

    iget-object v0, p0, Lte/j0;->b:[B

    array-length v1, v0

    if-nez v1, :cond_0

    iget-object v0, p0, Lte/j0;->a:Lre/a;

    invoke-interface {v0, p1, p2}, Lre/a;->a([B[B)[B

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v1, p0, Lte/j0;->a:Lre/a;

    invoke-interface {v1, p1, p2}, Lre/a;->a([B[B)[B

    move-result-object p1

    filled-new-array {v0, p1}, [[B

    move-result-object p1

    invoke-static {p1}, Lff/e;->a([[B)[B

    move-result-object p1

    return-object p1
.end method

.method public b([B[B)[B
    .locals 3

    iget-object v0, p0, Lte/j0;->b:[B

    array-length v1, v0

    if-nez v1, :cond_0

    iget-object v0, p0, Lte/j0;->a:Lre/a;

    invoke-interface {v0, p1, p2}, Lre/a;->b([B[B)[B

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {v0, p1}, Lye/s0;->e([B[B)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lte/j0;->a:Lre/a;

    const/4 v1, 0x5

    array-length v2, p1

    invoke-static {p1, v1, v2}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p1

    invoke-interface {v0, p1, p2}, Lre/a;->b([B[B)[B

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "wrong prefix"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
