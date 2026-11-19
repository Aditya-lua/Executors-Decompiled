.class public final synthetic Lop/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnShowListener;


# instance fields
.field public final synthetic a:Landroid/app/Dialog;

.field public final synthetic b:Lop/e;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Dialog;Lop/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lop/d;->a:Landroid/app/Dialog;

    iput-object p2, p0, Lop/d;->b:Lop/e;

    return-void
.end method


# virtual methods
.method public final onShow(Landroid/content/DialogInterface;)V
    .locals 2

    iget-object v0, p0, Lop/d;->a:Landroid/app/Dialog;

    iget-object v1, p0, Lop/d;->b:Lop/e;

    invoke-static {v0, v1, p1}, Lop/e;->B2(Landroid/app/Dialog;Lop/e;Landroid/content/DialogInterface;)V

    return-void
.end method
