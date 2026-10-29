.class public final Lih/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr5/a;


# instance fields
.field public final a:Landroid/widget/LinearLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final b:Landroid/widget/TextView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final c:Landroid/widget/TextView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final d:Lcom/roblox/client/components/RbxTextView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final e:Lcom/roblox/client/components/RbxButton;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final f:Lcom/roblox/client/components/RbxButton;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final g:Lcom/roblox/client/components/RbxButton;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final h:Lcom/roblox/client/components/RbxTextView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/roblox/client/components/RbxTextView;Lcom/roblox/client/components/RbxButton;Lcom/roblox/client/components/RbxButton;Lcom/roblox/client/components/RbxButton;Lcom/roblox/client/components/RbxTextView;)V
    .locals 0
    .param p1    # Landroid/widget/LinearLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/widget/TextView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Landroid/widget/TextView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/roblox/client/components/RbxTextView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Lcom/roblox/client/components/RbxButton;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p6    # Lcom/roblox/client/components/RbxButton;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p7    # Lcom/roblox/client/components/RbxButton;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p8    # Lcom/roblox/client/components/RbxTextView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lih/a;->a:Landroid/widget/LinearLayout;

    iput-object p2, p0, Lih/a;->b:Landroid/widget/TextView;

    iput-object p3, p0, Lih/a;->c:Landroid/widget/TextView;

    iput-object p4, p0, Lih/a;->d:Lcom/roblox/client/components/RbxTextView;

    iput-object p5, p0, Lih/a;->e:Lcom/roblox/client/components/RbxButton;

    iput-object p6, p0, Lih/a;->f:Lcom/roblox/client/components/RbxButton;

    iput-object p7, p0, Lih/a;->g:Lcom/roblox/client/components/RbxButton;

    iput-object p8, p0, Lih/a;->h:Lcom/roblox/client/components/RbxTextView;

    return-void
.end method

.method public static a(Landroid/view/View;)Lih/a;
    .locals 11
    .param p0    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    sget v0, Lsg/m0;->l:I

    invoke-static {p0, v0}, Lr5/b;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Landroid/widget/TextView;

    if-eqz v4, :cond_0

    sget v0, Lsg/m0;->m:I

    invoke-static {p0, v0}, Lr5/b;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Landroid/widget/TextView;

    if-eqz v5, :cond_0

    sget v0, Lsg/m0;->n:I

    invoke-static {p0, v0}, Lr5/b;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Lcom/roblox/client/components/RbxTextView;

    if-eqz v6, :cond_0

    sget v0, Lsg/m0;->o:I

    invoke-static {p0, v0}, Lr5/b;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Lcom/roblox/client/components/RbxButton;

    if-eqz v7, :cond_0

    sget v0, Lsg/m0;->p:I

    invoke-static {p0, v0}, Lr5/b;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Lcom/roblox/client/components/RbxButton;

    if-eqz v8, :cond_0

    sget v0, Lsg/m0;->q:I

    invoke-static {p0, v0}, Lr5/b;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Lcom/roblox/client/components/RbxButton;

    if-eqz v9, :cond_0

    sget v0, Lsg/m0;->a0:I

    invoke-static {p0, v0}, Lr5/b;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Lcom/roblox/client/components/RbxTextView;

    if-eqz v10, :cond_0

    new-instance v2, Lih/a;

    move-object v3, p0

    check-cast v3, Landroid/widget/LinearLayout;

    invoke-direct/range {v2 .. v10}, Lih/a;-><init>(Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/roblox/client/components/RbxTextView;Lcom/roblox/client/components/RbxButton;Lcom/roblox/client/components/RbxButton;Lcom/roblox/client/components/RbxButton;Lcom/roblox/client/components/RbxTextView;)V

    return-object v2

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

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

.method public static c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lih/a;
    .locals 2
    .param p0    # Landroid/view/LayoutInflater;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    sget v0, Lsg/n0;->g:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_0
    invoke-static {p0}, Lih/a;->a(Landroid/view/View;)Lih/a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b()Landroid/widget/LinearLayout;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lih/a;->a:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p0}, Lih/a;->b()Landroid/widget/LinearLayout;

    move-result-object v0

    return-object v0
.end method
