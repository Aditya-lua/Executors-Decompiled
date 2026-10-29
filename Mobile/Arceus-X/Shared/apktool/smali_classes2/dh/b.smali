.class public Ldh/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static d:Ldh/b;


# instance fields
.field public a:Lw1/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw1/g<",
            "Ldh/a;",
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

    iput-object v0, p0, Ldh/b;->c:Ljava/lang/Object;

    new-instance v0, Lw1/g;

    invoke-direct {v0}, Lw1/g;-><init>()V

    iput-object v0, p0, Ldh/b;->a:Lw1/g;

    return-void
.end method

.method public static b()Ldh/b;
    .locals 2

    sget-object v0, Ldh/b;->d:Ldh/b;

    if-nez v0, :cond_1

    const-class v0, Ldh/b;

    monitor-enter v0

    :try_start_0
    sget-object v1, Ldh/b;->d:Ldh/b;

    if-nez v1, :cond_0

    new-instance v1, Ldh/b;

    invoke-direct {v1}, Ldh/b;-><init>()V

    sput-object v1, Ldh/b;->d:Ldh/b;

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
    sget-object v0, Ldh/b;->d:Ldh/b;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Ldh/b;->a:Lw1/g;

    invoke-virtual {v0}, Lw1/g;->a()V

    const/4 v0, 0x0

    iput v0, p0, Ldh/b;->b:I

    return-void
.end method

.method public c()I
    .locals 1

    iget v0, p0, Ldh/b;->b:I

    return v0
.end method

.method public d(J)Ldh/a;
    .locals 1

    iget-object v0, p0, Ldh/b;->a:Lw1/g;

    invoke-virtual {v0, p1, p2}, Lw1/g;->e(J)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ldh/a;

    return-object p1
.end method

.method public e(Ldh/a;)V
    .locals 4

    iget-object v0, p0, Ldh/b;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ldh/b;->a:Lw1/g;

    invoke-virtual {p1}, Ldh/a;->b()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lw1/g;->e(J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ldh/a;

    if-eqz v1, :cond_0

    invoke-virtual {v1, p1}, Ldh/a;->i(Ldh/a;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    iget-object v1, p0, Ldh/b;->a:Lw1/g;

    invoke-virtual {p1}, Ldh/a;->b()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3, p1}, Lw1/g;->i(JLjava/lang/Object;)V

    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
