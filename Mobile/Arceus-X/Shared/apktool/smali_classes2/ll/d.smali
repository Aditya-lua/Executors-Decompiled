.class public final synthetic Lll/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg/a;


# instance fields
.field public final synthetic a:Lj/b;


# direct methods
.method public synthetic constructor <init>(Lj/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lll/d;->a:Lj/b;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lll/d;->a:Lj/b;

    check-cast p1, Landroidx/activity/result/ActivityResult;

    invoke-static {v0, p1}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2;->c(Lj/b;Landroidx/activity/result/ActivityResult;)V

    return-void
.end method
