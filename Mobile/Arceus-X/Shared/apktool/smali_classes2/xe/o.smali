.class public final Lxe/o;
.super Lxe/r;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxe/o$b;,
        Lxe/o$c;,
        Lxe/o$d;
    }
.end annotation


# instance fields
.field public final a:I

.field public final b:I

.field public final c:Lxe/o$d;

.field public final d:Lxe/o$c;


# direct methods
.method public constructor <init>(IILxe/o$d;Lxe/o$c;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lxe/r;-><init>()V

    .line 3
    iput p1, p0, Lxe/o;->a:I

    .line 4
    iput p2, p0, Lxe/o;->b:I

    .line 5
    iput-object p3, p0, Lxe/o;->c:Lxe/o$d;

    .line 6
    iput-object p4, p0, Lxe/o;->d:Lxe/o$c;

    return-void
.end method

.method public synthetic constructor <init>(IILxe/o$d;Lxe/o$c;Lxe/o$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lxe/o;-><init>(IILxe/o$d;Lxe/o$c;)V

    return-void
.end method

.method public static b()Lxe/o$b;
    .locals 2

    new-instance v0, Lxe/o$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lxe/o$b;-><init>(Lxe/o$a;)V

    return-object v0
.end method


# virtual methods
.method public a()Z
    .locals 2

    iget-object v0, p0, Lxe/o;->c:Lxe/o$d;

    sget-object v1, Lxe/o$d;->e:Lxe/o$d;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lxe/o;->b:I

    return v0
.end method

.method public d()Lxe/o$c;
    .locals 1

    iget-object v0, p0, Lxe/o;->d:Lxe/o$c;

    return-object v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, Lxe/o;->a:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lxe/o;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lxe/o;

    invoke-virtual {p1}, Lxe/o;->e()I

    move-result v0

    invoke-virtual {p0}, Lxe/o;->e()I

    move-result v2

    if-ne v0, v2, :cond_1

    invoke-virtual {p1}, Lxe/o;->f()I

    move-result v0

    invoke-virtual {p0}, Lxe/o;->f()I

    move-result v2

    if-ne v0, v2, :cond_1

    invoke-virtual {p1}, Lxe/o;->g()Lxe/o$d;

    move-result-object v0

    invoke-virtual {p0}, Lxe/o;->g()Lxe/o$d;

    move-result-object v2

    if-ne v0, v2, :cond_1

    invoke-virtual {p1}, Lxe/o;->d()Lxe/o$c;

    move-result-object p1

    invoke-virtual {p0}, Lxe/o;->d()Lxe/o$c;

    move-result-object v0

    if-ne p1, v0, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public f()I
    .locals 2

    iget-object v0, p0, Lxe/o;->c:Lxe/o$d;

    sget-object v1, Lxe/o$d;->e:Lxe/o$d;

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lxe/o;->c()I

    move-result v0

    return v0

    :cond_0
    sget-object v1, Lxe/o$d;->b:Lxe/o$d;

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Lxe/o;->c()I

    move-result v0

    :goto_0
    add-int/lit8 v0, v0, 0x5

    return v0

    :cond_1
    sget-object v1, Lxe/o$d;->c:Lxe/o$d;

    if-ne v0, v1, :cond_2

    invoke-virtual {p0}, Lxe/o;->c()I

    move-result v0

    goto :goto_0

    :cond_2
    sget-object v1, Lxe/o$d;->d:Lxe/o$d;

    if-ne v0, v1, :cond_3

    invoke-virtual {p0}, Lxe/o;->c()I

    move-result v0

    goto :goto_0

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unknown variant"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public g()Lxe/o$d;
    .locals 1

    iget-object v0, p0, Lxe/o;->c:Lxe/o$d;

    return-object v0
.end method

.method public hashCode()I
    .locals 5

    iget v0, p0, Lxe/o;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget v1, p0, Lxe/o;->b:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, Lxe/o;->c:Lxe/o$d;

    iget-object v3, p0, Lxe/o;->d:Lxe/o$c;

    const-class v4, Lxe/o;

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

    const-string v1, "HMAC Parameters (variant: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lxe/o;->c:Lxe/o$d;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", hashType: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lxe/o;->d:Lxe/o$c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lxe/o;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "-byte tags, and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lxe/o;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "-byte key)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
