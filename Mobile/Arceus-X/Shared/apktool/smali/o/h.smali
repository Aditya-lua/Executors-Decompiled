.class public Lo/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/core/view/y0;",
            ">;"
        }
    .end annotation
.end field

.field public b:J

.field public c:Landroid/view/animation/Interpolator;

.field public d:Landroidx/core/view/z0;

.field public e:Z

.field public final f:Landroidx/core/view/a1;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lo/h;->b:J

    new-instance v0, Lo/h$a;

    invoke-direct {v0, p0}, Lo/h$a;-><init>(Lo/h;)V

    iput-object v0, p0, Lo/h;->f:Landroidx/core/view/a1;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/h;->a:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    iget-boolean v0, p0, Lo/h;->e:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lo/h;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v3, v3, 0x1

    check-cast v4, Landroidx/core/view/y0;

    invoke-virtual {v4}, Landroidx/core/view/y0;->c()V

    goto :goto_0

    :cond_1
    iput-boolean v2, p0, Lo/h;->e:Z

    return-void
.end method

.method public b()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/h;->e:Z

    return-void
.end method

.method public c(Landroidx/core/view/y0;)Lo/h;
    .locals 1

    iget-boolean v0, p0, Lo/h;->e:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/h;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-object p0
.end method

.method public d(Landroidx/core/view/y0;Landroidx/core/view/y0;)Lo/h;
    .locals 2

    iget-object v0, p0, Lo/h;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Landroidx/core/view/y0;->d()J

    move-result-wide v0

    invoke-virtual {p2, v0, v1}, Landroidx/core/view/y0;->i(J)Landroidx/core/view/y0;

    iget-object p1, p0, Lo/h;->a:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public e(J)Lo/h;
    .locals 1

    iget-boolean v0, p0, Lo/h;->e:Z

    if-nez v0, :cond_0

    iput-wide p1, p0, Lo/h;->b:J

    :cond_0
    return-object p0
.end method

.method public f(Landroid/view/animation/Interpolator;)Lo/h;
    .locals 1

    iget-boolean v0, p0, Lo/h;->e:Z

    if-nez v0, :cond_0

    iput-object p1, p0, Lo/h;->c:Landroid/view/animation/Interpolator;

    :cond_0
    return-object p0
.end method

.method public g(Landroidx/core/view/z0;)Lo/h;
    .locals 1

    iget-boolean v0, p0, Lo/h;->e:Z

    if-nez v0, :cond_0

    iput-object p1, p0, Lo/h;->d:Landroidx/core/view/z0;

    :cond_0
    return-object p0
.end method

.method public h()V
    .locals 8

    iget-boolean v0, p0, Lo/h;->e:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lo/h;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_4

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v2, v2, 0x1

    check-cast v3, Landroidx/core/view/y0;

    iget-wide v4, p0, Lo/h;->b:J

    const-wide/16 v6, 0x0

    cmp-long v6, v4, v6

    if-ltz v6, :cond_1

    invoke-virtual {v3, v4, v5}, Landroidx/core/view/y0;->e(J)Landroidx/core/view/y0;

    :cond_1
    iget-object v4, p0, Lo/h;->c:Landroid/view/animation/Interpolator;

    if-eqz v4, :cond_2

    invoke-virtual {v3, v4}, Landroidx/core/view/y0;->f(Landroid/view/animation/Interpolator;)Landroidx/core/view/y0;

    :cond_2
    iget-object v4, p0, Lo/h;->d:Landroidx/core/view/z0;

    if-eqz v4, :cond_3

    iget-object v4, p0, Lo/h;->f:Landroidx/core/view/a1;

    invoke-virtual {v3, v4}, Landroidx/core/view/y0;->g(Landroidx/core/view/z0;)Landroidx/core/view/y0;

    :cond_3
    invoke-virtual {v3}, Landroidx/core/view/y0;->k()V

    goto :goto_0

    :cond_4
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/h;->e:Z

    return-void
.end method
