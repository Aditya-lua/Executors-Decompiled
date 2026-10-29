.class public final Lcg/b$b;
.super Lcg/f$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:J

.field public c:Lcg/f$b;

.field public d:B


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcg/f$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcg/f;
    .locals 8

    iget-byte v0, p0, Lcg/b$b;->d:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    new-instance v2, Lcg/b;

    iget-object v3, p0, Lcg/b$b;->a:Ljava/lang/String;

    iget-wide v4, p0, Lcg/b$b;->b:J

    iget-object v6, p0, Lcg/b$b;->c:Lcg/f$b;

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v7}, Lcg/b;-><init>(Ljava/lang/String;JLcg/f$b;Lcg/b$a;)V

    return-object v2

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Missing required properties:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " tokenExpirationTimestamp"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b(Lcg/f$b;)Lcg/f$a;
    .locals 0

    iput-object p1, p0, Lcg/b$b;->c:Lcg/f$b;

    return-object p0
.end method

.method public c(Ljava/lang/String;)Lcg/f$a;
    .locals 0

    iput-object p1, p0, Lcg/b$b;->a:Ljava/lang/String;

    return-object p0
.end method

.method public d(J)Lcg/f$a;
    .locals 0

    iput-wide p1, p0, Lcg/b$b;->b:J

    iget-byte p1, p0, Lcg/b$b;->d:B

    or-int/lit8 p1, p1, 0x1

    int-to-byte p1, p1

    iput-byte p1, p0, Lcg/b$b;->d:B

    return-object p0
.end method
