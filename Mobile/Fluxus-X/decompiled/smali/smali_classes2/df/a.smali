.class public final Ldf/a;
.super Ldf/a1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldf/a$b;,
        Ldf/a$d;,
        Ldf/a$c;,
        Ldf/a$e;,
        Ldf/a$f;
    }
.end annotation


# instance fields
.field public final a:Ldf/a$e;

.field public final b:Ldf/a$c;

.field public final c:Ldf/a$d;

.field public final d:Ldf/a$f;


# direct methods
.method public constructor <init>(Ldf/a$e;Ldf/a$c;Ldf/a$d;Ldf/a$f;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ldf/a1;-><init>()V

    .line 3
    iput-object p1, p0, Ldf/a;->a:Ldf/a$e;

    .line 4
    iput-object p2, p0, Ldf/a;->b:Ldf/a$c;

    .line 5
    iput-object p3, p0, Ldf/a;->c:Ldf/a$d;

    .line 6
    iput-object p4, p0, Ldf/a;->d:Ldf/a$f;

    return-void
.end method

.method public synthetic constructor <init>(Ldf/a$e;Ldf/a$c;Ldf/a$d;Ldf/a$f;Ldf/a$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Ldf/a;-><init>(Ldf/a$e;Ldf/a$c;Ldf/a$d;Ldf/a$f;)V

    return-void
.end method

.method public static b()Ldf/a$b;
    .locals 2

    new-instance v0, Ldf/a$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ldf/a$b;-><init>(Ldf/a$a;)V

    return-object v0
.end method


# virtual methods
.method public a()Z
    .locals 2

    iget-object v0, p0, Ldf/a;->d:Ldf/a$f;

    sget-object v1, Ldf/a$f;->e:Ldf/a$f;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public c()Ldf/a$c;
    .locals 1

    iget-object v0, p0, Ldf/a;->b:Ldf/a$c;

    return-object v0
.end method

.method public d()Ldf/a$d;
    .locals 1

    iget-object v0, p0, Ldf/a;->c:Ldf/a$d;

    return-object v0
.end method

.method public e()Ldf/a$e;
    .locals 1

    iget-object v0, p0, Ldf/a;->a:Ldf/a$e;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Ldf/a;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Ldf/a;

    invoke-virtual {p1}, Ldf/a;->e()Ldf/a$e;

    move-result-object v0

    invoke-virtual {p0}, Ldf/a;->e()Ldf/a$e;

    move-result-object v2

    if-ne v0, v2, :cond_1

    invoke-virtual {p1}, Ldf/a;->c()Ldf/a$c;

    move-result-object v0

    invoke-virtual {p0}, Ldf/a;->c()Ldf/a$c;

    move-result-object v2

    if-ne v0, v2, :cond_1

    invoke-virtual {p1}, Ldf/a;->d()Ldf/a$d;

    move-result-object v0

    invoke-virtual {p0}, Ldf/a;->d()Ldf/a$d;

    move-result-object v2

    if-ne v0, v2, :cond_1

    invoke-virtual {p1}, Ldf/a;->f()Ldf/a$f;

    move-result-object p1

    invoke-virtual {p0}, Ldf/a;->f()Ldf/a$f;

    move-result-object v0

    if-ne p1, v0, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public f()Ldf/a$f;
    .locals 1

    iget-object v0, p0, Ldf/a;->d:Ldf/a$f;

    return-object v0
.end method

.method public hashCode()I
    .locals 5

    iget-object v0, p0, Ldf/a;->a:Ldf/a$e;

    iget-object v1, p0, Ldf/a;->b:Ldf/a$c;

    iget-object v2, p0, Ldf/a;->c:Ldf/a$d;

    iget-object v3, p0, Ldf/a;->d:Ldf/a$f;

    const-class v4, Ldf/a;

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

    const-string v1, "ECDSA Parameters (variant: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldf/a;->d:Ldf/a$f;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", hashType: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldf/a;->c:Ldf/a$d;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", encoding: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldf/a;->a:Ldf/a$e;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", curve: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldf/a;->b:Ldf/a$c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
