.class public abstract Lnb/xd;
.super Lnb/td;
.source "SourceFile"


# instance fields
.field public c:Z


# direct methods
.method public constructor <init>(Lnb/me;)V
    .locals 0

    invoke-direct {p0, p1}, Lnb/td;-><init>(Lnb/me;)V

    iget-object p1, p0, Lnb/td;->b:Lnb/me;

    invoke-virtual {p1}, Lnb/me;->e0()V

    return-void
.end method


# virtual methods
.method public final i()Z
    .locals 1

    iget-boolean v0, p0, Lnb/xd;->c:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final j()V
    .locals 2

    invoke-virtual {p0}, Lnb/xd;->i()Z

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

    iget-boolean v0, p0, Lnb/xd;->c:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lnb/xd;->l()Z

    iget-object v0, p0, Lnb/td;->b:Lnb/me;

    invoke-virtual {v0}, Lnb/me;->f0()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lnb/xd;->c:Z

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Can\'t initialize twice"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public abstract l()Z
.end method
