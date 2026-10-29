.class public Lcom/google/android/material/bottomsheet/b;
.super Lj/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/material/bottomsheet/b$b;
    }
.end annotation


# instance fields
.field public v0:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lj/m;-><init>()V

    return-void
.end method

.method public static synthetic u2(Lcom/google/android/material/bottomsheet/b;)V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/b;->v2()V

    return-void
.end method


# virtual methods
.method public e2()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/android/material/bottomsheet/b;->x2(Z)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-super {p0}, Le4/k;->e2()V

    :cond_0
    return-void
.end method

.method public k2(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance p1, Lcom/google/android/material/bottomsheet/a;

    invoke-virtual {p0}, Landroidx/fragment/app/c;->x()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0}, Le4/k;->j2()I

    move-result v1

    invoke-direct {p1, v0, v1}, Lcom/google/android/material/bottomsheet/a;-><init>(Landroid/content/Context;I)V

    return-object p1
.end method

.method public final v2()V
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/material/bottomsheet/b;->v0:Z

    if-eqz v0, :cond_0

    invoke-super {p0}, Le4/k;->f2()V

    return-void

    :cond_0
    invoke-super {p0}, Le4/k;->e2()V

    return-void
.end method

.method public final w2(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Z)V
    .locals 2
    .param p1    # Lcom/google/android/material/bottomsheet/BottomSheetBehavior;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/material/bottomsheet/BottomSheetBehavior<",
            "*>;Z)V"
        }
    .end annotation

    iput-boolean p2, p0, Lcom/google/android/material/bottomsheet/b;->v0:Z

    invoke-virtual {p1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->v0()I

    move-result p2

    const/4 v0, 0x5

    if-ne p2, v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/b;->v2()V

    return-void

    :cond_0
    invoke-virtual {p0}, Le4/k;->h2()Landroid/app/Dialog;

    move-result-object p2

    instance-of p2, p2, Lcom/google/android/material/bottomsheet/a;

    if-eqz p2, :cond_1

    invoke-virtual {p0}, Le4/k;->h2()Landroid/app/Dialog;

    move-result-object p2

    check-cast p2, Lcom/google/android/material/bottomsheet/a;

    invoke-virtual {p2}, Lcom/google/android/material/bottomsheet/a;->y()V

    :cond_1
    new-instance p2, Lcom/google/android/material/bottomsheet/b$b;

    const/4 v1, 0x0

    invoke-direct {p2, p0, v1}, Lcom/google/android/material/bottomsheet/b$b;-><init>(Lcom/google/android/material/bottomsheet/b;Lcom/google/android/material/bottomsheet/b$a;)V

    invoke-virtual {p1, p2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->c0(Lcom/google/android/material/bottomsheet/BottomSheetBehavior$g;)V

    invoke-virtual {p1, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->X0(I)V

    return-void
.end method

.method public final x2(Z)Z
    .locals 3

    invoke-virtual {p0}, Le4/k;->h2()Landroid/app/Dialog;

    move-result-object v0

    instance-of v1, v0, Lcom/google/android/material/bottomsheet/a;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/google/android/material/bottomsheet/a;

    invoke-virtual {v0}, Lcom/google/android/material/bottomsheet/a;->v()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->B0()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0}, Lcom/google/android/material/bottomsheet/a;->w()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v1, p1}, Lcom/google/android/material/bottomsheet/b;->w2(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Z)V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
