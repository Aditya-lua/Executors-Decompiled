.class public final Ldf/i;
.super Ldf/a1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldf/i$a;
    }
.end annotation


# instance fields
.field public final a:Ldf/i$a;


# direct methods
.method public constructor <init>(Ldf/i$a;)V
    .locals 0

    invoke-direct {p0}, Ldf/a1;-><init>()V

    iput-object p1, p0, Ldf/i;->a:Ldf/i$a;

    return-void
.end method

.method public static b(Ldf/i$a;)Ldf/i;
    .locals 1

    new-instance v0, Ldf/i;

    invoke-direct {v0, p0}, Ldf/i;-><init>(Ldf/i$a;)V

    return-object v0
.end method


# virtual methods
.method public a()Z
    .locals 2

    iget-object v0, p0, Ldf/i;->a:Ldf/i$a;

    sget-object v1, Ldf/i$a;->e:Ldf/i$a;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public c()Ldf/i$a;
    .locals 1

    iget-object v0, p0, Ldf/i;->a:Ldf/i$a;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Ldf/i;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Ldf/i;

    invoke-virtual {p1}, Ldf/i;->c()Ldf/i$a;

    move-result-object p1

    invoke-virtual {p0}, Ldf/i;->c()Ldf/i$a;

    move-result-object v0

    if-ne p1, v0, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public hashCode()I
    .locals 2

    const-class v0, Ldf/i;

    iget-object v1, p0, Ldf/i;->a:Ldf/i$a;

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Ed25519 Parameters (variant: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldf/i;->a:Ldf/i$a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
