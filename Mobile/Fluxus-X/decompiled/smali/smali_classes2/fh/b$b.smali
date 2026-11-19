.class public Lfh/b$b;
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

    iput-object p1, p0, Lfh/b$b;->a:Lfh/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemSet(Ljava/lang/String;)V
    .locals 1

    const-string p1, "rbx.browserservice"

    const-string v0, "BrowserService.CloseBrowserWindow"

    invoke-static {p1, v0}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lfh/b$b;->a:Lfh/b;

    new-instance v0, Lfh/b$b$a;

    invoke-direct {v0, p0}, Lfh/b$b$a;-><init>(Lfh/b$b;)V

    invoke-static {p1, v0}, Lfh/b;->b(Lfh/b;Ljava/lang/Runnable;)V

    return-void
.end method
