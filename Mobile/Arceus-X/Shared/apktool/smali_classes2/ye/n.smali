.class public final Lye/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpe/w;


# static fields
.field public static final d:[B


# instance fields
.field public final a:Lpe/w;

.field public final b:Laf/p0;

.field public final c:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x1

    new-array v0, v0, [B

    const/4 v1, 0x0

    aput-byte v1, v0, v1

    sput-object v0, Lye/n;->d:[B

    return-void
.end method

.method public constructor <init>(Lpe/w;Laf/p0;[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lye/n;->a:Lpe/w;

    iput-object p2, p0, Lye/n;->b:Laf/p0;

    iput-object p3, p0, Lye/n;->c:[B

    return-void
.end method

.method public static c(Lwe/p;)Lpe/w;
    .locals 4

    invoke-static {}, Lpe/j;->a()Lpe/d0;

    move-result-object v0

    invoke-virtual {p0, v0}, Lwe/p;->b(Lpe/d0;)Lwe/l0;

    move-result-object v0

    invoke-static {}, Laf/f0;->h0()Laf/f0$b;

    move-result-object v1

    invoke-virtual {v0}, Lwe/l0;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Laf/f0$b;->D(Ljava/lang/String;)Laf/f0$b;

    move-result-object v1

    invoke-virtual {v0}, Lwe/l0;->g()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v2

    invoke-virtual {v1, v2}, Laf/f0$b;->E(Lcom/google/crypto/tink/shaded/protobuf/h;)Laf/f0$b;

    move-result-object v1

    invoke-virtual {v0}, Lwe/l0;->d()Laf/f0$c;

    move-result-object v2

    invoke-virtual {v1, v2}, Laf/f0$b;->C(Laf/f0$c;)Laf/f0$b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->o()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object v1

    check-cast v1, Laf/f0;

    invoke-static {}, Lwe/o0;->d()Lwe/o0;

    move-result-object v2

    const-class v3, Lpe/w;

    invoke-virtual {v2, v1, v3}, Lwe/o0;->e(Laf/f0;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpe/w;

    invoke-virtual {v0}, Lwe/l0;->e()Laf/p0;

    move-result-object v0

    sget-object v2, Lye/n$a;->a:[I

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

    invoke-virtual {p0}, Lwe/p;->a()Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-static {p0}, Lwe/e0;->b(I)Lef/a;

    move-result-object p0

    invoke-virtual {p0}, Lef/a;->d()[B

    move-result-object p0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "unknown output prefix type"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    invoke-virtual {p0}, Lwe/p;->a()Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-static {p0}, Lwe/e0;->a(I)Lef/a;

    move-result-object p0

    invoke-virtual {p0}, Lef/a;->d()[B

    move-result-object p0

    goto :goto_0

    :cond_2
    sget-object p0, Lwe/e0;->a:Lef/a;

    invoke-virtual {p0}, Lef/a;->d()[B

    move-result-object p0

    :goto_0
    new-instance v2, Lye/n;

    invoke-direct {v2, v1, v0, p0}, Lye/n;-><init>(Lpe/w;Laf/p0;[B)V

    return-object v2
.end method


# virtual methods
.method public a([B[B)V
    .locals 3

    array-length v0, p1

    const/16 v1, 0xa

    if-lt v0, v1, :cond_3

    iget-object v0, p0, Lye/n;->b:Laf/p0;

    sget-object v1, Laf/p0;->d:Laf/p0;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lye/n;->d:[B

    filled-new-array {p2, v0}, [[B

    move-result-object p2

    invoke-static {p2}, Ldf/e;->a([[B)[B

    move-result-object p2

    :cond_0
    const/4 v0, 0x0

    new-array v0, v0, [B

    iget-object v1, p0, Lye/n;->b:Laf/p0;

    sget-object v2, Laf/p0;->e:Laf/p0;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    const/4 v0, 0x5

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v1

    array-length v2, p1

    invoke-static {p1, v0, v2}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p1

    move-object v0, v1

    :cond_1
    iget-object v1, p0, Lye/n;->c:[B

    invoke-static {v1, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lye/n;->a:Lpe/w;

    invoke-interface {v0, p1, p2}, Lpe/w;->a([B[B)V

    return-void

    :cond_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "wrong prefix"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "tag too short"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b([B)[B
    .locals 2

    iget-object v0, p0, Lye/n;->b:Laf/p0;

    sget-object v1, Laf/p0;->d:Laf/p0;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lye/n;->d:[B

    filled-new-array {p1, v0}, [[B

    move-result-object p1

    invoke-static {p1}, Ldf/e;->a([[B)[B

    move-result-object p1

    :cond_0
    iget-object v0, p0, Lye/n;->c:[B

    iget-object v1, p0, Lye/n;->a:Lpe/w;

    invoke-interface {v1, p1}, Lpe/w;->b([B)[B

    move-result-object p1

    filled-new-array {v0, p1}, [[B

    move-result-object p1

    invoke-static {p1}, Ldf/e;->a([[B)[B

    move-result-object p1

    return-object p1
.end method
