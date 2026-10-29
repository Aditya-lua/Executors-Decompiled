.class public final Ly4/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly4/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010%\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001b\u0010\t\u001a\u00060\u0007j\u0002`\u00082\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rR$\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0008\u0012\u00060\u0007j\u0002`\u00080\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Ly4/b$a;",
        "",
        "Landroidx/room/concurrent/SynchronizedObject;",
        "<init>",
        "()V",
        "",
        "key",
        "Ljava/util/concurrent/locks/ReentrantLock;",
        "Landroidx/room/concurrent/ReentrantLock;",
        "d",
        "(Ljava/lang/String;)Ljava/util/concurrent/locks/ReentrantLock;",
        "Ly4/c;",
        "c",
        "(Ljava/lang/String;)Ly4/c;",
        "",
        "threadLocksMap",
        "Ljava/util/Map;",
        "room-runtime"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ly4/b$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(Ly4/b$a;Ljava/lang/String;)Ly4/c;
    .locals 0

    invoke-virtual {p0, p1}, Ly4/b$a;->c(Ljava/lang/String;)Ly4/c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Ly4/b$a;Ljava/lang/String;)Ljava/util/concurrent/locks/ReentrantLock;
    .locals 0

    invoke-virtual {p0, p1}, Ly4/b$a;->d(Ljava/lang/String;)Ljava/util/concurrent/locks/ReentrantLock;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final c(Ljava/lang/String;)Ly4/c;
    .locals 1

    new-instance v0, Ly4/c;

    invoke-direct {v0, p1}, Ly4/c;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final d(Ljava/lang/String;)Ljava/util/concurrent/locks/ReentrantLock;
    .locals 2

    monitor-enter p0

    :try_start_0
    invoke-static {}, Ly4/b;->a()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    new-instance v1, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    check-cast v1, Ljava/util/concurrent/locks/ReentrantLock;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v1

    :goto_1
    monitor-exit p0

    throw p1
.end method
