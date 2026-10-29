.class public Landroidx/appcompat/widget/a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field public a:Landroidx/appcompat/widget/a$e;

.field public final synthetic b:Landroidx/appcompat/widget/a;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/a;Landroidx/appcompat/widget/a$e;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/widget/a$c;->b:Landroidx/appcompat/widget/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Landroidx/appcompat/widget/a$c;->a:Landroidx/appcompat/widget/a$e;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/widget/a$c;->b:Landroidx/appcompat/widget/a;

    invoke-static {v0}, Landroidx/appcompat/widget/a;->w(Landroidx/appcompat/widget/a;)Landroidx/appcompat/view/menu/e;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/appcompat/widget/a$c;->b:Landroidx/appcompat/widget/a;

    invoke-static {v0}, Landroidx/appcompat/widget/a;->x(Landroidx/appcompat/widget/a;)Landroidx/appcompat/view/menu/e;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/view/menu/e;->d()V

    :cond_0
    iget-object v0, p0, Landroidx/appcompat/widget/a$c;->b:Landroidx/appcompat/widget/a;

    invoke-static {v0}, Landroidx/appcompat/widget/a;->y(Landroidx/appcompat/widget/a;)Landroidx/appcompat/view/menu/j;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/appcompat/widget/a$c;->a:Landroidx/appcompat/widget/a$e;

    invoke-virtual {v0}, Landroidx/appcompat/view/menu/h;->m()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/appcompat/widget/a$c;->b:Landroidx/appcompat/widget/a;

    iget-object v1, p0, Landroidx/appcompat/widget/a$c;->a:Landroidx/appcompat/widget/a$e;

    iput-object v1, v0, Landroidx/appcompat/widget/a;->y:Landroidx/appcompat/widget/a$e;

    :cond_1
    iget-object v0, p0, Landroidx/appcompat/widget/a$c;->b:Landroidx/appcompat/widget/a;

    const/4 v1, 0x0

    iput-object v1, v0, Landroidx/appcompat/widget/a;->A:Landroidx/appcompat/widget/a$c;

    return-void
.end method
