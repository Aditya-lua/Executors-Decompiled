.class public final Lob/da;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lob/a0;

.field public final synthetic b:Lob/va;


# direct methods
.method public constructor <init>(Lob/va;Lob/a0;)V
    .locals 0

    iput-object p2, p0, Lob/da;->a:Lob/a0;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lob/da;->b:Lob/va;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lob/da;->b:Lob/va;

    iget-object v1, v0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v1}, Lob/l7;->x()Lob/p6;

    move-result-object v2

    iget-object v3, v2, Lob/o8;->a:Lob/l7;

    invoke-virtual {v2}, Lob/o8;->h()V

    invoke-virtual {v2}, Lob/p6;->u()Lob/a0;

    move-result-object v3

    iget-object v4, p0, Lob/da;->a:Lob/a0;

    invoke-virtual {v4}, Lob/a0;->b()I

    move-result v5

    invoke-virtual {v3}, Lob/a0;->b()I

    move-result v3

    invoke-static {v5, v3}, Lob/v8;->u(II)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v2}, Lob/p6;->p()Landroid/content/SharedPreferences;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    invoke-virtual {v4}, Lob/a0;->e()Ljava/lang/String;

    move-result-object v3

    const-string v5, "dma_consent_settings"

    invoke-interface {v2, v5, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V

    invoke-virtual {v1}, Lob/l7;->a()Lob/b6;

    move-result-object v1

    invoke-virtual {v1}, Lob/b6;->w()Lob/z5;

    move-result-object v1

    const-string v2, "Setting DMA consent(FE)"

    invoke-virtual {v1, v2, v4}, Lob/z5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, v0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v0}, Lob/l7;->J()Lob/yc;

    move-result-object v1

    invoke-virtual {v1}, Lob/yc;->D()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lob/l7;->J()Lob/yc;

    move-result-object v0

    invoke-virtual {v0}, Lob/yc;->a0()V

    return-void

    :cond_0
    invoke-virtual {v0}, Lob/l7;->J()Lob/yc;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lob/yc;->Y(Z)V

    return-void

    :cond_1
    invoke-virtual {v1}, Lob/l7;->a()Lob/b6;

    move-result-object v0

    invoke-virtual {v0}, Lob/b6;->u()Lob/z5;

    move-result-object v0

    invoke-virtual {v4}, Lob/a0;->b()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "Lower precedence consent source ignored, proposed source"

    invoke-virtual {v0, v2, v1}, Lob/z5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
