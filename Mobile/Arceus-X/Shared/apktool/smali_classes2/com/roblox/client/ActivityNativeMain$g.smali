.class public Lcom/roblox/client/ActivityNativeMain$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lei/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/client/ActivityNativeMain;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/roblox/client/ActivityNativeMain;


# direct methods
.method public constructor <init>(Lcom/roblox/client/ActivityNativeMain;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/ActivityNativeMain$g;->a:Lcom/roblox/client/ActivityNativeMain;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lei/j;)V
    .locals 2

    invoke-virtual {p1}, Lei/j;->b()I

    move-result p1

    const/16 v0, 0x191

    if-ne p1, v0, :cond_0

    const-string p1, "rbx.main"

    const-string v0, "sessionCheckHandler: Got 401 error code from the server. Logout now..."

    invoke-static {p1, v0}, Lgk/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lvi/b;->f()Lvi/b;

    move-result-object p1

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain$g;->a:Lcom/roblox/client/ActivityNativeMain;

    sget-object v1, Lvi/b$d;->c:Lvi/b$d;

    invoke-virtual {p1, v0, v1}, Lvi/b;->i(Landroid/app/Activity;Lvi/b$d;)V

    :cond_0
    return-void
.end method
