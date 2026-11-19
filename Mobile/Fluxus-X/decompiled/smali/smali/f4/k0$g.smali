.class public Lf4/k0$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf4/k0;->t1(Ljava/lang/String;Landroidx/lifecycle/s;Lf4/p0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lf4/p0;

.field public final synthetic c:Landroidx/lifecycle/l;

.field public final synthetic d:Lf4/k0;


# direct methods
.method public constructor <init>(Lf4/k0;Ljava/lang/String;Lf4/p0;Landroidx/lifecycle/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lf4/k0$g;->d:Lf4/k0;

    iput-object p2, p0, Lf4/k0$g;->a:Ljava/lang/String;

    iput-object p3, p0, Lf4/k0$g;->b:Lf4/p0;

    iput-object p4, p0, Lf4/k0$g;->c:Landroidx/lifecycle/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public g(Landroidx/lifecycle/s;Landroidx/lifecycle/l$a;)V
    .locals 2
    .param p1    # Landroidx/lifecycle/s;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroidx/lifecycle/l$a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    sget-object p1, Landroidx/lifecycle/l$a;->ON_START:Landroidx/lifecycle/l$a;

    if-ne p2, p1, :cond_0

    iget-object p1, p0, Lf4/k0$g;->d:Lf4/k0;

    invoke-static {p1}, Lf4/k0;->h(Lf4/k0;)Ljava/util/Map;

    move-result-object p1

    iget-object v0, p0, Lf4/k0$g;->a:Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/Bundle;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lf4/k0$g;->b:Lf4/p0;

    iget-object v1, p0, Lf4/k0$g;->a:Ljava/lang/String;

    invoke-interface {v0, v1, p1}, Lf4/p0;->a(Ljava/lang/String;Landroid/os/Bundle;)V

    iget-object p1, p0, Lf4/k0$g;->d:Lf4/k0;

    iget-object v0, p0, Lf4/k0$g;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lf4/k0;->x(Ljava/lang/String;)V

    :cond_0
    sget-object p1, Landroidx/lifecycle/l$a;->ON_DESTROY:Landroidx/lifecycle/l$a;

    if-ne p2, p1, :cond_1

    iget-object p1, p0, Lf4/k0$g;->c:Landroidx/lifecycle/l;

    invoke-virtual {p1, p0}, Landroidx/lifecycle/l;->d(Landroidx/lifecycle/r;)V

    iget-object p1, p0, Lf4/k0$g;->d:Lf4/k0;

    invoke-static {p1}, Lf4/k0;->i(Lf4/k0;)Ljava/util/Map;

    move-result-object p1

    iget-object p2, p0, Lf4/k0$g;->a:Ljava/lang/String;

    invoke-interface {p1, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method
