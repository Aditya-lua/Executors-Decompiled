.class public final Lqe/k;
.super Lqe/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqe/k$b;,
        Lqe/k$c;,
        Lqe/k$d;
    }
.end annotation


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:Lqe/k$d;

.field public final f:Lqe/k$c;


# direct methods
.method public constructor <init>(IIIILqe/k$d;Lqe/k$c;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lqe/c;-><init>()V

    .line 3
    iput p1, p0, Lqe/k;->a:I

    .line 4
    iput p2, p0, Lqe/k;->b:I

    .line 5
    iput p3, p0, Lqe/k;->c:I

    .line 6
    iput p4, p0, Lqe/k;->d:I

    .line 7
    iput-object p5, p0, Lqe/k;->e:Lqe/k$d;

    .line 8
    iput-object p6, p0, Lqe/k;->f:Lqe/k$c;

    return-void
.end method

.method public synthetic constructor <init>(IIIILqe/k$d;Lqe/k$c;Lqe/k$a;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p6}, Lqe/k;-><init>(IIIILqe/k$d;Lqe/k$c;)V

    return-void
.end method

.method public static b()Lqe/k$b;
    .locals 2

    new-instance v0, Lqe/k$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lqe/k$b;-><init>(Lqe/k$a;)V

    return-object v0
.end method


# virtual methods
.method public a()Z
    .locals 2

    iget-object v0, p0, Lqe/k;->e:Lqe/k$d;

    sget-object v1, Lqe/k$d;->d:Lqe/k$d;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lqe/k;->a:I

    return v0
.end method

.method public d()Lqe/k$c;
    .locals 1

    iget-object v0, p0, Lqe/k;->f:Lqe/k$c;

    return-object v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, Lqe/k;->b:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lqe/k;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lqe/k;

    invoke-virtual {p1}, Lqe/k;->c()I

    move-result v0

    invoke-virtual {p0}, Lqe/k;->c()I

    move-result v2

    if-ne v0, v2, :cond_1

    invoke-virtual {p1}, Lqe/k;->e()I

    move-result v0

    invoke-virtual {p0}, Lqe/k;->e()I

    move-result v2

    if-ne v0, v2, :cond_1

    invoke-virtual {p1}, Lqe/k;->f()I

    move-result v0

    invoke-virtual {p0}, Lqe/k;->f()I

    move-result v2

    if-ne v0, v2, :cond_1

    invoke-virtual {p1}, Lqe/k;->g()I

    move-result v0

    invoke-virtual {p0}, Lqe/k;->g()I

    move-result v2

    if-ne v0, v2, :cond_1

    invoke-virtual {p1}, Lqe/k;->h()Lqe/k$d;

    move-result-object v0

    invoke-virtual {p0}, Lqe/k;->h()Lqe/k$d;

    move-result-object v2

    if-ne v0, v2, :cond_1

    invoke-virtual {p1}, Lqe/k;->d()Lqe/k$c;

    move-result-object p1

    invoke-virtual {p0}, Lqe/k;->d()Lqe/k$c;

    move-result-object v0

    if-ne p1, v0, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public f()I
    .locals 1

    iget v0, p0, Lqe/k;->c:I

    return v0
.end method

.method public g()I
    .locals 1

    iget v0, p0, Lqe/k;->d:I

    return v0
.end method

.method public h()Lqe/k$d;
    .locals 1

    iget-object v0, p0, Lqe/k;->e:Lqe/k$d;

    return-object v0
.end method

.method public hashCode()I
    .locals 8

    iget v0, p0, Lqe/k;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v0, p0, Lqe/k;->b:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget v0, p0, Lqe/k;->c:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iget v0, p0, Lqe/k;->d:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    iget-object v6, p0, Lqe/k;->e:Lqe/k$d;

    iget-object v7, p0, Lqe/k;->f:Lqe/k$c;

    const-class v1, Lqe/k;

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

    const-string v1, "AesCtrHmacAead Parameters (variant: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lqe/k;->e:Lqe/k$d;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", hashType: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lqe/k;->f:Lqe/k$c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lqe/k;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "-byte IV, and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lqe/k;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "-byte tags, and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lqe/k;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "-byte AES key, and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lqe/k;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "-byte HMAC key)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
