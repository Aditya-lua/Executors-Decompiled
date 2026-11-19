.class public Lcom/roblox/client/game/b$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/client/game/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/roblox/client/game/b;


# direct methods
.method public constructor <init>(Lcom/roblox/client/game/b;I)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/game/b$c;->b:Lcom/roblox/client/game/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/roblox/client/game/b$c;->a:I

    return-void
.end method
