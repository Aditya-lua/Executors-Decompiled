.class public final synthetic Lrp/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lrp/h;


# direct methods
.method public synthetic constructor <init>(Lrp/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrp/b;->a:Lrp/h;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lrp/b;->a:Lrp/h;

    invoke-static {v0, p1}, Lrp/h;->b(Lrp/h;Landroid/view/View;)V

    return-void
.end method
