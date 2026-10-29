.class public final Lwe/t$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwe/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public final a:Lpe/n;

.field public final b:I

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lpe/n;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lwe/t$c;->a:Lpe/n;

    .line 4
    iput p2, p0, Lwe/t$c;->b:I

    .line 5
    iput-object p3, p0, Lwe/t$c;->c:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lwe/t$c;->d:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lpe/n;ILjava/lang/String;Ljava/lang/String;Lwe/t$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lwe/t$c;-><init>(Lpe/n;ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lwe/t$c;->b:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lwe/t$c;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lwe/t$c;

    iget-object v0, p0, Lwe/t$c;->a:Lpe/n;

    iget-object v2, p1, Lwe/t$c;->a:Lpe/n;

    if-ne v0, v2, :cond_1

    iget v0, p0, Lwe/t$c;->b:I

    iget v2, p1, Lwe/t$c;->b:I

    if-ne v0, v2, :cond_1

    iget-object v0, p0, Lwe/t$c;->c:Ljava/lang/String;

    iget-object v2, p1, Lwe/t$c;->c:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lwe/t$c;->d:Ljava/lang/String;

    iget-object p1, p1, Lwe/t$c;->d:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lwe/t$c;->a:Lpe/n;

    iget v1, p0, Lwe/t$c;->b:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, Lwe/t$c;->c:Ljava/lang/String;

    iget-object v3, p0, Lwe/t$c;->d:Ljava/lang/String;

    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lwe/t$c;->a:Lpe/n;

    iget v1, p0, Lwe/t$c;->b:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, Lwe/t$c;->c:Ljava/lang/String;

    iget-object v3, p0, Lwe/t$c;->d:Ljava/lang/String;

    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "(status=%s, keyId=%s, keyType=\'%s\', keyPrefix=\'%s\')"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
