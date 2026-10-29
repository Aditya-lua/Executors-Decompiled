.class public Lvi/b$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqi/h$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvi/b$a;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lvi/b$a;


# direct methods
.method public constructor <init>(Lvi/b$a;)V
    .locals 0

    iput-object p1, p0, Lvi/b$a$a;->a:Lvi/b$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 2

    const-string p1, "rbx.AppManager"

    const-string v0, "handleLogout: ... Get-Locale API finished."

    invoke-static {p1, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lvi/b$a$a;->a:Lvi/b$a;

    iget-object p1, p1, Lvi/b$a;->b:Lcom/roblox/client/a;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lvi/b$a$a;->a:Lvi/b$a;

    iget-object p1, p1, Lvi/b$a;->b:Lcom/roblox/client/a;

    invoke-virtual {p1}, Lcom/roblox/client/a;->T1()V

    :cond_0
    invoke-static {}, Lvi/e;->c()Lvi/e;

    move-result-object p1

    iget-object v0, p0, Lvi/b$a$a;->a:Lvi/b$a;

    iget-object v0, v0, Lvi/b$a;->c:Landroid/os/Bundle;

    const/4 v1, 0x2

    invoke-virtual {p1, v1, v0}, Lvi/e;->f(ILandroid/os/Bundle;)V

    const/4 p1, 0x0

    invoke-static {p1}, Lvi/b;->b(Z)V

    return-void
.end method
