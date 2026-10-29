.class Lcom/axjava/JNIFunctions$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/axjava/JNIFunctions;->getFileClipboardHistory(Landroid/content/Context;)[Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 296
    iput-object p1, p0, Lcom/axjava/JNIFunctions$d;->a:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 299
    iget-object v0, p0, Lcom/axjava/JNIFunctions$d;->a:Landroid/content/Context;

    const-string v1, "clipboard"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/ClipboardManager;

    .line 300
    .local v0, "clipBoard":Landroid/content/ClipboardManager;
    new-instance v1, Lcom/axjava/JNIFunctions$d$a;

    invoke-direct {v1, p0, v0}, Lcom/axjava/JNIFunctions$d$a;-><init>(Lcom/axjava/JNIFunctions$d;Landroid/content/ClipboardManager;)V

    invoke-virtual {v0, v1}, Landroid/content/ClipboardManager;->addPrimaryClipChangedListener(Landroid/content/ClipboardManager$OnPrimaryClipChangedListener;)V

    .line 316
    return-void
.end method
