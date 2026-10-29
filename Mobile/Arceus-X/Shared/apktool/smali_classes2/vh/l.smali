.class public Lvh/l;
.super Lvh/e;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lvh/e;-><init>()V

    return-void
.end method


# virtual methods
.method public J0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    invoke-super {p0, p1, p2, p3}, Lvh/e;->J0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lsg/x0;->x2(Landroid/view/LayoutInflater;Landroid/view/View;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public w2()Lmi/c;
    .locals 1

    new-instance v0, Lmi/e;

    invoke-direct {v0}, Lmi/e;-><init>()V

    return-object v0
.end method
