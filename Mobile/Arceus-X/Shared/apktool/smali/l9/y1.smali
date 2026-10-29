.class public final Ll9/y1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ll9/i;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ll9/z1;


# direct methods
.method public constructor <init>(Ll9/z1;Ll9/i;Ljava/lang/String;)V
    .locals 0

    iput-object p2, p0, Ll9/y1;->a:Ll9/i;

    iput-object p3, p0, Ll9/y1;->b:Ljava/lang/String;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Ll9/y1;->c:Ll9/z1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Ll9/y1;->c:Ll9/z1;

    invoke-virtual {v0}, Ll9/z1;->k()I

    move-result v1

    if-lez v1, :cond_1

    iget-object v1, p0, Ll9/y1;->a:Ll9/i;

    invoke-virtual {v0}, Ll9/z1;->l()Landroid/os/Bundle;

    move-result-object v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Ll9/y1;->b:Ljava/lang/String;

    invoke-virtual {v0}, Ll9/z1;->l()Landroid/os/Bundle;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v1, v2}, Ll9/i;->f(Landroid/os/Bundle;)V

    :cond_1
    invoke-virtual {v0}, Ll9/z1;->k()I

    move-result v1

    const/4 v2, 0x2

    if-lt v1, v2, :cond_2

    iget-object v1, p0, Ll9/y1;->a:Ll9/i;

    invoke-virtual {v1}, Ll9/i;->j()V

    :cond_2
    invoke-virtual {v0}, Ll9/z1;->k()I

    move-result v1

    const/4 v2, 0x3

    if-lt v1, v2, :cond_3

    iget-object v1, p0, Ll9/y1;->a:Ll9/i;

    invoke-virtual {v1}, Ll9/i;->h()V

    :cond_3
    invoke-virtual {v0}, Ll9/z1;->k()I

    move-result v1

    const/4 v2, 0x4

    if-lt v1, v2, :cond_4

    iget-object v1, p0, Ll9/y1;->a:Ll9/i;

    invoke-virtual {v1}, Ll9/i;->k()V

    :cond_4
    invoke-virtual {v0}, Ll9/z1;->k()I

    move-result v0

    const/4 v1, 0x5

    if-lt v0, v1, :cond_5

    iget-object v0, p0, Ll9/y1;->a:Ll9/i;

    invoke-virtual {v0}, Ll9/i;->g()V

    :cond_5
    return-void
.end method
