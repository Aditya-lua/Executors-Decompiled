.class public abstract Lei/a;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Lei/j;",
        ">;"
    }
.end annotation


# instance fields
.field public a:Lei/j;

.field public b:Ljava/lang/String;

.field public c:[Lei/c$a;

.field public d:Lei/l;

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:Lhi/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhi/d<",
            "Lei/j;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Lei/l;[Lei/c$a;)V
    .locals 0

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    iput-object p2, p0, Lei/a;->d:Lei/l;

    iput-object p1, p0, Lei/a;->b:Ljava/lang/String;

    iput-object p3, p0, Lei/a;->c:[Lei/c$a;

    const/4 p1, 0x0

    iput-object p1, p0, Lei/a;->e:Ljava/lang/String;

    iput-object p1, p0, Lei/a;->f:Ljava/lang/String;

    new-instance p1, Lhi/c;

    invoke-direct {p1}, Lhi/c;-><init>()V

    invoke-virtual {p0, p1}, Lei/a;->g(Lhi/d;)V

    return-void
.end method


# virtual methods
.method public varargs a([Ljava/lang/Void;)Lei/j;
    .locals 3

    iget-object p1, p0, Lei/a;->b:Ljava/lang/String;

    iget-object v0, p0, Lei/a;->e:Ljava/lang/String;

    iget-object v1, p0, Lei/a;->c:[Lei/c$a;

    iget-object v2, p0, Lei/a;->f:Ljava/lang/String;

    invoke-static {p1, v0, v1, v2}, Lei/c;->j(Ljava/lang/String;Ljava/lang/String;[Lei/c$a;Ljava/lang/String;)Lei/j;

    move-result-object p1

    iput-object p1, p0, Lei/a;->a:Lei/j;

    :cond_0
    iget-object p1, p0, Lei/a;->g:Lhi/d;

    if-eqz p1, :cond_2

    iget-object v0, p0, Lei/a;->a:Lei/j;

    invoke-interface {p1, v0}, Lhi/d;->c(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lei/a;->g:Lhi/d;

    invoke-interface {p1}, Lhi/d;->a()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lei/a;->g:Lhi/d;

    invoke-interface {p1}, Lhi/d;->b()I

    move-result p1

    if-lez p1, :cond_1

    :try_start_0
    iget-object p1, p0, Lei/a;->g:Lhi/d;

    invoke-interface {p1}, Lhi/d;->b()I

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

    invoke-static {v0, p1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    :goto_0
    iget-object p1, p0, Lei/a;->b:Ljava/lang/String;

    iget-object v0, p0, Lei/a;->e:Ljava/lang/String;

    iget-object v1, p0, Lei/a;->c:[Lei/c$a;

    iget-object v2, p0, Lei/a;->f:Ljava/lang/String;

    invoke-static {p1, v0, v1, v2}, Lei/c;->j(Ljava/lang/String;Ljava/lang/String;[Lei/c$a;Ljava/lang/String;)Lei/j;

    move-result-object p1

    iput-object p1, p0, Lei/a;->a:Lei/j;

    iget-object p1, p0, Lei/a;->g:Lhi/d;

    invoke-interface {p1}, Lhi/d;->retry()V

    invoke-virtual {p0}, Lei/a;->f()V

    invoke-virtual {p0}, Lei/a;->c()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_2
    iget-object p1, p0, Lei/a;->a:Lei/j;

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

.method public d(Lei/j;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V

    iget-object p1, p0, Lei/a;->d:Lei/l;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lei/a;->a:Lei/j;

    invoke-interface {p1, v0}, Lei/l;->a(Lei/j;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lei/a;->a([Ljava/lang/Void;)Lei/j;

    move-result-object p1

    return-object p1
.end method

.method public varargs e([Ljava/lang/Void;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onProgressUpdate([Ljava/lang/Object;)V

    iget-object p1, p0, Lei/a;->d:Lei/l;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lei/a;->a:Lei/j;

    invoke-interface {p1, v0}, Lei/l;->b(Lei/j;)V

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

.method public g(Lhi/d;)V
    .locals 0
    .param p1    # Lhi/d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhi/d<",
            "Lei/j;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lei/a;->g:Lhi/d;

    return-void
.end method

.method public bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lei/j;

    invoke-virtual {p0, p1}, Lei/a;->d(Lei/j;)V

    return-void
.end method

.method public bridge synthetic onProgressUpdate([Ljava/lang/Object;)V
    .locals 0

    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lei/a;->e([Ljava/lang/Void;)V

    return-void
.end method
