.class public Lcom/roblox/client/RbxKeyboard;
.super Lq/l;
.source "SourceFile"


# instance fields
.field public final g:Ljava/lang/String;

.field public h:J

.field public i:Z

.field public j:I

.field public k:Landroid/view/autofill/AutofillManager;

.field public l:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lq/l;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const-string p1, "rbx.glview.text"

    iput-object p1, p0, Lcom/roblox/client/RbxKeyboard;->g:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public autofill(Landroid/view/autofill/AutofillValue;)V
    .locals 2

    invoke-super {p0, p1}, Landroid/view/View;->autofill(Landroid/view/autofill/AutofillValue;)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->E3()Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iget v0, p0, Lcom/roblox/client/RbxKeyboard;->j:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "autofillActivated"

    const/4 v1, 0x0

    invoke-static {v0, v1, v1, p1}, Lsg/t0;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public e()V
    .locals 2

    const-wide/16 v0, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/roblox/client/RbxKeyboard;->setCurrentTextBox(J)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p0}, Lsg/e2;->i(Landroid/content/Context;Landroid/view/View;)V

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public f()V
    .locals 2

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->D2()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-class v1, Landroid/view/autofill/AutofillManager;

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/autofill/AutofillManager;

    iput-object v0, p0, Lcom/roblox/client/RbxKeyboard;->k:Landroid/view/autofill/AutofillManager;

    :cond_0
    new-instance v0, Lcom/roblox/client/RbxKeyboard$a;

    invoke-direct {v0, p0}, Lcom/roblox/client/RbxKeyboard$a;-><init>(Lcom/roblox/client/RbxKeyboard;)V

    invoke-virtual {p0, v0}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    new-instance v0, Lcom/roblox/client/RbxKeyboard$b;

    invoke-direct {v0, p0}, Lcom/roblox/client/RbxKeyboard$b;-><init>(Lcom/roblox/client/RbxKeyboard;)V

    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    return-void
.end method

.method public g()Z
    .locals 1

    iget-boolean v0, p0, Lcom/roblox/client/RbxKeyboard;->i:Z

    return v0
.end method

.method public getCurrentTextBox()J
    .locals 2

    iget-wide v0, p0, Lcom/roblox/client/RbxKeyboard;->h:J

    return-wide v0
.end method

.method public h()V
    .locals 2

    const-string v0, "onVrSessionForeground"

    const-string v1, "rbx.glview.text"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lsg/a1;->q0()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v0, "Maquettes keyboard release focus only hide triggered."

    invoke-static {v1, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-wide v0, p0, Lcom/roblox/client/RbxKeyboard;->h:J

    invoke-static {v0, v1}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeReleaseFocus(J)V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/roblox/client/RbxKeyboard;->h:J

    return-void
.end method

.method public i(Lcom/roblox/engine/jni/model/NativeTextBoxInfo;Ljava/lang/String;)V
    .locals 2

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->D2()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/roblox/client/RbxKeyboard;->k:Landroid/view/autofill/AutofillManager;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Landroid/view/autofill/AutofillManager;->cancel()V

    if-eqz p1, :cond_3

    iget v0, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->textInputType:I

    const/4 v1, 0x5

    if-eq v0, v1, :cond_2

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->P0()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->textInputType:I

    const/4 v1, 0x6

    if-eq v0, v1, :cond_2

    :cond_0
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->v0()Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->textInputType:I

    const/16 v1, 0x9

    if-eq v0, v1, :cond_2

    :cond_1
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->P0()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->v0()Z

    move-result v0

    if-eqz v0, :cond_3

    iget p1, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->textInputType:I

    const/16 v0, 0xa

    if-ne p1, v0, :cond_3

    :cond_2
    const/4 p1, 0x1

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_4

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/roblox/client/RbxKeyboard;->k:Landroid/view/autofill/AutofillManager;

    invoke-virtual {p1, p0}, Landroid/view/autofill/AutofillManager;->requestAutofill(Landroid/view/View;)V

    :cond_4
    return-void
.end method

.method public j(J)V
    .locals 0

    invoke-static {p1, p2}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeReleaseFocus(J)V

    return-void
.end method

.method public k()V
    .locals 4

    invoke-virtual {p0}, Lq/l;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Landroid/widget/TextView;->getSelectionStart()I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "syncTextboxTextAndCursorPosition() text:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " pos:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "rbx.glview.text"

    invoke-static {v3, v2}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {v0, v1}, Lcom/roblox/engine/jni/NativeGLInterface;->syncTextboxTextAndCursorPosition2(Ljava/lang/String;I)V

    return-void
.end method

.method public l(Lcom/roblox/engine/jni/model/NativeTextBoxInfo;)V
    .locals 7

    if-eqz p1, :cond_18

    iget v0, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->textColor:I

    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setTextColor(I)V

    iget-boolean v0, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->manualFocusRelease:Z

    invoke-virtual {p0, v0}, Lcom/roblox/client/RbxKeyboard;->setManualFocusRelease(Z)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->v0()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/View;->setAutofillHints([Ljava/lang/String;)V

    :cond_0
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->E3()Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->textInputType:I

    iput v0, p0, Lcom/roblox/client/RbxKeyboard;->j:I

    :cond_1
    iget v0, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->textInputType:I

    const-string v1, "newPassword"

    const v2, 0x80001

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->v0()Z

    move-result v0

    if-eqz v0, :cond_2

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/view/View;->setAutofillHints([Ljava/lang/String;)V

    goto :goto_1

    :pswitch_1
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->v0()Z

    move-result v0

    if-eqz v0, :cond_4

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/view/View;->setAutofillHints([Ljava/lang/String;)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->e5()Z

    move-result v0

    if-eqz v0, :cond_6

    const v2, 0x80081

    goto :goto_1

    :cond_2
    :pswitch_2
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->P0()Z

    move-result v0

    if-eqz v0, :cond_3

    const v2, 0x80091

    goto :goto_1

    :cond_3
    const v2, 0x80090

    goto :goto_1

    :cond_4
    :pswitch_3
    const/16 v2, 0x81

    goto :goto_1

    :pswitch_4
    move v2, v3

    goto :goto_1

    :pswitch_5
    const/16 v2, 0x21

    goto :goto_1

    :pswitch_6
    move v2, v4

    goto :goto_1

    :pswitch_7
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->h()Z

    move-result v0

    if-eqz v0, :cond_5

    const/16 v2, 0x41

    goto :goto_1

    :cond_5
    :goto_0
    move v2, v5

    :cond_6
    :goto_1
    :pswitch_8
    iget v0, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->returnKeyType:I

    const/4 v1, 0x5

    if-eq v0, v5, :cond_a

    if-eq v0, v4, :cond_9

    if-eq v0, v3, :cond_8

    const/4 v6, 0x4

    if-eq v0, v6, :cond_7

    goto :goto_2

    :cond_7
    move v6, v3

    goto :goto_2

    :cond_8
    move v6, v1

    goto :goto_2

    :cond_9
    move v6, v4

    goto :goto_2

    :cond_a
    const/4 v6, 0x6

    :goto_2
    iget-boolean v0, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->multiline:Z

    if-nez v0, :cond_b

    iget-boolean v0, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->textWrapped:Z

    if-eqz v0, :cond_c

    :cond_b
    const/high16 v0, 0x20000

    or-int/2addr v2, v0

    :cond_c
    const/high16 v0, 0x10000000

    or-int/2addr v0, v6

    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setImeOptions(I)V

    invoke-virtual {p0}, Landroid/widget/TextView;->getInputType()I

    move-result v0

    if-eq v0, v2, :cond_d

    invoke-virtual {p0, v2}, Landroid/widget/TextView;->setInputType(I)V

    invoke-virtual {p0}, Lq/l;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    invoke-virtual {p0, v0}, Landroid/widget/EditText;->setSelection(I)V

    :cond_d
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->f0()Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_11

    iget-boolean v0, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->editable:Z

    if-nez v0, :cond_f

    invoke-virtual {p0, v2}, Landroid/widget/TextView;->setShowSoftInputOnFocus(Z)V

    invoke-virtual {p0, v2}, Landroid/widget/TextView;->setCursorVisible(Z)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->f1()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p0}, Lsg/e2;->i(Landroid/content/Context;Landroid/view/View;)V

    :cond_e
    iput-boolean v5, p0, Lcom/roblox/client/RbxKeyboard;->l:Z

    goto :goto_3

    :cond_f
    iget-boolean v0, p0, Lcom/roblox/client/RbxKeyboard;->l:Z

    if-eqz v0, :cond_11

    invoke-virtual {p0, v5}, Landroid/widget/TextView;->setShowSoftInputOnFocus(Z)V

    invoke-virtual {p0, v5}, Landroid/widget/TextView;->setCursorVisible(Z)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->f1()Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-static {p0, v4}, Lsg/e2;->k(Landroid/view/View;I)V

    :cond_10
    iput-boolean v2, p0, Lcom/roblox/client/RbxKeyboard;->l:Z

    :cond_11
    :goto_3
    iget v0, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->xAlignment:I

    if-eqz v0, :cond_14

    if-eq v0, v5, :cond_13

    if-eq v0, v4, :cond_12

    move v3, v2

    goto :goto_4

    :cond_12
    move v3, v5

    goto :goto_4

    :cond_13
    move v3, v1

    :cond_14
    :goto_4
    iget p1, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->yAlignment:I

    if-eqz p1, :cond_17

    if-eq p1, v5, :cond_16

    if-eq p1, v4, :cond_15

    goto :goto_5

    :cond_15
    const/16 v2, 0x50

    goto :goto_5

    :cond_16
    const/16 v2, 0x10

    goto :goto_5

    :cond_17
    const/16 v2, 0x30

    :goto_5
    or-int p1, v3, v2

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setGravity(I)V

    :cond_18
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_8
        :pswitch_6
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public m(IFF)V
    .locals 3

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {p0, v0, p1}, Leh/e;->e(Landroid/widget/TextView;Landroid/content/Context;I)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {p1, v0}, Leh/e;->b(ILandroid/content/Context;)F

    move-result p1

    goto :goto_1

    :cond_0
    const/4 v0, 0x4

    const v2, 0x3f4b851f    # 0.795f

    if-eq p1, v0, :cond_2

    const/4 v0, 0x5

    if-eq p1, v0, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "SourceSansPro-Regular.ttf"

    invoke-static {p0, p1, v0}, Leh/e;->d(Landroid/widget/TextView;Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "SourceSansPro-Light.ttf"

    invoke-static {p0, p1, v0}, Leh/e;->d(Landroid/widget/TextView;Landroid/content/Context;Ljava/lang/String;)V

    :goto_0
    move p1, v2

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "SourceSansPro-Bold.ttf"

    invoke-static {p0, p1, v0}, Leh/e;->d(Landroid/widget/TextView;Landroid/content/Context;Ljava/lang/String;)V

    const v1, 0x3d23d70a    # 0.04f

    goto :goto_0

    :goto_1
    mul-float/2addr p2, p3

    mul-float/2addr p2, p1

    const/4 p1, 0x0

    invoke-virtual {p0, p1, p2}, Landroid/widget/TextView;->setTextSize(IF)V

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "using letter spacing = "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "rbx.glview.text"

    invoke-static {p2, p1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0, v1}, Landroid/widget/TextView;->setLetterSpacing(F)V

    return-void
.end method

.method public onKeyPreIme(ILandroid/view/KeyEvent;)Z
    .locals 2

    invoke-virtual {p0}, Lcom/roblox/client/RbxKeyboard;->k()V

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result p1

    const/4 v0, 0x4

    if-eq p1, v0, :cond_0

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getAction()I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    iget-wide v0, p0, Lcom/roblox/client/RbxKeyboard;->h:J

    invoke-virtual {p0, v0, v1}, Lcom/roblox/client/RbxKeyboard;->j(J)V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/roblox/client/RbxKeyboard;->h:J

    const/16 p1, 0x8

    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    const-string p1, ""

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, p0}, Lsg/e2;->i(Landroid/content/Context;Landroid/view/View;)V

    :cond_1
    :goto_0
    invoke-super {p0, p2}, Landroid/view/View;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1

    :pswitch_data_0
    .packed-switch 0x13
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public onSelectionChanged(II)V
    .locals 0

    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/roblox/client/RbxKeyboard;->k()V

    return-void
.end method

.method public onTextContextMenuItem(I)Z
    .locals 1

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->f0()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/roblox/client/RbxKeyboard;->l:Z

    if-eqz v0, :cond_1

    const v0, 0x1020022

    if-eq p1, v0, :cond_0

    const v0, 0x1020031

    if-eq p1, v0, :cond_0

    const v0, 0x1020020

    if-ne p1, v0, :cond_1

    :cond_0
    const/4 p1, 0x1

    return p1

    :cond_1
    invoke-super {p0, p1}, Lq/l;->onTextContextMenuItem(I)Z

    move-result p1

    return p1
.end method

.method public setCurrentTextBox(J)V
    .locals 0

    iput-wide p1, p0, Lcom/roblox/client/RbxKeyboard;->h:J

    return-void
.end method

.method public setManualFocusRelease(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/roblox/client/RbxKeyboard;->i:Z

    return-void
.end method
