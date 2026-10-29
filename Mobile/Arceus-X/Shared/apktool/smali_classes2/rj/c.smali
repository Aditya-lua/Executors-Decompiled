.class public final Lrj/c;
.super Landroidx/fragment/app/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrj/c$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0006\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J+\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00132\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u001d\u0010\u001c\u001a\u00020\u000e2\u000c\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002\u00a2\u0006\u0004\u0008\u001c\u0010\u001d\u00a8\u0006 "
    }
    d2 = {
        "Lrj/c;",
        "Landroidx/fragment/app/c;",
        "<init>",
        "()V",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Landroid/view/View;",
        "J0",
        "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;",
        "view",
        "",
        "e1",
        "(Landroid/view/View;Landroid/os/Bundle;)V",
        "Landroid/content/Context;",
        "context",
        "Lku/l0;",
        "mainDispatcher",
        "workerDispatcher",
        "Lp1/l;",
        "g2",
        "(Landroid/content/Context;Lku/l0;Lku/l0;)Lp1/l;",
        "Ljt/n;",
        "",
        "result",
        "f2",
        "(Ljava/lang/Object;)V",
        "f0",
        "a",
        "NativeShell_googleProdRelease"
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
.field public static final f0:Lrj/c$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lrj/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lrj/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lrj/c;->f0:Lrj/c$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/fragment/app/c;-><init>()V

    return-void
.end method

.method public static synthetic b2(Lcom/google/mlkit/vision/barcode/BarcodeScanner;Lrj/c;Le1/c$a;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lrj/c;->i2(Lcom/google/mlkit/vision/barcode/BarcodeScanner;Lrj/c;Le1/c$a;)V

    return-void
.end method

.method public static synthetic c2(Lrj/c;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lrj/c;->e2(Lrj/c;Landroid/view/View;)V

    return-void
.end method

.method public static final d2(Ljava/lang/String;)Lrj/c;
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lrj/c;->f0:Lrj/c$a;

    invoke-virtual {v0, p0}, Lrj/c$a;->a(Ljava/lang/String;)Lrj/c;

    move-result-object p0

    return-object p0
.end method

.method public static final e2(Lrj/c;Landroid/view/View;)V
    .locals 0

    sget-object p1, Ljt/n;->b:Ljt/n$a;

    new-instance p1, Ljava/lang/Exception;

    invoke-direct {p1}, Ljava/lang/Exception;-><init>()V

    invoke-static {p1}, Ljt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Lrj/c;->f2(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic h2(Lrj/c;Landroid/content/Context;Lku/l0;Lku/l0;ILjava/lang/Object;)Lp1/l;
    .locals 1

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    invoke-static {}, Lku/g1;->c()Lku/n2;

    move-result-object p2

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    invoke-static {}, Lku/g1;->b()Lku/l0;

    move-result-object p3

    const/4 p4, 0x1

    const/4 p5, 0x0

    const/4 v0, 0x2

    invoke-static {p3, p4, p5, v0, p5}, Lku/l0;->U(Lku/l0;ILjava/lang/String;ILjava/lang/Object;)Lku/l0;

    move-result-object p3

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lrj/c;->g2(Landroid/content/Context;Lku/l0;Lku/l0;)Lp1/l;

    move-result-object p0

    return-object p0
.end method

.method public static final i2(Lcom/google/mlkit/vision/barcode/BarcodeScanner;Lrj/c;Le1/c$a;)V
    .locals 3

    invoke-virtual {p2, p0}, Le1/c$a;->c(Lcom/google/mlkit/vision/interfaces/Detector;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/mlkit/vision/barcode/common/Barcode;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p2, p0}, Le1/c$a;->b(Lcom/google/mlkit/vision/interfaces/Detector;)Ljava/lang/Throwable;

    move-result-object p0

    const-string p2, "CustomCaptureFrag"

    if-eqz v0, :cond_2

    const-string p0, "Barcode scanning succeeded."

    invoke-static {p2, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p0, Ljt/n;->b:Ljt/n$a;

    invoke-virtual {v0}, Lcom/google/mlkit/vision/barcode/common/Barcode;->getRawValue()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_1

    const-string p0, ""

    :cond_1
    invoke-static {p0}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {p1, p0}, Lrj/c;->f2(Ljava/lang/Object;)V

    return-void

    :cond_2
    if-eqz p0, :cond_3

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Barcode scanning failed: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    sget-object p2, Ljt/n;->b:Ljt/n$a;

    invoke-static {p0}, Ljt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {p1, p0}, Lrj/c;->f2(Ljava/lang/Object;)V

    return-void

    :cond_3
    const-string p0, "No barcode detected."

    invoke-static {p2, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method


# virtual methods
.method public J0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1
    .param p1    # Landroid/view/LayoutInflater;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string p3, "inflater"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget p3, Lsg/n0;->h:I

    const/4 v0, 0x0

    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const-string p2, "inflate(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public e1(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 6
    .param p1    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string p2, "view"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget p2, Lsg/m0;->f:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    new-instance v0, Lrj/a;

    invoke-direct {v0, p0}, Lrj/a;-><init>(Lrj/c;)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object p2

    invoke-virtual {p0}, Landroidx/fragment/app/c;->t()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "FONT_PATH_MESSAGE"

    if-eqz v0, :cond_0

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v2

    invoke-interface {v2}, Lth/i;->e1()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {v1}, Lgk/d;->a(Ljava/lang/String;)V

    :cond_1
    invoke-static {p2, v0}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object p2

    sget v0, Lsg/m0;->Y:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v1, Lsg/m0;->g0:I

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    invoke-virtual {v1, p2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    sget p2, Lsg/m0;->Z:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroidx/camera/view/PreviewView;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string p1, "getContext(...)"

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lrj/c;->h2(Lrj/c;Landroid/content/Context;Lku/l0;Lku/l0;ILjava/lang/Object;)Lp1/l;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/fragment/app/c;->k0()Landroidx/lifecycle/s;

    move-result-object v0

    invoke-virtual {p1, v0}, Lp1/l;->X(Landroidx/lifecycle/s;)V

    invoke-virtual {p2, p1}, Landroidx/camera/view/PreviewView;->setController(Lp1/i;)V

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "FONT_PATH_MESSAGE not set"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final f2(Ljava/lang/Object;)V
    .locals 4

    invoke-virtual {p0}, Landroidx/fragment/app/c;->p0()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroidx/fragment/app/c;->M()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "BundleKey_success"

    invoke-static {p1}, Ljt/n;->h(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    invoke-static {p1}, Ljt/n;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 p1, 0x0

    :cond_0
    check-cast p1, Ljava/lang/String;

    const-string v2, "BundleKey_urlString"

    invoke-virtual {v1, v2, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    const-string p1, "QrCode_requestKey"

    invoke-virtual {v0, p1, v1}, Landroidx/fragment/app/FragmentManager;->s1(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_1
    return-void
.end method

.method public final g2(Landroid/content/Context;Lku/l0;Lku/l0;)Lp1/l;
    .locals 5

    new-instance v0, Lp1/l;

    invoke-direct {v0, p1}, Lp1/l;-><init>(Landroid/content/Context;)V

    new-instance p1, Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions$Builder;

    invoke-direct {p1}, Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions$Builder;-><init>()V

    const/4 v1, 0x0

    new-array v2, v1, [I

    const/16 v3, 0x100

    invoke-virtual {p1, v3, v2}, Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions$Builder;->setBarcodeFormats(I[I)Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions$Builder;->build()Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions;

    move-result-object p1

    invoke-static {p1}, Lcom/google/mlkit/vision/barcode/BarcodeScanning;->getClient(Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions;)Lcom/google/mlkit/vision/barcode/BarcodeScanner;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/fragment/app/c;->a()Landroidx/lifecycle/l;

    move-result-object v2

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, p1}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    const-string v2, "also(...)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3}, Lku/v1;->a(Lku/l0;)Ljava/util/concurrent/Executor;

    move-result-object p3

    new-instance v2, Le1/c;

    invoke-static {p1}, Lkotlin/collections/o;->d(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-static {p2}, Lku/v1;->a(Lku/l0;)Ljava/util/concurrent/Executor;

    move-result-object p2

    new-instance v4, Lrj/b;

    invoke-direct {v4, p1, p0}, Lrj/b;-><init>(Lcom/google/mlkit/vision/barcode/BarcodeScanner;Lrj/c;)V

    const/4 p1, 0x1

    invoke-direct {v2, v3, p1, p2, v4}, Le1/c;-><init>(Ljava/util/List;ILjava/util/concurrent/Executor;Lx2/a;)V

    invoke-virtual {v0, p3, v2}, Lp1/i;->D(Ljava/util/concurrent/Executor;Lg0/u0$a;)V

    new-instance p1, La1/c$a;

    invoke-direct {p1}, La1/c$a;-><init>()V

    new-instance p2, La1/d;

    new-instance p3, Landroid/util/Size;

    const/16 v2, 0x500

    const/16 v3, 0x2d0

    invoke-direct {p3, v2, v3}, Landroid/util/Size;-><init>(II)V

    invoke-direct {p2, p3, v1}, La1/d;-><init>(Landroid/util/Size;I)V

    invoke-virtual {p1, p2}, La1/c$a;->f(La1/d;)La1/c$a;

    move-result-object p1

    invoke-virtual {p1}, La1/c$a;->a()La1/c;

    move-result-object p1

    invoke-virtual {v0, p1}, Lp1/i;->E(La1/c;)V

    return-object v0
.end method
