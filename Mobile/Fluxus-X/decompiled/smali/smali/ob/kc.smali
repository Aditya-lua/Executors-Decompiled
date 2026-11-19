.class public final Lob/kc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lob/i5;

.field public final synthetic b:Lob/sc;


# direct methods
.method public constructor <init>(Lob/sc;Lob/i5;)V
    .locals 0

    iput-object p2, p0, Lob/kc;->a:Lob/i5;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lob/kc;->b:Lob/sc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lob/kc;->b:Lob/sc;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {v0, v1}, Lob/sc;->d(Z)V

    iget-object v1, v0, Lob/sc;->c:Lob/yc;

    invoke-virtual {v1}, Lob/yc;->W()Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, v1, Lob/o8;->a:Lob/l7;

    invoke-virtual {v2}, Lob/l7;->a()Lob/b6;

    move-result-object v2

    invoke-virtual {v2}, Lob/b6;->w()Lob/z5;

    move-result-object v2

    const-string v3, "Connected to service"

    invoke-virtual {v2, v3}, Lob/z5;->a(Ljava/lang/String;)V

    iget-object v2, p0, Lob/kc;->a:Lob/i5;

    invoke-virtual {v1, v2}, Lob/yc;->z(Lob/i5;)V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
