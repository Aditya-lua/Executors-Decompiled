.class public final Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2$b;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2;->onCreate(Landroidx/lifecycle/s;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lgu/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Lav/p0;",
        "Leu/b<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lgu/f;
    c = "com.roblox.protocols.mediapicker.MediaPickerProtocolV2$onCreate$2$1"
    f = "MediaPickerProtocolV2.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x1
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lav/p0;",
        "",
        "<anonymous>",
        "(Lav/p0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Lj/b;

.field public final synthetic v:Lg/a;


# direct methods
.method public constructor <init>(Lj/b;Lg/a;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/b;",
            "Lg/a;",
            "Leu/b<",
            "-",
            "Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2$b;->u:Lj/b;

    iput-object p2, p0, Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2$b;->v:Lg/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Leu/b;)Leu/b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Leu/b<",
            "*>;)",
            "Leu/b<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance p1, Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2$b;

    iget-object v0, p0, Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2$b;->u:Lj/b;

    iget-object v1, p0, Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2$b;->v:Lg/a;

    invoke-direct {p1, v0, v1, p2}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2$b;-><init>(Lj/b;Lg/a;Leu/b;)V

    return-object p1
.end method

.method public final invoke(Lav/p0;Leu/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lav/p0;",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2$b;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2$b;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lav/p0;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2$b;->invoke(Lav/p0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    iget v0, p0, Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2$b;->t:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    sget-object p1, Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2;->INSTANCE:Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2;

    iget-object v0, p0, Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2$b;->u:Lj/b;

    iget-object v1, p0, Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2$b;->v:Lg/a;

    invoke-static {p1, v0, v1}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2;->access$onCaptureImageIntentResult(Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2;Landroid/content/Context;Lg/a;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
