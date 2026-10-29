.class public Lcom/roblox/client/game/ExperienceSession$c;
.super Landroid/os/CountDownTimer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/game/ExperienceSession;->e0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/roblox/client/game/ExperienceSession;


# direct methods
.method public constructor <init>(Lcom/roblox/client/game/ExperienceSession;JJ)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/game/ExperienceSession$c;->a:Lcom/roblox/client/game/ExperienceSession;

    invoke-direct {p0, p2, p3, p4, p5}, Landroid/os/CountDownTimer;-><init>(JJ)V

    return-void
.end method


# virtual methods
.method public onFinish()V
    .locals 2

    const-string v0, "ExperienceSession"

    const-string v1, "CountDownTimer::onFinish -> onGameTimeoutInBackground()"

    invoke-static {v0, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/roblox/client/game/ExperienceSession$c;->a:Lcom/roblox/client/game/ExperienceSession;

    invoke-static {v0}, Lcom/roblox/client/game/ExperienceSession;->y(Lcom/roblox/client/game/ExperienceSession;)V

    return-void
.end method

.method public onTick(J)V
    .locals 0

    return-void
.end method
