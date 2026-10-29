.class public Lk2/k$f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk2/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk2/k$f$a;
    }
.end annotation


# instance fields
.field public A:Z

.field public B:Z

.field public C:Z

.field public D:Ljava/lang/String;

.field public E:Landroid/os/Bundle;

.field public F:I

.field public G:I

.field public H:Landroid/app/Notification;

.field public I:Landroid/widget/RemoteViews;

.field public J:Landroid/widget/RemoteViews;

.field public K:Landroid/widget/RemoteViews;

.field public L:Ljava/lang/String;

.field public M:I

.field public N:Ljava/lang/String;

.field public O:Ll2/d;

.field public P:J

.field public Q:I

.field public R:I

.field public S:Z

.field public T:Landroid/app/Notification;

.field public U:Z

.field public V:Ljava/lang/Object;

.field public W:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public a:Landroid/content/Context;

.field public b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lk2/k$a;",
            ">;"
        }
    .end annotation
.end field

.field public c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lk2/r;",
            ">;"
        }
    .end annotation
.end field

.field public d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lk2/k$a;",
            ">;"
        }
    .end annotation
.end field

.field public e:Ljava/lang/CharSequence;

.field public f:Ljava/lang/CharSequence;

.field public g:Ljava/lang/String;

.field public h:Landroid/app/PendingIntent;

.field public i:Landroid/app/PendingIntent;

.field public j:Landroid/widget/RemoteViews;

.field public k:Landroidx/core/graphics/drawable/IconCompat;

.field public l:Ljava/lang/CharSequence;

.field public m:I

.field public n:I

.field public o:Z

.field public p:Z

.field public q:Lk2/k$i;

.field public r:Ljava/lang/CharSequence;

.field public s:Ljava/lang/CharSequence;

.field public t:[Ljava/lang/CharSequence;

.field public u:I

.field public v:I

.field public w:Z

.field public x:Ljava/lang/String;

.field public y:Z

.field public z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    .line 20
    invoke-direct {p0, p1, v0}, Lk2/k$f;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lk2/k$f;->b:Ljava/util/ArrayList;

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lk2/k$f;->c:Ljava/util/ArrayList;

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lk2/k$f;->d:Ljava/util/ArrayList;

    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lk2/k$f;->o:Z

    const/4 v1, 0x0

    .line 6
    iput-boolean v1, p0, Lk2/k$f;->A:Z

    .line 7
    iput v1, p0, Lk2/k$f;->F:I

    .line 8
    iput v1, p0, Lk2/k$f;->G:I

    .line 9
    iput v1, p0, Lk2/k$f;->M:I

    .line 10
    iput v1, p0, Lk2/k$f;->Q:I

    .line 11
    iput v1, p0, Lk2/k$f;->R:I

    .line 12
    new-instance v2, Landroid/app/Notification;

    invoke-direct {v2}, Landroid/app/Notification;-><init>()V

    iput-object v2, p0, Lk2/k$f;->T:Landroid/app/Notification;

    .line 13
    iput-object p1, p0, Lk2/k$f;->a:Landroid/content/Context;

    .line 14
    iput-object p2, p0, Lk2/k$f;->L:Ljava/lang/String;

    .line 15
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    iput-wide p1, v2, Landroid/app/Notification;->when:J

    .line 16
    iget-object p1, p0, Lk2/k$f;->T:Landroid/app/Notification;

    const/4 p2, -0x1

    iput p2, p1, Landroid/app/Notification;->audioStreamType:I

    .line 17
    iput v1, p0, Lk2/k$f;->n:I

    .line 18
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lk2/k$f;->W:Ljava/util/ArrayList;

    .line 19
    iput-boolean v0, p0, Lk2/k$f;->S:Z

    return-void
.end method

.method public static e(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    .locals 2

    if-nez p0, :cond_0

    return-object p0

    :cond_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/16 v1, 0x1400

    if-le v0, v1, :cond_1

    const/4 v0, 0x0

    invoke-interface {p0, v0, v1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p0

    :cond_1
    return-object p0
.end method


# virtual methods
.method public A(Landroid/net/Uri;)Lk2/k$f;
    .locals 1

    iget-object v0, p0, Lk2/k$f;->T:Landroid/app/Notification;

    iput-object p1, v0, Landroid/app/Notification;->sound:Landroid/net/Uri;

    const/4 p1, -0x1

    iput p1, v0, Landroid/app/Notification;->audioStreamType:I

    invoke-static {}, Lk2/k$f$a;->b()Landroid/media/AudioAttributes$Builder;

    move-result-object p1

    const/4 v0, 0x4

    invoke-static {p1, v0}, Lk2/k$f$a;->c(Landroid/media/AudioAttributes$Builder;I)Landroid/media/AudioAttributes$Builder;

    move-result-object p1

    const/4 v0, 0x5

    invoke-static {p1, v0}, Lk2/k$f$a;->d(Landroid/media/AudioAttributes$Builder;I)Landroid/media/AudioAttributes$Builder;

    move-result-object p1

    iget-object v0, p0, Lk2/k$f;->T:Landroid/app/Notification;

    invoke-static {p1}, Lk2/k$f$a;->a(Landroid/media/AudioAttributes$Builder;)Landroid/media/AudioAttributes;

    move-result-object p1

    iput-object p1, v0, Landroid/app/Notification;->audioAttributes:Landroid/media/AudioAttributes;

    return-object p0
.end method

.method public B(Lk2/k$i;)Lk2/k$f;
    .locals 1

    iget-object v0, p0, Lk2/k$f;->q:Lk2/k$i;

    if-eq v0, p1, :cond_0

    iput-object p1, p0, Lk2/k$f;->q:Lk2/k$i;

    if-eqz p1, :cond_0

    invoke-virtual {p1, p0}, Lk2/k$i;->g(Lk2/k$f;)V

    :cond_0
    return-object p0
.end method

.method public C(Ljava/lang/CharSequence;)Lk2/k$f;
    .locals 1

    iget-object v0, p0, Lk2/k$f;->T:Landroid/app/Notification;

    invoke-static {p1}, Lk2/k$f;->e(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, v0, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public D(J)Lk2/k$f;
    .locals 0

    iput-wide p1, p0, Lk2/k$f;->P:J

    return-object p0
.end method

.method public E([J)Lk2/k$f;
    .locals 1

    iget-object v0, p0, Lk2/k$f;->T:Landroid/app/Notification;

    iput-object p1, v0, Landroid/app/Notification;->vibrate:[J

    return-object p0
.end method

.method public F(I)Lk2/k$f;
    .locals 0

    iput p1, p0, Lk2/k$f;->G:I

    return-object p0
.end method

.method public G(J)Lk2/k$f;
    .locals 1

    iget-object v0, p0, Lk2/k$f;->T:Landroid/app/Notification;

    iput-wide p1, v0, Landroid/app/Notification;->when:J

    return-object p0
.end method

.method public a(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)Lk2/k$f;
    .locals 2

    iget-object v0, p0, Lk2/k$f;->b:Ljava/util/ArrayList;

    new-instance v1, Lk2/k$a;

    invoke-direct {v1, p1, p2, p3}, Lk2/k$a;-><init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public b(Lk2/k$a;)Lk2/k$f;
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lk2/k$f;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-object p0
.end method

.method public c()Landroid/app/Notification;
    .locals 1

    new-instance v0, Lk2/l;

    invoke-direct {v0, p0}, Lk2/l;-><init>(Lk2/k$f;)V

    invoke-virtual {v0}, Lk2/l;->c()Landroid/app/Notification;

    move-result-object v0

    return-object v0
.end method

.method public d()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lk2/k$f;->E:Landroid/os/Bundle;

    if-nez v0, :cond_0

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Lk2/k$f;->E:Landroid/os/Bundle;

    :cond_0
    iget-object v0, p0, Lk2/k$f;->E:Landroid/os/Bundle;

    return-object v0
.end method

.method public f(Z)Lk2/k$f;
    .locals 1

    const/16 v0, 0x10

    invoke-virtual {p0, v0, p1}, Lk2/k$f;->o(IZ)V

    return-object p0
.end method

.method public g(Ljava/lang/String;)Lk2/k$f;
    .locals 0

    iput-object p1, p0, Lk2/k$f;->L:Ljava/lang/String;

    return-object p0
.end method

.method public h(I)Lk2/k$f;
    .locals 0

    iput p1, p0, Lk2/k$f;->F:I

    return-object p0
.end method

.method public i(Landroid/widget/RemoteViews;)Lk2/k$f;
    .locals 1

    iget-object v0, p0, Lk2/k$f;->T:Landroid/app/Notification;

    iput-object p1, v0, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    return-object p0
.end method

.method public j(Landroid/app/PendingIntent;)Lk2/k$f;
    .locals 0

    iput-object p1, p0, Lk2/k$f;->h:Landroid/app/PendingIntent;

    return-object p0
.end method

.method public k(Ljava/lang/CharSequence;)Lk2/k$f;
    .locals 0

    invoke-static {p1}, Lk2/k$f;->e(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, Lk2/k$f;->f:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public l(Ljava/lang/CharSequence;)Lk2/k$f;
    .locals 0

    invoke-static {p1}, Lk2/k$f;->e(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, Lk2/k$f;->e:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public m(I)Lk2/k$f;
    .locals 1

    iget-object v0, p0, Lk2/k$f;->T:Landroid/app/Notification;

    iput p1, v0, Landroid/app/Notification;->defaults:I

    and-int/lit8 p1, p1, 0x4

    if-eqz p1, :cond_0

    iget p1, v0, Landroid/app/Notification;->flags:I

    or-int/lit8 p1, p1, 0x1

    iput p1, v0, Landroid/app/Notification;->flags:I

    :cond_0
    return-object p0
.end method

.method public n(Landroid/app/PendingIntent;)Lk2/k$f;
    .locals 1

    iget-object v0, p0, Lk2/k$f;->T:Landroid/app/Notification;

    iput-object p1, v0, Landroid/app/Notification;->deleteIntent:Landroid/app/PendingIntent;

    return-object p0
.end method

.method public final o(IZ)V
    .locals 1

    if-eqz p2, :cond_0

    iget-object p2, p0, Lk2/k$f;->T:Landroid/app/Notification;

    iget v0, p2, Landroid/app/Notification;->flags:I

    or-int/2addr p1, v0

    iput p1, p2, Landroid/app/Notification;->flags:I

    return-void

    :cond_0
    iget-object p2, p0, Lk2/k$f;->T:Landroid/app/Notification;

    iget v0, p2, Landroid/app/Notification;->flags:I

    not-int p1, p1

    and-int/2addr p1, v0

    iput p1, p2, Landroid/app/Notification;->flags:I

    return-void
.end method

.method public p(Landroid/app/PendingIntent;Z)Lk2/k$f;
    .locals 0

    iput-object p1, p0, Lk2/k$f;->i:Landroid/app/PendingIntent;

    const/16 p1, 0x80

    invoke-virtual {p0, p1, p2}, Lk2/k$f;->o(IZ)V

    return-object p0
.end method

.method public q(Ljava/lang/String;)Lk2/k$f;
    .locals 0

    iput-object p1, p0, Lk2/k$f;->x:Ljava/lang/String;

    return-object p0
.end method

.method public r(Z)Lk2/k$f;
    .locals 0

    iput-boolean p1, p0, Lk2/k$f;->y:Z

    return-object p0
.end method

.method public s(Landroid/graphics/Bitmap;)Lk2/k$f;
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lk2/k$f;->a:Landroid/content/Context;

    invoke-static {v0, p1}, Lk2/k;->d(Landroid/content/Context;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object p1

    invoke-static {p1}, Landroidx/core/graphics/drawable/IconCompat;->c(Landroid/graphics/Bitmap;)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lk2/k$f;->k:Landroidx/core/graphics/drawable/IconCompat;

    return-object p0
.end method

.method public t(III)Lk2/k$f;
    .locals 1

    iget-object v0, p0, Lk2/k$f;->T:Landroid/app/Notification;

    iput p1, v0, Landroid/app/Notification;->ledARGB:I

    iput p2, v0, Landroid/app/Notification;->ledOnMS:I

    iput p3, v0, Landroid/app/Notification;->ledOffMS:I

    if-eqz p2, :cond_0

    if-eqz p3, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iget p2, v0, Landroid/app/Notification;->flags:I

    and-int/lit8 p2, p2, -0x2

    or-int/2addr p1, p2

    iput p1, v0, Landroid/app/Notification;->flags:I

    return-object p0
.end method

.method public u(Z)Lk2/k$f;
    .locals 0

    iput-boolean p1, p0, Lk2/k$f;->A:Z

    return-object p0
.end method

.method public v(I)Lk2/k$f;
    .locals 0

    iput p1, p0, Lk2/k$f;->m:I

    return-object p0
.end method

.method public w(Z)Lk2/k$f;
    .locals 1

    const/4 v0, 0x2

    invoke-virtual {p0, v0, p1}, Lk2/k$f;->o(IZ)V

    return-object p0
.end method

.method public x(I)Lk2/k$f;
    .locals 0

    iput p1, p0, Lk2/k$f;->n:I

    return-object p0
.end method

.method public y(Z)Lk2/k$f;
    .locals 0

    iput-boolean p1, p0, Lk2/k$f;->o:Z

    return-object p0
.end method

.method public z(I)Lk2/k$f;
    .locals 1

    iget-object v0, p0, Lk2/k$f;->T:Landroid/app/Notification;

    iput p1, v0, Landroid/app/Notification;->icon:I

    return-object p0
.end method
