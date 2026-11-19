.class public final Lp1/k;
.super Landroidx/lifecycle/b0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Landroidx/lifecycle/b0<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public m:Landroidx/lifecycle/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/a0<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/lifecycle/b0;-><init>()V

    return-void
.end method


# virtual methods
.method public f()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lp1/k;->m:Landroidx/lifecycle/a0;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Landroidx/lifecycle/a0;->f()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public r(Landroidx/lifecycle/a0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/a0<",
            "TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lp1/k;->m:Landroidx/lifecycle/a0;

    if-eqz v0, :cond_0

    invoke-super {p0, v0}, Landroidx/lifecycle/b0;->q(Landroidx/lifecycle/a0;)V

    :cond_0
    iput-object p1, p0, Lp1/k;->m:Landroidx/lifecycle/a0;

    new-instance v0, Lp1/j;

    invoke-direct {v0, p0}, Lp1/j;-><init>(Lp1/k;)V

    invoke-super {p0, p1, v0}, Landroidx/lifecycle/b0;->p(Landroidx/lifecycle/a0;Landroidx/lifecycle/e0;)V

    return-void
.end method
