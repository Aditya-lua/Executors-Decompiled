.class public Lvi/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxi/c$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvi/b;->i(Landroid/app/Activity;Lvi/b$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/app/Activity;

.field public final synthetic b:Lcom/roblox/client/a;

.field public final synthetic c:Landroid/os/Bundle;

.field public final synthetic d:Lvi/b;


# direct methods
.method public constructor <init>(Lvi/b;Landroid/app/Activity;Lcom/roblox/client/a;Landroid/os/Bundle;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lvi/b$a;->d:Lvi/b;

    iput-object p2, p0, Lvi/b$a;->a:Landroid/app/Activity;

    iput-object p3, p0, Lvi/b$a;->b:Lcom/roblox/client/a;

    iput-object p4, p0, Lvi/b$a;->c:Landroid/os/Bundle;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    const-string v0, "rbx.AppManager"

    const-string v1, "handleLogout: ... Logout API finished."

    invoke-static {v0, v1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Lqi/h;

    invoke-direct {v0}, Lqi/h;-><init>()V

    iget-object v1, p0, Lvi/b$a;->a:Landroid/app/Activity;

    new-instance v2, Lvi/b$a$a;

    invoke-direct {v2, p0}, Lvi/b$a$a;-><init>(Lvi/b$a;)V

    invoke-virtual {v0, v1, v2}, Lqi/h;->a(Landroid/content/Context;Lqi/h$c;)V

    return-void
.end method
