.class public final Lqe/u0;
.super Lqe/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqe/u0$b;,
        Lqe/u0$c;,
        Lqe/u0$d;
    }
.end annotation


# instance fields
.field public final a:Lqe/u0$d;

.field public final b:Ljava/lang/String;

.field public final c:Lqe/u0$c;

.field public final d:Lqe/c;


# direct methods
.method public constructor <init>(Lqe/u0$d;Ljava/lang/String;Lqe/u0$c;Lqe/c;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lqe/c;-><init>()V

    .line 3
    iput-object p1, p0, Lqe/u0;->a:Lqe/u0$d;

    .line 4
    iput-object p2, p0, Lqe/u0;->b:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lqe/u0;->c:Lqe/u0$c;

    .line 6
    iput-object p4, p0, Lqe/u0;->d:Lqe/c;

    return-void
.end method

.method public synthetic constructor <init>(Lqe/u0$d;Ljava/lang/String;Lqe/u0$c;Lqe/c;Lqe/u0$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lqe/u0;-><init>(Lqe/u0$d;Ljava/lang/String;Lqe/u0$c;Lqe/c;)V

    return-void
.end method

.method public static b()Lqe/u0$b;
    .locals 2

    new-instance v0, Lqe/u0$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lqe/u0$b;-><init>(Lqe/u0$a;)V

    return-object v0
.end method


# virtual methods
.method public a()Z
    .locals 2

    iget-object v0, p0, Lqe/u0;->a:Lqe/u0$d;

    sget-object v1, Lqe/u0$d;->c:Lqe/u0$d;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public c()Lqe/c;
    .locals 1

    iget-object v0, p0, Lqe/u0;->d:Lqe/c;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lqe/u0;->b:Ljava/lang/String;

    return-object v0
.end method

.method public e()Lqe/u0$d;
    .locals 1

    iget-object v0, p0, Lqe/u0;->a:Lqe/u0$d;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lqe/u0;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lqe/u0;

    iget-object v0, p1, Lqe/u0;->c:Lqe/u0$c;

    iget-object v2, p0, Lqe/u0;->c:Lqe/u0$c;

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p1, Lqe/u0;->d:Lqe/c;

    iget-object v2, p0, Lqe/u0;->d:Lqe/c;

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p1, Lqe/u0;->b:Ljava/lang/String;

    iget-object v2, p0, Lqe/u0;->b:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p1, p1, Lqe/u0;->a:Lqe/u0$d;

    iget-object v0, p0, Lqe/u0;->a:Lqe/u0$d;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public hashCode()I
    .locals 5

    iget-object v0, p0, Lqe/u0;->b:Ljava/lang/String;

    iget-object v1, p0, Lqe/u0;->c:Lqe/u0$c;

    iget-object v2, p0, Lqe/u0;->d:Lqe/c;

    iget-object v3, p0, Lqe/u0;->a:Lqe/u0$d;

    const-class v4, Lqe/u0;

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

    const-string v1, "LegacyKmsEnvelopeAead Parameters (kekUri: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lqe/u0;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", dekParsingStrategy: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lqe/u0;->c:Lqe/u0$c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", dekParametersForNewKeys: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lqe/u0;->d:Lqe/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", variant: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lqe/u0;->a:Lqe/u0$d;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
