.class public final Lqe/n0;
.super Lqe/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqe/n0$a;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lqe/n0$a;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lqe/n0$a;)V
    .locals 0

    invoke-direct {p0}, Lqe/c;-><init>()V

    iput-object p1, p0, Lqe/n0;->a:Ljava/lang/String;

    iput-object p2, p0, Lqe/n0;->b:Lqe/n0$a;

    return-void
.end method

.method public static b(Ljava/lang/String;Lqe/n0$a;)Lqe/n0;
    .locals 1

    new-instance v0, Lqe/n0;

    invoke-direct {v0, p0, p1}, Lqe/n0;-><init>(Ljava/lang/String;Lqe/n0$a;)V

    return-object v0
.end method


# virtual methods
.method public a()Z
    .locals 2

    iget-object v0, p0, Lqe/n0;->b:Lqe/n0$a;

    sget-object v1, Lqe/n0$a;->c:Lqe/n0$a;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lqe/n0;->a:Ljava/lang/String;

    return-object v0
.end method

.method public d()Lqe/n0$a;
    .locals 1

    iget-object v0, p0, Lqe/n0;->b:Lqe/n0$a;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lqe/n0;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lqe/n0;

    iget-object v0, p1, Lqe/n0;->a:Ljava/lang/String;

    iget-object v2, p0, Lqe/n0;->a:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p1, p1, Lqe/n0;->b:Lqe/n0$a;

    iget-object v0, p0, Lqe/n0;->b:Lqe/n0$a;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lqe/n0;->a:Ljava/lang/String;

    iget-object v1, p0, Lqe/n0;->b:Lqe/n0$a;

    const-class v2, Lqe/n0;

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

    const-string v1, "LegacyKmsAead Parameters (keyUri: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lqe/n0;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", variant: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lqe/n0;->b:Lqe/n0$a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
