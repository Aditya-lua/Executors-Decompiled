.class public abstract Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "State"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;,
        Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;,
        Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCapturesWithoutDocumentId;,
        Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$Start;,
        Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadDocument;,
        Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\u0006\u0014()*+,B1\u0008\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0001H\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000eH\u0000\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\u0008\u0014\u0010\u0015JA\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\u0008\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00082\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\tH\u0000\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008 \u0010!\u001a\u0004\u0008\"\u0010#R \u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00088\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008$\u0010%\u001a\u0004\u0008&\u0010\'\u0082\u0001\u0004-./0\u00a8\u00061"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;",
        "Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;",
        "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;",
        "captureState",
        "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;",
        "uploadState",
        "",
        "documentId",
        "",
        "Lcom/withpersona/sdk2/inquiry/document/DocumentFile;",
        "documents",
        "<init>",
        "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Ljava/lang/String;Ljava/util/List;)V",
        "other",
        "",
        "t0",
        "(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)Z",
        "shouldShowUploadOptionsDialog",
        "f",
        "(Z)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;",
        "a",
        "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;",
        "documentFileToDelete",
        "g",
        "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/document/DocumentFile;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;",
        "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;",
        "j",
        "()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;",
        "b",
        "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;",
        "n",
        "()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;",
        "c",
        "Ljava/lang/String;",
        "k",
        "()Ljava/lang/String;",
        "d",
        "Ljava/util/List;",
        "m",
        "()Ljava/util/List;",
        "UploadState",
        "Start",
        "ReviewCapturesWithoutDocumentId",
        "ReviewCaptures",
        "UploadDocument",
        "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;",
        "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCapturesWithoutDocumentId;",
        "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$Start;",
        "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadDocument;",
        "document_release"
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
.field public final a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/withpersona/sdk2/inquiry/document/DocumentFile;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Ljava/lang/String;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;",
            "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Lcom/withpersona/sdk2/inquiry/document/DocumentFile;",
            ">;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;

    .line 4
    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->b:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;

    .line 5
    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->c:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->d:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;-><init>(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic i(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/document/DocumentFile;ILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;
    .locals 1

    if-nez p6, :cond_3

    and-int/lit8 p6, p5, 0x2

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    move-object p3, v0

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    move-object p4, v0

    :cond_2
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->g(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/document/DocumentFile;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    move-result-object p0

    return-object p0

    :cond_3
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: copyWithUploadState"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final a(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;
    .locals 11
    .param p1    # Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "captureState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$Start;

    if-eqz v0, :cond_0

    move-object v1, p0

    check-cast v1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$Start;

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, p1

    invoke-static/range {v1 .. v7}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$Start;->p(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$Start;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Ljava/lang/String;ZILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$Start;

    move-result-object p1

    return-object p1

    :cond_0
    move-object v3, p1

    instance-of p1, p0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;

    if-eqz p1, :cond_1

    move-object v0, p0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;

    const/16 v9, 0xfb

    const/4 v10, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v0 .. v10}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;->p(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lcom/withpersona/sdk2/inquiry/document/DocumentFile;ZZLjava/lang/String;ILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of p1, p0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCapturesWithoutDocumentId;

    if-eqz p1, :cond_2

    move-object v0, p0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCapturesWithoutDocumentId;

    const/16 v9, 0xfb

    const/4 v10, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v0 .. v10}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCapturesWithoutDocumentId;->p(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCapturesWithoutDocumentId;Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lcom/withpersona/sdk2/inquiry/document/DocumentFile;ZZLjava/lang/String;ILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCapturesWithoutDocumentId;

    move-result-object p1

    return-object p1

    :cond_2
    instance-of p1, p0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadDocument;

    if-eqz p1, :cond_3

    return-object p0

    :cond_3
    new-instance p1, Ljt/l;

    invoke-direct {p1}, Ljt/l;-><init>()V

    throw p1
.end method

.method public final f(Z)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;
    .locals 11
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$Start;

    if-eqz v0, :cond_0

    move-object v1, p0

    check-cast v1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$Start;

    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move v5, p1

    invoke-static/range {v1 .. v7}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$Start;->p(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$Start;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Ljava/lang/String;ZILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$Start;

    move-result-object p1

    return-object p1

    :cond_0
    move v7, p1

    instance-of p1, p0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;

    if-eqz p1, :cond_1

    move-object v0, p0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;

    const/16 v9, 0xbf

    const/4 v10, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    invoke-static/range {v0 .. v10}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;->p(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lcom/withpersona/sdk2/inquiry/document/DocumentFile;ZZLjava/lang/String;ILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of p1, p0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCapturesWithoutDocumentId;

    if-eqz p1, :cond_2

    move-object v0, p0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCapturesWithoutDocumentId;

    const/16 v9, 0xbf

    const/4 v10, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    invoke-static/range {v0 .. v10}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCapturesWithoutDocumentId;->p(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCapturesWithoutDocumentId;Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lcom/withpersona/sdk2/inquiry/document/DocumentFile;ZZLjava/lang/String;ILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCapturesWithoutDocumentId;

    move-result-object p1

    return-object p1

    :cond_2
    instance-of p1, p0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadDocument;

    if-eqz p1, :cond_3

    return-object p0

    :cond_3
    new-instance p1, Ljt/l;

    invoke-direct {p1}, Ljt/l;-><init>()V

    throw p1
.end method

.method public final g(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/document/DocumentFile;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;
    .locals 11
    .param p1    # Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Lcom/withpersona/sdk2/inquiry/document/DocumentFile;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Lcom/withpersona/sdk2/inquiry/document/DocumentFile;",
            ">;",
            "Lcom/withpersona/sdk2/inquiry/document/DocumentFile;",
            ")",
            "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "uploadState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$Start;

    if-eqz v0, :cond_1

    move-object v1, p0

    check-cast v1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$Start;

    if-nez p2, :cond_0

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$Start;->k()Ljava/lang/String;

    move-result-object p2

    :cond_0
    move-object v4, p2

    const/16 v6, 0x9

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v5, 0x0

    move-object v3, p1

    invoke-static/range {v1 .. v7}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$Start;->p(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$Start;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Ljava/lang/String;ZILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$Start;

    move-result-object p1

    return-object p1

    :cond_1
    move-object v3, p1

    instance-of p1, p0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;

    if-eqz p1, :cond_3

    move-object v0, p0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;

    if-nez p3, :cond_2

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;->m()Ljava/util/List;

    move-result-object p3

    :cond_2
    move-object v1, p3

    const/16 v9, 0xe6

    const/4 v10, 0x0

    const/4 v2, 0x0

    move-object v4, v3

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v5, p4

    invoke-static/range {v0 .. v10}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;->p(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lcom/withpersona/sdk2/inquiry/document/DocumentFile;ZZLjava/lang/String;ILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;

    move-result-object p1

    return-object p1

    :cond_3
    move-object v5, p4

    instance-of p1, p0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCapturesWithoutDocumentId;

    if-eqz p1, :cond_6

    move-object v0, p0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCapturesWithoutDocumentId;

    if-nez p2, :cond_4

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCapturesWithoutDocumentId;->k()Ljava/lang/String;

    move-result-object p2

    :cond_4
    move-object v2, p2

    if-nez p3, :cond_5

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCapturesWithoutDocumentId;->m()Ljava/util/List;

    move-result-object p3

    :cond_5
    move-object v1, p3

    const/16 v9, 0xe4

    const/4 v10, 0x0

    move-object v4, v3

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v0 .. v10}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCapturesWithoutDocumentId;->p(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCapturesWithoutDocumentId;Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lcom/withpersona/sdk2/inquiry/document/DocumentFile;ZZLjava/lang/String;ILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCapturesWithoutDocumentId;

    move-result-object p1

    return-object p1

    :cond_6
    instance-of p1, p0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadDocument;

    if-eqz p1, :cond_7

    move-object v0, p0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadDocument;

    const/16 v5, 0xb

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadDocument;->p(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadDocument;Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Ljava/lang/String;ILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadDocument;

    move-result-object p1

    return-object p1

    :cond_7
    new-instance p1, Ljt/l;

    invoke-direct {p1}, Ljt/l;-><init>()V

    throw p1
.end method

.method public j()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;

    return-object v0
.end method

.method public k()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->c:Ljava/lang/String;

    return-object v0
.end method

.method public m()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/withpersona/sdk2/inquiry/document/DocumentFile;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->d:Ljava/util/List;

    return-object v0
.end method

.method public n()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->b:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;

    return-object v0
.end method

.method public t0(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)Z
    .locals 2
    .param p1    # Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "other"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->j()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;

    move-result-object v0

    check-cast p1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->j()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;

    move-result-object p1

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
