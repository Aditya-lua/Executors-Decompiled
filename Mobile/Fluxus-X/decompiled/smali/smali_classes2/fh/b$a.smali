.class public Lfh/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/engine/jni/memstorage/Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfh/b;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lfh/b;


# direct methods
.method public constructor <init>(Lfh/b;)V
    .locals 0

    iput-object p1, p0, Lfh/b$a;->a:Lfh/b;

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

    invoke-static {v1, v0}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Leh/v0$b;->b:Leh/v0$b;

    invoke-static {v0, p1}, Leh/v0;->w(Leh/v0$b;Ljava/lang/String;)V

    new-instance v0, Lbm/a;

    invoke-direct {v0, p1}, Lbm/a;-><init>(Ljava/lang/String;)V

    iget-object p1, p0, Lfh/b$a;->a:Lfh/b;

    new-instance v1, Lfh/b$a$a;

    invoke-direct {v1, p0, v0}, Lfh/b$a$a;-><init>(Lfh/b$a;Lbm/a;)V

    invoke-static {p1, v1}, Lfh/b;->b(Lfh/b;Ljava/lang/Runnable;)V

    return-void
.end method
