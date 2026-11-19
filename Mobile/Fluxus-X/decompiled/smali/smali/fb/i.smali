.class public final Lfb/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/Object;

.field public static volatile b:Lfb/h; = null

.field public static volatile c:Z = false

.field public static volatile d:Lfb/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lfb/i;->a:Ljava/lang/Object;

    return-void
.end method

.method public static a()V
    .locals 1

    const/4 v0, 0x1

    sput-boolean v0, Lfb/i;->c:Z

    return-void
.end method

.method public static b()V
    .locals 2

    sget-object v0, Lfb/i;->d:Lfb/h;

    if-nez v0, :cond_0

    new-instance v0, Lfb/h;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lfb/h;-><init>(Lfb/g;)V

    sput-object v0, Lfb/i;->d:Lfb/h;

    :cond_0
    return-void
.end method

.method public static c()V
    .locals 2

    sget-object v0, Lfb/i;->b:Lfb/h;

    if-nez v0, :cond_0

    new-instance v0, Lfb/h;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lfb/h;-><init>(Lfb/g;)V

    sput-object v0, Lfb/i;->b:Lfb/h;

    :cond_0
    return-void
.end method

.method public static d()Z
    .locals 2

    sget-object v0, Lfb/i;->a:Ljava/lang/Object;

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
