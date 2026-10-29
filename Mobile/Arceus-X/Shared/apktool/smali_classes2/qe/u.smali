.class public final Lqe/u;
.super Lqe/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqe/u$b;,
        Lqe/u$c;
    }
.end annotation


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:Lqe/u$c;


# direct methods
.method public constructor <init>(IIILqe/u$c;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lqe/c;-><init>()V

    .line 3
    iput p1, p0, Lqe/u;->a:I

    .line 4
    iput p2, p0, Lqe/u;->b:I

    .line 5
    iput p3, p0, Lqe/u;->c:I

    .line 6
    iput-object p4, p0, Lqe/u;->d:Lqe/u$c;

    return-void
.end method

.method public synthetic constructor <init>(IIILqe/u$c;Lqe/u$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lqe/u;-><init>(IIILqe/u$c;)V

    return-void
.end method

.method public static b()Lqe/u$b;
    .locals 2

    new-instance v0, Lqe/u$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lqe/u$b;-><init>(Lqe/u$a;)V

    return-object v0
.end method


# virtual methods
.method public a()Z
    .locals 2

    iget-object v0, p0, Lqe/u;->d:Lqe/u$c;

    sget-object v1, Lqe/u$c;->d:Lqe/u$c;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lqe/u;->b:I

    return v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lqe/u;->a:I

    return v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, Lqe/u;->c:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lqe/u;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lqe/u;

    invoke-virtual {p1}, Lqe/u;->d()I

    move-result v0

    invoke-virtual {p0}, Lqe/u;->d()I

    move-result v2

    if-ne v0, v2, :cond_1

    invoke-virtual {p1}, Lqe/u;->c()I

    move-result v0

    invoke-virtual {p0}, Lqe/u;->c()I

    move-result v2

    if-ne v0, v2, :cond_1

    invoke-virtual {p1}, Lqe/u;->e()I

    move-result v0

    invoke-virtual {p0}, Lqe/u;->e()I

    move-result v2

    if-ne v0, v2, :cond_1

    invoke-virtual {p1}, Lqe/u;->f()Lqe/u$c;

    move-result-object p1

    invoke-virtual {p0}, Lqe/u;->f()Lqe/u$c;

    move-result-object v0

    if-ne p1, v0, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public f()Lqe/u$c;
    .locals 1

    iget-object v0, p0, Lqe/u;->d:Lqe/u$c;

    return-object v0
.end method

.method public hashCode()I
    .locals 5

    iget v0, p0, Lqe/u;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget v1, p0, Lqe/u;->b:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget v2, p0, Lqe/u;->c:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget-object v3, p0, Lqe/u;->d:Lqe/u$c;

    const-class v4, Lqe/u;

    filled-new-array {v4, v0, v1, v2, v3}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AesGcm Parameters (variant: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lqe/u;->d:Lqe/u$c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lqe/u;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "-byte IV, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lqe/u;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "-byte tag, and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lqe/u;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "-byte key)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
