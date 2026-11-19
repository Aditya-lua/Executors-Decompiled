.class public Lf4/o$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf4/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lf4/o;


# direct methods
.method public constructor <init>(Lf4/o;)V
    .locals 0

    iput-object p1, p0, Lf4/o$b;->a:Lf4/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel(Landroid/content/DialogInterface;)V
    .locals 1

    iget-object p1, p0, Lf4/o$b;->a:Lf4/o;

    invoke-static {p1}, Lf4/o;->b2(Lf4/o;)Landroid/app/Dialog;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lf4/o$b;->a:Lf4/o;

    invoke-static {p1}, Lf4/o;->b2(Lf4/o;)Landroid/app/Dialog;

    move-result-object v0

    invoke-virtual {p1, v0}, Lf4/o;->onCancel(Landroid/content/DialogInterface;)V

    :cond_0
    return-void
.end method
