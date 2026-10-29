.class public Lcom/roblox/client/game/ExperienceSession$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/game/ExperienceSession;->v(Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/roblox/client/game/ExperienceSession;


# direct methods
.method public constructor <init>(Lcom/roblox/client/game/ExperienceSession;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/game/ExperienceSession$a;->a:Lcom/roblox/client/game/ExperienceSession;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/game/ExperienceSession$a;->a:Lcom/roblox/client/game/ExperienceSession;

    invoke-virtual {v0}, Lcom/roblox/client/game/ExperienceSession;->Z()V

    return-void
.end method
