.class public Lli/b;
.super Ljh/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lli/b$c;,
        Lli/b$d;,
        Lli/b$b;
    }
.end annotation


# instance fields
.field public f:Lli/b$d;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljh/b;-><init>()V

    return-void
.end method

.method public static bridge synthetic d(Lli/b;)Lli/b$d;
    .locals 0

    iget-object p0, p0, Lli/b;->f:Lli/b$d;

    return-object p0
.end method

.method public static bridge synthetic e(Lli/b;Lli/b$d;)V
    .locals 0

    iput-object p1, p0, Lli/b;->f:Lli/b$d;

    return-void
.end method

.method public static f()Lli/b;
    .locals 1

    invoke-static {}, Lli/b$c;->a()Lli/b;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public g()Lli/b$d;
    .locals 6

    const-string v0, "InfluxV2Queue"

    iget-object v1, p0, Lli/b;->f:Lli/b$d;

    if-eqz v1, :cond_0

    iget-object v2, v1, Lli/b$d;->c:Ljava/net/Socket;

    if-eqz v2, :cond_0

    return-object v1

    :cond_0
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v1

    invoke-interface {v1}, Lth/i;->n3()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v2

    invoke-interface {v2}, Lth/i;->J3()I

    move-result v2

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v3

    invoke-interface {v3}, Lth/i;->F3()I

    move-result v3

    new-instance v4, Lli/b$d;

    invoke-direct {v4, p0}, Lli/b$d;-><init>(Lli/b;)V

    iput-object v4, p0, Lli/b;->f:Lli/b$d;

    iput-object v1, v4, Lli/b$d;->a:Ljava/lang/String;

    iput v2, v4, Lli/b$d;->b:I

    iput v3, v4, Lli/b$d;->d:I

    :try_start_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "getSocketInfo: Create a socket to "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ":"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, "..."

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {v1}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object v1

    new-instance v3, Ljava/net/Socket;

    invoke-direct {v3, v1, v2}, Ljava/net/Socket;-><init>(Ljava/net/InetAddress;I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v1, p0, Lli/b;->f:Lli/b$d;

    iput-object v3, v1, Lli/b$d;->c:Ljava/net/Socket;

    iget v1, v1, Lli/b$d;->d:I

    if-lez v1, :cond_1

    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Schedule a special close-connection item with delay="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lli/b;->f:Lli/b$d;

    iget v3, v3, Lli/b$d;->d:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "s..."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Lli/b$a;

    invoke-direct {v0, p0}, Lli/b$a;-><init>(Lli/b;)V

    iget-object v2, p0, Lli/b;->f:Lli/b$d;

    iget v2, v2, Lli/b$d;->d:I

    int-to-long v2, v2

    const-wide/16 v4, 0x3e8

    mul-long/2addr v2, v4

    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_1
    iget-object v0, p0, Lli/b;->f:Lli/b$d;

    return-object v0

    :catch_0
    move-exception v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Error creating the socket: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lli/b;->f:Lli/b$d;

    return-object v0
.end method
