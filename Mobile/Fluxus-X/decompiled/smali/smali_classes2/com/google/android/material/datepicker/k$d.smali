.class public Lcom/google/android/material/datepicker/k$d;
.super Lcom/google/android/material/datepicker/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/datepicker/k;->N2()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/material/datepicker/q<",
        "TS;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/google/android/material/datepicker/k;


# direct methods
.method public constructor <init>(Lcom/google/android/material/datepicker/k;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/datepicker/k$d;->a:Lcom/google/android/material/datepicker/k;

    invoke-direct {p0}, Lcom/google/android/material/datepicker/q;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TS;)V"
        }
    .end annotation

    iget-object p1, p0, Lcom/google/android/material/datepicker/k$d;->a:Lcom/google/android/material/datepicker/k;

    invoke-virtual {p1}, Lcom/google/android/material/datepicker/k;->E2()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/material/datepicker/k;->O2(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/material/datepicker/k$d;->a:Lcom/google/android/material/datepicker/k;

    invoke-static {p1}, Lcom/google/android/material/datepicker/k;->y2(Lcom/google/android/material/datepicker/k;)Landroid/widget/Button;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/material/datepicker/k$d;->a:Lcom/google/android/material/datepicker/k;

    invoke-static {v0}, Lcom/google/android/material/datepicker/k;->x2(Lcom/google/android/material/datepicker/k;)Lcom/google/android/material/datepicker/d;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/material/datepicker/d;->O2()Z

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    return-void
.end method
