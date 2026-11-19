.class public Ldj/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfj/c$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldj/b;->i(Landroid/app/Activity;Ldj/b$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/app/Activity;

.field public final synthetic b:Lcom/roblox/client/a;

.field public final synthetic c:Landroid/os/Bundle;

.field public final synthetic d:Ldj/b;


# direct methods
.method public constructor <init>(Ldj/b;Landroid/app/Activity;Lcom/roblox/client/a;Landroid/os/Bundle;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Ldj/b$a;->d:Ldj/b;

    iput-object p2, p0, Ldj/b$a;->a:Landroid/app/Activity;

    iput-object p3, p0, Ldj/b$a;->b:Lcom/roblox/client/a;

    iput-object p4, p0, Ldj/b$a;->c:Landroid/os/Bundle;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    const-string v0, "rbx.AppManager"

    const-string v1, "handleLogout: ... Logout API finished."

    invoke-static {v0, v1}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Lyi/h;

    invoke-direct {v0}, Lyi/h;-><init>()V

    iget-object v1, p0, Ldj/b$a;->a:Landroid/app/Activity;

    new-instance v2, Ldj/b$a$a;

    invoke-direct {v2, p0}, Ldj/b$a$a;-><init>(Ldj/b$a;)V

    invoke-virtual {v0, v1, v2}, Lyi/h;->a(Landroid/content/Context;Lyi/h$c;)V

    return-void
.end method
