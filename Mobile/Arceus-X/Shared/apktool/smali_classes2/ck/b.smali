.class public Lck/b;
.super Lck/c;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Lck/a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lck/c;-><init>(Ljava/lang/String;ILjava/lang/String;Lck/a;)V

    return-void
.end method


# virtual methods
.method public d()V
    .locals 2

    invoke-static {}, Lvg/s;->a()Ljava/util/concurrent/Executor;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {p0, v0, v1}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method
