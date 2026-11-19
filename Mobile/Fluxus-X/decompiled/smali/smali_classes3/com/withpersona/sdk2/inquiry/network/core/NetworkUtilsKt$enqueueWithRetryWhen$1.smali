.class final Lcom/withpersona/sdk2/inquiry/network/core/NetworkUtilsKt$enqueueWithRetryWhen$1;
.super Lgu/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/network/core/NetworkUtilsKt;->enqueueWithRetryWhen(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Leu/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lgu/d;"
    }
.end annotation

.annotation runtime Lgu/f;
    c = "com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt"
    f = "NetworkUtils.kt"
    l = {
        0xb3
    }
    m = "enqueueWithRetryWhen"
.end annotation


# instance fields
.field I$0:I

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Leu/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/network/core/NetworkUtilsKt$enqueueWithRetryWhen$1;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lgu/d;-><init>(Leu/b;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkUtilsKt$enqueueWithRetryWhen$1;->result:Ljava/lang/Object;

    iget p1, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkUtilsKt$enqueueWithRetryWhen$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkUtilsKt$enqueueWithRetryWhen$1;->label:I

    const/4 p1, 0x0

    invoke-static {p1, p1, p0}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkUtilsKt;->enqueueWithRetryWhen(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
