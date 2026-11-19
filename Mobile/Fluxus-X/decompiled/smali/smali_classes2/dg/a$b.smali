.class public final Ldg/a$b;
.super Ldg/d$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldg/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ldg/c$a;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:J

.field public f:J

.field public g:Ljava/lang/String;

.field public h:B


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ldg/d$a;-><init>()V

    return-void
.end method

.method public constructor <init>(Ldg/d;)V
    .locals 2

    .line 3
    invoke-direct {p0}, Ldg/d$a;-><init>()V

    .line 4
    invoke-virtual {p1}, Ldg/d;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldg/a$b;->a:Ljava/lang/String;

    .line 5
    invoke-virtual {p1}, Ldg/d;->g()Ldg/c$a;

    move-result-object v0

    iput-object v0, p0, Ldg/a$b;->b:Ldg/c$a;

    .line 6
    invoke-virtual {p1}, Ldg/d;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldg/a$b;->c:Ljava/lang/String;

    .line 7
    invoke-virtual {p1}, Ldg/d;->f()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldg/a$b;->d:Ljava/lang/String;

    .line 8
    invoke-virtual {p1}, Ldg/d;->c()J

    move-result-wide v0

    iput-wide v0, p0, Ldg/a$b;->e:J

    .line 9
    invoke-virtual {p1}, Ldg/d;->h()J

    move-result-wide v0

    iput-wide v0, p0, Ldg/a$b;->f:J

    .line 10
    invoke-virtual {p1}, Ldg/d;->e()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ldg/a$b;->g:Ljava/lang/String;

    const/4 p1, 0x3

    .line 11
    iput-byte p1, p0, Ldg/a$b;->h:B

    return-void
.end method

.method public synthetic constructor <init>(Ldg/d;Ldg/a$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ldg/a$b;-><init>(Ldg/d;)V

    return-void
.end method


# virtual methods
.method public a()Ldg/d;
    .locals 12

    iget-byte v0, p0, Ldg/a$b;->h:B

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Ldg/a$b;->b:Ldg/c$a;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Ldg/a;

    iget-object v2, p0, Ldg/a$b;->a:Ljava/lang/String;

    iget-object v3, p0, Ldg/a$b;->b:Ldg/c$a;

    iget-object v4, p0, Ldg/a$b;->c:Ljava/lang/String;

    iget-object v5, p0, Ldg/a$b;->d:Ljava/lang/String;

    iget-wide v6, p0, Ldg/a$b;->e:J

    iget-wide v8, p0, Ldg/a$b;->f:J

    iget-object v10, p0, Ldg/a$b;->g:Ljava/lang/String;

    const/4 v11, 0x0

    invoke-direct/range {v1 .. v11}, Ldg/a;-><init>(Ljava/lang/String;Ldg/c$a;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ldg/a$a;)V

    return-object v1

    :cond_1
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ldg/a$b;->b:Ldg/c$a;

    if-nez v1, :cond_2

    const-string v1, " registrationStatus"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    iget-byte v1, p0, Ldg/a$b;->h:B

    and-int/lit8 v1, v1, 0x1

    if-nez v1, :cond_3

    const-string v1, " expiresInSecs"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    iget-byte v1, p0, Ldg/a$b;->h:B

    and-int/lit8 v1, v1, 0x2

    if-nez v1, :cond_4

    const-string v1, " tokenCreationEpochInSecs"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_4
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Missing required properties:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public b(Ljava/lang/String;)Ldg/d$a;
    .locals 0

    iput-object p1, p0, Ldg/a$b;->c:Ljava/lang/String;

    return-object p0
.end method

.method public c(J)Ldg/d$a;
    .locals 0

    iput-wide p1, p0, Ldg/a$b;->e:J

    iget-byte p1, p0, Ldg/a$b;->h:B

    or-int/lit8 p1, p1, 0x1

    int-to-byte p1, p1

    iput-byte p1, p0, Ldg/a$b;->h:B

    return-object p0
.end method

.method public d(Ljava/lang/String;)Ldg/d$a;
    .locals 0

    iput-object p1, p0, Ldg/a$b;->a:Ljava/lang/String;

    return-object p0
.end method

.method public e(Ljava/lang/String;)Ldg/d$a;
    .locals 0

    iput-object p1, p0, Ldg/a$b;->g:Ljava/lang/String;

    return-object p0
.end method

.method public f(Ljava/lang/String;)Ldg/d$a;
    .locals 0

    iput-object p1, p0, Ldg/a$b;->d:Ljava/lang/String;

    return-object p0
.end method

.method public g(Ldg/c$a;)Ldg/d$a;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Ldg/a$b;->b:Ldg/c$a;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null registrationStatus"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public h(J)Ldg/d$a;
    .locals 0

    iput-wide p1, p0, Ldg/a$b;->f:J

    iget-byte p1, p0, Ldg/a$b;->h:B

    or-int/lit8 p1, p1, 0x2

    int-to-byte p1, p1

    iput-byte p1, p0, Ldg/a$b;->h:B

    return-object p0
.end method
