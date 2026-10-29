.class public final Lcd/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcd/c$b;,
        Lcd/c$c;,
        Lcd/c$d;
    }
.end annotation


# instance fields
.field public final a:Lcd/c$d;

.field public final b:Lcd/b;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final c:Landroid/view/View;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcd/b;Landroid/view/View;)V
    .locals 1
    .param p1    # Lcd/b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcd/c;->a()Lcd/c$d;

    move-result-object v0

    iput-object v0, p0, Lcd/c;->a:Lcd/c$d;

    iput-object p1, p0, Lcd/c;->b:Lcd/b;

    iput-object p2, p0, Lcd/c;->c:Landroid/view/View;

    return-void
.end method

.method public static a()Lcd/c$d;
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    const/4 v2, 0x0

    if-lt v0, v1, :cond_0

    new-instance v0, Lcd/c$c;

    invoke-direct {v0, v2}, Lcd/c$c;-><init>(Lcd/c$a;)V

    return-object v0

    :cond_0
    const/16 v1, 0x21

    if-lt v0, v1, :cond_1

    new-instance v0, Lcd/c$b;

    invoke-direct {v0, v2}, Lcd/c$b;-><init>(Lcd/c$a;)V

    return-object v0

    :cond_1
    return-object v2
.end method


# virtual methods
.method public b()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcd/c;->c(Z)V

    return-void
.end method

.method public final c(Z)V
    .locals 3

    iget-object v0, p0, Lcd/c;->a:Lcd/c$d;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcd/c;->b:Lcd/b;

    iget-object v2, p0, Lcd/c;->c:Landroid/view/View;

    invoke-interface {v0, v1, v2, p1}, Lcd/c$d;->b(Lcd/b;Landroid/view/View;Z)V

    :cond_0
    return-void
.end method

.method public d()V
    .locals 2

    iget-object v0, p0, Lcd/c;->a:Lcd/c$d;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcd/c;->c:Landroid/view/View;

    invoke-interface {v0, v1}, Lcd/c$d;->a(Landroid/view/View;)V

    :cond_0
    return-void
.end method
