.class public final synthetic Lpf/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpf/p$c;


# instance fields
.field public final synthetic a:Lpf/o;

.field public final synthetic b:Ljava/lang/Runnable;

.field public final synthetic c:J

.field public final synthetic d:J

.field public final synthetic e:Ljava/util/concurrent/TimeUnit;


# direct methods
.method public synthetic constructor <init>(Lpf/o;Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpf/g;->a:Lpf/o;

    iput-object p2, p0, Lpf/g;->b:Ljava/lang/Runnable;

    iput-wide p3, p0, Lpf/g;->c:J

    iput-wide p5, p0, Lpf/g;->d:J

    iput-object p7, p0, Lpf/g;->e:Ljava/util/concurrent/TimeUnit;

    return-void
.end method


# virtual methods
.method public final a(Lpf/p$b;)Ljava/util/concurrent/ScheduledFuture;
    .locals 8

    iget-object v0, p0, Lpf/g;->a:Lpf/o;

    iget-object v1, p0, Lpf/g;->b:Ljava/lang/Runnable;

    iget-wide v2, p0, Lpf/g;->c:J

    iget-wide v4, p0, Lpf/g;->d:J

    iget-object v6, p0, Lpf/g;->e:Ljava/util/concurrent/TimeUnit;

    move-object v7, p1

    invoke-static/range {v0 .. v7}, Lpf/o;->c(Lpf/o;Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;Lpf/p$b;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    return-object p1
.end method
