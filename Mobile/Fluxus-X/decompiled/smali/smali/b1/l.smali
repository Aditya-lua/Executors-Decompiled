.class public Lb1/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln0/e0;


# instance fields
.field public final a:Ln0/e0;

.field public final b:Ln0/z3;

.field public final c:J


# direct methods
.method public constructor <init>(Ln0/e0;Ln0/z3;J)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lb1/l;->a:Ln0/e0;

    .line 5
    iput-object p2, p0, Lb1/l;->b:Ln0/z3;

    .line 6
    iput-wide p3, p0, Lb1/l;->c:J

    return-void
.end method

.method public constructor <init>(Ln0/z3;J)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0, p1, p2, p3}, Lb1/l;-><init>(Ln0/e0;Ln0/z3;J)V

    return-void
.end method

.method public constructor <init>(Ln0/z3;Ln0/e0;)V
    .locals 2

    const-wide/16 v0, -0x1

    .line 1
    invoke-direct {p0, p2, p1, v0, v1}, Lb1/l;-><init>(Ln0/e0;Ln0/z3;J)V

    return-void
.end method


# virtual methods
.method public b()Ln0/d0;
    .locals 1

    iget-object v0, p0, Lb1/l;->a:Ln0/e0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ln0/e0;->b()Ln0/d0;

    move-result-object v0

    return-object v0

    :cond_0
    sget-object v0, Ln0/d0;->a:Ln0/d0;

    return-object v0
.end method

.method public c()Ln0/z3;
    .locals 1

    iget-object v0, p0, Lb1/l;->b:Ln0/z3;

    return-object v0
.end method

.method public d()Ln0/b0;
    .locals 1

    iget-object v0, p0, Lb1/l;->a:Ln0/e0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ln0/e0;->d()Ln0/b0;

    move-result-object v0

    return-object v0

    :cond_0
    sget-object v0, Ln0/b0;->a:Ln0/b0;

    return-object v0
.end method

.method public f()Ln0/x;
    .locals 1

    iget-object v0, p0, Lb1/l;->a:Ln0/e0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ln0/e0;->f()Ln0/x;

    move-result-object v0

    return-object v0

    :cond_0
    sget-object v0, Ln0/x;->a:Ln0/x;

    return-object v0
.end method

.method public g()Ln0/a0;
    .locals 1

    iget-object v0, p0, Lb1/l;->a:Ln0/e0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ln0/e0;->g()Ln0/a0;

    move-result-object v0

    return-object v0

    :cond_0
    sget-object v0, Ln0/a0;->a:Ln0/a0;

    return-object v0
.end method

.method public getTimestamp()J
    .locals 4

    iget-object v0, p0, Lb1/l;->a:Ln0/e0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ln0/e0;->getTimestamp()J

    move-result-wide v0

    return-wide v0

    :cond_0
    iget-wide v0, p0, Lb1/l;->c:J

    const-wide/16 v2, -0x1

    cmp-long v2, v0, v2

    if-eqz v2, :cond_1

    return-wide v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No timestamp is available."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public h()Ln0/c0;
    .locals 1

    iget-object v0, p0, Lb1/l;->a:Ln0/e0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ln0/e0;->h()Ln0/c0;

    move-result-object v0

    return-object v0

    :cond_0
    sget-object v0, Ln0/c0;->a:Ln0/c0;

    return-object v0
.end method

.method public i()Ln0/z;
    .locals 1

    iget-object v0, p0, Lb1/l;->a:Ln0/e0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ln0/e0;->i()Ln0/z;

    move-result-object v0

    return-object v0

    :cond_0
    sget-object v0, Ln0/z;->a:Ln0/z;

    return-object v0
.end method

.method public j()Ln0/y;
    .locals 1

    iget-object v0, p0, Lb1/l;->a:Ln0/e0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ln0/e0;->j()Ln0/y;

    move-result-object v0

    return-object v0

    :cond_0
    sget-object v0, Ln0/y;->a:Ln0/y;

    return-object v0
.end method
