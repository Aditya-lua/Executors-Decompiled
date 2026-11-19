.class public Lcom/google/android/material/sidesheet/SideSheetBehavior$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/material/sidesheet/SideSheetBehavior;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation


# instance fields
.field public a:I

.field public b:Z

.field public final c:Ljava/lang/Runnable;

.field public final synthetic d:Lcom/google/android/material/sidesheet/SideSheetBehavior;


# direct methods
.method public constructor <init>(Lcom/google/android/material/sidesheet/SideSheetBehavior;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior$d;->d:Lcom/google/android/material/sidesheet/SideSheetBehavior;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljd/i;

    invoke-direct {p1, p0}, Ljd/i;-><init>(Lcom/google/android/material/sidesheet/SideSheetBehavior$d;)V

    iput-object p1, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior$d;->c:Ljava/lang/Runnable;

    return-void
.end method

.method public static synthetic a(Lcom/google/android/material/sidesheet/SideSheetBehavior$d;)V
    .locals 2

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior$d;->b:Z

    iget-object v0, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior$d;->d:Lcom/google/android/material/sidesheet/SideSheetBehavior;

    invoke-static {v0}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->T(Lcom/google/android/material/sidesheet/SideSheetBehavior;)Ls3/c;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior$d;->d:Lcom/google/android/material/sidesheet/SideSheetBehavior;

    invoke-static {v0}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->T(Lcom/google/android/material/sidesheet/SideSheetBehavior;)Ls3/c;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ls3/c;->k(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior$d;->a:I

    invoke-virtual {p0, v0}, Lcom/google/android/material/sidesheet/SideSheetBehavior$d;->b(I)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior$d;->d:Lcom/google/android/material/sidesheet/SideSheetBehavior;

    invoke-static {v0}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->L(Lcom/google/android/material/sidesheet/SideSheetBehavior;)I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior$d;->d:Lcom/google/android/material/sidesheet/SideSheetBehavior;

    iget p0, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior$d;->a:I

    invoke-virtual {v0, p0}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->G0(I)V

    :cond_1
    return-void
.end method


# virtual methods
.method public b(I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior$d;->d:Lcom/google/android/material/sidesheet/SideSheetBehavior;

    invoke-static {v0}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->M(Lcom/google/android/material/sidesheet/SideSheetBehavior;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior$d;->d:Lcom/google/android/material/sidesheet/SideSheetBehavior;

    invoke-static {v0}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->M(Lcom/google/android/material/sidesheet/SideSheetBehavior;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iput p1, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior$d;->a:I

    iget-boolean p1, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior$d;->b:Z

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior$d;->d:Lcom/google/android/material/sidesheet/SideSheetBehavior;

    invoke-static {p1}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->M(Lcom/google/android/material/sidesheet/SideSheetBehavior;)Ljava/lang/ref/WeakReference;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    iget-object v0, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior$d;->c:Ljava/lang/Runnable;

    invoke-static {p1, v0}, Landroidx/core/view/o0;->e0(Landroid/view/View;Ljava/lang/Runnable;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior$d;->b:Z

    :cond_1
    :goto_0
    return-void
.end method
