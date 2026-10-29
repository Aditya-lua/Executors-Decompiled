.class public Lei/r;
.super Lei/q;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0, v0, v0}, Lei/q;-><init>(Ljava/lang/String;Ljava/lang/String;[Lei/c$a;Lei/m;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lei/m;Ljava/lang/String;)V
    .locals 6

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v5, p4

    .line 2
    invoke-direct/range {v0 .. v5}, Lei/q;-><init>(Ljava/lang/String;Ljava/lang/String;[Lei/c$a;Lei/m;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public c()V
    .locals 2

    invoke-static {}, Lvg/s;->a()Ljava/util/concurrent/Executor;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {p0, v0, v1}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method
