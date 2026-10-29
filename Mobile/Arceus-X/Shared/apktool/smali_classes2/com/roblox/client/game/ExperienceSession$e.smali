.class public Lcom/roblox/client/game/ExperienceSession$e;
.super Lwh/y0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/client/game/ExperienceSession;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "e"
.end annotation


# instance fields
.field public final synthetic g:Lcom/roblox/client/game/ExperienceSession;


# direct methods
.method public constructor <init>(Lcom/roblox/client/game/ExperienceSession;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/roblox/client/game/ExperienceSession$e;->g:Lcom/roblox/client/game/ExperienceSession;

    invoke-direct {p0}, Lwh/y0;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/roblox/client/game/ExperienceSession;Lwh/y;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/roblox/client/game/ExperienceSession$e;-><init>(Lcom/roblox/client/game/ExperienceSession;)V

    return-void
.end method


# virtual methods
.method public h(I)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "setting orientation: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.game.orientation"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/roblox/client/game/ExperienceSession$e;->g:Lcom/roblox/client/game/ExperienceSession;

    invoke-virtual {v0}, Lcom/roblox/client/game/ExperienceSession;->H()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/app/Activity;->setRequestedOrientation(I)V

    return-void
.end method
