.class public final Lmv/c$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpv/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmv/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "d"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0018\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\rR\u0014\u0010\u000f\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u000eR\"\u0010\u0018\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0013\u0010\u0015\"\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0019"
    }
    d2 = {
        "Lmv/c$d;",
        "Lpv/c;",
        "Lpv/f$b;",
        "Lpv/f;",
        "editor",
        "<init>",
        "(Lmv/c;Lpv/f$b;)V",
        "",
        "a",
        "()V",
        "Lew/j0;",
        "b",
        "()Lew/j0;",
        "Lpv/f$b;",
        "Lew/j0;",
        "cacheOut",
        "c",
        "body",
        "",
        "d",
        "Z",
        "()Z",
        "e",
        "(Z)V",
        "done",
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
.field public final a:Lpv/f$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lew/j0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lew/j0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public d:Z

.field public final synthetic e:Lmv/c;


# direct methods
.method public constructor <init>(Lmv/c;Lpv/f$b;)V
    .locals 1
    .param p1    # Lmv/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpv/f$b;",
            ")V"
        }
    .end annotation

    const-string v0, "editor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lmv/c$d;->e:Lmv/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lmv/c$d;->a:Lpv/f$b;

    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Lpv/f$b;->g(I)Lew/j0;

    move-result-object p2

    iput-object p2, p0, Lmv/c$d;->b:Lew/j0;

    new-instance v0, Lmv/c$d$a;

    invoke-direct {v0, p1, p0, p2}, Lmv/c$d$a;-><init>(Lmv/c;Lmv/c$d;Lew/j0;)V

    iput-object v0, p0, Lmv/c$d;->c:Lew/j0;

    return-void
.end method

.method public static final synthetic c(Lmv/c$d;)Lpv/f$b;
    .locals 0

    iget-object p0, p0, Lmv/c$d;->a:Lpv/f$b;

    return-object p0
.end method


# virtual methods
.method public a()V
    .locals 3

    iget-object v0, p0, Lmv/c$d;->e:Lmv/c;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lmv/c$d;->d:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    :try_start_1
    iput-boolean v1, p0, Lmv/c$d;->d:Z

    invoke-virtual {v0}, Lmv/c;->c()I

    move-result v2

    add-int/2addr v2, v1

    invoke-virtual {v0, v2}, Lmv/c;->h(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    iget-object v0, p0, Lmv/c$d;->b:Lew/j0;

    invoke-static {v0}, Lnv/n;->f(Ljava/io/Closeable;)V

    :try_start_2
    iget-object v0, p0, Lmv/c$d;->a:Lpv/f$b;

    invoke-virtual {v0}, Lpv/f$b;->b()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public b()Lew/j0;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lmv/c$d;->c:Lew/j0;

    return-object v0
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, Lmv/c$d;->d:Z

    return v0
.end method

.method public final e(Z)V
    .locals 0

    iput-boolean p1, p0, Lmv/c$d;->d:Z

    return-void
.end method
