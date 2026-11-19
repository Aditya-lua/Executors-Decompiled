.class public Llj/e;
.super Llj/a;
.source "SourceFile"


# instance fields
.field public final a:Lcom/roblox/client/provider/ShellConfigurationContentProvider;

.field public b:Landroid/content/Context;


# direct methods
.method public constructor <init>(Lcom/roblox/client/provider/ShellConfigurationContentProvider;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Llj/a;-><init>()V

    iput-object p1, p0, Llj/e;->a:Lcom/roblox/client/provider/ShellConfigurationContentProvider;

    iput-object p2, p0, Llj/e;->b:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public a(Landroid/net/Uri;)Landroid/database/Cursor;
    .locals 2

    iget-object p1, p0, Llj/e;->a:Lcom/roblox/client/provider/ShellConfigurationContentProvider;

    invoke-virtual {p1}, Lcom/roblox/client/provider/ShellConfigurationContentProvider;->d()Lph/c;

    move-result-object p1

    invoke-virtual {p1}, Lph/c;->e()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Llj/e;->a:Lcom/roblox/client/provider/ShellConfigurationContentProvider;

    invoke-virtual {v0}, Lcom/roblox/client/provider/ShellConfigurationContentProvider;->d()Lph/c;

    move-result-object v0

    invoke-virtual {v0}, Lph/c;->f()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Llj/e$a;

    invoke-direct {v1, p0, p1, v0}, Llj/e$a;-><init>(Llj/e;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public b(Llj/i$a;)Lph/a;
    .locals 1

    sget-object v0, Llj/i$a;->a:Llj/i$a;

    if-ne p1, v0, :cond_0

    sget-object p1, Lph/a;->h:Lph/a;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
