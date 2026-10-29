.class public interface abstract Ln0/e0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln0/e0$a;
    }
.end annotation


# virtual methods
.method public a(Lp0/i$b;)V
    .locals 1

    invoke-interface {p0}, Ln0/e0;->b()Ln0/d0;

    move-result-object v0

    invoke-virtual {p1, v0}, Lp0/i$b;->g(Ln0/d0;)Lp0/i$b;

    return-void
.end method

.method public abstract b()Ln0/d0;
.end method

.method public abstract c()Ln0/z3;
.end method

.method public abstract d()Ln0/b0;
.end method

.method public e()Landroid/hardware/camera2/CaptureResult;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public abstract f()Ln0/x;
.end method

.method public abstract g()Ln0/a0;
.end method

.method public abstract getTimestamp()J
.end method

.method public abstract h()Ln0/c0;
.end method

.method public abstract i()Ln0/z;
.end method

.method public abstract j()Ln0/y;
.end method
