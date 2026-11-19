.class public final Lpv/f$c$a;
.super Lew/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpv/f$c;->k(I)Lew/l0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0003\u0010\u0004R\u0016\u0010\u0008\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\t"
    }
    d2 = {
        "pv/f$c$a",
        "Lew/n;",
        "",
        "close",
        "()V",
        "",
        "b",
        "Z",
        "closed",
        "okhttp"
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
.field public b:Z

.field public final synthetic c:Lpv/f;

.field public final synthetic d:Lpv/f$c;


# direct methods
.method public constructor <init>(Lew/l0;Lpv/f;Lpv/f$c;)V
    .locals 0

    iput-object p2, p0, Lpv/f$c$a;->c:Lpv/f;

    iput-object p3, p0, Lpv/f$c$a;->d:Lpv/f$c;

    invoke-direct {p0, p1}, Lew/n;-><init>(Lew/l0;)V

    return-void
.end method


# virtual methods
.method public close()V
    .locals 3

    invoke-super {p0}, Lew/n;->close()V

    iget-boolean v0, p0, Lpv/f$c$a;->b:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lpv/f$c$a;->b:Z

    iget-object v0, p0, Lpv/f$c$a;->c:Lpv/f;

    iget-object v1, p0, Lpv/f$c$a;->d:Lpv/f$c;

    monitor-enter v0

    :try_start_0
    invoke-virtual {v1}, Lpv/f$c;->f()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v1, v2}, Lpv/f$c;->n(I)V

    invoke-virtual {v1}, Lpv/f$c;->f()I

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v1}, Lpv/f$c;->i()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0, v1}, Lpv/f;->Y(Lpv/f$c;)Z

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw v1

    :cond_1
    return-void
.end method
