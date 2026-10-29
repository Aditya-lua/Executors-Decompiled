.class public final Lf6/j0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf6/j0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\n\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003Je\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\n8\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R,\u0010\u001e\u001a\u001a\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001c0\u001b\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001d0\u001b0\u001a8\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001f\u00a8\u0006 "
    }
    d2 = {
        "Lf6/j0$a;",
        "",
        "<init>",
        "()V",
        "",
        "isBackedOff",
        "",
        "runAttemptCount",
        "Lx5/a;",
        "backoffPolicy",
        "",
        "backoffDelayDuration",
        "lastEnqueueTime",
        "periodCount",
        "isPeriodic",
        "initialDelay",
        "flexDuration",
        "intervalDuration",
        "nextScheduleTimeOverride",
        "a",
        "(ZILx5/a;JJIZJJJJ)J",
        "",
        "TAG",
        "Ljava/lang/String;",
        "SCHEDULE_NOT_REQUESTED_YET",
        "J",
        "Lt/a;",
        "",
        "Lf6/j0$c;",
        "Lx5/o0;",
        "WORK_INFO_MAPPER",
        "Lt/a;",
        "work-runtime_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lf6/j0$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(ZILx5/a;JJIZJJJJ)J
    .locals 5
    .param p3    # Lx5/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    move-wide/from16 v0, p16

    const-string v2, "backoffPolicy"

    invoke-static {p3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide v2, 0x7fffffffffffffffL

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    if-eqz p9, :cond_1

    if-nez p8, :cond_0

    return-wide v0

    :cond_0
    const-wide/32 p1, 0xdbba0

    add-long/2addr p1, p6

    invoke-static {v0, v1, p1, p2}, Lkotlin/ranges/d;->d(JJ)J

    move-result-wide p1

    return-wide p1

    :cond_1
    if-eqz p1, :cond_3

    sget-object p1, Lx5/a;->b:Lx5/a;

    if-ne p3, p1, :cond_2

    int-to-long p1, p2

    mul-long/2addr p4, p1

    goto :goto_0

    :cond_2
    long-to-float p1, p4

    add-int/lit8 p2, p2, -0x1

    invoke-static {p1, p2}, Ljava/lang/Math;->scalb(FI)F

    move-result p1

    float-to-long p4, p1

    :goto_0
    const-wide/32 p1, 0x112a880

    invoke-static {p4, p5, p1, p2}, Lkotlin/ranges/d;->g(JJ)J

    move-result-wide p1

    add-long/2addr p1, p6

    return-wide p1

    :cond_3
    if-eqz p9, :cond_6

    if-nez p8, :cond_4

    add-long p1, p6, p10

    goto :goto_1

    :cond_4
    add-long p1, p6, p14

    :goto_1
    cmp-long p3, p12, p14

    if-eqz p3, :cond_5

    if-nez p8, :cond_5

    sub-long p3, p14, p12

    add-long/2addr p1, p3

    :cond_5
    return-wide p1

    :cond_6
    const-wide/16 p1, -0x1

    cmp-long p1, p6, p1

    if-nez p1, :cond_7

    return-wide v2

    :cond_7
    add-long p1, p6, p10

    return-wide p1
.end method
