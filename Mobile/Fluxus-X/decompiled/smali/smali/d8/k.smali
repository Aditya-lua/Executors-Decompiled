.class public Ld8/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld8/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld8/k$a;
    }
.end annotation


# instance fields
.field public final a:Ld8/k$a;

.field public final b:Ld8/i;

.field public final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ld8/m;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Ld8/i;)V
    .locals 1

    .line 1
    new-instance v0, Ld8/k$a;

    invoke-direct {v0, p1}, Ld8/k$a;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, v0, p2}, Ld8/k;-><init>(Ld8/k$a;Ld8/i;)V

    return-void
.end method

.method public constructor <init>(Ld8/k$a;Ld8/i;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ld8/k;->c:Ljava/util/Map;

    .line 4
    iput-object p1, p0, Ld8/k;->a:Ld8/k$a;

    .line 5
    iput-object p2, p0, Ld8/k;->b:Ld8/i;

    return-void
.end method


# virtual methods
.method public declared-synchronized a(Ljava/lang/String;)Ld8/m;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Ld8/k;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ld8/k;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld8/m;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    :try_start_1
    iget-object v0, p0, Ld8/k;->a:Ld8/k$a;

    invoke-virtual {v0, p1}, Ld8/k$a;->b(Ljava/lang/String;)Ld8/d;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v0, :cond_1

    monitor-exit p0

    const/4 p1, 0x0

    return-object p1

    :cond_1
    :try_start_2
    iget-object v1, p0, Ld8/k;->b:Ld8/i;

    invoke-virtual {v1, p1}, Ld8/i;->a(Ljava/lang/String;)Ld8/h;

    move-result-object v1

    invoke-interface {v0, v1}, Ld8/d;->create(Ld8/h;)Ld8/m;

    move-result-object v0

    iget-object v1, p0, Ld8/k;->c:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-object v0

    :goto_0
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1
.end method
