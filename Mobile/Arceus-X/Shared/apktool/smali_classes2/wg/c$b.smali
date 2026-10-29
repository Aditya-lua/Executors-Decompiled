.class public Lwg/c$b;
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

    iput-object p1, p0, Lwg/c$b;->a:Lwg/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemSet(Ljava/lang/String;)V
    .locals 1

    const-string p1, "rbx.browserservice"

    const-string v0, "BrowserService.CloseBrowserWindow"

    invoke-static {p1, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lwg/c$b;->a:Lwg/c;

    new-instance v0, Lwg/c$b$a;

    invoke-direct {v0, p0}, Lwg/c$b$a;-><init>(Lwg/c$b;)V

    invoke-static {p1, v0}, Lwg/c;->b(Lwg/c;Ljava/lang/Runnable;)V

    return-void
.end method
