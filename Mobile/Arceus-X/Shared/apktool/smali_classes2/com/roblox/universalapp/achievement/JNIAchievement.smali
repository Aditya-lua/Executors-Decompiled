.class public final Lcom/roblox/universalapp/achievement/JNIAchievement;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0082 \u00a2\u0006\u0004\u0008\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0082 \u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ \u0010\u000e\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0004H\u0082 \u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007H\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007H\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\tH\u0000\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/roblox/universalapp/achievement/JNIAchievement;",
        "",
        "<init>",
        "()V",
        "",
        "init",
        "()Ljava/lang/String;",
        "",
        "handle",
        "",
        "result",
        "success",
        "(JZ)Z",
        "error",
        "failure",
        "(JLjava/lang/String;)Z",
        "codeName",
        "hasAchievedForNativeAsync",
        "(Ljava/lang/String;J)Z",
        "grantAchievementForNativeAsync",
        "c",
        "()Z",
        "Lku/p0;",
        "b",
        "Lku/p0;",
        "scope",
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
.field public static final a:Lcom/roblox/universalapp/achievement/JNIAchievement;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Lku/p0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/roblox/universalapp/achievement/JNIAchievement;

    invoke-direct {v0}, Lcom/roblox/universalapp/achievement/JNIAchievement;-><init>()V

    sput-object v0, Lcom/roblox/universalapp/achievement/JNIAchievement;->a:Lcom/roblox/universalapp/achievement/JNIAchievement;

    invoke-static {}, Lku/g1;->b()Lku/l0;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v1, v2, v1}, Lku/z2;->b(Lku/d2;ILjava/lang/Object;)Lku/a0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkotlin/coroutines/a;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object v0

    invoke-static {v0}, Lku/q0;->a(Lkotlin/coroutines/CoroutineContext;)Lku/p0;

    move-result-object v0

    sput-object v0, Lcom/roblox/universalapp/achievement/JNIAchievement;->b:Lku/p0;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lcom/roblox/universalapp/achievement/JNIAchievement;JLjava/lang/String;)Z
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/roblox/universalapp/achievement/JNIAchievement;->failure(JLjava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic b(Lcom/roblox/universalapp/achievement/JNIAchievement;JZ)Z
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/roblox/universalapp/achievement/JNIAchievement;->success(JZ)Z

    move-result p0

    return p0
.end method

.method private final native failure(JLjava/lang/String;)Z
.end method

.method private static final grantAchievementForNativeAsync(Ljava/lang/String;J)Z
    .locals 6
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    sget-object v0, Lcom/roblox/universalapp/achievement/JNIAchievement;->b:Lku/p0;

    new-instance v3, Lcom/roblox/universalapp/achievement/JNIAchievement$a;

    const/4 v1, 0x0

    invoke-direct {v3, p0, p1, p2, v1}, Lcom/roblox/universalapp/achievement/JNIAchievement$a;-><init>(Ljava/lang/String;JLnt/b;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lku/i;->d(Lku/p0;Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lku/d2;

    const/4 p0, 0x1

    return p0
.end method

.method private static final hasAchievedForNativeAsync(Ljava/lang/String;J)Z
    .locals 6
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    sget-object v0, Lcom/roblox/universalapp/achievement/JNIAchievement;->b:Lku/p0;

    new-instance v3, Lcom/roblox/universalapp/achievement/JNIAchievement$b;

    const/4 v1, 0x0

    invoke-direct {v3, p0, p1, p2, v1}, Lcom/roblox/universalapp/achievement/JNIAchievement$b;-><init>(Ljava/lang/String;JLnt/b;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lku/i;->d(Lku/p0;Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lku/d2;

    const/4 p0, 0x1

    return p0
.end method

.method private final native init()Ljava/lang/String;
.end method

.method private final native success(JZ)Z
.end method


# virtual methods
.method public final c()Z
    .locals 5

    :try_start_0
    sget-object v0, Ljt/n;->b:Ljt/n$a;

    invoke-direct {p0}, Lcom/roblox/universalapp/achievement/JNIAchievement;->init()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lsl/k;->valueOf(Ljava/lang/String;)Lsl/k;

    move-result-object v0

    invoke-static {v0}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    sget-object v1, Ljt/n;->b:Ljt/n$a;

    invoke-static {v0}, Ljt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Ljt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    const-string v2, "rbx.achievement.jni"

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "failed to register with JNI: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    sget-object v0, Lsl/k;->a:Lsl/k;

    invoke-static {v0}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_1
    invoke-static {v0}, Ljt/n;->h(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Lsl/k;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Init result: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    invoke-static {v0}, Ljt/o;->b(Ljava/lang/Object;)V

    sget-object v1, Lsl/k;->a:Lsl/k;

    if-eq v0, v1, :cond_2

    const/4 v0, 0x1

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    return v0
.end method
