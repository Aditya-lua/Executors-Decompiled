.class public Lsg/y0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsg/y0;->J0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lsg/y0;


# direct methods
.method public constructor <init>(Lsg/y0;)V
    .locals 0

    iput-object p1, p0, Lsg/y0$a;->a:Lsg/y0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    iget-object p1, p0, Lsg/y0$a;->a:Lsg/y0;

    invoke-virtual {p1}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Le4/q;->l1()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->a1()V

    :cond_0
    return-void
.end method
