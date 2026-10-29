.class public Lo5/p;
.super Lo5/o0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo5/p$g;,
        Lo5/p$i;,
        Lo5/p$h;
    }
.end annotation


# static fields
.field public static final U:Landroid/animation/TimeInterpolator;

.field public static final V:Landroid/animation/TimeInterpolator;

.field public static final W:Lo5/p$g;

.field public static final X:Lo5/p$g;

.field public static final Y:Lo5/p$g;

.field public static final Z:Lo5/p$g;

.field public static final a0:Lo5/p$g;

.field public static final b0:Lo5/p$g;


# instance fields
.field public S:Lo5/p$g;

.field public T:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    sput-object v0, Lo5/p;->U:Landroid/animation/TimeInterpolator;

    new-instance v0, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    sput-object v0, Lo5/p;->V:Landroid/animation/TimeInterpolator;

    new-instance v0, Lo5/p$a;

    invoke-direct {v0}, Lo5/p$a;-><init>()V

    sput-object v0, Lo5/p;->W:Lo5/p$g;

    new-instance v0, Lo5/p$b;

    invoke-direct {v0}, Lo5/p$b;-><init>()V

    sput-object v0, Lo5/p;->X:Lo5/p$g;

    new-instance v0, Lo5/p$c;

    invoke-direct {v0}, Lo5/p$c;-><init>()V

    sput-object v0, Lo5/p;->Y:Lo5/p$g;

    new-instance v0, Lo5/p$d;

    invoke-direct {v0}, Lo5/p$d;-><init>()V

    sput-object v0, Lo5/p;->Z:Lo5/p$g;

    new-instance v0, Lo5/p$e;

    invoke-direct {v0}, Lo5/p$e;-><init>()V

    sput-object v0, Lo5/p;->a0:Lo5/p$g;

    new-instance v0, Lo5/p$f;

    invoke-direct {v0}, Lo5/p$f;-><init>()V

    sput-object v0, Lo5/p;->b0:Lo5/p$g;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    invoke-direct {p0}, Lo5/o0;-><init>()V

    sget-object v0, Lo5/p;->b0:Lo5/p$g;

    iput-object v0, p0, Lo5/p;->S:Lo5/p$g;

    const/16 v0, 0x50

    iput v0, p0, Lo5/p;->T:I

    invoke-virtual {p0, p1}, Lo5/p;->I0(I)V

    return-void
.end method

.method private B0(Lo5/d0;)V
    .locals 2

    iget-object v0, p1, Lo5/d0;->b:Landroid/view/View;

    const/4 v1, 0x2

    new-array v1, v1, [I

    invoke-virtual {v0, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    iget-object p1, p1, Lo5/d0;->a:Ljava/util/Map;

    const-string v0, "android:slide:screenPosition"

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public D0(Landroid/view/ViewGroup;Landroid/view/View;Lo5/d0;Lo5/d0;)Landroid/animation/Animator;
    .locals 10
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    if-nez p4, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object p3, p4, Lo5/d0;->a:Ljava/util/Map;

    const-string v0, "android:slide:screenPosition"

    invoke-interface {p3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, [I

    invoke-virtual {p2}, Landroid/view/View;->getTranslationX()F

    move-result v6

    invoke-virtual {p2}, Landroid/view/View;->getTranslationY()F

    move-result v7

    iget-object v0, p0, Lo5/p;->S:Lo5/p$g;

    invoke-interface {v0, p1, p2}, Lo5/p$g;->b(Landroid/view/ViewGroup;Landroid/view/View;)F

    move-result v4

    iget-object v0, p0, Lo5/p;->S:Lo5/p$g;

    invoke-interface {v0, p1, p2}, Lo5/p$g;->a(Landroid/view/ViewGroup;Landroid/view/View;)F

    move-result v5

    const/4 p1, 0x0

    aget v2, p3, p1

    const/4 p1, 0x1

    aget v3, p3, p1

    sget-object v8, Lo5/p;->U:Landroid/animation/TimeInterpolator;

    move-object v9, p0

    move-object v0, p2

    move-object v1, p4

    invoke-static/range {v0 .. v9}, Lo5/f0;->a(Landroid/view/View;Lo5/d0;IIFFFFLandroid/animation/TimeInterpolator;Lo5/q;)Landroid/animation/Animator;

    move-result-object p1

    return-object p1
.end method

.method public F0(Landroid/view/ViewGroup;Landroid/view/View;Lo5/d0;Lo5/d0;)Landroid/animation/Animator;
    .locals 10
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object p4, p3, Lo5/d0;->a:Ljava/util/Map;

    const-string v0, "android:slide:screenPosition"

    invoke-interface {p4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, [I

    invoke-virtual {p2}, Landroid/view/View;->getTranslationX()F

    move-result v4

    invoke-virtual {p2}, Landroid/view/View;->getTranslationY()F

    move-result v5

    iget-object v0, p0, Lo5/p;->S:Lo5/p$g;

    invoke-interface {v0, p1, p2}, Lo5/p$g;->b(Landroid/view/ViewGroup;Landroid/view/View;)F

    move-result v6

    iget-object v0, p0, Lo5/p;->S:Lo5/p$g;

    invoke-interface {v0, p1, p2}, Lo5/p$g;->a(Landroid/view/ViewGroup;Landroid/view/View;)F

    move-result v7

    const/4 p1, 0x0

    aget v2, p4, p1

    const/4 p1, 0x1

    aget v3, p4, p1

    sget-object v8, Lo5/p;->V:Landroid/animation/TimeInterpolator;

    move-object v9, p0

    move-object v0, p2

    move-object v1, p3

    invoke-static/range {v0 .. v9}, Lo5/f0;->a(Landroid/view/View;Lo5/d0;IIFFFFLandroid/animation/TimeInterpolator;Lo5/q;)Landroid/animation/Animator;

    move-result-object p1

    return-object p1
.end method

.method public I0(I)V
    .locals 1

    const/4 v0, 0x3

    if-eq p1, v0, :cond_5

    const/4 v0, 0x5

    if-eq p1, v0, :cond_4

    const/16 v0, 0x30

    if-eq p1, v0, :cond_3

    const/16 v0, 0x50

    if-eq p1, v0, :cond_2

    const v0, 0x800003

    if-eq p1, v0, :cond_1

    const v0, 0x800005

    if-ne p1, v0, :cond_0

    sget-object v0, Lo5/p;->a0:Lo5/p$g;

    iput-object v0, p0, Lo5/p;->S:Lo5/p$g;

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid slide direction"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    sget-object v0, Lo5/p;->X:Lo5/p$g;

    iput-object v0, p0, Lo5/p;->S:Lo5/p$g;

    goto :goto_0

    :cond_2
    sget-object v0, Lo5/p;->b0:Lo5/p$g;

    iput-object v0, p0, Lo5/p;->S:Lo5/p$g;

    goto :goto_0

    :cond_3
    sget-object v0, Lo5/p;->Y:Lo5/p$g;

    iput-object v0, p0, Lo5/p;->S:Lo5/p$g;

    goto :goto_0

    :cond_4
    sget-object v0, Lo5/p;->Z:Lo5/p$g;

    iput-object v0, p0, Lo5/p;->S:Lo5/p$g;

    goto :goto_0

    :cond_5
    sget-object v0, Lo5/p;->W:Lo5/p$g;

    iput-object v0, p0, Lo5/p;->S:Lo5/p$g;

    :goto_0
    iput p1, p0, Lo5/p;->T:I

    new-instance v0, Lo5/o;

    invoke-direct {v0}, Lo5/o;-><init>()V

    invoke-virtual {v0, p1}, Lo5/o;->j(I)V

    invoke-virtual {p0, v0}, Lo5/q;->x0(Lo5/z;)V

    return-void
.end method

.method public Y()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public j(Lo5/d0;)V
    .locals 0
    .param p1    # Lo5/d0;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-super {p0, p1}, Lo5/o0;->j(Lo5/d0;)V

    invoke-direct {p0, p1}, Lo5/p;->B0(Lo5/d0;)V

    return-void
.end method

.method public o(Lo5/d0;)V
    .locals 0
    .param p1    # Lo5/d0;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-super {p0, p1}, Lo5/o0;->o(Lo5/d0;)V

    invoke-direct {p0, p1}, Lo5/p;->B0(Lo5/d0;)V

    return-void
.end method
