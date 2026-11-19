.class public final Lo9/t;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static b:Lo9/t;

.field public static final c:Lo9/u;


# instance fields
.field public a:Lo9/u;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lo9/u;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lo9/u;-><init>(IZZII)V

    sput-object v0, Lo9/t;->c:Lo9/u;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static declared-synchronized b()Lo9/t;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const-class v0, Lo9/t;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lo9/t;->b:Lo9/t;

    if-nez v1, :cond_0

    new-instance v1, Lo9/t;

    invoke-direct {v1}, Lo9/t;-><init>()V

    sput-object v1, Lo9/t;->b:Lo9/t;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    sget-object v1, Lo9/t;->b:Lo9/t;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method


# virtual methods
.method public a()Lo9/u;
    .locals 1

    iget-object v0, p0, Lo9/t;->a:Lo9/u;

    return-object v0
.end method

.method public final declared-synchronized c(Lo9/u;)V
    .locals 2

    monitor-enter p0

    if-nez p1, :cond_0

    :try_start_0
    sget-object p1, Lo9/t;->c:Lo9/u;

    iput-object p1, p0, Lo9/t;->a:Lo9/u;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :try_start_1
    iget-object v0, p0, Lo9/t;->a:Lo9/u;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lo9/u;->E3()I

    move-result v0

    invoke-virtual {p1}, Lo9/u;->E3()I

    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ge v0, v1, :cond_1

    goto :goto_0

    :cond_1
    monitor-exit p0

    return-void

    :cond_2
    :goto_0
    :try_start_2
    iput-object p1, p0, Lo9/t;->a:Lo9/u;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-void

    :goto_1
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1
.end method
