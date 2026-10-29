.class public final Lnb/z6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Thread$UncaughtExceptionHandler;


# instance fields
.field public final a:Ljava/lang/String;

.field public final synthetic b:Lnb/c7;


# direct methods
.method public constructor <init>(Lnb/c7;Ljava/lang/String;)V
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/z6;->b:Lnb/c7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p2}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p2, p0, Lnb/z6;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final declared-synchronized uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object p1, p0, Lnb/z6;->b:Lnb/c7;

    iget-object p1, p1, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {p1}, Lnb/g7;->a()Lnb/w5;

    move-result-object p1

    invoke-virtual {p1}, Lnb/w5;->o()Lnb/u5;

    move-result-object p1

    iget-object v0, p0, Lnb/z6;->a:Ljava/lang/String;

    invoke-virtual {p1, v0, p2}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
