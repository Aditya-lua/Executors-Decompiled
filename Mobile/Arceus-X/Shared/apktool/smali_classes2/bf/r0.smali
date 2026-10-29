.class public final Lbf/r0;
.super Lbf/a1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbf/r0$b;,
        Lbf/r0$c;,
        Lbf/r0$d;
    }
.end annotation


# static fields
.field public static final g:Ljava/math/BigInteger;


# instance fields
.field public final a:I

.field public final b:Ljava/math/BigInteger;

.field public final c:Lbf/r0$d;

.field public final d:Lbf/r0$c;

.field public final e:Lbf/r0$c;

.field public final f:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-wide/32 v0, 0x10001

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    sput-object v0, Lbf/r0;->g:Ljava/math/BigInteger;

    return-void
.end method

.method public constructor <init>(ILjava/math/BigInteger;Lbf/r0$d;Lbf/r0$c;Lbf/r0$c;I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lbf/a1;-><init>()V

    .line 3
    iput p1, p0, Lbf/r0;->a:I

    .line 4
    iput-object p2, p0, Lbf/r0;->b:Ljava/math/BigInteger;

    .line 5
    iput-object p3, p0, Lbf/r0;->c:Lbf/r0$d;

    .line 6
    iput-object p4, p0, Lbf/r0;->d:Lbf/r0$c;

    .line 7
    iput-object p5, p0, Lbf/r0;->e:Lbf/r0$c;

    .line 8
    iput p6, p0, Lbf/r0;->f:I

    return-void
.end method

.method public synthetic constructor <init>(ILjava/math/BigInteger;Lbf/r0$d;Lbf/r0$c;Lbf/r0$c;ILbf/r0$a;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p6}, Lbf/r0;-><init>(ILjava/math/BigInteger;Lbf/r0$d;Lbf/r0$c;Lbf/r0$c;I)V

    return-void
.end method

.method public static b()Lbf/r0$b;
    .locals 2

    new-instance v0, Lbf/r0$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lbf/r0$b;-><init>(Lbf/r0$a;)V

    return-object v0
.end method


# virtual methods
.method public a()Z
    .locals 2

    iget-object v0, p0, Lbf/r0;->c:Lbf/r0$d;

    sget-object v1, Lbf/r0$d;->e:Lbf/r0$d;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public c()Lbf/r0$c;
    .locals 1

    iget-object v0, p0, Lbf/r0;->e:Lbf/r0$c;

    return-object v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lbf/r0;->a:I

    return v0
.end method

.method public e()Ljava/math/BigInteger;
    .locals 1

    iget-object v0, p0, Lbf/r0;->b:Ljava/math/BigInteger;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lbf/r0;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lbf/r0;

    invoke-virtual {p1}, Lbf/r0;->d()I

    move-result v0

    invoke-virtual {p0}, Lbf/r0;->d()I

    move-result v2

    if-ne v0, v2, :cond_1

    invoke-virtual {p1}, Lbf/r0;->e()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {p0}, Lbf/r0;->e()Ljava/math/BigInteger;

    move-result-object v2

    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lbf/r0;->h()Lbf/r0$d;

    move-result-object v0

    invoke-virtual {p0}, Lbf/r0;->h()Lbf/r0$d;

    move-result-object v2

    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lbf/r0;->g()Lbf/r0$c;

    move-result-object v0

    invoke-virtual {p0}, Lbf/r0;->g()Lbf/r0$c;

    move-result-object v2

    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lbf/r0;->c()Lbf/r0$c;

    move-result-object v0

    invoke-virtual {p0}, Lbf/r0;->c()Lbf/r0$c;

    move-result-object v2

    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lbf/r0;->f()I

    move-result p1

    invoke-virtual {p0}, Lbf/r0;->f()I

    move-result v0

    if-ne p1, v0, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public f()I
    .locals 1

    iget v0, p0, Lbf/r0;->f:I

    return v0
.end method

.method public g()Lbf/r0$c;
    .locals 1

    iget-object v0, p0, Lbf/r0;->d:Lbf/r0$c;

    return-object v0
.end method

.method public h()Lbf/r0$d;
    .locals 1

    iget-object v0, p0, Lbf/r0;->c:Lbf/r0$d;

    return-object v0
.end method

.method public hashCode()I
    .locals 8

    iget v0, p0, Lbf/r0;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget-object v3, p0, Lbf/r0;->b:Ljava/math/BigInteger;

    iget-object v4, p0, Lbf/r0;->c:Lbf/r0$d;

    iget-object v5, p0, Lbf/r0;->d:Lbf/r0$c;

    iget-object v6, p0, Lbf/r0;->e:Lbf/r0$c;

    iget v0, p0, Lbf/r0;->f:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const-class v1, Lbf/r0;

    filled-new-array/range {v1 .. v7}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RSA SSA PSS Parameters (variant: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lbf/r0;->c:Lbf/r0$d;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", signature hashType: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lbf/r0;->d:Lbf/r0$c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mgf1 hashType: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lbf/r0;->e:Lbf/r0$c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", saltLengthBytes: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lbf/r0;->f:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", publicExponent: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lbf/r0;->b:Ljava/math/BigInteger;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lbf/r0;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "-bit modulus)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
