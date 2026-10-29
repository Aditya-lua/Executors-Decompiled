.class public interface abstract Lcom/withpersona/sdk2/inquiry/governmentid/Screen;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/governmentid/Screen$a;,
        Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;,
        Lcom/withpersona/sdk2/inquiry/governmentid/Screen$c;,
        Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;,
        Lcom/withpersona/sdk2/inquiry/governmentid/Screen$e;,
        Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;,
        Lcom/withpersona/sdk2/inquiry/governmentid/Screen$f;,
        Lcom/withpersona/sdk2/inquiry/governmentid/Screen$g;,
        Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;,
        Lcom/withpersona/sdk2/inquiry/governmentid/Screen$i;,
        Lcom/withpersona/sdk2/inquiry/governmentid/Screen$j;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008v\u0018\u00002\u00020\u0001:\u000b\u000e\u0004\u000f\u0010\u0011\u0012\u0007\u0013\u0014\u0015\u0016J\u0019\u0010\u0004\u001a\u00020\u00032\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\u0016\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00068&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\u0016\u0010\r\u001a\u0004\u0018\u00010\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u000c\u0082\u0001\n\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f \u00a8\u0006!\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/governmentid/Screen;",
        "",
        "other",
        "",
        "b",
        "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen;)Z",
        "Lwq/l;",
        "a",
        "()Lwq/l;",
        "transition",
        "",
        "getName",
        "()Ljava/lang/String;",
        "name",
        "e",
        "Overlay",
        "h",
        "j",
        "f",
        "c",
        "i",
        "d",
        "g",
        "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$a;",
        "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;",
        "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$c;",
        "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;",
        "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$e;",
        "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$f;",
        "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$g;",
        "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;",
        "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$i;",
        "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$j;",
        "government-id_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract a()Lwq/l;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public b(Lcom/withpersona/sdk2/inquiry/governmentid/Screen;)Z
    .locals 3
    .param p1    # Lcom/withpersona/sdk2/inquiry/governmentid/Screen;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    invoke-interface {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen;->getName()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen;->getName()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    invoke-interface {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_3
    :goto_0
    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;

    if-nez v0, :cond_3

    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$a;

    if-nez v0, :cond_2

    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$c;

    if-nez v0, :cond_2

    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;

    if-nez v0, :cond_2

    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$e;

    if-nez v0, :cond_2

    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$i;

    if-nez v0, :cond_2

    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$j;

    if-nez v0, :cond_2

    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$g;

    if-nez v0, :cond_2

    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$f;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    new-instance v0, Ljt/l;

    invoke-direct {v0}, Ljt/l;-><init>()V

    throw v0

    :cond_2
    :goto_0
    const/4 v0, 0x0

    return-object v0

    :cond_3
    :goto_1
    const-string v0, "camera_screen"

    return-object v0
.end method
