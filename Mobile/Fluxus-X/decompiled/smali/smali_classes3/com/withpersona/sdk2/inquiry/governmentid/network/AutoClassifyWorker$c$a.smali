.class public final Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0006\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c$a;",
        "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c;",
        "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;",
        "cause",
        "<init>",
        "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V",
        "a",
        "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;",
        "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;",
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


# instance fields
.field public final a:Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V
    .locals 1
    .param p1    # Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "cause"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c$a;->a:Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;

    return-void
.end method


# virtual methods
.method public final a()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c$a;->a:Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;

    return-object v0
.end method
