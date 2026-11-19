.class public final Lob/r6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field public final a:Ljava/lang/String;

.field public final synthetic b:Lob/s6;


# direct methods
.method public constructor <init>(Lob/s6;Ljava/lang/String;)V
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lob/r6;->b:Lob/s6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lob/r6;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final synthetic a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lob/r6;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 2

    if-eqz p2, :cond_1

    :try_start_0
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/s0;->s2(Landroid/os/IBinder;)Lcom/google/android/gms/internal/measurement/t0;

    move-result-object p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lob/r6;->b:Lob/s6;

    iget-object p1, p1, Lob/s6;->a:Lob/l7;

    invoke-virtual {p1}, Lob/l7;->a()Lob/b6;

    move-result-object p1

    invoke-virtual {p1}, Lob/b6;->r()Lob/z5;

    move-result-object p1

    const-string p2, "Install Referrer Service implementation was not found"

    invoke-virtual {p1, p2}, Lob/z5;->a(Ljava/lang/String;)V

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lob/r6;->b:Lob/s6;

    iget-object p2, p2, Lob/s6;->a:Lob/l7;

    invoke-virtual {p2}, Lob/l7;->a()Lob/b6;

    move-result-object v0

    invoke-virtual {v0}, Lob/b6;->w()Lob/z5;

    move-result-object v0

    const-string v1, "Install Referrer Service connected"

    invoke-virtual {v0, v1}, Lob/z5;->a(Ljava/lang/String;)V

    invoke-virtual {p2}, Lob/l7;->b()Lob/h7;

    move-result-object p2

    new-instance v0, Lob/q6;

    invoke-direct {v0, p0, p1, p0}, Lob/q6;-><init>(Lob/r6;Lcom/google/android/gms/internal/measurement/t0;Landroid/content/ServiceConnection;)V

    invoke-virtual {p2, v0}, Lob/h7;->t(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_0
    iget-object p2, p0, Lob/r6;->b:Lob/s6;

    iget-object p2, p2, Lob/s6;->a:Lob/l7;

    invoke-virtual {p2}, Lob/l7;->a()Lob/b6;

    move-result-object p2

    invoke-virtual {p2}, Lob/b6;->r()Lob/z5;

    move-result-object p2

    const-string v0, "Exception occurred while calling Install Referrer API"

    invoke-virtual {p2, v0, p1}, Lob/z5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_1
    iget-object p1, p0, Lob/r6;->b:Lob/s6;

    iget-object p1, p1, Lob/s6;->a:Lob/l7;

    invoke-virtual {p1}, Lob/l7;->a()Lob/b6;

    move-result-object p1

    invoke-virtual {p1}, Lob/b6;->r()Lob/z5;

    move-result-object p1

    const-string p2, "Install Referrer connection returned with null binder"

    invoke-virtual {p1, p2}, Lob/z5;->a(Ljava/lang/String;)V

    return-void
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1

    iget-object p1, p0, Lob/r6;->b:Lob/s6;

    iget-object p1, p1, Lob/s6;->a:Lob/l7;

    invoke-virtual {p1}, Lob/l7;->a()Lob/b6;

    move-result-object p1

    invoke-virtual {p1}, Lob/b6;->w()Lob/z5;

    move-result-object p1

    const-string v0, "Install Referrer Service disconnected"

    invoke-virtual {p1, v0}, Lob/z5;->a(Ljava/lang/String;)V

    return-void
.end method
