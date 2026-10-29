.class public final synthetic Lr0/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly1/c$c;


# instance fields
.field public final synthetic a:Lne/x;

.field public final synthetic b:Ljava/util/concurrent/ScheduledExecutorService;

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(Lne/x;Ljava/util/concurrent/ScheduledExecutorService;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr0/f;->a:Lne/x;

    iput-object p2, p0, Lr0/f;->b:Ljava/util/concurrent/ScheduledExecutorService;

    iput-wide p3, p0, Lr0/f;->c:J

    return-void
.end method


# virtual methods
.method public final a(Ly1/c$a;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lr0/f;->a:Lne/x;

    iget-object v1, p0, Lr0/f;->b:Ljava/util/concurrent/ScheduledExecutorService;

    iget-wide v2, p0, Lr0/f;->c:J

    invoke-static {v0, v1, v2, v3, p1}, Lr0/n;->d(Lne/x;Ljava/util/concurrent/ScheduledExecutorService;JLy1/c$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
