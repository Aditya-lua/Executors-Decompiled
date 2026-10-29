.class public final Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper$c$b;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpt/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Lku/p0;",
        "Lnt/b<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lku/p0;",
        "",
        "<anonymous>",
        "(Lku/p0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lpt/f;
    c = "com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper$restoreComponentConfigs$2$restoredData$1"
    f = "UiStepSavedStateHelper.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;

.field public final synthetic v:Landroid/os/Parcel;


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;Landroid/os/Parcel;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;",
            "Landroid/os/Parcel;",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper$c$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper$c$b;->u:Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper$c$b;->v:Landroid/os/Parcel;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lnt/b;)Lnt/b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lnt/b<",
            "*>;)",
            "Lnt/b<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance p1, Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper$c$b;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper$c$b;->u:Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper$c$b;->v:Landroid/os/Parcel;

    invoke-direct {p1, v0, v1, p2}, Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper$c$b;-><init>(Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;Landroid/os/Parcel;Lnt/b;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper$c$b;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lku/p0;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper$c$b;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper$c$b;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper$c$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    iget v0, p0, Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper$c$b;->t:I

    if-nez v0, :cond_0

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    new-instance p1, Ljava/io/FileInputStream;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper$c$b;->u:Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;

    invoke-static {v0}, Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;->a(Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;)Ljava/io/File;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper$c$b;->v:Landroid/os/Parcel;

    :try_start_0
    invoke-static {p1}, Lut/b;->c(Ljava/io/InputStream;)[B

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3, v2}, Landroid/os/Parcel;->unmarshall([BII)V

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lut/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :catchall_0
    move-exception v0

    :try_start_1
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v1

    invoke-static {p1, v0}, Lut/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
