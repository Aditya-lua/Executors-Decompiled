.class public final synthetic Lwh/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnSystemUiVisibilityChangeListener;


# instance fields
.field public final synthetic a:Lcom/roblox/client/game/ExperienceSession;


# direct methods
.method public synthetic constructor <init>(Lcom/roblox/client/game/ExperienceSession;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwh/t;->a:Lcom/roblox/client/game/ExperienceSession;

    return-void
.end method


# virtual methods
.method public final onSystemUiVisibilityChange(I)V
    .locals 1

    iget-object v0, p0, Lwh/t;->a:Lcom/roblox/client/game/ExperienceSession;

    invoke-static {v0, p1}, Lcom/roblox/client/game/ExperienceSession;->e(Lcom/roblox/client/game/ExperienceSession;I)V

    return-void
.end method
