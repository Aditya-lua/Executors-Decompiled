.class public abstract Lcom/roblox/universalapp/achievement/AchievementDatabase;
.super Lx4/u;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/universalapp/achievement/AchievementDatabase$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0008B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/roblox/universalapp/achievement/AchievementDatabase;",
        "Lx4/u;",
        "<init>",
        "()V",
        "Lsl/b;",
        "Z",
        "()Lsl/b;",
        "o",
        "a",
        "database_googleProdRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final o:Lcom/roblox/universalapp/achievement/AchievementDatabase$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static volatile p:Lcom/roblox/universalapp/achievement/AchievementDatabase;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/roblox/universalapp/achievement/AchievementDatabase$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/roblox/universalapp/achievement/AchievementDatabase$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/roblox/universalapp/achievement/AchievementDatabase;->o:Lcom/roblox/universalapp/achievement/AchievementDatabase$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lx4/u;-><init>()V

    return-void
.end method

.method public static final synthetic X()Lcom/roblox/universalapp/achievement/AchievementDatabase;
    .locals 1

    sget-object v0, Lcom/roblox/universalapp/achievement/AchievementDatabase;->p:Lcom/roblox/universalapp/achievement/AchievementDatabase;

    return-object v0
.end method

.method public static final synthetic Y(Lcom/roblox/universalapp/achievement/AchievementDatabase;)V
    .locals 0

    sput-object p0, Lcom/roblox/universalapp/achievement/AchievementDatabase;->p:Lcom/roblox/universalapp/achievement/AchievementDatabase;

    return-void
.end method


# virtual methods
.method public abstract Z()Lsl/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method
