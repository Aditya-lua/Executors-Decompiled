.class public final Lnb/de;
.super Lnb/w;
.source "SourceFile"


# instance fields
.field public final synthetic e:Lnb/me;


# direct methods
.method public constructor <init>(Lnb/me;Lnb/l8;)V
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/de;->e:Lnb/me;

    invoke-direct {p0, p2}, Lnb/w;-><init>(Lnb/l8;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    iget-object v0, p0, Lnb/de;->e:Lnb/me;

    invoke-virtual {v0}, Lnb/me;->b()Lnb/c7;

    move-result-object v1

    invoke-virtual {v1}, Lnb/j8;->h()V

    invoke-virtual {v0}, Lnb/me;->y0()Ljava/util/Deque;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Deque;->pollFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lnb/me;->e()Lu9/e;

    move-result-object v2

    invoke-interface {v2}, Lu9/e;->b()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lnb/me;->z0(J)V

    invoke-virtual {v0}, Lnb/me;->a()Lnb/w5;

    move-result-object v2

    invoke-virtual {v2}, Lnb/w5;->w()Lnb/u5;

    move-result-object v2

    const-string v3, "Sending trigger URI notification to app"

    invoke-virtual {v2, v3, v1}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    const-string v3, "com.google.android.gms.measurement.TRIGGERS_AVAILABLE"

    invoke-virtual {v2, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {v2, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {v0}, Lnb/me;->d()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v2}, Lnb/me;->w0(Landroid/content/Context;Landroid/content/Intent;)V

    :cond_0
    invoke-virtual {v0}, Lnb/me;->v0()V

    return-void
.end method
