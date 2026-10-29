.class public Lmk/f$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnCapturedPointerListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmk/f;->G(Landroid/view/SurfaceView;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/view/SurfaceView;

.field public final synthetic b:Lmk/f;


# direct methods
.method public constructor <init>(Lmk/f;Landroid/view/SurfaceView;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lmk/f$d;->b:Lmk/f;

    iput-object p2, p0, Lmk/f$d;->a:Landroid/view/SurfaceView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCapturedPointer(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    invoke-static {}, Lcom/roblox/engine/jni/NativeInputInterface;->nativeGetMainWindowIsMouseLockedCenter()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lmk/f$d;->a:Landroid/view/SurfaceView;

    invoke-virtual {p1}, Landroid/view/View;->hasPointerCapture()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lmk/f$d;->a:Landroid/view/SurfaceView;

    invoke-virtual {p1}, Landroid/view/View;->releasePointerCapture()V

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object p1, p0, Lmk/f$d;->b:Lmk/f;

    invoke-virtual {p1, p2}, Lmk/f;->z(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method
