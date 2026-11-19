.class public Ld0/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld0/h$a;
    }
.end annotation


# instance fields
.field public final a:Landroidx/camera/camera2/internal/compat/quirk/CaptureSessionOnClosedNotCalledQuirk;


# direct methods
.method public constructor <init>(Ln0/k3;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-class v0, Landroidx/camera/camera2/internal/compat/quirk/CaptureSessionOnClosedNotCalledQuirk;

    invoke-virtual {p1, v0}, Ln0/k3;->b(Ljava/lang/Class;)Ln0/g3;

    move-result-object p1

    check-cast p1, Landroidx/camera/camera2/internal/compat/quirk/CaptureSessionOnClosedNotCalledQuirk;

    iput-object p1, p0, Ld0/h;->a:Landroidx/camera/camera2/internal/compat/quirk/CaptureSessionOnClosedNotCalledQuirk;

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Set;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lz/h5;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz/h5;

    invoke-interface {v0}, Lz/h5;->b()Lz/h5$c;

    move-result-object v1

    invoke-virtual {v1, v0}, Lz/h5$c;->r(Lz/h5;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final b(Ljava/util/Set;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lz/h5;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz/h5;

    invoke-interface {v0}, Lz/h5;->b()Lz/h5$c;

    move-result-object v1

    invoke-virtual {v1, v0}, Lz/h5$c;->s(Lz/h5;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public c(Lz/h5;Ljava/util/List;Ljava/util/List;Ld0/h$a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lz/h5;",
            "Ljava/util/List<",
            "Lz/h5;",
            ">;",
            "Ljava/util/List<",
            "Lz/h5;",
            ">;",
            "Ld0/h$a;",
            ")V"
        }
    .end annotation

    invoke-virtual {p0}, Ld0/h;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lz/h5;

    if-ne v1, p1, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    :goto_1
    invoke-virtual {p0, v0}, Ld0/h;->b(Ljava/util/Set;)V

    :cond_2
    invoke-interface {p4, p1}, Ld0/h$a;->a(Lz/h5;)V

    invoke-virtual {p0}, Ld0/h;->d()Z

    move-result p2

    if-eqz p2, :cond_5

    new-instance p2, Ljava/util/LinkedHashSet;

    invoke-direct {p2}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_2
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_4

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lz/h5;

    if-ne p4, p1, :cond_3

    goto :goto_3

    :cond_3
    invoke-interface {p2, p4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    :goto_3
    invoke-virtual {p0, p2}, Ld0/h;->a(Ljava/util/Set;)V

    :cond_5
    return-void
.end method

.method public d()Z
    .locals 1

    iget-object v0, p0, Ld0/h;->a:Landroidx/camera/camera2/internal/compat/quirk/CaptureSessionOnClosedNotCalledQuirk;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
