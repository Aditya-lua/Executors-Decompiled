.class public final synthetic Lnf/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnf/p$c;


# instance fields
.field public final synthetic a:Lnf/o;

.field public final synthetic b:Ljava/lang/Runnable;

.field public final synthetic c:J

.field public final synthetic d:J

.field public final synthetic e:Ljava/util/concurrent/TimeUnit;


# direct methods
.method public synthetic constructor <init>(Lnf/o;Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnf/f;->a:Lnf/o;

    iput-object p2, p0, Lnf/f;->b:Ljava/lang/Runnable;

    iput-wide p3, p0, Lnf/f;->c:J

    iput-wide p5, p0, Lnf/f;->d:J

    iput-object p7, p0, Lnf/f;->e:Ljava/util/concurrent/TimeUnit;

    return-void
.end method


# virtual methods
.method public final a(Lnf/p$b;)Ljava/util/concurrent/ScheduledFuture;
    .locals 8

    iget-object v0, p0, Lnf/f;->a:Lnf/o;

    iget-object v1, p0, Lnf/f;->b:Ljava/lang/Runnable;

    iget-wide v2, p0, Lnf/f;->c:J

    iget-wide v4, p0, Lnf/f;->d:J

    iget-object v6, p0, Lnf/f;->e:Ljava/util/concurrent/TimeUnit;

    move-object v7, p1

    invoke-static/range {v0 .. v7}, Lnf/o;->d(Lnf/o;Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;Lnf/p$b;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    return-object p1
.end method
