.class public final synthetic Lll/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;

.field public final synthetic b:Lh/f$h;


# direct methods
.method public synthetic constructor <init>(Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;Lh/f$h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lll/b;->a:Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;

    iput-object p2, p0, Lll/b;->b:Lh/f$h;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lll/b;->a:Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;

    iget-object v1, p0, Lll/b;->b:Lh/f$h;

    invoke-static {v0, v1}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;->a(Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;Lh/f$h;)V

    return-void
.end method
