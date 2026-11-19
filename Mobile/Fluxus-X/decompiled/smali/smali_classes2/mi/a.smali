.class public abstract Lmi/a;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Lmi/j;",
        ">;"
    }
.end annotation


# instance fields
.field public a:Lmi/j;

.field public b:Ljava/lang/String;

.field public c:[Lmi/c$a;

.field public d:Lmi/l;

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:Lpi/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpi/d<",
            "Lmi/j;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Lmi/l;[Lmi/c$a;)V
    .locals 0

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    iput-object p2, p0, Lmi/a;->d:Lmi/l;

    iput-object p1, p0, Lmi/a;->b:Ljava/lang/String;

    iput-object p3, p0, Lmi/a;->c:[Lmi/c$a;

    const/4 p1, 0x0

    iput-object p1, p0, Lmi/a;->e:Ljava/lang/String;

    iput-object p1, p0, Lmi/a;->f:Ljava/lang/String;

    new-instance p1, Lpi/c;

    invoke-direct {p1}, Lpi/c;-><init>()V

    invoke-virtual {p0, p1}, Lmi/a;->g(Lpi/d;)V

    return-void
.end method


# virtual methods
.method public varargs a([Ljava/lang/Void;)Lmi/j;
    .locals 3

    iget-object p1, p0, Lmi/a;->b:Ljava/lang/String;

    iget-object v0, p0, Lmi/a;->e:Ljava/lang/String;

    iget-object v1, p0, Lmi/a;->c:[Lmi/c$a;

    iget-object v2, p0, Lmi/a;->f:Ljava/lang/String;

    invoke-static {p1, v0, v1, v2}, Lmi/c;->j(Ljava/lang/String;Ljava/lang/String;[Lmi/c$a;Ljava/lang/String;)Lmi/j;

    move-result-object p1

    iput-object p1, p0, Lmi/a;->a:Lmi/j;

    :cond_0
    iget-object p1, p0, Lmi/a;->g:Lpi/d;

    if-eqz p1, :cond_2

    iget-object v0, p0, Lmi/a;->a:Lmi/j;

    invoke-interface {p1, v0}, Lpi/d;->e(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lmi/a;->g:Lpi/d;

    invoke-interface {p1}, Lpi/d;->c()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lmi/a;->g:Lpi/d;

    invoke-interface {p1}, Lpi/d;->d()I

    move-result p1

    if-lez p1, :cond_1

    :try_start_0
    iget-object p1, p0, Lmi/a;->g:Lpi/d;

    invoke-interface {p1}, Lpi/d;->d()I

    move-result p1

    int-to-long v0, p1

    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Thread sleep error: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "rbx.httprequest"

    invoke-static {v0, p1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    :goto_0
    iget-object p1, p0, Lmi/a;->b:Ljava/lang/String;

    iget-object v0, p0, Lmi/a;->e:Ljava/lang/String;

    iget-object v1, p0, Lmi/a;->c:[Lmi/c$a;

    iget-object v2, p0, Lmi/a;->f:Ljava/lang/String;

    invoke-static {p1, v0, v1, v2}, Lmi/c;->j(Ljava/lang/String;Ljava/lang/String;[Lmi/c$a;Ljava/lang/String;)Lmi/j;

    move-result-object p1

    iput-object p1, p0, Lmi/a;->a:Lmi/j;

    iget-object p1, p0, Lmi/a;->g:Lpi/d;

    invoke-interface {p1}, Lpi/d;->b()V

    invoke-virtual {p0}, Lmi/a;->f()V

    invoke-virtual {p0}, Lmi/a;->c()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_2
    iget-object p1, p0, Lmi/a;->a:Lmi/j;

    return-object p1
.end method

.method public b()V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Void;

    sget-object v1, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v1, v0}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method

.method public c()Z
    .locals 1

    invoke-virtual {p0}, Landroid/os/AsyncTask;->isCancelled()Z

    move-result v0

    return v0
.end method

.method public d(Lmi/j;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V

    iget-object p1, p0, Lmi/a;->d:Lmi/l;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lmi/a;->a:Lmi/j;

    invoke-interface {p1, v0}, Lmi/l;->b(Lmi/j;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lmi/a;->a([Ljava/lang/Void;)Lmi/j;

    move-result-object p1

    return-object p1
.end method

.method public varargs e([Ljava/lang/Void;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onProgressUpdate([Ljava/lang/Object;)V

    iget-object p1, p0, Lmi/a;->d:Lmi/l;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lmi/a;->a:Lmi/j;

    invoke-interface {p1, v0}, Lmi/l;->a(Lmi/j;)V

    :cond_0
    return-void
.end method

.method public f()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Void;

    invoke-virtual {p0, v0}, Landroid/os/AsyncTask;->publishProgress([Ljava/lang/Object;)V

    return-void
.end method

.method public g(Lpi/d;)V
    .locals 0
    .param p1    # Lpi/d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpi/d<",
            "Lmi/j;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lmi/a;->g:Lpi/d;

    return-void
.end method

.method public bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lmi/j;

    invoke-virtual {p0, p1}, Lmi/a;->d(Lmi/j;)V

    return-void
.end method

.method public bridge synthetic onProgressUpdate([Ljava/lang/Object;)V
    .locals 0

    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lmi/a;->e([Ljava/lang/Void;)V

    return-void
.end method
