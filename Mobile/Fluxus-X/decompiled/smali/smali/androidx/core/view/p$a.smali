.class public Landroidx/core/view/p$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/view/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:Landroidx/lifecycle/l;

.field public b:Landroidx/lifecycle/p;


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Landroidx/core/view/p$a;->a:Landroidx/lifecycle/l;

    iget-object v1, p0, Landroidx/core/view/p$a;->b:Landroidx/lifecycle/p;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/l;->d(Landroidx/lifecycle/r;)V

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/core/view/p$a;->b:Landroidx/lifecycle/p;

    return-void
.end method
