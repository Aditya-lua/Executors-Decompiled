.class public Lbl/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Lmw/c;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lmw/c;
    .locals 2

    sget-object v0, Lbl/b;->a:Lmw/c;

    if-nez v0, :cond_1

    const-class v0, Lbl/b;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lbl/b;->a:Lmw/c;

    if-nez v1, :cond_0

    invoke-static {}, Lmw/c;->b()Lmw/d;

    move-result-object v1

    invoke-virtual {v1}, Lmw/d;->a()Lmw/c;

    move-result-object v1

    sput-object v1, Lbl/b;->a:Lmw/c;

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
    sget-object v0, Lbl/b;->a:Lmw/c;

    return-object v0
.end method
