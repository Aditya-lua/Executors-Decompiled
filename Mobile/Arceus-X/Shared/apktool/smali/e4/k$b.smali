.class public Le4/k$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le4/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Le4/k;


# direct methods
.method public constructor <init>(Le4/k;)V
    .locals 0

    iput-object p1, p0, Le4/k$b;->a:Le4/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel(Landroid/content/DialogInterface;)V
    .locals 1

    iget-object p1, p0, Le4/k$b;->a:Le4/k;

    invoke-static {p1}, Le4/k;->b2(Le4/k;)Landroid/app/Dialog;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Le4/k$b;->a:Le4/k;

    invoke-static {p1}, Le4/k;->b2(Le4/k;)Landroid/app/Dialog;

    move-result-object v0

    invoke-virtual {p1, v0}, Le4/k;->onCancel(Landroid/content/DialogInterface;)V

    :cond_0
    return-void
.end method
