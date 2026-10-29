.class public final synthetic Lhp/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lhp/n0;

.field public final synthetic b:Lbp/c;


# direct methods
.method public synthetic constructor <init>(Lhp/n0;Lbp/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhp/h0;->a:Lhp/n0;

    iput-object p2, p0, Lhp/h0;->b:Lbp/c;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lhp/h0;->a:Lhp/n0;

    iget-object v1, p0, Lhp/h0;->b:Lbp/c;

    invoke-static {v0, v1, p1}, Lhp/n0;->f(Lhp/n0;Lbp/c;Landroid/view/View;)V

    return-void
.end method
