.class public Lcom/google/androidgamesdk/gametextinput/InputConnection;
.super Landroid/view/inputmethod/BaseInputConnection;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnKeyListener;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/androidgamesdk/gametextinput/InputConnection$b;
    }
.end annotation


# static fields
.field private static INVALID_INDEX:I = -0x1

.field private static final MAX_LENGTH_FOR_SINGLE_LINE_EDIT_TEXT:I = 0x1388

.field private static final TAG:Ljava/lang/String; = "gti.InputConnection"


# instance fields
.field private final imm:Landroid/view/inputmethod/InputMethodManager;

.field private listener:Lge/a;

.field private final mEditable:Landroid/text/Editable;

.field private mSoftKeyboardActive:Z

.field private final settings:Lge/b;

.field private final targetView:Landroid/view/View;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/view/View;Lge/b;)V
    .locals 3

    iget-object v0, p3, Lge/b;->a:Landroid/view/inputmethod/EditorInfo;

    iget v0, v0, Landroid/view/inputmethod/EditorInfo;->inputType:I

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    invoke-direct {p0, p2, v0}, Landroid/view/inputmethod/BaseInputConnection;-><init>(Landroid/view/View;Z)V

    const-string v0, "gti.InputConnection"

    const-string v2, "InputConnection created"

    invoke-static {v0, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iput-object p2, p0, Lcom/google/androidgamesdk/gametextinput/InputConnection;->targetView:Landroid/view/View;

    iput-object p3, p0, Lcom/google/androidgamesdk/gametextinput/InputConnection;->settings:Lge/b;

    const-string v0, "input_method"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_1

    check-cast p1, Landroid/view/inputmethod/InputMethodManager;

    iput-object p1, p0, Lcom/google/androidgamesdk/gametextinput/InputConnection;->imm:Landroid/view/inputmethod/InputMethodManager;

    new-instance p1, Landroid/text/SpannableStringBuilder;

    invoke-direct {p1}, Landroid/text/SpannableStringBuilder;-><init>()V

    iput-object p1, p0, Lcom/google/androidgamesdk/gametextinput/InputConnection;->mEditable:Landroid/text/Editable;

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-static {p1, v1}, Landroidx/core/view/c1;->b(Landroid/view/Window;Z)V

    invoke-virtual {p2, p0}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    iget-object p1, p3, Lge/b;->a:Landroid/view/inputmethod/EditorInfo;

    invoke-virtual {p0, p1}, Lcom/google/androidgamesdk/gametextinput/InputConnection;->setEditorInfo(Landroid/view/inputmethod/EditorInfo;)V

    return-void

    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Can\'t get IMM"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private static findIndexBackward(Ljava/lang/CharSequence;II)I
    .locals 4

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-ltz p1, :cond_9

    if-ge v0, p1, :cond_0

    goto :goto_2

    :cond_0
    if-gez p2, :cond_1

    sget p0, Lcom/google/androidgamesdk/gametextinput/InputConnection;->INVALID_INDEX:I

    return p0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    move v1, v0

    :goto_1
    if-nez p2, :cond_2

    return p1

    :cond_2
    add-int/lit8 p1, p1, -0x1

    if-gez p1, :cond_4

    if-eqz v1, :cond_3

    sget p0, Lcom/google/androidgamesdk/gametextinput/InputConnection;->INVALID_INDEX:I

    return p0

    :cond_3
    return v0

    :cond_4
    invoke-interface {p0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    if-eqz v1, :cond_6

    invoke-static {v2}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v1

    if-nez v1, :cond_5

    sget p0, Lcom/google/androidgamesdk/gametextinput/InputConnection;->INVALID_INDEX:I

    return p0

    :cond_5
    add-int/lit8 p2, p2, -0x1

    goto :goto_0

    :cond_6
    invoke-static {v2}, Ljava/lang/Character;->isSurrogate(C)Z

    move-result v3

    if-nez v3, :cond_7

    add-int/lit8 p2, p2, -0x1

    goto :goto_1

    :cond_7
    invoke-static {v2}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v1

    if-eqz v1, :cond_8

    sget p0, Lcom/google/androidgamesdk/gametextinput/InputConnection;->INVALID_INDEX:I

    return p0

    :cond_8
    const/4 v1, 0x1

    goto :goto_1

    :cond_9
    :goto_2
    sget p0, Lcom/google/androidgamesdk/gametextinput/InputConnection;->INVALID_INDEX:I

    return p0
.end method

.method private static findIndexForward(Ljava/lang/CharSequence;II)I
    .locals 5

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-ltz p1, :cond_9

    if-ge v0, p1, :cond_0

    goto :goto_2

    :cond_0
    if-gez p2, :cond_1

    sget p0, Lcom/google/androidgamesdk/gametextinput/InputConnection;->INVALID_INDEX:I

    return p0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    move v2, v1

    :goto_1
    if-nez p2, :cond_2

    return p1

    :cond_2
    if-lt p1, v0, :cond_4

    if-eqz v2, :cond_3

    sget p0, Lcom/google/androidgamesdk/gametextinput/InputConnection;->INVALID_INDEX:I

    return p0

    :cond_3
    return v0

    :cond_4
    invoke-interface {p0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    if-eqz v2, :cond_6

    invoke-static {v3}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v2

    if-nez v2, :cond_5

    sget p0, Lcom/google/androidgamesdk/gametextinput/InputConnection;->INVALID_INDEX:I

    return p0

    :cond_5
    add-int/lit8 p2, p2, -0x1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_6
    invoke-static {v3}, Ljava/lang/Character;->isSurrogate(C)Z

    move-result v4

    if-nez v4, :cond_7

    add-int/lit8 p2, p2, -0x1

    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    :cond_7
    invoke-static {v3}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v2

    if-eqz v2, :cond_8

    sget p0, Lcom/google/androidgamesdk/gametextinput/InputConnection;->INVALID_INDEX:I

    return p0

    :cond_8
    add-int/lit8 p1, p1, 0x1

    const/4 v2, 0x1

    goto :goto_1

    :cond_9
    :goto_2
    sget p0, Lcom/google/androidgamesdk/gametextinput/InputConnection;->INVALID_INDEX:I

    return p0
.end method

.method private getComposingRegion()Lcom/google/androidgamesdk/gametextinput/a$a;
    .locals 3

    new-instance v0, Lcom/google/androidgamesdk/gametextinput/a$a;

    iget-object v1, p0, Lcom/google/androidgamesdk/gametextinput/InputConnection;->mEditable:Landroid/text/Editable;

    invoke-static {v1}, Landroid/view/inputmethod/BaseInputConnection;->getComposingSpanStart(Landroid/text/Spannable;)I

    move-result v1

    iget-object v2, p0, Lcom/google/androidgamesdk/gametextinput/InputConnection;->mEditable:Landroid/text/Editable;

    invoke-static {v2}, Landroid/view/inputmethod/BaseInputConnection;->getComposingSpanEnd(Landroid/text/Spannable;)I

    move-result v2

    invoke-direct {v0, v1, v2}, Lcom/google/androidgamesdk/gametextinput/a$a;-><init>(II)V

    return-object v0
.end method

.method private getSelection()Lcom/google/androidgamesdk/gametextinput/a$a;
    .locals 3

    new-instance v0, Lcom/google/androidgamesdk/gametextinput/a$a;

    iget-object v1, p0, Lcom/google/androidgamesdk/gametextinput/InputConnection;->mEditable:Landroid/text/Editable;

    invoke-static {v1}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    move-result v1

    iget-object v2, p0, Lcom/google/androidgamesdk/gametextinput/InputConnection;->mEditable:Landroid/text/Editable;

    invoke-static {v2}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    move-result v2

    invoke-direct {v0, v1, v2}, Lcom/google/androidgamesdk/gametextinput/a$a;-><init>(II)V

    return-object v0
.end method

.method private immUpdateSelection()V
    .locals 9

    invoke-direct {p0}, Lcom/google/androidgamesdk/gametextinput/InputConnection;->getSelection()Lcom/google/androidgamesdk/gametextinput/a$a;

    move-result-object v0

    invoke-direct {p0}, Lcom/google/androidgamesdk/gametextinput/InputConnection;->getComposingRegion()Lcom/google/androidgamesdk/gametextinput/a$a;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "immUpdateSelection: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, v0, Lcom/google/androidgamesdk/gametextinput/a$a;->a:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ","

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, v0, Lcom/google/androidgamesdk/gametextinput/a$a;->b:I

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ". "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, v1, Lcom/google/androidgamesdk/gametextinput/a$a;->a:I

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, v1, Lcom/google/androidgamesdk/gametextinput/a$a;->b:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "gti.InputConnection"

    invoke-static {v3, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v2, p0, Lcom/google/androidgamesdk/gametextinput/InputConnection;->settings:Lge/b;

    iget-object v2, v2, Lge/b;->a:Landroid/view/inputmethod/EditorInfo;

    iget v5, v0, Lcom/google/androidgamesdk/gametextinput/a$a;->a:I

    iput v5, v2, Landroid/view/inputmethod/EditorInfo;->initialSelStart:I

    iget v6, v0, Lcom/google/androidgamesdk/gametextinput/a$a;->b:I

    iput v6, v2, Landroid/view/inputmethod/EditorInfo;->initialSelEnd:I

    iget-object v3, p0, Lcom/google/androidgamesdk/gametextinput/InputConnection;->imm:Landroid/view/inputmethod/InputMethodManager;

    iget-object v4, p0, Lcom/google/androidgamesdk/gametextinput/InputConnection;->targetView:Landroid/view/View;

    iget v7, v1, Lcom/google/androidgamesdk/gametextinput/a$a;->a:I

    iget v8, v1, Lcom/google/androidgamesdk/gametextinput/a$a;->b:I

    invoke-virtual/range {v3 .. v8}, Landroid/view/inputmethod/InputMethodManager;->updateSelection(Landroid/view/View;IIII)V

    return-void
.end method

.method private processKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 8

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget-object v3, p0, Lcom/google/androidgamesdk/gametextinput/InputConnection;->mEditable:Landroid/text/Editable;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v2, v3}, [Ljava/lang/Object;

    move-result-object v2

    const-string v3, "processKeyEvent(key=%d) text=%s"

    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "gti.InputConnection"

    invoke-static {v3, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v2, p0, Lcom/google/androidgamesdk/gametextinput/InputConnection;->settings:Lge/b;

    iget-object v2, v2, Lge/b;->a:Landroid/view/inputmethod/EditorInfo;

    iget v2, v2, Landroid/view/inputmethod/EditorInfo;->inputType:I

    const/high16 v4, 0x20000

    and-int/2addr v2, v4

    const/4 v4, 0x1

    if-nez v2, :cond_2

    const/16 v2, 0x42

    if-eq v1, v2, :cond_1

    const/16 v2, 0xa0

    if-ne v1, v2, :cond_2

    :cond_1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->hasNoModifiers()Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object p1, p0, Lcom/google/androidgamesdk/gametextinput/InputConnection;->settings:Lge/b;

    iget-object p1, p1, Lge/b;->a:Landroid/view/inputmethod/EditorInfo;

    iget p1, p1, Landroid/view/inputmethod/EditorInfo;->actionId:I

    invoke-direct {p0, p1}, Lcom/google/androidgamesdk/gametextinput/InputConnection;->sendEditorAction(I)Z

    return v4

    :cond_2
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v2

    if-eqz v2, :cond_3

    return v0

    :cond_3
    invoke-direct {p0}, Lcom/google/androidgamesdk/gametextinput/InputConnection;->getSelection()Lcom/google/androidgamesdk/gametextinput/a$a;

    move-result-object v2

    iget v5, v2, Lcom/google/androidgamesdk/gametextinput/a$a;->a:I

    const/4 v6, -0x1

    if-ne v5, v6, :cond_4

    iget-object v5, p0, Lcom/google/androidgamesdk/gametextinput/InputConnection;->mEditable:Landroid/text/Editable;

    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    move-result v5

    iput v5, v2, Lcom/google/androidgamesdk/gametextinput/a$a;->a:I

    iget-object v5, p0, Lcom/google/androidgamesdk/gametextinput/InputConnection;->mEditable:Landroid/text/Editable;

    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    move-result v5

    iput v5, v2, Lcom/google/androidgamesdk/gametextinput/a$a;->b:I

    :cond_4
    const/16 v5, 0x15

    if-ne v1, v5, :cond_6

    iget p1, v2, Lcom/google/androidgamesdk/gametextinput/a$a;->a:I

    iget v0, v2, Lcom/google/androidgamesdk/gametextinput/a$a;->b:I

    if-ne p1, v0, :cond_5

    iget-object v0, p0, Lcom/google/androidgamesdk/gametextinput/InputConnection;->mEditable:Landroid/text/Editable;

    invoke-static {v0, p1, v4}, Lcom/google/androidgamesdk/gametextinput/InputConnection;->findIndexBackward(Ljava/lang/CharSequence;II)I

    move-result p1

    invoke-virtual {p0, p1, p1}, Lcom/google/androidgamesdk/gametextinput/InputConnection;->setSelection(II)Z

    goto :goto_0

    :cond_5
    invoke-virtual {p0, p1, p1}, Lcom/google/androidgamesdk/gametextinput/InputConnection;->setSelection(II)Z

    :goto_0
    return v4

    :cond_6
    const/16 v5, 0x16

    if-ne v1, v5, :cond_8

    iget p1, v2, Lcom/google/androidgamesdk/gametextinput/a$a;->a:I

    iget v0, v2, Lcom/google/androidgamesdk/gametextinput/a$a;->b:I

    if-ne p1, v0, :cond_7

    iget-object p1, p0, Lcom/google/androidgamesdk/gametextinput/InputConnection;->mEditable:Landroid/text/Editable;

    invoke-static {p1, v0, v4}, Lcom/google/androidgamesdk/gametextinput/InputConnection;->findIndexForward(Ljava/lang/CharSequence;II)I

    move-result p1

    invoke-virtual {p0, p1, p1}, Lcom/google/androidgamesdk/gametextinput/InputConnection;->setSelection(II)Z

    goto :goto_1

    :cond_7
    invoke-virtual {p0, v0, v0}, Lcom/google/androidgamesdk/gametextinput/InputConnection;->setSelection(II)Z

    :goto_1
    return v4

    :cond_8
    const/16 v5, 0x7a

    if-ne v1, v5, :cond_9

    invoke-virtual {p0, v0, v0}, Lcom/google/androidgamesdk/gametextinput/InputConnection;->setSelection(II)Z

    return v4

    :cond_9
    const/16 v5, 0x7b

    if-ne v1, v5, :cond_a

    iget-object p1, p0, Lcom/google/androidgamesdk/gametextinput/InputConnection;->mEditable:Landroid/text/Editable;

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    iget-object v0, p0, Lcom/google/androidgamesdk/gametextinput/InputConnection;->mEditable:Landroid/text/Editable;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    invoke-virtual {p0, p1, v0}, Lcom/google/androidgamesdk/gametextinput/InputConnection;->setSelection(II)Z

    return v4

    :cond_a
    const/16 v5, 0x70

    const/16 v7, 0x43

    if-eq v1, v7, :cond_f

    if-ne v1, v5, :cond_b

    goto :goto_2

    :cond_b
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getUnicodeChar()I

    move-result v1

    if-nez v1, :cond_c

    return v0

    :cond_c
    iget v1, v2, Lcom/google/androidgamesdk/gametextinput/a$a;->a:I

    iget v5, v2, Lcom/google/androidgamesdk/gametextinput/a$a;->b:I

    if-eq v1, v5, :cond_d

    const-string v1, "processKeyEvent: deleting selection"

    new-array v5, v0, [Ljava/lang/Object;

    invoke-static {v1, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v1, p0, Lcom/google/androidgamesdk/gametextinput/InputConnection;->mEditable:Landroid/text/Editable;

    iget v5, v2, Lcom/google/androidgamesdk/gametextinput/a$a;->a:I

    iget v7, v2, Lcom/google/androidgamesdk/gametextinput/a$a;->b:I

    invoke-interface {v1, v5, v7}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;

    :cond_d
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getUnicodeChar()I

    move-result p1

    int-to-char p1, p1

    invoke-static {p1}, Ljava/lang/Character;->toString(C)Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lcom/google/androidgamesdk/gametextinput/InputConnection;->mEditable:Landroid/text/Editable;

    iget v5, v2, Lcom/google/androidgamesdk/gametextinput/a$a;->a:I

    invoke-interface {v1, v5, p1}, Landroid/text/Editable;->insert(ILjava/lang/CharSequence;)Landroid/text/Editable;

    iget-object v1, p0, Lcom/google/androidgamesdk/gametextinput/InputConnection;->mEditable:Landroid/text/Editable;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    invoke-direct {p0}, Lcom/google/androidgamesdk/gametextinput/InputConnection;->getComposingRegion()Lcom/google/androidgamesdk/gametextinput/a$a;

    move-result-object v5

    iget v7, v5, Lcom/google/androidgamesdk/gametextinput/a$a;->a:I

    if-ne v7, v6, :cond_e

    invoke-direct {p0}, Lcom/google/androidgamesdk/gametextinput/InputConnection;->getSelection()Lcom/google/androidgamesdk/gametextinput/a$a;

    move-result-object v5

    iget v7, v5, Lcom/google/androidgamesdk/gametextinput/a$a;->a:I

    if-ne v7, v6, :cond_e

    new-instance v5, Lcom/google/androidgamesdk/gametextinput/a$a;

    invoke-direct {v5, v0, v0}, Lcom/google/androidgamesdk/gametextinput/a$a;-><init>(II)V

    :cond_e
    iget v0, v5, Lcom/google/androidgamesdk/gametextinput/a$a;->a:I

    add-int/2addr v1, v0

    iput v1, v5, Lcom/google/androidgamesdk/gametextinput/a$a;->b:I

    invoke-virtual {p0, v0, v1}, Lcom/google/androidgamesdk/gametextinput/InputConnection;->setComposingRegion(II)Z

    iget v0, v2, Lcom/google/androidgamesdk/gametextinput/a$a;->a:I

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    add-int/2addr v0, p1

    invoke-virtual {p0, v0, v0}, Lcom/google/androidgamesdk/gametextinput/InputConnection;->setSelection(II)Z

    iget-object p1, p0, Lcom/google/androidgamesdk/gametextinput/InputConnection;->mEditable:Landroid/text/Editable;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "processKeyEvent: exit, text=%s"

    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return v4

    :cond_f
    :goto_2
    iget p1, v2, Lcom/google/androidgamesdk/gametextinput/a$a;->a:I

    iget v2, v2, Lcom/google/androidgamesdk/gametextinput/a$a;->b:I

    if-eq p1, v2, :cond_10

    iget-object v0, p0, Lcom/google/androidgamesdk/gametextinput/InputConnection;->mEditable:Landroid/text/Editable;

    invoke-interface {v0, p1, v2}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;

    return v4

    :cond_10
    if-ne v1, v7, :cond_11

    if-lez p1, :cond_11

    invoke-virtual {p0}, Lcom/google/androidgamesdk/gametextinput/InputConnection;->finishComposingText()Z

    invoke-virtual {p0, v4, v0}, Lcom/google/androidgamesdk/gametextinput/InputConnection;->deleteSurroundingTextInCodePoints(II)Z

    return v4

    :cond_11
    if-ne v1, v5, :cond_12

    iget-object v1, p0, Lcom/google/androidgamesdk/gametextinput/InputConnection;->mEditable:Landroid/text/Editable;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-ge p1, v1, :cond_12

    invoke-virtual {p0}, Lcom/google/androidgamesdk/gametextinput/InputConnection;->finishComposingText()Z

    invoke-virtual {p0, v0, v4}, Lcom/google/androidgamesdk/gametextinput/InputConnection;->deleteSurroundingTextInCodePoints(II)Z

    return v4

    :cond_12
    return v0
.end method

.method private sendEditorAction(I)Z
    .locals 1

    iget-object v0, p0, Lcom/google/androidgamesdk/gametextinput/InputConnection;->listener:Lge/a;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lge/a;->H(I)V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private final stateUpdated()V
    .locals 8

    invoke-direct {p0}, Lcom/google/androidgamesdk/gametextinput/InputConnection;->getSelection()Lcom/google/androidgamesdk/gametextinput/a$a;

    move-result-object v0

    invoke-direct {p0}, Lcom/google/androidgamesdk/gametextinput/InputConnection;->getComposingRegion()Lcom/google/androidgamesdk/gametextinput/a$a;

    move-result-object v1

    new-instance v2, Lcom/google/androidgamesdk/gametextinput/State;

    iget-object v3, p0, Lcom/google/androidgamesdk/gametextinput/InputConnection;->mEditable:Landroid/text/Editable;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    iget v4, v0, Lcom/google/androidgamesdk/gametextinput/a$a;->a:I

    iget v5, v0, Lcom/google/androidgamesdk/gametextinput/a$a;->b:I

    iget v6, v1, Lcom/google/androidgamesdk/gametextinput/a$a;->a:I

    iget v7, v1, Lcom/google/androidgamesdk/gametextinput/a$a;->b:I

    invoke-direct/range {v2 .. v7}, Lcom/google/androidgamesdk/gametextinput/State;-><init>(Ljava/lang/String;IIII)V

    iget-object v1, p0, Lcom/google/androidgamesdk/gametextinput/InputConnection;->settings:Lge/b;

    iget-object v1, v1, Lge/b;->a:Landroid/view/inputmethod/EditorInfo;

    iget v3, v0, Lcom/google/androidgamesdk/gametextinput/a$a;->a:I

    iput v3, v1, Landroid/view/inputmethod/EditorInfo;->initialSelStart:I

    iget v0, v0, Lcom/google/androidgamesdk/gametextinput/a$a;->b:I

    iput v0, v1, Landroid/view/inputmethod/EditorInfo;->initialSelEnd:I

    iget-object v0, p0, Lcom/google/androidgamesdk/gametextinput/InputConnection;->listener:Lge/a;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-interface {v0, v2, v1}, Lge/a;->B(Lcom/google/androidgamesdk/gametextinput/State;Z)V

    :cond_0
    return-void
.end method


# virtual methods
.method public closeConnection()V
    .locals 2

    const-string v0, "gti.InputConnection"

    const-string v1, "closeConnection"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-super {p0}, Landroid/view/inputmethod/BaseInputConnection;->closeConnection()V

    return-void
.end method

.method public commitCompletion(Landroid/view/inputmethod/CompletionInfo;)Z
    .locals 2

    const-string v0, "gti.InputConnection"

    const-string v1, "commitCompletion"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-super {p0, p1}, Landroid/view/inputmethod/BaseInputConnection;->commitCompletion(Landroid/view/inputmethod/CompletionInfo;)Z

    move-result p1

    return p1
.end method

.method public commitCorrection(Landroid/view/inputmethod/CorrectionInfo;)Z
    .locals 2

    const-string v0, "gti.InputConnection"

    const-string v1, "commitCompletion"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-super {p0, p1}, Landroid/view/inputmethod/BaseInputConnection;->commitCorrection(Landroid/view/inputmethod/CorrectionInfo;)Z

    move-result p1

    return p1
.end method

.method public commitText(Ljava/lang/CharSequence;I)Z
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "commitText: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    const-string v1, ", new pos = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "gti.InputConnection"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-super {p0, p1, p2}, Landroid/view/inputmethod/BaseInputConnection;->commitText(Ljava/lang/CharSequence;I)Z

    move-result p1

    return p1
.end method

.method public deleteSurroundingText(II)Z
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "deleteSurroundingText: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "gti.InputConnection"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-super {p0, p1, p2}, Landroid/view/inputmethod/BaseInputConnection;->deleteSurroundingText(II)Z

    move-result p1

    return p1
.end method

.method public deleteSurroundingTextInCodePoints(II)Z
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "deleteSurroundingTextInCodePoints: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "gti.InputConnection"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-super {p0, p1, p2}, Landroid/view/inputmethod/BaseInputConnection;->deleteSurroundingTextInCodePoints(II)Z

    move-result p1

    return p1
.end method

.method public endBatchEdit()Z
    .locals 2

    const-string v0, "gti.InputConnection"

    const-string v1, "endBatchEdit"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-direct {p0}, Lcom/google/androidgamesdk/gametextinput/InputConnection;->stateUpdated()V

    invoke-super {p0}, Landroid/view/inputmethod/BaseInputConnection;->endBatchEdit()Z

    move-result v0

    return v0
.end method

.method public finishComposingText()Z
    .locals 2

    const-string v0, "gti.InputConnection"

    const-string v1, "finishComposingText"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-super {p0}, Landroid/view/inputmethod/BaseInputConnection;->finishComposingText()Z

    move-result v0

    return v0
.end method

.method public getEditable()Landroid/text/Editable;
    .locals 2

    const-string v0, "gti.InputConnection"

    const-string v1, "getEditable"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/google/androidgamesdk/gametextinput/InputConnection;->mEditable:Landroid/text/Editable;

    return-object v0
.end method

.method public final getEditorInfo()Landroid/view/inputmethod/EditorInfo;
    .locals 1

    iget-object v0, p0, Lcom/google/androidgamesdk/gametextinput/InputConnection;->settings:Lge/b;

    iget-object v0, v0, Lge/b;->a:Landroid/view/inputmethod/EditorInfo;

    return-object v0
.end method

.method public getExtractedText(Landroid/view/inputmethod/ExtractedTextRequest;I)Landroid/view/inputmethod/ExtractedText;
    .locals 2

    const-string v0, "gti.InputConnection"

    const-string v1, "getExtractedText"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-super {p0, p1, p2}, Landroid/view/inputmethod/BaseInputConnection;->getExtractedText(Landroid/view/inputmethod/ExtractedTextRequest;I)Landroid/view/inputmethod/ExtractedText;

    move-result-object p1

    return-object p1
.end method

.method public getImeInsets()Landroidx/core/graphics/Insets;
    .locals 2

    iget-object v0, p0, Lcom/google/androidgamesdk/gametextinput/InputConnection;->targetView:Landroid/view/View;

    if-nez v0, :cond_0

    sget-object v0, Landroidx/core/graphics/Insets;->NONE:Landroidx/core/graphics/Insets;

    return-object v0

    :cond_0
    invoke-static {v0}, Landroidx/core/view/o0;->F(Landroid/view/View;)Landroidx/core/view/WindowInsetsCompat;

    move-result-object v0

    if-nez v0, :cond_1

    sget-object v0, Landroidx/core/graphics/Insets;->NONE:Landroidx/core/graphics/Insets;

    return-object v0

    :cond_1
    invoke-static {}, Landroidx/core/view/WindowInsetsCompat$Type;->ime()I

    move-result v1

    invoke-virtual {v0, v1}, Landroidx/core/view/WindowInsetsCompat;->getInsets(I)Landroidx/core/graphics/Insets;

    move-result-object v0

    return-object v0
.end method

.method public final getListener()Lge/a;
    .locals 1

    iget-object v0, p0, Lcom/google/androidgamesdk/gametextinput/InputConnection;->listener:Lge/a;

    return-object v0
.end method

.method public getSelectedText(I)Ljava/lang/CharSequence;
    .locals 3

    invoke-super {p0, p1}, Landroid/view/inputmethod/BaseInputConnection;->getSelectedText(I)Ljava/lang/CharSequence;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, ""

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getSelectedText: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", result: "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "gti.InputConnection"

    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-object v0
.end method

.method public final getSoftKeyboardActive()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/androidgamesdk/gametextinput/InputConnection;->mSoftKeyboardActive:Z

    return v0
.end method

.method public getTextAfterCursor(II)Ljava/lang/CharSequence;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "getTextAfterCursor: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "gti.InputConnection"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    if-gez p1, :cond_0

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "getTextAfterCursor: returning null to due to an invalid length="

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-super {p0, p1, p2}, Landroid/view/inputmethod/BaseInputConnection;->getTextAfterCursor(II)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method

.method public getTextBeforeCursor(II)Ljava/lang/CharSequence;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "getTextBeforeCursor: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", flags="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "gti.InputConnection"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    if-gez p1, :cond_0

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "getTextBeforeCursor: returning null to due to an invalid length="

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-super {p0, p1, p2}, Landroid/view/inputmethod/BaseInputConnection;->getTextBeforeCursor(II)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method

.method public isSoftwareKeyboardVisible()Z
    .locals 2

    iget-object v0, p0, Lcom/google/androidgamesdk/gametextinput/InputConnection;->targetView:Landroid/view/View;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-static {v0}, Landroidx/core/view/o0;->F(Landroid/view/View;)Landroidx/core/view/WindowInsetsCompat;

    move-result-object v0

    if-nez v0, :cond_1

    return v1

    :cond_1
    invoke-static {}, Landroidx/core/view/WindowInsetsCompat$Type;->ime()I

    move-result v1

    invoke-virtual {v0, v1}, Landroidx/core/view/WindowInsetsCompat;->isVisible(I)Z

    move-result v0

    return v0
.end method

.method public onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "onKey: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "gti.InputConnection"

    invoke-static {p2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lcom/google/androidgamesdk/gametextinput/InputConnection;->getSoftKeyboardActive()Z

    move-result p1

    const/4 p2, 0x0

    if-nez p1, :cond_0

    return p2

    :cond_0
    invoke-direct {p0, p3}, Lcom/google/androidgamesdk/gametextinput/InputConnection;->processKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lcom/google/androidgamesdk/gametextinput/InputConnection;->stateUpdated()V

    invoke-direct {p0}, Lcom/google/androidgamesdk/gametextinput/InputConnection;->immUpdateSelection()V

    invoke-virtual {p0}, Lcom/google/androidgamesdk/gametextinput/InputConnection;->restartInput()V

    const/4 p1, 0x1

    return p1

    :cond_1
    return p2
.end method

.method public performEditorAction(I)Z
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "performEditorAction, action="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "gti.InputConnection"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    if-nez p1, :cond_0

    invoke-super {p0, p1}, Landroid/view/inputmethod/BaseInputConnection;->performEditorAction(I)Z

    move-result p1

    return p1

    :cond_0
    invoke-direct {p0, p1}, Lcom/google/androidgamesdk/gametextinput/InputConnection;->sendEditorAction(I)Z

    move-result p1

    return p1
.end method

.method public performPrivateCommand(Ljava/lang/String;Landroid/os/Bundle;)Z
    .locals 2

    const-string v0, "gti.InputConnection"

    const-string v1, "performPrivateCommand"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-super {p0, p1, p2}, Landroid/view/inputmethod/BaseInputConnection;->performPrivateCommand(Ljava/lang/String;Landroid/os/Bundle;)Z

    move-result p1

    return p1
.end method

.method public requestCursorUpdates(I)Z
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Request cursor updates: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "gti.InputConnection"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-super {p0, p1}, Landroid/view/inputmethod/BaseInputConnection;->requestCursorUpdates(I)Z

    move-result p1

    return p1
.end method

.method public restartInput()V
    .locals 2

    iget-object v0, p0, Lcom/google/androidgamesdk/gametextinput/InputConnection;->imm:Landroid/view/inputmethod/InputMethodManager;

    iget-object v1, p0, Lcom/google/androidgamesdk/gametextinput/InputConnection;->targetView:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/inputmethod/InputMethodManager;->restartInput(Landroid/view/View;)V

    return-void
.end method

.method public sendKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "sendKeyEvent: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "gti.InputConnection"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-super {p0, p1}, Landroid/view/inputmethod/BaseInputConnection;->sendKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public setComposingRegion(II)Z
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "setComposingRegion: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "gti.InputConnection"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-super {p0, p1, p2}, Landroid/view/inputmethod/BaseInputConnection;->setComposingRegion(II)Z

    move-result p1

    return p1
.end method

.method public setComposingText(Ljava/lang/CharSequence;I)Z
    .locals 2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {p1, v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "setComposingText=\'%s\' newCursorPosition=%d"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "gti.InputConnection"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-super {p0, p1, p2}, Landroid/view/inputmethod/BaseInputConnection;->setComposingText(Ljava/lang/CharSequence;I)Z

    move-result p1

    return p1
.end method

.method public final setEditorInfo(Landroid/view/inputmethod/EditorInfo;)V
    .locals 4

    const-string v0, "gti.InputConnection"

    const-string v1, "setEditorInfo"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/google/androidgamesdk/gametextinput/InputConnection;->settings:Lge/b;

    iput-object p1, v0, Lge/b;->a:Landroid/view/inputmethod/EditorInfo;

    iget p1, p1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    const/high16 v0, 0x20000

    and-int/2addr p1, v0

    const/4 v0, 0x0

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/google/androidgamesdk/gametextinput/InputConnection;->mEditable:Landroid/text/Editable;

    new-instance v1, Landroid/text/InputFilter$LengthFilter;

    const/16 v2, 0x1388

    invoke-direct {v1, v2}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    new-instance v2, Lcom/google/androidgamesdk/gametextinput/InputConnection$b;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lcom/google/androidgamesdk/gametextinput/InputConnection$b;-><init>(Lcom/google/androidgamesdk/gametextinput/InputConnection;Lcom/google/androidgamesdk/gametextinput/InputConnection$a;)V

    const/4 v3, 0x2

    new-array v3, v3, [Landroid/text/InputFilter;

    aput-object v1, v3, v0

    const/4 v0, 0x1

    aput-object v2, v3, v0

    invoke-interface {p1, v3}, Landroid/text/Editable;->setFilters([Landroid/text/InputFilter;)V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/google/androidgamesdk/gametextinput/InputConnection;->mEditable:Landroid/text/Editable;

    new-array v0, v0, [Landroid/text/InputFilter;

    invoke-interface {p1, v0}, Landroid/text/Editable;->setFilters([Landroid/text/InputFilter;)V

    return-void
.end method

.method public setImeConsumesInput(Z)Z
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "setImeConsumesInput: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "gti.InputConnection"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    invoke-super {p0, p1}, Landroid/view/inputmethod/BaseInputConnection;->setImeConsumesInput(Z)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final setListener(Lge/a;)Lcom/google/androidgamesdk/gametextinput/InputConnection;
    .locals 0

    iput-object p1, p0, Lcom/google/androidgamesdk/gametextinput/InputConnection;->listener:Lge/a;

    return-object p0
.end method

.method public setSelection(II)Z
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "setSelection: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "gti.InputConnection"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-super {p0, p1, p2}, Landroid/view/inputmethod/BaseInputConnection;->setSelection(II)Z

    move-result p1

    return p1
.end method

.method public final setSoftKeyboardActive(ZI)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "setSoftKeyboardActive, active: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "gti.InputConnection"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iput-boolean p1, p0, Lcom/google/androidgamesdk/gametextinput/InputConnection;->mSoftKeyboardActive:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/google/androidgamesdk/gametextinput/InputConnection;->targetView:Landroid/view/View;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    iget-object p1, p0, Lcom/google/androidgamesdk/gametextinput/InputConnection;->targetView:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    iget-object p1, p0, Lcom/google/androidgamesdk/gametextinput/InputConnection;->imm:Landroid/view/inputmethod/InputMethodManager;

    iget-object v0, p0, Lcom/google/androidgamesdk/gametextinput/InputConnection;->targetView:Landroid/view/View;

    invoke-virtual {p1, v0, p2}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/androidgamesdk/gametextinput/InputConnection;->imm:Landroid/view/inputmethod/InputMethodManager;

    iget-object v0, p0, Lcom/google/androidgamesdk/gametextinput/InputConnection;->targetView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    :goto_0
    invoke-virtual {p0}, Lcom/google/androidgamesdk/gametextinput/InputConnection;->restartInput()V

    return-void
.end method

.method public final setState(Lcom/google/androidgamesdk/gametextinput/State;)V
    .locals 3

    if-nez p1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "setState: \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p1, Lcom/google/androidgamesdk/gametextinput/State;->text:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\', selection=("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p1, Lcom/google/androidgamesdk/gametextinput/State;->selectionStart:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p1, Lcom/google/androidgamesdk/gametextinput/State;->selectionEnd:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "), composing region=("

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p1, Lcom/google/androidgamesdk/gametextinput/State;->composingRegionStart:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p1, Lcom/google/androidgamesdk/gametextinput/State;->composingRegionEnd:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "gti.InputConnection"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/google/androidgamesdk/gametextinput/InputConnection;->mEditable:Landroid/text/Editable;

    invoke-interface {v0}, Landroid/text/Editable;->clear()V

    iget-object v0, p0, Lcom/google/androidgamesdk/gametextinput/InputConnection;->mEditable:Landroid/text/Editable;

    invoke-interface {v0}, Landroid/text/Editable;->clearSpans()V

    iget-object v0, p0, Lcom/google/androidgamesdk/gametextinput/InputConnection;->mEditable:Landroid/text/Editable;

    const/4 v1, 0x0

    iget-object v2, p1, Lcom/google/androidgamesdk/gametextinput/State;->text:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Landroid/text/Editable;->insert(ILjava/lang/CharSequence;)Landroid/text/Editable;

    iget v0, p1, Lcom/google/androidgamesdk/gametextinput/State;->selectionStart:I

    iget v1, p1, Lcom/google/androidgamesdk/gametextinput/State;->selectionEnd:I

    invoke-virtual {p0, v0, v1}, Lcom/google/androidgamesdk/gametextinput/InputConnection;->setSelection(II)Z

    iget v0, p1, Lcom/google/androidgamesdk/gametextinput/State;->composingRegionStart:I

    iget p1, p1, Lcom/google/androidgamesdk/gametextinput/State;->composingRegionEnd:I

    if-eq v0, p1, :cond_1

    invoke-virtual {p0, v0, p1}, Lcom/google/androidgamesdk/gametextinput/InputConnection;->setComposingRegion(II)Z

    :cond_1
    invoke-virtual {p0}, Lcom/google/androidgamesdk/gametextinput/InputConnection;->restartInput()V

    return-void
.end method
