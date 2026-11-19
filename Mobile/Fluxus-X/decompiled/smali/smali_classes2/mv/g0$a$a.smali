.class public final Lmv/g0$a$a;
.super Lmv/g0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmv/g0$a;->b(Ljava/io/File;Lmv/b0;)Lmv/g0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "mv/g0$a$a",
        "Lmv/g0;",
        "Lmv/b0;",
        "b",
        "()Lmv/b0;",
        "",
        "a",
        "()J",
        "Lew/f;",
        "sink",
        "",
        "h",
        "(Lew/f;)V",
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
.field public final synthetic c:Lmv/b0;

.field public final synthetic d:Ljava/io/File;


# direct methods
.method public constructor <init>(Lmv/b0;Ljava/io/File;)V
    .locals 0

    iput-object p1, p0, Lmv/g0$a$a;->c:Lmv/b0;

    iput-object p2, p0, Lmv/g0$a$a;->d:Ljava/io/File;

    invoke-direct {p0}, Lmv/g0;-><init>()V

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    iget-object v0, p0, Lmv/g0$a$a;->d:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v0

    return-wide v0
.end method

.method public b()Lmv/b0;
    .locals 1

    iget-object v0, p0, Lmv/g0$a$a;->c:Lmv/b0;

    return-object v0
.end method

.method public h(Lew/f;)V
    .locals 2

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lmv/g0$a$a;->d:Ljava/io/File;

    invoke-static {v0}, Lew/v;->i(Ljava/io/File;)Lew/l0;

    move-result-object v0

    :try_start_0
    invoke-interface {p1, v0}, Lew/f;->h3(Lew/l0;)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x0

    invoke-static {v0, p1}, Llu/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v1

    invoke-static {v0, p1}, Llu/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v1
.end method
