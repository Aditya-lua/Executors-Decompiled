.class public Lcom/google/android/material/datepicker/e$h;
.super Landroidx/core/view/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/datepicker/e;->k2(Landroid/view/View;Lcom/google/android/material/datepicker/k;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic d:Lcom/google/android/material/datepicker/e;


# direct methods
.method public constructor <init>(Lcom/google/android/material/datepicker/e;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/datepicker/e$h;->d:Lcom/google/android/material/datepicker/e;

    invoke-direct {p0}, Landroidx/core/view/a;-><init>()V

    return-void
.end method


# virtual methods
.method public g(Landroid/view/View;Ly2/p;)V
    .locals 1
    .param p2    # Ly2/p;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-super {p0, p1, p2}, Landroidx/core/view/a;->g(Landroid/view/View;Ly2/p;)V

    iget-object p1, p0, Lcom/google/android/material/datepicker/e$h;->d:Lcom/google/android/material/datepicker/e;

    invoke-static {p1}, Lcom/google/android/material/datepicker/e;->i2(Lcom/google/android/material/datepicker/e;)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/google/android/material/datepicker/e$h;->d:Lcom/google/android/material/datepicker/e;

    sget v0, Lic/i;->u:I

    invoke-virtual {p1, v0}, Landroidx/fragment/app/c;->e0(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/material/datepicker/e$h;->d:Lcom/google/android/material/datepicker/e;

    sget v0, Lic/i;->s:I

    invoke-virtual {p1, v0}, Landroidx/fragment/app/c;->e0(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-virtual {p2, p1}, Ly2/p;->x0(Ljava/lang/CharSequence;)V

    return-void
.end method
