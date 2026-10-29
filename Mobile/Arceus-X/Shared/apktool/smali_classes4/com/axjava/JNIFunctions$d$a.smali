.class Lcom/axjava/JNIFunctions$d$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/ClipboardManager$OnPrimaryClipChangedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/axjava/JNIFunctions$d;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/ClipboardManager;


# direct methods
.method constructor <init>(Lcom/axjava/JNIFunctions$d;Landroid/content/ClipboardManager;)V
    .locals 0
    .param p1, "this$0"    # Lcom/axjava/JNIFunctions$d;

    .line 300
    iput-object p2, p0, Lcom/axjava/JNIFunctions$d$a;->a:Landroid/content/ClipboardManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPrimaryClipChanged()V
    .locals 4

    .line 303
    iget-object v0, p0, Lcom/axjava/JNIFunctions$d$a;->a:Landroid/content/ClipboardManager;

    invoke-virtual {v0}, Landroid/content/ClipboardManager;->getPrimaryClip()Landroid/content/ClipData;

    move-result-object v0

    .line 304
    .local v0, "clipData":Landroid/content/ClipData;
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/content/ClipData;->getItemAt(I)Landroid/content/ClipData$Item;

    move-result-object v1

    .line 305
    .local v1, "item":Landroid/content/ClipData$Item;
    invoke-virtual {v1}, Landroid/content/ClipData$Item;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v2

    .line 310
    .local v2, "text":Ljava/lang/String;
    sget-object v3, Lcom/axjava/JNIFunctions;->clipboardHistory:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 311
    return-void
.end method
