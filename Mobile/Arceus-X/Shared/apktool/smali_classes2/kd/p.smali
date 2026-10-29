.class public Lkd/p;
.super Lkd/r;
.source "SourceFile"


# static fields
.field public static final s:Z


# instance fields
.field public final e:I

.field public final f:I

.field public final g:Landroid/animation/TimeInterpolator;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public h:Landroid/widget/AutoCompleteTextView;

.field public final i:Landroid/view/View$OnClickListener;

.field public final j:Landroid/view/View$OnFocusChangeListener;

.field public final k:Ly2/c$a;

.field public l:Z

.field public m:Z

.field public n:Z

.field public o:J

.field public p:Landroid/view/accessibility/AccessibilityManager;

.field public q:Landroid/animation/ValueAnimator;

.field public r:Landroid/animation/ValueAnimator;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x1

    sput-boolean v0, Lkd/p;->s:Z

    return-void
.end method

.method public constructor <init>(Lcom/google/android/material/textfield/a;)V
    .locals 3
    .param p1    # Lcom/google/android/material/textfield/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0, p1}, Lkd/r;-><init>(Lcom/google/android/material/textfield/a;)V

    new-instance v0, Lkd/l;

    invoke-direct {v0, p0}, Lkd/l;-><init>(Lkd/p;)V

    iput-object v0, p0, Lkd/p;->i:Landroid/view/View$OnClickListener;

    new-instance v0, Lkd/m;

    invoke-direct {v0, p0}, Lkd/m;-><init>(Lkd/p;)V

    iput-object v0, p0, Lkd/p;->j:Landroid/view/View$OnFocusChangeListener;

    new-instance v0, Lkd/n;

    invoke-direct {v0, p0}, Lkd/n;-><init>(Lkd/p;)V

    iput-object v0, p0, Lkd/p;->k:Ly2/c$a;

    const-wide v0, 0x7fffffffffffffffL

    iput-wide v0, p0, Lkd/p;->o:J

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lic/b;->L:I

    const/16 v2, 0x43

    invoke-static {v0, v1, v2}, Lcd/h;->f(Landroid/content/Context;II)I

    move-result v0

    iput v0, p0, Lkd/p;->f:I

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const/16 v2, 0x32

    invoke-static {v0, v1, v2}, Lcd/h;->f(Landroid/content/Context;II)I

    move-result v0

    iput v0, p0, Lkd/p;->e:I

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    sget v0, Lic/b;->Q:I

    sget-object v1, Ljc/a;->a:Landroid/animation/TimeInterpolator;

    invoke-static {p1, v0, v1}, Lcd/h;->g(Landroid/content/Context;ILandroid/animation/TimeInterpolator;)Landroid/animation/TimeInterpolator;

    move-result-object p1

    iput-object p1, p0, Lkd/p;->g:Landroid/animation/TimeInterpolator;

    return-void
.end method

.method public static synthetic A(Lkd/p;)V
    .locals 1

    invoke-virtual {p0}, Lkd/p;->K()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lkd/p;->H(Z)V

    return-void
.end method

.method public static synthetic B(Lkd/p;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lkd/p;->J()V

    return-void
.end method

.method public static synthetic C(Lkd/p;)Landroid/animation/ValueAnimator;
    .locals 0

    iget-object p0, p0, Lkd/p;->r:Landroid/animation/ValueAnimator;

    return-object p0
.end method

.method public static D(Landroid/widget/EditText;)Landroid/widget/AutoCompleteTextView;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    instance-of v0, p0, Landroid/widget/AutoCompleteTextView;

    if-eqz v0, :cond_0

    check-cast p0, Landroid/widget/AutoCompleteTextView;

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/RuntimeException;

    const-string v0, "EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used."

    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private F()V
    .locals 3

    iget v0, p0, Lkd/p;->f:I

    const/4 v1, 0x2

    new-array v2, v1, [F

    fill-array-data v2, :array_0

    invoke-virtual {p0, v0, v2}, Lkd/p;->E(I[F)Landroid/animation/ValueAnimator;

    move-result-object v0

    iput-object v0, p0, Lkd/p;->r:Landroid/animation/ValueAnimator;

    iget v0, p0, Lkd/p;->e:I

    new-array v1, v1, [F

    fill-array-data v1, :array_1

    invoke-virtual {p0, v0, v1}, Lkd/p;->E(I[F)Landroid/animation/ValueAnimator;

    move-result-object v0

    iput-object v0, p0, Lkd/p;->q:Landroid/animation/ValueAnimator;

    new-instance v1, Lkd/p$a;

    invoke-direct {v1, p0}, Lkd/p$a;-><init>(Lkd/p;)V

    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    return-void

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method public static synthetic v(Lkd/p;)V
    .locals 1

    iget-object v0, p0, Lkd/p;->h:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->isPopupShowing()Z

    move-result v0

    invoke-virtual {p0, v0}, Lkd/p;->H(Z)V

    iput-boolean v0, p0, Lkd/p;->m:Z

    return-void
.end method

.method public static synthetic w(Lkd/p;Z)V
    .locals 1

    iget-object v0, p0, Lkd/p;->h:Landroid/widget/AutoCompleteTextView;

    if-eqz v0, :cond_1

    invoke-static {v0}, Lkd/q;->a(Landroid/widget/EditText;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object p0, p0, Lkd/r;->d:Lcom/google/android/material/internal/CheckableImageButton;

    if-eqz p1, :cond_0

    const/4 p1, 0x2

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    :goto_0
    invoke-static {p0, p1}, Landroidx/core/view/o0;->w0(Landroid/view/View;I)V

    :cond_1
    return-void
.end method

.method public static synthetic x(Lkd/p;Landroid/animation/ValueAnimator;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iget-object p0, p0, Lkd/r;->d:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {p0, p1}, Landroid/view/View;->setAlpha(F)V

    return-void
.end method

.method public static synthetic y(Lkd/p;Landroid/view/View;Z)V
    .locals 0

    iput-boolean p2, p0, Lkd/p;->l:Z

    invoke-virtual {p0}, Lkd/r;->r()V

    if-nez p2, :cond_0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lkd/p;->H(Z)V

    iput-boolean p1, p0, Lkd/p;->m:Z

    :cond_0
    return-void
.end method

.method public static synthetic z(Lkd/p;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result p1

    const/4 p2, 0x1

    const/4 v0, 0x0

    if-ne p1, p2, :cond_1

    invoke-virtual {p0}, Lkd/p;->G()Z

    move-result p1

    if-eqz p1, :cond_0

    iput-boolean v0, p0, Lkd/p;->m:Z

    :cond_0
    invoke-virtual {p0}, Lkd/p;->J()V

    invoke-virtual {p0}, Lkd/p;->K()V

    :cond_1
    return v0
.end method


# virtual methods
.method public final varargs E(I[F)Landroid/animation/ValueAnimator;
    .locals 2

    invoke-static {p2}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object p2

    iget-object v0, p0, Lkd/p;->g:Landroid/animation/TimeInterpolator;

    invoke-virtual {p2, v0}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    int-to-long v0, p1

    invoke-virtual {p2, v0, v1}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    new-instance p1, Lkd/i;

    invoke-direct {p1, p0}, Lkd/i;-><init>(Lkd/p;)V

    invoke-virtual {p2, p1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    return-object p2
.end method

.method public final G()Z
    .locals 4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lkd/p;->o:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-ltz v2, :cond_1

    const-wide/16 v2, 0x12c

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final H(Z)V
    .locals 1

    iget-boolean v0, p0, Lkd/p;->n:Z

    if-eq v0, p1, :cond_0

    iput-boolean p1, p0, Lkd/p;->n:Z

    iget-object p1, p0, Lkd/p;->r:Landroid/animation/ValueAnimator;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->cancel()V

    iget-object p1, p0, Lkd/p;->q:Landroid/animation/ValueAnimator;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    :cond_0
    return-void
.end method

.method public final I()V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClickableViewAccessibility"
        }
    .end annotation

    iget-object v0, p0, Lkd/p;->h:Landroid/widget/AutoCompleteTextView;

    new-instance v1, Lkd/j;

    invoke-direct {v1, p0}, Lkd/j;-><init>(Lkd/p;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    sget-boolean v0, Lkd/p;->s:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkd/p;->h:Landroid/widget/AutoCompleteTextView;

    new-instance v1, Lkd/k;

    invoke-direct {v1, p0}, Lkd/k;-><init>(Lkd/p;)V

    invoke-virtual {v0, v1}, Landroid/widget/AutoCompleteTextView;->setOnDismissListener(Landroid/widget/AutoCompleteTextView$OnDismissListener;)V

    :cond_0
    iget-object v0, p0, Lkd/p;->h:Landroid/widget/AutoCompleteTextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/AutoCompleteTextView;->setThreshold(I)V

    return-void
.end method

.method public final J()V
    .locals 2

    iget-object v0, p0, Lkd/p;->h:Landroid/widget/AutoCompleteTextView;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lkd/p;->G()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iput-boolean v1, p0, Lkd/p;->m:Z

    :cond_1
    iget-boolean v0, p0, Lkd/p;->m:Z

    if-nez v0, :cond_4

    sget-boolean v0, Lkd/p;->s:Z

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lkd/p;->n:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Lkd/p;->H(Z)V

    goto :goto_0

    :cond_2
    iget-boolean v0, p0, Lkd/p;->n:Z

    xor-int/lit8 v0, v0, 0x1

    iput-boolean v0, p0, Lkd/p;->n:Z

    invoke-virtual {p0}, Lkd/r;->r()V

    :goto_0
    iget-boolean v0, p0, Lkd/p;->n:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lkd/p;->h:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    iget-object v0, p0, Lkd/p;->h:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->showDropDown()V

    return-void

    :cond_3
    iget-object v0, p0, Lkd/p;->h:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->dismissDropDown()V

    return-void

    :cond_4
    iput-boolean v1, p0, Lkd/p;->m:Z

    return-void
.end method

.method public final K()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lkd/p;->m:Z

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lkd/p;->o:J

    return-void
.end method

.method public a(Landroid/text/Editable;)V
    .locals 1

    iget-object p1, p0, Lkd/p;->p:Landroid/view/accessibility/AccessibilityManager;

    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lkd/p;->h:Landroid/widget/AutoCompleteTextView;

    invoke-static {p1}, Lkd/q;->a(Landroid/widget/EditText;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lkd/r;->d:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {p1}, Landroid/view/View;->hasFocus()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lkd/p;->h:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {p1}, Landroid/widget/AutoCompleteTextView;->dismissDropDown()V

    :cond_0
    iget-object p1, p0, Lkd/p;->h:Landroid/widget/AutoCompleteTextView;

    new-instance v0, Lkd/o;

    invoke-direct {v0, p0}, Lkd/o;-><init>(Lkd/p;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public c()I
    .locals 1

    sget v0, Lic/i;->g:I

    return v0
.end method

.method public d()I
    .locals 1

    sget-boolean v0, Lkd/p;->s:Z

    if-eqz v0, :cond_0

    sget v0, Lic/e;->j:I

    return v0

    :cond_0
    sget v0, Lic/e;->k:I

    return v0
.end method

.method public e()Landroid/view/View$OnFocusChangeListener;
    .locals 1

    iget-object v0, p0, Lkd/p;->j:Landroid/view/View$OnFocusChangeListener;

    return-object v0
.end method

.method public f()Landroid/view/View$OnClickListener;
    .locals 1

    iget-object v0, p0, Lkd/p;->i:Landroid/view/View$OnClickListener;

    return-object v0
.end method

.method public h()Ly2/c$a;
    .locals 1

    iget-object v0, p0, Lkd/p;->k:Ly2/c$a;

    return-object v0
.end method

.method public i(I)Z
    .locals 0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public j()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public k()Z
    .locals 1

    iget-boolean v0, p0, Lkd/p;->l:Z

    return v0
.end method

.method public l()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public m()Z
    .locals 1

    iget-boolean v0, p0, Lkd/p;->n:Z

    return v0
.end method

.method public n(Landroid/widget/EditText;)V
    .locals 2

    invoke-static {p1}, Lkd/p;->D(Landroid/widget/EditText;)Landroid/widget/AutoCompleteTextView;

    move-result-object v0

    iput-object v0, p0, Lkd/p;->h:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {p0}, Lkd/p;->I()V

    iget-object v0, p0, Lkd/r;->a:Lcom/google/android/material/textfield/TextInputLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setErrorIconDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-static {p1}, Lkd/q;->a(Landroid/widget/EditText;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lkd/p;->p:Landroid/view/accessibility/AccessibilityManager;

    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lkd/r;->d:Lcom/google/android/material/internal/CheckableImageButton;

    const/4 v0, 0x2

    invoke-static {p1, v0}, Landroidx/core/view/o0;->w0(Landroid/view/View;I)V

    :cond_0
    iget-object p1, p0, Lkd/r;->a:Lcom/google/android/material/textfield/TextInputLayout;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setEndIconVisible(Z)V

    return-void
.end method

.method public o(Landroid/view/View;Ly2/p;)V
    .locals 0
    .param p2    # Ly2/p;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object p1, p0, Lkd/p;->h:Landroid/widget/AutoCompleteTextView;

    invoke-static {p1}, Lkd/q;->a(Landroid/widget/EditText;)Z

    move-result p1

    if-nez p1, :cond_0

    const-class p1, Landroid/widget/Spinner;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ly2/p;->l0(Ljava/lang/CharSequence;)V

    :cond_0
    invoke-virtual {p2}, Ly2/p;->V()Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    invoke-virtual {p2, p1}, Ly2/p;->x0(Ljava/lang/CharSequence;)V

    :cond_1
    return-void
.end method

.method public p(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 2
    .param p2    # Landroid/view/accessibility/AccessibilityEvent;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongConstant"
        }
    .end annotation

    iget-object p1, p0, Lkd/p;->p:Landroid/view/accessibility/AccessibilityManager;

    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lkd/p;->h:Landroid/widget/AutoCompleteTextView;

    invoke-static {p1}, Lkd/q;->a(Landroid/widget/EditText;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I

    move-result p1

    const v0, 0x8000

    const/4 v1, 0x1

    if-eq p1, v0, :cond_1

    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I

    move-result p1

    const/16 v0, 0x8

    if-ne p1, v0, :cond_2

    :cond_1
    iget-boolean p1, p0, Lkd/p;->n:Z

    if-eqz p1, :cond_2

    iget-object p1, p0, Lkd/p;->h:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {p1}, Landroid/widget/AutoCompleteTextView;->isPopupShowing()Z

    move-result p1

    if-nez p1, :cond_2

    move p1, v1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I

    move-result p2

    if-eq p2, v1, :cond_3

    if-eqz p1, :cond_4

    :cond_3
    invoke-virtual {p0}, Lkd/p;->J()V

    invoke-virtual {p0}, Lkd/p;->K()V

    :cond_4
    :goto_1
    return-void
.end method

.method public s()V
    .locals 2

    invoke-direct {p0}, Lkd/p;->F()V

    iget-object v0, p0, Lkd/r;->c:Landroid/content/Context;

    const-string v1, "accessibility"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/accessibility/AccessibilityManager;

    iput-object v0, p0, Lkd/p;->p:Landroid/view/accessibility/AccessibilityManager;

    return-void
.end method

.method public t()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public u()V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClickableViewAccessibility"
        }
    .end annotation

    iget-object v0, p0, Lkd/p;->h:Landroid/widget/AutoCompleteTextView;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    sget-boolean v0, Lkd/p;->s:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkd/p;->h:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {v0, v1}, Landroid/widget/AutoCompleteTextView;->setOnDismissListener(Landroid/widget/AutoCompleteTextView$OnDismissListener;)V

    :cond_0
    return-void
.end method
