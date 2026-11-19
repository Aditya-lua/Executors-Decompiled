.class public final Ltb/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ltb/y;


# direct methods
.method public constructor <init>(Ltb/y;)V
    .locals 0

    iput-object p1, p0, Ltb/x;->a:Ltb/y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Ltb/x;->a:Ltb/y;

    invoke-static {v0}, Ltb/y;->c(Ltb/y;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ltb/x;->a:Ltb/y;

    invoke-static {v1}, Ltb/y;->a(Ltb/y;)Ltb/e;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-static {v1}, Ltb/y;->a(Ltb/y;)Ltb/e;

    move-result-object v1

    invoke-interface {v1}, Ltb/e;->a()V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
