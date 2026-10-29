.class public final Lcom/withpersona/sdk2/inquiry/internal/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvr/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/internal/k$a;,
        Lcom/withpersona/sdk2/inquiry/internal/k$b;,
        Lcom/withpersona/sdk2/inquiry/internal/k$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lvr/h<",
        "Lcom/withpersona/sdk2/inquiry/internal/k$c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008!\u0008\u0000\u0018\u0000 (2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0003!#=B\u007f\u0008\u0007\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\u0008\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0008\u0001\u0010\n\u001a\u00020\t\u0012\u0008\u0008\u0001\u0010\u000c\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u001dH\u0016\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u001b\u0010!\u001a\u00020\u000b2\n\u0010 \u001a\u0006\u0012\u0002\u0008\u00030\u0001H\u0016\u00a2\u0006\u0004\u0008!\u0010\"R\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008#\u0010$\u001a\u0004\u0008%\u0010&R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010$R\u0017\u0010\u0006\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\'\u0010$\u001a\u0004\u0008(\u0010&R\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008)\u0010*R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008+\u0010,R\u0014\u0010\u000c\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008-\u0010.R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008/\u00100R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00081\u00102R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00083\u00104R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00085\u00106R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00087\u00108R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00089\u0010:R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008;\u0010<\u00a8\u0006>"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/internal/k;",
        "Lvr/h;",
        "Lcom/withpersona/sdk2/inquiry/internal/k$c;",
        "",
        "sessionToken",
        "trackingEventsUrl",
        "inquiryId",
        "Lzo/a0;",
        "pollingMode",
        "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;",
        "inquirySessionConfig",
        "",
        "canReuseWorkflow",
        "Lgp/w;",
        "service",
        "Lyn/a;",
        "deviceIdProvider",
        "Lwp/c;",
        "sandboxFlags",
        "Ldp/i;",
        "fallbackModeManager",
        "Lkr/a;",
        "fontDownloader",
        "Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;",
        "themeManager",
        "Lcom/withpersona/sdk2/inquiry/internal/network/e;",
        "inquiryApiHelper",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzo/a0;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;ZLgp/w;Lyn/a;Lwp/c;Ldp/i;Lkr/a;Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;Lcom/withpersona/sdk2/inquiry/internal/network/e;)V",
        "Lnu/h;",
        "run",
        "()Lnu/h;",
        "otherWorker",
        "c",
        "(Lvr/h;)Z",
        "b",
        "Ljava/lang/String;",
        "p",
        "()Ljava/lang/String;",
        "d",
        "o",
        "e",
        "Lzo/a0;",
        "f",
        "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;",
        "g",
        "Z",
        "h",
        "Lgp/w;",
        "i",
        "Lyn/a;",
        "j",
        "Lwp/c;",
        "k",
        "Ldp/i;",
        "l",
        "Lkr/a;",
        "m",
        "Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;",
        "n",
        "Lcom/withpersona/sdk2/inquiry/internal/network/e;",
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


# static fields
.field public static final o:Lcom/withpersona/sdk2/inquiry/internal/k$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


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

.field public final e:Lzo/a0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public f:Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final g:Z

.field public final h:Lgp/w;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final i:Lyn/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final j:Lwp/c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final k:Ldp/i;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final l:Lkr/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final m:Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final n:Lcom/withpersona/sdk2/inquiry/internal/network/e;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/k$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/withpersona/sdk2/inquiry/internal/k$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/internal/k;->o:Lcom/withpersona/sdk2/inquiry/internal/k$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzo/a0;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;ZLgp/w;Lyn/a;Lwp/c;Ldp/i;Lkr/a;Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;Lcom/withpersona/sdk2/inquiry/internal/network/e;)V
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
    .param p4    # Lzo/a0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Lgp/w;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p8    # Lyn/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p9    # Lwp/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p10    # Ldp/i;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p11    # Lkr/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p12    # Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p13    # Lcom/withpersona/sdk2/inquiry/internal/network/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "sessionToken"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "inquiryId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pollingMode"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "inquirySessionConfig"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "service"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceIdProvider"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sandboxFlags"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fallbackModeManager"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fontDownloader"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "themeManager"

    invoke-static {p12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "inquiryApiHelper"

    invoke-static {p13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/k;->b:Ljava/lang/String;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/internal/k;->c:Ljava/lang/String;

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/internal/k;->d:Ljava/lang/String;

    iput-object p4, p0, Lcom/withpersona/sdk2/inquiry/internal/k;->e:Lzo/a0;

    iput-object p5, p0, Lcom/withpersona/sdk2/inquiry/internal/k;->f:Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;

    iput-boolean p6, p0, Lcom/withpersona/sdk2/inquiry/internal/k;->g:Z

    iput-object p7, p0, Lcom/withpersona/sdk2/inquiry/internal/k;->h:Lgp/w;

    iput-object p8, p0, Lcom/withpersona/sdk2/inquiry/internal/k;->i:Lyn/a;

    iput-object p9, p0, Lcom/withpersona/sdk2/inquiry/internal/k;->j:Lwp/c;

    iput-object p10, p0, Lcom/withpersona/sdk2/inquiry/internal/k;->k:Ldp/i;

    iput-object p11, p0, Lcom/withpersona/sdk2/inquiry/internal/k;->l:Lkr/a;

    iput-object p12, p0, Lcom/withpersona/sdk2/inquiry/internal/k;->m:Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;

    iput-object p13, p0, Lcom/withpersona/sdk2/inquiry/internal/k;->n:Lcom/withpersona/sdk2/inquiry/internal/network/e;

    return-void
.end method

.method public static final synthetic b(Lcom/withpersona/sdk2/inquiry/internal/k;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/withpersona/sdk2/inquiry/internal/k;->g:Z

    return p0
.end method

.method public static final synthetic d(Lcom/withpersona/sdk2/inquiry/internal/k;)Lyn/a;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/internal/k;->i:Lyn/a;

    return-object p0
.end method

.method public static final synthetic e(Lcom/withpersona/sdk2/inquiry/internal/k;)Ldp/i;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/internal/k;->k:Ldp/i;

    return-object p0
.end method

.method public static final synthetic f(Lcom/withpersona/sdk2/inquiry/internal/k;)Lkr/a;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/internal/k;->l:Lkr/a;

    return-object p0
.end method

.method public static final synthetic g(Lcom/withpersona/sdk2/inquiry/internal/k;)Lcom/withpersona/sdk2/inquiry/internal/network/e;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/internal/k;->n:Lcom/withpersona/sdk2/inquiry/internal/network/e;

    return-object p0
.end method

.method public static final synthetic h(Lcom/withpersona/sdk2/inquiry/internal/k;)Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/internal/k;->f:Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;

    return-object p0
.end method

.method public static final synthetic i(Lcom/withpersona/sdk2/inquiry/internal/k;)Lzo/a0;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/internal/k;->e:Lzo/a0;

    return-object p0
.end method

.method public static final synthetic j(Lcom/withpersona/sdk2/inquiry/internal/k;)Lwp/c;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/internal/k;->j:Lwp/c;

    return-object p0
.end method

.method public static final synthetic k(Lcom/withpersona/sdk2/inquiry/internal/k;)Lgp/w;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/internal/k;->h:Lgp/w;

    return-object p0
.end method

.method public static final synthetic l(Lcom/withpersona/sdk2/inquiry/internal/k;)Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/internal/k;->m:Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;

    return-object p0
.end method

.method public static final synthetic m(Lcom/withpersona/sdk2/inquiry/internal/k;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/internal/k;->c:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic n(Lcom/withpersona/sdk2/inquiry/internal/k;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;)V
    .locals 0

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/k;->f:Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;

    return-void
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
    .locals 2
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

    const-string v0, "otherWorker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/internal/k;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/k;->b:Ljava/lang/String;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/internal/k;

    iget-object v1, p1, Lcom/withpersona/sdk2/inquiry/internal/k;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/k;->d:Ljava/lang/String;

    iget-object v1, p1, Lcom/withpersona/sdk2/inquiry/internal/k;->d:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/k;->e:Lzo/a0;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/internal/k;->e:Lzo/a0;

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final o()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/k;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final p()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/k;->b:Ljava/lang/String;

    return-object v0
.end method

.method public run()Lnu/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnu/h<",
            "Lcom/withpersona/sdk2/inquiry/internal/k$c;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/k$d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/withpersona/sdk2/inquiry/internal/k$d;-><init>(Lcom/withpersona/sdk2/inquiry/internal/k;Lnt/b;)V

    invoke-static {v0}, Lnu/j;->w(Lkotlin/jvm/functions/Function2;)Lnu/h;

    move-result-object v0

    return-object v0
.end method
