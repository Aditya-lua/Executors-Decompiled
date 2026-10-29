.class public final Leb/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/Object;

.field public static volatile b:Leb/h;

.field public static volatile c:Z

.field public static volatile d:Leb/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Leb/i;->a:Ljava/lang/Object;

    return-void
.end method

.method public static a()V
    .locals 1

    const/4 v0, 0x1

    sput-boolean v0, Leb/i;->c:Z

    return-void
.end method

.method public static b()V
    .locals 2

    sget-object v0, Leb/i;->d:Leb/h;

    if-nez v0, :cond_0

    new-instance v0, Leb/h;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Leb/h;-><init>(Leb/g;)V

    sput-object v0, Leb/i;->d:Leb/h;

    :cond_0
    return-void
.end method

.method public static c()V
    .locals 2

    sget-object v0, Leb/i;->b:Leb/h;

    if-nez v0, :cond_0

    new-instance v0, Leb/h;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Leb/h;-><init>(Leb/g;)V

    sput-object v0, Leb/i;->b:Leb/h;

    :cond_0
    return-void
.end method

.method public static d()Z
    .locals 2

    sget-object v0, Leb/i;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    monitor-exit v0

    const/4 v0, 0x0

    return v0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
