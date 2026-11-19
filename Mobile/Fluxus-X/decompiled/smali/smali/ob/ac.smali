.class public final Lob/ac;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lob/hf;

.field public final synthetic b:Z

.field public final synthetic c:Lob/g0;

.field public final synthetic d:Landroid/os/Bundle;

.field public final synthetic e:Lob/yc;


# direct methods
.method public constructor <init>(Lob/yc;ZLob/hf;ZLob/g0;Landroid/os/Bundle;)V
    .locals 0

    iput-object p3, p0, Lob/ac;->a:Lob/hf;

    iput-boolean p4, p0, Lob/ac;->b:Z

    iput-object p5, p0, Lob/ac;->c:Lob/g0;

    iput-object p6, p0, Lob/ac;->d:Landroid/os/Bundle;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lob/ac;->e:Lob/yc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lob/ac;->e:Lob/yc;

    invoke-virtual {v0}, Lob/yc;->N()Lob/i5;

    move-result-object v1

    const-string v2, "Failed to send default event parameters to service"

    if-nez v1, :cond_0

    iget-object v0, v0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v0}, Lob/l7;->a()Lob/b6;

    move-result-object v0

    invoke-virtual {v0}, Lob/b6;->o()Lob/z5;

    move-result-object v0

    invoke-virtual {v0, v2}, Lob/z5;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v3, v0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v3}, Lob/l7;->w()Lob/m;

    move-result-object v3

    sget-object v4, Lob/e5;->c1:Lob/d5;

    const/4 v5, 0x0

    invoke-virtual {v3, v5, v4}, Lob/m;->H(Ljava/lang/String;Lob/d5;)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v0, p0, Lob/ac;->a:Lob/hf;

    invoke-static {v0}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, p0, Lob/ac;->e:Lob/yc;

    iget-boolean v3, p0, Lob/ac;->b:Z

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    iget-object v5, p0, Lob/ac;->c:Lob/g0;

    :goto_0
    invoke-virtual {v2, v1, v5, v0}, Lob/yc;->b0(Lob/i5;Lp9/a;Lob/hf;)V

    return-void

    :cond_2
    :try_start_0
    iget-object v3, p0, Lob/ac;->a:Lob/hf;

    invoke-static {v3}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v4, p0, Lob/ac;->d:Landroid/os/Bundle;

    invoke-interface {v1, v4, v3}, Lob/i5;->L1(Landroid/os/Bundle;Lob/hf;)V

    invoke-virtual {v0}, Lob/yc;->J()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lob/ac;->e:Lob/yc;

    iget-object v1, v1, Lob/o8;->a:Lob/l7;

    invoke-virtual {v1}, Lob/l7;->a()Lob/b6;

    move-result-object v1

    invoke-virtual {v1}, Lob/b6;->o()Lob/z5;

    move-result-object v1

    invoke-virtual {v1, v2, v0}, Lob/z5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
