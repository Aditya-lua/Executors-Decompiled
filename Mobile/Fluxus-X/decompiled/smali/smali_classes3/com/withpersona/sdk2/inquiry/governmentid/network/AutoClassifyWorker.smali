.class public final Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lln/o;
.implements Lls/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a;,
        Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;,
        Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c;,
        Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$SupplementaryData;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lln/o<",
        "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c;",
        ">;",
        "Lls/j<",
        "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00020\u0003:\u0004$\u001a\u00188BW\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u001b\u0010\u0018\u001a\u00020\u00132\n\u0010\u0017\u001a\u0006\u0012\u0002\u0008\u00030\u0001H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u001b\u0010\u001a\u001a\u00020\u00132\n\u0010\u0017\u001a\u0006\u0012\u0002\u0008\u00030\u0003H\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u001cH\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u001f\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020!0\u001f*\u0008\u0012\u0004\u0012\u00020 0\u001fH\u0002\u00a2\u0006\u0004\u0008\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010%R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010%R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008&\u0010%R\u0014\u0010\u0008\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\'\u0010%R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008(\u0010)R\u0014\u0010\u000c\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008*\u0010+R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008,\u0010-R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008.\u0010/R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00080\u00101R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00082\u00103R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00085\u00106\u00a8\u00069"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;",
        "Lln/o;",
        "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c;",
        "Lls/j;",
        "",
        "sessionToken",
        "inquiryId",
        "fromStep",
        "fromComponent",
        "Lcom/withpersona/sdk2/inquiry/governmentid/network/b;",
        "service",
        "Lvo/n;",
        "governmentId",
        "Lfr/a;",
        "imageHelper",
        "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$SupplementaryData;",
        "supplementaryData",
        "",
        "defaultManualCaptureDelayMs",
        "",
        "extractTextFromImage",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/network/b;Lvo/n;Lfr/a;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$SupplementaryData;JZ)V",
        "otherWorker",
        "a",
        "(Lln/o;)Z",
        "c",
        "(Lls/j;)Z",
        "Ldv/h;",
        "run",
        "()Ldv/h;",
        "",
        "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$IdClassesForCountry;",
        "Lvo/f3;",
        "p",
        "(Ljava/util/List;)Ljava/util/List;",
        "b",
        "Ljava/lang/String;",
        "d",
        "e",
        "f",
        "Lcom/withpersona/sdk2/inquiry/governmentid/network/b;",
        "g",
        "Lvo/n;",
        "h",
        "Lfr/a;",
        "i",
        "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$SupplementaryData;",
        "j",
        "J",
        "k",
        "Z",
        "Lsn/i1;",
        "l",
        "Lsn/i1;",
        "idFrontAnalyzer",
        "SupplementaryData",
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
.field public final b:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final e:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final f:Lcom/withpersona/sdk2/inquiry/governmentid/network/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final g:Lvo/n;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final h:Lfr/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final i:Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$SupplementaryData;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final j:J

.field public final k:Z

.field public final l:Lsn/i1;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/network/b;Lvo/n;Lfr/a;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$SupplementaryData;JZ)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lcom/withpersona/sdk2/inquiry/governmentid/network/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lvo/n;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Lfr/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p8    # Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$SupplementaryData;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "sessionToken"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "inquiryId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fromStep"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fromComponent"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "service"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "governmentId"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imageHelper"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "supplementaryData"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;->b:Ljava/lang/String;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;->c:Ljava/lang/String;

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;->d:Ljava/lang/String;

    iput-object p4, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;->e:Ljava/lang/String;

    iput-object p5, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;->f:Lcom/withpersona/sdk2/inquiry/governmentid/network/b;

    iput-object p6, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;->g:Lvo/n;

    iput-object p7, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;->h:Lfr/a;

    iput-object p8, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;->i:Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$SupplementaryData;

    iput-wide p9, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;->j:J

    iput-boolean p11, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;->k:Z

    new-instance p1, Lsn/i1;

    invoke-direct {p1}, Lsn/i1;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;->l:Lsn/i1;

    return-void
.end method

.method public static final synthetic d(Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;)J
    .locals 2

    iget-wide v0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;->j:J

    return-wide v0
.end method

.method public static final synthetic e(Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;->k:Z

    return p0
.end method

.method public static final synthetic f(Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;->e:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic g(Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;->d:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic h(Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;)Lvo/n;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;->g:Lvo/n;

    return-object p0
.end method

.method public static final synthetic i(Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;)Lsn/i1;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;->l:Lsn/i1;

    return-object p0
.end method

.method public static final synthetic j(Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;)Lfr/a;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;->h:Lfr/a;

    return-object p0
.end method

.method public static final synthetic k(Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;->c:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic l(Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;)Lcom/withpersona/sdk2/inquiry/governmentid/network/b;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;->f:Lcom/withpersona/sdk2/inquiry/governmentid/network/b;

    return-object p0
.end method

.method public static final synthetic m(Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;->b:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic n(Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;)Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$SupplementaryData;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;->i:Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$SupplementaryData;

    return-object p0
.end method

.method public static final synthetic o(Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;Ljava/util/List;)Ljava/util/List;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;->p(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lln/o;)Z
    .locals 1
    .param p1    # Lln/o;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lln/o<",
            "*>;)Z"
        }
    .end annotation

    const-string v0, "otherWorker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;->b:Ljava/lang/String;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;->b:Ljava/lang/String;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public b(Lls/j;)Z
    .locals 0
    .param p1    # Lls/j;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lls/j<",
            "*>;)Z"
        }
    .end annotation

    invoke-super {p0, p1}, Lls/j;->b(Lls/j;)Z

    move-result p1

    return p1
.end method

.method public c(Lls/j;)Z
    .locals 1
    .param p1    # Lls/j;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lls/j<",
            "*>;)Z"
        }
    .end annotation

    const-string v0, "otherWorker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;->b:Ljava/lang/String;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;->b:Ljava/lang/String;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final p(Ljava/util/List;)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$IdClassesForCountry;",
            ">;)",
            "Ljava/util/List<",
            "Lvo/f3;",
            ">;"
        }
    .end annotation

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lkotlin/collections/q;->u(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$IdClassesForCountry;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$IdClassesForCountry;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$IdClassesForCountry;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$IdClassesForCountry;->g()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$IdClassesForCountry;->a()Ljava/lang/String;

    move-result-object v7

    iget-wide v8, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;->j:J

    invoke-static {v6, v7, v8, v9}, Lvo/h;->o(Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id;Ljava/lang/String;J)Lvo/d3;

    move-result-object v6

    if-eqz v6, :cond_0

    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    new-instance v1, Lvo/f3;

    invoke-direct {v1, v2, v3, v5}, Lvo/f3;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public run()Ldv/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ldv/h<",
            "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;Leu/b;)V

    invoke-static {v0}, Ldv/j;->w(Lkotlin/jvm/functions/Function2;)Ldv/h;

    move-result-object v0

    invoke-static {}, Lav/g1;->a()Lav/l0;

    move-result-object v1

    invoke-static {v0, v1}, Ldv/j;->y(Ldv/h;Lkotlin/coroutines/CoroutineContext;)Ldv/h;

    move-result-object v0

    return-object v0
.end method
