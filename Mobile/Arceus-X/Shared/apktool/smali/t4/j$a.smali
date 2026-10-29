.class public final Lt4/j$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt4/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lt4/j$a;",
        "",
        "<init>",
        "()V",
        "Landroid/content/Context;",
        "context",
        "Lt4/j;",
        "a",
        "(Landroid/content/Context;)Lt4/j;",
        "ads-adservices_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
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
    invoke-direct {p0}, Lt4/j$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)Lt4/j;
    .locals 4
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi",
            "ClassVerificationFailure"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lp4/a;->a:Lp4/a;

    invoke-virtual {v0}, Lp4/a;->a()I

    move-result v1

    const/16 v2, 0xb

    if-lt v1, v2, :cond_0

    new-instance v0, Lt4/o;

    invoke-direct {v0, p1}, Lt4/o;-><init>(Landroid/content/Context;)V

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lp4/a;->a()I

    move-result v1

    const/4 v3, 0x5

    if-lt v1, v3, :cond_1

    new-instance v0, Lt4/q;

    invoke-direct {v0, p1}, Lt4/q;-><init>(Landroid/content/Context;)V

    return-object v0

    :cond_1
    invoke-virtual {v0}, Lp4/a;->a()I

    move-result v1

    const/4 v3, 0x4

    if-ne v1, v3, :cond_2

    new-instance v0, Lt4/p;

    invoke-direct {v0, p1}, Lt4/p;-><init>(Landroid/content/Context;)V

    return-object v0

    :cond_2
    invoke-virtual {v0}, Lp4/a;->b()I

    move-result v1

    const-string v3, "TopicsManager"

    if-lt v1, v2, :cond_3

    sget-object v0, Lp4/b;->a:Lp4/b;

    new-instance v1, Lt4/j$a$a;

    invoke-direct {v1, p1}, Lt4/j$a$a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p1, v3, v1}, Lp4/b;->a(Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lt4/j;

    return-object p1

    :cond_3
    invoke-virtual {v0}, Lp4/a;->b()I

    move-result v0

    const/16 v1, 0x9

    if-lt v0, v1, :cond_4

    sget-object v0, Lp4/b;->a:Lp4/b;

    new-instance v1, Lt4/j$a$b;

    invoke-direct {v1, p1}, Lt4/j$a$b;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p1, v3, v1}, Lp4/b;->a(Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lt4/j;

    return-object p1

    :cond_4
    const/4 p1, 0x0

    return-object p1
.end method
