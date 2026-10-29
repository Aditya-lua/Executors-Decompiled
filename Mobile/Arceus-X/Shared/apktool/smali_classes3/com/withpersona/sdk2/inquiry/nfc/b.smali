.class public final Lcom/withpersona/sdk2/inquiry/nfc/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lym/o;
.implements Lvr/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/nfc/b$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lym/o<",
        "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput;",
        ">;",
        "Lvr/h<",
        "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u001b\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00020\u0003:\u0001>B\u008b\u0001\u0008\u0007\u0012\u000e\u0008\u0001\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0008\u0008\u0001\u0010\u0010\u001a\u00020\u000f\u0012\u0008\u0008\u0001\u0010\u0012\u001a\u00020\u0011\u0012\u0008\u0008\u0001\u0010\u0014\u001a\u00020\u0013\u0012\u000e\u0008\u0001\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u0015\u0012\n\u0008\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\u0008\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\u0008\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u001b\u0010\"\u001a\u00020!2\n\u0010 \u001a\u0006\u0012\u0002\u0008\u00030\u0001H\u0016\u00a2\u0006\u0004\u0008\"\u0010#J\u0015\u0010%\u001a\u0008\u0012\u0004\u0012\u00020\u00020$H\u0016\u00a2\u0006\u0004\u0008%\u0010&R\u001a\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010\'R\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008(\u0010)R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008*\u0010+R\u0014\u0010\u000c\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008,\u0010-R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008.\u0010/R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00080\u00101R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00082\u00103R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00084\u00105R\u001a\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00086\u00107R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00088\u00109R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008:\u0010;R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008<\u0010=\u00a8\u0006?"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/nfc/b;",
        "Lym/o;",
        "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput;",
        "Lvr/h;",
        "Lg/c;",
        "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderConfig;",
        "passportNfcReaderLauncher",
        "Landroid/content/Context;",
        "context",
        "Lwp/c;",
        "sandboxFlags",
        "Lqq/c;",
        "sdkFilesManager",
        "Lgo/e;",
        "featureFlagManager",
        "",
        "cardAccessNumber",
        "Lcom/withpersona/sdk2/inquiry/nfc/MrzKey;",
        "mrzKey",
        "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcStrings;",
        "passportNfcStrings",
        "",
        "Lqp/b;",
        "enabledDataGroups",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;",
        "stepStyles",
        "",
        "theme",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$GovernmentIdNfcScanStyles;",
        "componentStyles",
        "<init>",
        "(Lg/c;Landroid/content/Context;Lwp/c;Lqq/c;Lgo/e;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/nfc/MrzKey;Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcStrings;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Ljava/lang/Integer;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$GovernmentIdNfcScanStyles;)V",
        "otherWorker",
        "",
        "b",
        "(Lym/o;)Z",
        "Lnu/h;",
        "run",
        "()Lnu/h;",
        "Lg/c;",
        "c",
        "Landroid/content/Context;",
        "d",
        "Lwp/c;",
        "e",
        "Lqq/c;",
        "f",
        "Lgo/e;",
        "g",
        "Ljava/lang/String;",
        "h",
        "Lcom/withpersona/sdk2/inquiry/nfc/MrzKey;",
        "i",
        "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcStrings;",
        "j",
        "Ljava/util/List;",
        "k",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;",
        "l",
        "Ljava/lang/Integer;",
        "m",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$GovernmentIdNfcScanStyles;",
        "a",
        "nfc_release"
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
.field public final b:Lg/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg/c<",
            "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderConfig;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Lwp/c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final e:Lqq/c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final f:Lgo/e;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final g:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final h:Lcom/withpersona/sdk2/inquiry/nfc/MrzKey;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final i:Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcStrings;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lqp/b;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final k:Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final l:Ljava/lang/Integer;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final m:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$GovernmentIdNfcScanStyles;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lg/c;Landroid/content/Context;Lwp/c;Lqq/c;Lgo/e;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/nfc/MrzKey;Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcStrings;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Ljava/lang/Integer;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$GovernmentIdNfcScanStyles;)V
    .locals 1
    .param p1    # Lg/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lwp/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lqq/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lgo/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Lcom/withpersona/sdk2/inquiry/nfc/MrzKey;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p8    # Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcStrings;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p9    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p10    # Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p11    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p12    # Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$GovernmentIdNfcScanStyles;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg/c<",
            "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderConfig;",
            ">;",
            "Landroid/content/Context;",
            "Lwp/c;",
            "Lqq/c;",
            "Lgo/e;",
            "Ljava/lang/String;",
            "Lcom/withpersona/sdk2/inquiry/nfc/MrzKey;",
            "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcStrings;",
            "Ljava/util/List<",
            "+",
            "Lqp/b;",
            ">;",
            "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;",
            "Ljava/lang/Integer;",
            "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$GovernmentIdNfcScanStyles;",
            ")V"
        }
    .end annotation

    const-string v0, "passportNfcReaderLauncher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sandboxFlags"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sdkFilesManager"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagManager"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cardAccessNumber"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mrzKey"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "passportNfcStrings"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "enabledDataGroups"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/nfc/b;->b:Lg/c;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/nfc/b;->c:Landroid/content/Context;

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/nfc/b;->d:Lwp/c;

    iput-object p4, p0, Lcom/withpersona/sdk2/inquiry/nfc/b;->e:Lqq/c;

    iput-object p5, p0, Lcom/withpersona/sdk2/inquiry/nfc/b;->f:Lgo/e;

    iput-object p6, p0, Lcom/withpersona/sdk2/inquiry/nfc/b;->g:Ljava/lang/String;

    iput-object p7, p0, Lcom/withpersona/sdk2/inquiry/nfc/b;->h:Lcom/withpersona/sdk2/inquiry/nfc/MrzKey;

    iput-object p8, p0, Lcom/withpersona/sdk2/inquiry/nfc/b;->i:Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcStrings;

    iput-object p9, p0, Lcom/withpersona/sdk2/inquiry/nfc/b;->j:Ljava/util/List;

    iput-object p10, p0, Lcom/withpersona/sdk2/inquiry/nfc/b;->k:Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;

    iput-object p11, p0, Lcom/withpersona/sdk2/inquiry/nfc/b;->l:Ljava/lang/Integer;

    iput-object p12, p0, Lcom/withpersona/sdk2/inquiry/nfc/b;->m:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$GovernmentIdNfcScanStyles;

    return-void
.end method

.method public static final synthetic d(Lcom/withpersona/sdk2/inquiry/nfc/b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/nfc/b;->g:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic e(Lcom/withpersona/sdk2/inquiry/nfc/b;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$GovernmentIdNfcScanStyles;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/nfc/b;->m:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$GovernmentIdNfcScanStyles;

    return-object p0
.end method

.method public static final synthetic f(Lcom/withpersona/sdk2/inquiry/nfc/b;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/nfc/b;->c:Landroid/content/Context;

    return-object p0
.end method

.method public static final synthetic g(Lcom/withpersona/sdk2/inquiry/nfc/b;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/nfc/b;->j:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic h(Lcom/withpersona/sdk2/inquiry/nfc/b;)Lgo/e;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/nfc/b;->f:Lgo/e;

    return-object p0
.end method

.method public static final synthetic i(Lcom/withpersona/sdk2/inquiry/nfc/b;)Lcom/withpersona/sdk2/inquiry/nfc/MrzKey;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/nfc/b;->h:Lcom/withpersona/sdk2/inquiry/nfc/MrzKey;

    return-object p0
.end method

.method public static final synthetic j(Lcom/withpersona/sdk2/inquiry/nfc/b;)Lg/c;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/nfc/b;->b:Lg/c;

    return-object p0
.end method

.method public static final synthetic k(Lcom/withpersona/sdk2/inquiry/nfc/b;)Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcStrings;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/nfc/b;->i:Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcStrings;

    return-object p0
.end method

.method public static final synthetic l(Lcom/withpersona/sdk2/inquiry/nfc/b;)Lwp/c;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/nfc/b;->d:Lwp/c;

    return-object p0
.end method

.method public static final synthetic m(Lcom/withpersona/sdk2/inquiry/nfc/b;)Lqq/c;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/nfc/b;->e:Lqq/c;

    return-object p0
.end method

.method public static final synthetic n(Lcom/withpersona/sdk2/inquiry/nfc/b;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/nfc/b;->k:Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;

    return-object p0
.end method

.method public static final synthetic o(Lcom/withpersona/sdk2/inquiry/nfc/b;)Ljava/lang/Integer;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/nfc/b;->l:Ljava/lang/Integer;

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

.method public b(Lym/o;)Z
    .locals 1
    .param p1    # Lym/o;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lym/o<",
            "*>;)Z"
        }
    .end annotation

    const-string v0, "otherWorker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p1, p1, Lcom/withpersona/sdk2/inquiry/nfc/b;

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

.method public run()Lnu/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnu/h<",
            "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/nfc/b$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/withpersona/sdk2/inquiry/nfc/b$b;-><init>(Lcom/withpersona/sdk2/inquiry/nfc/b;Lnt/b;)V

    invoke-static {v0}, Lnu/j;->w(Lkotlin/jvm/functions/Function2;)Lnu/h;

    move-result-object v0

    return-object v0
.end method
