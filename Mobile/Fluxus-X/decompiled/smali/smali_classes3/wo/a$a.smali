.class public final Lwo/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwo/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J1\u0010\n\u001a\u00020\t2\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000f\u0010\u000c\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lwo/a$a;",
        "",
        "<init>",
        "()V",
        "",
        "isEnabled",
        "extractTextFromImage",
        "Lvo/d3$c;",
        "idSideConfig",
        "Lwo/a;",
        "b",
        "(Ljava/lang/Boolean;Ljava/lang/Boolean;Lvo/d3$c;)Lwo/a;",
        "a",
        "()Lvo/d3$c;",
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
    invoke-direct {p0}, Lwo/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lvo/d3$c;
    .locals 8

    new-instance v0, Lvo/d3$c;

    sget-object v2, Lvo/d3$e;->d:Lvo/d3$e;

    sget-object v3, Lvo/y3$f$b;->a:Lvo/y3$f$b;

    new-instance v4, Lvo/d3$a;

    const/4 v1, 0x0

    const/4 v5, 0x1

    invoke-direct {v4, v1, v5, v1}, Lvo/d3$a;-><init>(Lsn/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move v1, v5

    new-instance v5, Lvo/d3$d;

    const-wide/16 v6, 0x0

    invoke-direct {v5, v1, v6, v7}, Lvo/d3$d;-><init>(ZJ)V

    const-string v1, "unknown"

    invoke-direct/range {v0 .. v5}, Lvo/d3$c;-><init>(Ljava/lang/String;Lvo/d3$e;Lvo/y3$f;Lvo/d3$a;Lvo/d3$d;)V

    return-object v0
.end method

.method public final b(Ljava/lang/Boolean;Ljava/lang/Boolean;Lvo/d3$c;)Lwo/a;
    .locals 1
    .param p1    # Ljava/lang/Boolean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Boolean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lvo/d3$c;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lwo/a;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    goto :goto_1

    :cond_1
    const/4 p2, 0x1

    :goto_1
    if-nez p3, :cond_2

    invoke-virtual {p0}, Lwo/a$a;->a()Lvo/d3$c;

    move-result-object p3

    :cond_2
    invoke-direct {v0, p1, p2, p3}, Lwo/a;-><init>(ZZLvo/d3$c;)V

    return-object v0
.end method
