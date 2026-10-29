.class public final Lj0/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj0/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj0/c$a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u0005*\u0006\u0012\u0002\u0008\u00030\u0008H\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\u000c\u001a\u0004\u0018\u00010\u000b*\u00020\u0004H\u0000\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u000f*\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u000f*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u000f*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\u000f*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0013J\u0013\u0010\u0016\u001a\u00020\u000f*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0013\u00a8\u0006\u0017"
    }
    d2 = {
        "Lj0/c$a;",
        "",
        "<init>",
        "()V",
        "Lg0/w2;",
        "Lj0/c;",
        "b",
        "(Lg0/w2;)Lj0/c;",
        "Ln0/i4;",
        "c",
        "(Ln0/i4;)Lj0/c;",
        "Lk0/b;",
        "a",
        "(Lg0/w2;)Lk0/b;",
        "useCase",
        "",
        "d",
        "(Lk0/b;Lg0/w2;)Z",
        "e",
        "(Lg0/w2;)Z",
        "f",
        "h",
        "g",
        "camera-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lj0/c$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lg0/w2;)Lk0/b;
    .locals 4
    .param p1    # Lg0/w2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lk0/b;->b()Lqt/a;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lk0/b;

    sget-object v3, Lj0/c;->c:Lj0/c$a;

    invoke-virtual {v3, v2, p1}, Lj0/c$a;->d(Lk0/b;Lg0/w2;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    check-cast v1, Lk0/b;

    return-object v1
.end method

.method public final b(Lg0/w2;)Lj0/c;
    .locals 1
    .param p1    # Lg0/w2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lg0/a2;

    if-eqz v0, :cond_0

    sget-object p1, Lj0/c;->d:Lj0/c;

    return-object p1

    :cond_0
    instance-of v0, p1, Lg0/f1;

    if-eqz v0, :cond_1

    sget-object p1, Lj0/c;->e:Lj0/c;

    return-object p1

    :cond_1
    invoke-static {p1}, Ls0/f;->e0(Lg0/w2;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p1, Lj0/c;->f:Lj0/c;

    return-object p1

    :cond_2
    instance-of p1, p1, Lb1/g;

    if-eqz p1, :cond_3

    sget-object p1, Lj0/c;->g:Lj0/c;

    return-object p1

    :cond_3
    sget-object p1, Lj0/c;->h:Lj0/c;

    return-object p1
.end method

.method public final c(Ln0/i4;)Lj0/c;
    .locals 1
    .param p1    # Ln0/i4;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln0/i4<",
            "*>;)",
            "Lj0/c;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ln0/i4;->X()Ln0/j4$b;

    move-result-object p1

    sget-object v0, Lj0/c$a$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v0, 0x4

    if-eq p1, v0, :cond_0

    sget-object p1, Lj0/c;->h:Lj0/c;

    return-object p1

    :cond_0
    sget-object p1, Lj0/c;->g:Lj0/c;

    return-object p1

    :cond_1
    sget-object p1, Lj0/c;->f:Lj0/c;

    return-object p1

    :cond_2
    sget-object p1, Lj0/c;->d:Lj0/c;

    return-object p1

    :cond_3
    sget-object p1, Lj0/c;->e:Lj0/c;

    return-object p1
.end method

.method public final d(Lk0/b;Lg0/w2;)Z
    .locals 1

    sget-object v0, Lj0/c$a$a;->b:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    invoke-virtual {p0, p2}, Lj0/c$a;->g(Lg0/w2;)Z

    move-result p1

    return p1

    :cond_0
    new-instance p1, Ljt/l;

    invoke-direct {p1}, Ljt/l;-><init>()V

    throw p1

    :cond_1
    invoke-virtual {p0, p2}, Lj0/c$a;->h(Lg0/w2;)Z

    move-result p1

    return p1

    :cond_2
    invoke-virtual {p0, p2}, Lj0/c$a;->f(Lg0/w2;)Z

    move-result p1

    return p1

    :cond_3
    invoke-virtual {p0, p2}, Lj0/c$a;->e(Lg0/w2;)Z

    move-result p1

    return p1
.end method

.method public final e(Lg0/w2;)Z
    .locals 0

    invoke-virtual {p1}, Lg0/w2;->e()Ln0/i4;

    move-result-object p1

    invoke-interface {p1}, Ln0/h2;->Q()Z

    move-result p1

    return p1
.end method

.method public final f(Lg0/w2;)Z
    .locals 0

    invoke-virtual {p1}, Lg0/w2;->e()Ln0/i4;

    move-result-object p1

    invoke-interface {p1}, Ln0/i4;->f0()Z

    move-result p1

    return p1
.end method

.method public final g(Lg0/w2;)Z
    .locals 1

    invoke-virtual {p1}, Lg0/w2;->e()Ln0/i4;

    move-result-object p1

    sget-object v0, Ln0/g2;->U:Ln0/n1$a;

    invoke-interface {p1, v0}, Ln0/l3;->a(Ln0/n1$a;)Z

    move-result p1

    return p1
.end method

.method public final h(Lg0/w2;)Z
    .locals 2

    invoke-virtual {p1}, Lg0/w2;->e()Ln0/i4;

    move-result-object v0

    sget-object v1, Ln0/i4;->H:Ln0/n1$a;

    invoke-interface {v0, v1}, Ln0/l3;->a(Ln0/n1$a;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lg0/w2;->e()Ln0/i4;

    move-result-object p1

    sget-object v0, Ln0/i4;->I:Ln0/n1$a;

    invoke-interface {p1, v0}, Ln0/l3;->a(Ln0/n1$a;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method
