.class public final Lob/wb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lob/hf;

.field public final synthetic b:Lob/yc;


# direct methods
.method public constructor <init>(Lob/yc;Lob/hf;Z)V
    .locals 0

    iput-object p2, p0, Lob/wb;->a:Lob/hf;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lob/wb;->b:Lob/yc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    iget-object v0, p0, Lob/wb;->b:Lob/yc;

    invoke-virtual {v0}, Lob/yc;->N()Lob/i5;

    move-result-object v1

    if-nez v1, :cond_0

    iget-object v0, v0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v0}, Lob/l7;->a()Lob/b6;

    move-result-object v0

    invoke-virtual {v0}, Lob/b6;->o()Lob/z5;

    move-result-object v0

    const-string v1, "Discarding data. Failed to send app launch"

    invoke-virtual {v0, v1}, Lob/z5;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    :try_start_0
    iget-object v2, p0, Lob/wb;->a:Lob/hf;

    invoke-static {v2}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v3, v0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v3}, Lob/l7;->w()Lob/m;

    move-result-object v4

    sget-object v5, Lob/e5;->c1:Lob/d5;

    const/4 v6, 0x0

    invoke-virtual {v4, v6, v5}, Lob/m;->H(Ljava/lang/String;Lob/d5;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {v0, v1, v6, v2}, Lob/yc;->b0(Lob/i5;Lp9/a;Lob/hf;)V

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    invoke-interface {v1, v2}, Lob/i5;->i0(Lob/hf;)V

    iget-object v4, v0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v4}, Lob/l7;->E()Lob/s5;

    move-result-object v4

    invoke-virtual {v4}, Lob/s5;->v()Z

    invoke-virtual {v3}, Lob/l7;->w()Lob/m;

    move-result-object v3

    invoke-virtual {v3, v6, v5}, Lob/m;->H(Ljava/lang/String;Lob/d5;)Z

    invoke-virtual {v0, v1, v6, v2}, Lob/yc;->b0(Lob/i5;Lp9/a;Lob/hf;)V

    invoke-virtual {v0}, Lob/yc;->J()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_1
    iget-object v1, p0, Lob/wb;->b:Lob/yc;

    iget-object v1, v1, Lob/o8;->a:Lob/l7;

    invoke-virtual {v1}, Lob/l7;->a()Lob/b6;

    move-result-object v1

    invoke-virtual {v1}, Lob/b6;->o()Lob/z5;

    move-result-object v1

    const-string v2, "Failed to send app launch to the service"

    invoke-virtual {v1, v2, v0}, Lob/z5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
