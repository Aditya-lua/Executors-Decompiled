.class public final Laf/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lre/w;


# static fields
.field public static final d:[B


# instance fields
.field public final a:Lre/w;

.field public final b:Lcf/p0;

.field public final c:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x1

    new-array v0, v0, [B

    const/4 v1, 0x0

    aput-byte v1, v0, v1

    sput-object v0, Laf/n;->d:[B

    return-void
.end method

.method public constructor <init>(Lre/w;Lcf/p0;[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Laf/n;->a:Lre/w;

    iput-object p2, p0, Laf/n;->b:Lcf/p0;

    iput-object p3, p0, Laf/n;->c:[B

    return-void
.end method

.method public static c(Lye/p;)Lre/w;
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

    const-class v3, Lre/w;

    invoke-virtual {v2, v1, v3}, Lye/o0;->e(Lcf/f0;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lre/w;

    invoke-virtual {v0}, Lye/l0;->e()Lcf/p0;

    move-result-object v0

    sget-object v2, Laf/n$a;->a:[I

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

    const-string v0, "unknown output prefix type"

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
    new-instance v2, Laf/n;

    invoke-direct {v2, v1, v0, p0}, Laf/n;-><init>(Lre/w;Lcf/p0;[B)V

    return-object v2
.end method


# virtual methods
.method public a([B[B)V
    .locals 3

    array-length v0, p1

    const/16 v1, 0xa

    if-lt v0, v1, :cond_3

    iget-object v0, p0, Laf/n;->b:Lcf/p0;

    sget-object v1, Lcf/p0;->d:Lcf/p0;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Laf/n;->d:[B

    filled-new-array {p2, v0}, [[B

    move-result-object p2

    invoke-static {p2}, Lff/e;->a([[B)[B

    move-result-object p2

    :cond_0
    const/4 v0, 0x0

    new-array v0, v0, [B

    iget-object v1, p0, Laf/n;->b:Lcf/p0;

    sget-object v2, Lcf/p0;->e:Lcf/p0;

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
    iget-object v1, p0, Laf/n;->c:[B

    invoke-static {v1, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Laf/n;->a:Lre/w;

    invoke-interface {v0, p1, p2}, Lre/w;->a([B[B)V

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

    iget-object v0, p0, Laf/n;->b:Lcf/p0;

    sget-object v1, Lcf/p0;->d:Lcf/p0;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Laf/n;->d:[B

    filled-new-array {p1, v0}, [[B

    move-result-object p1

    invoke-static {p1}, Lff/e;->a([[B)[B

    move-result-object p1

    :cond_0
    iget-object v0, p0, Laf/n;->c:[B

    iget-object v1, p0, Laf/n;->a:Lre/w;

    invoke-interface {v1, p1}, Lre/w;->b([B)[B

    move-result-object p1

    filled-new-array {v0, p1}, [[B

    move-result-object p1

    invoke-static {p1}, Lff/e;->a([[B)[B

    move-result-object p1

    return-object p1
.end method
