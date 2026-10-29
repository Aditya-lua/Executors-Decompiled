.class public Lck/c;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Lck/d;",
        ">;"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:I

.field public c:Ljava/lang/String;

.field public d:Lck/a;


# direct methods
.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Lck/a;)V
    .locals 0

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    iput-object p4, p0, Lck/c;->d:Lck/a;

    iput-object p1, p0, Lck/c;->a:Ljava/lang/String;

    iput-object p3, p0, Lck/c;->c:Ljava/lang/String;

    iput p2, p0, Lck/c;->b:I

    if-nez p3, :cond_0

    const-string p1, ""

    iput-object p1, p0, Lck/c;->c:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public static c(Lli/b$d;Ljava/lang/String;)Lck/d;
    .locals 4

    new-instance v0, Lck/d;

    iget-object v1, p0, Lli/b$d;->a:Ljava/lang/String;

    iget v2, p0, Lli/b$d;->b:I

    invoke-direct {v0, v1, v2}, Lck/d;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v0, p1}, Lck/d;->a(Ljava/lang/String;)V

    iget-object p0, p0, Lli/b$d;->c:Ljava/net/Socket;

    const/4 v1, 0x0

    :try_start_0
    new-instance v2, Ljava/io/PrintWriter;

    invoke-virtual {p0}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object p0

    const/4 v3, 0x1

    invoke-direct {v2, p0, v3}, Ljava/io/PrintWriter;-><init>(Ljava/io/OutputStream;Z)V

    invoke-virtual {v2}, Ljava/io/PrintWriter;->checkError()Z

    move-result p0

    if-nez p0, :cond_0

    invoke-virtual {v2, p1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/PrintWriter;->flush()V

    const-string p0, ""

    invoke-virtual {v0, p0}, Lck/d;->a(Ljava/lang/String;)V

    return-object v0

    :catch_0
    move-exception p0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Lck/d;->b(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :goto_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Error sending influx data over TCP = "

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "RbxTcpRequest"

    invoke-static {p1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v0, v1}, Lck/d;->b(Z)V

    return-object v0
.end method


# virtual methods
.method public varargs a([Ljava/lang/Void;)Lck/d;
    .locals 4

    const-string p1, "RbxTcpRequest"

    invoke-static {}, Lli/b;->f()Lli/b;

    move-result-object v0

    invoke-virtual {v0}, Lli/b;->g()Lli/b$d;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v1, v0, Lli/b$d;->c:Ljava/net/Socket;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lck/c;->c:Ljava/lang/String;

    invoke-static {v0, v1}, Lck/c;->c(Lli/b$d;Ljava/lang/String;)Lck/d;

    move-result-object v1

    iget v2, v0, Lli/b$d;->d:I

    if-nez v2, :cond_1

    :try_start_0
    const-string v2, "doInBackground: timeToLive is 0. Close socket immediately..."

    invoke-static {p1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, v0, Lli/b$d;->c:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Error closing the socket: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    return-object v1

    :cond_2
    :goto_0
    new-instance p1, Lck/d;

    iget-object v0, p0, Lck/c;->a:Ljava/lang/String;

    iget v1, p0, Lck/c;->b:I

    invoke-direct {p1, v0, v1}, Lck/d;-><init>(Ljava/lang/String;I)V

    iget-object v0, p0, Lck/c;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lck/d;->a(Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lck/d;->b(Z)V

    return-object p1
.end method

.method public b(Lck/d;)V
    .locals 2

    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V

    if-nez p1, :cond_0

    new-instance p1, Lck/d;

    iget-object v0, p0, Lck/c;->a:Ljava/lang/String;

    iget v1, p0, Lck/c;->b:I

    invoke-direct {p1, v0, v1}, Lck/d;-><init>(Ljava/lang/String;I)V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lck/d;->b(Z)V

    :cond_0
    iget-object v0, p0, Lck/c;->d:Lck/a;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lck/a;->a(Lck/d;)V

    :cond_1
    return-void
.end method

.method public bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lck/c;->a([Ljava/lang/Void;)Lck/d;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lck/d;

    invoke-virtual {p0, p1}, Lck/c;->b(Lck/d;)V

    return-void
.end method
