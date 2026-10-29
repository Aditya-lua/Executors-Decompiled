.class public final Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/f;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0003J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u000cH\u0007\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0082@\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0003J-\u0010\u001c\u001a\u00020\u00042\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0010\u0008\u0002\u0010\u001b\u001a\n\u0018\u00010\u0019j\u0004\u0018\u0001`\u001aH\u0002\u00a2\u0006\u0004\u0008\u001c\u0010\u001dR\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010$\u00a8\u0006&"
    }
    d2 = {
        "Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler;",
        "Landroidx/lifecycle/f;",
        "<init>",
        "()V",
        "",
        "showAppRatingPrompt",
        "Lj/b;",
        "activity",
        "",
        "failureMessage",
        "k",
        "(Lj/b;Ljava/lang/String;)V",
        "",
        "isAppRatingPromptAvailable",
        "()Z",
        "Landroidx/lifecycle/s;",
        "owner",
        "onCreate",
        "(Landroidx/lifecycle/s;)V",
        "onDestroy",
        "d",
        "(Lj/b;Lnt/b;)Ljava/lang/Object;",
        "j",
        "",
        "errorCode",
        "Ljava/lang/Exception;",
        "Lkotlin/Exception;",
        "except",
        "h",
        "(Ljava/lang/Integer;Ljava/lang/Exception;)V",
        "Ljava/lang/ref/WeakReference;",
        "b",
        "Ljava/lang/ref/WeakReference;",
        "activityRef",
        "Lkotlin/time/a;",
        "c",
        "J",
        "delay",
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
.field public static final a:Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static volatile b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lj/b;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public static final c:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler;

    invoke-direct {v0}, Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler;-><init>()V

    sput-object v0, Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler;->a:Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler;

    sget-object v0, Lkotlin/time/a;->b:Lkotlin/time/a$a;

    const/4 v0, 0x1

    sget-object v1, Lju/b;->e:Lju/b;

    invoke-static {v0, v1}, Lkotlin/time/b;->p(ILju/b;)J

    move-result-wide v0

    sput-wide v0, Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler;->c:J

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/google/android/gms/tasks/Task;)V
    .locals 0

    invoke-static {p0}, Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler;->f(Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method

.method public static synthetic b(Lwd/b;Lj/b;Lcom/google/android/gms/tasks/Task;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler;->e(Lwd/b;Lj/b;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method

.method public static final synthetic c(Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler;Lj/b;Lnt/b;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler;->d(Lj/b;Lnt/b;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lwd/b;Lj/b;Lcom/google/android/gms/tasks/Task;)V
    .locals 1

    const-string v0, "task"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/google/android/play/core/review/ReviewInfo;

    invoke-interface {p0, p1, p2}, Lwd/b;->b(Landroid/app/Activity;Lcom/google/android/play/core/review/ReviewInfo;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    const-string p2, "launchReviewFlow(...)"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lwl/b;

    invoke-direct {p2}, Lwl/b;-><init>()V

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/tasks/Task;->b(Landroid/app/Activity;Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    return-void

    :cond_0
    invoke-virtual {p2}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object p0

    instance-of p1, p0, Lwd/a;

    const/4 p2, 0x0

    if-eqz p1, :cond_1

    check-cast p0, Lwd/a;

    goto :goto_0

    :cond_1
    move-object p0, p2

    :goto_0
    if-eqz p0, :cond_2

    invoke-virtual {p0}, Lwd/a;->c()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    goto :goto_1

    :cond_2
    move-object p0, p2

    :goto_1
    sget-object p1, Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler;->a:Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler;

    const/4 v0, 0x2

    invoke-static {p1, p0, p2, v0, p2}, Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler;->i(Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler;Ljava/lang/Integer;Ljava/lang/Exception;ILjava/lang/Object;)V

    return-void
.end method

.method public static final f(Lcom/google/android/gms/tasks/Task;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler;->a:Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler;

    invoke-virtual {p0}, Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler;->j()V

    return-void
.end method

.method public static synthetic i(Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler;Ljava/lang/Integer;Ljava/lang/Exception;ILjava/lang/Object;)V
    .locals 1

    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move-object p2, v0

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler;->h(Ljava/lang/Integer;Ljava/lang/Exception;)V

    return-void
.end method

.method public static final isAppRatingPromptAvailable()Z
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const/4 v0, 0x1

    return v0
.end method

.method public static final k(Lj/b;Ljava/lang/String;)V
    .locals 7
    .param p0    # Lj/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "activity"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "failureMessage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->X3()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Landroidx/lifecycle/t;->a(Landroidx/lifecycle/s;)Landroidx/lifecycle/m;

    move-result-object v1

    invoke-static {}, Lku/g1;->c()Lku/n2;

    move-result-object v2

    new-instance v4, Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler$c;

    const/4 p1, 0x0

    invoke-direct {v4, p0, p1}, Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler$c;-><init>(Lj/b;Lnt/b;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lku/i;->d(Lku/p0;Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lku/d2;

    return-void

    :cond_0
    invoke-static {p0}, Lgk/a0;->c(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    :cond_1
    return-void
.end method

.method public static final showAppRatingPrompt()V
    .locals 7
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "AppRatingPrompt"

    const-string v1, "requestRatingPrompt called"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler;->b:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj/b;

    if-eqz v0, :cond_0

    invoke-static {v0}, Landroidx/lifecycle/t;->a(Landroidx/lifecycle/s;)Landroidx/lifecycle/m;

    move-result-object v1

    invoke-static {}, Lku/g1;->c()Lku/n2;

    move-result-object v2

    new-instance v4, Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler$b;

    const/4 v3, 0x0

    invoke-direct {v4, v0, v3}, Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler$b;-><init>(Lj/b;Lnt/b;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lku/i;->d(Lku/p0;Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lku/d2;

    :cond_0
    return-void
.end method


# virtual methods
.method public final d(Lj/b;Lnt/b;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/b;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler$a;

    iget v1, v0, Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler$a;->w:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler$a;->w:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler$a;

    invoke-direct {v0, p0, p2}, Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler$a;-><init>(Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler;Lnt/b;)V

    :goto_0
    iget-object p2, v0, Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler$a;->u:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler$a;->w:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler$a;->t:Ljava/lang/Object;

    check-cast p1, Lj/b;

    :try_start_0
    invoke-static {p2}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Ljt/o;->b(Ljava/lang/Object;)V

    const-string p2, "AppRatingPrompt"

    const-string v2, "displayRatingPrompt"

    invoke-static {p2, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :try_start_1
    sget-wide v4, Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler;->c:J

    iput-object p1, v0, Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler$a;->t:Ljava/lang/Object;

    iput v3, v0, Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler$a;->w:I

    invoke-static {v4, v5, v0}, Lku/z0;->c(JLnt/b;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    invoke-static {p1}, Lwd/c;->a(Landroid/content/Context;)Lwd/b;

    move-result-object p2

    const-string v0, "create(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2}, Lwd/b;->a()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    const-string v1, "requestReviewFlow(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lwl/a;

    invoke-direct {v1, p2, p1}, Lwl/a;-><init>(Lwd/b;Lj/b;)V

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/tasks/Task;->b(Landroid/app/Activity;Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_3

    :goto_2
    const/4 p2, 0x0

    invoke-static {p0, p2, p1, v3, p2}, Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler;->i(Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler;Ljava/lang/Integer;Ljava/lang/Exception;ILjava/lang/Object;)V

    :goto_3
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final h(Ljava/lang/Integer;Ljava/lang/Exception;)V
    .locals 4

    invoke-static {}, Lkotlin/collections/o;->c()Ljava/util/List;

    move-result-object v0

    const-string v1, "errorInfo"

    const-string v2, "AppRatingPrompt"

    if-eqz p2, :cond_0

    new-instance p1, Lkotlin/Pair;

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p1, v1, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string p1, "Error in displayRatingPrompt"

    invoke-static {v2, p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    new-instance p2, Lkotlin/Pair;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {p2, v1, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Error in displayRatingPrompt, errorCode: "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_1
    const-string p1, "Error in displayRatingPrompt: unknown error"

    invoke-static {v2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    invoke-static {v0}, Lkotlin/collections/o;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p2

    invoke-interface {p2}, Lth/i;->o5()I

    move-result p2

    const-string v0, "AppRatingPromptError"

    invoke-static {v0, p1, p2}, Llm/b;->a(Ljava/lang/String;Ljava/util/List;I)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent;

    move-result-object p1

    invoke-static {p1}, Lcom/roblox/universalapp/logging/LoggingProtocol;->j(Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent;)V

    return-void
.end method

.method public final j()V
    .locals 2

    const-string v0, "AppRatingPrompt"

    const-string v1, "onPromptFlowComplete"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public onCreate(Landroidx/lifecycle/s;)V
    .locals 2
    .param p1    # Landroidx/lifecycle/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "AppRatingPrompt"

    const-string v1, "onCreate"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Ljava/lang/ref/WeakReference;

    instance-of v1, p1, Lj/b;

    if-eqz v1, :cond_0

    check-cast p1, Lj/b;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler;->b:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public onDestroy(Landroidx/lifecycle/s;)V
    .locals 1
    .param p1    # Landroidx/lifecycle/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler;->b:Ljava/lang/ref/WeakReference;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->clear()V

    :cond_0
    const/4 p1, 0x0

    sput-object p1, Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler;->b:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public bridge onPause(Landroidx/lifecycle/s;)V
    .locals 0
    .param p1    # Landroidx/lifecycle/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-super {p0, p1}, Landroidx/lifecycle/f;->onPause(Landroidx/lifecycle/s;)V

    return-void
.end method

.method public bridge onResume(Landroidx/lifecycle/s;)V
    .locals 0
    .param p1    # Landroidx/lifecycle/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-super {p0, p1}, Landroidx/lifecycle/f;->onResume(Landroidx/lifecycle/s;)V

    return-void
.end method

.method public bridge onStart(Landroidx/lifecycle/s;)V
    .locals 0
    .param p1    # Landroidx/lifecycle/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-super {p0, p1}, Landroidx/lifecycle/f;->onStart(Landroidx/lifecycle/s;)V

    return-void
.end method

.method public bridge onStop(Landroidx/lifecycle/s;)V
    .locals 0
    .param p1    # Landroidx/lifecycle/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-super {p0, p1}, Landroidx/lifecycle/f;->onStop(Landroidx/lifecycle/s;)V

    return-void
.end method
