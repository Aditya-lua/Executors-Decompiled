.class public final Lqe/z;
.super Lqe/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqe/z$b;,
        Lqe/z$c;
    }
.end annotation


# instance fields
.field public final a:I

.field public final b:Lqe/z$c;


# direct methods
.method public constructor <init>(ILqe/z$c;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lqe/c;-><init>()V

    .line 3
    iput p1, p0, Lqe/z;->a:I

    .line 4
    iput-object p2, p0, Lqe/z;->b:Lqe/z$c;

    return-void
.end method

.method public synthetic constructor <init>(ILqe/z$c;Lqe/z$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lqe/z;-><init>(ILqe/z$c;)V

    return-void
.end method

.method public static b()Lqe/z$b;
    .locals 2

    new-instance v0, Lqe/z$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lqe/z$b;-><init>(Lqe/z$a;)V

    return-object v0
.end method


# virtual methods
.method public a()Z
    .locals 2

    iget-object v0, p0, Lqe/z;->b:Lqe/z$c;

    sget-object v1, Lqe/z$c;->d:Lqe/z$c;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lqe/z;->a:I

    return v0
.end method

.method public d()Lqe/z$c;
    .locals 1

    iget-object v0, p0, Lqe/z;->b:Lqe/z$c;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lqe/z;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lqe/z;

    invoke-virtual {p1}, Lqe/z;->c()I

    move-result v0

    invoke-virtual {p0}, Lqe/z;->c()I

    move-result v2

    if-ne v0, v2, :cond_1

    invoke-virtual {p1}, Lqe/z;->d()Lqe/z$c;

    move-result-object p1

    invoke-virtual {p0}, Lqe/z;->d()Lqe/z$c;

    move-result-object v0

    if-ne p1, v0, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lqe/z;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Lqe/z;->b:Lqe/z$c;

    const-class v2, Lqe/z;

    filled-new-array {v2, v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AesGcmSiv Parameters (variant: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lqe/z;->b:Lqe/z$c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lqe/z;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "-byte key)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
