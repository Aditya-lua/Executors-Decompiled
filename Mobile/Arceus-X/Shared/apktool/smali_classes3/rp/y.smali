.class public final synthetic Lrp/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lrp/g0;


# direct methods
.method public synthetic constructor <init>(Lrp/g0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrp/y;->a:Lrp/g0;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lrp/y;->a:Lrp/g0;

    invoke-static {v0, p1}, Lrp/g0;->j(Lrp/g0;Landroid/view/View;)V

    return-void
.end method
