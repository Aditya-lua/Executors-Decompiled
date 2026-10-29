.class public final synthetic Lll/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg/a;


# instance fields
.field public final synthetic a:Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;


# direct methods
.method public synthetic constructor <init>(Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lll/a;->a:Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lll/a;->a:Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;

    check-cast p1, Landroid/net/Uri;

    invoke-virtual {v0, p1}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;->j(Landroid/net/Uri;)V

    return-void
.end method
