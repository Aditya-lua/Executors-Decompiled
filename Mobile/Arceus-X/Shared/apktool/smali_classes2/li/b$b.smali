.class public Lli/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljh/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lli/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final synthetic a:Lli/b;


# direct methods
.method public constructor <init>(Lli/b;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lli/b$b;->a:Lli/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lli/b;Lli/c;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lli/b$b;-><init>(Lli/b;)V

    return-void
.end method


# virtual methods
.method public a(Ljh/a;)V
    .locals 2

    iget-object v0, p0, Lli/b$b;->a:Lli/b;

    invoke-static {v0}, Lli/b;->d(Lli/b;)Lli/b$d;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v0, "InfluxV2Queue"

    const-string v1, "fireAction: Close the existing socket..."

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Lli/b$b$a;

    invoke-direct {v0, p0, p1}, Lli/b$b$a;-><init>(Lli/b$b;Ljh/a;)V

    sget-object p1, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v0, p1, v1}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method

.method public b()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
