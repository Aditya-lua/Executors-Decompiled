.class public final Lqe/o1;
.super Lqe/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqe/o1$a;
    }
.end annotation


# instance fields
.field public final a:Lqe/o1$a;

.field public final b:I


# direct methods
.method public constructor <init>(Lqe/o1$a;I)V
    .locals 0

    invoke-direct {p0}, Lqe/c;-><init>()V

    iput-object p1, p0, Lqe/o1;->a:Lqe/o1$a;

    iput p2, p0, Lqe/o1;->b:I

    return-void
.end method

.method public static b(Lqe/o1$a;I)Lqe/o1;
    .locals 1

    const/16 v0, 0x8

    if-lt p1, v0, :cond_0

    const/16 v0, 0xc

    if-gt p1, v0, :cond_0

    new-instance v0, Lqe/o1;

    invoke-direct {v0, p0, p1}, Lqe/o1;-><init>(Lqe/o1$a;I)V

    return-object v0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "Salt size must be between 8 and 12 bytes"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public a()Z
    .locals 2

    iget-object v0, p0, Lqe/o1;->a:Lqe/o1$a;

    sget-object v1, Lqe/o1$a;->c:Lqe/o1$a;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lqe/o1;->b:I

    return v0
.end method

.method public d()Lqe/o1$a;
    .locals 1

    iget-object v0, p0, Lqe/o1;->a:Lqe/o1$a;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lqe/o1;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lqe/o1;

    invoke-virtual {p1}, Lqe/o1;->d()Lqe/o1$a;

    move-result-object v0

    invoke-virtual {p0}, Lqe/o1;->d()Lqe/o1$a;

    move-result-object v2

    if-ne v0, v2, :cond_1

    invoke-virtual {p1}, Lqe/o1;->c()I

    move-result p1

    invoke-virtual {p0}, Lqe/o1;->c()I

    move-result v0

    if-ne p1, v0, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lqe/o1;->a:Lqe/o1$a;

    iget v1, p0, Lqe/o1;->b:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-class v2, Lqe/o1;

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

    const-string v1, "X-AES-GCM Parameters (variant: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lqe/o1;->a:Lqe/o1$a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "salt_size_bytes: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lqe/o1;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
