.class public final Lcom/roblox/client/shortcuts/PinShortcutHandler$a;
.super Lpt/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/shortcuts/PinShortcutHandler;->loadIcon(Landroid/content/Context;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lpt/f;
    c = "com.roblox.client.shortcuts.PinShortcutHandler"
    f = "PinShortcutHandler.kt"
    l = {
        0xb0
    }
    m = "loadIcon"
    v = 0x1
.end annotation


# instance fields
.field public A:I

.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:Ljava/lang/Object;

.field public w:Ljava/lang/Object;

.field public x:I

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Lcom/roblox/client/shortcuts/PinShortcutHandler;


# direct methods
.method public constructor <init>(Lcom/roblox/client/shortcuts/PinShortcutHandler;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/roblox/client/shortcuts/PinShortcutHandler;",
            "Lnt/b<",
            "-",
            "Lcom/roblox/client/shortcuts/PinShortcutHandler$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/roblox/client/shortcuts/PinShortcutHandler$a;->z:Lcom/roblox/client/shortcuts/PinShortcutHandler;

    invoke-direct {p0, p2}, Lpt/d;-><init>(Lnt/b;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iput-object p1, p0, Lcom/roblox/client/shortcuts/PinShortcutHandler$a;->y:Ljava/lang/Object;

    iget p1, p0, Lcom/roblox/client/shortcuts/PinShortcutHandler$a;->A:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/roblox/client/shortcuts/PinShortcutHandler$a;->A:I

    iget-object p1, p0, Lcom/roblox/client/shortcuts/PinShortcutHandler$a;->z:Lcom/roblox/client/shortcuts/PinShortcutHandler;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p0}, Lcom/roblox/client/shortcuts/PinShortcutHandler;->access$loadIcon(Lcom/roblox/client/shortcuts/PinShortcutHandler;Landroid/content/Context;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
