.class public final Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvr/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$a;,
        Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$b;,
        Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$TransitionData;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lvr/h<",
        "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u001c\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0003 <=B\u0081\u0001\u0008\u0007\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\u0008\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0003\u0012\n\u0008\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0008\u0001\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u0012\u0008\u0008\u0001\u0010\u000c\u001a\u00020\u000b\u0012\u0008\u0008\u0001\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u001bH\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u001bH\u0002\u00a2\u0006\u0004\u0008\u001e\u0010\u001dJ\u0015\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u001bH\u0002\u00a2\u0006\u0004\u0008\u001f\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008 \u0010!\u001a\u0004\u0008\"\u0010#R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010!R\u0017\u0010\u0006\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008%\u0010!\u001a\u0004\u0008&\u0010#R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\'\u0010!R\u001a\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008(\u0010)R\u0014\u0010\u000c\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008*\u0010+R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008,\u0010-R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008.\u0010/R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00080\u00101R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00082\u00103R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00084\u00105R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00086\u00107R\u0014\u0010;\u001a\u0002088BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u00089\u0010:\u00a8\u0006>"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker;",
        "Lvr/h;",
        "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$b;",
        "",
        "sessionToken",
        "trackingEventsUrl",
        "inquiryId",
        "shareToken",
        "",
        "Lcom/withpersona/sdk2/inquiry/FieldMapping;",
        "fieldMappings",
        "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;",
        "inquirySessionConfig",
        "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$TransitionData;",
        "transitionData",
        "Lgp/w;",
        "service",
        "Lfo/a;",
        "fallbackModeManager",
        "Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;",
        "uiStepSavedStateHelper",
        "Lgo/e;",
        "featureFlagManager",
        "Landroid/content/Context;",
        "applicationContext",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$TransitionData;Lgp/w;Lfo/a;Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;Lgo/e;Landroid/content/Context;)V",
        "Lnu/h;",
        "run",
        "()Lnu/h;",
        "s",
        "r",
        "b",
        "Ljava/lang/String;",
        "p",
        "()Ljava/lang/String;",
        "c",
        "d",
        "o",
        "e",
        "f",
        "Ljava/util/List;",
        "g",
        "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;",
        "h",
        "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$TransitionData;",
        "i",
        "Lgp/w;",
        "j",
        "Lfo/a;",
        "k",
        "Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;",
        "l",
        "Lgo/e;",
        "m",
        "Landroid/content/Context;",
        "",
        "q",
        "()Z",
        "useMultipartTransition",
        "TransitionData",
        "a",
        "inquiry-internal_release"
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
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final d:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final e:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/withpersona/sdk2/inquiry/FieldMapping;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final g:Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final h:Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$TransitionData;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final i:Lgp/w;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final j:Lfo/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final k:Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final l:Lgo/e;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final m:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$TransitionData;Lgp/w;Lfo/a;Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;Lgo/e;Landroid/content/Context;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$TransitionData;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p8    # Lgp/w;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p9    # Lfo/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p10    # Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p11    # Lgo/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p12    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/withpersona/sdk2/inquiry/FieldMapping;",
            ">;",
            "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;",
            "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$TransitionData;",
            "Lgp/w;",
            "Lfo/a;",
            "Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;",
            "Lgo/e;",
            "Landroid/content/Context;",
            ")V"
        }
    .end annotation

    const-string v0, "sessionToken"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "inquiryId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fieldMappings"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "inquirySessionConfig"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transitionData"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "service"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fallbackModeManager"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uiStepSavedStateHelper"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagManager"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "applicationContext"

    invoke-static {p12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker;->b:Ljava/lang/String;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker;->c:Ljava/lang/String;

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker;->d:Ljava/lang/String;

    iput-object p4, p0, Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker;->e:Ljava/lang/String;

    iput-object p5, p0, Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker;->f:Ljava/util/List;

    iput-object p6, p0, Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker;->g:Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;

    iput-object p7, p0, Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker;->h:Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$TransitionData;

    iput-object p8, p0, Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker;->i:Lgp/w;

    iput-object p9, p0, Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker;->j:Lfo/a;

    iput-object p10, p0, Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker;->k:Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;

    iput-object p11, p0, Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker;->l:Lgo/e;

    iput-object p12, p0, Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker;->m:Landroid/content/Context;

    return-void
.end method

.method public static final synthetic b(Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker;->m:Landroid/content/Context;

    return-object p0
.end method

.method public static final synthetic d(Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker;)Lfo/a;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker;->j:Lfo/a;

    return-object p0
.end method

.method public static final synthetic e(Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker;->f:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic f(Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker;)Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker;->g:Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;

    return-object p0
.end method

.method public static final synthetic g(Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker;)Lgp/w;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker;->i:Lgp/w;

    return-object p0
.end method

.method public static final synthetic h(Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker;->e:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic i(Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker;->c:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic j(Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker;)Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$TransitionData;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker;->h:Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$TransitionData;

    return-object p0
.end method

.method public static final synthetic k(Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker;)Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker;->k:Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;

    return-object p0
.end method

.method public static final synthetic l(Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker;)Z
    .locals 0

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker;->q()Z

    move-result p0

    return p0
.end method

.method public static final synthetic m(Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker;)Lnu/h;
    .locals 0

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker;->r()Lnu/h;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic n(Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker;)Lnu/h;
    .locals 0

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker;->s()Lnu/h;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lvr/h;)Z
    .locals 0
    .param p1    # Lvr/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvr/h<",
            "*>;)Z"
        }
    .end annotation

    invoke-super {p0, p1}, Lvr/h;->a(Lvr/h;)Z

    move-result p1

    return p1
.end method

.method public c(Lvr/h;)Z
    .locals 0
    .param p1    # Lvr/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvr/h<",
            "*>;)Z"
        }
    .end annotation

    invoke-super {p0, p1}, Lvr/h;->c(Lvr/h;)Z

    move-result p1

    return p1
.end method

.method public final o()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final p()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final q()Z
    .locals 2

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker;->l:Lgo/e;

    sget-object v1, Lgo/t;->a:Lgo/t;

    invoke-virtual {v0, v1}, Lgo/e;->a(Lgo/d;)Z

    move-result v0

    return v0
.end method

.method public final r()Lnu/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnu/h<",
            "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$b;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$d;-><init>(Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker;Lnt/b;)V

    invoke-static {v0}, Lnu/j;->w(Lkotlin/jvm/functions/Function2;)Lnu/h;

    move-result-object v0

    return-object v0
.end method

.method public run()Lnu/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnu/h<",
            "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$b;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$c;-><init>(Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker;Lnt/b;)V

    invoke-static {v0}, Lnu/j;->w(Lkotlin/jvm/functions/Function2;)Lnu/h;

    move-result-object v0

    return-object v0
.end method

.method public final s()Lnu/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnu/h<",
            "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$b;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$e;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$e;-><init>(Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker;Lnt/b;)V

    invoke-static {v0}, Lnu/j;->w(Lkotlin/jvm/functions/Function2;)Lnu/h;

    move-result-object v0

    return-object v0
.end method
