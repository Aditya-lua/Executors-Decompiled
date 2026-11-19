.class public final synthetic Lvp/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lvp/n0;

.field public final synthetic b:Lpp/c;


# direct methods
.method public synthetic constructor <init>(Lvp/n0;Lpp/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvp/h0;->a:Lvp/n0;

    iput-object p2, p0, Lvp/h0;->b:Lpp/c;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lvp/h0;->a:Lvp/n0;

    iget-object v1, p0, Lvp/h0;->b:Lpp/c;

    invoke-static {v0, v1, p1}, Lvp/n0;->f(Lvp/n0;Lpp/c;Landroid/view/View;)V

    return-void
.end method
