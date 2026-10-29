.class public final Lln/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/hardware/SensorEventListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lln/b;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\u00042\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "ln/b$a",
        "Landroid/hardware/SensorEventListener;",
        "Landroid/hardware/SensorEvent;",
        "event",
        "",
        "onSensorChanged",
        "(Landroid/hardware/SensorEvent;)V",
        "Landroid/hardware/Sensor;",
        "sensor",
        "",
        "accuracy",
        "onAccuracyChanged",
        "(Landroid/hardware/Sensor;I)V",
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
.field public final synthetic a:Lln/b;


# direct methods
.method public constructor <init>(Lln/b;)V
    .locals 0

    iput-object p1, p0, Lln/b$a;->a:Lln/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAccuracyChanged(Landroid/hardware/Sensor;I)V
    .locals 0

    return-void
.end method

.method public onSensorChanged(Landroid/hardware/SensorEvent;)V
    .locals 6

    if-eqz p1, :cond_2

    iget-object p1, p1, Landroid/hardware/SensorEvent;->values:[F

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    array-length v0, p1

    const/4 v1, 0x3

    if-ge v0, v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    aget v0, p1, v0

    const/4 v1, 0x1

    aget v1, p1, v1

    const/4 v2, 0x2

    aget p1, p1, v2

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    add-float/2addr v0, v1

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    add-float/2addr v0, p1

    float-to-double v0, v0

    const-wide/high16 v2, 0x4008000000000000L    # 3.0

    div-double/2addr v0, v2

    iget-object p1, p0, Lln/b$a;->a:Lln/b;

    invoke-static {p1}, Lln/b;->e(Lln/b;)D

    move-result-wide v2

    iget-object v4, p0, Lln/b$a;->a:Lln/b;

    invoke-static {v4}, Lln/b;->f(Lln/b;)J

    move-result-wide v4

    long-to-double v4, v4

    mul-double/2addr v2, v4

    add-double/2addr v2, v0

    iget-object v0, p0, Lln/b$a;->a:Lln/b;

    invoke-static {v0}, Lln/b;->f(Lln/b;)J

    move-result-wide v0

    const-wide/16 v4, 0x1

    add-long/2addr v0, v4

    long-to-double v0, v0

    div-double/2addr v2, v0

    invoke-static {p1, v2, v3}, Lln/b;->g(Lln/b;D)V

    iget-object p1, p0, Lln/b$a;->a:Lln/b;

    invoke-static {p1}, Lln/b;->f(Lln/b;)J

    move-result-wide v0

    iget-object p1, p0, Lln/b$a;->a:Lln/b;

    add-long/2addr v0, v4

    invoke-static {p1, v0, v1}, Lln/b;->h(Lln/b;J)V

    :cond_2
    :goto_0
    return-void
.end method
