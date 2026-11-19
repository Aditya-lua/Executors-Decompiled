.class public final Lcom/google/androidgamesdk/gametextinput/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/androidgamesdk/gametextinput/a$a;
    }
.end annotation


# direct methods
.method public static final a(Landroid/view/inputmethod/EditorInfo;Landroid/view/inputmethod/EditorInfo;)V
    .locals 1

    if-eqz p0, :cond_4

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroid/view/inputmethod/EditorInfo;->hintText:Ljava/lang/CharSequence;

    if-eqz v0, :cond_1

    iput-object v0, p1, Landroid/view/inputmethod/EditorInfo;->hintText:Ljava/lang/CharSequence;

    :cond_1
    iget v0, p0, Landroid/view/inputmethod/EditorInfo;->inputType:I

    iput v0, p1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    iget v0, p0, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    iput v0, p1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    iget-object v0, p0, Landroid/view/inputmethod/EditorInfo;->label:Ljava/lang/CharSequence;

    iput-object v0, p1, Landroid/view/inputmethod/EditorInfo;->label:Ljava/lang/CharSequence;

    iget v0, p0, Landroid/view/inputmethod/EditorInfo;->initialCapsMode:I

    iput v0, p1, Landroid/view/inputmethod/EditorInfo;->initialCapsMode:I

    iget-object v0, p0, Landroid/view/inputmethod/EditorInfo;->privateImeOptions:Ljava/lang/String;

    iput-object v0, p1, Landroid/view/inputmethod/EditorInfo;->privateImeOptions:Ljava/lang/String;

    iget-object v0, p0, Landroid/view/inputmethod/EditorInfo;->packageName:Ljava/lang/String;

    if-eqz v0, :cond_2

    iput-object v0, p1, Landroid/view/inputmethod/EditorInfo;->packageName:Ljava/lang/String;

    :cond_2
    iget v0, p0, Landroid/view/inputmethod/EditorInfo;->fieldId:I

    iput v0, p1, Landroid/view/inputmethod/EditorInfo;->fieldId:I

    iget-object v0, p0, Landroid/view/inputmethod/EditorInfo;->fieldName:Ljava/lang/String;

    if-eqz v0, :cond_3

    iput-object v0, p1, Landroid/view/inputmethod/EditorInfo;->fieldName:Ljava/lang/String;

    :cond_3
    iget v0, p0, Landroid/view/inputmethod/EditorInfo;->initialSelStart:I

    iput v0, p1, Landroid/view/inputmethod/EditorInfo;->initialSelStart:I

    iget p0, p0, Landroid/view/inputmethod/EditorInfo;->initialSelEnd:I

    iput p0, p1, Landroid/view/inputmethod/EditorInfo;->initialSelEnd:I

    :cond_4
    :goto_0
    return-void
.end method
