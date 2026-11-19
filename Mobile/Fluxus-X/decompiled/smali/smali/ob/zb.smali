.class public final Lob/zb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lob/gb;

.field public final synthetic b:Lob/yc;


# direct methods
.method public constructor <init>(Lob/yc;Lob/gb;)V
    .locals 0

    iput-object p2, p0, Lob/zb;->a:Lob/gb;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lob/zb;->b:Lob/yc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    iget-object v0, p0, Lob/zb;->b:Lob/yc;

    invoke-virtual {v0}, Lob/yc;->N()Lob/i5;

    move-result-object v1

    if-nez v1, :cond_0

    iget-object v0, v0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v0}, Lob/l7;->a()Lob/b6;

    move-result-object v0

    invoke-virtual {v0}, Lob/b6;->o()Lob/z5;

    move-result-object v0

    const-string v1, "Failed to send current screen to service"

    invoke-virtual {v0, v1}, Lob/z5;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    :try_start_0
    iget-object v2, p0, Lob/zb;->a:Lob/gb;

    if-nez v2, :cond_1

    iget-object v2, v0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v2}, Lob/l7;->d()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v6

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-interface/range {v1 .. v6}, Lob/i5;->d1(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_1
    move-object v4, v2

    iget-wide v2, v4, Lob/gb;->c:J

    move-object v5, v4

    iget-object v4, v5, Lob/gb;->a:Ljava/lang/String;

    iget-object v5, v5, Lob/gb;->b:Ljava/lang/String;

    iget-object v6, v0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v6}, Lob/l7;->d()Landroid/content/Context;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v6

    invoke-interface/range {v1 .. v6}, Lob/i5;->d1(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    invoke-virtual {v0}, Lob/yc;->J()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_1
    iget-object v1, p0, Lob/zb;->b:Lob/yc;

    iget-object v1, v1, Lob/o8;->a:Lob/l7;

    invoke-virtual {v1}, Lob/l7;->a()Lob/b6;

    move-result-object v1

    invoke-virtual {v1}, Lob/b6;->o()Lob/z5;

    move-result-object v1

    const-string v2, "Failed to send current screen to the service"

    invoke-virtual {v1, v2, v0}, Lob/z5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
