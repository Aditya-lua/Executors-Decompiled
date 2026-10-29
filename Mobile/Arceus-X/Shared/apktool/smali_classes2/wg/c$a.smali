.class public Lwg/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/engine/jni/memstorage/Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwg/c;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lwg/c;


# direct methods
.method public constructor <init>(Lwg/c;)V
    .locals 0

    iput-object p1, p0, Lwg/c$a;->a:Lwg/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemSet(Ljava/lang/String;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BrowserService.OpenBrowserWindow : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.browserservice"

    invoke-static {v1, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Lvg/c0$b;->b:Lvg/c0$b;

    invoke-static {v0, p1}, Lvg/c0;->w(Lvg/c0$b;Ljava/lang/String;)V

    new-instance v0, Lnl/a;

    invoke-direct {v0, p1}, Lnl/a;-><init>(Ljava/lang/String;)V

    iget-object p1, p0, Lwg/c$a;->a:Lwg/c;

    new-instance v1, Lwg/c$a$a;

    invoke-direct {v1, p0, v0}, Lwg/c$a$a;-><init>(Lwg/c$a;Lnl/a;)V

    invoke-static {p1, v1}, Lwg/c;->b(Lwg/c;Ljava/lang/Runnable;)V

    return-void
.end method
