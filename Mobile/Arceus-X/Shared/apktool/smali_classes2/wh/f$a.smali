.class public Lwh/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwh/f$h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwh/f;->s(Landroid/content/Context;Lwh/f$h;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lwh/f$h;

.field public final synthetic b:Lwh/f;


# direct methods
.method public constructor <init>(Lwh/f;Lwh/f$h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lwh/f$a;->b:Lwh/f;

    iput-object p2, p0, Lwh/f$a;->a:Lwh/f$h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1

    const-string v0, "update_setting_to_app_bridge_end"

    invoke-static {v0}, Lcom/roblox/universalapp/logging/LoggingProtocol;->g(Ljava/lang/String;)V

    if-nez p1, :cond_0

    iget-object p1, p0, Lwh/f$a;->a:Lwh/f$h;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lwh/f$h;->a(I)V

    return-void

    :cond_0
    iget-object p1, p0, Lwh/f$a;->a:Lwh/f$h;

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Lwh/f$h;->a(I)V

    return-void
.end method
