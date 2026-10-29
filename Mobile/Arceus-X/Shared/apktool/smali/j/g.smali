.class public Lj/g;
.super Lj/e;
.source "SourceFile"

# interfaces
.implements Landroidx/appcompat/view/menu/e$a;
.implements Landroid/view/LayoutInflater$Factory2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj/g$k;,
        Lj/g$l;,
        Lj/g$n;,
        Lj/g$q;,
        Lj/g$g;,
        Lj/g$p;,
        Lj/g$r;,
        Lj/g$f;,
        Lj/g$h;,
        Lj/g$i;,
        Lj/g$o;,
        Lj/g$m;,
        Lj/g$j;
    }
.end annotation


# static fields
.field public static final j0:Lw1/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw1/j<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final k0:Z

.field public static final l0:[I

.field public static final m0:Z


# instance fields
.field public A:Z

.field public B:Landroid/view/ViewGroup;

.field public C:Landroid/widget/TextView;

.field public D:Landroid/view/View;

.field public E:Z

.field public F:Z

.field public G:Z

.field public H:Z

.field public I:Z

.field public J:Z

.field public K:Z

.field public L:Z

.field public M:[Lj/g$q;

.field public N:Lj/g$q;

.field public O:Z

.field public P:Z

.field public Q:Z

.field public R:Z

.field public S:Landroid/content/res/Configuration;

.field public T:I

.field public U:I

.field public V:I

.field public W:Z

.field public X:Lj/g$n;

.field public Y:Lj/g$n;

.field public Z:Z

.field public a0:I

.field public final b0:Ljava/lang/Runnable;

.field public c0:Z

.field public d0:Landroid/graphics/Rect;

.field public e0:Landroid/graphics/Rect;

.field public f0:Lj/n;

.field public g0:Lj/p;

.field public h0:Landroid/window/OnBackInvokedDispatcher;

.field public i0:Landroid/window/OnBackInvokedCallback;

.field public final j:Ljava/lang/Object;

.field public final k:Landroid/content/Context;

.field public l:Landroid/view/Window;

.field public m:Lj/g$l;

.field public final n:Lj/c;

.field public o:Lj/a;

.field public p:Landroid/view/MenuInflater;

.field public q:Ljava/lang/CharSequence;

.field public r:Lq/e0;

.field public s:Lj/g$f;

.field public t:Lj/g$r;

.field public u:Lo/b;

.field public v:Landroidx/appcompat/widget/ActionBarContextView;

.field public w:Landroid/widget/PopupWindow;

.field public x:Ljava/lang/Runnable;

.field public y:Landroidx/core/view/y0;

.field public z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lw1/j;

    invoke-direct {v0}, Lw1/j;-><init>()V

    sput-object v0, Lj/g;->j0:Lw1/j;

    const/4 v0, 0x0

    sput-boolean v0, Lj/g;->k0:Z

    const v0, 0x1010054

    filled-new-array {v0}, [I

    move-result-object v0

    sput-object v0, Lj/g;->l0:[I

    const-string v0, "robolectric"

    sget-object v1, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    sput-boolean v0, Lj/g;->m0:Z

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Lj/c;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0, p2, p1}, Lj/g;-><init>(Landroid/content/Context;Landroid/view/Window;Lj/c;Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Landroid/app/Dialog;Lj/c;)V
    .locals 2

    .line 2
    invoke-virtual {p1}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-direct {p0, v0, v1, p2, p1}, Lj/g;-><init>(Landroid/content/Context;Landroid/view/Window;Lj/c;Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/view/Window;Lj/c;Ljava/lang/Object;)V
    .locals 2

    .line 3
    invoke-direct {p0}, Lj/e;-><init>()V

    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lj/g;->y:Landroidx/core/view/y0;

    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lj/g;->z:Z

    const/16 v0, -0x64

    .line 6
    iput v0, p0, Lj/g;->T:I

    .line 7
    new-instance v1, Lj/g$a;

    invoke-direct {v1, p0}, Lj/g$a;-><init>(Lj/g;)V

    iput-object v1, p0, Lj/g;->b0:Ljava/lang/Runnable;

    .line 8
    iput-object p1, p0, Lj/g;->k:Landroid/content/Context;

    .line 9
    iput-object p3, p0, Lj/g;->n:Lj/c;

    .line 10
    iput-object p4, p0, Lj/g;->j:Ljava/lang/Object;

    .line 11
    iget p1, p0, Lj/g;->T:I

    if-ne p1, v0, :cond_0

    instance-of p1, p4, Landroid/app/Dialog;

    if-eqz p1, :cond_0

    .line 12
    invoke-virtual {p0}, Lj/g;->X0()Lj/b;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 13
    invoke-virtual {p1}, Lj/b;->s1()Lj/e;

    move-result-object p1

    invoke-virtual {p1}, Lj/e;->n()I

    move-result p1

    iput p1, p0, Lj/g;->T:I

    .line 14
    :cond_0
    iget p1, p0, Lj/g;->T:I

    if-ne p1, v0, :cond_1

    .line 15
    sget-object p1, Lj/g;->j0:Lw1/j;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Lw1/j;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Integer;

    if-eqz p3, :cond_1

    .line 16
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    iput p3, p0, Lj/g;->T:I

    .line 17
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Lw1/j;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    if-eqz p2, :cond_2

    .line 18
    invoke-virtual {p0, p2}, Lj/g;->S(Landroid/view/Window;)V

    .line 19
    :cond_2
    invoke-static {}, Lq/k;->h()V

    return-void
.end method

.method public static k0(Landroid/content/res/Configuration;Landroid/content/res/Configuration;)Landroid/content/res/Configuration;
    .locals 4
    .param p0    # Landroid/content/res/Configuration;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Landroid/content/res/Configuration;

    invoke-direct {v0}, Landroid/content/res/Configuration;-><init>()V

    const/4 v1, 0x0

    iput v1, v0, Landroid/content/res/Configuration;->fontScale:F

    if-eqz p1, :cond_13

    invoke-virtual {p0, p1}, Landroid/content/res/Configuration;->diff(Landroid/content/res/Configuration;)I

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_0

    :cond_0
    iget v1, p0, Landroid/content/res/Configuration;->fontScale:F

    iget v2, p1, Landroid/content/res/Configuration;->fontScale:F

    cmpl-float v1, v1, v2

    if-eqz v1, :cond_1

    iput v2, v0, Landroid/content/res/Configuration;->fontScale:F

    :cond_1
    iget v1, p0, Landroid/content/res/Configuration;->mcc:I

    iget v2, p1, Landroid/content/res/Configuration;->mcc:I

    if-eq v1, v2, :cond_2

    iput v2, v0, Landroid/content/res/Configuration;->mcc:I

    :cond_2
    iget v1, p0, Landroid/content/res/Configuration;->mnc:I

    iget v2, p1, Landroid/content/res/Configuration;->mnc:I

    if-eq v1, v2, :cond_3

    iput v2, v0, Landroid/content/res/Configuration;->mnc:I

    :cond_3
    invoke-static {p0, p1, v0}, Lj/g$i;->a(Landroid/content/res/Configuration;Landroid/content/res/Configuration;Landroid/content/res/Configuration;)V

    iget v1, p0, Landroid/content/res/Configuration;->touchscreen:I

    iget v2, p1, Landroid/content/res/Configuration;->touchscreen:I

    if-eq v1, v2, :cond_4

    iput v2, v0, Landroid/content/res/Configuration;->touchscreen:I

    :cond_4
    iget v1, p0, Landroid/content/res/Configuration;->keyboard:I

    iget v2, p1, Landroid/content/res/Configuration;->keyboard:I

    if-eq v1, v2, :cond_5

    iput v2, v0, Landroid/content/res/Configuration;->keyboard:I

    :cond_5
    iget v1, p0, Landroid/content/res/Configuration;->keyboardHidden:I

    iget v2, p1, Landroid/content/res/Configuration;->keyboardHidden:I

    if-eq v1, v2, :cond_6

    iput v2, v0, Landroid/content/res/Configuration;->keyboardHidden:I

    :cond_6
    iget v1, p0, Landroid/content/res/Configuration;->navigation:I

    iget v2, p1, Landroid/content/res/Configuration;->navigation:I

    if-eq v1, v2, :cond_7

    iput v2, v0, Landroid/content/res/Configuration;->navigation:I

    :cond_7
    iget v1, p0, Landroid/content/res/Configuration;->navigationHidden:I

    iget v2, p1, Landroid/content/res/Configuration;->navigationHidden:I

    if-eq v1, v2, :cond_8

    iput v2, v0, Landroid/content/res/Configuration;->navigationHidden:I

    :cond_8
    iget v1, p0, Landroid/content/res/Configuration;->orientation:I

    iget v2, p1, Landroid/content/res/Configuration;->orientation:I

    if-eq v1, v2, :cond_9

    iput v2, v0, Landroid/content/res/Configuration;->orientation:I

    :cond_9
    iget v1, p0, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit8 v1, v1, 0xf

    iget v2, p1, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit8 v3, v2, 0xf

    if-eq v1, v3, :cond_a

    iget v1, v0, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit8 v2, v2, 0xf

    or-int/2addr v1, v2

    iput v1, v0, Landroid/content/res/Configuration;->screenLayout:I

    :cond_a
    iget v1, p0, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit16 v1, v1, 0xc0

    iget v2, p1, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit16 v3, v2, 0xc0

    if-eq v1, v3, :cond_b

    iget v1, v0, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit16 v2, v2, 0xc0

    or-int/2addr v1, v2

    iput v1, v0, Landroid/content/res/Configuration;->screenLayout:I

    :cond_b
    iget v1, p0, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit8 v1, v1, 0x30

    iget v2, p1, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit8 v3, v2, 0x30

    if-eq v1, v3, :cond_c

    iget v1, v0, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit8 v2, v2, 0x30

    or-int/2addr v1, v2

    iput v1, v0, Landroid/content/res/Configuration;->screenLayout:I

    :cond_c
    iget v1, p0, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit16 v1, v1, 0x300

    iget v2, p1, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit16 v3, v2, 0x300

    if-eq v1, v3, :cond_d

    iget v1, v0, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit16 v2, v2, 0x300

    or-int/2addr v1, v2

    iput v1, v0, Landroid/content/res/Configuration;->screenLayout:I

    :cond_d
    invoke-static {p0, p1, v0}, Lj/g$j;->a(Landroid/content/res/Configuration;Landroid/content/res/Configuration;Landroid/content/res/Configuration;)V

    iget v1, p0, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v1, v1, 0xf

    iget v2, p1, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v3, v2, 0xf

    if-eq v1, v3, :cond_e

    iget v1, v0, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v2, v2, 0xf

    or-int/2addr v1, v2

    iput v1, v0, Landroid/content/res/Configuration;->uiMode:I

    :cond_e
    iget v1, p0, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v1, v1, 0x30

    iget v2, p1, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v3, v2, 0x30

    if-eq v1, v3, :cond_f

    iget v1, v0, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v2, v2, 0x30

    or-int/2addr v1, v2

    iput v1, v0, Landroid/content/res/Configuration;->uiMode:I

    :cond_f
    iget v1, p0, Landroid/content/res/Configuration;->screenWidthDp:I

    iget v2, p1, Landroid/content/res/Configuration;->screenWidthDp:I

    if-eq v1, v2, :cond_10

    iput v2, v0, Landroid/content/res/Configuration;->screenWidthDp:I

    :cond_10
    iget v1, p0, Landroid/content/res/Configuration;->screenHeightDp:I

    iget v2, p1, Landroid/content/res/Configuration;->screenHeightDp:I

    if-eq v1, v2, :cond_11

    iput v2, v0, Landroid/content/res/Configuration;->screenHeightDp:I

    :cond_11
    iget v1, p0, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    iget v2, p1, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    if-eq v1, v2, :cond_12

    iput v2, v0, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    :cond_12
    iget p0, p0, Landroid/content/res/Configuration;->densityDpi:I

    iget p1, p1, Landroid/content/res/Configuration;->densityDpi:I

    if-eq p0, p1, :cond_13

    iput p1, v0, Landroid/content/res/Configuration;->densityDpi:I

    :cond_13
    :goto_0
    return-object v0
.end method


# virtual methods
.method public A(Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public A0()Z
    .locals 5

    iget-boolean v0, p0, Lj/g;->O:Z

    const/4 v1, 0x0

    iput-boolean v1, p0, Lj/g;->O:Z

    invoke-virtual {p0, v1, v1}, Lj/g;->q0(IZ)Lj/g$q;

    move-result-object v2

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    iget-boolean v4, v2, Lj/g$q;->o:Z

    if-eqz v4, :cond_1

    if-nez v0, :cond_0

    invoke-virtual {p0, v2, v3}, Lj/g;->Z(Lj/g$q;Z)V

    :cond_0
    return v3

    :cond_1
    iget-object v0, p0, Lj/g;->u:Lo/b;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lo/b;->c()V

    return v3

    :cond_2
    invoke-virtual {p0}, Lj/g;->r()Lj/a;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lj/a;->g()Z

    move-result v0

    if-eqz v0, :cond_3

    return v3

    :cond_3
    return v1
.end method

.method public B()V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lj/g;->P(ZZ)Z

    return-void
.end method

.method public B0(ILandroid/view/KeyEvent;)Z
    .locals 3

    const/4 v0, 0x4

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq p1, v0, :cond_1

    const/16 v0, 0x52

    if-eq p1, v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0, v2, p2}, Lj/g;->C0(ILandroid/view/KeyEvent;)Z

    return v1

    :cond_1
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getFlags()I

    move-result p1

    and-int/lit16 p1, p1, 0x80

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v1, v2

    :goto_0
    iput-boolean v1, p0, Lj/g;->O:Z

    :goto_1
    return v2
.end method

.method public C()V
    .locals 2

    invoke-virtual {p0}, Lj/g;->r()Lj/a;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lj/a;->s(Z)V

    :cond_0
    return-void
.end method

.method public final C0(ILandroid/view/KeyEvent;)Z
    .locals 1

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getRepeatCount()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lj/g;->q0(IZ)Lj/g$q;

    move-result-object p1

    iget-boolean v0, p1, Lj/g$q;->o:Z

    if-nez v0, :cond_0

    invoke-virtual {p0, p1, p2}, Lj/g;->M0(Lj/g$q;Landroid/view/KeyEvent;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public D0(ILandroid/view/KeyEvent;)Z
    .locals 3

    invoke-virtual {p0}, Lj/g;->r()Lj/a;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lj/a;->o(ILandroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

    return v1

    :cond_0
    iget-object p1, p0, Lj/g;->N:Lj/g$q;

    if-eqz p1, :cond_2

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    invoke-virtual {p0, p1, v0, p2, v1}, Lj/g;->L0(Lj/g$q;ILandroid/view/KeyEvent;I)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lj/g;->N:Lj/g$q;

    if-eqz p1, :cond_1

    iput-boolean v1, p1, Lj/g$q;->n:Z

    :cond_1
    return v1

    :cond_2
    iget-object p1, p0, Lj/g;->N:Lj/g$q;

    const/4 v0, 0x0

    if-nez p1, :cond_3

    invoke-virtual {p0, v0, v1}, Lj/g;->q0(IZ)Lj/g$q;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lj/g;->M0(Lj/g$q;Landroid/view/KeyEvent;)Z

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v2

    invoke-virtual {p0, p1, v2, p2, v1}, Lj/g;->L0(Lj/g$q;ILandroid/view/KeyEvent;I)Z

    move-result p2

    iput-boolean v0, p1, Lj/g$q;->m:Z

    if-eqz p2, :cond_3

    return v1

    :cond_3
    return v0
.end method

.method public E0(ILandroid/view/KeyEvent;)Z
    .locals 3

    const/4 v0, 0x4

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq p1, v0, :cond_1

    const/16 v0, 0x52

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v2, p2}, Lj/g;->F0(ILandroid/view/KeyEvent;)Z

    return v1

    :cond_1
    invoke-virtual {p0}, Lj/g;->A0()Z

    move-result p1

    if-eqz p1, :cond_2

    return v1

    :cond_2
    :goto_0
    return v2
.end method

.method public F(I)Z
    .locals 4

    invoke-virtual {p0, p1}, Lj/g;->O0(I)I

    move-result p1

    iget-boolean v0, p0, Lj/g;->K:Z

    const/4 v1, 0x0

    const/16 v2, 0x6c

    if-eqz v0, :cond_0

    if-ne p1, v2, :cond_0

    return v1

    :cond_0
    iget-boolean v0, p0, Lj/g;->G:Z

    const/4 v3, 0x1

    if-eqz v0, :cond_1

    if-ne p1, v3, :cond_1

    iput-boolean v1, p0, Lj/g;->G:Z

    :cond_1
    if-eq p1, v3, :cond_7

    const/4 v0, 0x2

    if-eq p1, v0, :cond_6

    const/4 v0, 0x5

    if-eq p1, v0, :cond_5

    const/16 v0, 0xa

    if-eq p1, v0, :cond_4

    if-eq p1, v2, :cond_3

    const/16 v0, 0x6d

    if-eq p1, v0, :cond_2

    iget-object v0, p0, Lj/g;->l:Landroid/view/Window;

    invoke-virtual {v0, p1}, Landroid/view/Window;->requestFeature(I)Z

    move-result p1

    return p1

    :cond_2
    invoke-virtual {p0}, Lj/g;->W0()V

    iput-boolean v3, p0, Lj/g;->H:Z

    return v3

    :cond_3
    invoke-virtual {p0}, Lj/g;->W0()V

    iput-boolean v3, p0, Lj/g;->G:Z

    return v3

    :cond_4
    invoke-virtual {p0}, Lj/g;->W0()V

    iput-boolean v3, p0, Lj/g;->I:Z

    return v3

    :cond_5
    invoke-virtual {p0}, Lj/g;->W0()V

    iput-boolean v3, p0, Lj/g;->F:Z

    return v3

    :cond_6
    invoke-virtual {p0}, Lj/g;->W0()V

    iput-boolean v3, p0, Lj/g;->E:Z

    return v3

    :cond_7
    invoke-virtual {p0}, Lj/g;->W0()V

    iput-boolean v3, p0, Lj/g;->K:Z

    return v3
.end method

.method public final F0(ILandroid/view/KeyEvent;)Z
    .locals 4

    iget-object v0, p0, Lj/g;->u:Lo/b;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lj/g;->q0(IZ)Lj/g$q;

    move-result-object v2

    if-nez p1, :cond_2

    iget-object p1, p0, Lj/g;->r:Lq/e0;

    if-eqz p1, :cond_2

    invoke-interface {p1}, Lq/e0;->a()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lj/g;->k:Landroid/content/Context;

    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->hasPermanentMenuKey()Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Lj/g;->r:Lq/e0;

    invoke-interface {p1}, Lq/e0;->e()Z

    move-result p1

    if-nez p1, :cond_1

    iget-boolean p1, p0, Lj/g;->R:Z

    if-nez p1, :cond_5

    invoke-virtual {p0, v2, p2}, Lj/g;->M0(Lj/g$q;Landroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Lj/g;->r:Lq/e0;

    invoke-interface {p1}, Lq/e0;->c()Z

    move-result v0

    goto :goto_2

    :cond_1
    iget-object p1, p0, Lj/g;->r:Lq/e0;

    invoke-interface {p1}, Lq/e0;->b()Z

    move-result v0

    goto :goto_2

    :cond_2
    iget-boolean p1, v2, Lj/g$q;->o:Z

    if-nez p1, :cond_6

    iget-boolean v3, v2, Lj/g$q;->n:Z

    if-eqz v3, :cond_3

    goto :goto_1

    :cond_3
    iget-boolean p1, v2, Lj/g$q;->m:Z

    if-eqz p1, :cond_5

    iget-boolean p1, v2, Lj/g$q;->r:Z

    if-eqz p1, :cond_4

    iput-boolean v1, v2, Lj/g$q;->m:Z

    invoke-virtual {p0, v2, p2}, Lj/g;->M0(Lj/g$q;Landroid/view/KeyEvent;)Z

    move-result p1

    goto :goto_0

    :cond_4
    move p1, v0

    :goto_0
    if-eqz p1, :cond_5

    invoke-virtual {p0, v2, p2}, Lj/g;->J0(Lj/g$q;Landroid/view/KeyEvent;)V

    goto :goto_2

    :cond_5
    move v0, v1

    goto :goto_2

    :cond_6
    :goto_1
    invoke-virtual {p0, v2, v0}, Lj/g;->Z(Lj/g$q;Z)V

    move v0, p1

    :goto_2
    if-eqz v0, :cond_8

    iget-object p1, p0, Lj/g;->k:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string p2, "audio"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/media/AudioManager;

    if-eqz p1, :cond_7

    invoke-virtual {p1, v1}, Landroid/media/AudioManager;->playSoundEffect(I)V

    return v0

    :cond_7
    const-string p1, "AppCompatDelegate"

    const-string p2, "Couldn\'t get audio manager"

    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_8
    return v0
.end method

.method public G(I)V
    .locals 2

    invoke-virtual {p0}, Lj/g;->h0()V

    iget-object v0, p0, Lj/g;->B:Landroid/view/ViewGroup;

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    iget-object v1, p0, Lj/g;->k:Landroid/content/Context;

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    iget-object p1, p0, Lj/g;->m:Lj/g$l;

    iget-object v0, p0, Lj/g;->l:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v0

    invoke-virtual {p1, v0}, Lj/g$l;->c(Landroid/view/Window$Callback;)V

    return-void
.end method

.method public G0(I)V
    .locals 1

    const/16 v0, 0x6c

    if-ne p1, v0, :cond_0

    invoke-virtual {p0}, Lj/g;->r()Lj/a;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lj/a;->h(Z)V

    :cond_0
    return-void
.end method

.method public H(Landroid/view/View;)V
    .locals 2

    invoke-virtual {p0}, Lj/g;->h0()V

    iget-object v0, p0, Lj/g;->B:Landroid/view/ViewGroup;

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object p1, p0, Lj/g;->m:Lj/g$l;

    iget-object v0, p0, Lj/g;->l:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v0

    invoke-virtual {p1, v0}, Lj/g$l;->c(Landroid/view/Window$Callback;)V

    return-void
.end method

.method public H0(I)V
    .locals 2

    const/16 v0, 0x6c

    const/4 v1, 0x0

    if-ne p1, v0, :cond_0

    invoke-virtual {p0}, Lj/g;->r()Lj/a;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1, v1}, Lj/a;->h(Z)V

    return-void

    :cond_0
    if-nez p1, :cond_1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lj/g;->q0(IZ)Lj/g$q;

    move-result-object p1

    iget-boolean v0, p1, Lj/g$q;->o:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0, p1, v1}, Lj/g;->Z(Lj/g$q;Z)V

    :cond_1
    return-void
.end method

.method public I(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 2

    invoke-virtual {p0}, Lj/g;->h0()V

    iget-object v0, p0, Lj/g;->B:Landroid/view/ViewGroup;

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p1, p0, Lj/g;->m:Lj/g$l;

    iget-object p2, p0, Lj/g;->l:Landroid/view/Window;

    invoke-virtual {p2}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object p2

    invoke-virtual {p1, p2}, Lj/g$l;->c(Landroid/view/Window$Callback;)V

    return-void
.end method

.method public I0(Landroid/view/ViewGroup;)V
    .locals 0

    return-void
.end method

.method public J(Landroid/window/OnBackInvokedDispatcher;)V
    .locals 2

    invoke-super {p0, p1}, Lj/e;->J(Landroid/window/OnBackInvokedDispatcher;)V

    iget-object v0, p0, Lj/g;->h0:Landroid/window/OnBackInvokedDispatcher;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lj/g;->i0:Landroid/window/OnBackInvokedCallback;

    if-eqz v1, :cond_0

    invoke-static {v0, v1}, Lj/g$k;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lj/g;->i0:Landroid/window/OnBackInvokedCallback;

    :cond_0
    if-nez p1, :cond_1

    iget-object v0, p0, Lj/g;->j:Ljava/lang/Object;

    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_1

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object p1, p0, Lj/g;->j:Ljava/lang/Object;

    check-cast p1, Landroid/app/Activity;

    invoke-static {p1}, Lj/g$k;->a(Landroid/app/Activity;)Landroid/window/OnBackInvokedDispatcher;

    move-result-object p1

    iput-object p1, p0, Lj/g;->h0:Landroid/window/OnBackInvokedDispatcher;

    goto :goto_0

    :cond_1
    iput-object p1, p0, Lj/g;->h0:Landroid/window/OnBackInvokedDispatcher;

    :goto_0
    invoke-virtual {p0}, Lj/g;->a1()V

    return-void
.end method

.method public final J0(Lj/g$q;Landroid/view/KeyEvent;)V
    .locals 11

    iget-boolean v0, p1, Lj/g$q;->o:Z

    if-nez v0, :cond_e

    iget-boolean v0, p0, Lj/g;->R:Z

    if-eqz v0, :cond_0

    goto/16 :goto_3

    :cond_0
    iget v0, p1, Lj/g$q;->a:I

    if-nez v0, :cond_1

    iget-object v0, p0, Lj/g;->k:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit8 v0, v0, 0xf

    const/4 v1, 0x4

    if-ne v0, v1, :cond_1

    return-void

    :cond_1
    invoke-virtual {p0}, Lj/g;->s0()Landroid/view/Window$Callback;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    iget v2, p1, Lj/g$q;->a:I

    iget-object v3, p1, Lj/g$q;->j:Landroidx/appcompat/view/menu/e;

    invoke-interface {v0, v2, v3}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0, p1, v1}, Lj/g;->Z(Lj/g$q;Z)V

    return-void

    :cond_2
    iget-object v0, p0, Lj/g;->k:Landroid/content/Context;

    const-string v2, "window"

    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    if-nez v0, :cond_3

    goto/16 :goto_3

    :cond_3
    invoke-virtual {p0, p1, p2}, Lj/g;->M0(Lj/g$q;Landroid/view/KeyEvent;)Z

    move-result p2

    if-nez p2, :cond_4

    goto/16 :goto_3

    :cond_4
    iget-object p2, p1, Lj/g$q;->g:Landroid/view/ViewGroup;

    const/4 v2, -0x2

    if-eqz p2, :cond_6

    iget-boolean v3, p1, Lj/g$q;->q:Z

    if-eqz v3, :cond_5

    goto :goto_0

    :cond_5
    iget-object p2, p1, Lj/g$q;->i:Landroid/view/View;

    if-eqz p2, :cond_c

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    if-eqz p2, :cond_c

    iget p2, p2, Landroid/view/ViewGroup$LayoutParams;->width:I

    const/4 v3, -0x1

    if-ne p2, v3, :cond_c

    move v4, v3

    goto :goto_1

    :cond_6
    :goto_0
    if-nez p2, :cond_7

    invoke-virtual {p0, p1}, Lj/g;->v0(Lj/g$q;)Z

    move-result p2

    if-eqz p2, :cond_e

    iget-object p2, p1, Lj/g$q;->g:Landroid/view/ViewGroup;

    if-nez p2, :cond_8

    goto/16 :goto_3

    :cond_7
    iget-boolean v3, p1, Lj/g$q;->q:Z

    if-eqz v3, :cond_8

    invoke-virtual {p2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p2

    if-lez p2, :cond_8

    iget-object p2, p1, Lj/g$q;->g:Landroid/view/ViewGroup;

    invoke-virtual {p2}, Landroid/view/ViewGroup;->removeAllViews()V

    :cond_8
    invoke-virtual {p0, p1}, Lj/g;->u0(Lj/g$q;)Z

    move-result p2

    if-eqz p2, :cond_d

    invoke-virtual {p1}, Lj/g$q;->b()Z

    move-result p2

    if-nez p2, :cond_9

    goto :goto_2

    :cond_9
    iget-object p2, p1, Lj/g$q;->h:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    if-nez p2, :cond_a

    new-instance p2, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {p2, v2, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    :cond_a
    iget v3, p1, Lj/g$q;->b:I

    iget-object v4, p1, Lj/g$q;->g:Landroid/view/ViewGroup;

    invoke-virtual {v4, v3}, Landroid/view/View;->setBackgroundResource(I)V

    iget-object v3, p1, Lj/g$q;->h:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    instance-of v4, v3, Landroid/view/ViewGroup;

    if-eqz v4, :cond_b

    check-cast v3, Landroid/view/ViewGroup;

    iget-object v4, p1, Lj/g$q;->h:Landroid/view/View;

    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_b
    iget-object v3, p1, Lj/g$q;->g:Landroid/view/ViewGroup;

    iget-object v4, p1, Lj/g$q;->h:Landroid/view/View;

    invoke-virtual {v3, v4, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p2, p1, Lj/g$q;->h:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->hasFocus()Z

    move-result p2

    if-nez p2, :cond_c

    iget-object p2, p1, Lj/g$q;->h:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->requestFocus()Z

    :cond_c
    move v4, v2

    :goto_1
    const/4 p2, 0x0

    iput-boolean p2, p1, Lj/g$q;->n:Z

    new-instance v3, Landroid/view/WindowManager$LayoutParams;

    iget v6, p1, Lj/g$q;->d:I

    iget v7, p1, Lj/g$q;->e:I

    const/high16 v9, 0x820000

    const/4 v10, -0x3

    const/4 v5, -0x2

    const/16 v8, 0x3ea

    invoke-direct/range {v3 .. v10}, Landroid/view/WindowManager$LayoutParams;-><init>(IIIIIII)V

    iget p2, p1, Lj/g$q;->c:I

    iput p2, v3, Landroid/view/WindowManager$LayoutParams;->gravity:I

    iget p2, p1, Lj/g$q;->f:I

    iput p2, v3, Landroid/view/WindowManager$LayoutParams;->windowAnimations:I

    iget-object p2, p1, Lj/g$q;->g:Landroid/view/ViewGroup;

    invoke-interface {v0, p2, v3}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iput-boolean v1, p1, Lj/g$q;->o:Z

    iget p1, p1, Lj/g$q;->a:I

    if-nez p1, :cond_e

    invoke-virtual {p0}, Lj/g;->a1()V

    return-void

    :cond_d
    :goto_2
    iput-boolean v1, p1, Lj/g$q;->q:Z

    :cond_e
    :goto_3
    return-void
.end method

.method public K(I)V
    .locals 0

    iput p1, p0, Lj/g;->U:I

    return-void
.end method

.method public final K0()Lj/a;
    .locals 1

    iget-object v0, p0, Lj/g;->o:Lj/a;

    return-object v0
.end method

.method public final L(Ljava/lang/CharSequence;)V
    .locals 1

    iput-object p1, p0, Lj/g;->q:Ljava/lang/CharSequence;

    iget-object v0, p0, Lj/g;->r:Lq/e0;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lq/e0;->setWindowTitle(Ljava/lang/CharSequence;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lj/g;->K0()Lj/a;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lj/g;->K0()Lj/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lj/a;->t(Ljava/lang/CharSequence;)V

    return-void

    :cond_1
    iget-object v0, p0, Lj/g;->C:Landroid/widget/TextView;

    if-eqz v0, :cond_2

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_2
    return-void
.end method

.method public final L0(Lj/g$q;ILandroid/view/KeyEvent;I)Z
    .locals 2

    invoke-virtual {p3}, Landroid/view/KeyEvent;->isSystem()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-boolean v0, p1, Lj/g$q;->m:Z

    if-nez v0, :cond_1

    invoke-virtual {p0, p1, p3}, Lj/g;->M0(Lj/g$q;Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    iget-object v0, p1, Lj/g$q;->j:Landroidx/appcompat/view/menu/e;

    if-eqz v0, :cond_2

    invoke-virtual {v0, p2, p3, p4}, Landroidx/appcompat/view/menu/e;->performShortcut(ILandroid/view/KeyEvent;I)Z

    move-result v1

    :cond_2
    if-eqz v1, :cond_3

    const/4 p2, 0x1

    and-int/lit8 p3, p4, 0x1

    if-nez p3, :cond_3

    iget-object p3, p0, Lj/g;->r:Lq/e0;

    if-nez p3, :cond_3

    invoke-virtual {p0, p1, p2}, Lj/g;->Z(Lj/g$q;Z)V

    :cond_3
    return v1
.end method

.method public final M0(Lj/g$q;Landroid/view/KeyEvent;)Z
    .locals 8

    iget-boolean v0, p0, Lj/g;->R:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-boolean v0, p1, Lj/g$q;->m:Z

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    return v2

    :cond_1
    iget-object v0, p0, Lj/g;->N:Lj/g$q;

    if-eqz v0, :cond_2

    if-eq v0, p1, :cond_2

    invoke-virtual {p0, v0, v1}, Lj/g;->Z(Lj/g$q;Z)V

    :cond_2
    invoke-virtual {p0}, Lj/g;->s0()Landroid/view/Window$Callback;

    move-result-object v0

    if-eqz v0, :cond_3

    iget v3, p1, Lj/g$q;->a:I

    invoke-interface {v0, v3}, Landroid/view/Window$Callback;->onCreatePanelView(I)Landroid/view/View;

    move-result-object v3

    iput-object v3, p1, Lj/g$q;->i:Landroid/view/View;

    :cond_3
    iget v3, p1, Lj/g$q;->a:I

    if-eqz v3, :cond_5

    const/16 v4, 0x6c

    if-ne v3, v4, :cond_4

    goto :goto_0

    :cond_4
    move v3, v1

    goto :goto_1

    :cond_5
    :goto_0
    move v3, v2

    :goto_1
    if-eqz v3, :cond_6

    iget-object v4, p0, Lj/g;->r:Lq/e0;

    if-eqz v4, :cond_6

    invoke-interface {v4}, Lq/e0;->f()V

    :cond_6
    iget-object v4, p1, Lj/g$q;->i:Landroid/view/View;

    if-nez v4, :cond_15

    if-eqz v3, :cond_7

    invoke-virtual {p0}, Lj/g;->K0()Lj/a;

    :cond_7
    iget-object v4, p1, Lj/g$q;->j:Landroidx/appcompat/view/menu/e;

    const/4 v5, 0x0

    if-eqz v4, :cond_8

    iget-boolean v6, p1, Lj/g$q;->r:Z

    if-eqz v6, :cond_f

    :cond_8
    if-nez v4, :cond_a

    invoke-virtual {p0, p1}, Lj/g;->w0(Lj/g$q;)Z

    move-result v4

    if-eqz v4, :cond_9

    iget-object v4, p1, Lj/g$q;->j:Landroidx/appcompat/view/menu/e;

    if-nez v4, :cond_a

    :cond_9
    return v1

    :cond_a
    if-eqz v3, :cond_c

    iget-object v4, p0, Lj/g;->r:Lq/e0;

    if-eqz v4, :cond_c

    iget-object v4, p0, Lj/g;->s:Lj/g$f;

    if-nez v4, :cond_b

    new-instance v4, Lj/g$f;

    invoke-direct {v4, p0}, Lj/g$f;-><init>(Lj/g;)V

    iput-object v4, p0, Lj/g;->s:Lj/g$f;

    :cond_b
    iget-object v4, p0, Lj/g;->r:Lq/e0;

    iget-object v6, p1, Lj/g$q;->j:Landroidx/appcompat/view/menu/e;

    iget-object v7, p0, Lj/g;->s:Lj/g$f;

    invoke-interface {v4, v6, v7}, Lq/e0;->d(Landroid/view/Menu;Landroidx/appcompat/view/menu/i$a;)V

    :cond_c
    iget-object v4, p1, Lj/g$q;->j:Landroidx/appcompat/view/menu/e;

    invoke-virtual {v4}, Landroidx/appcompat/view/menu/e;->e0()V

    iget v4, p1, Lj/g$q;->a:I

    iget-object v6, p1, Lj/g$q;->j:Landroidx/appcompat/view/menu/e;

    invoke-interface {v0, v4, v6}, Landroid/view/Window$Callback;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    move-result v4

    if-nez v4, :cond_e

    invoke-virtual {p1, v5}, Lj/g$q;->c(Landroidx/appcompat/view/menu/e;)V

    if-eqz v3, :cond_d

    iget-object p1, p0, Lj/g;->r:Lq/e0;

    if-eqz p1, :cond_d

    iget-object p2, p0, Lj/g;->s:Lj/g$f;

    invoke-interface {p1, v5, p2}, Lq/e0;->d(Landroid/view/Menu;Landroidx/appcompat/view/menu/i$a;)V

    :cond_d
    return v1

    :cond_e
    iput-boolean v1, p1, Lj/g$q;->r:Z

    :cond_f
    iget-object v4, p1, Lj/g$q;->j:Landroidx/appcompat/view/menu/e;

    invoke-virtual {v4}, Landroidx/appcompat/view/menu/e;->e0()V

    iget-object v4, p1, Lj/g$q;->s:Landroid/os/Bundle;

    if-eqz v4, :cond_10

    iget-object v6, p1, Lj/g$q;->j:Landroidx/appcompat/view/menu/e;

    invoke-virtual {v6, v4}, Landroidx/appcompat/view/menu/e;->Q(Landroid/os/Bundle;)V

    iput-object v5, p1, Lj/g$q;->s:Landroid/os/Bundle;

    :cond_10
    iget-object v4, p1, Lj/g$q;->i:Landroid/view/View;

    iget-object v6, p1, Lj/g$q;->j:Landroidx/appcompat/view/menu/e;

    invoke-interface {v0, v1, v4, v6}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result v0

    if-nez v0, :cond_12

    if-eqz v3, :cond_11

    iget-object p2, p0, Lj/g;->r:Lq/e0;

    if-eqz p2, :cond_11

    iget-object v0, p0, Lj/g;->s:Lj/g$f;

    invoke-interface {p2, v5, v0}, Lq/e0;->d(Landroid/view/Menu;Landroidx/appcompat/view/menu/i$a;)V

    :cond_11
    iget-object p1, p1, Lj/g$q;->j:Landroidx/appcompat/view/menu/e;

    invoke-virtual {p1}, Landroidx/appcompat/view/menu/e;->d0()V

    return v1

    :cond_12
    if-eqz p2, :cond_13

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getDeviceId()I

    move-result p2

    goto :goto_2

    :cond_13
    const/4 p2, -0x1

    :goto_2
    invoke-static {p2}, Landroid/view/KeyCharacterMap;->load(I)Landroid/view/KeyCharacterMap;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/KeyCharacterMap;->getKeyboardType()I

    move-result p2

    if-eq p2, v2, :cond_14

    move p2, v2

    goto :goto_3

    :cond_14
    move p2, v1

    :goto_3
    iput-boolean p2, p1, Lj/g$q;->p:Z

    iget-object v0, p1, Lj/g$q;->j:Landroidx/appcompat/view/menu/e;

    invoke-virtual {v0, p2}, Landroidx/appcompat/view/menu/e;->setQwertyMode(Z)V

    iget-object p2, p1, Lj/g$q;->j:Landroidx/appcompat/view/menu/e;

    invoke-virtual {p2}, Landroidx/appcompat/view/menu/e;->d0()V

    :cond_15
    iput-boolean v2, p1, Lj/g$q;->m:Z

    iput-boolean v1, p1, Lj/g$q;->n:Z

    iput-object p1, p0, Lj/g;->N:Lj/g$q;

    return v2
.end method

.method public final N0(Z)V
    .locals 5

    iget-object v0, p0, Lj/g;->r:Lq/e0;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_5

    invoke-interface {v0}, Lq/e0;->a()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lj/g;->k:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->hasPermanentMenuKey()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lj/g;->r:Lq/e0;

    invoke-interface {v0}, Lq/e0;->g()Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_0
    invoke-virtual {p0}, Lj/g;->s0()Landroid/view/Window$Callback;

    move-result-object v0

    iget-object v3, p0, Lj/g;->r:Lq/e0;

    invoke-interface {v3}, Lq/e0;->e()Z

    move-result v3

    const/16 v4, 0x6c

    if-eqz v3, :cond_2

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lj/g;->r:Lq/e0;

    invoke-interface {p1}, Lq/e0;->b()Z

    iget-boolean p1, p0, Lj/g;->R:Z

    if-nez p1, :cond_4

    invoke-virtual {p0, v2, v1}, Lj/g;->q0(IZ)Lj/g$q;

    move-result-object p1

    iget-object p1, p1, Lj/g$q;->j:Landroidx/appcompat/view/menu/e;

    invoke-interface {v0, v4, p1}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    return-void

    :cond_2
    :goto_0
    if-eqz v0, :cond_4

    iget-boolean p1, p0, Lj/g;->R:Z

    if-nez p1, :cond_4

    iget-boolean p1, p0, Lj/g;->Z:Z

    if-eqz p1, :cond_3

    iget p1, p0, Lj/g;->a0:I

    and-int/2addr p1, v1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lj/g;->l:Landroid/view/Window;

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    iget-object v3, p0, Lj/g;->b0:Ljava/lang/Runnable;

    invoke-virtual {p1, v3}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object p1, p0, Lj/g;->b0:Ljava/lang/Runnable;

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    :cond_3
    invoke-virtual {p0, v2, v1}, Lj/g;->q0(IZ)Lj/g$q;

    move-result-object p1

    iget-object v1, p1, Lj/g$q;->j:Landroidx/appcompat/view/menu/e;

    if-eqz v1, :cond_4

    iget-boolean v3, p1, Lj/g$q;->r:Z

    if-nez v3, :cond_4

    iget-object v3, p1, Lj/g$q;->i:Landroid/view/View;

    invoke-interface {v0, v2, v3, v1}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object p1, p1, Lj/g$q;->j:Landroidx/appcompat/view/menu/e;

    invoke-interface {v0, v4, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    iget-object p1, p0, Lj/g;->r:Lq/e0;

    invoke-interface {p1}, Lq/e0;->c()Z

    :cond_4
    return-void

    :cond_5
    invoke-virtual {p0, v2, v1}, Lj/g;->q0(IZ)Lj/g$q;

    move-result-object p1

    iput-boolean v1, p1, Lj/g$q;->q:Z

    invoke-virtual {p0, p1, v2}, Lj/g;->Z(Lj/g$q;Z)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lj/g;->J0(Lj/g$q;Landroid/view/KeyEvent;)V

    return-void
.end method

.method public final O(Z)Z
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lj/g;->P(ZZ)Z

    move-result p1

    return p1
.end method

.method public final O0(I)I
    .locals 2

    const/16 v0, 0x8

    const-string v1, "AppCompatDelegate"

    if-ne p1, v0, :cond_0

    const-string p1, "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature."

    invoke-static {v1, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const/16 p1, 0x6c

    return p1

    :cond_0
    const/16 v0, 0x9

    if-ne p1, v0, :cond_1

    const-string p1, "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature."

    invoke-static {v1, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const/16 p1, 0x6d

    :cond_1
    return p1
.end method

.method public final P(ZZ)Z
    .locals 4

    iget-boolean v0, p0, Lj/g;->R:Z

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p0}, Lj/g;->U()I

    move-result v0

    iget-object v1, p0, Lj/g;->k:Landroid/content/Context;

    invoke-virtual {p0, v1, v0}, Lj/g;->z0(Landroid/content/Context;I)I

    move-result v1

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x21

    if-ge v2, v3, :cond_1

    iget-object v2, p0, Lj/g;->k:Landroid/content/Context;

    invoke-virtual {p0, v2}, Lj/g;->T(Landroid/content/Context;)Lu2/j;

    move-result-object v2

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    if-nez p2, :cond_2

    if-eqz v2, :cond_2

    iget-object p2, p0, Lj/g;->k:Landroid/content/Context;

    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p2

    invoke-virtual {p0, p2}, Lj/g;->p0(Landroid/content/res/Configuration;)Lu2/j;

    move-result-object v2

    :cond_2
    invoke-virtual {p0, v1, v2, p1}, Lj/g;->Z0(ILu2/j;Z)Z

    move-result p1

    if-nez v0, :cond_3

    iget-object p2, p0, Lj/g;->k:Landroid/content/Context;

    invoke-virtual {p0, p2}, Lj/g;->o0(Landroid/content/Context;)Lj/g$n;

    move-result-object p2

    invoke-virtual {p2}, Lj/g$n;->e()V

    goto :goto_1

    :cond_3
    iget-object p2, p0, Lj/g;->X:Lj/g$n;

    if-eqz p2, :cond_4

    invoke-virtual {p2}, Lj/g$n;->a()V

    :cond_4
    :goto_1
    const/4 p2, 0x3

    if-ne v0, p2, :cond_5

    iget-object p2, p0, Lj/g;->k:Landroid/content/Context;

    invoke-virtual {p0, p2}, Lj/g;->n0(Landroid/content/Context;)Lj/g$n;

    move-result-object p2

    invoke-virtual {p2}, Lj/g$n;->e()V

    return p1

    :cond_5
    iget-object p2, p0, Lj/g;->Y:Lj/g$n;

    if-eqz p2, :cond_6

    invoke-virtual {p2}, Lj/g$n;->a()V

    :cond_6
    return p1
.end method

.method public P0(Landroid/content/res/Configuration;Lu2/j;)V
    .locals 0
    .param p2    # Lu2/j;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p1, p2}, Lj/g$i;->d(Landroid/content/res/Configuration;Lu2/j;)V

    return-void
.end method

.method public Q()Z
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lj/g;->O(Z)Z

    move-result v0

    return v0
.end method

.method public Q0(Lu2/j;)V
    .locals 0

    invoke-static {p1}, Lj/g$i;->c(Lu2/j;)V

    return-void
.end method

.method public final R()V
    .locals 5

    iget-object v0, p0, Lj/g;->B:Landroid/view/ViewGroup;

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/ContentFrameLayout;

    iget-object v1, p0, Lj/g;->l:Landroid/view/Window;

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getPaddingLeft()I

    move-result v2

    invoke-virtual {v1}, Landroid/view/View;->getPaddingTop()I

    move-result v3

    invoke-virtual {v1}, Landroid/view/View;->getPaddingRight()I

    move-result v4

    invoke-virtual {v1}, Landroid/view/View;->getPaddingBottom()I

    move-result v1

    invoke-virtual {v0, v2, v3, v4, v1}, Landroidx/appcompat/widget/ContentFrameLayout;->a(IIII)V

    iget-object v1, p0, Lj/g;->k:Landroid/content/Context;

    sget-object v2, Li/j;->A0:[I

    invoke-virtual {v1, v2}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v1

    sget v2, Li/j;->M0:I

    invoke-virtual {v0}, Landroidx/appcompat/widget/ContentFrameLayout;->getMinWidthMajor()Landroid/util/TypedValue;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    sget v2, Li/j;->N0:I

    invoke-virtual {v0}, Landroidx/appcompat/widget/ContentFrameLayout;->getMinWidthMinor()Landroid/util/TypedValue;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    sget v2, Li/j;->K0:I

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v0}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedWidthMajor()Landroid/util/TypedValue;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    :cond_0
    sget v2, Li/j;->L0:I

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v0}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedWidthMinor()Landroid/util/TypedValue;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    :cond_1
    sget v2, Li/j;->I0:I

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v0}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedHeightMajor()Landroid/util/TypedValue;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    :cond_2
    sget v2, Li/j;->J0:I

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {v0}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedHeightMinor()Landroid/util/TypedValue;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    :cond_3
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public final R0()Z
    .locals 1

    iget-boolean v0, p0, Lj/g;->A:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lj/g;->B:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->isLaidOut()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final S(Landroid/view/Window;)V
    .locals 3
    .param p1    # Landroid/view/Window;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lj/g;->l:Landroid/view/Window;

    const-string v1, "AppCompat has already installed itself into the Window"

    if-nez v0, :cond_3

    invoke-virtual {p1}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v0

    instance-of v2, v0, Lj/g$l;

    if-nez v2, :cond_2

    new-instance v1, Lj/g$l;

    invoke-direct {v1, p0, v0}, Lj/g$l;-><init>(Lj/g;Landroid/view/Window$Callback;)V

    iput-object v1, p0, Lj/g;->m:Lj/g$l;

    invoke-virtual {p1, v1}, Landroid/view/Window;->setCallback(Landroid/view/Window$Callback;)V

    iget-object v0, p0, Lj/g;->k:Landroid/content/Context;

    sget-object v1, Lj/g;->l0:[I

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lq/a1;->u(Landroid/content/Context;Landroid/util/AttributeSet;[I)Lq/a1;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lq/a1;->h(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p1, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    invoke-virtual {v0}, Lq/a1;->x()V

    iput-object p1, p0, Lj/g;->l:Landroid/view/Window;

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x21

    if-lt p1, v0, :cond_1

    iget-object p1, p0, Lj/g;->h0:Landroid/window/OnBackInvokedDispatcher;

    if-nez p1, :cond_1

    invoke-virtual {p0, v2}, Lj/g;->J(Landroid/window/OnBackInvokedDispatcher;)V

    :cond_1
    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final S0(Landroid/view/ViewParent;)Z
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    iget-object v1, p0, Lj/g;->l:Landroid/view/Window;

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    :goto_0
    if-nez p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    if-eq p1, v1, :cond_3

    instance-of v2, p1, Landroid/view/View;

    if-eqz v2, :cond_3

    move-object v2, p1

    check-cast v2, Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    invoke-interface {p1}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    goto :goto_0

    :cond_3
    :goto_1
    return v0
.end method

.method public T(Landroid/content/Context;)Lu2/j;
    .locals 3
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    const/4 v2, 0x0

    if-lt v0, v1, :cond_0

    return-object v2

    :cond_0
    invoke-static {}, Lj/e;->q()Lu2/j;

    move-result-object v0

    if-nez v0, :cond_1

    return-object v2

    :cond_1
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p1

    invoke-virtual {p0, p1}, Lj/g;->p0(Landroid/content/res/Configuration;)Lu2/j;

    move-result-object p1

    invoke-static {v0, p1}, Lj/q;->b(Lu2/j;Lu2/j;)Lu2/j;

    move-result-object v0

    invoke-virtual {v0}, Lu2/j;->e()Z

    move-result v1

    if-eqz v1, :cond_2

    return-object p1

    :cond_2
    return-object v0
.end method

.method public T0()Z
    .locals 3

    iget-object v0, p0, Lj/g;->h0:Landroid/window/OnBackInvokedDispatcher;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0, v1, v1}, Lj/g;->q0(IZ)Lj/g$q;

    move-result-object v0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    iget-boolean v0, v0, Lj/g$q;->o:Z

    if-eqz v0, :cond_1

    return v2

    :cond_1
    iget-object v0, p0, Lj/g;->u:Lo/b;

    if-eqz v0, :cond_2

    return v2

    :cond_2
    return v1
.end method

.method public final U()I
    .locals 2

    iget v0, p0, Lj/g;->T:I

    const/16 v1, -0x64

    if-eq v0, v1, :cond_0

    return v0

    :cond_0
    invoke-static {}, Lj/e;->m()I

    move-result v0

    return v0
.end method

.method public U0(Lo/b$a;)Lo/b;
    .locals 2
    .param p1    # Lo/b$a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    if-eqz p1, :cond_3

    iget-object v0, p0, Lj/g;->u:Lo/b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lo/b;->c()V

    :cond_0
    new-instance v0, Lj/g$g;

    invoke-direct {v0, p0, p1}, Lj/g$g;-><init>(Lj/g;Lo/b$a;)V

    invoke-virtual {p0}, Lj/g;->r()Lj/a;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1, v0}, Lj/a;->u(Lo/b$a;)Lo/b;

    move-result-object p1

    iput-object p1, p0, Lj/g;->u:Lo/b;

    if-eqz p1, :cond_1

    iget-object v1, p0, Lj/g;->n:Lj/c;

    if-eqz v1, :cond_1

    invoke-interface {v1, p1}, Lj/c;->x(Lo/b;)V

    :cond_1
    iget-object p1, p0, Lj/g;->u:Lo/b;

    if-nez p1, :cond_2

    invoke-virtual {p0, v0}, Lj/g;->V0(Lo/b$a;)Lo/b;

    move-result-object p1

    iput-object p1, p0, Lj/g;->u:Lo/b;

    :cond_2
    invoke-virtual {p0}, Lj/g;->a1()V

    iget-object p1, p0, Lj/g;->u:Lo/b;

    return-object p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "ActionMode callback can not be null."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public V(ILj/g$q;Landroid/view/Menu;)V
    .locals 2

    if-nez p3, :cond_1

    if-nez p2, :cond_0

    if-ltz p1, :cond_0

    iget-object v0, p0, Lj/g;->M:[Lj/g$q;

    array-length v1, v0

    if-ge p1, v1, :cond_0

    aget-object p2, v0, p1

    :cond_0
    if-eqz p2, :cond_1

    iget-object p3, p2, Lj/g$q;->j:Landroidx/appcompat/view/menu/e;

    :cond_1
    if-eqz p2, :cond_2

    iget-boolean p2, p2, Lj/g$q;->o:Z

    if-nez p2, :cond_2

    goto :goto_0

    :cond_2
    iget-boolean p2, p0, Lj/g;->R:Z

    if-nez p2, :cond_3

    iget-object p2, p0, Lj/g;->m:Lj/g$l;

    iget-object v0, p0, Lj/g;->l:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v0

    invoke-virtual {p2, v0, p1, p3}, Lj/g$l;->d(Landroid/view/Window$Callback;ILandroid/view/Menu;)V

    :cond_3
    :goto_0
    return-void
.end method

.method public V0(Lo/b$a;)Lo/b;
    .locals 7
    .param p1    # Lo/b$a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p0}, Lj/g;->g0()V

    iget-object v0, p0, Lj/g;->u:Lo/b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lo/b;->c()V

    :cond_0
    instance-of v0, p1, Lj/g$g;

    if-nez v0, :cond_1

    new-instance v0, Lj/g$g;

    invoke-direct {v0, p0, p1}, Lj/g$g;-><init>(Lj/g;Lo/b$a;)V

    move-object p1, v0

    :cond_1
    iget-object v0, p0, Lj/g;->n:Lj/c;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-boolean v2, p0, Lj/g;->R:Z

    if-nez v2, :cond_2

    :try_start_0
    invoke-interface {v0, p1}, Lj/c;->s(Lo/b$a;)Lo/b;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_2
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_3

    iput-object v0, p0, Lj/g;->u:Lo/b;

    goto/16 :goto_5

    :cond_3
    iget-object v0, p0, Lj/g;->v:Landroidx/appcompat/widget/ActionBarContextView;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v0, :cond_6

    iget-boolean v0, p0, Lj/g;->J:Z

    if-eqz v0, :cond_5

    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    iget-object v4, p0, Lj/g;->k:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v4

    sget v5, Li/a;->f:I

    invoke-virtual {v4, v5, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget v5, v0, Landroid/util/TypedValue;->resourceId:I

    if-eqz v5, :cond_4

    iget-object v5, p0, Lj/g;->k:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    move-result-object v5

    invoke-virtual {v5, v4}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    iget v4, v0, Landroid/util/TypedValue;->resourceId:I

    invoke-virtual {v5, v4, v3}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    new-instance v4, Lo/d;

    iget-object v6, p0, Lj/g;->k:Landroid/content/Context;

    invoke-direct {v4, v6, v2}, Lo/d;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v4}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v6

    invoke-virtual {v6, v5}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    goto :goto_1

    :cond_4
    iget-object v4, p0, Lj/g;->k:Landroid/content/Context;

    :goto_1
    new-instance v5, Landroidx/appcompat/widget/ActionBarContextView;

    invoke-direct {v5, v4}, Landroidx/appcompat/widget/ActionBarContextView;-><init>(Landroid/content/Context;)V

    iput-object v5, p0, Lj/g;->v:Landroidx/appcompat/widget/ActionBarContextView;

    new-instance v5, Landroid/widget/PopupWindow;

    sget v6, Li/a;->i:I

    invoke-direct {v5, v4, v1, v6}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    iput-object v5, p0, Lj/g;->w:Landroid/widget/PopupWindow;

    const/4 v6, 0x2

    invoke-static {v5, v6}, Ld3/h;->b(Landroid/widget/PopupWindow;I)V

    iget-object v5, p0, Lj/g;->w:Landroid/widget/PopupWindow;

    iget-object v6, p0, Lj/g;->v:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v5, v6}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    iget-object v5, p0, Lj/g;->w:Landroid/widget/PopupWindow;

    const/4 v6, -0x1

    invoke-virtual {v5, v6}, Landroid/widget/PopupWindow;->setWidth(I)V

    invoke-virtual {v4}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v5

    sget v6, Li/a;->b:I

    invoke-virtual {v5, v6, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget v0, v0, Landroid/util/TypedValue;->data:I

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v4

    invoke-static {v0, v4}, Landroid/util/TypedValue;->complexToDimensionPixelSize(ILandroid/util/DisplayMetrics;)I

    move-result v0

    iget-object v4, p0, Lj/g;->v:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v4, v0}, Landroidx/appcompat/widget/ActionBarContextView;->setContentHeight(I)V

    iget-object v0, p0, Lj/g;->w:Landroid/widget/PopupWindow;

    const/4 v4, -0x2

    invoke-virtual {v0, v4}, Landroid/widget/PopupWindow;->setHeight(I)V

    new-instance v0, Lj/g$d;

    invoke-direct {v0, p0}, Lj/g$d;-><init>(Lj/g;)V

    iput-object v0, p0, Lj/g;->x:Ljava/lang/Runnable;

    goto :goto_2

    :cond_5
    iget-object v0, p0, Lj/g;->B:Landroid/view/ViewGroup;

    sget v4, Li/f;->h:I

    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/ViewStubCompat;

    if-eqz v0, :cond_6

    invoke-virtual {p0}, Lj/g;->l0()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroidx/appcompat/widget/ViewStubCompat;->setLayoutInflater(Landroid/view/LayoutInflater;)V

    invoke-virtual {v0}, Landroidx/appcompat/widget/ViewStubCompat;->a()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/ActionBarContextView;

    iput-object v0, p0, Lj/g;->v:Landroidx/appcompat/widget/ActionBarContextView;

    :cond_6
    :goto_2
    iget-object v0, p0, Lj/g;->v:Landroidx/appcompat/widget/ActionBarContextView;

    if-eqz v0, :cond_b

    invoke-virtual {p0}, Lj/g;->g0()V

    iget-object v0, p0, Lj/g;->v:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarContextView;->k()V

    new-instance v0, Lo/e;

    iget-object v4, p0, Lj/g;->v:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    iget-object v5, p0, Lj/g;->v:Landroidx/appcompat/widget/ActionBarContextView;

    iget-object v6, p0, Lj/g;->w:Landroid/widget/PopupWindow;

    if-nez v6, :cond_7

    goto :goto_3

    :cond_7
    move v3, v2

    :goto_3
    invoke-direct {v0, v4, v5, p1, v3}, Lo/e;-><init>(Landroid/content/Context;Landroidx/appcompat/widget/ActionBarContextView;Lo/b$a;Z)V

    invoke-virtual {v0}, Lo/b;->e()Landroid/view/Menu;

    move-result-object v3

    invoke-interface {p1, v0, v3}, Lo/b$a;->a(Lo/b;Landroid/view/Menu;)Z

    move-result p1

    if-eqz p1, :cond_a

    invoke-virtual {v0}, Lo/b;->k()V

    iget-object p1, p0, Lj/g;->v:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContextView;->h(Lo/b;)V

    iput-object v0, p0, Lj/g;->u:Lo/b;

    invoke-virtual {p0}, Lj/g;->R0()Z

    move-result p1

    const/high16 v0, 0x3f800000    # 1.0f

    if-eqz p1, :cond_8

    iget-object p1, p0, Lj/g;->v:Landroidx/appcompat/widget/ActionBarContextView;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Landroid/view/View;->setAlpha(F)V

    iget-object p1, p0, Lj/g;->v:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-static {p1}, Landroidx/core/view/o0;->e(Landroid/view/View;)Landroidx/core/view/y0;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroidx/core/view/y0;->b(F)Landroidx/core/view/y0;

    move-result-object p1

    iput-object p1, p0, Lj/g;->y:Landroidx/core/view/y0;

    new-instance v0, Lj/g$e;

    invoke-direct {v0, p0}, Lj/g$e;-><init>(Lj/g;)V

    invoke-virtual {p1, v0}, Landroidx/core/view/y0;->g(Landroidx/core/view/z0;)Landroidx/core/view/y0;

    goto :goto_4

    :cond_8
    iget-object p1, p0, Lj/g;->v:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    iget-object p1, p0, Lj/g;->v:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1, v2}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    iget-object p1, p0, Lj/g;->v:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    instance-of p1, p1, Landroid/view/View;

    if-eqz p1, :cond_9

    iget-object p1, p0, Lj/g;->v:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    invoke-static {p1}, Landroidx/core/view/o0;->j0(Landroid/view/View;)V

    :cond_9
    :goto_4
    iget-object p1, p0, Lj/g;->w:Landroid/widget/PopupWindow;

    if-eqz p1, :cond_b

    iget-object p1, p0, Lj/g;->l:Landroid/view/Window;

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    iget-object v0, p0, Lj/g;->x:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto :goto_5

    :cond_a
    iput-object v1, p0, Lj/g;->u:Lo/b;

    :cond_b
    :goto_5
    iget-object p1, p0, Lj/g;->u:Lo/b;

    if-eqz p1, :cond_c

    iget-object v0, p0, Lj/g;->n:Lj/c;

    if-eqz v0, :cond_c

    invoke-interface {v0, p1}, Lj/c;->x(Lo/b;)V

    :cond_c
    invoke-virtual {p0}, Lj/g;->a1()V

    iget-object p1, p0, Lj/g;->u:Lo/b;

    return-object p1
.end method

.method public W(Landroidx/appcompat/view/menu/e;)V
    .locals 2
    .param p1    # Landroidx/appcompat/view/menu/e;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-boolean v0, p0, Lj/g;->L:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lj/g;->L:Z

    iget-object v0, p0, Lj/g;->r:Lq/e0;

    invoke-interface {v0}, Lq/e0;->l()V

    invoke-virtual {p0}, Lj/g;->s0()Landroid/view/Window$Callback;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-boolean v1, p0, Lj/g;->R:Z

    if-nez v1, :cond_1

    const/16 v1, 0x6c

    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    :cond_1
    const/4 p1, 0x0

    iput-boolean p1, p0, Lj/g;->L:Z

    return-void
.end method

.method public final W0()V
    .locals 2

    iget-boolean v0, p0, Lj/g;->A:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Landroid/util/AndroidRuntimeException;

    const-string v1, "Window feature must be requested before adding content"

    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final X()V
    .locals 1

    iget-object v0, p0, Lj/g;->X:Lj/g$n;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lj/g$n;->a()V

    :cond_0
    iget-object v0, p0, Lj/g;->Y:Lj/g$n;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lj/g$n;->a()V

    :cond_1
    return-void
.end method

.method public final X0()Lj/b;
    .locals 3

    iget-object v0, p0, Lj/g;->k:Landroid/content/Context;

    :goto_0
    const/4 v1, 0x0

    if-eqz v0, :cond_1

    instance-of v2, v0, Lj/b;

    if-eqz v2, :cond_0

    check-cast v0, Lj/b;

    return-object v0

    :cond_0
    instance-of v2, v0, Landroid/content/ContextWrapper;

    if-eqz v2, :cond_1

    check-cast v0, Landroid/content/ContextWrapper;

    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method public Y(I)V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lj/g;->q0(IZ)Lj/g$q;

    move-result-object p1

    invoke-virtual {p0, p1, v0}, Lj/g;->Z(Lj/g$q;Z)V

    return-void
.end method

.method public final Y0(Landroid/content/res/Configuration;)V
    .locals 3

    iget-object v0, p0, Lj/g;->j:Ljava/lang/Object;

    check-cast v0, Landroid/app/Activity;

    instance-of v1, v0, Landroidx/lifecycle/s;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Landroidx/lifecycle/s;

    invoke-interface {v1}, Landroidx/lifecycle/s;->a()Landroidx/lifecycle/l;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/lifecycle/l;->b()Landroidx/lifecycle/l$b;

    move-result-object v1

    sget-object v2, Landroidx/lifecycle/l$b;->c:Landroidx/lifecycle/l$b;

    invoke-virtual {v1, v2}, Landroidx/lifecycle/l$b;->b(Landroidx/lifecycle/l$b;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0, p1}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    return-void

    :cond_0
    iget-boolean v1, p0, Lj/g;->Q:Z

    if-eqz v1, :cond_1

    iget-boolean v1, p0, Lj/g;->R:Z

    if-nez v1, :cond_1

    invoke-virtual {v0, p1}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    :cond_1
    return-void
.end method

.method public Z(Lj/g$q;Z)V
    .locals 3

    if-eqz p2, :cond_0

    iget v0, p1, Lj/g$q;->a:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lj/g;->r:Lq/e0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lq/e0;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p1, Lj/g$q;->j:Landroidx/appcompat/view/menu/e;

    invoke-virtual {p0, p1}, Lj/g;->W(Landroidx/appcompat/view/menu/e;)V

    return-void

    :cond_0
    iget-object v0, p0, Lj/g;->k:Landroid/content/Context;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-boolean v2, p1, Lj/g$q;->o:Z

    if-eqz v2, :cond_1

    iget-object v2, p1, Lj/g$q;->g:Landroid/view/ViewGroup;

    if-eqz v2, :cond_1

    invoke-interface {v0, v2}, Landroid/view/ViewManager;->removeView(Landroid/view/View;)V

    if-eqz p2, :cond_1

    iget p2, p1, Lj/g$q;->a:I

    invoke-virtual {p0, p2, p1, v1}, Lj/g;->V(ILj/g$q;Landroid/view/Menu;)V

    :cond_1
    const/4 p2, 0x0

    iput-boolean p2, p1, Lj/g$q;->m:Z

    iput-boolean p2, p1, Lj/g$q;->n:Z

    iput-boolean p2, p1, Lj/g$q;->o:Z

    iput-object v1, p1, Lj/g$q;->h:Landroid/view/View;

    const/4 p2, 0x1

    iput-boolean p2, p1, Lj/g$q;->q:Z

    iget-object p2, p0, Lj/g;->N:Lj/g$q;

    if-ne p2, p1, :cond_2

    iput-object v1, p0, Lj/g;->N:Lj/g$q;

    :cond_2
    iget p1, p1, Lj/g$q;->a:I

    if-nez p1, :cond_3

    invoke-virtual {p0}, Lj/g;->a1()V

    :cond_3
    return-void
.end method

.method public final Z0(ILu2/j;Z)Z
    .locals 10

    iget-object v1, p0, Lj/g;->k:Landroid/content/Context;

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move v2, p1

    move-object v3, p2

    invoke-virtual/range {v0 .. v5}, Lj/g;->a0(Landroid/content/Context;ILu2/j;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    move-result-object p1

    iget-object p2, v0, Lj/g;->k:Landroid/content/Context;

    invoke-virtual {p0, p2}, Lj/g;->m0(Landroid/content/Context;)I

    move-result p2

    iget-object v1, v0, Lj/g;->S:Landroid/content/res/Configuration;

    if-nez v1, :cond_0

    iget-object v1, v0, Lj/g;->k:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    :cond_0
    iget v4, v1, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v4, v4, 0x30

    iget v5, p1, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v5, v5, 0x30

    invoke-virtual {p0, v1}, Lj/g;->p0(Landroid/content/res/Configuration;)Lu2/j;

    move-result-object v1

    const/4 v6, 0x0

    if-nez v3, :cond_1

    move-object v7, v6

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1}, Lj/g;->p0(Landroid/content/res/Configuration;)Lu2/j;

    move-result-object v7

    :goto_0
    const/4 v8, 0x0

    if-eq v4, v5, :cond_2

    const/16 v4, 0x200

    goto :goto_1

    :cond_2
    move v4, v8

    :goto_1
    if-eqz v7, :cond_3

    invoke-virtual {v1, v7}, Lu2/j;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    or-int/lit16 v4, v4, 0x2004

    :cond_3
    not-int v1, p2

    and-int/2addr v1, v4

    const/4 v9, 0x1

    if-eqz v1, :cond_6

    if-eqz p3, :cond_6

    iget-boolean p3, v0, Lj/g;->P:Z

    if-eqz p3, :cond_6

    sget-boolean p3, Lj/g;->m0:Z

    if-nez p3, :cond_4

    iget-boolean p3, v0, Lj/g;->Q:Z

    if-eqz p3, :cond_6

    :cond_4
    iget-object p3, v0, Lj/g;->j:Ljava/lang/Object;

    instance-of v1, p3, Landroid/app/Activity;

    if-eqz v1, :cond_6

    check-cast p3, Landroid/app/Activity;

    invoke-virtual {p3}, Landroid/app/Activity;->isChild()Z

    move-result p3

    if-nez p3, :cond_6

    sget p3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt p3, v1, :cond_5

    and-int/lit16 p3, v4, 0x2000

    if-eqz p3, :cond_5

    iget-object p3, v0, Lj/g;->j:Ljava/lang/Object;

    check-cast p3, Landroid/app/Activity;

    invoke-virtual {p3}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p3

    invoke-virtual {p3}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p3

    invoke-virtual {p1}, Landroid/content/res/Configuration;->getLayoutDirection()I

    move-result p1

    invoke-virtual {p3, p1}, Landroid/view/View;->setLayoutDirection(I)V

    :cond_5
    iget-object p1, v0, Lj/g;->j:Ljava/lang/Object;

    check-cast p1, Landroid/app/Activity;

    invoke-static {p1}, Lk2/b;->t(Landroid/app/Activity;)V

    move p1, v9

    goto :goto_2

    :cond_6
    move p1, v8

    :goto_2
    if-nez p1, :cond_8

    if-eqz v4, :cond_8

    and-int p1, v4, p2

    if-ne p1, v4, :cond_7

    move v8, v9

    :cond_7
    invoke-virtual {p0, v5, v7, v8, v6}, Lj/g;->b1(ILu2/j;ZLandroid/content/res/Configuration;)V

    goto :goto_3

    :cond_8
    move v9, p1

    :goto_3
    if-eqz v9, :cond_a

    iget-object p1, v0, Lj/g;->j:Ljava/lang/Object;

    instance-of p2, p1, Lj/b;

    if-eqz p2, :cond_a

    and-int/lit16 p2, v4, 0x200

    if-eqz p2, :cond_9

    check-cast p1, Lj/b;

    invoke-virtual {p1, v2}, Lj/b;->x1(I)V

    :cond_9
    and-int/lit8 p1, v4, 0x4

    if-eqz p1, :cond_a

    iget-object p1, v0, Lj/g;->j:Ljava/lang/Object;

    check-cast p1, Lj/b;

    invoke-virtual {p1, v3}, Lj/b;->w1(Lu2/j;)V

    :cond_a
    if-eqz v7, :cond_b

    iget-object p1, v0, Lj/g;->k:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p1

    invoke-virtual {p0, p1}, Lj/g;->p0(Landroid/content/res/Configuration;)Lu2/j;

    move-result-object p1

    invoke-virtual {p0, p1}, Lj/g;->Q0(Lu2/j;)V

    :cond_b
    return v9
.end method

.method public a(Landroidx/appcompat/view/menu/e;Landroid/view/MenuItem;)Z
    .locals 2
    .param p1    # Landroidx/appcompat/view/menu/e;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/MenuItem;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p0}, Lj/g;->s0()Landroid/view/Window$Callback;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-boolean v1, p0, Lj/g;->R:Z

    if-nez v1, :cond_0

    invoke-virtual {p1}, Landroidx/appcompat/view/menu/e;->D()Landroidx/appcompat/view/menu/e;

    move-result-object p1

    invoke-virtual {p0, p1}, Lj/g;->j0(Landroid/view/Menu;)Lj/g$q;

    move-result-object p1

    if-eqz p1, :cond_0

    iget p1, p1, Lj/g$q;->a:I

    invoke-interface {v0, p1, p2}, Landroid/view/Window$Callback;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final a0(Landroid/content/Context;ILu2/j;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const/4 v0, 0x1

    if-eq p2, v0, :cond_2

    const/4 v0, 0x2

    if-eq p2, v0, :cond_1

    if-eqz p5, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p1

    iget p1, p1, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 p1, p1, 0x30

    goto :goto_0

    :cond_1
    const/16 p1, 0x20

    goto :goto_0

    :cond_2
    const/16 p1, 0x10

    :goto_0
    new-instance p2, Landroid/content/res/Configuration;

    invoke-direct {p2}, Landroid/content/res/Configuration;-><init>()V

    const/4 p5, 0x0

    iput p5, p2, Landroid/content/res/Configuration;->fontScale:F

    if-eqz p4, :cond_3

    invoke-virtual {p2, p4}, Landroid/content/res/Configuration;->setTo(Landroid/content/res/Configuration;)V

    :cond_3
    iget p4, p2, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 p4, p4, -0x31

    or-int/2addr p1, p4

    iput p1, p2, Landroid/content/res/Configuration;->uiMode:I

    if-eqz p3, :cond_4

    invoke-virtual {p0, p2, p3}, Lj/g;->P0(Landroid/content/res/Configuration;Lu2/j;)V

    :cond_4
    return-object p2
.end method

.method public a1()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_1

    invoke-virtual {p0}, Lj/g;->T0()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lj/g;->i0:Landroid/window/OnBackInvokedCallback;

    if-nez v1, :cond_0

    iget-object v0, p0, Lj/g;->h0:Landroid/window/OnBackInvokedDispatcher;

    invoke-static {v0, p0}, Lj/g$k;->b(Ljava/lang/Object;Lj/g;)Landroid/window/OnBackInvokedCallback;

    move-result-object v0

    iput-object v0, p0, Lj/g;->i0:Landroid/window/OnBackInvokedCallback;

    return-void

    :cond_0
    if-nez v0, :cond_1

    iget-object v0, p0, Lj/g;->i0:Landroid/window/OnBackInvokedCallback;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lj/g;->h0:Landroid/window/OnBackInvokedDispatcher;

    invoke-static {v1, v0}, Lj/g$k;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lj/g;->i0:Landroid/window/OnBackInvokedCallback;

    :cond_1
    return-void
.end method

.method public b(Landroidx/appcompat/view/menu/e;)V
    .locals 0
    .param p1    # Landroidx/appcompat/view/menu/e;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lj/g;->N0(Z)V

    return-void
.end method

.method public final b0()Landroid/view/ViewGroup;
    .locals 7

    iget-object v0, p0, Lj/g;->k:Landroid/content/Context;

    sget-object v1, Li/j;->A0:[I

    invoke-virtual {v0, v1}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v0

    sget v1, Li/j;->F0:I

    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v2

    if-eqz v2, :cond_10

    sget v2, Li/j;->O0:I

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    const/4 v4, 0x1

    if-eqz v2, :cond_0

    invoke-virtual {p0, v4}, Lj/g;->F(I)Z

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v1, 0x6c

    invoke-virtual {p0, v1}, Lj/g;->F(I)Z

    :cond_1
    :goto_0
    sget v1, Li/j;->G0:I

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    const/16 v2, 0x6d

    if-eqz v1, :cond_2

    invoke-virtual {p0, v2}, Lj/g;->F(I)Z

    :cond_2
    sget v1, Li/j;->H0:I

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    if-eqz v1, :cond_3

    const/16 v1, 0xa

    invoke-virtual {p0, v1}, Lj/g;->F(I)Z

    :cond_3
    sget v1, Li/j;->B0:I

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p0, Lj/g;->J:Z

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    invoke-virtual {p0}, Lj/g;->i0()V

    iget-object v0, p0, Lj/g;->l:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    iget-object v0, p0, Lj/g;->k:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iget-boolean v1, p0, Lj/g;->K:Z

    const/4 v5, 0x0

    if-nez v1, :cond_9

    iget-boolean v1, p0, Lj/g;->J:Z

    if-eqz v1, :cond_4

    sget v1, Li/g;->h:I

    invoke-virtual {v0, v1, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-boolean v3, p0, Lj/g;->H:Z

    iput-boolean v3, p0, Lj/g;->G:Z

    goto/16 :goto_2

    :cond_4
    iget-boolean v0, p0, Lj/g;->G:Z

    if-eqz v0, :cond_8

    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    iget-object v1, p0, Lj/g;->k:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    sget v6, Li/a;->f:I

    invoke-virtual {v1, v6, v0, v4}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget v1, v0, Landroid/util/TypedValue;->resourceId:I

    if-eqz v1, :cond_5

    new-instance v1, Lo/d;

    iget-object v4, p0, Lj/g;->k:Landroid/content/Context;

    iget v0, v0, Landroid/util/TypedValue;->resourceId:I

    invoke-direct {v1, v4, v0}, Lo/d;-><init>(Landroid/content/Context;I)V

    goto :goto_1

    :cond_5
    iget-object v1, p0, Lj/g;->k:Landroid/content/Context;

    :goto_1
    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Li/g;->r:I

    invoke-virtual {v0, v1, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    sget v1, Li/f;->q:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lq/e0;

    iput-object v1, p0, Lj/g;->r:Lq/e0;

    invoke-virtual {p0}, Lj/g;->s0()Landroid/view/Window$Callback;

    move-result-object v4

    invoke-interface {v1, v4}, Lq/e0;->setWindowCallback(Landroid/view/Window$Callback;)V

    iget-boolean v1, p0, Lj/g;->H:Z

    if-eqz v1, :cond_6

    iget-object v1, p0, Lj/g;->r:Lq/e0;

    invoke-interface {v1, v2}, Lq/e0;->h(I)V

    :cond_6
    iget-boolean v1, p0, Lj/g;->E:Z

    if-eqz v1, :cond_7

    iget-object v1, p0, Lj/g;->r:Lq/e0;

    const/4 v2, 0x2

    invoke-interface {v1, v2}, Lq/e0;->h(I)V

    :cond_7
    iget-boolean v1, p0, Lj/g;->F:Z

    if-eqz v1, :cond_b

    iget-object v1, p0, Lj/g;->r:Lq/e0;

    const/4 v2, 0x5

    invoke-interface {v1, v2}, Lq/e0;->h(I)V

    goto :goto_2

    :cond_8
    move-object v0, v5

    goto :goto_2

    :cond_9
    iget-boolean v1, p0, Lj/g;->I:Z

    if-eqz v1, :cond_a

    sget v1, Li/g;->q:I

    invoke-virtual {v0, v1, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    goto :goto_2

    :cond_a
    sget v1, Li/g;->p:I

    invoke-virtual {v0, v1, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    :cond_b
    :goto_2
    if-eqz v0, :cond_f

    new-instance v1, Lj/g$b;

    invoke-direct {v1, p0}, Lj/g$b;-><init>(Lj/g;)V

    invoke-static {v0, v1}, Landroidx/core/view/o0;->A0(Landroid/view/View;Landroidx/core/view/y;)V

    iget-object v1, p0, Lj/g;->r:Lq/e0;

    if-nez v1, :cond_c

    sget v1, Li/f;->R:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lj/g;->C:Landroid/widget/TextView;

    :cond_c
    invoke-static {v0}, Lq/g1;->c(Landroid/view/View;)V

    sget v1, Li/f;->b:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroidx/appcompat/widget/ContentFrameLayout;

    iget-object v2, p0, Lj/g;->l:Landroid/view/Window;

    const v4, 0x1020002

    invoke-virtual {v2, v4}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    if-eqz v2, :cond_e

    :goto_3
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v6

    if-lez v6, :cond_d

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->removeViewAt(I)V

    invoke-virtual {v1, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    goto :goto_3

    :cond_d
    const/4 v3, -0x1

    invoke-virtual {v2, v3}, Landroid/view/View;->setId(I)V

    invoke-virtual {v1, v4}, Landroid/view/View;->setId(I)V

    instance-of v3, v2, Landroid/widget/FrameLayout;

    if-eqz v3, :cond_e

    check-cast v2, Landroid/widget/FrameLayout;

    invoke-virtual {v2, v5}, Landroid/view/View;->setForeground(Landroid/graphics/drawable/Drawable;)V

    :cond_e
    iget-object v2, p0, Lj/g;->l:Landroid/view/Window;

    invoke-virtual {v2, v0}, Landroid/view/Window;->setContentView(Landroid/view/View;)V

    new-instance v2, Lj/g$c;

    invoke-direct {v2, p0}, Lj/g$c;-><init>(Lj/g;)V

    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/ContentFrameLayout;->setAttachListener(Landroidx/appcompat/widget/ContentFrameLayout$a;)V

    return-object v0

    :cond_f
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AppCompat does not support the current theme features: { windowActionBar: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lj/g;->G:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", windowActionBarOverlay: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lj/g;->H:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", android:windowIsFloating: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lj/g;->J:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", windowActionModeOverlay: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lj/g;->I:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", windowNoTitle: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lj/g;->K:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, " }"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_10
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You need to use a Theme.AppCompat theme (or descendant) with this activity."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final b1(ILu2/j;ZLandroid/content/res/Configuration;)V
    .locals 3

    iget-object v0, p0, Lj/g;->k:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    new-instance v1, Landroid/content/res/Configuration;

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    if-eqz p4, :cond_0

    invoke-virtual {v1, p4}, Landroid/content/res/Configuration;->updateFrom(Landroid/content/res/Configuration;)I

    :cond_0
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p4

    iget p4, p4, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 p4, p4, -0x31

    or-int/2addr p1, p4

    iput p1, v1, Landroid/content/res/Configuration;->uiMode:I

    if-eqz p2, :cond_1

    invoke-virtual {p0, v1, p2}, Lj/g;->P0(Landroid/content/res/Configuration;Lu2/j;)V

    :cond_1
    const/4 p1, 0x0

    invoke-virtual {v0, v1, p1}, Landroid/content/res/Resources;->updateConfiguration(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V

    iget p1, p0, Lj/g;->U:I

    if-eqz p1, :cond_2

    iget-object p2, p0, Lj/g;->k:Landroid/content/Context;

    invoke-virtual {p2, p1}, Landroid/content/Context;->setTheme(I)V

    iget-object p1, p0, Lj/g;->k:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    iget p2, p0, Lj/g;->U:I

    const/4 p4, 0x1

    invoke-virtual {p1, p2, p4}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    :cond_2
    if-eqz p3, :cond_3

    iget-object p1, p0, Lj/g;->j:Ljava/lang/Object;

    instance-of p1, p1, Landroid/app/Activity;

    if-eqz p1, :cond_3

    invoke-virtual {p0, v1}, Lj/g;->Y0(Landroid/content/res/Configuration;)V

    :cond_3
    return-void
.end method

.method public c0(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 10
    .param p3    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lj/g;->f0:Lj/n;

    if-nez v0, :cond_1

    iget-object v0, p0, Lj/g;->k:Landroid/content/Context;

    sget-object v1, Li/j;->A0:[I

    invoke-virtual {v0, v1}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v0

    sget v1, Li/j;->E0:I

    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    if-nez v1, :cond_0

    new-instance v0, Lj/n;

    invoke-direct {v0}, Lj/n;-><init>()V

    iput-object v0, p0, Lj/g;->f0:Lj/n;

    goto :goto_0

    :cond_0
    :try_start_0
    iget-object v0, p0, Lj/g;->k:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj/n;

    iput-object v0, p0, Lj/g;->f0:Lj/n;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failed to instantiate custom view inflater "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ". Falling back to default."

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "AppCompatDelegate"

    invoke-static {v2, v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    new-instance v0, Lj/n;

    invoke-direct {v0}, Lj/n;-><init>()V

    iput-object v0, p0, Lj/g;->f0:Lj/n;

    :cond_1
    :goto_0
    sget-boolean v7, Lj/g;->k0:Z

    const/4 v0, 0x0

    if-eqz v7, :cond_5

    iget-object v1, p0, Lj/g;->g0:Lj/p;

    if-nez v1, :cond_2

    new-instance v1, Lj/p;

    invoke-direct {v1}, Lj/p;-><init>()V

    iput-object v1, p0, Lj/g;->g0:Lj/p;

    :cond_2
    iget-object v1, p0, Lj/g;->g0:Lj/p;

    invoke-virtual {v1, p4}, Lj/p;->a(Landroid/util/AttributeSet;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_3

    move v6, v2

    goto :goto_2

    :cond_3
    instance-of v1, p4, Lorg/xmlpull/v1/XmlPullParser;

    if-eqz v1, :cond_4

    move-object v1, p4

    check-cast v1, Lorg/xmlpull/v1/XmlPullParser;

    invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v1

    if-le v1, v2, :cond_5

    move v0, v2

    goto :goto_1

    :cond_4
    move-object v0, p1

    check-cast v0, Landroid/view/ViewParent;

    invoke-virtual {p0, v0}, Lj/g;->S0(Landroid/view/ViewParent;)Z

    move-result v0

    :cond_5
    :goto_1
    move v6, v0

    :goto_2
    iget-object v1, p0, Lj/g;->f0:Lj/n;

    const/4 v8, 0x1

    invoke-static {}, Lq/f1;->c()Z

    move-result v9

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-virtual/range {v1 .. v9}, Lj/n;->r(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;ZZZZ)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public final c1(Landroidx/core/view/WindowInsetsCompat;Landroid/graphics/Rect;)I
    .locals 10

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroidx/core/view/WindowInsetsCompat;->getSystemWindowInsetTop()I

    move-result v1

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_1

    iget v1, p2, Landroid/graphics/Rect;->top:I

    goto :goto_0

    :cond_1
    move v1, v0

    :goto_0
    iget-object v2, p0, Lj/g;->v:Landroidx/appcompat/widget/ActionBarContextView;

    const/16 v3, 0x8

    if-eqz v2, :cond_10

    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    instance-of v2, v2, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v2, :cond_10

    iget-object v2, p0, Lj/g;->v:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup$MarginLayoutParams;

    iget-object v4, p0, Lj/g;->v:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v4}, Landroid/view/View;->isShown()Z

    move-result v4

    const/4 v5, 0x1

    if-eqz v4, :cond_e

    iget-object v4, p0, Lj/g;->d0:Landroid/graphics/Rect;

    if-nez v4, :cond_2

    new-instance v4, Landroid/graphics/Rect;

    invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V

    iput-object v4, p0, Lj/g;->d0:Landroid/graphics/Rect;

    new-instance v4, Landroid/graphics/Rect;

    invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V

    iput-object v4, p0, Lj/g;->e0:Landroid/graphics/Rect;

    :cond_2
    iget-object v4, p0, Lj/g;->d0:Landroid/graphics/Rect;

    iget-object v6, p0, Lj/g;->e0:Landroid/graphics/Rect;

    if-nez p1, :cond_3

    invoke-virtual {v4, p2}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, Landroidx/core/view/WindowInsetsCompat;->getSystemWindowInsetLeft()I

    move-result p2

    invoke-virtual {p1}, Landroidx/core/view/WindowInsetsCompat;->getSystemWindowInsetTop()I

    move-result v7

    invoke-virtual {p1}, Landroidx/core/view/WindowInsetsCompat;->getSystemWindowInsetRight()I

    move-result v8

    invoke-virtual {p1}, Landroidx/core/view/WindowInsetsCompat;->getSystemWindowInsetBottom()I

    move-result p1

    invoke-virtual {v4, p2, v7, v8, p1}, Landroid/graphics/Rect;->set(IIII)V

    :goto_1
    iget-object p1, p0, Lj/g;->B:Landroid/view/ViewGroup;

    invoke-static {p1, v4, v6}, Lq/g1;->a(Landroid/view/View;Landroid/graphics/Rect;Landroid/graphics/Rect;)V

    iget p1, v4, Landroid/graphics/Rect;->top:I

    iget p2, v4, Landroid/graphics/Rect;->left:I

    iget v4, v4, Landroid/graphics/Rect;->right:I

    iget-object v6, p0, Lj/g;->B:Landroid/view/ViewGroup;

    invoke-static {v6}, Landroidx/core/view/o0;->F(Landroid/view/View;)Landroidx/core/view/WindowInsetsCompat;

    move-result-object v6

    if-nez v6, :cond_4

    move v7, v0

    goto :goto_2

    :cond_4
    invoke-virtual {v6}, Landroidx/core/view/WindowInsetsCompat;->getSystemWindowInsetLeft()I

    move-result v7

    :goto_2
    if-nez v6, :cond_5

    move v6, v0

    goto :goto_3

    :cond_5
    invoke-virtual {v6}, Landroidx/core/view/WindowInsetsCompat;->getSystemWindowInsetRight()I

    move-result v6

    :goto_3
    iget v8, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    if-ne v8, p1, :cond_7

    iget v8, v2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    if-ne v8, p2, :cond_7

    iget v8, v2, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    if-eq v8, v4, :cond_6

    goto :goto_4

    :cond_6
    move p2, v0

    goto :goto_5

    :cond_7
    :goto_4
    iput p1, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iput p2, v2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iput v4, v2, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    move p2, v5

    :goto_5
    if-lez p1, :cond_8

    iget-object p1, p0, Lj/g;->D:Landroid/view/View;

    if-nez p1, :cond_8

    new-instance p1, Landroid/view/View;

    iget-object v4, p0, Lj/g;->k:Landroid/content/Context;

    invoke-direct {p1, v4}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lj/g;->D:Landroid/view/View;

    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    new-instance p1, Landroid/widget/FrameLayout$LayoutParams;

    iget v4, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    const/16 v8, 0x33

    const/4 v9, -0x1

    invoke-direct {p1, v9, v4, v8}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    iput v7, p1, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    iput v6, p1, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    iget-object v4, p0, Lj/g;->B:Landroid/view/ViewGroup;

    iget-object v6, p0, Lj/g;->D:Landroid/view/View;

    invoke-virtual {v4, v6, v9, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    goto :goto_6

    :cond_8
    iget-object p1, p0, Lj/g;->D:Landroid/view/View;

    if-eqz p1, :cond_a

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    iget v4, p1, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    iget v8, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    if-ne v4, v8, :cond_9

    iget v4, p1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    if-ne v4, v7, :cond_9

    iget v4, p1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    if-eq v4, v6, :cond_a

    :cond_9
    iput v8, p1, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    iput v7, p1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iput v6, p1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iget-object v4, p0, Lj/g;->D:Landroid/view/View;

    invoke-virtual {v4, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_a
    :goto_6
    iget-object p1, p0, Lj/g;->D:Landroid/view/View;

    if-eqz p1, :cond_b

    goto :goto_7

    :cond_b
    move v5, v0

    :goto_7
    if-eqz v5, :cond_c

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result p1

    if-eqz p1, :cond_c

    iget-object p1, p0, Lj/g;->D:Landroid/view/View;

    invoke-virtual {p0, p1}, Lj/g;->d1(Landroid/view/View;)V

    :cond_c
    iget-boolean p1, p0, Lj/g;->I:Z

    if-nez p1, :cond_d

    if-eqz v5, :cond_d

    move v1, v0

    :cond_d
    move p1, v5

    move v5, p2

    goto :goto_8

    :cond_e
    iget p1, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    if-eqz p1, :cond_f

    iput v0, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    move p1, v0

    goto :goto_8

    :cond_f
    move p1, v0

    move v5, p1

    :goto_8
    if-eqz v5, :cond_11

    iget-object p2, p0, Lj/g;->v:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p2, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_9

    :cond_10
    move p1, v0

    :cond_11
    :goto_9
    iget-object p2, p0, Lj/g;->D:Landroid/view/View;

    if-eqz p2, :cond_13

    if-eqz p1, :cond_12

    goto :goto_a

    :cond_12
    move v0, v3

    :goto_a
    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_13
    return v1
.end method

.method public d0()V
    .locals 2

    iget-object v0, p0, Lj/g;->r:Lq/e0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lq/e0;->l()V

    :cond_0
    iget-object v0, p0, Lj/g;->w:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lj/g;->l:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lj/g;->x:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v0, p0, Lj/g;->w:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_1

    :try_start_0
    iget-object v0, p0, Lj/g;->w:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lj/g;->w:Landroid/widget/PopupWindow;

    :cond_2
    invoke-virtual {p0}, Lj/g;->g0()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0, v0}, Lj/g;->q0(IZ)Lj/g$q;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v0, v0, Lj/g$q;->j:Landroidx/appcompat/view/menu/e;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroidx/appcompat/view/menu/e;->close()V

    :cond_3
    return-void
.end method

.method public final d1(Landroid/view/View;)V
    .locals 2

    invoke-static {p1}, Landroidx/core/view/o0;->K(Landroid/view/View;)I

    move-result v0

    and-int/lit16 v0, v0, 0x2000

    if-eqz v0, :cond_0

    iget-object v0, p0, Lj/g;->k:Landroid/content/Context;

    sget v1, Li/c;->b:I

    invoke-static {v0, v1}, Ll2/b;->c(Landroid/content/Context;I)I

    move-result v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lj/g;->k:Landroid/content/Context;

    sget v1, Li/c;->a:I

    invoke-static {v0, v1}, Ll2/b;->c(Landroid/content/Context;I)I

    move-result v0

    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    return-void
.end method

.method public e(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 2

    invoke-virtual {p0}, Lj/g;->h0()V

    iget-object v0, p0, Lj/g;->B:Landroid/view/ViewGroup;

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p1, p0, Lj/g;->m:Lj/g$l;

    iget-object p2, p0, Lj/g;->l:Landroid/view/Window;

    invoke-virtual {p2}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object p2

    invoke-virtual {p1, p2}, Lj/g$l;->c(Landroid/view/Window$Callback;)V

    return-void
.end method

.method public e0(Landroid/view/KeyEvent;)Z
    .locals 3

    iget-object v0, p0, Lj/g;->j:Ljava/lang/Object;

    instance-of v1, v0, Landroidx/core/view/l$a;

    const/4 v2, 0x1

    if-nez v1, :cond_0

    instance-of v0, v0, Lj/l;

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lj/g;->l:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0, p1}, Landroidx/core/view/l;->d(Landroid/view/View;Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_1

    return v2

    :cond_1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/16 v1, 0x52

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lj/g;->m:Lj/g$l;

    iget-object v1, p0, Lj/g;->l:Landroid/view/Window;

    invoke-virtual {v1}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lj/g$l;->b(Landroid/view/Window$Callback;Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_2

    return v2

    :cond_2
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {p0, v0, p1}, Lj/g;->B0(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1

    :cond_3
    invoke-virtual {p0, v0, p1}, Lj/g;->E0(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public f0(I)V
    .locals 4

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lj/g;->q0(IZ)Lj/g$q;

    move-result-object v1

    iget-object v2, v1, Lj/g$q;->j:Landroidx/appcompat/view/menu/e;

    if-eqz v2, :cond_1

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    iget-object v3, v1, Lj/g$q;->j:Landroidx/appcompat/view/menu/e;

    invoke-virtual {v3, v2}, Landroidx/appcompat/view/menu/e;->R(Landroid/os/Bundle;)V

    invoke-virtual {v2}, Landroid/os/BaseBundle;->size()I

    move-result v3

    if-lez v3, :cond_0

    iput-object v2, v1, Lj/g$q;->s:Landroid/os/Bundle;

    :cond_0
    iget-object v2, v1, Lj/g$q;->j:Landroidx/appcompat/view/menu/e;

    invoke-virtual {v2}, Landroidx/appcompat/view/menu/e;->e0()V

    iget-object v2, v1, Lj/g$q;->j:Landroidx/appcompat/view/menu/e;

    invoke-virtual {v2}, Landroidx/appcompat/view/menu/e;->clear()V

    :cond_1
    iput-boolean v0, v1, Lj/g$q;->r:Z

    iput-boolean v0, v1, Lj/g$q;->q:Z

    const/16 v0, 0x6c

    if-eq p1, v0, :cond_2

    if-nez p1, :cond_3

    :cond_2
    iget-object p1, p0, Lj/g;->r:Lq/e0;

    if-eqz p1, :cond_3

    const/4 p1, 0x0

    invoke-virtual {p0, p1, p1}, Lj/g;->q0(IZ)Lj/g$q;

    move-result-object v0

    if-eqz v0, :cond_3

    iput-boolean p1, v0, Lj/g$q;->m:Z

    const/4 p1, 0x0

    invoke-virtual {p0, v0, p1}, Lj/g;->M0(Lj/g$q;Landroid/view/KeyEvent;)Z

    :cond_3
    return-void
.end method

.method public g(Landroid/content/Context;)Landroid/content/Context;
    .locals 7
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const/4 v0, 0x1

    iput-boolean v0, p0, Lj/g;->P:Z

    invoke-virtual {p0}, Lj/g;->U()I

    move-result v0

    invoke-virtual {p0, p1, v0}, Lj/g;->z0(Landroid/content/Context;I)I

    move-result v3

    invoke-static {p1}, Lj/e;->u(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lj/e;->N(Landroid/content/Context;)V

    :cond_0
    invoke-virtual {p0, p1}, Lj/g;->T(Landroid/content/Context;)Lu2/j;

    move-result-object v4

    instance-of v0, p1, Landroid/view/ContextThemeWrapper;

    if-eqz v0, :cond_1

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-virtual/range {v1 .. v6}, Lj/g;->a0(Landroid/content/Context;ILu2/j;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    move-result-object p1

    :try_start_0
    move-object v0, v2

    check-cast v0, Landroid/view/ContextThemeWrapper;

    invoke-virtual {v0, p1}, Landroid/view/ContextThemeWrapper;->applyOverrideConfiguration(Landroid/content/res/Configuration;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v2

    :cond_1
    move-object v2, p1

    :catch_0
    nop

    instance-of p1, v2, Lo/d;

    if-eqz p1, :cond_2

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    invoke-virtual/range {v1 .. v6}, Lj/g;->a0(Landroid/content/Context;ILu2/j;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    move-result-object p1

    :try_start_1
    move-object v0, v2

    check-cast v0, Lo/d;

    invoke-virtual {v0, p1}, Lo/d;->a(Landroid/content/res/Configuration;)V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1

    return-object v2

    :catch_1
    :cond_2
    sget-boolean p1, Lj/g;->m0:Z

    if-nez p1, :cond_3

    invoke-super {p0, v2}, Lj/e;->g(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    return-object p1

    :cond_3
    new-instance p1, Landroid/content/res/Configuration;

    invoke-direct {p1}, Landroid/content/res/Configuration;-><init>()V

    const/4 v0, -0x1

    iput v0, p1, Landroid/content/res/Configuration;->uiMode:I

    const/4 v0, 0x0

    iput v0, p1, Landroid/content/res/Configuration;->fontScale:F

    invoke-virtual {v2, p1}, Landroid/content/Context;->createConfigurationContext(Landroid/content/res/Configuration;)Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p1

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v1, v0, Landroid/content/res/Configuration;->uiMode:I

    iput v1, p1, Landroid/content/res/Configuration;->uiMode:I

    invoke-virtual {p1, v0}, Landroid/content/res/Configuration;->equals(Landroid/content/res/Configuration;)Z

    move-result v1

    if-nez v1, :cond_4

    invoke-static {p1, v0}, Lj/g;->k0(Landroid/content/res/Configuration;Landroid/content/res/Configuration;)Landroid/content/res/Configuration;

    move-result-object p1

    :goto_0
    move-object v5, p1

    goto :goto_1

    :cond_4
    const/4 p1, 0x0

    goto :goto_0

    :goto_1
    const/4 v6, 0x1

    move-object v1, p0

    invoke-virtual/range {v1 .. v6}, Lj/g;->a0(Landroid/content/Context;ILu2/j;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    move-result-object p1

    new-instance v0, Lo/d;

    sget v3, Li/i;->b:I

    invoke-direct {v0, v2, v3}, Lo/d;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0, p1}, Lo/d;->a(Landroid/content/res/Configuration;)V

    :try_start_2
    invoke-virtual {v2}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1
    :try_end_2
    .catch Ljava/lang/NullPointerException; {:try_start_2 .. :try_end_2} :catch_2

    if-eqz p1, :cond_5

    invoke-virtual {v0}, Lo/d;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    invoke-static {p1}, Ln2/h$g;->a(Landroid/content/res/Resources$Theme;)V

    :catch_2
    :cond_5
    invoke-super {p0, v0}, Lj/e;->g(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    return-object p1
.end method

.method public g0()V
    .locals 1

    iget-object v0, p0, Lj/g;->y:Landroidx/core/view/y0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/core/view/y0;->c()V

    :cond_0
    return-void
.end method

.method public final h0()V
    .locals 2

    iget-boolean v0, p0, Lj/g;->A:Z

    if-nez v0, :cond_4

    invoke-virtual {p0}, Lj/g;->b0()Landroid/view/ViewGroup;

    move-result-object v0

    iput-object v0, p0, Lj/g;->B:Landroid/view/ViewGroup;

    invoke-virtual {p0}, Lj/g;->r0()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lj/g;->r:Lq/e0;

    if-eqz v1, :cond_0

    invoke-interface {v1, v0}, Lq/e0;->setWindowTitle(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lj/g;->K0()Lj/a;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lj/g;->K0()Lj/a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lj/a;->t(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lj/g;->C:Landroid/widget/TextView;

    if-eqz v1, :cond_2

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_2
    :goto_0
    invoke-virtual {p0}, Lj/g;->R()V

    iget-object v0, p0, Lj/g;->B:Landroid/view/ViewGroup;

    invoke-virtual {p0, v0}, Lj/g;->I0(Landroid/view/ViewGroup;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lj/g;->A:Z

    const/4 v0, 0x0

    invoke-virtual {p0, v0, v0}, Lj/g;->q0(IZ)Lj/g$q;

    move-result-object v0

    iget-boolean v1, p0, Lj/g;->R:Z

    if-nez v1, :cond_4

    if-eqz v0, :cond_3

    iget-object v0, v0, Lj/g$q;->j:Landroidx/appcompat/view/menu/e;

    if-nez v0, :cond_4

    :cond_3
    const/16 v0, 0x6c

    invoke-virtual {p0, v0}, Lj/g;->x0(I)V

    :cond_4
    return-void
.end method

.method public final i0()V
    .locals 2

    iget-object v0, p0, Lj/g;->l:Landroid/view/Window;

    if-nez v0, :cond_0

    iget-object v0, p0, Lj/g;->j:Ljava/lang/Object;

    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {p0, v0}, Lj/g;->S(Landroid/view/Window;)V

    :cond_0
    iget-object v0, p0, Lj/g;->l:Landroid/view/Window;

    if-eqz v0, :cond_1

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "We have not been given a Window"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public j(I)Landroid/view/View;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(I)TT;"
        }
    .end annotation

    invoke-virtual {p0}, Lj/g;->h0()V

    iget-object v0, p0, Lj/g;->l:Landroid/view/Window;

    invoke-virtual {v0, p1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public j0(Landroid/view/Menu;)Lj/g$q;
    .locals 5

    iget-object v0, p0, Lj/g;->M:[Lj/g$q;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    array-length v2, v0

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    if-ge v1, v2, :cond_2

    aget-object v3, v0, v1

    if-eqz v3, :cond_1

    iget-object v4, v3, Lj/g$q;->j:Landroidx/appcompat/view/menu/e;

    if-ne v4, p1, :cond_1

    return-object v3

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public l()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lj/g;->k:Landroid/content/Context;

    return-object v0
.end method

.method public final l0()Landroid/content/Context;
    .locals 1

    invoke-virtual {p0}, Lj/g;->r()Lj/a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lj/a;->j()Landroid/content/Context;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    iget-object v0, p0, Lj/g;->k:Landroid/content/Context;

    :cond_1
    return-object v0
.end method

.method public final m0(Landroid/content/Context;)I
    .locals 5

    iget-boolean v0, p0, Lj/g;->W:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lj/g;->j:Ljava/lang/Object;

    instance-of v0, v0, Landroid/app/Activity;

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    :try_start_0
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1d

    if-lt v2, v3, :cond_1

    const/high16 v2, 0x100c0000

    goto :goto_0

    :cond_1
    const/high16 v2, 0xc0000

    :goto_0
    new-instance v3, Landroid/content/ComponentName;

    iget-object v4, p0, Lj/g;->j:Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-direct {v3, p1, v4}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v3, v2}, Landroid/content/pm/PackageManager;->getActivityInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;

    move-result-object p1

    if-eqz p1, :cond_2

    iget p1, p1, Landroid/content/pm/ActivityInfo;->configChanges:I

    iput p1, p0, Lj/g;->V:I
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    const-string v0, "AppCompatDelegate"

    const-string v2, "Exception while getting ActivityInfo"

    invoke-static {v0, v2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iput v1, p0, Lj/g;->V:I

    :cond_2
    :goto_1
    const/4 p1, 0x1

    iput-boolean p1, p0, Lj/g;->W:Z

    iget p1, p0, Lj/g;->V:I

    return p1
.end method

.method public n()I
    .locals 1

    iget v0, p0, Lj/g;->T:I

    return v0
.end method

.method public final n0(Landroid/content/Context;)Lj/g$n;
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lj/g;->Y:Lj/g$n;

    if-nez v0, :cond_0

    new-instance v0, Lj/g$m;

    invoke-direct {v0, p0, p1}, Lj/g$m;-><init>(Lj/g;Landroid/content/Context;)V

    iput-object v0, p0, Lj/g;->Y:Lj/g$n;

    :cond_0
    iget-object p1, p0, Lj/g;->Y:Lj/g$n;

    return-object p1
.end method

.method public final o0(Landroid/content/Context;)Lj/g$n;
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lj/g;->X:Lj/g$n;

    if-nez v0, :cond_0

    new-instance v0, Lj/g$o;

    invoke-static {p1}, Lj/s;->a(Landroid/content/Context;)Lj/s;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Lj/g$o;-><init>(Lj/g;Lj/s;)V

    iput-object v0, p0, Lj/g;->X:Lj/g$n;

    :cond_0
    iget-object p1, p0, Lj/g;->X:Lj/g$n;

    return-object p1
.end method

.method public final onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, Lj/g;->c0(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0, p1, p2, p3}, Lj/g;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public p()Landroid/view/MenuInflater;
    .locals 2

    iget-object v0, p0, Lj/g;->p:Landroid/view/MenuInflater;

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lj/g;->t0()V

    new-instance v0, Lo/g;

    iget-object v1, p0, Lj/g;->o:Lj/a;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lj/a;->j()Landroid/content/Context;

    move-result-object v1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lj/g;->k:Landroid/content/Context;

    :goto_0
    invoke-direct {v0, v1}, Lo/g;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lj/g;->p:Landroid/view/MenuInflater;

    :cond_1
    iget-object v0, p0, Lj/g;->p:Landroid/view/MenuInflater;

    return-object v0
.end method

.method public p0(Landroid/content/res/Configuration;)Lu2/j;
    .locals 0

    invoke-static {p1}, Lj/g$i;->b(Landroid/content/res/Configuration;)Lu2/j;

    move-result-object p1

    return-object p1
.end method

.method public q0(IZ)Lj/g$q;
    .locals 3

    iget-object p2, p0, Lj/g;->M:[Lj/g$q;

    if-eqz p2, :cond_0

    array-length v0, p2

    if-gt v0, p1, :cond_2

    :cond_0
    add-int/lit8 v0, p1, 0x1

    new-array v0, v0, [Lj/g$q;

    if-eqz p2, :cond_1

    array-length v1, p2

    const/4 v2, 0x0

    invoke-static {p2, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_1
    iput-object v0, p0, Lj/g;->M:[Lj/g$q;

    move-object p2, v0

    :cond_2
    aget-object v0, p2, p1

    if-nez v0, :cond_3

    new-instance v0, Lj/g$q;

    invoke-direct {v0, p1}, Lj/g$q;-><init>(I)V

    aput-object v0, p2, p1

    :cond_3
    return-object v0
.end method

.method public r()Lj/a;
    .locals 1

    invoke-virtual {p0}, Lj/g;->t0()V

    iget-object v0, p0, Lj/g;->o:Lj/a;

    return-object v0
.end method

.method public final r0()Ljava/lang/CharSequence;
    .locals 2

    iget-object v0, p0, Lj/g;->j:Ljava/lang/Object;

    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lj/g;->q:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public s()V
    .locals 2

    iget-object v0, p0, Lj/g;->k:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/LayoutInflater;->getFactory()Landroid/view/LayoutInflater$Factory;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-static {v0, p0}, Landroidx/core/view/m;->a(Landroid/view/LayoutInflater;Landroid/view/LayoutInflater$Factory2;)V

    return-void

    :cond_0
    invoke-virtual {v0}, Landroid/view/LayoutInflater;->getFactory2()Landroid/view/LayoutInflater$Factory2;

    move-result-object v0

    instance-of v0, v0, Lj/g;

    if-nez v0, :cond_1

    const-string v0, "AppCompatDelegate"

    const-string v1, "The Activity\'s LayoutInflater already has a Factory installed so we can not install AppCompat\'s"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    return-void
.end method

.method public final s0()Landroid/view/Window$Callback;
    .locals 1

    iget-object v0, p0, Lj/g;->l:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v0

    return-object v0
.end method

.method public t()V
    .locals 1

    invoke-virtual {p0}, Lj/g;->K0()Lj/a;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lj/g;->r()Lj/a;

    move-result-object v0

    invoke-virtual {v0}, Lj/a;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lj/g;->x0(I)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final t0()V
    .locals 3

    invoke-virtual {p0}, Lj/g;->h0()V

    iget-boolean v0, p0, Lj/g;->G:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lj/g;->o:Lj/a;

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lj/g;->j:Ljava/lang/Object;

    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_1

    new-instance v0, Lj/t;

    iget-object v1, p0, Lj/g;->j:Ljava/lang/Object;

    check-cast v1, Landroid/app/Activity;

    iget-boolean v2, p0, Lj/g;->H:Z

    invoke-direct {v0, v1, v2}, Lj/t;-><init>(Landroid/app/Activity;Z)V

    iput-object v0, p0, Lj/g;->o:Lj/a;

    goto :goto_0

    :cond_1
    instance-of v0, v0, Landroid/app/Dialog;

    if-eqz v0, :cond_2

    new-instance v0, Lj/t;

    iget-object v1, p0, Lj/g;->j:Ljava/lang/Object;

    check-cast v1, Landroid/app/Dialog;

    invoke-direct {v0, v1}, Lj/t;-><init>(Landroid/app/Dialog;)V

    iput-object v0, p0, Lj/g;->o:Lj/a;

    :cond_2
    :goto_0
    iget-object v0, p0, Lj/g;->o:Lj/a;

    if-eqz v0, :cond_3

    iget-boolean v1, p0, Lj/g;->c0:Z

    invoke-virtual {v0, v1}, Lj/a;->r(Z)V

    :cond_3
    :goto_1
    return-void
.end method

.method public final u0(Lj/g$q;)Z
    .locals 3

    iget-object v0, p1, Lj/g$q;->i:Landroid/view/View;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iput-object v0, p1, Lj/g$q;->h:Landroid/view/View;

    return v1

    :cond_0
    iget-object v0, p1, Lj/g$q;->j:Landroidx/appcompat/view/menu/e;

    const/4 v2, 0x0

    if-nez v0, :cond_1

    return v2

    :cond_1
    iget-object v0, p0, Lj/g;->t:Lj/g$r;

    if-nez v0, :cond_2

    new-instance v0, Lj/g$r;

    invoke-direct {v0, p0}, Lj/g$r;-><init>(Lj/g;)V

    iput-object v0, p0, Lj/g;->t:Lj/g$r;

    :cond_2
    iget-object v0, p0, Lj/g;->t:Lj/g$r;

    invoke-virtual {p1, v0}, Lj/g$q;->a(Landroidx/appcompat/view/menu/i$a;)Landroidx/appcompat/view/menu/j;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    iput-object v0, p1, Lj/g$q;->h:Landroid/view/View;

    if-eqz v0, :cond_3

    return v1

    :cond_3
    return v2
.end method

.method public v(Landroid/content/res/Configuration;)V
    .locals 1

    iget-boolean v0, p0, Lj/g;->G:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lj/g;->A:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lj/g;->r()Lj/a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lj/a;->m(Landroid/content/res/Configuration;)V

    :cond_0
    invoke-static {}, Lq/k;->b()Lq/k;

    move-result-object p1

    iget-object v0, p0, Lj/g;->k:Landroid/content/Context;

    invoke-virtual {p1, v0}, Lq/k;->g(Landroid/content/Context;)V

    new-instance p1, Landroid/content/res/Configuration;

    iget-object v0, p0, Lj/g;->k:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    iput-object p1, p0, Lj/g;->S:Landroid/content/res/Configuration;

    const/4 p1, 0x0

    invoke-virtual {p0, p1, p1}, Lj/g;->P(ZZ)Z

    return-void
.end method

.method public final v0(Lj/g$q;)Z
    .locals 2

    invoke-virtual {p0}, Lj/g;->l0()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1, v0}, Lj/g$q;->d(Landroid/content/Context;)V

    new-instance v0, Lj/g$p;

    iget-object v1, p1, Lj/g$q;->l:Landroid/content/Context;

    invoke-direct {v0, p0, v1}, Lj/g$p;-><init>(Lj/g;Landroid/content/Context;)V

    iput-object v0, p1, Lj/g$q;->g:Landroid/view/ViewGroup;

    const/16 v0, 0x51

    iput v0, p1, Lj/g$q;->c:I

    const/4 p1, 0x1

    return p1
.end method

.method public w(Landroid/os/Bundle;)V
    .locals 2

    const/4 p1, 0x1

    iput-boolean p1, p0, Lj/g;->P:Z

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lj/g;->O(Z)Z

    invoke-virtual {p0}, Lj/g;->i0()V

    iget-object v0, p0, Lj/g;->j:Ljava/lang/Object;

    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_2

    :try_start_0
    check-cast v0, Landroid/app/Activity;

    invoke-static {v0}, Lk2/i;->c(Landroid/app/Activity;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lj/g;->K0()Lj/a;

    move-result-object v0

    if-nez v0, :cond_0

    iput-boolean p1, p0, Lj/g;->c0:Z

    goto :goto_1

    :cond_0
    invoke-virtual {v0, p1}, Lj/a;->r(Z)V

    :cond_1
    :goto_1
    invoke-static {p0}, Lj/e;->d(Lj/e;)V

    :cond_2
    new-instance v0, Landroid/content/res/Configuration;

    iget-object v1, p0, Lj/g;->k:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    iput-object v0, p0, Lj/g;->S:Landroid/content/res/Configuration;

    iput-boolean p1, p0, Lj/g;->Q:Z

    return-void
.end method

.method public final w0(Lj/g$q;)Z
    .locals 6

    iget-object v0, p0, Lj/g;->k:Landroid/content/Context;

    iget v1, p1, Lj/g$q;->a:I

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    const/16 v3, 0x6c

    if-ne v1, v3, :cond_4

    :cond_0
    iget-object v1, p0, Lj/g;->r:Lq/e0;

    if-eqz v1, :cond_4

    new-instance v1, Landroid/util/TypedValue;

    invoke-direct {v1}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v3

    sget v4, Li/a;->f:I

    invoke-virtual {v3, v4, v1, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget v4, v1, Landroid/util/TypedValue;->resourceId:I

    if-eqz v4, :cond_1

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    move-result-object v4

    invoke-virtual {v4, v3}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    iget v5, v1, Landroid/util/TypedValue;->resourceId:I

    invoke-virtual {v4, v5, v2}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    sget v5, Li/a;->g:I

    invoke-virtual {v4, v5, v1, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    goto :goto_0

    :cond_1
    sget v4, Li/a;->g:I

    invoke-virtual {v3, v4, v1, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    const/4 v4, 0x0

    :goto_0
    iget v5, v1, Landroid/util/TypedValue;->resourceId:I

    if-eqz v5, :cond_3

    if-nez v4, :cond_2

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    move-result-object v4

    invoke-virtual {v4, v3}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    :cond_2
    iget v1, v1, Landroid/util/TypedValue;->resourceId:I

    invoke-virtual {v4, v1, v2}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    :cond_3
    if-eqz v4, :cond_4

    new-instance v1, Lo/d;

    const/4 v3, 0x0

    invoke-direct {v1, v0, v3}, Lo/d;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    move-object v0, v1

    :cond_4
    new-instance v1, Landroidx/appcompat/view/menu/e;

    invoke-direct {v1, v0}, Landroidx/appcompat/view/menu/e;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, p0}, Landroidx/appcompat/view/menu/e;->S(Landroidx/appcompat/view/menu/e$a;)V

    invoke-virtual {p1, v1}, Lj/g$q;->c(Landroidx/appcompat/view/menu/e;)V

    return v2
.end method

.method public x()V
    .locals 3

    iget-object v0, p0, Lj/g;->j:Ljava/lang/Object;

    instance-of v0, v0, Landroid/app/Activity;

    if-eqz v0, :cond_0

    invoke-static {p0}, Lj/e;->D(Lj/e;)V

    :cond_0
    iget-boolean v0, p0, Lj/g;->Z:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lj/g;->l:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lj/g;->b0:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lj/g;->R:Z

    iget v0, p0, Lj/g;->T:I

    const/16 v1, -0x64

    if-eq v0, v1, :cond_2

    iget-object v0, p0, Lj/g;->j:Ljava/lang/Object;

    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_2

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isChangingConfigurations()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lj/g;->j0:Lw1/j;

    iget-object v1, p0, Lj/g;->j:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Lj/g;->T:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lw1/j;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    sget-object v0, Lj/g;->j0:Lw1/j;

    iget-object v1, p0, Lj/g;->j:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lw1/j;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    iget-object v0, p0, Lj/g;->o:Lj/a;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lj/a;->n()V

    :cond_3
    invoke-virtual {p0}, Lj/g;->X()V

    return-void
.end method

.method public final x0(I)V
    .locals 2

    iget v0, p0, Lj/g;->a0:I

    const/4 v1, 0x1

    shl-int p1, v1, p1

    or-int/2addr p1, v0

    iput p1, p0, Lj/g;->a0:I

    iget-boolean p1, p0, Lj/g;->Z:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Lj/g;->l:Landroid/view/Window;

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    iget-object v0, p0, Lj/g;->b0:Ljava/lang/Runnable;

    invoke-static {p1, v0}, Landroidx/core/view/o0;->e0(Landroid/view/View;Ljava/lang/Runnable;)V

    iput-boolean v1, p0, Lj/g;->Z:Z

    :cond_0
    return-void
.end method

.method public y(Landroid/os/Bundle;)V
    .locals 0

    invoke-virtual {p0}, Lj/g;->h0()V

    return-void
.end method

.method public y0()Z
    .locals 1

    iget-boolean v0, p0, Lj/g;->z:Z

    return v0
.end method

.method public z()V
    .locals 2

    invoke-virtual {p0}, Lj/g;->r()Lj/a;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lj/a;->s(Z)V

    :cond_0
    return-void
.end method

.method public z0(Landroid/content/Context;I)I
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/16 v0, -0x64

    const/4 v1, -0x1

    if-eq p2, v0, :cond_4

    if-eq p2, v1, :cond_3

    if-eqz p2, :cond_1

    const/4 v0, 0x1

    if-eq p2, v0, :cond_3

    const/4 v0, 0x2

    if-eq p2, v0, :cond_3

    const/4 v0, 0x3

    if-ne p2, v0, :cond_0

    invoke-virtual {p0, p1}, Lj/g;->n0(Landroid/content/Context;)Lj/g$n;

    move-result-object p1

    invoke-virtual {p1}, Lj/g$n;->c()I

    move-result p1

    return p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p2

    const-string v0, "uimode"

    invoke-virtual {p2, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/app/UiModeManager;

    invoke-virtual {p2}, Landroid/app/UiModeManager;->getNightMode()I

    move-result p2

    if-nez p2, :cond_2

    return v1

    :cond_2
    invoke-virtual {p0, p1}, Lj/g;->o0(Landroid/content/Context;)Lj/g$n;

    move-result-object p1

    invoke-virtual {p1}, Lj/g$n;->c()I

    move-result p1

    return p1

    :cond_3
    return p2

    :cond_4
    return v1
.end method
