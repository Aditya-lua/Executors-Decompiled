.class public Lmk/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;
.implements Lmk/i$a;
.implements Lmk/j$a;
.implements Landroid/hardware/SensorEventListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmk/f$g;,
        Lmk/f$f;,
        Lmk/f$h;
    }
.end annotation


# static fields
.field public static F:[I

.field public static G:[I


# instance fields
.field public final A:Landroid/app/Activity;

.field public B:Lmk/f$f;

.field public final C:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public D:Z

.field public E:Landroid/view/VelocityTracker;

.field public a:Landroid/view/SurfaceView;

.field public b:Z

.field public c:Landroid/view/GestureDetector;

.field public d:Lmk/f$g;

.field public e:Lmk/i;

.field public f:Lmk/j;

.field public g:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lmk/f$h;",
            ">;"
        }
    .end annotation
.end field

.field public h:Landroid/hardware/SensorManager;

.field public i:Landroid/hardware/Sensor;

.field public j:Landroid/hardware/Sensor;

.field public k:Landroid/view/OrientationEventListener;

.field public l:Z

.field public m:F

.field public n:F

.field public o:Z

.field public p:Z

.field public q:F

.field public final r:[F

.field public final s:[F

.field public final t:[F

.field public final u:[F

.field public final v:[F

.field public final w:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final x:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public y:Landroid/hardware/input/InputManager;

.field public z:Landroid/hardware/input/InputManager$InputDeviceListener;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xe

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lmk/f;->F:[I

    const/16 v0, 0xa

    new-array v0, v0, [I

    fill-array-data v0, :array_1

    sput-object v0, Lmk/f;->G:[I

    return-void

    nop

    :array_0
    .array-data 4
        0x60
        0x61
        0x63
        0x64
        0x13
        0x14
        0x15
        0x16
        0x67
        0x66
        0x6a
        0x6b
        0x6d
        0x6c
    .end array-data

    :array_1
    .array-data 4
        0x13
        0x14
        0x15
        0x16
        0x17
        0x4
        0xb7
        0xb8
        0xb9
        0xba
    .end array-data
.end method

.method public constructor <init>(Landroid/app/Activity;Landroid/view/SurfaceView;Lmk/f$f;)V
    .locals 5
    .param p1    # Landroid/app/Activity;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lmk/f;->a:Landroid/view/SurfaceView;

    const/4 v1, 0x1

    iput-boolean v1, p0, Lmk/f;->b:Z

    iput-object v0, p0, Lmk/f;->c:Landroid/view/GestureDetector;

    iput-object v0, p0, Lmk/f;->d:Lmk/f$g;

    iput-object v0, p0, Lmk/f;->e:Lmk/i;

    iput-object v0, p0, Lmk/f;->f:Lmk/j;

    new-instance v2, Landroid/util/SparseArray;

    invoke-direct {v2}, Landroid/util/SparseArray;-><init>()V

    iput-object v2, p0, Lmk/f;->g:Landroid/util/SparseArray;

    iput-object v0, p0, Lmk/f;->h:Landroid/hardware/SensorManager;

    iput-object v0, p0, Lmk/f;->i:Landroid/hardware/Sensor;

    iput-object v0, p0, Lmk/f;->j:Landroid/hardware/Sensor;

    iput-object v0, p0, Lmk/f;->k:Landroid/view/OrientationEventListener;

    const/4 v2, 0x0

    iput-boolean v2, p0, Lmk/f;->l:Z

    const/4 v3, 0x0

    iput v3, p0, Lmk/f;->m:F

    iput v3, p0, Lmk/f;->n:F

    iput-boolean v2, p0, Lmk/f;->o:Z

    iput-boolean v2, p0, Lmk/f;->p:Z

    const/high16 v2, 0x3f800000    # 1.0f

    iput v2, p0, Lmk/f;->q:F

    const/4 v2, 0x4

    new-array v2, v2, [F

    iput-object v2, p0, Lmk/f;->r:[F

    const/16 v2, 0x9

    new-array v2, v2, [F

    iput-object v2, p0, Lmk/f;->s:[F

    const/4 v2, 0x3

    new-array v3, v2, [F

    iput-object v3, p0, Lmk/f;->t:[F

    new-array v3, v2, [F

    iput-object v3, p0, Lmk/f;->u:[F

    new-array v3, v2, [F

    iput-object v3, p0, Lmk/f;->v:[F

    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    iput-object v3, p0, Lmk/f;->w:Ljava/util/Set;

    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    iput-object v3, p0, Lmk/f;->x:Ljava/util/Set;

    iput-object v0, p0, Lmk/f;->z:Landroid/hardware/input/InputManager$InputDeviceListener;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, p0, Lmk/f;->C:Ljava/util/List;

    iput-object p2, p0, Lmk/f;->a:Landroid/view/SurfaceView;

    iput-object p1, p0, Lmk/f;->A:Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    const-string v4, "android.hardware.touchscreen"

    invoke-virtual {v3, v4}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v3

    iput-boolean v3, p0, Lmk/f;->b:Z

    iput-object p3, p0, Lmk/f;->B:Lmk/f$f;

    if-nez v3, :cond_0

    invoke-static {}, Lsg/a1;->q0()Z

    move-result p3

    if-nez p3, :cond_1

    :cond_0
    new-instance p3, Lmk/f$g;

    invoke-direct {p3, p0, v0}, Lmk/f$g;-><init>(Lmk/f;Lmk/g;)V

    iput-object p3, p0, Lmk/f;->d:Lmk/f$g;

    new-instance p3, Landroid/view/GestureDetector;

    iget-object v0, p0, Lmk/f;->d:Lmk/f$g;

    invoke-direct {p3, p1, v0}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object p3, p0, Lmk/f;->c:Landroid/view/GestureDetector;

    new-instance p3, Lmk/i;

    invoke-direct {p3, p0}, Lmk/i;-><init>(Lmk/i$a;)V

    iput-object p3, p0, Lmk/f;->e:Lmk/i;

    new-instance p3, Lmk/j;

    invoke-direct {p3, p0}, Lmk/j;-><init>(Lmk/j$a;)V

    iput-object p3, p0, Lmk/f;->f:Lmk/j;

    :cond_1
    invoke-virtual {p0, p2}, Lmk/f;->G(Landroid/view/SurfaceView;)V

    invoke-virtual {p1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object p2

    const-string p3, "sensor"

    invoke-virtual {p2, p3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/hardware/SensorManager;

    iput-object p2, p0, Lmk/f;->h:Landroid/hardware/SensorManager;

    invoke-virtual {p1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object p2

    const-string p3, "input"

    invoke-virtual {p2, p3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/hardware/input/InputManager;

    iput-object p2, p0, Lmk/f;->y:Landroid/hardware/input/InputManager;

    invoke-virtual {p0}, Lmk/f;->v()V

    iget-object p2, p0, Lmk/f;->h:Landroid/hardware/SensorManager;

    invoke-virtual {p2, v1}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object p2

    iput-object p2, p0, Lmk/f;->i:Landroid/hardware/Sensor;

    iget-object p2, p0, Lmk/f;->h:Landroid/hardware/SensorManager;

    const/16 p3, 0xb

    invoke-virtual {p2, p3}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object p2

    iput-object p2, p0, Lmk/f;->j:Landroid/hardware/Sensor;

    if-eqz p2, :cond_2

    invoke-static {v1}, Lcom/roblox/engine/jni/NativeInputInterface;->nativeSetGyroscopeEnabled(Z)V

    :cond_2
    iget-object p2, p0, Lmk/f;->i:Landroid/hardware/Sensor;

    if-eqz p2, :cond_3

    invoke-static {v1}, Lcom/roblox/engine/jni/NativeInputInterface;->nativeSetAccelerometerEnabled(Z)V

    :cond_3
    new-instance p2, Lmk/f$a;

    invoke-direct {p2, p0, p1, v2}, Lmk/f$a;-><init>(Lmk/f;Landroid/content/Context;I)V

    iput-object p2, p0, Lmk/f;->k:Landroid/view/OrientationEventListener;

    invoke-virtual {p2}, Landroid/view/OrientationEventListener;->canDetectOrientation()Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lmk/f;->k:Landroid/view/OrientationEventListener;

    invoke-virtual {p1}, Landroid/view/OrientationEventListener;->enable()V

    :cond_4
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->u5()Z

    move-result p1

    iput-boolean p1, p0, Lmk/f;->D:Z

    return-void
.end method

.method public static synthetic c(Lmk/f;Landroid/view/SurfaceView;Z)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lmk/f;->w(Landroid/view/SurfaceView;Z)V

    return-void
.end method

.method public static bridge synthetic d(Lmk/f;)Landroid/view/SurfaceView;
    .locals 0

    iget-object p0, p0, Lmk/f;->a:Landroid/view/SurfaceView;

    return-object p0
.end method

.method public static bridge synthetic e(Lmk/f;Z)V
    .locals 0

    iput-boolean p1, p0, Lmk/f;->p:Z

    return-void
.end method

.method public static bridge synthetic f(Lmk/f;I)V
    .locals 0

    invoke-virtual {p0, p1}, Lmk/f;->o(I)V

    return-void
.end method

.method public static bridge synthetic g(Lmk/f;I)V
    .locals 0

    invoke-virtual {p0, p1}, Lmk/f;->p(I)V

    return-void
.end method

.method public static bridge synthetic h(Lmk/f;)F
    .locals 0

    invoke-virtual {p0}, Lmk/f;->q()F

    move-result p0

    return p0
.end method

.method public static bridge synthetic i(Lmk/f;I)V
    .locals 0

    invoke-virtual {p0, p1}, Lmk/f;->s(I)V

    return-void
.end method

.method public static bridge synthetic j(Lmk/f;I)V
    .locals 0

    invoke-virtual {p0, p1}, Lmk/f;->t(I)V

    return-void
.end method

.method public static bridge synthetic k(Lmk/f;I)V
    .locals 0

    invoke-virtual {p0, p1}, Lmk/f;->u(I)V

    return-void
.end method

.method public static bridge synthetic l(Lmk/f;)V
    .locals 0

    invoke-virtual {p0}, Lmk/f;->J()V

    return-void
.end method

.method public static bridge synthetic m(Landroid/view/MotionEvent;F)[F
    .locals 0

    invoke-static {p0, p1}, Lmk/f;->r(Landroid/view/MotionEvent;F)[F

    move-result-object p0

    return-object p0
.end method

.method public static n(I[F)[F
    .locals 6

    const/4 v0, 0x1

    const/4 v1, -0x1

    const/4 v2, 0x0

    filled-new-array {v0, v1, v2, v0}, [I

    move-result-object v3

    filled-new-array {v1, v1, v0, v2}, [I

    move-result-object v4

    filled-new-array {v1, v0, v2, v0}, [I

    move-result-object v1

    filled-new-array {v0, v0, v0, v2}, [I

    move-result-object v5

    filled-new-array {v3, v4, v1, v5}, [[I

    move-result-object v1

    aget-object p0, v1, p0

    aget v1, p0, v2

    int-to-float v1, v1

    const/4 v3, 0x2

    aget v4, p0, v3

    aget v4, p1, v4

    mul-float/2addr v1, v4

    aget v4, p0, v0

    int-to-float v4, v4

    const/4 v5, 0x3

    aget p0, p0, v5

    aget p0, p1, p0

    mul-float/2addr v4, p0

    aget p0, p1, v3

    new-array p1, v5, [F

    aput v1, p1, v2

    aput v4, p1, v0

    aput p0, p1, v3

    return-object p1
.end method

.method public static r(Landroid/view/MotionEvent;F)[F
    .locals 5

    invoke-virtual {p0}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v0

    mul-int/lit8 v1, v0, 0x2

    new-array v1, v1, [F

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    mul-int/lit8 v3, v2, 0x2

    invoke-virtual {p0, v2}, Landroid/view/MotionEvent;->getX(I)F

    move-result v4

    div-float/2addr v4, p1

    aput v4, v1, v3

    add-int/lit8 v3, v3, 0x1

    invoke-virtual {p0, v2}, Landroid/view/MotionEvent;->getY(I)F

    move-result v4

    div-float/2addr v4, p1

    aput v4, v1, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public static x(Ljava/lang/String;)I
    .locals 3

    const/4 v0, 0x0

    if-eqz p0, :cond_7

    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_2

    :cond_0
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p0, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    const-string v1, "XBOX"

    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 p0, 0x3

    return p0

    :cond_1
    const-string v1, "DUALSENSE"

    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_6

    const-string v1, "PS5"

    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    const-string v1, "DUALSHOCK"

    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_5

    const-string v1, "PS4"

    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_0

    :cond_3
    const-string v1, "PLAYSTATION"

    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_4

    return v2

    :cond_4
    return v0

    :cond_5
    :goto_0
    return v2

    :cond_6
    :goto_1
    const/4 p0, 0x2

    return p0

    :cond_7
    :goto_2
    return v0
.end method


# virtual methods
.method public A(II)V
    .locals 1

    int-to-float p1, p1

    int-to-float p2, p2

    const/4 v0, 0x1

    invoke-static {v0, p1, p2}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassSwipeGesture(IFF)V

    return-void
.end method

.method public B(II)V
    .locals 1

    int-to-float p1, p1

    int-to-float p2, p2

    const/4 v0, 0x2

    invoke-static {v0, p1, p2}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassSwipeGesture(IFF)V

    return-void
.end method

.method public C(II)V
    .locals 1

    int-to-float p1, p1

    int-to-float p2, p2

    const/4 v0, 0x0

    invoke-static {v0, p1, p2}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassSwipeGesture(IFF)V

    return-void
.end method

.method public D(II)V
    .locals 1

    int-to-float p1, p1

    int-to-float p2, p2

    const/4 v0, 0x3

    invoke-static {v0, p1, p2}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassSwipeGesture(IFF)V

    return-void
.end method

.method public final E(II)V
    .locals 9

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    sget-object v2, Lmk/f;->F:[I

    array-length v2, v2

    new-array v2, v2, [Z

    iget-object v3, p0, Lmk/f;->y:Landroid/hardware/input/InputManager;

    invoke-virtual {v3, p1}, Landroid/hardware/input/InputManager;->getInputDevice(I)Landroid/view/InputDevice;

    move-result-object v3

    if-eqz v3, :cond_0

    sget-object v2, Lmk/f;->F:[I

    invoke-virtual {v3, v2}, Landroid/view/InputDevice;->hasKeys([I)[Z

    move-result-object v2

    :cond_0
    const/4 v3, 0x0

    move v4, v3

    :goto_0
    array-length v5, v2

    if-ge v4, v5, :cond_1

    sget-object v5, Lmk/f;->F:[I

    aget v5, v5, v4

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aget-boolean v6, v2, v4

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    invoke-virtual {v0, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v4, 0xb

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v4, 0xe

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v4, 0x17

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v4, 0x16

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v4, 0x11

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v4, 0x12

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v4, 0xf

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v1, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v5, 0x10

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v1, v6, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Landroid/view/InputDevice;->getDevice(I)Landroid/view/InputDevice;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Landroid/view/InputDevice;->getMotionRanges()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/view/InputDevice$MotionRange;

    invoke-virtual {v6}, Landroid/view/InputDevice$MotionRange;->getAxis()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v1, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    invoke-static {p1, v6, v3, p2}, Lcom/roblox/engine/jni/NativeInputInterface;->nativeSetGamepadSupportedKeyWithGamepadType(IIZI)V

    goto :goto_2

    :cond_3
    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    const/4 v7, -0x1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    invoke-static {p1, v6, v7, v8, p2}, Lcom/roblox/engine/jni/NativeInputInterface;->nativeSetGamepadSupportedMotionWithGamepadType(IIIZI)V

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    if-eq v6, v4, :cond_5

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    if-ne v6, v5, :cond_4

    :cond_5
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-static {p1, v3, v2, v1, p2}, Lcom/roblox/engine/jni/NativeInputInterface;->nativeSetGamepadSupportedMotionWithGamepadType(IIIZI)V

    goto :goto_3

    :cond_6
    return-void
.end method

.method public final F(I)V
    .locals 4

    sget-object v0, Lmk/f;->G:[I

    array-length v0, v0

    new-array v0, v0, [Z

    iget-object v1, p0, Lmk/f;->y:Landroid/hardware/input/InputManager;

    invoke-virtual {v1, p1}, Landroid/hardware/input/InputManager;->getInputDevice(I)Landroid/view/InputDevice;

    move-result-object v1

    if-eqz v1, :cond_0

    sget-object v0, Lmk/f;->G:[I

    invoke-virtual {v1, v0}, Landroid/view/InputDevice;->hasKeys([I)[Z

    move-result-object v0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    array-length v2, v0

    if-ge v1, v2, :cond_1

    sget-object v2, Lmk/f;->G:[I

    aget v2, v2, v1

    aget-boolean v3, v0, v1

    invoke-static {p1, v2, v3}, Lcom/roblox/engine/jni/NativeInputInterface;->nativeSetTVRemoteSupportedKey(IIZ)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final G(Landroid/view/SurfaceView;)V
    .locals 2

    new-instance v0, Lmk/f$c;

    invoke-direct {v0, p0}, Lmk/f$c;-><init>(Lmk/f;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    new-instance v0, Lmk/f$d;

    invoke-direct {v0, p0, p1}, Lmk/f$d;-><init>(Lmk/f;Landroid/view/SurfaceView;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnCapturedPointerListener(Landroid/view/View$OnCapturedPointerListener;)V

    iget-object v0, p0, Lmk/f;->A:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v1, Lmk/e;

    invoke-direct {v1, p0, p1}, Lmk/e;-><init>(Lmk/f;Landroid/view/SurfaceView;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnWindowFocusChangeListener(Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;)V

    new-instance v0, Lmk/f$e;

    invoke-direct {v0, p0, p1}, Lmk/f$e;-><init>(Lmk/f;Landroid/view/SurfaceView;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnGenericMotionListener(Landroid/view/View$OnGenericMotionListener;)V

    return-void
.end method

.method public H(Z)V
    .locals 2

    iget-boolean v0, p0, Lmk/f;->l:Z

    if-nez v0, :cond_0

    iput-boolean p1, p0, Lmk/f;->l:Z

    :cond_0
    iget-boolean p1, p0, Lmk/f;->l:Z

    if-eqz p1, :cond_1

    iget-object p1, p0, Lmk/f;->h:Landroid/hardware/SensorManager;

    iget-object v0, p0, Lmk/f;->j:Landroid/hardware/Sensor;

    const/4 v1, 0x1

    invoke-virtual {p1, p0, v0, v1}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    iget-object p1, p0, Lmk/f;->h:Landroid/hardware/SensorManager;

    iget-object v0, p0, Lmk/f;->i:Landroid/hardware/Sensor;

    invoke-virtual {p1, p0, v0, v1}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    :cond_1
    return-void
.end method

.method public I()V
    .locals 1

    iget-object v0, p0, Lmk/f;->h:Landroid/hardware/SensorManager;

    invoke-virtual {v0, p0}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V

    return-void
.end method

.method public final J()V
    .locals 5

    iget-object v0, p0, Lmk/f;->A:Landroid/app/Activity;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Display;->getRotation()I

    move-result v1

    new-instance v2, Landroid/graphics/Point;

    const/4 v3, 0x0

    invoke-direct {v2, v3, v3}, Landroid/graphics/Point;-><init>(II)V

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    iget v0, v2, Landroid/graphics/Point;->x:I

    iget v2, v2, Landroid/graphics/Point;->y:I

    const/4 v4, 0x3

    if-ge v0, v2, :cond_1

    move v3, v4

    goto :goto_1

    :cond_1
    const/4 v0, 0x1

    const/4 v2, 0x2

    if-eqz v1, :cond_4

    if-ne v1, v2, :cond_2

    goto :goto_0

    :cond_2
    if-ne v1, v4, :cond_3

    goto :goto_1

    :cond_3
    move v3, v0

    goto :goto_1

    :cond_4
    :goto_0
    if-ne v1, v2, :cond_3

    :goto_1
    invoke-static {v3}, Lcom/roblox/engine/jni/NativeInputInterface;->nativeUpdateScreenOrientation(I)V

    return-void
.end method

.method public a(Lmk/i;)V
    .locals 7

    invoke-virtual {p1}, Lmk/i;->b()F

    move-result v1

    invoke-virtual {p1}, Lmk/i;->e()I

    move-result v0

    invoke-virtual {p1}, Lmk/i;->c()Landroid/graphics/Point;

    move-result-object v2

    invoke-virtual {p1}, Lmk/i;->d()Landroid/graphics/Point;

    move-result-object p1

    iget v3, v2, Landroid/graphics/Point;->x:I

    int-to-float v3, v3

    iget v2, v2, Landroid/graphics/Point;->y:I

    int-to-float v4, v2

    iget v2, p1, Landroid/graphics/Point;->x:I

    int-to-float v5, v2

    iget p1, p1, Landroid/graphics/Point;->y:I

    int-to-float v6, p1

    const/4 v2, 0x0

    invoke-static/range {v0 .. v6}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassRotateGesture(IFFFFFF)V

    return-void
.end method

.method public b(Lmk/j;)V
    .locals 9

    invoke-virtual {p1}, Lmk/j;->a()Landroid/graphics/Point;

    move-result-object v0

    invoke-virtual {p1}, Lmk/j;->b()Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {p1}, Lmk/j;->c()F

    move-result v3

    invoke-virtual {p1}, Lmk/j;->d()I

    move-result v2

    invoke-virtual {p0}, Lmk/f;->q()F

    move-result p1

    const/4 v4, 0x1

    iput-boolean v4, p0, Lmk/f;->p:Z

    if-nez v2, :cond_0

    const/high16 v4, 0x3f800000    # 1.0f

    iput v4, p0, Lmk/f;->q:F

    :cond_0
    iget-boolean v4, p0, Lmk/f;->o:Z

    if-eqz v4, :cond_1

    iget v1, v0, Landroid/graphics/Point;->x:I

    int-to-float v1, v1

    div-float/2addr v1, p1

    iget v0, v0, Landroid/graphics/Point;->y:I

    int-to-float v0, v0

    div-float/2addr v0, p1

    iget p1, p0, Lmk/f;->q:F

    sub-float p1, v3, p1

    const/high16 v2, 0x40600000    # 3.5f

    mul-float/2addr p1, v2

    invoke-static {v1, v0, p1}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassMousePinch(FFF)V

    goto :goto_0

    :cond_1
    iget v4, v0, Landroid/graphics/Point;->x:I

    int-to-float v4, v4

    div-float/2addr v4, p1

    float-to-int v4, v4

    int-to-float v5, v4

    iget v0, v0, Landroid/graphics/Point;->y:I

    int-to-float v0, v0

    div-float/2addr v0, p1

    float-to-int v0, v0

    int-to-float v6, v0

    iget v0, v1, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    div-float/2addr v0, p1

    float-to-int v0, v0

    int-to-float v7, v0

    iget v0, v1, Landroid/graphics/Point;->y:I

    int-to-float v0, v0

    div-float/2addr v0, p1

    float-to-int p1, v0

    int-to-float v8, p1

    const/4 v4, 0x0

    invoke-static/range {v2 .. v8}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassPinchGesture(IFFFFFF)V

    :goto_0
    iput v3, p0, Lmk/f;->q:F

    return-void
.end method

.method public final o(I)V
    .locals 2

    iget-object v0, p0, Lmk/f;->y:Landroid/hardware/input/InputManager;

    invoke-virtual {v0, p1}, Landroid/hardware/input/InputManager;->getInputDevice(I)Landroid/view/InputDevice;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "inputDevice is null for device ID: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "rbx.input"

    invoke-static {v0, p1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    iget-object v0, p0, Lmk/f;->w:Ljava/util/Set;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Lmk/f;->y:Landroid/hardware/input/InputManager;

    invoke-virtual {v0, p1}, Landroid/hardware/input/InputManager;->getInputDevice(I)Landroid/view/InputDevice;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/view/InputDevice;->getName()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_2
    const-string v0, ""

    :goto_0
    invoke-static {v0}, Lmk/f;->x(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, p1, v0}, Lmk/f;->E(II)V

    invoke-static {p1, v0}, Lcom/roblox/engine/jni/NativeInputInterface;->nativeGamepadConnectEventWithGamepadType(II)V

    return-void
.end method

.method public onAccuracyChanged(Landroid/hardware/Sensor;I)V
    .locals 0

    return-void
.end method

.method public onSensorChanged(Landroid/hardware/SensorEvent;)V
    .locals 13

    iget-object v0, p0, Lmk/f;->A:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getRotation()I

    move-result v0

    iget-object v1, p1, Landroid/hardware/SensorEvent;->sensor:Landroid/hardware/Sensor;

    invoke-virtual {v1}, Landroid/hardware/Sensor;->getType()I

    move-result v1

    const/16 v2, 0xb

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-ne v1, v2, :cond_0

    iget-object p1, p1, Landroid/hardware/SensorEvent;->values:[F

    invoke-static {v0, p1}, Lmk/f;->n(I[F)[F

    move-result-object p1

    iget-object v0, p0, Lmk/f;->r:[F

    invoke-static {v0, p1}, Landroid/hardware/SensorManager;->getQuaternionFromVector([F[F)V

    iget-object p1, p0, Lmk/f;->s:[F

    iget-object v0, p0, Lmk/f;->r:[F

    invoke-static {p1, v0}, Landroid/hardware/SensorManager;->getRotationMatrixFromVector([F[F)V

    iget-object p1, p0, Lmk/f;->s:[F

    iget-object v0, p0, Lmk/f;->t:[F

    invoke-static {p1, v0}, Landroid/hardware/SensorManager;->getOrientation([F[F)[F

    iget-object p1, p0, Lmk/f;->t:[F

    aget v6, p1, v4

    aget v7, p1, v5

    aget v8, p1, v3

    iget-object p1, p0, Lmk/f;->r:[F

    aget v9, p1, v4

    aget v10, p1, v3

    const/4 v0, 0x3

    aget v11, p1, v0

    aget v12, p1, v5

    invoke-static/range {v6 .. v12}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassGyroscopeChange(FFFFFFF)V

    return-void

    :cond_0
    iget-object v1, p1, Landroid/hardware/SensorEvent;->sensor:Landroid/hardware/Sensor;

    invoke-virtual {v1}, Landroid/hardware/Sensor;->getType()I

    move-result v1

    if-ne v1, v5, :cond_1

    iget-object v1, p0, Lmk/f;->u:[F

    aget v2, v1, v4

    const v6, 0x3f4ccccd    # 0.8f

    mul-float/2addr v2, v6

    iget-object p1, p1, Landroid/hardware/SensorEvent;->values:[F

    aget v7, p1, v4

    const v8, 0x3e4ccccc    # 0.19999999f

    mul-float/2addr v7, v8

    add-float/2addr v2, v7

    aput v2, v1, v4

    aget v7, v1, v5

    mul-float/2addr v7, v6

    aget v9, p1, v5

    mul-float/2addr v9, v8

    add-float/2addr v7, v9

    aput v7, v1, v5

    aget v9, v1, v3

    mul-float/2addr v9, v6

    aget v6, p1, v3

    mul-float/2addr v6, v8

    add-float/2addr v9, v6

    aput v9, v1, v3

    iget-object v1, p0, Lmk/f;->v:[F

    aget v6, p1, v4

    sub-float/2addr v6, v2

    aput v6, v1, v4

    aget v2, p1, v5

    sub-float/2addr v2, v7

    aput v2, v1, v5

    aget p1, p1, v3

    sub-float/2addr p1, v9

    aput p1, v1, v3

    invoke-static {v0, v1}, Lmk/f;->n(I[F)[F

    move-result-object p1

    iget-object v1, p0, Lmk/f;->u:[F

    invoke-static {v0, v1}, Lmk/f;->n(I[F)[F

    move-result-object v0

    aget v1, p1, v5

    neg-float v1, v1

    aget v2, p1, v3

    aget p1, p1, v4

    invoke-static {v1, v2, p1}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassAccelerometerChange(FFF)V

    aget p1, v0, v5

    neg-float p1, p1

    aget v1, v0, v3

    neg-float v1, v1

    aget v0, v0, v4

    invoke-static {p1, v1, v0}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassGravityChange(FFF)V

    :cond_1
    return-void
.end method

.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-virtual {v1}, Landroid/view/MotionEvent;->getSource()I

    move-result v2

    const/16 v3, 0x2002

    and-int/2addr v2, v3

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-ne v2, v3, :cond_0

    move v2, v5

    goto :goto_0

    :cond_0
    move v2, v4

    :goto_0
    if-eqz v2, :cond_1

    invoke-virtual {v1, v4}, Landroid/view/MotionEvent;->getToolType(I)I

    move-result v3

    if-ne v3, v5, :cond_1

    move v3, v5

    goto :goto_1

    :cond_1
    move v3, v4

    :goto_1
    iput-boolean v3, v0, Lmk/f;->o:Z

    if-eqz v2, :cond_4

    if-nez v3, :cond_4

    invoke-virtual {v1}, Landroid/view/MotionEvent;->getButtonState()I

    move-result v2

    if-nez v2, :cond_3

    invoke-virtual {v1}, Landroid/view/MotionEvent;->getHistorySize()I

    move-result v2

    if-lez v2, :cond_2

    invoke-virtual {v1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    invoke-virtual {v0}, Lmk/f;->q()F

    move-result v6

    div-float/2addr v3, v6

    sub-int/2addr v2, v5

    invoke-virtual {v1, v4, v2}, Landroid/view/MotionEvent;->getHistoricalY(II)F

    move-result v1

    invoke-virtual {v0}, Lmk/f;->q()F

    move-result v2

    div-float/2addr v1, v2

    sub-float/2addr v3, v1

    const/4 v1, 0x0

    cmpl-float v1, v3, v1

    if-eqz v1, :cond_2

    iget v1, v0, Lmk/f;->m:F

    iget v2, v0, Lmk/f;->n:F

    invoke-static {v1, v2, v3}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassMouseWheel(FFF)V

    :cond_2
    return v5

    :cond_3
    invoke-virtual {v0, v1}, Lmk/f;->y(Landroid/view/MotionEvent;)Z

    move-result v1

    return v1

    :cond_4
    invoke-static {}, Lsg/a1;->q0()Z

    move-result v3

    if-eqz v3, :cond_5

    iget-boolean v3, v0, Lmk/f;->b:Z

    if-nez v3, :cond_5

    return v4

    :cond_5
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v3

    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v6

    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v7

    const/4 v8, 0x2

    if-eqz v7, :cond_16

    const/4 v9, 0x3

    if-eq v7, v5, :cond_d

    if-eq v7, v8, :cond_6

    if-eq v7, v9, :cond_d

    const/4 v10, 0x5

    if-eq v7, v10, :cond_16

    const/4 v10, 0x6

    if-eq v7, v10, :cond_d

    move v7, v4

    goto/16 :goto_6

    :cond_6
    iget-object v3, v0, Lmk/f;->E:Landroid/view/VelocityTracker;

    if-eqz v3, :cond_7

    invoke-virtual {v3, v1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    :cond_7
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v3

    invoke-interface {v3}, Lth/i;->a0()Z

    move-result v3

    if-eqz v3, :cond_a

    if-nez v2, :cond_a

    iget-object v3, v0, Lmk/f;->B:Lmk/f$f;

    if-eqz v3, :cond_a

    invoke-interface {v3}, Lmk/f$f;->b()Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-virtual {v1}, Landroid/view/MotionEvent;->getHistorySize()I

    move-result v3

    if-lez v3, :cond_a

    invoke-virtual {v0}, Lmk/f;->q()F

    move-result v6

    iget-object v7, v0, Lmk/f;->a:Landroid/view/SurfaceView;

    invoke-virtual {v7}, Landroid/view/View;->getWidth()I

    move-result v7

    int-to-float v7, v7

    div-float/2addr v7, v6

    float-to-int v13, v7

    iget-object v7, v0, Lmk/f;->a:Landroid/view/SurfaceView;

    invoke-virtual {v7}, Landroid/view/View;->getHeight()I

    move-result v7

    int-to-float v7, v7

    div-float/2addr v7, v6

    float-to-int v14, v7

    iget-object v7, v0, Lmk/f;->g:Landroid/util/SparseArray;

    invoke-virtual {v7}, Landroid/util/SparseArray;->size()I

    move-result v7

    mul-int v9, v3, v7

    move v10, v9

    new-array v9, v10, [I

    mul-int/2addr v10, v8

    new-array v10, v10, [F

    move v11, v4

    move v12, v11

    :goto_2
    if-ge v11, v3, :cond_9

    move v15, v4

    :goto_3
    if-ge v15, v7, :cond_8

    iget-object v8, v0, Lmk/f;->g:Landroid/util/SparseArray;

    invoke-virtual {v8, v15}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v8

    :try_start_0
    invoke-virtual {v1, v8}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v4

    aput v8, v9, v12

    mul-int/lit8 v8, v12, 0x2

    invoke-virtual {v1, v4, v11}, Landroid/view/MotionEvent;->getHistoricalX(II)F

    move-result v16

    div-float v16, v16, v6

    aput v16, v10, v8

    add-int/lit8 v8, v8, 0x1

    invoke-virtual {v1, v4, v11}, Landroid/view/MotionEvent;->getHistoricalY(II)F

    move-result v4

    div-float/2addr v4, v6

    aput v4, v10, v8
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v12, v12, 0x1

    :catch_0
    add-int/lit8 v15, v15, 0x1

    const/4 v4, 0x0

    const/4 v8, 0x2

    goto :goto_3

    :cond_8
    add-int/lit8 v11, v11, 0x1

    const/4 v4, 0x0

    const/4 v8, 0x2

    goto :goto_2

    :cond_9
    if-lez v12, :cond_a

    move v11, v12

    const/4 v12, 0x1

    invoke-static/range {v9 .. v14}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassInputBatch([I[FIIII)V

    :cond_a
    const/4 v3, 0x0

    :goto_4
    iget-object v4, v0, Lmk/f;->g:Landroid/util/SparseArray;

    invoke-virtual {v4}, Landroid/util/SparseArray;->size()I

    move-result v4

    if-ge v3, v4, :cond_c

    :try_start_1
    iget-object v4, v0, Lmk/f;->g:Landroid/util/SparseArray;

    invoke-virtual {v4, v3}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v4

    invoke-virtual {v1, v4}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v6

    iget-object v7, v0, Lmk/f;->g:Landroid/util/SparseArray;

    invoke-virtual {v7, v4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lmk/f$h;

    invoke-virtual {v0}, Lmk/f;->q()F

    move-result v8

    invoke-virtual {v1, v6}, Landroid/view/MotionEvent;->getX(I)F

    move-result v9

    div-float/2addr v9, v8

    invoke-virtual {v7, v9}, Lmk/f$h;->e(F)V

    invoke-virtual {v1, v6}, Landroid/view/MotionEvent;->getY(I)F

    move-result v6

    div-float/2addr v6, v8

    invoke-virtual {v7, v6}, Lmk/f$h;->f(F)V

    invoke-virtual {v7, v5}, Lmk/f$h;->d(I)V

    iget-object v6, v0, Lmk/f;->d:Lmk/f$g;

    iget v6, v6, Lmk/f$g;->a:I

    if-ne v4, v6, :cond_b

    invoke-virtual {v7}, Lmk/f$h;->b()F

    move-result v4

    invoke-virtual {v7}, Lmk/f$h;->c()F

    move-result v6

    invoke-static {v5, v4, v6}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassLongPressGesture(IFF)V
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :cond_b
    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    :cond_c
    :goto_5
    const/4 v7, 0x0

    goto/16 :goto_6

    :cond_d
    iget-object v4, v0, Lmk/f;->E:Landroid/view/VelocityTracker;

    if-eqz v4, :cond_10

    invoke-virtual {v4, v1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    if-eq v7, v9, :cond_e

    iget-object v4, v0, Lmk/f;->E:Landroid/view/VelocityTracker;

    const/16 v8, 0x3e8

    invoke-virtual {v4, v8}, Landroid/view/VelocityTracker;->computeCurrentVelocity(I)V

    invoke-virtual {v0}, Lmk/f;->q()F

    move-result v4

    iget-object v8, v0, Lmk/f;->E:Landroid/view/VelocityTracker;

    invoke-virtual {v8, v6}, Landroid/view/VelocityTracker;->getXVelocity(I)F

    move-result v8

    div-float/2addr v8, v4

    iget-object v10, v0, Lmk/f;->E:Landroid/view/VelocityTracker;

    invoke-virtual {v10, v6}, Landroid/view/VelocityTracker;->getYVelocity(I)F

    move-result v10

    div-float/2addr v10, v4

    invoke-static {v6, v8, v10}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassTouchEndVelocity(IFF)V

    :cond_e
    if-eq v7, v5, :cond_f

    if-ne v7, v9, :cond_10

    :cond_f
    iget-object v4, v0, Lmk/f;->E:Landroid/view/VelocityTracker;

    invoke-virtual {v4}, Landroid/view/VelocityTracker;->recycle()V

    const/4 v4, 0x0

    iput-object v4, v0, Lmk/f;->E:Landroid/view/VelocityTracker;

    :cond_10
    iget-object v4, v0, Lmk/f;->g:Landroid/util/SparseArray;

    invoke-virtual {v4, v6}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lmk/f$h;

    const/4 v7, 0x0

    iput-boolean v7, v0, Lmk/f;->p:Z

    const/4 v7, -0x1

    if-nez v4, :cond_13

    invoke-virtual {v0}, Lmk/f;->q()F

    move-result v4

    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getX(I)F

    move-result v8

    div-float/2addr v8, v4

    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getY(I)F

    move-result v3

    div-float/2addr v3, v4

    iget-object v4, v0, Lmk/f;->d:Lmk/f$g;

    iget v9, v4, Lmk/f$g;->a:I

    if-ne v6, v9, :cond_11

    iput v7, v4, Lmk/f$g;->a:I

    const/4 v4, 0x2

    invoke-static {v4, v8, v3}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassLongPressGesture(IFF)V

    goto :goto_5

    :cond_11
    iget v3, v4, Lmk/f$g;->b:I

    if-ne v6, v3, :cond_c

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v3

    invoke-interface {v3}, Lth/i;->e0()Z

    move-result v3

    if-eqz v3, :cond_12

    iget-object v3, v0, Lmk/f;->d:Lmk/f$g;

    invoke-virtual {v3, v1}, Lmk/f$g;->b(Landroid/view/MotionEvent;)V

    goto :goto_5

    :cond_12
    iget-object v3, v0, Lmk/f;->d:Lmk/f$g;

    invoke-virtual {v3}, Lmk/f$g;->a()V

    goto :goto_5

    :cond_13
    const/4 v3, 0x2

    invoke-virtual {v4, v3}, Lmk/f$h;->d(I)V

    iget-object v8, v0, Lmk/f;->d:Lmk/f$g;

    iget v9, v8, Lmk/f$g;->a:I

    if-ne v6, v9, :cond_14

    iput v7, v8, Lmk/f$g;->a:I

    invoke-virtual {v4}, Lmk/f$h;->b()F

    move-result v6

    invoke-virtual {v4}, Lmk/f$h;->c()F

    move-result v4

    invoke-static {v3, v6, v4}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassLongPressGesture(IFF)V

    goto/16 :goto_5

    :cond_14
    iget v3, v8, Lmk/f$g;->b:I

    if-ne v6, v3, :cond_c

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v3

    invoke-interface {v3}, Lth/i;->e0()Z

    move-result v3

    if-eqz v3, :cond_15

    iget-object v3, v0, Lmk/f;->d:Lmk/f$g;

    invoke-virtual {v3, v1}, Lmk/f$g;->b(Landroid/view/MotionEvent;)V

    goto/16 :goto_5

    :cond_15
    iget-object v3, v0, Lmk/f;->d:Lmk/f$g;

    invoke-virtual {v3}, Lmk/f$g;->a()V

    goto/16 :goto_5

    :cond_16
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v4

    invoke-interface {v4}, Lth/i;->o2()Z

    move-result v4

    if-eqz v4, :cond_17

    invoke-virtual/range {p1 .. p2}, Landroid/view/View;->requestUnbufferedDispatch(Landroid/view/MotionEvent;)V

    :cond_17
    new-instance v4, Lmk/f$h;

    invoke-direct {v4, v0}, Lmk/f$h;-><init>(Lmk/f;)V

    invoke-virtual {v0}, Lmk/f;->q()F

    move-result v7

    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getX(I)F

    move-result v8

    div-float/2addr v8, v7

    invoke-virtual {v4, v8}, Lmk/f$h;->e(F)V

    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getY(I)F

    move-result v3

    div-float/2addr v3, v7

    invoke-virtual {v4, v3}, Lmk/f$h;->f(F)V

    const/4 v7, 0x0

    invoke-virtual {v4, v7}, Lmk/f$h;->d(I)V

    iget-object v3, v0, Lmk/f;->g:Landroid/util/SparseArray;

    invoke-virtual {v3, v6, v4}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    iget-boolean v3, v0, Lmk/f;->D:Z

    if-eqz v3, :cond_19

    if-nez v2, :cond_19

    iget-object v3, v0, Lmk/f;->E:Landroid/view/VelocityTracker;

    if-nez v3, :cond_18

    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v3

    iput-object v3, v0, Lmk/f;->E:Landroid/view/VelocityTracker;

    :cond_18
    iget-object v3, v0, Lmk/f;->E:Landroid/view/VelocityTracker;

    invoke-virtual {v3, v1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    :cond_19
    :goto_6
    iget-object v3, v0, Lmk/f;->C:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->clear()V

    iget-object v3, v0, Lmk/f;->g:Landroid/util/SparseArray;

    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    move-result v3

    move v4, v7

    :goto_7
    if-ge v4, v3, :cond_21

    iget-object v6, v0, Lmk/f;->g:Landroid/util/SparseArray;

    invoke-virtual {v6, v4}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v8

    iget-object v6, v0, Lmk/f;->g:Landroid/util/SparseArray;

    invoke-virtual {v6, v4}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lmk/f$h;

    invoke-virtual {v6}, Lmk/f$h;->a()I

    move-result v9

    const/4 v14, 0x2

    if-ne v9, v14, :cond_1a

    iget-object v9, v0, Lmk/f;->C:Ljava/util/List;

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v9, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_9

    :cond_1a
    invoke-virtual {v6}, Lmk/f$h;->a()I

    move-result v9

    iget v10, v6, Lmk/f$h;->f:I

    if-ne v9, v10, :cond_1b

    invoke-virtual {v6}, Lmk/f$h;->b()F

    move-result v9

    iget v10, v6, Lmk/f$h;->d:F

    cmpl-float v9, v9, v10

    if-nez v9, :cond_1c

    invoke-virtual {v6}, Lmk/f$h;->c()F

    move-result v9

    iget v10, v6, Lmk/f$h;->e:F

    cmpl-float v9, v9, v10

    if-nez v9, :cond_1c

    :goto_8
    move v9, v7

    goto :goto_a

    :cond_1b
    invoke-virtual {v6}, Lmk/f$h;->a()I

    move-result v9

    if-ne v9, v5, :cond_1c

    iget v9, v6, Lmk/f$h;->f:I

    if-nez v9, :cond_1c

    invoke-virtual {v6}, Lmk/f$h;->b()F

    move-result v9

    iget v10, v6, Lmk/f$h;->d:F

    cmpl-float v9, v9, v10

    if-nez v9, :cond_1c

    invoke-virtual {v6}, Lmk/f$h;->c()F

    move-result v9

    iget v10, v6, Lmk/f$h;->e:F

    cmpl-float v9, v9, v10

    if-nez v9, :cond_1c

    goto :goto_8

    :cond_1c
    :goto_9
    move v9, v5

    :goto_a
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v10

    invoke-interface {v10}, Lth/i;->S0()Z

    move-result v10

    if-eqz v10, :cond_1e

    iget-object v10, v0, Lmk/f;->B:Lmk/f$f;

    if-eqz v10, :cond_1d

    invoke-interface {v10}, Lmk/f$f;->b()Z

    move-result v10

    if-eqz v10, :cond_1d

    move v10, v5

    goto :goto_b

    :cond_1d
    move v10, v7

    goto :goto_b

    :cond_1e
    iget-object v10, v0, Lmk/f;->B:Lmk/f$f;

    invoke-interface {v10}, Lmk/f$f;->b()Z

    move-result v10

    :goto_b
    if-eqz v9, :cond_1f

    if-eqz v10, :cond_1f

    invoke-virtual {v0}, Lmk/f;->q()F

    move-result v9

    iget-object v10, v0, Lmk/f;->a:Landroid/view/SurfaceView;

    invoke-virtual {v10}, Landroid/view/View;->getWidth()I

    move-result v10

    int-to-float v10, v10

    div-float/2addr v10, v9

    float-to-int v12, v10

    iget-object v10, v0, Lmk/f;->a:Landroid/view/SurfaceView;

    invoke-virtual {v10}, Landroid/view/View;->getHeight()I

    move-result v10

    int-to-float v10, v10

    div-float/2addr v10, v9

    float-to-int v13, v10

    invoke-virtual {v6}, Lmk/f$h;->b()F

    move-result v9

    iput v9, v6, Lmk/f$h;->d:F

    invoke-virtual {v6}, Lmk/f$h;->c()F

    move-result v9

    iput v9, v6, Lmk/f$h;->e:F

    if-nez v2, :cond_20

    invoke-virtual {v6}, Lmk/f$h;->b()F

    move-result v9

    invoke-virtual {v6}, Lmk/f$h;->c()F

    move-result v10

    invoke-virtual {v6}, Lmk/f$h;->a()I

    move-result v11

    invoke-static/range {v8 .. v13}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassInput(IFFIII)V

    goto :goto_c

    :cond_1f
    if-nez v10, :cond_20

    const-string v6, "rbx.input"

    const-string v8, "nativePassInput not ready or already passed event"

    invoke-static {v6, v8}, Lgk/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    :cond_20
    :goto_c
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_7

    :cond_21
    iget-object v3, v0, Lmk/f;->C:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_d
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_22

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    iget-object v6, v0, Lmk/f;->g:Landroid/util/SparseArray;

    invoke-virtual {v6, v4}, Landroid/util/SparseArray;->remove(I)V

    goto :goto_d

    :cond_22
    iget-object v3, v0, Lmk/f;->f:Lmk/j;

    invoke-virtual {v3, v1}, Lmk/j;->e(Landroid/view/MotionEvent;)Z

    iget-object v3, v0, Lmk/f;->c:Landroid/view/GestureDetector;

    invoke-virtual {v3, v1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    iget-object v3, v0, Lmk/f;->e:Lmk/i;

    invoke-virtual {v3, v1}, Lmk/i;->f(Landroid/view/MotionEvent;)Z

    if-eqz v2, :cond_23

    invoke-virtual {v0, v1}, Lmk/f;->y(Landroid/view/MotionEvent;)Z

    :cond_23
    return v5
.end method

.method public final p(I)V
    .locals 2

    iget-object v0, p0, Lmk/f;->y:Landroid/hardware/input/InputManager;

    invoke-virtual {v0, p1}, Landroid/hardware/input/InputManager;->getInputDevice(I)Landroid/view/InputDevice;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "inputDevice is null for device ID: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "rbx.input"

    invoke-static {v0, p1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    iget-object v0, p0, Lmk/f;->x:Ljava/util/Set;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, p1}, Lmk/f;->F(I)V

    invoke-static {p1}, Lcom/roblox/engine/jni/NativeInputInterface;->nativeTVRemoteConnectEvent(I)V

    :cond_1
    return-void
.end method

.method public final q()F
    .locals 1

    iget-object v0, p0, Lmk/f;->A:Landroid/app/Activity;

    invoke-static {v0}, Lel/a;->e(Landroid/content/Context;)F

    move-result v0

    return v0
.end method

.method public final s(I)V
    .locals 0

    return-void
.end method

.method public final t(I)V
    .locals 0

    return-void
.end method

.method public final u(I)V
    .locals 2

    iget-object v0, p0, Lmk/f;->w:Ljava/util/Set;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lmk/f;->E(II)V

    invoke-static {p1}, Lcom/roblox/engine/jni/NativeInputInterface;->nativeGamepadDisconnectEvent(I)V

    :cond_0
    iget-object v0, p0, Lmk/f;->x:Ljava/util/Set;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, p1}, Lmk/f;->F(I)V

    invoke-static {p1}, Lcom/roblox/engine/jni/NativeInputInterface;->nativeTVRemoteDisconnectEvent(I)V

    :cond_1
    return-void
.end method

.method public final v()V
    .locals 3

    new-instance v0, Lmk/f$b;

    invoke-direct {v0, p0}, Lmk/f$b;-><init>(Lmk/f;)V

    iput-object v0, p0, Lmk/f;->z:Landroid/hardware/input/InputManager$InputDeviceListener;

    iget-object v1, p0, Lmk/f;->y:Landroid/hardware/input/InputManager;

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/hardware/input/InputManager;->registerInputDeviceListener(Landroid/hardware/input/InputManager$InputDeviceListener;Landroid/os/Handler;)V

    return-void
.end method

.method public final synthetic w(Landroid/view/SurfaceView;Z)V
    .locals 1

    if-eqz p2, :cond_2

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p2

    invoke-interface {p2}, Lth/i;->U1()Z

    move-result p2

    if-eqz p2, :cond_1

    iget-object p2, p0, Lmk/f;->A:Landroid/app/Activity;

    instance-of v0, p2, Le4/q;

    if-eqz v0, :cond_2

    check-cast p2, Le4/q;

    invoke-virtual {p2}, Le4/q;->l1()Landroidx/fragment/app/FragmentManager;

    move-result-object p2

    invoke-virtual {p2}, Landroidx/fragment/app/FragmentManager;->u0()I

    move-result p2

    if-nez p2, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    :cond_0
    return-void

    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    :cond_2
    return-void
.end method

.method public y(Landroid/view/MotionEvent;)Z
    .locals 5

    iget-boolean v0, p0, Lmk/f;->p:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v2, 0x7

    if-eq v0, v2, :cond_8

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v2, 0x2

    if-ne v0, v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/16 v2, 0xb

    if-ne v0, v2, :cond_2

    iget v0, p0, Lmk/f;->m:F

    iget v2, p0, Lmk/f;->n:F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionButton()I

    move-result p1

    sub-int/2addr p1, v1

    invoke-static {v0, v2, v1, p1}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassMouseButton(FFZI)V

    return v1

    :cond_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/16 v2, 0xc

    const/4 v3, 0x0

    if-ne v0, v2, :cond_3

    iget v0, p0, Lmk/f;->m:F

    iget v2, p0, Lmk/f;->n:F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionButton()I

    move-result p1

    sub-int/2addr p1, v1

    invoke-static {v0, v2, v3, p1}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassMouseButton(FFZI)V

    return v1

    :cond_3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/16 v2, 0x8

    if-ne v0, v2, :cond_6

    iget v0, p0, Lmk/f;->m:F

    const/4 v2, 0x0

    cmpl-float v3, v0, v2

    if-lez v3, :cond_4

    goto :goto_0

    :cond_4
    move v0, v2

    :goto_0
    iget v3, p0, Lmk/f;->n:F

    cmpl-float v4, v3, v2

    if-lez v4, :cond_5

    move v2, v3

    :cond_5
    const/16 v3, 0x9

    invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->getAxisValue(I)F

    move-result p1

    invoke-static {v0, v2, p1}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassMouseWheel(FFF)V

    return v1

    :cond_6
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result p1

    if-nez p1, :cond_7

    return v1

    :cond_7
    return v3

    :cond_8
    :goto_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p0}, Lmk/f;->q()F

    move-result v2

    div-float/2addr v0, v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    invoke-virtual {p0}, Lmk/f;->q()F

    move-result v2

    div-float/2addr p1, v2

    iget v2, p0, Lmk/f;->m:F

    sub-float v2, v0, v2

    iget v3, p0, Lmk/f;->n:F

    sub-float v3, p1, v3

    iput v0, p0, Lmk/f;->m:F

    iput p1, p0, Lmk/f;->n:F

    invoke-static {v0, p1, v2, v3}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassMouseMove(FFFF)V

    return v1
.end method

.method public z(Landroid/view/MotionEvent;)Z
    .locals 3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v1, 0x7

    if-eq v0, v1, :cond_1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lmk/f;->y(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    :cond_1
    :goto_0
    const/16 v0, 0x1b

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getAxisValue(I)F

    move-result v0

    invoke-virtual {p0}, Lmk/f;->q()F

    move-result v1

    div-float/2addr v0, v1

    const/16 v1, 0x1c

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getAxisValue(I)F

    move-result p1

    invoke-virtual {p0}, Lmk/f;->q()F

    move-result v1

    div-float/2addr p1, v1

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v1

    invoke-interface {v1}, Lth/i;->K()Z

    move-result v1

    if-nez v1, :cond_2

    iget v1, p0, Lmk/f;->m:F

    add-float/2addr v1, v0

    iput v1, p0, Lmk/f;->m:F

    iget v1, p0, Lmk/f;->n:F

    add-float/2addr v1, p1

    iput v1, p0, Lmk/f;->n:F

    :cond_2
    iget v1, p0, Lmk/f;->m:F

    iget v2, p0, Lmk/f;->n:F

    invoke-static {v1, v2, v0, p1}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassMouseMove(FFFF)V

    const/4 p1, 0x1

    return p1
.end method
