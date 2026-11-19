.class public Lqi/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/engine/jni/memstorage/Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqi/a;->m()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lqi/a;


# direct methods
.method public constructor <init>(Lqi/a;)V
    .locals 0

    iput-object p1, p0, Lqi/a$a;->a:Lqi/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemSet(Ljava/lang/String;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BrowserService.ExecuteJavaScript : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.browserservice"

    invoke-static {v1, v0}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lqi/a$a;->a:Lqi/a;

    new-instance v1, Lqi/a$a$a;

    invoke-direct {v1, p0, p1}, Lqi/a$a$a;-><init>(Lqi/a$a;Ljava/lang/String;)V

    invoke-static {v0, v1}, Lqi/a;->l(Lqi/a;Ljava/lang/Runnable;)V

    return-void
.end method
