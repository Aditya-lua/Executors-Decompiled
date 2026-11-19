.class public final Luq/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnn/k;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Luq/f$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lnn/k<",
        "Lmq/q5$d$g;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u0000 \u000b2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0011\u00a8\u0006\u0013"
    }
    d2 = {
        "Luq/f;",
        "Lnn/k;",
        "Lmq/q5$d$g;",
        "Luq/g;",
        "viewController",
        "<init>",
        "(Luq/g;)V",
        "rendering",
        "Lnn/z;",
        "viewEnvironment",
        "",
        "c",
        "(Lmq/q5$d$g;Lnn/z;)V",
        "Ljr/a;",
        "systemUiController",
        "b",
        "(Lmq/q5$d$g;Ljr/a;)V",
        "Luq/g;",
        "a",
        "selfie_release"
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
.field public static final c:Luq/f$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final b:Luq/g;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Luq/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Luq/f$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Luq/f;->c:Luq/f$a;

    return-void
.end method

.method public constructor <init>(Luq/g;)V
    .locals 1
    .param p1    # Luq/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luq/f;->b:Luq/g;

    invoke-interface {p1}, Luq/g;->a()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lnn/z;)V
    .locals 0

    check-cast p1, Lmq/q5$d$g;

    invoke-virtual {p0, p1, p2}, Luq/f;->c(Lmq/q5$d$g;Lnn/z;)V

    return-void
.end method

.method public final b(Lmq/q5$d$g;Ljr/a;)V
    .locals 17
    .param p1    # Lmq/q5$d$g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljr/a;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "rendering"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p0

    iget-object v1, v0, Luq/f;->b:Luq/g;

    invoke-virtual/range {p1 .. p1}, Lmq/q5$d$g;->l()Ler/c;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Lmq/q5$d$g;->n()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Lmq/q5$d$g;->c()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Lmq/q5$d$g;->j()Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Lmq/q5$d$g;->b()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lmq/q5$d$g;->e()Ljava/lang/String;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, Lmq/q5$d$g;->f()Lir/a;

    move-result-object v9

    invoke-virtual/range {p1 .. p1}, Lmq/q5$d$g;->m()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;

    move-result-object v10

    invoke-virtual/range {p1 .. p1}, Lmq/q5$d$g;->g()Lkotlin/jvm/functions/Function0;

    move-result-object v11

    invoke-virtual/range {p1 .. p1}, Lmq/q5$d$g;->h()Lkotlin/jvm/functions/Function0;

    move-result-object v12

    invoke-virtual/range {p1 .. p1}, Lmq/q5$d$g;->a()Ljava/lang/String;

    move-result-object v13

    invoke-virtual/range {p1 .. p1}, Lmq/q5$d$g;->o()Ljava/lang/String;

    move-result-object v14

    invoke-virtual/range {p1 .. p1}, Lmq/q5$d$g;->k()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;

    move-result-object v15

    invoke-virtual/range {p1 .. p1}, Lmq/q5$d$g;->i()Lkotlin/jvm/functions/Function0;

    move-result-object v16

    move-object/from16 v2, p2

    invoke-interface/range {v1 .. v16}, Luq/g;->b(Ljr/a;Ler/c;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Ljava/lang/String;Lir/a;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public c(Lmq/q5$d$g;Lnn/z;)V
    .locals 1
    .param p1    # Lmq/q5$d$g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lnn/z;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "rendering"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewEnvironment"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Ljr/c;->a(Lnn/z;)Ljr/a;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Luq/f;->b(Lmq/q5$d$g;Ljr/a;)V

    return-void
.end method
