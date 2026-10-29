.class public Landroidx/fragment/app/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroidx/fragment/app/f;

.field public final b:Le4/g0;

.field public final c:Landroidx/fragment/app/c;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public d:Z

.field public e:I


# direct methods
.method public constructor <init>(Landroidx/fragment/app/f;Le4/g0;Landroidx/fragment/app/c;)V
    .locals 1
    .param p1    # Landroidx/fragment/app/f;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Le4/g0;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Landroidx/fragment/app/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/g;->d:Z

    const/4 v0, -0x1

    .line 3
    iput v0, p0, Landroidx/fragment/app/g;->e:I

    .line 4
    iput-object p1, p0, Landroidx/fragment/app/g;->a:Landroidx/fragment/app/f;

    .line 5
    iput-object p2, p0, Landroidx/fragment/app/g;->b:Le4/g0;

    .line 6
    iput-object p3, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    return-void
.end method

.method public constructor <init>(Landroidx/fragment/app/f;Le4/g0;Landroidx/fragment/app/c;Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroidx/fragment/app/f;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Le4/g0;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Landroidx/fragment/app/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Landroid/os/Bundle;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 21
    iput-boolean v0, p0, Landroidx/fragment/app/g;->d:Z

    const/4 v1, -0x1

    .line 22
    iput v1, p0, Landroidx/fragment/app/g;->e:I

    .line 23
    iput-object p1, p0, Landroidx/fragment/app/g;->a:Landroidx/fragment/app/f;

    .line 24
    iput-object p2, p0, Landroidx/fragment/app/g;->b:Le4/g0;

    .line 25
    iput-object p3, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    const/4 p1, 0x0

    .line 26
    iput-object p1, p3, Landroidx/fragment/app/c;->c:Landroid/util/SparseArray;

    .line 27
    iput-object p1, p3, Landroidx/fragment/app/c;->d:Landroid/os/Bundle;

    .line 28
    iput v0, p3, Landroidx/fragment/app/c;->u:I

    .line 29
    iput-boolean v0, p3, Landroidx/fragment/app/c;->q:Z

    .line 30
    iput-boolean v0, p3, Landroidx/fragment/app/c;->l:Z

    .line 31
    iget-object p2, p3, Landroidx/fragment/app/c;->h:Landroidx/fragment/app/c;

    if-eqz p2, :cond_0

    iget-object p2, p2, Landroidx/fragment/app/c;->f:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object p2, p1

    :goto_0
    iput-object p2, p3, Landroidx/fragment/app/c;->i:Ljava/lang/String;

    .line 32
    iput-object p1, p3, Landroidx/fragment/app/c;->h:Landroidx/fragment/app/c;

    .line 33
    iput-object p4, p3, Landroidx/fragment/app/c;->b:Landroid/os/Bundle;

    .line 34
    const-string p1, "arguments"

    invoke-virtual {p4, p1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    iput-object p1, p3, Landroidx/fragment/app/c;->g:Landroid/os/Bundle;

    return-void
.end method

.method public constructor <init>(Landroidx/fragment/app/f;Le4/g0;Ljava/lang/ClassLoader;Landroidx/fragment/app/e;Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroidx/fragment/app/f;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Le4/g0;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/ClassLoader;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Landroidx/fragment/app/e;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Landroid/os/Bundle;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Landroidx/fragment/app/g;->d:Z

    const/4 v0, -0x1

    .line 9
    iput v0, p0, Landroidx/fragment/app/g;->e:I

    .line 10
    iput-object p1, p0, Landroidx/fragment/app/g;->a:Landroidx/fragment/app/f;

    .line 11
    iput-object p2, p0, Landroidx/fragment/app/g;->b:Le4/g0;

    .line 12
    const-string p1, "state"

    invoke-virtual {p5, p1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroidx/fragment/app/FragmentState;

    .line 13
    invoke-virtual {p1, p4, p3}, Landroidx/fragment/app/FragmentState;->a(Landroidx/fragment/app/e;Ljava/lang/ClassLoader;)Landroidx/fragment/app/c;

    move-result-object p1

    iput-object p1, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    .line 14
    iput-object p5, p1, Landroidx/fragment/app/c;->b:Landroid/os/Bundle;

    .line 15
    const-string p2, "arguments"

    invoke-virtual {p5, p2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 16
    invoke-virtual {p2, p3}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 17
    :cond_0
    invoke-virtual {p1, p2}, Landroidx/fragment/app/c;->O1(Landroid/os/Bundle;)V

    const/4 p2, 0x2

    .line 18
    invoke-static {p2}, Landroidx/fragment/app/FragmentManager;->N0(I)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 19
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Instantiated fragment "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "FragmentManager"

    invoke-static {p2, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    const/4 v0, 0x3

    invoke-static {v0}, Landroidx/fragment/app/FragmentManager;->N0(I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "moveto ACTIVITY_CREATED: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentManager"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-object v0, v0, Landroidx/fragment/app/c;->b:Landroid/os/Bundle;

    if-eqz v0, :cond_1

    const-string v1, "savedInstanceState"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    invoke-virtual {v1, v0}, Landroidx/fragment/app/c;->g1(Landroid/os/Bundle;)V

    iget-object v1, p0, Landroidx/fragment/app/g;->a:Landroidx/fragment/app/f;

    iget-object v2, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v0, v3}, Landroidx/fragment/app/f;->a(Landroidx/fragment/app/c;Landroid/os/Bundle;Z)V

    return-void
.end method

.method public b()V
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-object v0, v0, Landroidx/fragment/app/c;->J:Landroid/view/ViewGroup;

    invoke-static {v0}, Landroidx/fragment/app/FragmentManager;->q0(Landroid/view/View;)Landroidx/fragment/app/c;

    move-result-object v0

    iget-object v1, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    invoke-virtual {v1}, Landroidx/fragment/app/c;->K()Landroidx/fragment/app/c;

    move-result-object v1

    if-eqz v0, :cond_0

    invoke-virtual {v0, v1}, Landroidx/fragment/app/c;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget v2, v1, Landroidx/fragment/app/c;->A:I

    invoke-static {v1, v0, v2}, Lf4/c;->l(Landroidx/fragment/app/c;Landroidx/fragment/app/c;I)V

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/g;->b:Le4/g0;

    iget-object v1, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    invoke-virtual {v0, v1}, Le4/g0;->j(Landroidx/fragment/app/c;)I

    move-result v0

    iget-object v1, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-object v2, v1, Landroidx/fragment/app/c;->J:Landroid/view/ViewGroup;

    iget-object v1, v1, Landroidx/fragment/app/c;->K:Landroid/view/View;

    invoke-virtual {v2, v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    return-void
.end method

.method public c()V
    .locals 6

    const/4 v0, 0x3

    invoke-static {v0}, Landroidx/fragment/app/FragmentManager;->N0(I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "moveto ATTACHED: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentManager"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-object v1, v0, Landroidx/fragment/app/c;->h:Landroidx/fragment/app/c;

    const/4 v2, 0x0

    const-string v3, " that does not belong to this FragmentManager!"

    const-string v4, " declared target fragment "

    const-string v5, "Fragment "

    if-eqz v1, :cond_2

    iget-object v0, p0, Landroidx/fragment/app/g;->b:Le4/g0;

    iget-object v1, v1, Landroidx/fragment/app/c;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Le4/g0;->n(Ljava/lang/String;)Landroidx/fragment/app/g;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-object v3, v1, Landroidx/fragment/app/c;->h:Landroidx/fragment/app/c;

    iget-object v3, v3, Landroidx/fragment/app/c;->f:Ljava/lang/String;

    iput-object v3, v1, Landroidx/fragment/app/c;->i:Ljava/lang/String;

    iput-object v2, v1, Landroidx/fragment/app/c;->h:Landroidx/fragment/app/c;

    move-object v2, v0

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-object v2, v2, Landroidx/fragment/app/c;->h:Landroidx/fragment/app/c;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v0, v0, Landroidx/fragment/app/c;->i:Ljava/lang/String;

    if-eqz v0, :cond_4

    iget-object v1, p0, Landroidx/fragment/app/g;->b:Le4/g0;

    invoke-virtual {v1, v0}, Le4/g0;->n(Ljava/lang/String;)Landroidx/fragment/app/g;

    move-result-object v2

    if-eqz v2, :cond_3

    goto :goto_0

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-object v2, v2, Landroidx/fragment/app/c;->i:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    :goto_0
    if-eqz v2, :cond_5

    invoke-virtual {v2}, Landroidx/fragment/app/g;->m()V

    :cond_5
    iget-object v0, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-object v1, v0, Landroidx/fragment/app/c;->v:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v1}, Landroidx/fragment/app/FragmentManager;->A0()Le4/t;

    move-result-object v1

    iput-object v1, v0, Landroidx/fragment/app/c;->w:Le4/t;

    iget-object v0, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-object v1, v0, Landroidx/fragment/app/c;->v:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v1}, Landroidx/fragment/app/FragmentManager;->D0()Landroidx/fragment/app/c;

    move-result-object v1

    iput-object v1, v0, Landroidx/fragment/app/c;->y:Landroidx/fragment/app/c;

    iget-object v0, p0, Landroidx/fragment/app/g;->a:Landroidx/fragment/app/f;

    iget-object v1, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/f;->g(Landroidx/fragment/app/c;Z)V

    iget-object v0, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    invoke-virtual {v0}, Landroidx/fragment/app/c;->h1()V

    iget-object v0, p0, Landroidx/fragment/app/g;->a:Landroidx/fragment/app/f;

    iget-object v1, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/f;->b(Landroidx/fragment/app/c;Z)V

    return-void
.end method

.method public d()I
    .locals 9

    iget-object v0, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-object v1, v0, Landroidx/fragment/app/c;->v:Landroidx/fragment/app/FragmentManager;

    if-nez v1, :cond_0

    iget v0, v0, Landroidx/fragment/app/c;->a:I

    return v0

    :cond_0
    iget v1, p0, Landroidx/fragment/app/g;->e:I

    sget-object v2, Landroidx/fragment/app/g$b;->a:[I

    iget-object v0, v0, Landroidx/fragment/app/c;->U:Landroidx/lifecycle/l$b;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v2, v0

    const/4 v2, 0x5

    const/4 v3, -0x1

    const/4 v4, 0x3

    const/4 v5, 0x4

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eq v0, v7, :cond_4

    if-eq v0, v6, :cond_3

    if-eq v0, v4, :cond_2

    if-eq v0, v5, :cond_1

    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    move-result v1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v1

    goto :goto_0

    :cond_2
    invoke-static {v1, v7}, Ljava/lang/Math;->min(II)I

    move-result v1

    goto :goto_0

    :cond_3
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    :cond_4
    :goto_0
    iget-object v0, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-boolean v8, v0, Landroidx/fragment/app/c;->p:Z

    if-eqz v8, :cond_7

    iget-boolean v8, v0, Landroidx/fragment/app/c;->q:Z

    if-eqz v8, :cond_5

    iget v0, p0, Landroidx/fragment/app/g;->e:I

    invoke-static {v0, v6}, Ljava/lang/Math;->max(II)I

    move-result v1

    iget-object v0, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-object v0, v0, Landroidx/fragment/app/c;->K:Landroid/view/View;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-nez v0, :cond_7

    invoke-static {v1, v6}, Ljava/lang/Math;->min(II)I

    move-result v1

    goto :goto_1

    :cond_5
    iget v8, p0, Landroidx/fragment/app/g;->e:I

    if-ge v8, v5, :cond_6

    iget v0, v0, Landroidx/fragment/app/c;->a:I

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v1

    goto :goto_1

    :cond_6
    invoke-static {v1, v7}, Ljava/lang/Math;->min(II)I

    move-result v1

    :cond_7
    :goto_1
    iget-object v0, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-boolean v8, v0, Landroidx/fragment/app/c;->r:Z

    if-eqz v8, :cond_8

    iget-object v0, v0, Landroidx/fragment/app/c;->J:Landroid/view/ViewGroup;

    if-nez v0, :cond_8

    invoke-static {v1, v5}, Ljava/lang/Math;->min(II)I

    move-result v1

    :cond_8
    iget-object v0, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-boolean v0, v0, Landroidx/fragment/app/c;->l:Z

    if-nez v0, :cond_9

    invoke-static {v1, v7}, Ljava/lang/Math;->min(II)I

    move-result v1

    :cond_9
    iget-object v0, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-object v8, v0, Landroidx/fragment/app/c;->J:Landroid/view/ViewGroup;

    if-eqz v8, :cond_a

    invoke-virtual {v0}, Landroidx/fragment/app/c;->M()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-static {v8, v0}, Landroidx/fragment/app/i;->u(Landroid/view/ViewGroup;Landroidx/fragment/app/FragmentManager;)Landroidx/fragment/app/i;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroidx/fragment/app/i;->s(Landroidx/fragment/app/g;)Landroidx/fragment/app/i$d$a;

    move-result-object v0

    goto :goto_2

    :cond_a
    const/4 v0, 0x0

    :goto_2
    sget-object v8, Landroidx/fragment/app/i$d$a;->b:Landroidx/fragment/app/i$d$a;

    if-ne v0, v8, :cond_b

    const/4 v0, 0x6

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v1

    goto :goto_3

    :cond_b
    sget-object v8, Landroidx/fragment/app/i$d$a;->c:Landroidx/fragment/app/i$d$a;

    if-ne v0, v8, :cond_c

    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    move-result v1

    goto :goto_3

    :cond_c
    iget-object v0, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-boolean v8, v0, Landroidx/fragment/app/c;->m:Z

    if-eqz v8, :cond_e

    invoke-virtual {v0}, Landroidx/fragment/app/c;->s0()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-static {v1, v7}, Ljava/lang/Math;->min(II)I

    move-result v1

    goto :goto_3

    :cond_d
    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    move-result v1

    :cond_e
    :goto_3
    iget-object v0, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-boolean v3, v0, Landroidx/fragment/app/c;->L:Z

    if-eqz v3, :cond_f

    iget v0, v0, Landroidx/fragment/app/c;->a:I

    if-ge v0, v2, :cond_f

    invoke-static {v1, v5}, Ljava/lang/Math;->min(II)I

    move-result v1

    :cond_f
    iget-object v0, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-boolean v0, v0, Landroidx/fragment/app/c;->n:Z

    if-eqz v0, :cond_10

    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    move-result v1

    :cond_10
    invoke-static {v6}, Landroidx/fragment/app/FragmentManager;->N0(I)Z

    move-result v0

    if-eqz v0, :cond_11

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "computeExpectedState() of "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " for "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "FragmentManager"

    invoke-static {v2, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_11
    return v1
.end method

.method public e()V
    .locals 4

    const/4 v0, 0x3

    invoke-static {v0}, Landroidx/fragment/app/FragmentManager;->N0(I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "moveto CREATED: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentManager"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-object v0, v0, Landroidx/fragment/app/c;->b:Landroid/os/Bundle;

    if-eqz v0, :cond_1

    const-string v1, "savedInstanceState"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-boolean v2, v1, Landroidx/fragment/app/c;->S:Z

    if-nez v2, :cond_2

    iget-object v2, p0, Landroidx/fragment/app/g;->a:Landroidx/fragment/app/f;

    const/4 v3, 0x0

    invoke-virtual {v2, v1, v0, v3}, Landroidx/fragment/app/f;->h(Landroidx/fragment/app/c;Landroid/os/Bundle;Z)V

    iget-object v1, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    invoke-virtual {v1, v0}, Landroidx/fragment/app/c;->k1(Landroid/os/Bundle;)V

    iget-object v1, p0, Landroidx/fragment/app/g;->a:Landroidx/fragment/app/f;

    iget-object v2, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    invoke-virtual {v1, v2, v0, v3}, Landroidx/fragment/app/f;->c(Landroidx/fragment/app/c;Landroid/os/Bundle;Z)V

    return-void

    :cond_2
    const/4 v0, 0x1

    iput v0, v1, Landroidx/fragment/app/c;->a:I

    invoke-virtual {v1}, Landroidx/fragment/app/c;->K1()V

    return-void
.end method

.method public f()V
    .locals 8

    iget-object v0, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-boolean v0, v0, Landroidx/fragment/app/c;->p:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x3

    invoke-static {v0}, Landroidx/fragment/app/FragmentManager;->N0(I)Z

    move-result v1

    const-string v2, "FragmentManager"

    if-eqz v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "moveto CREATE_VIEW: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    iget-object v1, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-object v1, v1, Landroidx/fragment/app/c;->b:Landroid/os/Bundle;

    const/4 v3, 0x0

    if-eqz v1, :cond_2

    const-string v4, "savedInstanceState"

    invoke-virtual {v1, v4}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    goto :goto_0

    :cond_2
    move-object v1, v3

    :goto_0
    iget-object v4, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    invoke-virtual {v4, v1}, Landroidx/fragment/app/c;->q1(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    move-result-object v4

    iget-object v5, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-object v6, v5, Landroidx/fragment/app/c;->J:Landroid/view/ViewGroup;

    if-eqz v6, :cond_3

    move-object v3, v6

    goto/16 :goto_2

    :cond_3
    iget v6, v5, Landroidx/fragment/app/c;->A:I

    if-eqz v6, :cond_7

    const/4 v3, -0x1

    if-eq v6, v3, :cond_6

    iget-object v3, v5, Landroidx/fragment/app/c;->v:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v3}, Landroidx/fragment/app/FragmentManager;->w0()Le4/r;

    move-result-object v3

    iget-object v5, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget v5, v5, Landroidx/fragment/app/c;->A:I

    invoke-virtual {v3, v5}, Le4/r;->d(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/view/ViewGroup;

    if-nez v3, :cond_5

    iget-object v5, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-boolean v6, v5, Landroidx/fragment/app/c;->s:Z

    if-nez v6, :cond_7

    iget-boolean v6, v5, Landroidx/fragment/app/c;->r:Z

    if-eqz v6, :cond_4

    goto :goto_2

    :cond_4
    :try_start_0
    invoke-virtual {v5}, Landroidx/fragment/app/c;->T()Landroid/content/res/Resources;

    move-result-object v0

    iget-object v1, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget v1, v1, Landroidx/fragment/app/c;->A:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    const-string v0, "unknown"

    :goto_1
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "No view found for id 0x"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget v3, v3, Landroidx/fragment/app/c;->A:I

    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " ("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ") for fragment "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_5
    instance-of v5, v3, Landroidx/fragment/app/FragmentContainerView;

    if-nez v5, :cond_7

    iget-object v5, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    invoke-static {v5, v3}, Lf4/c;->k(Landroidx/fragment/app/c;Landroid/view/ViewGroup;)V

    goto :goto_2

    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Cannot create fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " for a container view with no id"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    :goto_2
    iget-object v5, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iput-object v3, v5, Landroidx/fragment/app/c;->J:Landroid/view/ViewGroup;

    invoke-virtual {v5, v4, v3, v1}, Landroidx/fragment/app/c;->m1(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V

    iget-object v4, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-object v4, v4, Landroidx/fragment/app/c;->K:Landroid/view/View;

    const/4 v5, 0x2

    if-eqz v4, :cond_d

    invoke-static {v0}, Landroidx/fragment/app/FragmentManager;->N0(I)Z

    move-result v0

    if-eqz v0, :cond_8

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "moveto VIEW_CREATED: "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_8
    iget-object v0, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-object v0, v0, Landroidx/fragment/app/c;->K:Landroid/view/View;

    const/4 v4, 0x0

    invoke-virtual {v0, v4}, Landroid/view/View;->setSaveFromParentEnabled(Z)V

    iget-object v0, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-object v6, v0, Landroidx/fragment/app/c;->K:Landroid/view/View;

    sget v7, Ld4/b;->a:I

    invoke-virtual {v6, v7, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    if-eqz v3, :cond_9

    invoke-virtual {p0}, Landroidx/fragment/app/g;->b()V

    :cond_9
    iget-object v0, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-boolean v3, v0, Landroidx/fragment/app/c;->C:Z

    if-eqz v3, :cond_a

    iget-object v0, v0, Landroidx/fragment/app/c;->K:Landroid/view/View;

    const/16 v3, 0x8

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    :cond_a
    iget-object v0, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-object v0, v0, Landroidx/fragment/app/c;->K:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-eqz v0, :cond_b

    iget-object v0, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-object v0, v0, Landroidx/fragment/app/c;->K:Landroid/view/View;

    invoke-static {v0}, Landroidx/core/view/o0;->j0(Landroid/view/View;)V

    goto :goto_3

    :cond_b
    iget-object v0, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-object v0, v0, Landroidx/fragment/app/c;->K:Landroid/view/View;

    new-instance v3, Landroidx/fragment/app/g$a;

    invoke-direct {v3, p0, v0}, Landroidx/fragment/app/g$a;-><init>(Landroidx/fragment/app/g;Landroid/view/View;)V

    invoke-virtual {v0, v3}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    :goto_3
    iget-object v0, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    invoke-virtual {v0}, Landroidx/fragment/app/c;->D1()V

    iget-object v0, p0, Landroidx/fragment/app/g;->a:Landroidx/fragment/app/f;

    iget-object v3, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-object v6, v3, Landroidx/fragment/app/c;->K:Landroid/view/View;

    invoke-virtual {v0, v3, v6, v1, v4}, Landroidx/fragment/app/f;->m(Landroidx/fragment/app/c;Landroid/view/View;Landroid/os/Bundle;Z)V

    iget-object v0, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-object v0, v0, Landroidx/fragment/app/c;->K:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    iget-object v1, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-object v1, v1, Landroidx/fragment/app/c;->K:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getAlpha()F

    move-result v1

    iget-object v3, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    invoke-virtual {v3, v1}, Landroidx/fragment/app/c;->U1(F)V

    iget-object v1, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-object v3, v1, Landroidx/fragment/app/c;->J:Landroid/view/ViewGroup;

    if-eqz v3, :cond_d

    if-nez v0, :cond_d

    iget-object v0, v1, Landroidx/fragment/app/c;->K:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_c

    iget-object v1, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    invoke-virtual {v1, v0}, Landroidx/fragment/app/c;->R1(Landroid/view/View;)V

    invoke-static {v5}, Landroidx/fragment/app/FragmentManager;->N0(I)Z

    move-result v1

    if-eqz v1, :cond_c

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestFocus: Saved focused view "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " for Fragment "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_c
    iget-object v0, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-object v0, v0, Landroidx/fragment/app/c;->K:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    :cond_d
    iget-object v0, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iput v5, v0, Landroidx/fragment/app/c;->a:I

    return-void
.end method

.method public g()V
    .locals 6

    const/4 v0, 0x3

    invoke-static {v0}, Landroidx/fragment/app/FragmentManager;->N0(I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "movefrom CREATED: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentManager"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-boolean v1, v0, Landroidx/fragment/app/c;->m:Z

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Landroidx/fragment/app/c;->s0()Z

    move-result v0

    if-nez v0, :cond_1

    move v0, v2

    goto :goto_0

    :cond_1
    move v0, v3

    :goto_0
    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v4, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-boolean v5, v4, Landroidx/fragment/app/c;->o:Z

    if-nez v5, :cond_2

    iget-object v5, p0, Landroidx/fragment/app/g;->b:Le4/g0;

    iget-object v4, v4, Landroidx/fragment/app/c;->f:Ljava/lang/String;

    invoke-virtual {v5, v4, v1}, Le4/g0;->B(Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    :cond_2
    if-nez v0, :cond_5

    iget-object v4, p0, Landroidx/fragment/app/g;->b:Le4/g0;

    invoke-virtual {v4}, Le4/g0;->p()Le4/d0;

    move-result-object v4

    iget-object v5, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    invoke-virtual {v4, v5}, Le4/d0;->q(Landroidx/fragment/app/c;)Z

    move-result v4

    if-eqz v4, :cond_3

    goto :goto_1

    :cond_3
    iget-object v0, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-object v0, v0, Landroidx/fragment/app/c;->i:Ljava/lang/String;

    if-eqz v0, :cond_4

    iget-object v1, p0, Landroidx/fragment/app/g;->b:Le4/g0;

    invoke-virtual {v1, v0}, Le4/g0;->f(Ljava/lang/String;)Landroidx/fragment/app/c;

    move-result-object v0

    if-eqz v0, :cond_4

    iget-boolean v1, v0, Landroidx/fragment/app/c;->E:Z

    if-eqz v1, :cond_4

    iget-object v1, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iput-object v0, v1, Landroidx/fragment/app/c;->h:Landroidx/fragment/app/c;

    :cond_4
    iget-object v0, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iput v3, v0, Landroidx/fragment/app/c;->a:I

    return-void

    :cond_5
    :goto_1
    iget-object v4, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-object v4, v4, Landroidx/fragment/app/c;->w:Le4/t;

    instance-of v5, v4, Landroidx/lifecycle/c1;

    if-eqz v5, :cond_6

    iget-object v2, p0, Landroidx/fragment/app/g;->b:Le4/g0;

    invoke-virtual {v2}, Le4/g0;->p()Le4/d0;

    move-result-object v2

    invoke-virtual {v2}, Le4/d0;->n()Z

    move-result v2

    goto :goto_2

    :cond_6
    invoke-virtual {v4}, Le4/t;->g()Landroid/content/Context;

    move-result-object v5

    instance-of v5, v5, Landroid/app/Activity;

    if-eqz v5, :cond_7

    invoke-virtual {v4}, Le4/t;->g()Landroid/content/Context;

    move-result-object v4

    check-cast v4, Landroid/app/Activity;

    invoke-virtual {v4}, Landroid/app/Activity;->isChangingConfigurations()Z

    move-result v4

    xor-int/2addr v2, v4

    :cond_7
    :goto_2
    if-eqz v0, :cond_8

    iget-object v0, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-boolean v0, v0, Landroidx/fragment/app/c;->o:Z

    if-eqz v0, :cond_9

    :cond_8
    if-eqz v2, :cond_a

    :cond_9
    iget-object v0, p0, Landroidx/fragment/app/g;->b:Le4/g0;

    invoke-virtual {v0}, Le4/g0;->p()Le4/d0;

    move-result-object v0

    iget-object v2, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    invoke-virtual {v0, v2, v3}, Le4/d0;->f(Landroidx/fragment/app/c;Z)V

    :cond_a
    iget-object v0, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    invoke-virtual {v0}, Landroidx/fragment/app/c;->n1()V

    iget-object v0, p0, Landroidx/fragment/app/g;->a:Landroidx/fragment/app/f;

    iget-object v2, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    invoke-virtual {v0, v2, v3}, Landroidx/fragment/app/f;->d(Landroidx/fragment/app/c;Z)V

    iget-object v0, p0, Landroidx/fragment/app/g;->b:Le4/g0;

    invoke-virtual {v0}, Le4/g0;->k()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_b
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/g;

    if-eqz v2, :cond_b

    invoke-virtual {v2}, Landroidx/fragment/app/g;->k()Landroidx/fragment/app/c;

    move-result-object v2

    iget-object v3, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-object v3, v3, Landroidx/fragment/app/c;->f:Ljava/lang/String;

    iget-object v4, v2, Landroidx/fragment/app/c;->i:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_b

    iget-object v3, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iput-object v3, v2, Landroidx/fragment/app/c;->h:Landroidx/fragment/app/c;

    iput-object v1, v2, Landroidx/fragment/app/c;->i:Ljava/lang/String;

    goto :goto_3

    :cond_c
    iget-object v0, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-object v1, v0, Landroidx/fragment/app/c;->i:Ljava/lang/String;

    if-eqz v1, :cond_d

    iget-object v2, p0, Landroidx/fragment/app/g;->b:Le4/g0;

    invoke-virtual {v2, v1}, Le4/g0;->f(Ljava/lang/String;)Landroidx/fragment/app/c;

    move-result-object v1

    iput-object v1, v0, Landroidx/fragment/app/c;->h:Landroidx/fragment/app/c;

    :cond_d
    iget-object v0, p0, Landroidx/fragment/app/g;->b:Le4/g0;

    invoke-virtual {v0, p0}, Le4/g0;->s(Landroidx/fragment/app/g;)V

    return-void
.end method

.method public h()V
    .locals 3

    const/4 v0, 0x3

    invoke-static {v0}, Landroidx/fragment/app/FragmentManager;->N0(I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "movefrom CREATE_VIEW: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentManager"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-object v1, v0, Landroidx/fragment/app/c;->J:Landroid/view/ViewGroup;

    if-eqz v1, :cond_1

    iget-object v0, v0, Landroidx/fragment/app/c;->K:Landroid/view/View;

    if-eqz v0, :cond_1

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_1
    iget-object v0, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    invoke-virtual {v0}, Landroidx/fragment/app/c;->o1()V

    iget-object v0, p0, Landroidx/fragment/app/g;->a:Landroidx/fragment/app/f;

    iget-object v1, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/f;->n(Landroidx/fragment/app/c;Z)V

    iget-object v0, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    const/4 v1, 0x0

    iput-object v1, v0, Landroidx/fragment/app/c;->J:Landroid/view/ViewGroup;

    iput-object v1, v0, Landroidx/fragment/app/c;->K:Landroid/view/View;

    iput-object v1, v0, Landroidx/fragment/app/c;->W:Le4/k0;

    iget-object v0, v0, Landroidx/fragment/app/c;->X:Landroidx/lifecycle/d0;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/d0;->o(Ljava/lang/Object;)V

    iget-object v0, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iput-boolean v2, v0, Landroidx/fragment/app/c;->q:Z

    return-void
.end method

.method public i()V
    .locals 5

    const/4 v0, 0x3

    invoke-static {v0}, Landroidx/fragment/app/FragmentManager;->N0(I)Z

    move-result v1

    const-string v2, "FragmentManager"

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "movefrom ATTACHED: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v1, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    invoke-virtual {v1}, Landroidx/fragment/app/c;->p1()V

    iget-object v1, p0, Landroidx/fragment/app/g;->a:Landroidx/fragment/app/f;

    iget-object v3, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    const/4 v4, 0x0

    invoke-virtual {v1, v3, v4}, Landroidx/fragment/app/f;->e(Landroidx/fragment/app/c;Z)V

    iget-object v1, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    const/4 v3, -0x1

    iput v3, v1, Landroidx/fragment/app/c;->a:I

    const/4 v3, 0x0

    iput-object v3, v1, Landroidx/fragment/app/c;->w:Le4/t;

    iput-object v3, v1, Landroidx/fragment/app/c;->y:Landroidx/fragment/app/c;

    iput-object v3, v1, Landroidx/fragment/app/c;->v:Landroidx/fragment/app/FragmentManager;

    iget-boolean v3, v1, Landroidx/fragment/app/c;->m:Z

    if-eqz v3, :cond_1

    invoke-virtual {v1}, Landroidx/fragment/app/c;->s0()Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Landroidx/fragment/app/g;->b:Le4/g0;

    invoke-virtual {v1}, Le4/g0;->p()Le4/d0;

    move-result-object v1

    iget-object v3, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    invoke-virtual {v1, v3}, Le4/d0;->q(Landroidx/fragment/app/c;)Z

    move-result v1

    if-eqz v1, :cond_3

    :goto_0
    invoke-static {v0}, Landroidx/fragment/app/FragmentManager;->N0(I)Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "initState called for fragment: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    iget-object v0, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    invoke-virtual {v0}, Landroidx/fragment/app/c;->n0()V

    :cond_3
    return-void
.end method

.method public j()V
    .locals 5

    iget-object v0, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-boolean v1, v0, Landroidx/fragment/app/c;->p:Z

    if-eqz v1, :cond_3

    iget-boolean v1, v0, Landroidx/fragment/app/c;->q:Z

    if-eqz v1, :cond_3

    iget-boolean v0, v0, Landroidx/fragment/app/c;->t:Z

    if-nez v0, :cond_3

    const/4 v0, 0x3

    invoke-static {v0}, Landroidx/fragment/app/FragmentManager;->N0(I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "moveto CREATE_VIEW: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentManager"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-object v0, v0, Landroidx/fragment/app/c;->b:Landroid/os/Bundle;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    const-string v2, "savedInstanceState"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_0
    iget-object v2, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    invoke-virtual {v2, v0}, Landroidx/fragment/app/c;->q1(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    move-result-object v3

    invoke-virtual {v2, v3, v1, v0}, Landroidx/fragment/app/c;->m1(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V

    iget-object v1, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-object v1, v1, Landroidx/fragment/app/c;->K:Landroid/view/View;

    if-eqz v1, :cond_3

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/View;->setSaveFromParentEnabled(Z)V

    iget-object v1, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-object v3, v1, Landroidx/fragment/app/c;->K:Landroid/view/View;

    sget v4, Ld4/b;->a:I

    invoke-virtual {v3, v4, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    iget-object v1, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-boolean v3, v1, Landroidx/fragment/app/c;->C:Z

    if-eqz v3, :cond_2

    iget-object v1, v1, Landroidx/fragment/app/c;->K:Landroid/view/View;

    const/16 v3, 0x8

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    :cond_2
    iget-object v1, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    invoke-virtual {v1}, Landroidx/fragment/app/c;->D1()V

    iget-object v1, p0, Landroidx/fragment/app/g;->a:Landroidx/fragment/app/f;

    iget-object v3, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-object v4, v3, Landroidx/fragment/app/c;->K:Landroid/view/View;

    invoke-virtual {v1, v3, v4, v0, v2}, Landroidx/fragment/app/f;->m(Landroidx/fragment/app/c;Landroid/view/View;Landroid/os/Bundle;Z)V

    iget-object v0, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    const/4 v1, 0x2

    iput v1, v0, Landroidx/fragment/app/c;->a:I

    :cond_3
    return-void
.end method

.method public k()Landroidx/fragment/app/c;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    return-object v0
.end method

.method public final l(Landroid/view/View;)Z
    .locals 2
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-object v0, v0, Landroidx/fragment/app/c;->K:Landroid/view/View;

    const/4 v1, 0x1

    if-ne p1, v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_2

    iget-object v0, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-object v0, v0, Landroidx/fragment/app/c;->K:Landroid/view/View;

    if-ne p1, v0, :cond_1

    return v1

    :cond_1
    invoke-interface {p1}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public m()V
    .locals 9

    iget-boolean v0, p0, Landroidx/fragment/app/g;->d:Z

    const/4 v1, 0x2

    const-string v2, "FragmentManager"

    if-eqz v0, :cond_1

    invoke-static {v1}, Landroidx/fragment/app/FragmentManager;->N0(I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Ignoring re-entrant call to moveToExpectedState() for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroidx/fragment/app/g;->k()Landroidx/fragment/app/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void

    :cond_1
    const/4 v0, 0x0

    const/4 v3, 0x1

    :try_start_0
    iput-boolean v3, p0, Landroidx/fragment/app/g;->d:Z

    move v4, v0

    :goto_0
    invoke-virtual {p0}, Landroidx/fragment/app/g;->d()I

    move-result v5

    iget-object v6, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget v7, v6, Landroidx/fragment/app/c;->a:I

    const/4 v8, 0x3

    if-eq v5, v7, :cond_9

    if-le v5, v7, :cond_3

    add-int/lit8 v7, v7, 0x1

    packed-switch v7, :pswitch_data_0

    goto/16 :goto_2

    :pswitch_0
    invoke-virtual {p0}, Landroidx/fragment/app/g;->p()V

    goto/16 :goto_2

    :catchall_0
    move-exception v1

    goto/16 :goto_4

    :pswitch_1
    const/4 v4, 0x6

    iput v4, v6, Landroidx/fragment/app/c;->a:I

    goto/16 :goto_2

    :pswitch_2
    invoke-virtual {p0}, Landroidx/fragment/app/g;->t()V

    goto/16 :goto_2

    :pswitch_3
    iget-object v4, v6, Landroidx/fragment/app/c;->K:Landroid/view/View;

    if-eqz v4, :cond_2

    iget-object v4, v6, Landroidx/fragment/app/c;->J:Landroid/view/ViewGroup;

    if-eqz v4, :cond_2

    invoke-virtual {v6}, Landroidx/fragment/app/c;->M()Landroidx/fragment/app/FragmentManager;

    move-result-object v5

    invoke-static {v4, v5}, Landroidx/fragment/app/i;->u(Landroid/view/ViewGroup;Landroidx/fragment/app/FragmentManager;)Landroidx/fragment/app/i;

    move-result-object v4

    iget-object v5, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-object v5, v5, Landroidx/fragment/app/c;->K:Landroid/view/View;

    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    move-result v5

    invoke-static {v5}, Landroidx/fragment/app/i$d$b;->c(I)Landroidx/fragment/app/i$d$b;

    move-result-object v5

    invoke-virtual {v4, v5, p0}, Landroidx/fragment/app/i;->j(Landroidx/fragment/app/i$d$b;Landroidx/fragment/app/g;)V

    :cond_2
    iget-object v4, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    const/4 v5, 0x4

    iput v5, v4, Landroidx/fragment/app/c;->a:I

    goto/16 :goto_2

    :pswitch_4
    invoke-virtual {p0}, Landroidx/fragment/app/g;->a()V

    goto/16 :goto_2

    :pswitch_5
    invoke-virtual {p0}, Landroidx/fragment/app/g;->j()V

    invoke-virtual {p0}, Landroidx/fragment/app/g;->f()V

    goto/16 :goto_2

    :pswitch_6
    invoke-virtual {p0}, Landroidx/fragment/app/g;->e()V

    goto/16 :goto_2

    :pswitch_7
    invoke-virtual {p0}, Landroidx/fragment/app/g;->c()V

    goto/16 :goto_2

    :cond_3
    add-int/lit8 v7, v7, -0x1

    packed-switch v7, :pswitch_data_1

    goto/16 :goto_2

    :pswitch_8
    invoke-virtual {p0}, Landroidx/fragment/app/g;->n()V

    goto/16 :goto_2

    :pswitch_9
    const/4 v4, 0x5

    iput v4, v6, Landroidx/fragment/app/c;->a:I

    goto/16 :goto_2

    :pswitch_a
    invoke-virtual {p0}, Landroidx/fragment/app/g;->u()V

    goto/16 :goto_2

    :pswitch_b
    invoke-static {v8}, Landroidx/fragment/app/FragmentManager;->N0(I)Z

    move-result v4

    if-eqz v4, :cond_4

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "movefrom ACTIVITY_CREATED: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_4
    iget-object v4, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-boolean v5, v4, Landroidx/fragment/app/c;->o:Z

    if-eqz v5, :cond_5

    iget-object v5, p0, Landroidx/fragment/app/g;->b:Le4/g0;

    iget-object v4, v4, Landroidx/fragment/app/c;->f:Ljava/lang/String;

    invoke-virtual {p0}, Landroidx/fragment/app/g;->q()Landroid/os/Bundle;

    move-result-object v6

    invoke-virtual {v5, v4, v6}, Le4/g0;->B(Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    goto :goto_1

    :cond_5
    iget-object v5, v4, Landroidx/fragment/app/c;->K:Landroid/view/View;

    if-eqz v5, :cond_6

    iget-object v4, v4, Landroidx/fragment/app/c;->c:Landroid/util/SparseArray;

    if-nez v4, :cond_6

    invoke-virtual {p0}, Landroidx/fragment/app/g;->r()V

    :cond_6
    :goto_1
    iget-object v4, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-object v5, v4, Landroidx/fragment/app/c;->K:Landroid/view/View;

    if-eqz v5, :cond_7

    iget-object v5, v4, Landroidx/fragment/app/c;->J:Landroid/view/ViewGroup;

    if-eqz v5, :cond_7

    invoke-virtual {v4}, Landroidx/fragment/app/c;->M()Landroidx/fragment/app/FragmentManager;

    move-result-object v4

    invoke-static {v5, v4}, Landroidx/fragment/app/i;->u(Landroid/view/ViewGroup;Landroidx/fragment/app/FragmentManager;)Landroidx/fragment/app/i;

    move-result-object v4

    invoke-virtual {v4, p0}, Landroidx/fragment/app/i;->l(Landroidx/fragment/app/g;)V

    :cond_7
    iget-object v4, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iput v8, v4, Landroidx/fragment/app/c;->a:I

    goto :goto_2

    :pswitch_c
    iput-boolean v0, v6, Landroidx/fragment/app/c;->q:Z

    iput v1, v6, Landroidx/fragment/app/c;->a:I

    goto :goto_2

    :pswitch_d
    invoke-virtual {p0}, Landroidx/fragment/app/g;->h()V

    iget-object v4, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iput v3, v4, Landroidx/fragment/app/c;->a:I

    goto :goto_2

    :pswitch_e
    iget-boolean v4, v6, Landroidx/fragment/app/c;->o:Z

    if-eqz v4, :cond_8

    iget-object v4, p0, Landroidx/fragment/app/g;->b:Le4/g0;

    iget-object v5, v6, Landroidx/fragment/app/c;->f:Ljava/lang/String;

    invoke-virtual {v4, v5}, Le4/g0;->q(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v4

    if-nez v4, :cond_8

    iget-object v4, p0, Landroidx/fragment/app/g;->b:Le4/g0;

    iget-object v5, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-object v5, v5, Landroidx/fragment/app/c;->f:Ljava/lang/String;

    invoke-virtual {p0}, Landroidx/fragment/app/g;->q()Landroid/os/Bundle;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Le4/g0;->B(Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    :cond_8
    invoke-virtual {p0}, Landroidx/fragment/app/g;->g()V

    goto :goto_2

    :pswitch_f
    invoke-virtual {p0}, Landroidx/fragment/app/g;->i()V

    :goto_2
    move v4, v3

    goto/16 :goto_0

    :cond_9
    if-nez v4, :cond_c

    const/4 v1, -0x1

    if-ne v7, v1, :cond_c

    iget-boolean v1, v6, Landroidx/fragment/app/c;->m:Z

    if-eqz v1, :cond_c

    invoke-virtual {v6}, Landroidx/fragment/app/c;->s0()Z

    move-result v1

    if-nez v1, :cond_c

    iget-object v1, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-boolean v1, v1, Landroidx/fragment/app/c;->o:Z

    if-nez v1, :cond_c

    invoke-static {v8}, Landroidx/fragment/app/FragmentManager;->N0(I)Z

    move-result v1

    if-eqz v1, :cond_a

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Cleaning up state of never attached fragment: "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_a
    iget-object v1, p0, Landroidx/fragment/app/g;->b:Le4/g0;

    invoke-virtual {v1}, Le4/g0;->p()Le4/d0;

    move-result-object v1

    iget-object v4, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    invoke-virtual {v1, v4, v3}, Le4/d0;->f(Landroidx/fragment/app/c;Z)V

    iget-object v1, p0, Landroidx/fragment/app/g;->b:Le4/g0;

    invoke-virtual {v1, p0}, Le4/g0;->s(Landroidx/fragment/app/g;)V

    invoke-static {v8}, Landroidx/fragment/app/FragmentManager;->N0(I)Z

    move-result v1

    if-eqz v1, :cond_b

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initState called for fragment: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_b
    iget-object v1, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    invoke-virtual {v1}, Landroidx/fragment/app/c;->n0()V

    :cond_c
    iget-object v1, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-boolean v2, v1, Landroidx/fragment/app/c;->Q:Z

    if-eqz v2, :cond_10

    iget-object v2, v1, Landroidx/fragment/app/c;->K:Landroid/view/View;

    if-eqz v2, :cond_e

    iget-object v2, v1, Landroidx/fragment/app/c;->J:Landroid/view/ViewGroup;

    if-eqz v2, :cond_e

    invoke-virtual {v1}, Landroidx/fragment/app/c;->M()Landroidx/fragment/app/FragmentManager;

    move-result-object v1

    invoke-static {v2, v1}, Landroidx/fragment/app/i;->u(Landroid/view/ViewGroup;Landroidx/fragment/app/FragmentManager;)Landroidx/fragment/app/i;

    move-result-object v1

    iget-object v2, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-boolean v2, v2, Landroidx/fragment/app/c;->C:Z

    if-eqz v2, :cond_d

    invoke-virtual {v1, p0}, Landroidx/fragment/app/i;->k(Landroidx/fragment/app/g;)V

    goto :goto_3

    :cond_d
    invoke-virtual {v1, p0}, Landroidx/fragment/app/i;->m(Landroidx/fragment/app/g;)V

    :cond_e
    :goto_3
    iget-object v1, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-object v2, v1, Landroidx/fragment/app/c;->v:Landroidx/fragment/app/FragmentManager;

    if-eqz v2, :cond_f

    invoke-virtual {v2, v1}, Landroidx/fragment/app/FragmentManager;->L0(Landroidx/fragment/app/c;)V

    :cond_f
    iget-object v1, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iput-boolean v0, v1, Landroidx/fragment/app/c;->Q:Z

    iget-boolean v2, v1, Landroidx/fragment/app/c;->C:Z

    invoke-virtual {v1, v2}, Landroidx/fragment/app/c;->P0(Z)V

    iget-object v1, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-object v1, v1, Landroidx/fragment/app/c;->x:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v1}, Landroidx/fragment/app/FragmentManager;->N()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_10
    iput-boolean v0, p0, Landroidx/fragment/app/g;->d:Z

    return-void

    :goto_4
    iput-boolean v0, p0, Landroidx/fragment/app/g;->d:Z

    throw v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch -0x1
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
    .end packed-switch
.end method

.method public n()V
    .locals 3

    const/4 v0, 0x3

    invoke-static {v0}, Landroidx/fragment/app/FragmentManager;->N0(I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "movefrom RESUMED: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentManager"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    invoke-virtual {v0}, Landroidx/fragment/app/c;->v1()V

    iget-object v0, p0, Landroidx/fragment/app/g;->a:Landroidx/fragment/app/f;

    iget-object v1, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/f;->f(Landroidx/fragment/app/c;Z)V

    return-void
.end method

.method public o(Ljava/lang/ClassLoader;)V
    .locals 3
    .param p1    # Ljava/lang/ClassLoader;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-object v0, v0, Landroidx/fragment/app/c;->b:Landroid/os/Bundle;

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v0, p1}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    iget-object p1, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-object p1, p1, Landroidx/fragment/app/c;->b:Landroid/os/Bundle;

    const-string v0, "savedInstanceState"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    if-nez p1, :cond_1

    iget-object p1, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-object p1, p1, Landroidx/fragment/app/c;->b:Landroid/os/Bundle;

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_1
    :try_start_0
    iget-object p1, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-object v0, p1, Landroidx/fragment/app/c;->b:Landroid/os/Bundle;

    const-string v1, "viewState"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSparseParcelableArray(Ljava/lang/String;)Landroid/util/SparseArray;

    move-result-object v0

    iput-object v0, p1, Landroidx/fragment/app/c;->c:Landroid/util/SparseArray;
    :try_end_0
    .catch Landroid/os/BadParcelableException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object p1, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-object v0, p1, Landroidx/fragment/app/c;->b:Landroid/os/Bundle;

    const-string v1, "viewRegistryState"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    iput-object v0, p1, Landroidx/fragment/app/c;->d:Landroid/os/Bundle;

    iget-object p1, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-object p1, p1, Landroidx/fragment/app/c;->b:Landroid/os/Bundle;

    const-string v0, "state"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroidx/fragment/app/FragmentState;

    if-eqz p1, :cond_3

    iget-object v0, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-object v1, p1, Landroidx/fragment/app/FragmentState;->m:Ljava/lang/String;

    iput-object v1, v0, Landroidx/fragment/app/c;->i:Ljava/lang/String;

    iget v1, p1, Landroidx/fragment/app/FragmentState;->n:I

    iput v1, v0, Landroidx/fragment/app/c;->j:I

    iget-object v1, v0, Landroidx/fragment/app/c;->e:Ljava/lang/Boolean;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, v0, Landroidx/fragment/app/c;->M:Z

    iget-object p1, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    const/4 v0, 0x0

    iput-object v0, p1, Landroidx/fragment/app/c;->e:Ljava/lang/Boolean;

    goto :goto_0

    :cond_2
    iget-boolean p1, p1, Landroidx/fragment/app/FragmentState;->o:Z

    iput-boolean p1, v0, Landroidx/fragment/app/c;->M:Z

    :cond_3
    :goto_0
    iget-object p1, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-boolean v0, p1, Landroidx/fragment/app/c;->M:Z

    if-nez v0, :cond_4

    const/4 v0, 0x1

    iput-boolean v0, p1, Landroidx/fragment/app/c;->L:Z

    :cond_4
    :goto_1
    return-void

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed to restore view hierarchy state for fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroidx/fragment/app/g;->k()Landroidx/fragment/app/c;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public p()V
    .locals 5

    const/4 v0, 0x3

    invoke-static {v0}, Landroidx/fragment/app/FragmentManager;->N0(I)Z

    move-result v0

    const-string v1, "FragmentManager"

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "moveto RESUMED: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    invoke-virtual {v0}, Landroidx/fragment/app/c;->F()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p0, v0}, Landroidx/fragment/app/g;->l(Landroid/view/View;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    move-result v2

    const/4 v3, 0x2

    invoke-static {v3}, Landroidx/fragment/app/FragmentManager;->N0(I)Z

    move-result v3

    if-eqz v3, :cond_2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "requestFocus: Restoring focused view "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v2, :cond_1

    const-string v0, "succeeded"

    goto :goto_0

    :cond_1
    const-string v0, "failed"

    :goto_0
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " on Fragment "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " resulting in focused view "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-object v0, v0, Landroidx/fragment/app/c;->K:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    iget-object v0, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/fragment/app/c;->R1(Landroid/view/View;)V

    iget-object v0, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    invoke-virtual {v0}, Landroidx/fragment/app/c;->z1()V

    iget-object v0, p0, Landroidx/fragment/app/g;->a:Landroidx/fragment/app/f;

    iget-object v2, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroidx/fragment/app/f;->i(Landroidx/fragment/app/c;Z)V

    iget-object v0, p0, Landroidx/fragment/app/g;->b:Le4/g0;

    iget-object v2, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-object v2, v2, Landroidx/fragment/app/c;->f:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Le4/g0;->B(Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    iget-object v0, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iput-object v1, v0, Landroidx/fragment/app/c;->b:Landroid/os/Bundle;

    iput-object v1, v0, Landroidx/fragment/app/c;->c:Landroid/util/SparseArray;

    iput-object v1, v0, Landroidx/fragment/app/c;->d:Landroid/os/Bundle;

    return-void
.end method

.method public q()Landroid/os/Bundle;
    .locals 5
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget-object v1, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget v2, v1, Landroidx/fragment/app/c;->a:I

    const/4 v3, -0x1

    if-ne v2, v3, :cond_0

    iget-object v1, v1, Landroidx/fragment/app/c;->b:Landroid/os/Bundle;

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    :cond_0
    new-instance v1, Landroidx/fragment/app/FragmentState;

    iget-object v2, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    invoke-direct {v1, v2}, Landroidx/fragment/app/FragmentState;-><init>(Landroidx/fragment/app/c;)V

    const-string v2, "state"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    iget-object v1, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget v1, v1, Landroidx/fragment/app/c;->a:I

    if-lez v1, :cond_6

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    iget-object v2, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    invoke-virtual {v2, v1}, Landroidx/fragment/app/c;->A1(Landroid/os/Bundle;)V

    invoke-virtual {v1}, Landroid/os/BaseBundle;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, "savedInstanceState"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_1
    iget-object v2, p0, Landroidx/fragment/app/g;->a:Landroidx/fragment/app/f;

    iget-object v3, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v1, v4}, Landroidx/fragment/app/f;->j(Landroidx/fragment/app/c;Landroid/os/Bundle;Z)V

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    iget-object v2, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-object v2, v2, Landroidx/fragment/app/c;->Z:Ld5/h;

    invoke-virtual {v2, v1}, Ld5/h;->e(Landroid/os/Bundle;)V

    invoke-virtual {v1}, Landroid/os/BaseBundle;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_2

    const-string v2, "registryState"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_2
    iget-object v1, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-object v1, v1, Landroidx/fragment/app/c;->x:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v1}, Landroidx/fragment/app/FragmentManager;->p1()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/BaseBundle;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_3

    const-string v2, "childFragmentManager"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_3
    iget-object v1, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-object v1, v1, Landroidx/fragment/app/c;->K:Landroid/view/View;

    if-eqz v1, :cond_4

    invoke-virtual {p0}, Landroidx/fragment/app/g;->r()V

    :cond_4
    iget-object v1, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-object v1, v1, Landroidx/fragment/app/c;->c:Landroid/util/SparseArray;

    if-eqz v1, :cond_5

    const-string v2, "viewState"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putSparseParcelableArray(Ljava/lang/String;Landroid/util/SparseArray;)V

    :cond_5
    iget-object v1, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-object v1, v1, Landroidx/fragment/app/c;->d:Landroid/os/Bundle;

    if-eqz v1, :cond_6

    const-string v2, "viewRegistryState"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_6
    iget-object v1, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-object v1, v1, Landroidx/fragment/app/c;->g:Landroid/os/Bundle;

    if-eqz v1, :cond_7

    const-string v2, "arguments"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_7
    return-object v0
.end method

.method public r()V
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-object v0, v0, Landroidx/fragment/app/c;->K:Landroid/view/View;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    invoke-static {v0}, Landroidx/fragment/app/FragmentManager;->N0(I)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Saving view state for fragment "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " with view "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-object v1, v1, Landroidx/fragment/app/c;->K:Landroid/view/View;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentManager"

    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iget-object v1, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-object v1, v1, Landroidx/fragment/app/c;->K:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->saveHierarchyState(Landroid/util/SparseArray;)V

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v1

    if-lez v1, :cond_2

    iget-object v1, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iput-object v0, v1, Landroidx/fragment/app/c;->c:Landroid/util/SparseArray;

    :cond_2
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget-object v1, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iget-object v1, v1, Landroidx/fragment/app/c;->W:Le4/k0;

    invoke-virtual {v1, v0}, Le4/k0;->f(Landroid/os/Bundle;)V

    invoke-virtual {v0}, Landroid/os/BaseBundle;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    iput-object v0, v1, Landroidx/fragment/app/c;->d:Landroid/os/Bundle;

    :cond_3
    :goto_0
    return-void
.end method

.method public s(I)V
    .locals 0

    iput p1, p0, Landroidx/fragment/app/g;->e:I

    return-void
.end method

.method public t()V
    .locals 3

    const/4 v0, 0x3

    invoke-static {v0}, Landroidx/fragment/app/FragmentManager;->N0(I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "moveto STARTED: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentManager"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    invoke-virtual {v0}, Landroidx/fragment/app/c;->B1()V

    iget-object v0, p0, Landroidx/fragment/app/g;->a:Landroidx/fragment/app/f;

    iget-object v1, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/f;->k(Landroidx/fragment/app/c;Z)V

    return-void
.end method

.method public u()V
    .locals 3

    const/4 v0, 0x3

    invoke-static {v0}, Landroidx/fragment/app/FragmentManager;->N0(I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "movefrom STARTED: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentManager"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    invoke-virtual {v0}, Landroidx/fragment/app/c;->C1()V

    iget-object v0, p0, Landroidx/fragment/app/g;->a:Landroidx/fragment/app/f;

    iget-object v1, p0, Landroidx/fragment/app/g;->c:Landroidx/fragment/app/c;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/f;->l(Landroidx/fragment/app/c;Z)V

    return-void
.end method
