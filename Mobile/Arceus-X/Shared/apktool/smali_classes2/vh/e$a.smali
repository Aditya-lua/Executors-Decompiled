.class public Lvh/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvh/e;->F0(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lvh/e;


# direct methods
.method public constructor <init>(Lvh/e;)V
    .locals 0

    iput-object p1, p0, Lvh/e$a;->a:Lvh/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lvh/e$a;->a:Lvh/e;

    invoke-virtual {p1}, Lvh/e;->e3()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lvh/e$a;->a:Lvh/e;

    iget-boolean v0, p1, Lvh/e;->h1:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/app/Activity;->onBackPressed()V

    :cond_0
    return-void
.end method
