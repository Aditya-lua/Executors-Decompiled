.class public final Lmv/c$d$a;
.super Lew/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmv/c$d;-><init>(Lmv/c;Lpv/f$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "mv/c$d$a",
        "Lew/m;",
        "",
        "close",
        "()V",
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
.field public final synthetic b:Lmv/c;

.field public final synthetic c:Lmv/c$d;


# direct methods
.method public constructor <init>(Lmv/c;Lmv/c$d;Lew/j0;)V
    .locals 0

    iput-object p1, p0, Lmv/c$d$a;->b:Lmv/c;

    iput-object p2, p0, Lmv/c$d$a;->c:Lmv/c$d;

    invoke-direct {p0, p3}, Lew/m;-><init>(Lew/j0;)V

    return-void
.end method


# virtual methods
.method public close()V
    .locals 3

    iget-object v0, p0, Lmv/c$d$a;->b:Lmv/c;

    iget-object v1, p0, Lmv/c$d$a;->c:Lmv/c$d;

    monitor-enter v0

    :try_start_0
    invoke-virtual {v1}, Lmv/c$d;->d()Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    const/4 v2, 0x1

    :try_start_1
    invoke-virtual {v1, v2}, Lmv/c$d;->e(Z)V

    invoke-virtual {v0}, Lmv/c;->d()I

    move-result v1

    add-int/2addr v1, v2

    invoke-virtual {v0, v1}, Lmv/c;->k(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    invoke-super {p0}, Lew/m;->close()V

    iget-object v0, p0, Lmv/c$d$a;->c:Lmv/c$d;

    invoke-static {v0}, Lmv/c$d;->c(Lmv/c$d;)Lpv/f$b;

    move-result-object v0

    invoke-virtual {v0}, Lpv/f$b;->c()V

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method
