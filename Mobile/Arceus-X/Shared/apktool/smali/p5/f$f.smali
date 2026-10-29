.class public abstract Lp5/f$f;
.super Lp5/f$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp5/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "f"
.end annotation


# instance fields
.field public a:[Landroidx/core/graphics/e$b;

.field public b:Ljava/lang/String;

.field public c:I

.field public d:I


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lp5/f$e;-><init>(Lp5/f$a;)V

    .line 2
    iput-object v0, p0, Lp5/f$f;->a:[Landroidx/core/graphics/e$b;

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Lp5/f$f;->c:I

    return-void
.end method

.method public constructor <init>(Lp5/f$f;)V
    .locals 1

    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, v0}, Lp5/f$e;-><init>(Lp5/f$a;)V

    .line 5
    iput-object v0, p0, Lp5/f$f;->a:[Landroidx/core/graphics/e$b;

    const/4 v0, 0x0

    .line 6
    iput v0, p0, Lp5/f$f;->c:I

    .line 7
    iget-object v0, p1, Lp5/f$f;->b:Ljava/lang/String;

    iput-object v0, p0, Lp5/f$f;->b:Ljava/lang/String;

    .line 8
    iget v0, p1, Lp5/f$f;->d:I

    iput v0, p0, Lp5/f$f;->d:I

    .line 9
    iget-object p1, p1, Lp5/f$f;->a:[Landroidx/core/graphics/e$b;

    invoke-static {p1}, Landroidx/core/graphics/e;->f([Landroidx/core/graphics/e$b;)[Landroidx/core/graphics/e$b;

    move-result-object p1

    iput-object p1, p0, Lp5/f$f;->a:[Landroidx/core/graphics/e$b;

    return-void
.end method


# virtual methods
.method public c()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public d(Landroid/graphics/Path;)V
    .locals 1

    invoke-virtual {p1}, Landroid/graphics/Path;->reset()V

    iget-object v0, p0, Lp5/f$f;->a:[Landroidx/core/graphics/e$b;

    if-eqz v0, :cond_0

    invoke-static {v0, p1}, Landroidx/core/graphics/e$b;->h([Landroidx/core/graphics/e$b;Landroid/graphics/Path;)V

    :cond_0
    return-void
.end method

.method public getPathData()[Landroidx/core/graphics/e$b;
    .locals 1

    iget-object v0, p0, Lp5/f$f;->a:[Landroidx/core/graphics/e$b;

    return-object v0
.end method

.method public getPathName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lp5/f$f;->b:Ljava/lang/String;

    return-object v0
.end method

.method public setPathData([Landroidx/core/graphics/e$b;)V
    .locals 1

    iget-object v0, p0, Lp5/f$f;->a:[Landroidx/core/graphics/e$b;

    invoke-static {v0, p1}, Landroidx/core/graphics/e;->b([Landroidx/core/graphics/e$b;[Landroidx/core/graphics/e$b;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Landroidx/core/graphics/e;->f([Landroidx/core/graphics/e$b;)[Landroidx/core/graphics/e$b;

    move-result-object p1

    iput-object p1, p0, Lp5/f$f;->a:[Landroidx/core/graphics/e$b;

    return-void

    :cond_0
    iget-object v0, p0, Lp5/f$f;->a:[Landroidx/core/graphics/e$b;

    invoke-static {v0, p1}, Landroidx/core/graphics/e;->k([Landroidx/core/graphics/e$b;[Landroidx/core/graphics/e$b;)V

    return-void
.end method
