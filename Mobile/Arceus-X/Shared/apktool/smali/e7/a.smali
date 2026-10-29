.class public final Le7/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le7/d0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le7/a$a;,
        Le7/a$b;,
        Le7/a$c;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u0008\u0000\u0018\u0000 )2\u00020\u0001:\u0003\u0007\u000e\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\t\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\u0008R=\u0010\u0011\u001a\"\u0012\u000c\u0012\n \u000b*\u0004\u0018\u00010\u00020\u00020\nj\u0010\u0012\u000c\u0012\n \u000b*\u0004\u0018\u00010\u00020\u0002`\u000c8\u0006\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010\r\u0012\u0004\u0008\u0010\u0010\u0008\u001a\u0004\u0008\u000e\u0010\u000fR!\u0010\u0017\u001a\u00060\u0012R\u00020\u00008\u0006\u00a2\u0006\u0012\n\u0004\u0008\u0013\u0010\u0014\u0012\u0004\u0008\u0016\u0010\u0008\u001a\u0004\u0008\u0013\u0010\u0015R!\u0010\u001d\u001a\u00060\u0018R\u00020\u00008\u0006\u00a2\u0006\u0012\n\u0004\u0008\u000e\u0010\u0019\u0012\u0004\u0008\u001c\u0010\u0008\u001a\u0004\u0008\u001a\u0010\u001bR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R*\u0010\t\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"8\u0006@BX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008$\u0010%\u0012\u0004\u0008(\u0010\u0008\u001a\u0004\u0008&\u0010\'\u00a8\u0006*"
    }
    d2 = {
        "Le7/a;",
        "Le7/d0;",
        "Lk6/w;",
        "strongImageLoaderReference",
        "<init>",
        "(Lk6/w;)V",
        "",
        "a",
        "()V",
        "shutdown",
        "Ljava/lang/ref/WeakReference;",
        "kotlin.jvm.PlatformType",
        "Lcoil3/util/WeakReference;",
        "Ljava/lang/ref/WeakReference;",
        "c",
        "()Ljava/lang/ref/WeakReference;",
        "getImageLoader$annotations",
        "imageLoader",
        "Le7/a$a;",
        "b",
        "Le7/a$a;",
        "()Le7/a$a;",
        "getActivityCallbacks$annotations",
        "activityCallbacks",
        "Le7/a$c;",
        "Le7/a$c;",
        "getComponentCallbacks",
        "()Le7/a$c;",
        "getComponentCallbacks$annotations",
        "componentCallbacks",
        "Landroid/content/Context;",
        "d",
        "Landroid/content/Context;",
        "application",
        "",
        "value",
        "e",
        "Z",
        "getShutdown",
        "()Z",
        "getShutdown$annotations",
        "f",
        "coil-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final f:Le7/a$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lk6/w;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Le7/a$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Le7/a$c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public d:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Le7/a$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Le7/a$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Le7/a;->f:Le7/a$b;

    return-void
.end method

.method public constructor <init>(Lk6/w;)V
    .locals 1
    .param p1    # Lk6/w;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Le7/a;->a:Ljava/lang/ref/WeakReference;

    new-instance v0, Le7/a$a;

    invoke-direct {v0, p0, p1}, Le7/a$a;-><init>(Le7/a;Lk6/w;)V

    iput-object v0, p0, Le7/a;->b:Le7/a$a;

    new-instance p1, Le7/a$c;

    invoke-direct {p1, p0}, Le7/a$c;-><init>(Le7/a;)V

    iput-object p1, p0, Le7/a;->c:Le7/a$c;

    return-void
.end method


# virtual methods
.method public declared-synchronized a()V
    .locals 2

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Le7/a;->c()Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk6/w;

    if-eqz v0, :cond_0

    iget-object v1, p0, Le7/a;->d:Landroid/content/Context;

    if-nez v1, :cond_1

    invoke-virtual {v0}, Lk6/w;->h()Lk6/w$a;

    move-result-object v0

    invoke-virtual {v0}, Lk6/w$a;->a()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Le7/a;->d:Landroid/content/Context;

    iget-object v1, p0, Le7/a;->c:Le7/a$c;

    invoke-virtual {v0, v1}, Landroid/content/Context;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Le7/a;->shutdown()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final b()Le7/a$a;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Le7/a;->b:Le7/a$a;

    return-object v0
.end method

.method public final c()Ljava/lang/ref/WeakReference;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/ref/WeakReference<",
            "Lk6/w;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Le7/a;->a:Ljava/lang/ref/WeakReference;

    return-object v0
.end method

.method public declared-synchronized shutdown()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Le7/a;->e:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    const/4 v0, 0x1

    :try_start_1
    iput-boolean v0, p0, Le7/a;->e:Z

    iget-object v0, p0, Le7/a;->d:Landroid/content/Context;

    if-eqz v0, :cond_1

    iget-object v1, p0, Le7/a;->b:Le7/a$a;

    invoke-virtual {v1, v0}, Le7/a$a;->b(Landroid/content/Context;)V

    iget-object v1, p0, Le7/a;->c:Le7/a$c;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Le7/a;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->clear()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method
