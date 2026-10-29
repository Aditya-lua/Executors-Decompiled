.class public Lmk/f$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnGenericMotionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmk/f;->G(Landroid/view/SurfaceView;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public a:[F

.field public final synthetic b:Landroid/view/SurfaceView;

.field public final synthetic c:Lmk/f;


# direct methods
.method public constructor <init>(Lmk/f;Landroid/view/SurfaceView;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lmk/f$e;->c:Lmk/f;

    iput-object p2, p0, Lmk/f$e;->b:Landroid/view/SurfaceView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 p1, 0x8

    new-array p1, p1, [F

    iput-object p1, p0, Lmk/f$e;->a:[F

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/MotionEvent;Landroid/view/InputDevice;II)F
    .locals 1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getSource()I

    move-result v0

    invoke-virtual {p2, p3, v0}, Landroid/view/InputDevice;->getMotionRange(II)Landroid/view/InputDevice$MotionRange;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Landroid/view/InputDevice$MotionRange;->getFlat()F

    move-result p2

    if-gez p4, :cond_0

    invoke-virtual {p1, p3}, Landroid/view/MotionEvent;->getAxisValue(I)F

    move-result p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1, p3, p4}, Landroid/view/MotionEvent;->getHistoricalAxisValue(II)F

    move-result p1

    :goto_0
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p3

    cmpl-float p2, p3, p2

    if-lez p2, :cond_1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final b(Landroid/view/MotionEvent;I)V
    .locals 5

    invoke-virtual {p1}, Landroid/view/InputEvent;->getDevice()Landroid/view/InputDevice;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lmk/f$e;->a:[F

    const/4 v2, 0x0

    invoke-virtual {p0, p1, v0, v2, p2}, Lmk/f$e;->a(Landroid/view/MotionEvent;Landroid/view/InputDevice;II)F

    move-result v3

    aput v3, v1, v2

    iget-object v1, p0, Lmk/f$e;->a:[F

    const/4 v2, 0x1

    invoke-virtual {p0, p1, v0, v2, p2}, Lmk/f$e;->a(Landroid/view/MotionEvent;Landroid/view/InputDevice;II)F

    move-result v3

    aput v3, v1, v2

    iget-object v1, p0, Lmk/f$e;->a:[F

    const/16 v2, 0xb

    invoke-virtual {p0, p1, v0, v2, p2}, Lmk/f$e;->a(Landroid/view/MotionEvent;Landroid/view/InputDevice;II)F

    move-result v2

    const/4 v3, 0x2

    aput v2, v1, v3

    iget-object v1, p0, Lmk/f$e;->a:[F

    const/16 v2, 0xe

    invoke-virtual {p0, p1, v0, v2, p2}, Lmk/f$e;->a(Landroid/view/MotionEvent;Landroid/view/InputDevice;II)F

    move-result v2

    const/4 v3, 0x3

    aput v2, v1, v3

    const/16 v1, 0x11

    invoke-virtual {p0, p1, v0, v1, p2}, Lmk/f$e;->a(Landroid/view/MotionEvent;Landroid/view/InputDevice;II)F

    move-result v1

    const/16 v2, 0x17

    invoke-virtual {p0, p1, v0, v2, p2}, Lmk/f$e;->a(Landroid/view/MotionEvent;Landroid/view/InputDevice;II)F

    move-result v2

    iget-object v3, p0, Lmk/f$e;->a:[F

    const/4 v4, 0x4

    invoke-static {v1, v2}, Ljava/lang/Math;->max(FF)F

    move-result v1

    aput v1, v3, v4

    const/16 v1, 0x12

    invoke-virtual {p0, p1, v0, v1, p2}, Lmk/f$e;->a(Landroid/view/MotionEvent;Landroid/view/InputDevice;II)F

    move-result v1

    const/16 v2, 0x16

    invoke-virtual {p0, p1, v0, v2, p2}, Lmk/f$e;->a(Landroid/view/MotionEvent;Landroid/view/InputDevice;II)F

    move-result v2

    iget-object v3, p0, Lmk/f$e;->a:[F

    const/4 v4, 0x5

    invoke-static {v1, v2}, Ljava/lang/Math;->max(FF)F

    move-result v1

    aput v1, v3, v4

    iget-object v1, p0, Lmk/f$e;->a:[F

    const/16 v2, 0xf

    invoke-virtual {p0, p1, v0, v2, p2}, Lmk/f$e;->a(Landroid/view/MotionEvent;Landroid/view/InputDevice;II)F

    move-result v2

    const/4 v3, 0x6

    aput v2, v1, v3

    iget-object v1, p0, Lmk/f$e;->a:[F

    const/16 v2, 0x10

    invoke-virtual {p0, p1, v0, v2, p2}, Lmk/f$e;->a(Landroid/view/MotionEvent;Landroid/view/InputDevice;II)F

    move-result p1

    const/4 p2, 0x7

    aput p1, v1, p2

    return-void
.end method

.method public onGenericMotion(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 6

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getSource()I

    move-result p1

    const/16 v0, 0x2002

    and-int/2addr p1, v0

    const/4 v1, 0x0

    if-eq p1, v0, :cond_5

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getSource()I

    move-result p1

    const v0, 0x100008

    and-int/2addr p1, v0

    if-ne p1, v0, :cond_0

    goto/16 :goto_3

    :cond_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getSource()I

    move-result p1

    const/16 v0, 0x401

    and-int/2addr p1, v0

    if-eq p1, v0, :cond_1

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getSource()I

    move-result p1

    const v0, 0x1000010

    and-int/2addr p1, v0

    if-eq p1, v0, :cond_1

    return v1

    :cond_1
    invoke-virtual {p2}, Landroid/view/InputEvent;->getDevice()Landroid/view/InputDevice;

    move-result-object p1

    if-nez p1, :cond_2

    const-string p1, "rbx.input"

    const-string p2, "Motion event is from a disconnected device"

    invoke-static {p1, p2}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    return v1

    :cond_2
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getHistorySize()I

    move-result p1

    move v0, v1

    :goto_0
    if-ge v0, p1, :cond_3

    invoke-virtual {p0, p2, v0}, Lmk/f$e;->b(Landroid/view/MotionEvent;I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    const/4 p1, -0x1

    invoke-virtual {p0, p2, p1}, Lmk/f$e;->b(Landroid/view/MotionEvent;I)V

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getDeviceId()I

    move-result p1

    iget-object p2, p0, Lmk/f$e;->c:Lmk/f;

    invoke-static {p2, p1}, Lmk/f;->f(Lmk/f;I)V

    move p2, v1

    :goto_1
    iget-object v0, p0, Lmk/f$e;->a:[F

    array-length v2, v0

    const/4 v3, 0x1

    if-ge p2, v2, :cond_4

    const/4 v2, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x0

    packed-switch p2, :pswitch_data_0

    goto :goto_2

    :pswitch_0
    const/4 v2, 0x7

    aget v0, v0, v2

    neg-float v0, v0

    const/16 v2, 0x10

    invoke-static {p1, v2, v5, v5, v0}, Lcom/roblox/engine/jni/NativeInputInterface;->nativeGamepadAxisEvent(IIFFF)V

    goto :goto_2

    :pswitch_1
    const/4 v2, 0x6

    aget v0, v0, v2

    const/16 v2, 0xf

    invoke-static {p1, v2, v5, v5, v0}, Lcom/roblox/engine/jni/NativeInputInterface;->nativeGamepadAxisEvent(IIFFF)V

    goto :goto_2

    :pswitch_2
    const/4 v2, 0x5

    aget v0, v0, v2

    const/16 v2, 0x12

    invoke-static {p1, v2, v5, v5, v0}, Lcom/roblox/engine/jni/NativeInputInterface;->nativeGamepadAxisEvent(IIFFF)V

    goto :goto_2

    :pswitch_3
    const/4 v2, 0x4

    aget v0, v0, v2

    const/16 v2, 0x11

    invoke-static {p1, v2, v5, v5, v0}, Lcom/roblox/engine/jni/NativeInputInterface;->nativeGamepadAxisEvent(IIFFF)V

    goto :goto_2

    :pswitch_4
    aget v3, v0, v4

    aget v0, v0, v2

    neg-float v0, v0

    const/16 v2, 0xe

    invoke-static {p1, v2, v3, v0, v5}, Lcom/roblox/engine/jni/NativeInputInterface;->nativeGamepadAxisEvent(IIFFF)V

    goto :goto_2

    :pswitch_5
    aget v3, v0, v4

    aget v0, v0, v2

    neg-float v0, v0

    const/16 v2, 0xb

    invoke-static {p1, v2, v3, v0, v5}, Lcom/roblox/engine/jni/NativeInputInterface;->nativeGamepadAxisEvent(IIFFF)V

    goto :goto_2

    :pswitch_6
    aget v2, v0, v1

    aget v0, v0, v3

    neg-float v0, v0

    invoke-static {p1, v3, v2, v0, v5}, Lcom/roblox/engine/jni/NativeInputInterface;->nativeGamepadAxisEvent(IIFFF)V

    goto :goto_2

    :pswitch_7
    aget v2, v0, v1

    aget v0, v0, v3

    neg-float v0, v0

    invoke-static {p1, v1, v2, v0, v5}, Lcom/roblox/engine/jni/NativeInputInterface;->nativeGamepadAxisEvent(IIFFF)V

    :goto_2
    add-int/lit8 p2, p2, 0x1

    goto :goto_1

    :cond_4
    return v3

    :cond_5
    :goto_3
    invoke-static {}, Lcom/roblox/engine/jni/NativeInputInterface;->nativeGetMainWindowIsMouseLockedCenter()Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Lmk/f$e;->b:Landroid/view/SurfaceView;

    invoke-virtual {p1}, Landroid/view/View;->hasPointerCapture()Z

    move-result p1

    if-nez p1, :cond_6

    iget-object p1, p0, Lmk/f$e;->b:Landroid/view/SurfaceView;

    invoke-virtual {p1}, Landroid/view/View;->requestPointerCapture()V

    return v1

    :cond_6
    iget-object p1, p0, Lmk/f$e;->c:Lmk/f;

    invoke-virtual {p1, p2}, Lmk/f;->y(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
