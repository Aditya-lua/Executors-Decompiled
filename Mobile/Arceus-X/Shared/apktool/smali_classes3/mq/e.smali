.class public final Lmq/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmq/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmq/e$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u0018\u0000 \u00172\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001f\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u000bj\u0008\u0012\u0004\u0012\u00020\u0006`\u000cH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u000fR$\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u000bj\u0008\u0012\u0004\u0012\u00020\u0006`\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\u00020\u00138\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u0014\u001a\u0004\u0008\u0010\u0010\u0015\u00a8\u0006\u0018"
    }
    d2 = {
        "Lmq/e;",
        "Lmq/a;",
        "Landroidx/lifecycle/l0;",
        "savedStateHandle",
        "<init>",
        "(Landroidx/lifecycle/l0;)V",
        "Lcom/withpersona/sdk2/inquiry/shared/data_collection/StepData;",
        "stepData",
        "",
        "a",
        "(Lcom/withpersona/sdk2/inquiry/shared/data_collection/StepData;)V",
        "Ljava/util/ArrayList;",
        "Lkotlin/collections/ArrayList;",
        "c",
        "()Ljava/util/ArrayList;",
        "Landroidx/lifecycle/l0;",
        "b",
        "Ljava/util/ArrayList;",
        "collectedData",
        "",
        "Z",
        "()Z",
        "isActive",
        "d",
        "shared_release"
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
.field public static final d:Lmq/e$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Landroidx/lifecycle/l0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/withpersona/sdk2/inquiry/shared/data_collection/StepData;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lmq/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lmq/e$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lmq/e;->d:Lmq/e$a;

    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/l0;)V
    .locals 1
    .param p1    # Landroidx/lifecycle/l0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "savedStateHandle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmq/e;->a:Landroidx/lifecycle/l0;

    const-string v0, "com.withpersona.sdk2.inquiry.shared.data_collection.RealDataCollector.collectedData"

    invoke-virtual {p1, v0}, Landroidx/lifecycle/l0;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    if-nez p1, :cond_0

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    :cond_0
    iput-object p1, p0, Lmq/e;->b:Ljava/util/ArrayList;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lmq/e;->c:Z

    return-void
.end method


# virtual methods
.method public a(Lcom/withpersona/sdk2/inquiry/shared/data_collection/StepData;)V
    .locals 2
    .param p1    # Lcom/withpersona/sdk2/inquiry/shared/data_collection/StepData;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "stepData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lmq/e;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lmq/e;->a:Landroidx/lifecycle/l0;

    const-string v0, "com.withpersona.sdk2.inquiry.shared.data_collection.RealDataCollector.collectedData"

    iget-object v1, p0, Lmq/e;->b:Ljava/util/ArrayList;

    invoke-virtual {p1, v0, v1}, Landroidx/lifecycle/l0;->i(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public b()Z
    .locals 1

    iget-boolean v0, p0, Lmq/e;->c:Z

    return v0
.end method

.method public c()Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/withpersona/sdk2/inquiry/shared/data_collection/StepData;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lmq/e;->b:Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method
