.class public final Laq/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr5/a;


# instance fields
.field public final a:Landroid/view/View;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final b:Landroid/view/View;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final c:Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2CircleMaskView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final d:Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final e:Landroid/widget/ImageView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final f:Landroid/view/View;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final g:Landroid/view/View;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final h:Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/view/View;Landroid/view/View;Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2CircleMaskView;Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;Landroid/widget/ImageView;Landroid/view/View;Landroid/view/View;Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;)V
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2CircleMaskView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Landroid/widget/ImageView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p6    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p7    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p8    # Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Laq/b;->a:Landroid/view/View;

    iput-object p2, p0, Laq/b;->b:Landroid/view/View;

    iput-object p3, p0, Laq/b;->c:Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2CircleMaskView;

    iput-object p4, p0, Laq/b;->d:Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;

    iput-object p5, p0, Laq/b;->e:Landroid/widget/ImageView;

    iput-object p6, p0, Laq/b;->f:Landroid/view/View;

    iput-object p7, p0, Laq/b;->g:Landroid/view/View;

    iput-object p8, p0, Laq/b;->h:Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;

    return-void
.end method

.method public static a(Landroid/view/View;)Laq/b;
    .locals 10
    .param p0    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    sget v0, Lyp/r;->d:I

    invoke-static {p0, v0}, Lr5/b;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v3

    if-eqz v3, :cond_0

    sget v0, Lyp/r;->l:I

    invoke-static {p0, v0}, Lr5/b;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2CircleMaskView;

    if-eqz v4, :cond_0

    sget v0, Lyp/r;->t:I

    invoke-static {p0, v0}, Lr5/b;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;

    if-eqz v5, :cond_0

    sget v0, Lyp/r;->u:I

    invoke-static {p0, v0}, Lr5/b;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Landroid/widget/ImageView;

    if-eqz v6, :cond_0

    sget v0, Lyp/r;->y:I

    invoke-static {p0, v0}, Lr5/b;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v7

    if-eqz v7, :cond_0

    sget v0, Lyp/r;->A:I

    invoke-static {p0, v0}, Lr5/b;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v8

    if-eqz v8, :cond_0

    sget v0, Lyp/r;->M:I

    invoke-static {p0, v0}, Lr5/b;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;

    if-eqz v9, :cond_0

    new-instance v1, Laq/b;

    move-object v2, p0

    invoke-direct/range {v1 .. v9}, Laq/b;-><init>(Landroid/view/View;Landroid/view/View;Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2CircleMaskView;Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;Landroid/widget/ImageView;Landroid/view/View;Landroid/view/View;Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;)V

    return-object v1

    :cond_0
    move-object v2, p0

    invoke-virtual {v2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Missing required view with ID: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static b(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Laq/b;
    .locals 1
    .param p0    # Landroid/view/LayoutInflater;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    if-eqz p1, :cond_0

    sget v0, Lyp/s;->b:I

    invoke-virtual {p0, v0, p1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    invoke-static {p1}, Laq/b;->a(Landroid/view/View;)Laq/b;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "parent"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public getRoot()Landroid/view/View;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Laq/b;->a:Landroid/view/View;

    return-object v0
.end method
