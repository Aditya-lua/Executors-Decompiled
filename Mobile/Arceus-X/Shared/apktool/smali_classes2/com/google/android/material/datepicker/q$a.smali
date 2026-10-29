.class public Lcom/google/android/material/datepicker/q$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/datepicker/q;->D(I)Landroid/view/View$OnClickListener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/google/android/material/datepicker/q;


# direct methods
.method public constructor <init>(Lcom/google/android/material/datepicker/q;I)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/datepicker/q$a;->b:Lcom/google/android/material/datepicker/q;

    iput p2, p0, Lcom/google/android/material/datepicker/q$a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    iget p1, p0, Lcom/google/android/material/datepicker/q$a;->a:I

    iget-object v0, p0, Lcom/google/android/material/datepicker/q$a;->b:Lcom/google/android/material/datepicker/q;

    invoke-static {v0}, Lcom/google/android/material/datepicker/q;->C(Lcom/google/android/material/datepicker/q;)Lcom/google/android/material/datepicker/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/material/datepicker/e;->o2()Lcom/google/android/material/datepicker/Month;

    move-result-object v0

    iget v0, v0, Lcom/google/android/material/datepicker/Month;->b:I

    invoke-static {p1, v0}, Lcom/google/android/material/datepicker/Month;->j(II)Lcom/google/android/material/datepicker/Month;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/material/datepicker/q$a;->b:Lcom/google/android/material/datepicker/q;

    invoke-static {v0}, Lcom/google/android/material/datepicker/q;->C(Lcom/google/android/material/datepicker/q;)Lcom/google/android/material/datepicker/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/material/datepicker/e;->m2()Lcom/google/android/material/datepicker/CalendarConstraints;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/material/datepicker/CalendarConstraints;->k(Lcom/google/android/material/datepicker/Month;)Lcom/google/android/material/datepicker/Month;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/material/datepicker/q$a;->b:Lcom/google/android/material/datepicker/q;

    invoke-static {v0}, Lcom/google/android/material/datepicker/q;->C(Lcom/google/android/material/datepicker/q;)Lcom/google/android/material/datepicker/e;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/material/datepicker/e;->v2(Lcom/google/android/material/datepicker/Month;)V

    iget-object p1, p0, Lcom/google/android/material/datepicker/q$a;->b:Lcom/google/android/material/datepicker/q;

    invoke-static {p1}, Lcom/google/android/material/datepicker/q;->C(Lcom/google/android/material/datepicker/q;)Lcom/google/android/material/datepicker/e;

    move-result-object p1

    sget-object v0, Lcom/google/android/material/datepicker/e$l;->a:Lcom/google/android/material/datepicker/e$l;

    invoke-virtual {p1, v0}, Lcom/google/android/material/datepicker/e;->w2(Lcom/google/android/material/datepicker/e$l;)V

    return-void
.end method
