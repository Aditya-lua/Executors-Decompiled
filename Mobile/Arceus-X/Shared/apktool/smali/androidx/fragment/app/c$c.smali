.class public Landroidx/fragment/app/c$c;
.super Landroidx/fragment/app/c$l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroidx/fragment/app/c;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/c;)V
    .locals 0

    iput-object p1, p0, Landroidx/fragment/app/c$c;->a:Landroidx/fragment/app/c;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Landroidx/fragment/app/c$l;-><init>(Landroidx/fragment/app/c$b;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/c$c;->a:Landroidx/fragment/app/c;

    iget-object v0, v0, Landroidx/fragment/app/c;->Z:Ld5/h;

    invoke-virtual {v0}, Ld5/h;->c()V

    iget-object v0, p0, Landroidx/fragment/app/c$c;->a:Landroidx/fragment/app/c;

    invoke-static {v0}, Landroidx/lifecycle/o0;->c(Ld5/i;)V

    iget-object v0, p0, Landroidx/fragment/app/c$c;->a:Landroidx/fragment/app/c;

    iget-object v0, v0, Landroidx/fragment/app/c;->b:Landroid/os/Bundle;

    if-eqz v0, :cond_0

    const-string v1, "registryState"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Landroidx/fragment/app/c$c;->a:Landroidx/fragment/app/c;

    iget-object v1, v1, Landroidx/fragment/app/c;->Z:Ld5/h;

    invoke-virtual {v1, v0}, Ld5/h;->d(Landroid/os/Bundle;)V

    return-void
.end method
