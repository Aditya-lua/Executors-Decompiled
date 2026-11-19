.class public final Lse/t1;
.super Lse/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lse/t1$a;
    }
.end annotation


# instance fields
.field public final a:Lse/t1$a;


# direct methods
.method public constructor <init>(Lse/t1$a;)V
    .locals 0

    invoke-direct {p0}, Lse/c;-><init>()V

    iput-object p1, p0, Lse/t1;->a:Lse/t1$a;

    return-void
.end method

.method public static b(Lse/t1$a;)Lse/t1;
    .locals 1

    new-instance v0, Lse/t1;

    invoke-direct {v0, p0}, Lse/t1;-><init>(Lse/t1$a;)V

    return-object v0
.end method


# virtual methods
.method public a()Z
    .locals 2

    iget-object v0, p0, Lse/t1;->a:Lse/t1$a;

    sget-object v1, Lse/t1$a;->d:Lse/t1$a;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public c()Lse/t1$a;
    .locals 1

    iget-object v0, p0, Lse/t1;->a:Lse/t1$a;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lse/t1;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lse/t1;

    invoke-virtual {p1}, Lse/t1;->c()Lse/t1$a;

    move-result-object p1

    invoke-virtual {p0}, Lse/t1;->c()Lse/t1$a;

    move-result-object v0

    if-ne p1, v0, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public hashCode()I
    .locals 2

    const-class v0, Lse/t1;

    iget-object v1, p0, Lse/t1;->a:Lse/t1$a;

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

    const-string v1, "XChaCha20Poly1305 Parameters (variant: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lse/t1;->a:Lse/t1$a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
