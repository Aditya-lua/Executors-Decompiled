.class public Lcom/google/android/material/datepicker/v$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/datepicker/v;->D(I)Landroid/view/View$OnClickListener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/google/android/material/datepicker/v;


# direct methods
.method public constructor <init>(Lcom/google/android/material/datepicker/v;I)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/datepicker/v$a;->b:Lcom/google/android/material/datepicker/v;

    iput p2, p0, Lcom/google/android/material/datepicker/v$a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    iget p1, p0, Lcom/google/android/material/datepicker/v$a;->a:I

    iget-object v0, p0, Lcom/google/android/material/datepicker/v$a;->b:Lcom/google/android/material/datepicker/v;

    invoke-static {v0}, Lcom/google/android/material/datepicker/v;->C(Lcom/google/android/material/datepicker/v;)Lcom/google/android/material/datepicker/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/material/datepicker/i;->o2()Lcom/google/android/material/datepicker/n;

    move-result-object v0

    iget v0, v0, Lcom/google/android/material/datepicker/n;->b:I

    invoke-static {p1, v0}, Lcom/google/android/material/datepicker/n;->k(II)Lcom/google/android/material/datepicker/n;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/material/datepicker/v$a;->b:Lcom/google/android/material/datepicker/v;

    invoke-static {v0}, Lcom/google/android/material/datepicker/v;->C(Lcom/google/android/material/datepicker/v;)Lcom/google/android/material/datepicker/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/material/datepicker/i;->m2()Lcom/google/android/material/datepicker/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/material/datepicker/a;->k(Lcom/google/android/material/datepicker/n;)Lcom/google/android/material/datepicker/n;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/material/datepicker/v$a;->b:Lcom/google/android/material/datepicker/v;

    invoke-static {v0}, Lcom/google/android/material/datepicker/v;->C(Lcom/google/android/material/datepicker/v;)Lcom/google/android/material/datepicker/i;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/material/datepicker/i;->v2(Lcom/google/android/material/datepicker/n;)V

    iget-object p1, p0, Lcom/google/android/material/datepicker/v$a;->b:Lcom/google/android/material/datepicker/v;

    invoke-static {p1}, Lcom/google/android/material/datepicker/v;->C(Lcom/google/android/material/datepicker/v;)Lcom/google/android/material/datepicker/i;

    move-result-object p1

    sget-object v0, Lcom/google/android/material/datepicker/i$l;->a:Lcom/google/android/material/datepicker/i$l;

    invoke-virtual {p1, v0}, Lcom/google/android/material/datepicker/i;->w2(Lcom/google/android/material/datepicker/i$l;)V

    return-void
.end method
