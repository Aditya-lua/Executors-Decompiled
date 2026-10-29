.class public final Lcom/roblox/universalapp/achievement/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0018\u0010\r\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u000c\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/roblox/universalapp/achievement/b;",
        "",
        "<init>",
        "()V",
        "Landroid/content/Context;",
        "context",
        "",
        "b",
        "(Landroid/content/Context;)V",
        "Lsl/b;",
        "a",
        "()Lsl/b;",
        "Lsl/b;",
        "dao",
        "universalapp_googleProdRelease"
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
.field public static final a:Lcom/roblox/universalapp/achievement/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static volatile b:Lsl/b;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/roblox/universalapp/achievement/b;

    invoke-direct {v0}, Lcom/roblox/universalapp/achievement/b;-><init>()V

    sput-object v0, Lcom/roblox/universalapp/achievement/b;->a:Lcom/roblox/universalapp/achievement/b;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final b(Landroid/content/Context;)V
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/roblox/universalapp/achievement/b;->b:Lsl/b;

    const-string v1, "rbx.achievement"

    if-eqz v0, :cond_0

    const-string p0, "onAppCreate called twice"

    invoke-static {v1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    sget-object v0, Lcom/roblox/universalapp/achievement/AchievementDatabase;->o:Lcom/roblox/universalapp/achievement/AchievementDatabase$a;

    invoke-virtual {v0, p0}, Lcom/roblox/universalapp/achievement/AchievementDatabase$a;->a(Landroid/content/Context;)Lcom/roblox/universalapp/achievement/AchievementDatabase;

    move-result-object p0

    invoke-virtual {p0}, Lcom/roblox/universalapp/achievement/AchievementDatabase;->Z()Lsl/b;

    move-result-object p0

    sput-object p0, Lcom/roblox/universalapp/achievement/b;->b:Lsl/b;

    sget-object p0, Lcom/roblox/universalapp/achievement/JNIAchievement;->a:Lcom/roblox/universalapp/achievement/JNIAchievement;

    invoke-virtual {p0}, Lcom/roblox/universalapp/achievement/JNIAchievement;->c()Z

    move-result p0

    if-nez p0, :cond_1

    const-string p0, "Achievements JNI failed to register"

    invoke-static {v1, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    const-string p0, "Achievements registered"

    invoke-static {v1, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method


# virtual methods
.method public final a()Lsl/b;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    sget-object v0, Lcom/roblox/universalapp/achievement/b;->b:Lsl/b;

    return-object v0
.end method
