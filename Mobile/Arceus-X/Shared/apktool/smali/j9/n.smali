.class public final Lj9/n;
.super Lbb/j;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "HandlerLeak"
    }
.end annotation


# instance fields
.field public final b:Landroid/content/Context;

.field public final synthetic c:Lj9/c;


# direct methods
.method public constructor <init>(Lj9/c;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lj9/n;->c:Lj9/c;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p1

    if-nez p1, :cond_0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p1

    :goto_0
    invoke-direct {p0, p1}, Lbb/j;-><init>(Landroid/os/Looper;)V

    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lj9/n;->b:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 2

    iget p1, p1, Landroid/os/Message;->what:I

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Don\'t know how to handle this message: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "GoogleApiAvailability"

    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    iget-object p1, p0, Lj9/n;->c:Lj9/c;

    iget-object v0, p0, Lj9/n;->b:Landroid/content/Context;

    invoke-virtual {p1, v0}, Lj9/c;->g(Landroid/content/Context;)I

    move-result v0

    invoke-virtual {p1, v0}, Lj9/c;->j(I)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lj9/n;->c:Lj9/c;

    iget-object v1, p0, Lj9/n;->b:Landroid/content/Context;

    invoke-virtual {p1, v1, v0}, Lj9/c;->q(Landroid/content/Context;I)V

    :cond_1
    return-void
.end method
