.class public Lbh/y0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbh/y0;->J0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lbh/y0;


# direct methods
.method public constructor <init>(Lbh/y0;)V
    .locals 0

    iput-object p1, p0, Lbh/y0$a;->a:Lbh/y0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    iget-object p1, p0, Lbh/y0$a;->a:Lbh/y0;

    invoke-virtual {p1}, Lf4/q;->p()Lf4/v;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lf4/v;->l1()Lf4/k0;

    move-result-object p1

    invoke-virtual {p1}, Lf4/k0;->a1()V

    :cond_0
    return-void
.end method
