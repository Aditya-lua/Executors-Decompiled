.class public final synthetic Lob/ja;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lob/xa;


# instance fields
.field public final synthetic a:Lob/va;

.field public final synthetic b:Ljava/util/concurrent/atomic/AtomicReference;

.field public final synthetic c:Lob/ae;


# direct methods
.method public synthetic constructor <init>(Lob/va;Ljava/util/concurrent/atomic/AtomicReference;Lob/ae;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lob/ja;->a:Lob/va;

    iput-object p2, p0, Lob/ja;->b:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p3, p0, Lob/ja;->c:Lob/ae;

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/String;ILjava/lang/Throwable;[BLjava/util/Map;)V
    .locals 6

    iget-object p1, p0, Lob/ja;->a:Lob/va;

    invoke-virtual {p1}, Lob/o8;->h()V

    iget-object p4, p0, Lob/ja;->c:Lob/ae;

    const/16 p5, 0xc8

    if-eq p2, p5, :cond_0

    const/16 p5, 0xcc

    if-eq p2, p5, :cond_0

    const/16 p5, 0x130

    if-ne p2, p5, :cond_1

    move p2, p5

    :cond_0
    if-nez p3, :cond_1

    iget-object p2, p1, Lob/o8;->a:Lob/l7;

    invoke-virtual {p2}, Lob/l7;->a()Lob/b6;

    move-result-object p2

    invoke-virtual {p2}, Lob/b6;->w()Lob/z5;

    move-result-object p2

    iget-wide v0, p4, Lob/ae;->f:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    const-string p5, "[sgtm] Upload succeeded for row_id"

    invoke-virtual {p2, p5, p3}, Lob/z5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object p2, Lob/db;->c:Lob/db;

    goto :goto_0

    :cond_1
    iget-object p5, p1, Lob/o8;->a:Lob/l7;

    invoke-virtual {p5}, Lob/l7;->a()Lob/b6;

    move-result-object p5

    invoke-virtual {p5}, Lob/b6;->r()Lob/z5;

    move-result-object p5

    iget-wide v0, p4, Lob/ae;->f:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "[sgtm] Upload failed for row_id. response, exception"

    invoke-virtual {p5, v2, v0, v1, p3}, Lob/z5;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object p3, Lob/e5;->u:Lob/d5;

    const/4 p5, 0x0

    invoke-virtual {p3, p5}, Lob/d5;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/String;

    const-string p5, ","

    invoke-virtual {p3, p5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p3

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p3, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    sget-object p2, Lob/db;->e:Lob/db;

    goto :goto_0

    :cond_2
    sget-object p2, Lob/db;->d:Lob/db;

    :goto_0
    iget-object p3, p0, Lob/ja;->b:Ljava/util/concurrent/atomic/AtomicReference;

    iget-object p5, p1, Lob/o8;->a:Lob/l7;

    invoke-virtual {p5}, Lob/l7;->J()Lob/yc;

    move-result-object p5

    new-instance v0, Lob/g;

    iget-wide v1, p4, Lob/ae;->f:J

    invoke-virtual {p2}, Lob/db;->zza()I

    move-result v3

    iget-wide v4, p4, Lob/ae;->k:J

    invoke-direct/range {v0 .. v5}, Lob/g;-><init>(JIJ)V

    invoke-virtual {p5, v0}, Lob/yc;->k0(Lob/g;)V

    iget-object p1, p1, Lob/o8;->a:Lob/l7;

    invoke-virtual {p1}, Lob/l7;->a()Lob/b6;

    move-result-object p1

    invoke-virtual {p1}, Lob/b6;->w()Lob/z5;

    move-result-object p1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p4

    const-string p5, "[sgtm] Updated status for row_id"

    invoke-virtual {p1, p5, p4, p2}, Lob/z5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    monitor-enter p3

    :try_start_0
    invoke-virtual {p3, p2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    invoke-virtual {p3}, Ljava/lang/Object;->notifyAll()V

    monitor-exit p3

    return-void

    :catchall_0
    move-exception v0

    move-object p1, v0

    monitor-exit p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
