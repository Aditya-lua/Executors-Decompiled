.class public final Lnb/y9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lnb/x;

.field public final synthetic b:Lnb/qa;


# direct methods
.method public constructor <init>(Lnb/qa;Lnb/x;)V
    .locals 0

    iput-object p2, p0, Lnb/y9;->a:Lnb/x;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/y9;->b:Lnb/qa;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lnb/y9;->b:Lnb/qa;

    iget-object v1, v0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v1}, Lnb/g7;->x()Lnb/k6;

    move-result-object v2

    iget-object v3, v2, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v2}, Lnb/j8;->h()V

    invoke-virtual {v2}, Lnb/k6;->u()Lnb/x;

    move-result-object v3

    iget-object v4, p0, Lnb/y9;->a:Lnb/x;

    invoke-virtual {v4}, Lnb/x;->b()I

    move-result v5

    invoke-virtual {v3}, Lnb/x;->b()I

    move-result v3

    invoke-static {v5, v3}, Lnb/q8;->u(II)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v2}, Lnb/k6;->p()Landroid/content/SharedPreferences;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    invoke-virtual {v4}, Lnb/x;->e()Ljava/lang/String;

    move-result-object v3

    const-string v5, "dma_consent_settings"

    invoke-interface {v2, v5, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V

    invoke-virtual {v1}, Lnb/g7;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->w()Lnb/u5;

    move-result-object v1

    const-string v2, "Setting DMA consent(FE)"

    invoke-virtual {v1, v2, v4}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, v0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->J()Lnb/tc;

    move-result-object v1

    invoke-virtual {v1}, Lnb/tc;->D()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lnb/g7;->J()Lnb/tc;

    move-result-object v0

    invoke-virtual {v0}, Lnb/tc;->a0()V

    return-void

    :cond_0
    invoke-virtual {v0}, Lnb/g7;->J()Lnb/tc;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lnb/tc;->Y(Z)V

    return-void

    :cond_1
    invoke-virtual {v1}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->u()Lnb/u5;

    move-result-object v0

    invoke-virtual {v4}, Lnb/x;->b()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "Lower precedence consent source ignored, proposed source"

    invoke-virtual {v0, v2, v1}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
