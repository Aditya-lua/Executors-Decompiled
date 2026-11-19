.class public final Lli/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010 \n\u0002\u0008\u0004\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0002\u001a\u0004\u0008\u0003\u0010\u0004\"\u0017\u0010\u0007\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0002\u001a\u0004\u0008\u0006\u0010\u0004\"\u0017\u0010\t\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0002\u001a\u0004\u0008\u0008\u0010\u0004\"\u001d\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00000\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u000b\u001a\u0004\u0008\u0001\u0010\u000c\u00a8\u0006\u000e"
    }
    d2 = {
        "Lli/a;",
        "a",
        "Lli/a;",
        "c",
        "()Lli/a;",
        "THREE_DAY_ROLL",
        "b",
        "TEN_DAY_ROLL",
        "d",
        "TWENTY_DAY_ROLL",
        "",
        "Ljava/util/List;",
        "()Ljava/util/List;",
        "STREAK_ACHIEVEMENTS",
        "NativeShell_googleProdRelease"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lli/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Lli/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final c:Lli/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lli/a;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lli/a;

    const-string v1, "Achievement3DayRoll"

    invoke-static {v1}, Lli/l;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "CgkIyM-UotMBEAIQDg"

    invoke-static {v2}, Lli/j;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lli/a;-><init>(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lli/b;->a:Lli/a;

    new-instance v1, Lli/a;

    const-string v2, "Achievement10DayRoll"

    invoke-static {v2}, Lli/l;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v4, "CgkIyM-UotMBEAIQDw"

    invoke-static {v4}, Lli/j;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v2, v4, v3}, Lli/a;-><init>(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Lli/b;->b:Lli/a;

    new-instance v2, Lli/a;

    const-string v4, "Achievement20DayRoll"

    invoke-static {v4}, Lli/l;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "CgkIyM-UotMBEAIQEA"

    invoke-static {v5}, Lli/j;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v2, v4, v5, v3}, Lli/a;-><init>(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v2, Lli/b;->c:Lli/a;

    filled-new-array {v0, v1, v2}, [Lli/a;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/p;->n([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lli/b;->d:Ljava/util/List;

    return-void
.end method

.method public static final a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lli/a;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lli/b;->d:Ljava/util/List;

    return-object v0
.end method

.method public static final b()Lli/a;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lli/b;->b:Lli/a;

    return-object v0
.end method

.method public static final c()Lli/a;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lli/b;->a:Lli/a;

    return-object v0
.end method

.method public static final d()Lli/a;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lli/b;->c:Lli/a;

    return-object v0
.end method
