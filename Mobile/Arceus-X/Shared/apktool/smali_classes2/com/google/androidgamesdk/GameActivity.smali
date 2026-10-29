.class public Lcom/google/androidgamesdk/GameActivity;
.super Lj/b;
.source "SourceFile"

# interfaces
.implements Landroid/view/SurfaceHolder$Callback2;
.implements Lge/a;
.implements Landroidx/core/view/y;
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/androidgamesdk/GameActivity$d;
    }
.end annotation


# static fields
.field public static O:Lcom/google/androidgamesdk/GameActivity;

.field public static P:J


# instance fields
.field public E:I

.field public F:Landroid/view/inputmethod/EditorInfo;

.field public G:Z

.field public H:Lcom/google/androidgamesdk/GameActivity$d;

.field public I:Landroid/view/SurfaceHolder;

.field public final J:[I

.field public K:I

.field public L:I

.field public M:I

.field public N:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lj/b;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/androidgamesdk/GameActivity;->G:Z

    const/4 v0, 0x2

    new-array v0, v0, [I

    iput-object v0, p0, Lcom/google/androidgamesdk/GameActivity;->J:[I

    return-void
.end method

.method public static F1(Ljava/io/File;)Ljava/lang/String;
    .locals 0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public B(Lcom/google/androidgamesdk/gametextinput/State;Z)V
    .locals 2

    invoke-virtual {p0}, Lcom/google/androidgamesdk/GameActivity;->H1()Z

    move-result p2

    if-eqz p2, :cond_0

    return-void

    :cond_0
    sget-wide v0, Lcom/google/androidgamesdk/GameActivity;->P:J

    invoke-virtual {p0, v0, v1, p1}, Lcom/google/androidgamesdk/GameActivity;->onTextInputEventNative(JLcom/google/androidgamesdk/gametextinput/State;)V

    return-void
.end method

.method public E1()Lcom/google/androidgamesdk/GameActivity$d;
    .locals 1

    new-instance v0, Lcom/google/androidgamesdk/GameActivity$d;

    invoke-direct {v0, p0, p0}, Lcom/google/androidgamesdk/GameActivity$d;-><init>(Lcom/google/androidgamesdk/GameActivity;Lcom/google/androidgamesdk/GameActivity;)V

    return-object v0
.end method

.method public G1()Landroid/view/inputmethod/EditorInfo;
    .locals 2

    iget-object v0, p0, Lcom/google/androidgamesdk/GameActivity;->F:Landroid/view/inputmethod/EditorInfo;

    if-nez v0, :cond_0

    new-instance v0, Landroid/view/inputmethod/EditorInfo;

    invoke-direct {v0}, Landroid/view/inputmethod/EditorInfo;-><init>()V

    iput-object v0, p0, Lcom/google/androidgamesdk/GameActivity;->F:Landroid/view/inputmethod/EditorInfo;

    const/4 v1, 0x1

    iput v1, v0, Landroid/view/inputmethod/EditorInfo;->inputType:I

    const/4 v1, 0x6

    iput v1, v0, Landroid/view/inputmethod/EditorInfo;->actionId:I

    const v1, 0x2000006

    iput v1, v0, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    :cond_0
    iget-object v0, p0, Lcom/google/androidgamesdk/GameActivity;->F:Landroid/view/inputmethod/EditorInfo;

    return-object v0
.end method

.method public H(I)V
    .locals 2

    invoke-virtual {p0}, Lcom/google/androidgamesdk/GameActivity;->H1()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    sget-wide v0, Lcom/google/androidgamesdk/GameActivity;->P:J

    invoke-virtual {p0, v0, v1, p1}, Lcom/google/androidgamesdk/GameActivity;->onEditorActionNative(JI)V

    return-void
.end method

.method public final H1()Z
    .locals 1

    sget-object v0, Lcom/google/androidgamesdk/GameActivity;->O:Lcom/google/androidgamesdk/GameActivity;

    if-eq v0, p0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final I1(Landroidx/core/view/WindowInsetsCompat;)Z
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-static {}, Landroidx/core/view/WindowInsetsCompat$Type;->ime()I

    move-result v0

    invoke-virtual {p1, v0}, Landroidx/core/view/WindowInsetsCompat;->isVisible(I)Z

    move-result p1

    return p1
.end method

.method public J1()V
    .locals 2

    invoke-virtual {p0}, Lcom/google/androidgamesdk/GameActivity;->E1()Lcom/google/androidgamesdk/GameActivity$d;

    move-result-object v0

    iput-object v0, p0, Lcom/google/androidgamesdk/GameActivity;->H:Lcom/google/androidgamesdk/GameActivity$d;

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Landroid/widget/FrameLayout;

    invoke-direct {v0, p0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    invoke-static {}, Landroidx/core/view/o0;->k()I

    move-result v1

    iput v1, p0, Lcom/google/androidgamesdk/GameActivity;->E:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setId(I)V

    iget-object v1, p0, Lcom/google/androidgamesdk/GameActivity;->H:Lcom/google/androidgamesdk/GameActivity$d;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {p0, v0}, Lj/b;->setContentView(Landroid/view/View;)V

    iget-object v0, p0, Lcom/google/androidgamesdk/GameActivity;->H:Lcom/google/androidgamesdk/GameActivity$d;

    invoke-virtual {v0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    invoke-interface {v0, p0}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    iget-object v0, p0, Lcom/google/androidgamesdk/GameActivity;->H:Lcom/google/androidgamesdk/GameActivity$d;

    invoke-static {v0, p0}, Landroidx/core/view/o0;->A0(Landroid/view/View;Landroidx/core/view/y;)V

    return-void
.end method

.method public K(Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;
    .locals 2

    invoke-virtual {p0}, Lcom/google/androidgamesdk/GameActivity;->H1()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p2

    :cond_0
    invoke-static {}, Landroidx/core/view/WindowInsetsCompat$Type;->ime()I

    move-result v0

    invoke-virtual {p2, v0}, Landroidx/core/view/WindowInsetsCompat;->getInsets(I)Landroidx/core/graphics/Insets;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/androidgamesdk/GameActivity;->K1(Landroidx/core/graphics/Insets;)V

    invoke-virtual {p0, p2}, Lcom/google/androidgamesdk/GameActivity;->I1(Landroidx/core/view/WindowInsetsCompat;)Z

    move-result v0

    iget-boolean v1, p0, Lcom/google/androidgamesdk/GameActivity;->G:Z

    if-eq v0, v1, :cond_1

    iput-boolean v0, p0, Lcom/google/androidgamesdk/GameActivity;->G:Z

    invoke-virtual {p0, v0}, Lcom/google/androidgamesdk/GameActivity;->M1(Z)V

    :cond_1
    sget-wide v0, Lcom/google/androidgamesdk/GameActivity;->P:J

    invoke-virtual {p0, v0, v1}, Lcom/google/androidgamesdk/GameActivity;->onWindowInsetsChangedNative(J)V

    invoke-virtual {p2}, Landroidx/core/view/WindowInsetsCompat;->toWindowInsets()Landroid/view/WindowInsets;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/View;->onApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    return-object p2
.end method

.method public K1(Landroidx/core/graphics/Insets;)V
    .locals 1

    const-string p1, "GameActivity"

    const-string v0, "onImeInsetsChanged from Text Listener"

    invoke-static {p1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public L1()V
    .locals 2

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/Window;->setFormat(I)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x10

    invoke-virtual {v0, v1}, Landroid/view/Window;->setSoftInputMode(I)V

    return-void
.end method

.method public M1(Z)V
    .locals 2

    invoke-virtual {p0}, Lcom/google/androidgamesdk/GameActivity;->H1()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    sget-wide v0, Lcom/google/androidgamesdk/GameActivity;->P:J

    invoke-virtual {p0, v0, v1, p1}, Lcom/google/androidgamesdk/GameActivity;->onSoftwareKeyboardVisibilityChangedNative(JZ)V

    return-void
.end method

.method public N1(Landroid/view/MotionEvent;)Z
    .locals 23

    invoke-virtual/range {p0 .. p0}, Lcom/google/androidgamesdk/GameActivity;->H1()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionButton()I

    move-result v17

    const/16 v2, 0x1d

    if-lt v0, v2, :cond_1

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getClassification()I

    move-result v1

    :cond_1
    move/from16 v19, v1

    sget-wide v3, Lcom/google/androidgamesdk/GameActivity;->P:J

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v6

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getHistorySize()I

    move-result v7

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getDeviceId()I

    move-result v8

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getSource()I

    move-result v9

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v10

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v11

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getDownTime()J

    move-result-wide v13

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getFlags()I

    move-result v15

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getMetaState()I

    move-result v16

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getButtonState()I

    move-result v18

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getEdgeFlags()I

    move-result v20

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getXPrecision()F

    move-result v21

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getYPrecision()F

    move-result v22

    move-object/from16 v2, p0

    move-object/from16 v5, p1

    invoke-virtual/range {v2 .. v22}, Lcom/google/androidgamesdk/GameActivity;->onTouchEventNative(JLandroid/view/MotionEvent;IIIIIJJIIIIIIFF)Z

    move-result v0

    return v0
.end method

.method public native getDlError()Ljava/lang/String;
.end method

.method public getWaterfallInsets()Landroidx/core/graphics/Insets;
    .locals 2
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    iget-object v0, p0, Lcom/google/androidgamesdk/GameActivity;->H:Lcom/google/androidgamesdk/GameActivity$d;

    invoke-static {v0}, Landroidx/core/view/o0;->F(Landroid/view/View;)Landroidx/core/view/WindowInsetsCompat;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {v0}, Landroidx/core/view/WindowInsetsCompat;->getDisplayCutout()Landroidx/core/view/j;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroidx/core/view/j;->e()Landroidx/core/graphics/Insets;

    move-result-object v0

    return-object v0

    :cond_1
    return-object v1
.end method

.method public getWindowInsets(I)Landroidx/core/graphics/Insets;
    .locals 2
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    iget-object v0, p0, Lcom/google/androidgamesdk/GameActivity;->H:Lcom/google/androidgamesdk/GameActivity$d;

    invoke-static {v0}, Landroidx/core/view/o0;->F(Landroid/view/View;)Landroidx/core/view/WindowInsetsCompat;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {v0, p1}, Landroidx/core/view/WindowInsetsCompat;->getInsets(I)Landroidx/core/graphics/Insets;

    move-result-object p1

    sget-object v0, Landroidx/core/graphics/Insets;->NONE:Landroidx/core/graphics/Insets;

    if-ne p1, v0, :cond_1

    return-object v1

    :cond_1
    return-object p1
.end method

.method public native initializeNativeCode(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/res/AssetManager;[BLandroid/content/res/Configuration;)J
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    invoke-super {p0, p1}, Lj/b;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    invoke-virtual {p0}, Lcom/google/androidgamesdk/GameActivity;->H1()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    sget-wide v0, Lcom/google/androidgamesdk/GameActivity;->P:J

    invoke-virtual {p0, v0, v1, p1}, Lcom/google/androidgamesdk/GameActivity;->onConfigurationChangedNative(JLandroid/content/res/Configuration;)V

    return-void
.end method

.method public native onConfigurationChangedNative(JLandroid/content/res/Configuration;)V
.end method

.method public native onContentRectChangedNative(JIIII)V
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 13

    invoke-virtual {p0}, Lcom/google/androidgamesdk/GameActivity;->J1()V

    iget-object v0, p0, Lcom/google/androidgamesdk/GameActivity;->H:Lcom/google/androidgamesdk/GameActivity$d;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_0
    invoke-virtual {p0}, Lcom/google/androidgamesdk/GameActivity;->L1()V

    new-instance v0, Ljava/lang/String;

    const-string v1, "main"

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v3

    const/16 v4, 0x80

    invoke-virtual {v2, v3, v4}, Landroid/content/pm/PackageManager;->getActivityInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;

    move-result-object v2

    iget-object v2, v2, Landroid/content/pm/ActivityInfo;->metaData:Landroid/os/Bundle;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_1

    if-eqz v2, :cond_1

    :try_start_1
    const-string v3, "android.app.lib_name"

    invoke-virtual {v2, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_0

    if-eqz v2, :cond_1

    move-object v0, v2

    goto :goto_0

    :catch_0
    move-exception v0

    move-object p1, v0

    move-object v6, p0

    goto/16 :goto_3

    :cond_1
    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "lib"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ".so"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Looking for library "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "GameActivity"

    invoke-static {v4, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    check-cast v3, Ldalvik/system/BaseDexClassLoader;

    invoke-virtual {v3, v0}, Ldalvik/system/BaseDexClassLoader;->findLibrary(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Found library "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ". Loading..."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Application should have loaded the native library "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " explicitly by now. "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :goto_1
    const/4 v0, 0x0

    if-eqz p1, :cond_3

    const-string v1, "android:native_state"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    move-result-object v1

    move-object v11, v1

    goto :goto_2

    :cond_3
    move-object v11, v0

    :goto_2
    invoke-virtual {p0, v0}, Landroid/content/Context;->getExternalFilesDirs(Ljava/lang/String;)[Ljava/io/File;

    move-result-object v1

    if-eqz v1, :cond_4

    array-length v2, v1

    if-lez v2, :cond_4

    const/4 v0, 0x0

    aget-object v0, v1, v0

    :cond_4
    sget-wide v1, Lcom/google/androidgamesdk/GameActivity;->P:J

    const-wide/16 v3, 0x0

    cmp-long v6, v1, v3

    if-eqz v6, :cond_5

    invoke-virtual {p0, v1, v2}, Lcom/google/androidgamesdk/GameActivity;->terminateNativeCode(J)V

    :cond_5
    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    invoke-static {v1}, Lcom/google/androidgamesdk/GameActivity;->F1(Ljava/io/File;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p0}, Landroid/content/Context;->getObbDir()Ljava/io/File;

    move-result-object v1

    invoke-static {v1}, Lcom/google/androidgamesdk/GameActivity;->F1(Ljava/io/File;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v0}, Lcom/google/androidgamesdk/GameActivity;->F1(Ljava/io/File;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v10

    invoke-virtual {p0}, Lj/b;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v12

    move-object v6, p0

    invoke-virtual/range {v6 .. v12}, Lcom/google/androidgamesdk/GameActivity;->initializeNativeCode(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/res/AssetManager;[BLandroid/content/res/Configuration;)J

    move-result-wide v0

    sput-wide v0, Lcom/google/androidgamesdk/GameActivity;->P:J

    sput-object v6, Lcom/google/androidgamesdk/GameActivity;->O:Lcom/google/androidgamesdk/GameActivity;

    cmp-long v2, v0, v3

    if-eqz v2, :cond_7

    iget-object v2, v6, Lcom/google/androidgamesdk/GameActivity;->H:Lcom/google/androidgamesdk/GameActivity$d;

    if-eqz v2, :cond_6

    iget-object v2, v2, Lcom/google/androidgamesdk/GameActivity$d;->a:Lcom/google/androidgamesdk/gametextinput/InputConnection;

    invoke-virtual {p0, v0, v1, v2}, Lcom/google/androidgamesdk/GameActivity;->setInputConnectionNative(JLcom/google/androidgamesdk/gametextinput/InputConnection;)V

    iget-object v0, v6, Lcom/google/androidgamesdk/GameActivity;->H:Lcom/google/androidgamesdk/GameActivity$d;

    new-instance v1, Lcom/google/androidgamesdk/GameActivity$a;

    invoke-direct {v1, p0}, Lcom/google/androidgamesdk/GameActivity$a;-><init>(Lcom/google/androidgamesdk/GameActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnCapturedPointerListener(Landroid/view/View$OnCapturedPointerListener;)V

    iget-object v0, v6, Lcom/google/androidgamesdk/GameActivity;->H:Lcom/google/androidgamesdk/GameActivity$d;

    new-instance v1, Lcom/google/androidgamesdk/GameActivity$b;

    invoke-direct {v1, p0}, Lcom/google/androidgamesdk/GameActivity$b;-><init>(Lcom/google/androidgamesdk/GameActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnGenericMotionListener(Landroid/view/View$OnGenericMotionListener;)V

    iget-object v0, v6, Lcom/google/androidgamesdk/GameActivity;->H:Lcom/google/androidgamesdk/GameActivity$d;

    new-instance v1, Lcom/google/androidgamesdk/GameActivity$c;

    invoke-direct {v1, p0}, Lcom/google/androidgamesdk/GameActivity$c;-><init>(Lcom/google/androidgamesdk/GameActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    :cond_6
    invoke-super {p0, p1}, Le4/q;->onCreate(Landroid/os/Bundle;)V

    return-void

    :cond_7
    new-instance p1, Ljava/lang/UnsatisfiedLinkError;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unable to initialize native code \""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/google/androidgamesdk/GameActivity;->getDlError()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/UnsatisfiedLinkError;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    move-object v6, p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "unable to find native library "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " using classloader: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ldalvik/system/BaseDexClassLoader;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :catch_1
    move-exception v0

    move-object v6, p0

    move-object p1, v0

    :goto_3
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Error getting activity info"

    invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public onDestroy()V
    .locals 3

    invoke-super {p0}, Lj/b;->onDestroy()V

    invoke-virtual {p0}, Lcom/google/androidgamesdk/GameActivity;->H1()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    sput-object v0, Lcom/google/androidgamesdk/GameActivity;->O:Lcom/google/androidgamesdk/GameActivity;

    iget-object v1, p0, Lcom/google/androidgamesdk/GameActivity;->I:Landroid/view/SurfaceHolder;

    if-eqz v1, :cond_1

    sget-wide v1, Lcom/google/androidgamesdk/GameActivity;->P:J

    invoke-virtual {p0, v1, v2}, Lcom/google/androidgamesdk/GameActivity;->onSurfaceDestroyedNative(J)V

    iput-object v0, p0, Lcom/google/androidgamesdk/GameActivity;->I:Landroid/view/SurfaceHolder;

    :cond_1
    sget-wide v0, Lcom/google/androidgamesdk/GameActivity;->P:J

    invoke-virtual {p0, v0, v1}, Lcom/google/androidgamesdk/GameActivity;->terminateNativeCode(J)V

    const-wide/16 v0, 0x0

    sput-wide v0, Lcom/google/androidgamesdk/GameActivity;->P:J

    return-void
.end method

.method public native onEditorActionNative(JI)V
.end method

.method public onGlobalLayout()V
    .locals 8

    invoke-virtual {p0}, Lcom/google/androidgamesdk/GameActivity;->H1()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/androidgamesdk/GameActivity;->H:Lcom/google/androidgamesdk/GameActivity$d;

    iget-object v1, p0, Lcom/google/androidgamesdk/GameActivity;->J:[I

    invoke-virtual {v0, v1}, Landroid/view/View;->getLocationInWindow([I)V

    iget-object v0, p0, Lcom/google/androidgamesdk/GameActivity;->H:Lcom/google/androidgamesdk/GameActivity$d;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v6

    iget-object v0, p0, Lcom/google/androidgamesdk/GameActivity;->H:Lcom/google/androidgamesdk/GameActivity$d;

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v7

    iget-object v0, p0, Lcom/google/androidgamesdk/GameActivity;->J:[I

    const/4 v1, 0x0

    aget v4, v0, v1

    iget v1, p0, Lcom/google/androidgamesdk/GameActivity;->K:I

    const/4 v2, 0x1

    if-ne v4, v1, :cond_2

    aget v1, v0, v2

    iget v3, p0, Lcom/google/androidgamesdk/GameActivity;->L:I

    if-ne v1, v3, :cond_2

    iget v1, p0, Lcom/google/androidgamesdk/GameActivity;->M:I

    if-ne v6, v1, :cond_2

    iget v1, p0, Lcom/google/androidgamesdk/GameActivity;->N:I

    if-eq v7, v1, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    return-void

    :cond_2
    :goto_1
    iput v4, p0, Lcom/google/androidgamesdk/GameActivity;->K:I

    aget v5, v0, v2

    iput v5, p0, Lcom/google/androidgamesdk/GameActivity;->L:I

    iput v6, p0, Lcom/google/androidgamesdk/GameActivity;->M:I

    iput v7, p0, Lcom/google/androidgamesdk/GameActivity;->N:I

    sget-wide v2, Lcom/google/androidgamesdk/GameActivity;->P:J

    move-object v1, p0

    invoke-virtual/range {v1 .. v7}, Lcom/google/androidgamesdk/GameActivity;->onContentRectChangedNative(JIIII)V

    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 2

    invoke-virtual {p0}, Lcom/google/androidgamesdk/GameActivity;->H1()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    sget-wide v0, Lcom/google/androidgamesdk/GameActivity;->P:J

    invoke-virtual {p0, v0, v1, p2}, Lcom/google/androidgamesdk/GameActivity;->onKeyDownNative(JLandroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    invoke-super {p0, p1, p2}, Lj/b;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public native onKeyDownNative(JLandroid/view/KeyEvent;)Z
.end method

.method public onKeyUp(ILandroid/view/KeyEvent;)Z
    .locals 2

    invoke-virtual {p0}, Lcom/google/androidgamesdk/GameActivity;->H1()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    sget-wide v0, Lcom/google/androidgamesdk/GameActivity;->P:J

    invoke-virtual {p0, v0, v1, p2}, Lcom/google/androidgamesdk/GameActivity;->onKeyUpNative(JLandroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyUp(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public native onKeyUpNative(JLandroid/view/KeyEvent;)Z
.end method

.method public onPause()V
    .locals 2

    invoke-super {p0}, Le4/q;->onPause()V

    invoke-virtual {p0}, Lcom/google/androidgamesdk/GameActivity;->H1()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    sget-wide v0, Lcom/google/androidgamesdk/GameActivity;->P:J

    invoke-virtual {p0, v0, v1}, Lcom/google/androidgamesdk/GameActivity;->onPauseNative(J)V

    return-void
.end method

.method public native onPauseNative(J)V
.end method

.method public onResume()V
    .locals 2

    invoke-super {p0}, Le4/q;->onResume()V

    invoke-virtual {p0}, Lcom/google/androidgamesdk/GameActivity;->H1()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    sget-wide v0, Lcom/google/androidgamesdk/GameActivity;->P:J

    invoke-virtual {p0, v0, v1}, Lcom/google/androidgamesdk/GameActivity;->onResumeNative(J)V

    return-void
.end method

.method public native onResumeNative(J)V
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Le/p;->onSaveInstanceState(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lcom/google/androidgamesdk/GameActivity;->H1()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    sget-wide v0, Lcom/google/androidgamesdk/GameActivity;->P:J

    invoke-virtual {p0, v0, v1}, Lcom/google/androidgamesdk/GameActivity;->onSaveInstanceStateNative(J)[B

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v1, "android:native_state"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    :cond_1
    :goto_0
    return-void
.end method

.method public native onSaveInstanceStateNative(J)[B
.end method

.method public native onSoftwareKeyboardVisibilityChangedNative(JZ)V
.end method

.method public onStart()V
    .locals 2

    invoke-super {p0}, Lj/b;->onStart()V

    invoke-virtual {p0}, Lcom/google/androidgamesdk/GameActivity;->H1()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    sget-wide v0, Lcom/google/androidgamesdk/GameActivity;->P:J

    invoke-virtual {p0, v0, v1}, Lcom/google/androidgamesdk/GameActivity;->onStartNative(J)V

    return-void
.end method

.method public native onStartNative(J)V
.end method

.method public onStop()V
    .locals 2

    invoke-super {p0}, Lj/b;->onStop()V

    invoke-virtual {p0}, Lcom/google/androidgamesdk/GameActivity;->H1()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    sget-wide v0, Lcom/google/androidgamesdk/GameActivity;->P:J

    invoke-virtual {p0, v0, v1}, Lcom/google/androidgamesdk/GameActivity;->onStopNative(J)V

    return-void
.end method

.method public native onStopNative(J)V
.end method

.method public native onSurfaceChangedNative(JLandroid/view/Surface;III)V
.end method

.method public native onSurfaceCreatedNative(JLandroid/view/Surface;)V
.end method

.method public native onSurfaceDestroyedNative(J)V
.end method

.method public native onSurfaceRedrawNeededNative(JLandroid/view/Surface;)V
.end method

.method public native onTextInputEventNative(JLcom/google/androidgamesdk/gametextinput/State;)V
.end method

.method public native onTouchEventNative(JLandroid/view/MotionEvent;IIIIIJJIIIIIIFF)Z
.end method

.method public onTrimMemory(I)V
    .locals 2

    invoke-super {p0, p1}, Le/p;->onTrimMemory(I)V

    invoke-virtual {p0}, Lcom/google/androidgamesdk/GameActivity;->H1()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    sget-wide v0, Lcom/google/androidgamesdk/GameActivity;->P:J

    invoke-virtual {p0, v0, v1, p1}, Lcom/google/androidgamesdk/GameActivity;->onTrimMemoryNative(JI)V

    return-void
.end method

.method public native onTrimMemoryNative(JI)V
.end method

.method public onWindowFocusChanged(Z)V
    .locals 2

    invoke-super {p0, p1}, Landroid/app/Activity;->onWindowFocusChanged(Z)V

    invoke-virtual {p0}, Lcom/google/androidgamesdk/GameActivity;->H1()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    sget-wide v0, Lcom/google/androidgamesdk/GameActivity;->P:J

    invoke-virtual {p0, v0, v1, p1}, Lcom/google/androidgamesdk/GameActivity;->onWindowFocusChangedNative(JZ)V

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/google/androidgamesdk/GameActivity;->H:Lcom/google/androidgamesdk/GameActivity$d;

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    iget-object p1, p0, Lcom/google/androidgamesdk/GameActivity;->H:Lcom/google/androidgamesdk/GameActivity$d;

    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    :cond_1
    :goto_0
    return-void
.end method

.method public native onWindowFocusChangedNative(JZ)V
.end method

.method public native onWindowInsetsChangedNative(J)V
.end method

.method public setImeEditorInfo(Landroid/view/inputmethod/EditorInfo;)V
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    iput-object p1, p0, Lcom/google/androidgamesdk/GameActivity;->F:Landroid/view/inputmethod/EditorInfo;

    iget-object v0, p0, Lcom/google/androidgamesdk/GameActivity;->H:Lcom/google/androidgamesdk/GameActivity$d;

    iget-object v0, v0, Lcom/google/androidgamesdk/GameActivity$d;->a:Lcom/google/androidgamesdk/gametextinput/InputConnection;

    invoke-virtual {v0, p1}, Lcom/google/androidgamesdk/gametextinput/InputConnection;->setEditorInfo(Landroid/view/inputmethod/EditorInfo;)V

    return-void
.end method

.method public setImeEditorInfoFields(III)V
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    invoke-virtual {p0}, Lcom/google/androidgamesdk/GameActivity;->G1()Landroid/view/inputmethod/EditorInfo;

    move-result-object v0

    iput p1, v0, Landroid/view/inputmethod/EditorInfo;->inputType:I

    iput p2, v0, Landroid/view/inputmethod/EditorInfo;->actionId:I

    iput p3, v0, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    iget-object p1, p0, Lcom/google/androidgamesdk/GameActivity;->H:Lcom/google/androidgamesdk/GameActivity$d;

    iget-object p1, p1, Lcom/google/androidgamesdk/GameActivity$d;->a:Lcom/google/androidgamesdk/gametextinput/InputConnection;

    invoke-virtual {p1, v0}, Lcom/google/androidgamesdk/gametextinput/InputConnection;->setEditorInfo(Landroid/view/inputmethod/EditorInfo;)V

    return-void
.end method

.method public native setInputConnectionNative(JLcom/google/androidgamesdk/gametextinput/InputConnection;)V
.end method

.method public setWindowFlags(II)V
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Landroid/view/Window;->setFlags(II)V

    return-void
.end method

.method public surfaceChanged(Landroid/view/SurfaceHolder;III)V
    .locals 8

    invoke-virtual {p0}, Lcom/google/androidgamesdk/GameActivity;->H1()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iput-object p1, p0, Lcom/google/androidgamesdk/GameActivity;->I:Landroid/view/SurfaceHolder;

    sget-wide v2, Lcom/google/androidgamesdk/GameActivity;->P:J

    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    move-result-object v4

    move-object v1, p0

    move v5, p2

    move v6, p3

    move v7, p4

    invoke-virtual/range {v1 .. v7}, Lcom/google/androidgamesdk/GameActivity;->onSurfaceChangedNative(JLandroid/view/Surface;III)V

    return-void
.end method

.method public surfaceCreated(Landroid/view/SurfaceHolder;)V
    .locals 2

    invoke-virtual {p0}, Lcom/google/androidgamesdk/GameActivity;->H1()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iput-object p1, p0, Lcom/google/androidgamesdk/GameActivity;->I:Landroid/view/SurfaceHolder;

    sget-wide v0, Lcom/google/androidgamesdk/GameActivity;->P:J

    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    move-result-object p1

    invoke-virtual {p0, v0, v1, p1}, Lcom/google/androidgamesdk/GameActivity;->onSurfaceCreatedNative(JLandroid/view/Surface;)V

    return-void
.end method

.method public surfaceDestroyed(Landroid/view/SurfaceHolder;)V
    .locals 2

    invoke-virtual {p0}, Lcom/google/androidgamesdk/GameActivity;->H1()Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/androidgamesdk/GameActivity;->I:Landroid/view/SurfaceHolder;

    sget-wide v0, Lcom/google/androidgamesdk/GameActivity;->P:J

    invoke-virtual {p0, v0, v1}, Lcom/google/androidgamesdk/GameActivity;->onSurfaceDestroyedNative(J)V

    return-void
.end method

.method public surfaceRedrawNeeded(Landroid/view/SurfaceHolder;)V
    .locals 2

    invoke-virtual {p0}, Lcom/google/androidgamesdk/GameActivity;->H1()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iput-object p1, p0, Lcom/google/androidgamesdk/GameActivity;->I:Landroid/view/SurfaceHolder;

    sget-wide v0, Lcom/google/androidgamesdk/GameActivity;->P:J

    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    move-result-object p1

    invoke-virtual {p0, v0, v1, p1}, Lcom/google/androidgamesdk/GameActivity;->onSurfaceRedrawNeededNative(JLandroid/view/Surface;)V

    return-void
.end method

.method public native terminateNativeCode(J)V
.end method
