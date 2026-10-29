.class public Loj/i$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxl/g$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Loj/i;->q(Landroid/content/Context;Lk2/k$f;Lpj/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:I

.field public final synthetic e:Landroid/app/Notification;

.field public final synthetic f:Z

.field public final synthetic g:Lpj/f;

.field public final synthetic h:Loj/i;


# direct methods
.method public constructor <init>(Loj/i;Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;ILandroid/app/Notification;ZLpj/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Loj/i$b;->h:Loj/i;

    iput-object p2, p0, Loj/i$b;->a:Ljava/lang/String;

    iput-object p3, p0, Loj/i$b;->b:Landroid/content/Context;

    iput-object p4, p0, Loj/i$b;->c:Ljava/lang/String;

    iput p5, p0, Loj/i$b;->d:I

    iput-object p6, p0, Loj/i$b;->e:Landroid/app/Notification;

    iput-boolean p7, p0, Loj/i$b;->f:Z

    iput-object p8, p0, Loj/i$b;->g:Lpj/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public C(Ljava/lang/String;Z)V
    .locals 2

    iget-object v0, p0, Loj/i$b;->a:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    iget-object p1, p0, Loj/i$b;->b:Landroid/content/Context;

    invoke-static {p1}, Lk2/n;->e(Landroid/content/Context;)Lk2/n;

    move-result-object p1

    iget-object p2, p0, Loj/i$b;->c:Ljava/lang/String;

    iget v0, p0, Loj/i$b;->d:I

    iget-object v1, p0, Loj/i$b;->e:Landroid/app/Notification;

    invoke-virtual {p1, p2, v0, v1}, Lk2/n;->i(Ljava/lang/String;ILandroid/app/Notification;)V

    :cond_0
    return-void
.end method

.method public V(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Loj/i$b;->a:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Loj/i$b;->b:Landroid/content/Context;

    invoke-static {p1}, Lk2/n;->e(Landroid/content/Context;)Lk2/n;

    move-result-object p1

    iget-object v0, p0, Loj/i$b;->c:Ljava/lang/String;

    iget v1, p0, Loj/i$b;->d:I

    invoke-virtual {p1, v0, v1}, Lk2/n;->b(Ljava/lang/String;I)V

    invoke-static {}, Lxl/g;->x()Lxl/g;

    move-result-object p1

    invoke-virtual {p1, p0}, Lxl/g;->w(Lxl/g$a;)V

    :cond_0
    return-void
.end method

.method public m0(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Loj/i$b;->a:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Loj/i$b;->b:Landroid/content/Context;

    invoke-static {p1}, Lk2/n;->e(Landroid/content/Context;)Lk2/n;

    move-result-object p1

    iget-object v0, p0, Loj/i$b;->c:Ljava/lang/String;

    iget v1, p0, Loj/i$b;->d:I

    invoke-virtual {p1, v0, v1}, Lk2/n;->b(Ljava/lang/String;I)V

    invoke-static {}, Lxl/g;->x()Lxl/g;

    move-result-object p1

    invoke-virtual {p1, p0}, Lxl/g;->w(Lxl/g$a;)V

    :cond_0
    return-void
.end method

.method public o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public v(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Loj/i$b;->a:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Loj/i$b;->b:Landroid/content/Context;

    invoke-static {p1}, Lk2/n;->e(Landroid/content/Context;)Lk2/n;

    move-result-object p1

    iget-object v0, p0, Loj/i$b;->c:Ljava/lang/String;

    iget v1, p0, Loj/i$b;->d:I

    invoke-virtual {p1, v0, v1}, Lk2/n;->b(Ljava/lang/String;I)V

    const-string v0, "Miss"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p2, "missed"

    goto :goto_0

    :cond_0
    const-string v0, "Suppress"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    iget-boolean p2, p0, Loj/i$b;->f:Z

    if-nez p2, :cond_1

    const-string p2, "voice not enabled"

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    :goto_0
    iget-object v0, p0, Loj/i$b;->g:Lpj/f;

    invoke-interface {v0}, Lpj/f;->x()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lpj/f;

    if-eqz p2, :cond_2

    invoke-virtual {p1}, Lk2/n;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Loj/i$b;->h:Loj/i;

    iget-object v1, p0, Loj/i$b;->b:Landroid/content/Context;

    invoke-static {v0, v1, p2}, Loj/i;->h(Loj/i;Landroid/content/Context;Lpj/f;)Lk2/k$f;

    move-result-object v0

    invoke-virtual {v0}, Lk2/k$f;->c()Landroid/app/Notification;

    move-result-object v0

    invoke-interface {p2}, Lpj/f;->a()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2}, Lpj/f;->d()I

    move-result p2

    invoke-virtual {p1, v1, p2, v0}, Lk2/n;->i(Ljava/lang/String;ILandroid/app/Notification;)V

    :cond_2
    invoke-static {}, Lxl/g;->x()Lxl/g;

    move-result-object p1

    invoke-virtual {p1, p0}, Lxl/g;->w(Lxl/g$a;)V

    :cond_3
    return-void
.end method
