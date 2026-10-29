.class public Lhm/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhm/b$f;,
        Lhm/b$h;,
        Lhm/b$g;
    }
.end annotation


# instance fields
.field public a:Lcom/roblox/universalapp/messagebus/MessageBus;

.field public b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/roblox/universalapp/messagebus/Connection;",
            ">;"
        }
    .end annotation
.end field

.field public c:Z

.field public d:Ljava/util/Timer;

.field public e:Landroid/os/Vibrator;

.field public f:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lhm/b$h;",
            ">;"
        }
    .end annotation
.end field

.field public g:F

.field public h:Z

.field public i:I


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/roblox/universalapp/messagebus/MessageBus;->f()Lcom/roblox/universalapp/messagebus/MessageBus;

    move-result-object v0

    iput-object v0, p0, Lhm/b;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lhm/b;->b:Ljava/util/ArrayList;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lhm/b;->c:Z

    const/4 v1, 0x0

    iput-object v1, p0, Lhm/b;->d:Ljava/util/Timer;

    iput-object v1, p0, Lhm/b;->e:Landroid/os/Vibrator;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Lhm/b;->f:Ljava/util/Map;

    const/4 v1, 0x0

    iput v1, p0, Lhm/b;->g:F

    const/4 v1, 0x1

    iput-boolean v1, p0, Lhm/b;->h:Z

    iput v0, p0, Lhm/b;->i:I

    return-void
.end method

.method public static bridge synthetic a(Lhm/b;)Lcom/roblox/universalapp/messagebus/MessageBus;
    .locals 0

    iget-object p0, p0, Lhm/b;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    return-object p0
.end method

.method public static bridge synthetic b(Lhm/b;F)V
    .locals 0

    iput p1, p0, Lhm/b;->g:F

    return-void
.end method

.method public static bridge synthetic c(Lhm/b;Z)V
    .locals 0

    iput-boolean p1, p0, Lhm/b;->h:Z

    return-void
.end method

.method public static bridge synthetic d(Lhm/b;Ljava/util/Map;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lhm/b;->p(Ljava/util/Map;)Z

    move-result p0

    return p0
.end method

.method public static g(Landroid/os/Vibrator;)Z
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    const/4 v2, 0x0

    if-lt v0, v1, :cond_0

    :try_start_0
    invoke-static {v2}, Landroid/os/VibrationEffect;->createPredefined(I)Landroid/os/VibrationEffect;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/os/Vibrator;->vibrate(Landroid/os/VibrationEffect;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p0, 0x1

    return p0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Fallback VibrationEffect failed: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "HapticProtocol"

    invoke-static {v0, p0}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return v2
.end method

.method public static h()Lhm/b;
    .locals 1

    invoke-static {}, Lhm/b$f;->a()Lhm/b;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public e()V
    .locals 4

    iget v0, p0, Lhm/b;->i:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Lhm/b;->i:I

    if-eq v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iput-object v0, p0, Lhm/b;->d:Ljava/util/Timer;

    new-instance v1, Lhm/b$e;

    invoke-direct {v1, p0}, Lhm/b$e;-><init>(Lhm/b;)V

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    return-void
.end method

.method public f()V
    .locals 1

    iget v0, p0, Lhm/b;->i:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lhm/b;->i:I

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lhm/b;->d:Ljava/util/Timer;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    const/4 v0, 0x0

    iput-object v0, p0, Lhm/b;->d:Ljava/util/Timer;

    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lhm/b;->h:Z

    invoke-virtual {p0}, Lhm/b;->q()V

    return-void
.end method

.method public i()Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "[F>;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p0, Lhm/b;->f:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lhm/b$h;

    invoke-virtual {v2}, Lhm/b$h;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Lhm/b$h;->d()[F

    move-result-object v2

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final j()Ljava/lang/String;
    .locals 8

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    iget-object v1, p0, Lhm/b;->f:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lhm/b$h;

    invoke-virtual {v2}, Lhm/b$h;->d()[F

    move-result-object v2

    array-length v4, v2

    const/4 v5, 0x3

    if-ne v4, v5, :cond_0

    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    const-string v5, "x"

    const/4 v6, 0x0

    aget v6, v2, v6

    float-to-double v6, v6

    invoke-virtual {v4, v5, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    const-string v5, "y"

    const/4 v6, 0x1

    aget v6, v2, v6

    float-to-double v6, v6

    invoke-virtual {v4, v5, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    const-string v5, "z"

    const/4 v6, 0x2

    aget v2, v2, v6

    float-to-double v6, v2

    invoke-virtual {v4, v5, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception while handling GetMotorsJSONString request: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "HapticProtocol"

    invoke-static {v2, v1}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public k()Z
    .locals 1

    iget-boolean v0, p0, Lhm/b;->c:Z

    return v0
.end method

.method public l(Landroid/content/Context;)V
    .locals 4

    iget-boolean v0, p0, Lhm/b;->c:Z

    if-eqz v0, :cond_0

    goto/16 :goto_1

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_1

    invoke-virtual {p0, p1}, Lhm/b;->n(Landroid/content/Context;)Landroid/os/Vibrator;

    move-result-object v0

    iput-object v0, p0, Lhm/b;->e:Landroid/os/Vibrator;

    goto :goto_0

    :cond_1
    const-string v0, "vibrator"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Vibrator;

    iput-object v0, p0, Lhm/b;->e:Landroid/os/Vibrator;

    :goto_0
    iget-object v0, p0, Lhm/b;->e:Landroid/os/Vibrator;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/os/Vibrator;->hasVibrator()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    const/4 v0, 0x1

    iput-boolean v0, p0, Lhm/b;->c:Z

    invoke-virtual {p0, p1}, Lhm/b;->m(Landroid/content/Context;)V

    iget-object p1, p0, Lhm/b;->b:Ljava/util/ArrayList;

    iget-object v0, p0, Lhm/b;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    new-instance v1, Lhm/b$a;

    invoke-direct {v1, p0}, Lhm/b$a;-><init>(Lhm/b;)V

    const-string v2, "HapticProtocol"

    const-string v3, "SupportsHaptics"

    invoke-virtual {v0, v2, v3, v1}, Lcom/roblox/universalapp/messagebus/MessageBus;->w(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lhm/b;->b:Ljava/util/ArrayList;

    iget-object v0, p0, Lhm/b;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    new-instance v1, Lhm/b$b;

    invoke-direct {v1, p0}, Lhm/b$b;-><init>(Lhm/b;)V

    const-string v3, "UpdateSingletonVibration"

    invoke-virtual {v0, v2, v3, v1}, Lcom/roblox/universalapp/messagebus/MessageBus;->w(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lhm/b;->b:Ljava/util/ArrayList;

    iget-object v0, p0, Lhm/b;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    new-instance v1, Lhm/b$c;

    invoke-direct {v1, p0}, Lhm/b$c;-><init>(Lhm/b;)V

    const-string v3, "GetMotors"

    invoke-virtual {v0, v2, v3, v1}, Lcom/roblox/universalapp/messagebus/MessageBus;->w(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lhm/b;->b:Ljava/util/ArrayList;

    iget-object v0, p0, Lhm/b;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    new-instance v1, Lhm/b$d;

    invoke-direct {v1, p0}, Lhm/b$d;-><init>(Lhm/b;)V

    const-string v3, "SetMotorState"

    invoke-virtual {v0, v2, v3, v1}, Lcom/roblox/universalapp/messagebus/MessageBus;->w(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->d()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Lhm/b;->k()Z

    move-result p1

    invoke-virtual {p0}, Lhm/b;->j()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeUpdateMobileHapticsState(ZLjava/lang/String;)V

    :cond_3
    :goto_1
    return-void
.end method

.method public final m(Landroid/content/Context;)V
    .locals 8

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    const/4 v2, 0x3

    if-lt v0, v1, :cond_1

    const-string v0, "vibrator_manager"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lhm/a;->a(Ljava/lang/Object;)Landroid/os/VibratorManager;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/os/VibratorManager;->getVibratorIds()[I

    move-result-object v0

    array-length v1, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    aget v4, v0, v3

    invoke-virtual {p1, v4}, Landroid/os/VibratorManager;->getVibrator(I)Landroid/os/Vibrator;

    move-result-object v5

    if-eqz v5, :cond_0

    invoke-virtual {v5}, Landroid/os/Vibrator;->hasVibrator()Z

    move-result v6

    if-eqz v6, :cond_0

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "vibrator_"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-instance v6, Lhm/b$h;

    new-array v7, v2, [F

    fill-array-data v7, :array_0

    invoke-direct {v6, v4, v5, v7}, Lhm/b$h;-><init>(Ljava/lang/String;Landroid/os/Vibrator;[F)V

    iget-object v5, p0, Lhm/b;->f:Ljava/util/Map;

    invoke-interface {v5, v4, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lhm/b;->f:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lhm/b;->e:Landroid/os/Vibrator;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/os/Vibrator;->hasVibrator()Z

    move-result p1

    if-eqz p1, :cond_2

    new-instance p1, Lhm/b$h;

    iget-object v0, p0, Lhm/b;->e:Landroid/os/Vibrator;

    new-array v1, v2, [F

    fill-array-data v1, :array_1

    const-string v2, "defaultMotor"

    invoke-direct {p1, v2, v0, v1}, Lhm/b$h;-><init>(Ljava/lang/String;Landroid/os/Vibrator;[F)V

    iget-object v0, p0, Lhm/b;->f:Ljava/util/Map;

    invoke-interface {v0, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    return-void

    :array_0
    .array-data 4
        0x0
        0x0
        0x0
    .end array-data

    :array_1
    .array-data 4
        0x0
        0x0
        0x0
    .end array-data
.end method

.method public final n(Landroid/content/Context;)Landroid/os/Vibrator;
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0x1f
    .end annotation

    const-string v0, "vibrator_manager"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lhm/a;->a(Ljava/lang/Object;)Landroid/os/VibratorManager;

    move-result-object p1

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->z4()Z

    move-result v0

    if-eqz v0, :cond_0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p1}, Landroid/os/VibratorManager;->getDefaultVibrator()Landroid/os/Vibrator;

    move-result-object p1

    return-object p1
.end method

.method public final o(Landroid/os/Vibrator;Landroid/os/VibrationEffect;)Z
    .locals 4

    const-string v0, "HapticProtocol"

    const/4 v1, 0x0

    if-eqz p1, :cond_4

    iget-boolean v2, p0, Lhm/b;->c:Z

    if-nez v2, :cond_0

    goto/16 :goto_4

    :cond_0
    :try_start_0
    invoke-virtual {p1}, Landroid/os/Vibrator;->hasVibrator()Z

    move-result v2

    if-nez v2, :cond_1

    return v1

    :cond_1
    invoke-virtual {p1, p2}, Landroid/os/Vibrator;->vibrate(Landroid/os/VibrationEffect;)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x1

    return p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p2

    goto :goto_1

    :catch_2
    move-exception p2

    goto :goto_2

    :catch_3
    move-exception p1

    goto :goto_3

    :goto_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected vibration exception: "

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    iput-boolean v1, p0, Lhm/b;->c:Z

    return v1

    :goto_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Runtime crash from vibrator (OEM/HAL): "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p2}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {p1}, Lhm/b;->g(Landroid/os/Vibrator;)Z

    move-result p1

    if-nez p1, :cond_2

    iput-boolean v1, p0, Lhm/b;->c:Z

    :cond_2
    return v1

    :goto_2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Bad vibration effect: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p2}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {p1}, Lhm/b;->g(Landroid/os/Vibrator;)Z

    move-result p1

    if-nez p1, :cond_3

    iput-boolean v1, p0, Lhm/b;->c:Z

    :cond_3
    return v1

    :goto_3
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No vibration permission: "

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    iput-boolean v1, p0, Lhm/b;->c:Z

    :cond_4
    :goto_4
    return v1
.end method

.method public final p(Ljava/util/Map;)Z
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lhm/b$g;",
            ">;)Z"
        }
    .end annotation

    invoke-virtual {p0}, Lhm/b;->k()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lhm/b;->f:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lhm/b$h;

    invoke-virtual {v2}, Lhm/b$h;->e()Landroid/os/Vibrator;

    move-result-object v2

    invoke-virtual {v2}, Landroid/os/Vibrator;->cancel()V

    goto :goto_0

    :cond_1
    iget-boolean v0, p0, Lhm/b;->h:Z

    if-nez v0, :cond_2

    return v1

    :cond_2
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x1

    :cond_3
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    iget-object v4, p0, Lhm/b;->f:Ljava/util/Map;

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lhm/b$h;

    if-eqz v3, :cond_5

    invoke-virtual {v3}, Lhm/b$h;->e()Landroid/os/Vibrator;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lhm/b$g;

    invoke-virtual {v2}, Lhm/b$g;->d()F

    move-result v4

    invoke-virtual {v2}, Lhm/b$g;->c()[F

    move-result-object v2

    array-length v5, v2

    new-array v6, v5, [J

    new-array v7, v5, [I

    move v8, v1

    :goto_2
    if-ge v8, v5, :cond_4

    float-to-long v9, v4

    aput-wide v9, v6, v8

    aget v9, v2, v8

    const/high16 v10, 0x437f0000    # 255.0f

    mul-float/2addr v9, v10

    float-to-double v9, v9

    const-wide/high16 v11, 0x3fe0000000000000L    # 0.5

    add-double/2addr v9, v11

    double-to-int v9, v9

    aput v9, v7, v8

    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    :cond_4
    const/4 v2, -0x1

    invoke-static {v6, v7, v2}, Landroid/os/VibrationEffect;->createWaveform([J[II)Landroid/os/VibrationEffect;

    move-result-object v2

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v4

    invoke-interface {v4}, Lth/i;->z4()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-virtual {p0, v3, v2}, Lhm/b;->o(Landroid/os/Vibrator;Landroid/os/VibrationEffect;)Z

    move-result v2

    if-nez v2, :cond_3

    :cond_5
    move v0, v1

    goto :goto_1

    :cond_6
    invoke-virtual {v3, v2}, Landroid/os/Vibrator;->vibrate(Landroid/os/VibrationEffect;)V

    goto :goto_1

    :cond_7
    return v0
.end method

.method public q()V
    .locals 5

    invoke-virtual {p0}, Lhm/b;->k()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lhm/b;->e:Landroid/os/Vibrator;

    invoke-virtual {v0}, Landroid/os/Vibrator;->cancel()V

    iget-boolean v0, p0, Lhm/b;->h:Z

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    iget v0, p0, Lhm/b;->g:F

    const/high16 v1, 0x437f0000    # 255.0f

    mul-float/2addr v0, v1

    float-to-double v0, v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    add-double/2addr v0, v2

    double-to-int v0, v0

    if-nez v0, :cond_2

    :goto_0
    return-void

    :cond_2
    const/4 v1, 0x1

    new-array v1, v1, [J

    const-wide/16 v2, 0x3e8

    const/4 v4, 0x0

    aput-wide v2, v1, v4

    filled-new-array {v0}, [I

    move-result-object v0

    invoke-static {v1, v0, v4}, Landroid/os/VibrationEffect;->createWaveform([J[II)Landroid/os/VibrationEffect;

    move-result-object v0

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v1

    invoke-interface {v1}, Lth/i;->z4()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lhm/b;->e:Landroid/os/Vibrator;

    invoke-virtual {p0, v1, v0}, Lhm/b;->o(Landroid/os/Vibrator;Landroid/os/VibrationEffect;)Z

    return-void

    :cond_3
    iget-object v1, p0, Lhm/b;->e:Landroid/os/Vibrator;

    invoke-virtual {v1, v0}, Landroid/os/Vibrator;->vibrate(Landroid/os/VibrationEffect;)V

    return-void
.end method
