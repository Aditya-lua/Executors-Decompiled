.class public Ldl/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/Object;

.field public static b:Ldl/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ldl/k;->a:Ljava/lang/Object;

    return-void
.end method

.method public static a()Ldl/a;
    .locals 2

    sget-object v0, Ldl/k;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Ldl/k;->b:Ldl/a;

    if-eqz v1, :cond_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    goto :goto_0

    :cond_0
    new-instance v1, Ldl/b;

    invoke-direct {v1}, Ldl/b;-><init>()V

    sput-object v1, Ldl/k;->b:Ldl/a;

    monitor-exit v0

    return-object v1

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static b(Ldl/a;)V
    .locals 1

    sget-object v0, Ldl/k;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sput-object p0, Ldl/k;->b:Ldl/a;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method
