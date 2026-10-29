.class public final Lgr/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr5/a;


# instance fields
.field public final a:Lcom/withpersona/sdk2/inquiry/shared/ui/PersonaTextInputLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final b:Lcom/withpersona/sdk2/inquiry/shared/ui/PersonaTextInputLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final c:Landroid/widget/AutoCompleteTextView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/shared/ui/PersonaTextInputLayout;Lcom/withpersona/sdk2/inquiry/shared/ui/PersonaTextInputLayout;Landroid/widget/AutoCompleteTextView;)V
    .locals 0
    .param p1    # Lcom/withpersona/sdk2/inquiry/shared/ui/PersonaTextInputLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/withpersona/sdk2/inquiry/shared/ui/PersonaTextInputLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Landroid/widget/AutoCompleteTextView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgr/s;->a:Lcom/withpersona/sdk2/inquiry/shared/ui/PersonaTextInputLayout;

    iput-object p2, p0, Lgr/s;->b:Lcom/withpersona/sdk2/inquiry/shared/ui/PersonaTextInputLayout;

    iput-object p3, p0, Lgr/s;->c:Landroid/widget/AutoCompleteTextView;

    return-void
.end method

.method public static a(Landroid/view/View;)Lgr/s;
    .locals 3
    .param p0    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    move-object v0, p0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/shared/ui/PersonaTextInputLayout;

    sget v1, Lar/d;->J0:I

    invoke-static {p0, v1}, Lr5/b;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/AutoCompleteTextView;

    if-eqz v2, :cond_0

    new-instance p0, Lgr/s;

    invoke-direct {p0, v0, v0, v2}, Lgr/s;-><init>(Lcom/withpersona/sdk2/inquiry/shared/ui/PersonaTextInputLayout;Lcom/withpersona/sdk2/inquiry/shared/ui/PersonaTextInputLayout;Landroid/widget/AutoCompleteTextView;)V

    return-object p0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Missing required view with ID: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static c(Landroid/view/LayoutInflater;)Lgr/s;
    .locals 2
    .param p0    # Landroid/view/LayoutInflater;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lgr/s;->d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lgr/s;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lgr/s;
    .locals 2
    .param p0    # Landroid/view/LayoutInflater;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    sget v0, Lar/e;->t:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_0
    invoke-static {p0}, Lgr/s;->a(Landroid/view/View;)Lgr/s;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b()Lcom/withpersona/sdk2/inquiry/shared/ui/PersonaTextInputLayout;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lgr/s;->a:Lcom/withpersona/sdk2/inquiry/shared/ui/PersonaTextInputLayout;

    return-object v0
.end method

.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p0}, Lgr/s;->b()Lcom/withpersona/sdk2/inquiry/shared/ui/PersonaTextInputLayout;

    move-result-object v0

    return-object v0
.end method
