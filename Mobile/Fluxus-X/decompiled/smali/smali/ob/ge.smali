.class public abstract Lob/ge;
.super Lob/zd;
.source "SourceFile"


# instance fields
.field public c:Z


# direct methods
.method public constructor <init>(Lob/ve;)V
    .locals 0

    invoke-direct {p0, p1}, Lob/zd;-><init>(Lob/ve;)V

    iget-object p1, p0, Lob/zd;->b:Lob/ve;

    invoke-virtual {p1}, Lob/ve;->e0()V

    return-void
.end method


# virtual methods
.method public final i()Z
    .locals 1

    iget-boolean v0, p0, Lob/ge;->c:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final j()V
    .locals 2

    invoke-virtual {p0}, Lob/ge;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Not initialized"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final k()V
    .locals 2

    iget-boolean v0, p0, Lob/ge;->c:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lob/ge;->l()Z

    iget-object v0, p0, Lob/zd;->b:Lob/ve;

    invoke-virtual {v0}, Lob/ve;->f0()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lob/ge;->c:Z

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Can\'t initialize twice"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public abstract l()Z
.end method
