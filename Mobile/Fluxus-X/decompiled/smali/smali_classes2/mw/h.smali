.class public final Lmw/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lmw/h;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Lmw/n;

.field public c:Lmw/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lmw/h;->d:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Lmw/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmw/h;->a:Ljava/lang/Object;

    iput-object p2, p0, Lmw/h;->b:Lmw/n;

    return-void
.end method

.method public static a(Lmw/n;Ljava/lang/Object;)Lmw/h;
    .locals 2

    sget-object v0, Lmw/h;->d:Ljava/util/List;

    monitor-enter v0

    :try_start_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_0

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lmw/h;

    iput-object p1, v1, Lmw/h;->a:Ljava/lang/Object;

    iput-object p0, v1, Lmw/h;->b:Lmw/n;

    const/4 p0, 0x0

    iput-object p0, v1, Lmw/h;->c:Lmw/h;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p0

    goto :goto_0

    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    new-instance v0, Lmw/h;

    invoke-direct {v0, p1, p0}, Lmw/h;-><init>(Ljava/lang/Object;Lmw/n;)V

    return-object v0

    :goto_0
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static b(Lmw/h;)V
    .locals 3

    const/4 v0, 0x0

    iput-object v0, p0, Lmw/h;->a:Ljava/lang/Object;

    iput-object v0, p0, Lmw/h;->b:Lmw/n;

    iput-object v0, p0, Lmw/h;->c:Lmw/h;

    sget-object v0, Lmw/h;->d:Ljava/util/List;

    monitor-enter v0

    :try_start_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/16 v2, 0x2710

    if-ge v1, v2, :cond_0

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method
