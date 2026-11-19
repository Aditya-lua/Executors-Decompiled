.class public Lq/z$f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq/z$f;-><init>(Lq/z;Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lq/z;

.field public final synthetic b:Lq/z$f;


# direct methods
.method public constructor <init>(Lq/z$f;Lq/z;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lq/z$f$a;->b:Lq/z$f;

    iput-object p2, p0, Lq/z$f$a;->a:Lq/z;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    iget-object p1, p0, Lq/z$f$a;->b:Lq/z$f;

    iget-object p1, p1, Lq/z$f;->M:Lq/z;

    invoke-virtual {p1, p3}, Landroid/widget/AdapterView;->setSelection(I)V

    iget-object p1, p0, Lq/z$f$a;->b:Lq/z$f;

    iget-object p1, p1, Lq/z$f;->M:Lq/z;

    invoke-virtual {p1}, Landroid/widget/AdapterView;->getOnItemClickListener()Landroid/widget/AdapterView$OnItemClickListener;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lq/z$f$a;->b:Lq/z$f;

    iget-object p4, p1, Lq/z$f;->M:Lq/z;

    iget-object p1, p1, Lq/z$f;->J:Landroid/widget/ListAdapter;

    invoke-interface {p1, p3}, Landroid/widget/Adapter;->getItemId(I)J

    move-result-wide v0

    invoke-virtual {p4, p2, p3, v0, v1}, Landroid/widget/AdapterView;->performItemClick(Landroid/view/View;IJ)Z

    :cond_0
    iget-object p1, p0, Lq/z$f$a;->b:Lq/z$f;

    invoke-virtual {p1}, Lq/p0;->dismiss()V

    return-void
.end method
