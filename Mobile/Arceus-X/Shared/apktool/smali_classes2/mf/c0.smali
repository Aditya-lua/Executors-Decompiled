.class public Lmf/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyf/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lyf/b<",
        "TT;>;"
    }
.end annotation


# static fields
.field public static final c:Lyf/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lyf/a<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static final d:Lyf/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lyf/b<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public a:Lyf/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lyf/a<",
            "TT;>;"
        }
    .end annotation
.end field

.field public volatile b:Lyf/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lyf/b<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lmf/a0;

    invoke-direct {v0}, Lmf/a0;-><init>()V

    sput-object v0, Lmf/c0;->c:Lyf/a;

    new-instance v0, Lmf/b0;

    invoke-direct {v0}, Lmf/b0;-><init>()V

    sput-object v0, Lmf/c0;->d:Lyf/b;

    return-void
.end method

.method public constructor <init>(Lyf/a;Lyf/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyf/a<",
            "TT;>;",
            "Lyf/b<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmf/c0;->a:Lyf/a;

    iput-object p2, p0, Lmf/c0;->b:Lyf/b;

    return-void
.end method

.method public static synthetic a()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public static synthetic b(Lyf/b;)V
    .locals 0

    return-void
.end method

.method public static c()Lmf/c0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Lmf/c0<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lmf/c0;

    sget-object v1, Lmf/c0;->c:Lyf/a;

    sget-object v2, Lmf/c0;->d:Lyf/b;

    invoke-direct {v0, v1, v2}, Lmf/c0;-><init>(Lyf/a;Lyf/b;)V

    return-object v0
.end method


# virtual methods
.method public d(Lyf/b;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyf/b<",
            "TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lmf/c0;->b:Lyf/b;

    sget-object v1, Lmf/c0;->d:Lyf/b;

    if-ne v0, v1, :cond_0

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lmf/c0;->a:Lyf/a;

    const/4 v1, 0x0

    iput-object v1, p0, Lmf/c0;->a:Lyf/a;

    iput-object p1, p0, Lmf/c0;->b:Lyf/b;

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0, p1}, Lyf/a;->a(Lyf/b;)V

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

    iget-object v0, p0, Lmf/c0;->b:Lyf/b;

    invoke-interface {v0}, Lyf/b;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
