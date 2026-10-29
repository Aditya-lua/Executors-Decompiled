.class public final Lcom/withpersona/sdk2/camera/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfn/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/camera/e$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001:\u0001\"BI\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0001\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0001\u0010\u000b\u001a\u00020\n\u0012\u0008\u0008\u0001\u0010\r\u001a\u00020\u000c\u0012\u0008\u0008\u0001\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u0014J\u0016\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u001aH\u0096@\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0016\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u001aH\u0096@\u00a2\u0006\u0004\u0008\u001e\u0010\u001dJ\u0016\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u001aH\u0096@\u00a2\u0006\u0004\u0008\u001f\u0010\u001dJ\u0017\u0010!\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008!\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010&R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\'\u0010(R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010)\u001a\u0004\u0008*\u0010+R\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010,R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008-\u0010.R\u0016\u0010/\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010.R\u0016\u00100\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010.R\u001c\u00104\u001a\u0008\u0012\u0004\u0012\u000202018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001e\u00103R\u001a\u00107\u001a\u0008\u0012\u0004\u0012\u000202058VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008$\u00106R\u0014\u0010:\u001a\u0002088VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\"\u00109R\u0014\u0010<\u001a\u00020\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008-\u0010;\u00a8\u0006="
    }
    d2 = {
        "Lcom/withpersona/sdk2/camera/e;",
        "Lfn/g;",
        "Landroid/content/Context;",
        "context",
        "Lln/a;",
        "cameraStatsManager",
        "Lqq/c;",
        "sdkFilesManager",
        "Lcom/withpersona/sdk2/camera/b;",
        "cameraPreview",
        "Landroidx/camera/view/PreviewView;",
        "previewView",
        "Lfn/s;",
        "cameraXBinder",
        "",
        "isAudioRequired",
        "<init>",
        "(Landroid/content/Context;Lln/a;Lqq/c;Lcom/withpersona/sdk2/camera/b;Landroidx/camera/view/PreviewView;Lfn/s;Z)V",
        "",
        "h",
        "()V",
        "destroy",
        "enable",
        "c",
        "(Z)V",
        "e",
        "Ljt/n;",
        "Ljava/io/File;",
        "k",
        "(Lnt/b;)Ljava/lang/Object;",
        "j",
        "i",
        "enableAnalyzer",
        "f",
        "a",
        "Landroid/content/Context;",
        "b",
        "Lln/a;",
        "Lqq/c;",
        "d",
        "Lcom/withpersona/sdk2/camera/b;",
        "Landroidx/camera/view/PreviewView;",
        "n",
        "()Landroidx/camera/view/PreviewView;",
        "Lfn/s;",
        "g",
        "Z",
        "isBound",
        "recordingStarted",
        "Lnu/c0;",
        "Lcom/withpersona/sdk2/camera/d;",
        "Lnu/c0;",
        "_previewState",
        "Lnu/p0;",
        "()Lnu/p0;",
        "cameraState",
        "Lcom/withpersona/sdk2/camera/CameraProperties;",
        "()Lcom/withpersona/sdk2/camera/CameraProperties;",
        "cameraProperties",
        "()Z",
        "isRecordingLocally",
        "camera_release"
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
.field public final a:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lln/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lqq/c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Lcom/withpersona/sdk2/camera/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final e:Landroidx/camera/view/PreviewView;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final f:Lfn/s;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final g:Z

.field public h:Z

.field public volatile i:Z

.field public j:Lnu/c0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnu/c0<",
            "Lcom/withpersona/sdk2/camera/d;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lln/a;Lqq/c;Lcom/withpersona/sdk2/camera/b;Landroidx/camera/view/PreviewView;Lfn/s;Z)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lln/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lqq/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/withpersona/sdk2/camera/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Landroidx/camera/view/PreviewView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lfn/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cameraStatsManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sdkFilesManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cameraPreview"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "previewView"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cameraXBinder"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/camera/e;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/withpersona/sdk2/camera/e;->b:Lln/a;

    iput-object p3, p0, Lcom/withpersona/sdk2/camera/e;->c:Lqq/c;

    iput-object p4, p0, Lcom/withpersona/sdk2/camera/e;->d:Lcom/withpersona/sdk2/camera/b;

    iput-object p5, p0, Lcom/withpersona/sdk2/camera/e;->e:Landroidx/camera/view/PreviewView;

    iput-object p6, p0, Lcom/withpersona/sdk2/camera/e;->f:Lfn/s;

    iput-boolean p7, p0, Lcom/withpersona/sdk2/camera/e;->g:Z

    sget-object p1, Lcom/withpersona/sdk2/camera/d$c;->a:Lcom/withpersona/sdk2/camera/d$c;

    invoke-static {p1}, Lnu/r0;->a(Ljava/lang/Object;)Lnu/c0;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/camera/e;->j:Lnu/c0;

    return-void
.end method

.method public static final synthetic l(Lcom/withpersona/sdk2/camera/e;)Lln/a;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/camera/e;->b:Lln/a;

    return-object p0
.end method

.method public static final synthetic m(Lcom/withpersona/sdk2/camera/e;)Lnu/c0;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/camera/e;->j:Lnu/c0;

    return-object p0
.end method


# virtual methods
.method public a()Lcom/withpersona/sdk2/camera/CameraProperties;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/camera/e;->d:Lcom/withpersona/sdk2/camera/b;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/camera/b;->e()Lcom/withpersona/sdk2/camera/CameraProperties;

    move-result-object v0

    return-object v0
.end method

.method public b()Lnu/p0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnu/p0<",
            "Lcom/withpersona/sdk2/camera/d;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/camera/e;->j:Lnu/c0;

    return-object v0
.end method

.method public c(Z)V
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/camera/e;->d:Lcom/withpersona/sdk2/camera/b;

    invoke-virtual {v0, p1}, Lcom/withpersona/sdk2/camera/b;->c(Z)V

    return-void
.end method

.method public bridge synthetic d()Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Lcom/withpersona/sdk2/camera/e;->n()Landroidx/camera/view/PreviewView;

    move-result-object v0

    return-object v0
.end method

.method public destroy()V
    .locals 0

    return-void
.end method

.method public e()V
    .locals 2

    iget-object v0, p0, Lcom/withpersona/sdk2/camera/e;->d:Lcom/withpersona/sdk2/camera/b;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/camera/e;->n()Landroidx/camera/view/PreviewView;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/withpersona/sdk2/camera/b;->d(Landroidx/camera/view/PreviewView;)V

    return-void
.end method

.method public f(Z)V
    .locals 0

    return-void
.end method

.method public g()Z
    .locals 1

    iget-boolean v0, p0, Lcom/withpersona/sdk2/camera/e;->i:Z

    return v0
.end method

.method public h()V
    .locals 2

    iget-boolean v0, p0, Lcom/withpersona/sdk2/camera/e;->h:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/withpersona/sdk2/camera/e;->j:Lnu/c0;

    sget-object v1, Lcom/withpersona/sdk2/camera/d$d;->a:Lcom/withpersona/sdk2/camera/d$d;

    invoke-interface {v0, v1}, Lnu/c0;->setValue(Ljava/lang/Object;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/withpersona/sdk2/camera/e;->h:Z

    iget-object v0, p0, Lcom/withpersona/sdk2/camera/e;->f:Lfn/s;

    invoke-interface {v0}, Lfn/s;->a()V

    invoke-virtual {p0}, Lcom/withpersona/sdk2/camera/e;->n()Landroidx/camera/view/PreviewView;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/camera/view/PreviewView;->getPreviewStreamState()Landroidx/lifecycle/a0;

    move-result-object v0

    new-instance v1, Lcom/withpersona/sdk2/camera/e$b;

    invoke-direct {v1, p0}, Lcom/withpersona/sdk2/camera/e$b;-><init>(Lcom/withpersona/sdk2/camera/e;)V

    invoke-virtual {v0, v1}, Landroidx/lifecycle/a0;->j(Landroidx/lifecycle/e0;)V

    invoke-virtual {p0}, Lcom/withpersona/sdk2/camera/e;->n()Landroidx/camera/view/PreviewView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/withpersona/sdk2/camera/e;->b:Lln/a;

    invoke-interface {v0}, Lln/a;->d()V

    :cond_1
    invoke-virtual {p0}, Lcom/withpersona/sdk2/camera/e;->n()Landroidx/camera/view/PreviewView;

    move-result-object v0

    new-instance v1, Lcom/withpersona/sdk2/camera/e$c;

    invoke-direct {v1, p0}, Lcom/withpersona/sdk2/camera/e$c;-><init>(Lcom/withpersona/sdk2/camera/e;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    return-void
.end method

.method public i(Lnt/b;)Ljava/lang/Object;
    .locals 4
    .param p1    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnt/b<",
            "-",
            "Ljt/n<",
            "+",
            "Ljava/io/File;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of v0, p1, Lcom/withpersona/sdk2/camera/e$d;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/withpersona/sdk2/camera/e$d;

    iget v1, v0, Lcom/withpersona/sdk2/camera/e$d;->v:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/withpersona/sdk2/camera/e$d;->v:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/withpersona/sdk2/camera/e$d;

    invoke-direct {v0, p0, p1}, Lcom/withpersona/sdk2/camera/e$d;-><init>(Lcom/withpersona/sdk2/camera/e;Lnt/b;)V

    :goto_0
    iget-object p1, v0, Lcom/withpersona/sdk2/camera/e$d;->t:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/withpersona/sdk2/camera/e$d;->v:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    check-cast p1, Ljt/n;

    invoke-virtual {p1}, Ljt/n;->j()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-boolean p1, p0, Lcom/withpersona/sdk2/camera/e;->i:Z

    if-nez p1, :cond_3

    sget-object p1, Ljt/n;->b:Ljt/n$a;

    new-instance p1, Lfn/h0;

    invoke-direct {p1}, Lfn/h0;-><init>()V

    invoke-static {p1}, Ljt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_3
    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/withpersona/sdk2/camera/e;->i:Z

    iget-object p1, p0, Lcom/withpersona/sdk2/camera/e;->d:Lcom/withpersona/sdk2/camera/b;

    iput v3, v0, Lcom/withpersona/sdk2/camera/e$d;->v:I

    invoke-virtual {p1, v0}, Lcom/withpersona/sdk2/camera/b;->l(Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    return-object p1
.end method

.method public j(Lnt/b;)Ljava/lang/Object;
    .locals 2
    .param p1    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnt/b<",
            "-",
            "Ljt/n<",
            "Ljava/lang/Boolean;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-boolean p1, p0, Lcom/withpersona/sdk2/camera/e;->i:Z

    if-eqz p1, :cond_0

    sget-object p1, Ljt/n;->b:Ljt/n$a;

    const/4 p1, 0x0

    invoke-static {p1}, Lpt/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p1}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    :try_start_0
    iget-object p1, p0, Lcom/withpersona/sdk2/camera/e;->d:Lcom/withpersona/sdk2/camera/b;

    iget-object v0, p0, Lcom/withpersona/sdk2/camera/e;->a:Landroid/content/Context;

    iget-boolean v1, p0, Lcom/withpersona/sdk2/camera/e;->g:Z

    invoke-virtual {p1, v0, v1}, Lcom/withpersona/sdk2/camera/b;->k(Landroid/content/Context;Z)Z

    move-result p1
    :try_end_0
    .catch Lfn/d0; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/withpersona/sdk2/camera/e;->i:Z

    :cond_1
    sget-object v0, Ljt/n;->b:Ljt/n$a;

    invoke-static {p1}, Lpt/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p1}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    sget-object v0, Ljt/n;->b:Ljt/n$a;

    invoke-static {p1}, Ljt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public k(Lnt/b;)Ljava/lang/Object;
    .locals 4
    .param p1    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnt/b<",
            "-",
            "Ljt/n<",
            "+",
            "Ljava/io/File;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of v0, p1, Lcom/withpersona/sdk2/camera/e$e;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/withpersona/sdk2/camera/e$e;

    iget v1, v0, Lcom/withpersona/sdk2/camera/e$e;->v:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/withpersona/sdk2/camera/e$e;->v:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/withpersona/sdk2/camera/e$e;

    invoke-direct {v0, p0, p1}, Lcom/withpersona/sdk2/camera/e$e;-><init>(Lcom/withpersona/sdk2/camera/e;Lnt/b;)V

    :goto_0
    iget-object p1, v0, Lcom/withpersona/sdk2/camera/e$e;->t:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/withpersona/sdk2/camera/e$e;->v:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    check-cast p1, Ljt/n;

    invoke-virtual {p1}, Ljt/n;->j()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/withpersona/sdk2/camera/e;->d:Lcom/withpersona/sdk2/camera/b;

    iget-object v2, p0, Lcom/withpersona/sdk2/camera/e;->c:Lqq/c;

    iput v3, v0, Lcom/withpersona/sdk2/camera/e$e;->v:I

    invoke-virtual {p1, v2, v0}, Lcom/withpersona/sdk2/camera/b;->m(Lqq/c;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method

.method public n()Landroidx/camera/view/PreviewView;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/camera/e;->e:Landroidx/camera/view/PreviewView;

    return-object v0
.end method
