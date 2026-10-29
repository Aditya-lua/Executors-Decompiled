.class public final Landroidx/core/view/r0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/core/view/r0$a;,
        Landroidx/core/view/r0$b;,
        Landroidx/core/view/r0$c;
    }
.end annotation


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static a(Landroid/content/res/Resources;ILx2/h;I)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/res/Resources;",
            "I",
            "Lx2/h<",
            "Ljava/lang/Integer;",
            ">;I)I"
        }
    .end annotation

    const/4 v0, -0x1

    if-eq p1, v0, :cond_2

    if-eqz p1, :cond_1

    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p0

    if-gez p0, :cond_0

    goto :goto_0

    :cond_0
    return p0

    :cond_1
    :goto_0
    return p3

    :cond_2
    invoke-interface {p2}, Lx2/h;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0
.end method

.method public static b(Landroid/content/res/Resources;Ljava/lang/String;Ljava/lang/String;)I
    .locals 1

    const-string v0, "android"

    invoke-virtual {p0, p1, p2, v0}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method public static c(Landroid/content/res/Resources;II)I
    .locals 1

    const/high16 v0, 0x400000

    if-ne p1, v0, :cond_0

    const/16 p1, 0x1a

    if-ne p2, p1, :cond_0

    const-string p1, "config_viewMaxRotaryEncoderFlingVelocity"

    const-string p2, "dimen"

    invoke-static {p0, p1, p2}, Landroidx/core/view/r0;->b(Landroid/content/res/Resources;Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    return p0

    :cond_0
    const/4 p0, -0x1

    return p0
.end method

.method public static d(Landroid/content/res/Resources;II)I
    .locals 1

    const/high16 v0, 0x400000

    if-ne p1, v0, :cond_0

    const/16 p1, 0x1a

    if-ne p2, p1, :cond_0

    const-string p1, "config_viewMinRotaryEncoderFlingVelocity"

    const-string p2, "dimen"

    invoke-static {p0, p1, p2}, Landroidx/core/view/r0;->b(Landroid/content/res/Resources;Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    return p0

    :cond_0
    const/4 p0, -0x1

    return p0
.end method

.method public static e(Landroid/view/ViewConfiguration;Landroid/content/Context;)F
    .locals 0

    invoke-static {p0}, Landroidx/core/view/r0$a;->a(Landroid/view/ViewConfiguration;)F

    move-result p0

    return p0
.end method

.method public static f(Landroid/content/Context;Landroid/view/ViewConfiguration;III)I
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    invoke-static {p1, p2, p3, p4}, Landroidx/core/view/r0$c;->a(Landroid/view/ViewConfiguration;III)I

    move-result p0

    return p0

    :cond_0
    invoke-static {p2, p3, p4}, Landroidx/core/view/r0;->i(III)Z

    move-result p2

    const/high16 v0, -0x80000000

    if-nez p2, :cond_1

    return v0

    :cond_1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-static {p0, p4, p3}, Landroidx/core/view/r0;->c(Landroid/content/res/Resources;II)I

    move-result p2

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p3, Landroidx/core/view/p0;

    invoke-direct {p3, p1}, Landroidx/core/view/p0;-><init>(Landroid/view/ViewConfiguration;)V

    invoke-static {p0, p2, p3, v0}, Landroidx/core/view/r0;->a(Landroid/content/res/Resources;ILx2/h;I)I

    move-result p0

    return p0
.end method

.method public static g(Landroid/content/Context;Landroid/view/ViewConfiguration;III)I
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    invoke-static {p1, p2, p3, p4}, Landroidx/core/view/r0$c;->b(Landroid/view/ViewConfiguration;III)I

    move-result p0

    return p0

    :cond_0
    invoke-static {p2, p3, p4}, Landroidx/core/view/r0;->i(III)Z

    move-result p2

    const v0, 0x7fffffff

    if-nez p2, :cond_1

    return v0

    :cond_1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-static {p0, p4, p3}, Landroidx/core/view/r0;->d(Landroid/content/res/Resources;II)I

    move-result p2

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p3, Landroidx/core/view/q0;

    invoke-direct {p3, p1}, Landroidx/core/view/q0;-><init>(Landroid/view/ViewConfiguration;)V

    invoke-static {p0, p2, p3, v0}, Landroidx/core/view/r0;->a(Landroid/content/res/Resources;ILx2/h;I)I

    move-result p0

    return p0
.end method

.method public static h(Landroid/view/ViewConfiguration;Landroid/content/Context;)F
    .locals 0

    invoke-static {p0}, Landroidx/core/view/r0$a;->b(Landroid/view/ViewConfiguration;)F

    move-result p0

    return p0
.end method

.method public static i(III)Z
    .locals 0

    invoke-static {p0}, Landroid/view/InputDevice;->getDevice(I)Landroid/view/InputDevice;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0, p1, p2}, Landroid/view/InputDevice;->getMotionRange(II)Landroid/view/InputDevice$MotionRange;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static j(Landroid/view/ViewConfiguration;Landroid/content/Context;)Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    invoke-static {p0}, Landroidx/core/view/r0$b;->a(Landroid/view/ViewConfiguration;)Z

    move-result p0

    return p0

    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    const-string p1, "config_showMenuShortcutsWhenKeyboardPresent"

    const-string v0, "bool"

    invoke-static {p0, p1, v0}, Landroidx/core/view/r0;->b(Landroid/content/res/Resources;Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result p0

    if-eqz p0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method
