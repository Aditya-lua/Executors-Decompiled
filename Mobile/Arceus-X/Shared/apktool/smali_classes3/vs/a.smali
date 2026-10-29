.class public Lvs/a;
.super Lus/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvs/a$p;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lvs/a$p;",
            ">;"
        }
    .end annotation
.end field

.field public b:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lus/a;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lvs/a;->a:Ljava/util/List;

    return-void
.end method

.method public static A(Lus/m$b;)V
    .locals 2
    .param p0    # Lus/m$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lvs/a$o;

    invoke-direct {v0}, Lvs/a$o;-><init>()V

    const-class v1, Lqn/r;

    invoke-interface {p0, v1, v0}, Lus/m$b;->a(Ljava/lang/Class;Lus/m$c;)Lus/m$b;

    return-void
.end method

.method public static B(Lqn/s;)I
    .locals 2
    .param p0    # Lqn/s;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p0}, Lqn/s;->g()Lqn/s;

    move-result-object p0

    const/4 v0, 0x0

    :goto_0
    if-eqz p0, :cond_1

    instance-of v1, p0, Lqn/r;

    if-eqz v1, :cond_0

    add-int/lit8 v0, v0, 0x1

    :cond_0
    invoke-virtual {p0}, Lqn/s;->g()Lqn/s;

    move-result-object p0

    goto :goto_0

    :cond_1
    return v0
.end method

.method public static C(Lus/m$b;)V
    .locals 2
    .param p0    # Lus/m$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lvs/d;

    invoke-direct {v0}, Lvs/d;-><init>()V

    const-class v1, Lqn/v;

    invoke-interface {p0, v1, v0}, Lus/m$b;->a(Ljava/lang/Class;Lus/m$c;)Lus/m$b;

    return-void
.end method

.method public static D(Lus/m$b;)V
    .locals 2
    .param p0    # Lus/m$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lvs/a$e;

    invoke-direct {v0}, Lvs/a$e;-><init>()V

    const-class v1, Lqn/w;

    invoke-interface {p0, v1, v0}, Lus/m$b;->a(Ljava/lang/Class;Lus/m$c;)Lus/m$b;

    return-void
.end method

.method public static E(Lus/m$b;)V
    .locals 2
    .param p0    # Lus/m$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lvs/a$c;

    invoke-direct {v0}, Lvs/a$c;-><init>()V

    const-class v1, Lqn/x;

    invoke-interface {p0, v1, v0}, Lus/m$b;->a(Ljava/lang/Class;Lus/m$c;)Lus/m$b;

    return-void
.end method

.method public static F(Lus/m$b;)V
    .locals 2
    .param p0    # Lus/m$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lvs/a$h;

    invoke-direct {v0}, Lvs/a$h;-><init>()V

    const-class v1, Lqn/a0;

    invoke-interface {p0, v1, v0}, Lus/m$b;->a(Ljava/lang/Class;Lus/m$c;)Lus/m$b;

    return-void
.end method

.method public static H(Lus/m$b;)V
    .locals 2
    .param p0    # Lus/m$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lvs/a$a;

    invoke-direct {v0}, Lvs/a$a;-><init>()V

    const-class v1, Lqn/c0;

    invoke-interface {p0, v1, v0}, Lus/m$b;->a(Ljava/lang/Class;Lus/m$c;)Lus/m$b;

    return-void
.end method

.method public static I(Lus/m;Ljava/lang/String;Ljava/lang/String;Lqn/s;)V
    .locals 4
    .param p0    # Lus/m;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lqn/s;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-interface {p0, p3}, Lus/m;->t(Lqn/s;)V

    invoke-interface {p0}, Lus/m;->length()I

    move-result v0

    invoke-interface {p0}, Lus/m;->builder()Lus/u;

    move-result-object v1

    const/16 v2, 0xa0

    invoke-virtual {v1, v2}, Lus/u;->a(C)Lus/u;

    move-result-object v1

    const/16 v3, 0xa

    invoke-virtual {v1, v3}, Lus/u;->a(C)Lus/u;

    move-result-object v1

    invoke-interface {p0}, Lus/m;->w()Lus/g;

    move-result-object v3

    invoke-virtual {v3}, Lus/g;->d()Lat/a;

    move-result-object v3

    invoke-interface {v3, p1, p2}, Lat/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object p2

    invoke-virtual {v1, p2}, Lus/u;->b(Ljava/lang/CharSequence;)Lus/u;

    invoke-interface {p0}, Lus/m;->B()V

    invoke-interface {p0}, Lus/m;->builder()Lus/u;

    move-result-object p2

    invoke-virtual {p2, v2}, Lus/u;->a(C)Lus/u;

    sget-object p2, Lvs/b;->g:Lus/p;

    invoke-interface {p0}, Lus/m;->o()Lus/r;

    move-result-object v1

    invoke-virtual {p2, v1, p1}, Lus/p;->d(Lus/r;Ljava/lang/Object;)V

    invoke-interface {p0, p3, v0}, Lus/m;->k(Lqn/s;I)V

    invoke-interface {p0, p3}, Lus/m;->D(Lqn/s;)V

    return-void
.end method

.method public static bridge synthetic l(Lvs/a;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lvs/a;->a:Ljava/util/List;

    return-object p0
.end method

.method public static bridge synthetic m(Lqn/w;)Z
    .locals 0

    invoke-static {p0}, Lvs/a;->y(Lqn/w;)Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic n(Lqn/s;)I
    .locals 0

    invoke-static {p0}, Lvs/a;->B(Lqn/s;)I

    move-result p0

    return p0
.end method

.method public static o(Lus/m$b;)V
    .locals 2
    .param p0    # Lus/m$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lvs/a$j;

    invoke-direct {v0}, Lvs/a$j;-><init>()V

    const-class v1, Lqn/b;

    invoke-interface {p0, v1, v0}, Lus/m$b;->a(Ljava/lang/Class;Lus/m$c;)Lus/m$b;

    return-void
.end method

.method public static p(Lus/m$b;)V
    .locals 2
    .param p0    # Lus/m$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lvs/d;

    invoke-direct {v0}, Lvs/d;-><init>()V

    const-class v1, Lqn/c;

    invoke-interface {p0, v1, v0}, Lus/m$b;->a(Ljava/lang/Class;Lus/m$c;)Lus/m$b;

    return-void
.end method

.method public static q(Lus/m$b;)V
    .locals 2
    .param p0    # Lus/m$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lvs/a$k;

    invoke-direct {v0}, Lvs/a$k;-><init>()V

    const-class v1, Lqn/d;

    invoke-interface {p0, v1, v0}, Lus/m$b;->a(Ljava/lang/Class;Lus/m$c;)Lus/m$b;

    return-void
.end method

.method public static r()Lvs/a;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lvs/a;

    invoke-direct {v0}, Lvs/a;-><init>()V

    return-object v0
.end method

.method public static s(Lus/m$b;)V
    .locals 2
    .param p0    # Lus/m$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lvs/a$i;

    invoke-direct {v0}, Lvs/a$i;-><init>()V

    const-class v1, Lqn/g;

    invoke-interface {p0, v1, v0}, Lus/m$b;->a(Ljava/lang/Class;Lus/m$c;)Lus/m$b;

    return-void
.end method

.method public static t(Lus/m$b;)V
    .locals 2
    .param p0    # Lus/m$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lvs/a$l;

    invoke-direct {v0}, Lvs/a$l;-><init>()V

    const-class v1, Lqn/h;

    invoke-interface {p0, v1, v0}, Lus/m$b;->a(Ljava/lang/Class;Lus/m$c;)Lus/m$b;

    return-void
.end method

.method public static u(Lus/m$b;)V
    .locals 2
    .param p0    # Lus/m$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lvs/a$d;

    invoke-direct {v0}, Lvs/a$d;-><init>()V

    const-class v1, Lqn/i;

    invoke-interface {p0, v1, v0}, Lus/m$b;->a(Ljava/lang/Class;Lus/m$c;)Lus/m$b;

    return-void
.end method

.method public static v(Lus/m$b;)V
    .locals 2
    .param p0    # Lus/m$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lvs/a$b;

    invoke-direct {v0}, Lvs/a$b;-><init>()V

    const-class v1, Lqn/j;

    invoke-interface {p0, v1, v0}, Lus/m$b;->a(Ljava/lang/Class;Lus/m$c;)Lus/m$b;

    return-void
.end method

.method public static w(Lus/m$b;)V
    .locals 2

    new-instance v0, Lvs/a$n;

    invoke-direct {v0}, Lvs/a$n;-><init>()V

    const-class v1, Lqn/m;

    invoke-interface {p0, v1, v0}, Lus/m$b;->a(Ljava/lang/Class;Lus/m$c;)Lus/m$b;

    return-void
.end method

.method public static x(Lus/m$b;)V
    .locals 2
    .param p0    # Lus/m$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lvs/a$m;

    invoke-direct {v0}, Lvs/a$m;-><init>()V

    const-class v1, Lqn/n;

    invoke-interface {p0, v1, v0}, Lus/m$b;->a(Ljava/lang/Class;Lus/m$c;)Lus/m$b;

    return-void
.end method

.method public static y(Lqn/w;)Z
    .locals 1
    .param p0    # Lqn/w;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p0}, Lqn/a;->o()Lqn/a;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lqn/s;->g()Lqn/s;

    move-result-object p0

    instance-of v0, p0, Lqn/q;

    if-eqz v0, :cond_0

    check-cast p0, Lqn/q;

    invoke-virtual {p0}, Lqn/q;->p()Z

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static z(Lus/m$b;)V
    .locals 2
    .param p0    # Lus/m$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lvs/a$f;

    invoke-direct {v0}, Lvs/a$f;-><init>()V

    const-class v1, Lqn/o;

    invoke-interface {p0, v1, v0}, Lus/m$b;->a(Ljava/lang/Class;Lus/m$c;)Lus/m$b;

    return-void
.end method


# virtual methods
.method public final G(Lus/m$b;)V
    .locals 2
    .param p1    # Lus/m$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lvs/a$g;

    invoke-direct {v0, p0}, Lvs/a$g;-><init>(Lvs/a;)V

    const-class v1, Lqn/b0;

    invoke-interface {p1, v1, v0}, Lus/m$b;->a(Ljava/lang/Class;Lus/m$c;)Lus/m$b;

    return-void
.end method

.method public b(Landroid/widget/TextView;)V
    .locals 1
    .param p1    # Landroid/widget/TextView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-boolean v0, p0, Lvs/a;->b:Z

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/widget/TextView;->getMovementMethod()Landroid/text/method/MovementMethod;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    :cond_0
    return-void
.end method

.method public f(Lus/m$b;)V
    .locals 0
    .param p1    # Lus/m$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p0, p1}, Lvs/a;->G(Lus/m$b;)V

    invoke-static {p1}, Lvs/a;->F(Lus/m$b;)V

    invoke-static {p1}, Lvs/a;->s(Lus/m$b;)V

    invoke-static {p1}, Lvs/a;->o(Lus/m$b;)V

    invoke-static {p1}, Lvs/a;->q(Lus/m$b;)V

    invoke-static {p1}, Lvs/a;->t(Lus/m$b;)V

    invoke-static {p1}, Lvs/a;->x(Lus/m$b;)V

    invoke-static {p1}, Lvs/a;->w(Lus/m$b;)V

    invoke-static {p1}, Lvs/a;->p(Lus/m$b;)V

    invoke-static {p1}, Lvs/a;->C(Lus/m$b;)V

    invoke-static {p1}, Lvs/a;->A(Lus/m$b;)V

    invoke-static {p1}, Lvs/a;->H(Lus/m$b;)V

    invoke-static {p1}, Lvs/a;->v(Lus/m$b;)V

    invoke-static {p1}, Lvs/a;->E(Lus/m$b;)V

    invoke-static {p1}, Lvs/a;->u(Lus/m$b;)V

    invoke-static {p1}, Lvs/a;->D(Lus/m$b;)V

    invoke-static {p1}, Lvs/a;->z(Lus/m$b;)V

    return-void
.end method

.method public g(Lus/k$a;)V
    .locals 3
    .param p1    # Lus/k$a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lws/b;

    invoke-direct {v0}, Lws/b;-><init>()V

    new-instance v1, Lws/h;

    invoke-direct {v1}, Lws/h;-><init>()V

    const-class v2, Lqn/a0;

    invoke-interface {p1, v2, v1}, Lus/k$a;->a(Ljava/lang/Class;Lus/t;)Lus/k$a;

    move-result-object p1

    new-instance v1, Lws/d;

    invoke-direct {v1}, Lws/d;-><init>()V

    const-class v2, Lqn/g;

    invoke-interface {p1, v2, v1}, Lus/k$a;->a(Ljava/lang/Class;Lus/t;)Lus/k$a;

    move-result-object p1

    new-instance v1, Lws/a;

    invoke-direct {v1}, Lws/a;-><init>()V

    const-class v2, Lqn/b;

    invoke-interface {p1, v2, v1}, Lus/k$a;->a(Ljava/lang/Class;Lus/t;)Lus/k$a;

    move-result-object p1

    new-instance v1, Lws/c;

    invoke-direct {v1}, Lws/c;-><init>()V

    const-class v2, Lqn/d;

    invoke-interface {p1, v2, v1}, Lus/k$a;->a(Ljava/lang/Class;Lus/t;)Lus/k$a;

    move-result-object p1

    const-class v1, Lqn/h;

    invoke-interface {p1, v1, v0}, Lus/k$a;->a(Ljava/lang/Class;Lus/t;)Lus/k$a;

    move-result-object p1

    const-class v1, Lqn/n;

    invoke-interface {p1, v1, v0}, Lus/k$a;->a(Ljava/lang/Class;Lus/t;)Lus/k$a;

    move-result-object p1

    new-instance v0, Lws/g;

    invoke-direct {v0}, Lws/g;-><init>()V

    const-class v1, Lqn/r;

    invoke-interface {p1, v1, v0}, Lus/k$a;->a(Ljava/lang/Class;Lus/t;)Lus/k$a;

    move-result-object p1

    new-instance v0, Lws/e;

    invoke-direct {v0}, Lws/e;-><init>()V

    const-class v1, Lqn/j;

    invoke-interface {p1, v1, v0}, Lus/k$a;->a(Ljava/lang/Class;Lus/t;)Lus/k$a;

    move-result-object p1

    new-instance v0, Lws/f;

    invoke-direct {v0}, Lws/f;-><init>()V

    const-class v1, Lqn/o;

    invoke-interface {p1, v1, v0}, Lus/k$a;->a(Ljava/lang/Class;Lus/t;)Lus/k$a;

    move-result-object p1

    new-instance v0, Lws/i;

    invoke-direct {v0}, Lws/i;-><init>()V

    const-class v1, Lqn/c0;

    invoke-interface {p1, v1, v0}, Lus/k$a;->a(Ljava/lang/Class;Lus/t;)Lus/k$a;

    return-void
.end method

.method public j(Landroid/widget/TextView;Landroid/text/Spanned;)V
    .locals 1
    .param p1    # Landroid/widget/TextView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/text/Spanned;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p1, p2}, Lxs/h;->a(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    instance-of v0, p2, Landroid/text/Spannable;

    if-eqz v0, :cond_0

    check-cast p2, Landroid/text/Spannable;

    invoke-static {p2, p1}, Lxs/j;->a(Landroid/text/Spannable;Landroid/widget/TextView;)V

    :cond_0
    return-void
.end method
