.class public Lcom/google/android/material/textfield/TextInputLayout$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/textfield/TextInputLayout;->setEditText(Landroid/widget/EditText;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Landroid/widget/EditText;

.field public final synthetic c:Lcom/google/android/material/textfield/TextInputLayout;


# direct methods
.method public constructor <init>(Lcom/google/android/material/textfield/TextInputLayout;Landroid/widget/EditText;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout$a;->c:Lcom/google/android/material/textfield/TextInputLayout;

    iput-object p2, p0, Lcom/google/android/material/textfield/TextInputLayout$a;->b:Landroid/widget/EditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p2}, Landroid/widget/TextView;->getLineCount()I

    move-result p1

    iput p1, p0, Lcom/google/android/material/textfield/TextInputLayout$a;->a:I

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 2
    .param p1    # Landroid/text/Editable;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout$a;->c:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-static {v0}, Lcom/google/android/material/textfield/TextInputLayout;->c(Lcom/google/android/material/textfield/TextInputLayout;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->u0(Z)V

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout$a;->c:Lcom/google/android/material/textfield/TextInputLayout;

    iget-boolean v1, v0, Lcom/google/android/material/textfield/TextInputLayout;->k:Z

    if-eqz v1, :cond_0

    invoke-virtual {v0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->k0(Landroid/text/Editable;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout$a;->c:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-static {v0}, Lcom/google/android/material/textfield/TextInputLayout;->d(Lcom/google/android/material/textfield/TextInputLayout;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout$a;->c:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-static {v0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->e(Lcom/google/android/material/textfield/TextInputLayout;Landroid/text/Editable;)V

    :cond_1
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout$a;->b:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/TextView;->getLineCount()I

    move-result p1

    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout$a;->a:I

    if-eq p1, v0, :cond_3

    if-ge p1, v0, :cond_2

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout$a;->b:Landroid/widget/EditText;

    invoke-static {v0}, Landroidx/core/view/o0;->A(Landroid/view/View;)I

    move-result v0

    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout$a;->c:Lcom/google/android/material/textfield/TextInputLayout;

    iget v1, v1, Lcom/google/android/material/textfield/TextInputLayout;->t0:I

    if-eq v0, v1, :cond_2

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout$a;->b:Landroid/widget/EditText;

    invoke-virtual {v0, v1}, Landroid/view/View;->setMinimumHeight(I)V

    :cond_2
    iput p1, p0, Lcom/google/android/material/textfield/TextInputLayout$a;->a:I

    :cond_3
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method
