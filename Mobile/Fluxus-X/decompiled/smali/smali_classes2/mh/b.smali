.class public Lmh/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static d:Lmh/b;


# instance fields
.field public a:Lw1/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw1/g<",
            "Lmh/a;",
            ">;"
        }
    .end annotation
.end field

.field public b:I

.field public c:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lmh/b;->c:Ljava/lang/Object;

    new-instance v0, Lw1/g;

    invoke-direct {v0}, Lw1/g;-><init>()V

    iput-object v0, p0, Lmh/b;->a:Lw1/g;

    return-void
.end method

.method public static b()Lmh/b;
    .locals 2

    sget-object v0, Lmh/b;->d:Lmh/b;

    if-nez v0, :cond_1

    const-class v0, Lmh/b;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lmh/b;->d:Lmh/b;

    if-nez v1, :cond_0

    new-instance v1, Lmh/b;

    invoke-direct {v1}, Lmh/b;-><init>()V

    sput-object v1, Lmh/b;->d:Lmh/b;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_1
    :goto_2
    sget-object v0, Lmh/b;->d:Lmh/b;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lmh/b;->a:Lw1/g;

    invoke-virtual {v0}, Lw1/g;->a()V

    const/4 v0, 0x0

    iput v0, p0, Lmh/b;->b:I

    return-void
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lmh/b;->b:I

    return v0
.end method

.method public d(J)Lmh/a;
    .locals 1

    iget-object v0, p0, Lmh/b;->a:Lw1/g;

    invoke-virtual {v0, p1, p2}, Lw1/g;->e(J)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lmh/a;

    return-object p1
.end method

.method public e(Lmh/a;)V
    .locals 4

    iget-object v0, p0, Lmh/b;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lmh/b;->a:Lw1/g;

    invoke-virtual {p1}, Lmh/a;->b()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lw1/g;->e(J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lmh/a;

    if-eqz v1, :cond_0

    invoke-virtual {v1, p1}, Lmh/a;->i(Lmh/a;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    iget-object v1, p0, Lmh/b;->a:Lw1/g;

    invoke-virtual {p1}, Lmh/a;->b()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3, p1}, Lw1/g;->k(JLjava/lang/Object;)V

    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
