.class public Lmk/f$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnKeyListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmk/f;->G(Landroid/view/SurfaceView;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lmk/f;


# direct methods
.method public constructor <init>(Lmk/f;)V
    .locals 0

    iput-object p1, p0, Lmk/f$c;->a:Lmk/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 5

    invoke-virtual {p3}, Landroid/view/InputEvent;->getDevice()Landroid/view/InputDevice;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Key event is from a disconnected device for keyCode: "

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "rbx.input"

    invoke-static {p2, p1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    return v0

    :cond_0
    const/4 v1, 0x4

    if-eq p2, v1, :cond_3

    const/16 v1, 0x52

    if-eq p2, v1, :cond_1

    const/16 p1, 0x60

    if-eq p2, p1, :cond_3

    const/16 p1, 0x61

    if-eq p2, p1, :cond_3

    const/16 p1, 0x63

    if-eq p2, p1, :cond_3

    const/16 p1, 0x64

    if-eq p2, p1, :cond_3

    packed-switch p2, :pswitch_data_0

    packed-switch p2, :pswitch_data_1

    packed-switch p2, :pswitch_data_2

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Landroid/view/InputDevice;->getSources()I

    move-result v2

    const v3, 0x3000411

    and-int/2addr v2, v3

    if-ne v2, v3, :cond_2

    const/16 v2, 0x6c

    filled-new-array {v2}, [I

    move-result-object v3

    invoke-virtual {p1, v3}, Landroid/view/InputDevice;->hasKeys([I)[Z

    move-result-object p1

    aget-boolean p1, p1, v0

    if-nez p1, :cond_2

    move p2, v2

    :cond_2
    if-ne p2, v1, :cond_3

    :goto_0
    return v0

    :cond_3
    :pswitch_0
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getSource()I

    move-result p1

    const v1, 0x1000400

    and-int/2addr v1, p1

    const/4 v2, 0x1

    if-eqz v1, :cond_4

    move v1, v2

    goto :goto_1

    :cond_4
    move v1, v0

    :goto_1
    invoke-static {}, Lsg/a1;->t0()Z

    move-result v3

    if-eqz v3, :cond_5

    const v3, 0x2000200

    and-int/2addr p1, v3

    if-eqz p1, :cond_5

    move p1, v2

    goto :goto_2

    :cond_5
    move p1, v0

    :goto_2
    if-nez v1, :cond_7

    if-eqz p1, :cond_6

    goto :goto_3

    :cond_6
    move v3, v0

    goto :goto_4

    :cond_7
    :goto_3
    move v3, v2

    :goto_4
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result v4

    if-nez v4, :cond_8

    move v0, v2

    :cond_8
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getDeviceId()I

    move-result p3

    if-eqz v1, :cond_9

    iget-object p1, p0, Lmk/f$c;->a:Lmk/f;

    invoke-static {p1, p3}, Lmk/f;->f(Lmk/f;I)V

    invoke-static {p3, p2, v0}, Lcom/roblox/engine/jni/NativeInputInterface;->nativeGamepadButtonEvent(III)V

    return v3

    :cond_9
    if-eqz p1, :cond_a

    iget-object p1, p0, Lmk/f$c;->a:Lmk/f;

    invoke-static {p1, p3}, Lmk/f;->g(Lmk/f;I)V

    invoke-static {p3, p2, v0}, Lcom/roblox/engine/jni/NativeInputInterface;->nativeTVRemoteButtonEvent(III)V

    :cond_a
    return v3

    nop

    :pswitch_data_0
    .packed-switch 0x13
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x66
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0xb7
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
