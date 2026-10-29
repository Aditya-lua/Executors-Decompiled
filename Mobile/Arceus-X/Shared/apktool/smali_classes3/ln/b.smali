.class public final Lln/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lln/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000O\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0008\u0005*\u0001\u001e\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\t\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\u0008J\u000f\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\r\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u0008R\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000fR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 \u00a8\u0006\""
    }
    d2 = {
        "Lln/b;",
        "Lln/a;",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "",
        "d",
        "()V",
        "c",
        "Lln/a$a;",
        "b",
        "()Lln/a$a;",
        "a",
        "Landroid/hardware/SensorManager;",
        "Landroid/hardware/SensorManager;",
        "sensorManager",
        "Landroid/hardware/Sensor;",
        "Landroid/hardware/Sensor;",
        "sensor",
        "",
        "J",
        "measurementsTaken",
        "",
        "D",
        "averageRotationPerMeasurement",
        "",
        "e",
        "Z",
        "isEventListenerRegistered",
        "ln/b$a",
        "f",
        "Lln/b$a;",
        "sensorEventListener",
        "camera_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Landroid/hardware/SensorManager;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Landroid/hardware/Sensor;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public c:J

.field public d:D

.field public e:Z

.field public final f:Lln/b$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "sensor"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type android.hardware.SensorManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/hardware/SensorManager;

    iput-object p1, p0, Lln/b;->a:Landroid/hardware/SensorManager;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object p1

    iput-object p1, p0, Lln/b;->b:Landroid/hardware/Sensor;

    new-instance p1, Lln/b$a;

    invoke-direct {p1, p0}, Lln/b$a;-><init>(Lln/b;)V

    iput-object p1, p0, Lln/b;->f:Lln/b$a;

    return-void
.end method

.method public static final synthetic e(Lln/b;)D
    .locals 2

    iget-wide v0, p0, Lln/b;->d:D

    return-wide v0
.end method

.method public static final synthetic f(Lln/b;)J
    .locals 2

    iget-wide v0, p0, Lln/b;->c:J

    return-wide v0
.end method

.method public static final synthetic g(Lln/b;D)V
    .locals 0

    iput-wide p1, p0, Lln/b;->d:D

    return-void
.end method

.method public static final synthetic h(Lln/b;J)V
    .locals 0

    iput-wide p1, p0, Lln/b;->c:J

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lln/b;->c:J

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lln/b;->d:D

    return-void
.end method

.method public b()Lln/a$a;
    .locals 5
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lln/a$a;

    iget-wide v1, p0, Lln/b;->c:J

    const-wide/16 v3, 0x0

    cmp-long v3, v1, v3

    if-nez v3, :cond_0

    const-wide/16 v1, 0x0

    goto :goto_0

    :cond_0
    iget-wide v3, p0, Lln/b;->d:D

    long-to-double v1, v1

    div-double v1, v3, v1

    :goto_0
    invoke-direct {v0, v1, v2}, Lln/a$a;-><init>(D)V

    return-object v0
.end method

.method public c()V
    .locals 2

    const/4 v0, 0x0

    iput-boolean v0, p0, Lln/b;->e:Z

    iget-object v0, p0, Lln/b;->a:Landroid/hardware/SensorManager;

    iget-object v1, p0, Lln/b;->f:Lln/b$a;

    invoke-virtual {v0, v1}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V

    return-void
.end method

.method public d()V
    .locals 4

    iget-boolean v0, p0, Lln/b;->e:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lln/b;->e:Z

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lln/b;->c:J

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lln/b;->d:D

    iget-object v0, p0, Lln/b;->b:Landroid/hardware/Sensor;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lln/b;->a:Landroid/hardware/SensorManager;

    iget-object v2, p0, Lln/b;->f:Lln/b$a;

    const v3, 0x186a0

    invoke-virtual {v1, v2, v0, v3}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    :cond_1
    :goto_0
    return-void
.end method
