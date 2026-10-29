.class public final Lcom/google/android/gms/internal/play_billing/z;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/google/android/gms/internal/play_billing/c0;

.field public b:Z

.field public c:J

.field public d:J


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/play_billing/c0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "ticker"

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/play_billing/x;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/z;->a:Lcom/google/android/gms/internal/play_billing/c0;

    return-void
.end method

.method public static b(Lcom/google/android/gms/internal/play_billing/c0;)Lcom/google/android/gms/internal/play_billing/z;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/play_billing/z;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/play_billing/z;-><init>(Lcom/google/android/gms/internal/play_billing/c0;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/z;->e()Lcom/google/android/gms/internal/play_billing/z;

    return-object v0
.end method

.method public static c(Lcom/google/android/gms/internal/play_billing/c0;)Lcom/google/android/gms/internal/play_billing/z;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/play_billing/z;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/play_billing/z;-><init>(Lcom/google/android/gms/internal/play_billing/c0;)V

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/util/concurrent/TimeUnit;)J
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/internal/play_billing/z;->h()J

    move-result-wide v0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final d()Lcom/google/android/gms/internal/play_billing/z;
    .locals 2

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/gms/internal/play_billing/z;->c:J

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/play_billing/z;->b:Z

    return-object p0
.end method

.method public final e()Lcom/google/android/gms/internal/play_billing/z;
    .locals 3

    iget-boolean v0, p0, Lcom/google/android/gms/internal/play_billing/z;->b:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    const-string v2, "This stopwatch is already running."

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/play_billing/x;->e(ZLjava/lang/Object;)V

    iput-boolean v1, p0, Lcom/google/android/gms/internal/play_billing/z;->b:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/z;->a:Lcom/google/android/gms/internal/play_billing/c0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/c0;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/internal/play_billing/z;->d:J

    return-object p0
.end method

.method public final f()Lcom/google/android/gms/internal/play_billing/z;
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/z;->a:Lcom/google/android/gms/internal/play_billing/c0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/c0;->a()J

    move-result-wide v0

    iget-boolean v2, p0, Lcom/google/android/gms/internal/play_billing/z;->b:Z

    const-string v3, "This stopwatch is already stopped."

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/play_billing/x;->e(ZLjava/lang/Object;)V

    const/4 v2, 0x0

    iput-boolean v2, p0, Lcom/google/android/gms/internal/play_billing/z;->b:Z

    iget-wide v2, p0, Lcom/google/android/gms/internal/play_billing/z;->c:J

    iget-wide v4, p0, Lcom/google/android/gms/internal/play_billing/z;->d:J

    sub-long/2addr v0, v4

    add-long/2addr v2, v0

    iput-wide v2, p0, Lcom/google/android/gms/internal/play_billing/z;->c:J

    return-object p0
.end method

.method public final g()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/play_billing/z;->b:Z

    return v0
.end method

.method public final h()J
    .locals 4

    iget-boolean v0, p0, Lcom/google/android/gms/internal/play_billing/z;->b:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/z;->a:Lcom/google/android/gms/internal/play_billing/c0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/c0;->a()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/google/android/gms/internal/play_billing/z;->d:J

    sub-long/2addr v0, v2

    iget-wide v2, p0, Lcom/google/android/gms/internal/play_billing/z;->c:J

    add-long/2addr v0, v2

    return-wide v0

    :cond_0
    iget-wide v0, p0, Lcom/google/android/gms/internal/play_billing/z;->c:J

    return-wide v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 8

    invoke-virtual {p0}, Lcom/google/android/gms/internal/play_billing/z;->h()J

    move-result-wide v0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    sget-object v3, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v2, v0, v1, v3}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmp-long v4, v4, v6

    if-lez v4, :cond_0

    goto :goto_0

    :cond_0
    sget-object v2, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v2, v0, v1, v3}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v4

    cmp-long v4, v4, v6

    if-lez v4, :cond_1

    goto :goto_0

    :cond_1
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v2, v0, v1, v3}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v4

    cmp-long v4, v4, v6

    if-lez v4, :cond_2

    goto :goto_0

    :cond_2
    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v2, v0, v1, v3}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v4

    cmp-long v4, v4, v6

    if-lez v4, :cond_3

    goto :goto_0

    :cond_3
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v2, v0, v1, v3}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v4

    cmp-long v4, v4, v6

    if-lez v4, :cond_4

    goto :goto_0

    :cond_4
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MICROSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v2, v0, v1, v3}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v4

    cmp-long v4, v4, v6

    if-lez v4, :cond_5

    goto :goto_0

    :cond_5
    move-object v2, v3

    :goto_0
    long-to-double v0, v0

    const-wide/16 v4, 0x1

    invoke-virtual {v3, v4, v5, v2}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v3

    long-to-double v3, v3

    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    div-double/2addr v0, v3

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "%.4g"

    invoke-static {v5, v1, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/play_billing/y;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :pswitch_0
    const-string v1, "d"

    goto :goto_1

    :pswitch_1
    const-string v1, "h"

    goto :goto_1

    :pswitch_2
    const-string v1, "min"

    goto :goto_1

    :pswitch_3
    const-string v1, "s"

    goto :goto_1

    :pswitch_4
    const-string v1, "ms"

    goto :goto_1

    :pswitch_5
    const-string v1, "\u03bcs"

    goto :goto_1

    :pswitch_6
    const-string v1, "ns"

    :goto_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
