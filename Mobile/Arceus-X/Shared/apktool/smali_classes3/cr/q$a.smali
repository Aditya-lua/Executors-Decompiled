.class public final Lcr/q$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb7/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcr/q;->c(Lcom/withpersona/sdk2/inquiry/steps/ui/components/ESignatureComponent;Lcr/y4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature;)Landroidx/constraintlayout/widget/ConstraintLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0007*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0019\u0010\u0008\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u0006\u00a8\u0006\u000b"
    }
    d2 = {
        "cr/q$a",
        "Lb7/c;",
        "Lk6/n;",
        "placeholder",
        "",
        "b",
        "(Lk6/n;)V",
        "error",
        "a",
        "result",
        "c",
        "coil-core_release"
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
.field public final synthetic a:Lgr/w;

.field public final synthetic b:Lgr/w;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/steps/ui/components/ESignatureComponent;

.field public final synthetic d:Lgr/w;


# direct methods
.method public constructor <init>(Lgr/w;Lgr/w;Lcom/withpersona/sdk2/inquiry/steps/ui/components/ESignatureComponent;Lgr/w;)V
    .locals 0

    iput-object p1, p0, Lcr/q$a;->a:Lgr/w;

    iput-object p2, p0, Lcr/q$a;->b:Lgr/w;

    iput-object p3, p0, Lcr/q$a;->c:Lcom/withpersona/sdk2/inquiry/steps/ui/components/ESignatureComponent;

    iput-object p4, p0, Lcr/q$a;->d:Lgr/w;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lk6/n;)V
    .locals 1

    iget-object p1, p0, Lcr/q$a;->b:Lgr/w;

    iget-object p1, p1, Lgr/w;->b:Landroid/widget/TextView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public b(Lk6/n;)V
    .locals 1

    iget-object p1, p0, Lcr/q$a;->a:Lgr/w;

    iget-object p1, p1, Lgr/w;->b:Landroid/widget/TextView;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lcr/q$a;->a:Lgr/w;

    iget-object p1, p1, Lgr/w;->c:Landroid/widget/ImageView;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object p1, p0, Lcr/q$a;->a:Lgr/w;

    iget-object p1, p1, Lgr/w;->g:Landroid/widget/ImageView;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void
.end method

.method public c(Lk6/n;)V
    .locals 1

    instance-of v0, p1, Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v0, :cond_0

    check-cast p1, Landroid/graphics/drawable/BitmapDrawable;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v0, p0, Lcr/q$a;->c:Lcom/withpersona/sdk2/inquiry/steps/ui/components/ESignatureComponent;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/ESignatureComponent;->a()Ler/c;

    move-result-object v0

    invoke-virtual {v0, p1}, Ler/c;->c(Landroid/graphics/Bitmap;)V

    iget-object p1, p0, Lcr/q$a;->d:Lgr/w;

    iget-object p1, p1, Lgr/w;->g:Landroid/widget/ImageView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object p1, p0, Lcr/q$a;->d:Lgr/w;

    iget-object p1, p1, Lgr/w;->c:Landroid/widget/ImageView;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_1
    return-void
.end method
