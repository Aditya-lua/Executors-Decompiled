.class public Lj/m;
.super Le4/k;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Le4/k;-><init>()V

    return-void
.end method


# virtual methods
.method public k2(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance p1, Lj/l;

    invoke-virtual {p0}, Landroidx/fragment/app/c;->x()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0}, Le4/k;->j2()I

    move-result v1

    invoke-direct {p1, v0, v1}, Lj/l;-><init>(Landroid/content/Context;I)V

    return-object p1
.end method

.method public s2(Landroid/app/Dialog;I)V
    .locals 3
    .param p1    # Landroid/app/Dialog;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    instance-of v0, p1, Lj/l;

    if-eqz v0, :cond_2

    move-object v0, p1

    check-cast v0, Lj/l;

    const/4 v1, 0x1

    if-eq p2, v1, :cond_1

    const/4 v2, 0x2

    if-eq p2, v2, :cond_1

    const/4 v2, 0x3

    if-eq p2, v2, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p1

    const/16 p2, 0x18

    invoke-virtual {p1, p2}, Landroid/view/Window;->addFlags(I)V

    :cond_1
    invoke-virtual {v0, v1}, Lj/l;->o(I)Z

    return-void

    :cond_2
    invoke-super {p0, p1, p2}, Le4/k;->s2(Landroid/app/Dialog;I)V

    return-void
.end method
