.class public final synthetic Lbh/p1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lbh/y1;


# direct methods
.method public synthetic constructor <init>(Lbh/y1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbh/p1;->a:Lbh/y1;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lbh/p1;->a:Lbh/y1;

    invoke-static {v0, p1}, Lbh/y1;->c2(Lbh/y1;Landroid/view/View;)V

    return-void
.end method
