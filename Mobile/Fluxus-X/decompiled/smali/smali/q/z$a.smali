.class public Lq/z$a;
.super Lq/o0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq/z;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILandroid/content/res/Resources$Theme;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic j:Lq/z$f;

.field public final synthetic k:Lq/z;


# direct methods
.method public constructor <init>(Lq/z;Landroid/view/View;Lq/z$f;)V
    .locals 0

    iput-object p1, p0, Lq/z$a;->k:Lq/z;

    iput-object p3, p0, Lq/z$a;->j:Lq/z$f;

    invoke-direct {p0, p2}, Lq/o0;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public b()Lp/f;
    .locals 1

    iget-object v0, p0, Lq/z$a;->j:Lq/z$f;

    return-object v0
.end method

.method public c()Z
    .locals 1

    iget-object v0, p0, Lq/z$a;->k:Lq/z;

    invoke-virtual {v0}, Lq/z;->getInternalPopup()Lq/z$h;

    move-result-object v0

    invoke-interface {v0}, Lq/z$h;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lq/z$a;->k:Lq/z;

    invoke-virtual {v0}, Lq/z;->b()V

    :cond_0
    const/4 v0, 0x1

    return v0
.end method
