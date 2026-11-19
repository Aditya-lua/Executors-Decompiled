.class public Lof/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lag/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lag/b<",
        "TT;>;"
    }
.end annotation


# static fields
.field public static final c:Lag/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lag/a<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static final d:Lag/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lag/b<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public a:Lag/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lag/a<",
            "TT;>;"
        }
    .end annotation
.end field

.field public volatile b:Lag/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lag/b<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lof/a0;

    invoke-direct {v0}, Lof/a0;-><init>()V

    sput-object v0, Lof/c0;->c:Lag/a;

    new-instance v0, Lof/b0;

    invoke-direct {v0}, Lof/b0;-><init>()V

    sput-object v0, Lof/c0;->d:Lag/b;

    return-void
.end method

.method public constructor <init>(Lag/a;Lag/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lag/a<",
            "TT;>;",
            "Lag/b<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lof/c0;->a:Lag/a;

    iput-object p2, p0, Lof/c0;->b:Lag/b;

    return-void
.end method

.method public static synthetic a()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public static synthetic b(Lag/b;)V
    .locals 0

    return-void
.end method

.method public static c()Lof/c0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Lof/c0<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lof/c0;

    sget-object v1, Lof/c0;->c:Lag/a;

    sget-object v2, Lof/c0;->d:Lag/b;

    invoke-direct {v0, v1, v2}, Lof/c0;-><init>(Lag/a;Lag/b;)V

    return-object v0
.end method


# virtual methods
.method public d(Lag/b;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lag/b<",
            "TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lof/c0;->b:Lag/b;

    sget-object v1, Lof/c0;->d:Lag/b;

    if-ne v0, v1, :cond_0

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lof/c0;->a:Lag/a;

    const/4 v1, 0x0

    iput-object v1, p0, Lof/c0;->a:Lag/a;

    iput-object p1, p0, Lof/c0;->b:Lag/b;

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0, p1}, Lag/a;->a(Lag/b;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "provide() can be called only once."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public get()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lof/c0;->b:Lag/b;

    invoke-interface {v0}, Lag/b;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
