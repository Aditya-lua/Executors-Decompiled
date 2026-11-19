.class public Lmt/a;
.super Llt/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmt/a$p;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lmt/a$p;",
            ">;"
        }
    .end annotation
.end field

.field public b:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Llt/a;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lmt/a;->a:Ljava/util/List;

    return-void
.end method

.method public static A(Llt/m$b;)V
    .locals 2
    .param p0    # Llt/m$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lmt/a$o;

    invoke-direct {v0}, Lmt/a$o;-><init>()V

    const-class v1, Leo/r;

    invoke-interface {p0, v1, v0}, Llt/m$b;->b(Ljava/lang/Class;Llt/m$c;)Llt/m$b;

    return-void
.end method

.method public static B(Leo/s;)I
    .locals 2
    .param p0    # Leo/s;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p0}, Leo/s;->g()Leo/s;

    move-result-object p0

    const/4 v0, 0x0

    :goto_0
    if-eqz p0, :cond_1

    instance-of v1, p0, Leo/r;

    if-eqz v1, :cond_0

    add-int/lit8 v0, v0, 0x1

    :cond_0
    invoke-virtual {p0}, Leo/s;->g()Leo/s;

    move-result-object p0

    goto :goto_0

    :cond_1
    return v0
.end method

.method public static C(Llt/m$b;)V
    .locals 2
    .param p0    # Llt/m$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lmt/d;

    invoke-direct {v0}, Lmt/d;-><init>()V

    const-class v1, Leo/v;

    invoke-interface {p0, v1, v0}, Llt/m$b;->b(Ljava/lang/Class;Llt/m$c;)Llt/m$b;

    return-void
.end method

.method public static D(Llt/m$b;)V
    .locals 2
    .param p0    # Llt/m$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lmt/a$e;

    invoke-direct {v0}, Lmt/a$e;-><init>()V

    const-class v1, Leo/w;

    invoke-interface {p0, v1, v0}, Llt/m$b;->b(Ljava/lang/Class;Llt/m$c;)Llt/m$b;

    return-void
.end method

.method public static E(Llt/m$b;)V
    .locals 2
    .param p0    # Llt/m$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lmt/a$c;

    invoke-direct {v0}, Lmt/a$c;-><init>()V

    const-class v1, Leo/x;

    invoke-interface {p0, v1, v0}, Llt/m$b;->b(Ljava/lang/Class;Llt/m$c;)Llt/m$b;

    return-void
.end method

.method public static F(Llt/m$b;)V
    .locals 2
    .param p0    # Llt/m$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lmt/a$h;

    invoke-direct {v0}, Lmt/a$h;-><init>()V

    const-class v1, Leo/a0;

    invoke-interface {p0, v1, v0}, Llt/m$b;->b(Ljava/lang/Class;Llt/m$c;)Llt/m$b;

    return-void
.end method

.method public static H(Llt/m$b;)V
    .locals 2
    .param p0    # Llt/m$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lmt/a$a;

    invoke-direct {v0}, Lmt/a$a;-><init>()V

    const-class v1, Leo/c0;

    invoke-interface {p0, v1, v0}, Llt/m$b;->b(Ljava/lang/Class;Llt/m$c;)Llt/m$b;

    return-void
.end method

.method public static I(Llt/m;Ljava/lang/String;Ljava/lang/String;Leo/s;)V
    .locals 4
    .param p0    # Llt/m;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Leo/s;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-interface {p0, p3}, Llt/m;->s(Leo/s;)V

    invoke-interface {p0}, Llt/m;->length()I

    move-result v0

    invoke-interface {p0}, Llt/m;->builder()Llt/u;

    move-result-object v1

    const/16 v2, 0xa0

    invoke-virtual {v1, v2}, Llt/u;->a(C)Llt/u;

    move-result-object v1

    const/16 v3, 0xa

    invoke-virtual {v1, v3}, Llt/u;->a(C)Llt/u;

    move-result-object v1

    invoke-interface {p0}, Llt/m;->u()Llt/g;

    move-result-object v3

    invoke-virtual {v3}, Llt/g;->d()Lrt/a;

    move-result-object v3

    invoke-interface {v3, p1, p2}, Lrt/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object p2

    invoke-virtual {v1, p2}, Llt/u;->b(Ljava/lang/CharSequence;)Llt/u;

    invoke-interface {p0}, Llt/m;->y()V

    invoke-interface {p0}, Llt/m;->builder()Llt/u;

    move-result-object p2

    invoke-virtual {p2, v2}, Llt/u;->a(C)Llt/u;

    sget-object p2, Lmt/b;->g:Llt/p;

    invoke-interface {p0}, Llt/m;->k()Llt/r;

    move-result-object v1

    invoke-virtual {p2, v1, p1}, Llt/p;->d(Llt/r;Ljava/lang/Object;)V

    invoke-interface {p0, p3, v0}, Llt/m;->i(Leo/s;I)V

    invoke-interface {p0, p3}, Llt/m;->n(Leo/s;)V

    return-void
.end method

.method public static bridge synthetic l(Lmt/a;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lmt/a;->a:Ljava/util/List;

    return-object p0
.end method

.method public static bridge synthetic m(Leo/w;)Z
    .locals 0

    invoke-static {p0}, Lmt/a;->y(Leo/w;)Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic n(Leo/s;)I
    .locals 0

    invoke-static {p0}, Lmt/a;->B(Leo/s;)I

    move-result p0

    return p0
.end method

.method public static o(Llt/m$b;)V
    .locals 2
    .param p0    # Llt/m$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lmt/a$j;

    invoke-direct {v0}, Lmt/a$j;-><init>()V

    const-class v1, Leo/b;

    invoke-interface {p0, v1, v0}, Llt/m$b;->b(Ljava/lang/Class;Llt/m$c;)Llt/m$b;

    return-void
.end method

.method public static p(Llt/m$b;)V
    .locals 2
    .param p0    # Llt/m$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lmt/d;

    invoke-direct {v0}, Lmt/d;-><init>()V

    const-class v1, Leo/c;

    invoke-interface {p0, v1, v0}, Llt/m$b;->b(Ljava/lang/Class;Llt/m$c;)Llt/m$b;

    return-void
.end method

.method public static q(Llt/m$b;)V
    .locals 2
    .param p0    # Llt/m$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lmt/a$k;

    invoke-direct {v0}, Lmt/a$k;-><init>()V

    const-class v1, Leo/d;

    invoke-interface {p0, v1, v0}, Llt/m$b;->b(Ljava/lang/Class;Llt/m$c;)Llt/m$b;

    return-void
.end method

.method public static r()Lmt/a;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lmt/a;

    invoke-direct {v0}, Lmt/a;-><init>()V

    return-object v0
.end method

.method public static s(Llt/m$b;)V
    .locals 2
    .param p0    # Llt/m$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lmt/a$i;

    invoke-direct {v0}, Lmt/a$i;-><init>()V

    const-class v1, Leo/g;

    invoke-interface {p0, v1, v0}, Llt/m$b;->b(Ljava/lang/Class;Llt/m$c;)Llt/m$b;

    return-void
.end method

.method public static t(Llt/m$b;)V
    .locals 2
    .param p0    # Llt/m$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lmt/a$l;

    invoke-direct {v0}, Lmt/a$l;-><init>()V

    const-class v1, Leo/h;

    invoke-interface {p0, v1, v0}, Llt/m$b;->b(Ljava/lang/Class;Llt/m$c;)Llt/m$b;

    return-void
.end method

.method public static u(Llt/m$b;)V
    .locals 2
    .param p0    # Llt/m$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lmt/a$d;

    invoke-direct {v0}, Lmt/a$d;-><init>()V

    const-class v1, Leo/i;

    invoke-interface {p0, v1, v0}, Llt/m$b;->b(Ljava/lang/Class;Llt/m$c;)Llt/m$b;

    return-void
.end method

.method public static v(Llt/m$b;)V
    .locals 2
    .param p0    # Llt/m$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lmt/a$b;

    invoke-direct {v0}, Lmt/a$b;-><init>()V

    const-class v1, Leo/j;

    invoke-interface {p0, v1, v0}, Llt/m$b;->b(Ljava/lang/Class;Llt/m$c;)Llt/m$b;

    return-void
.end method

.method public static w(Llt/m$b;)V
    .locals 2

    new-instance v0, Lmt/a$n;

    invoke-direct {v0}, Lmt/a$n;-><init>()V

    const-class v1, Leo/m;

    invoke-interface {p0, v1, v0}, Llt/m$b;->b(Ljava/lang/Class;Llt/m$c;)Llt/m$b;

    return-void
.end method

.method public static x(Llt/m$b;)V
    .locals 2
    .param p0    # Llt/m$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lmt/a$m;

    invoke-direct {v0}, Lmt/a$m;-><init>()V

    const-class v1, Leo/n;

    invoke-interface {p0, v1, v0}, Llt/m$b;->b(Ljava/lang/Class;Llt/m$c;)Llt/m$b;

    return-void
.end method

.method public static y(Leo/w;)Z
    .locals 1
    .param p0    # Leo/w;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p0}, Leo/a;->o()Leo/a;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Leo/s;->g()Leo/s;

    move-result-object p0

    instance-of v0, p0, Leo/q;

    if-eqz v0, :cond_0

    check-cast p0, Leo/q;

    invoke-virtual {p0}, Leo/q;->p()Z

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static z(Llt/m$b;)V
    .locals 2
    .param p0    # Llt/m$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lmt/a$f;

    invoke-direct {v0}, Lmt/a$f;-><init>()V

    const-class v1, Leo/o;

    invoke-interface {p0, v1, v0}, Llt/m$b;->b(Ljava/lang/Class;Llt/m$c;)Llt/m$b;

    return-void
.end method


# virtual methods
.method public final G(Llt/m$b;)V
    .locals 2
    .param p1    # Llt/m$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lmt/a$g;

    invoke-direct {v0, p0}, Lmt/a$g;-><init>(Lmt/a;)V

    const-class v1, Leo/b0;

    invoke-interface {p1, v1, v0}, Llt/m$b;->b(Ljava/lang/Class;Llt/m$c;)Llt/m$b;

    return-void
.end method

.method public b(Llt/k$a;)V
    .locals 3
    .param p1    # Llt/k$a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lnt/b;

    invoke-direct {v0}, Lnt/b;-><init>()V

    new-instance v1, Lnt/h;

    invoke-direct {v1}, Lnt/h;-><init>()V

    const-class v2, Leo/a0;

    invoke-interface {p1, v2, v1}, Llt/k$a;->a(Ljava/lang/Class;Llt/t;)Llt/k$a;

    move-result-object p1

    new-instance v1, Lnt/d;

    invoke-direct {v1}, Lnt/d;-><init>()V

    const-class v2, Leo/g;

    invoke-interface {p1, v2, v1}, Llt/k$a;->a(Ljava/lang/Class;Llt/t;)Llt/k$a;

    move-result-object p1

    new-instance v1, Lnt/a;

    invoke-direct {v1}, Lnt/a;-><init>()V

    const-class v2, Leo/b;

    invoke-interface {p1, v2, v1}, Llt/k$a;->a(Ljava/lang/Class;Llt/t;)Llt/k$a;

    move-result-object p1

    new-instance v1, Lnt/c;

    invoke-direct {v1}, Lnt/c;-><init>()V

    const-class v2, Leo/d;

    invoke-interface {p1, v2, v1}, Llt/k$a;->a(Ljava/lang/Class;Llt/t;)Llt/k$a;

    move-result-object p1

    const-class v1, Leo/h;

    invoke-interface {p1, v1, v0}, Llt/k$a;->a(Ljava/lang/Class;Llt/t;)Llt/k$a;

    move-result-object p1

    const-class v1, Leo/n;

    invoke-interface {p1, v1, v0}, Llt/k$a;->a(Ljava/lang/Class;Llt/t;)Llt/k$a;

    move-result-object p1

    new-instance v0, Lnt/g;

    invoke-direct {v0}, Lnt/g;-><init>()V

    const-class v1, Leo/r;

    invoke-interface {p1, v1, v0}, Llt/k$a;->a(Ljava/lang/Class;Llt/t;)Llt/k$a;

    move-result-object p1

    new-instance v0, Lnt/e;

    invoke-direct {v0}, Lnt/e;-><init>()V

    const-class v1, Leo/j;

    invoke-interface {p1, v1, v0}, Llt/k$a;->a(Ljava/lang/Class;Llt/t;)Llt/k$a;

    move-result-object p1

    new-instance v0, Lnt/f;

    invoke-direct {v0}, Lnt/f;-><init>()V

    const-class v1, Leo/o;

    invoke-interface {p1, v1, v0}, Llt/k$a;->a(Ljava/lang/Class;Llt/t;)Llt/k$a;

    move-result-object p1

    new-instance v0, Lnt/i;

    invoke-direct {v0}, Lnt/i;-><init>()V

    const-class v1, Leo/c0;

    invoke-interface {p1, v1, v0}, Llt/k$a;->a(Ljava/lang/Class;Llt/t;)Llt/k$a;

    return-void
.end method

.method public c(Landroid/widget/TextView;)V
    .locals 1
    .param p1    # Landroid/widget/TextView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-boolean v0, p0, Lmt/a;->b:Z

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

.method public g(Llt/m$b;)V
    .locals 0
    .param p1    # Llt/m$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p0, p1}, Lmt/a;->G(Llt/m$b;)V

    invoke-static {p1}, Lmt/a;->F(Llt/m$b;)V

    invoke-static {p1}, Lmt/a;->s(Llt/m$b;)V

    invoke-static {p1}, Lmt/a;->o(Llt/m$b;)V

    invoke-static {p1}, Lmt/a;->q(Llt/m$b;)V

    invoke-static {p1}, Lmt/a;->t(Llt/m$b;)V

    invoke-static {p1}, Lmt/a;->x(Llt/m$b;)V

    invoke-static {p1}, Lmt/a;->w(Llt/m$b;)V

    invoke-static {p1}, Lmt/a;->p(Llt/m$b;)V

    invoke-static {p1}, Lmt/a;->C(Llt/m$b;)V

    invoke-static {p1}, Lmt/a;->A(Llt/m$b;)V

    invoke-static {p1}, Lmt/a;->H(Llt/m$b;)V

    invoke-static {p1}, Lmt/a;->v(Llt/m$b;)V

    invoke-static {p1}, Lmt/a;->E(Llt/m$b;)V

    invoke-static {p1}, Lmt/a;->u(Llt/m$b;)V

    invoke-static {p1}, Lmt/a;->D(Llt/m$b;)V

    invoke-static {p1}, Lmt/a;->z(Llt/m$b;)V

    return-void
.end method

.method public k(Landroid/widget/TextView;Landroid/text/Spanned;)V
    .locals 1
    .param p1    # Landroid/widget/TextView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/text/Spanned;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p1, p2}, Lot/i;->a(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    instance-of v0, p2, Landroid/text/Spannable;

    if-eqz v0, :cond_0

    check-cast p2, Landroid/text/Spannable;

    invoke-static {p2, p1}, Lot/k;->a(Landroid/text/Spannable;Landroid/widget/TextView;)V

    :cond_0
    return-void
.end method
