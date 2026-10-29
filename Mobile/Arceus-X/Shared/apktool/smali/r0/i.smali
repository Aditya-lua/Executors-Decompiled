.class public final synthetic Lr0/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly1/c$c;


# instance fields
.field public final synthetic a:Lne/x;

.field public final synthetic b:Ljava/util/concurrent/ScheduledExecutorService;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Z

.field public final synthetic e:J


# direct methods
.method public synthetic constructor <init>(Lne/x;Ljava/util/concurrent/ScheduledExecutorService;Ljava/lang/Object;ZJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr0/i;->a:Lne/x;

    iput-object p2, p0, Lr0/i;->b:Ljava/util/concurrent/ScheduledExecutorService;

    iput-object p3, p0, Lr0/i;->c:Ljava/lang/Object;

    iput-boolean p4, p0, Lr0/i;->d:Z

    iput-wide p5, p0, Lr0/i;->e:J

    return-void
.end method


# virtual methods
.method public final a(Ly1/c$a;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lr0/i;->a:Lne/x;

    iget-object v1, p0, Lr0/i;->b:Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v2, p0, Lr0/i;->c:Ljava/lang/Object;

    iget-boolean v3, p0, Lr0/i;->d:Z

    iget-wide v4, p0, Lr0/i;->e:J

    move-object v6, p1

    invoke-static/range {v0 .. v6}, Lr0/n;->a(Lne/x;Ljava/util/concurrent/ScheduledExecutorService;Ljava/lang/Object;ZJLy1/c$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
