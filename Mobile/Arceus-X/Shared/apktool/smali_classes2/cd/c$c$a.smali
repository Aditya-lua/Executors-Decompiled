.class public Lcd/c$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/window/OnBackAnimationCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcd/c$c;->c(Lcd/b;)Landroid/window/OnBackInvokedCallback;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcd/b;

.field public final synthetic b:Lcd/c$c;


# direct methods
.method public constructor <init>(Lcd/c$c;Lcd/b;)V
    .locals 0

    iput-object p1, p0, Lcd/c$c$a;->b:Lcd/c$c;

    iput-object p2, p0, Lcd/c$c$a;->a:Lcd/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onBackCancelled()V
    .locals 1

    iget-object v0, p0, Lcd/c$c$a;->b:Lcd/c$c;

    invoke-virtual {v0}, Lcd/c$b;->d()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcd/c$c$a;->a:Lcd/b;

    invoke-interface {v0}, Lcd/b;->b()V

    return-void
.end method

.method public onBackInvoked()V
    .locals 1

    iget-object v0, p0, Lcd/c$c$a;->a:Lcd/b;

    invoke-interface {v0}, Lcd/b;->d()V

    return-void
.end method

.method public onBackProgressed(Landroid/window/BackEvent;)V
    .locals 2
    .param p1    # Landroid/window/BackEvent;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcd/c$c$a;->b:Lcd/c$c;

    invoke-virtual {v0}, Lcd/c$b;->d()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcd/c$c$a;->a:Lcd/b;

    new-instance v1, Le/b;

    invoke-direct {v1, p1}, Le/b;-><init>(Landroid/window/BackEvent;)V

    invoke-interface {v0, v1}, Lcd/b;->a(Le/b;)V

    return-void
.end method

.method public onBackStarted(Landroid/window/BackEvent;)V
    .locals 2
    .param p1    # Landroid/window/BackEvent;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcd/c$c$a;->b:Lcd/c$c;

    invoke-virtual {v0}, Lcd/c$b;->d()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcd/c$c$a;->a:Lcd/b;

    new-instance v1, Le/b;

    invoke-direct {v1, p1}, Le/b;-><init>(Landroid/window/BackEvent;)V

    invoke-interface {v0, v1}, Lcd/b;->c(Le/b;)V

    return-void
.end method
