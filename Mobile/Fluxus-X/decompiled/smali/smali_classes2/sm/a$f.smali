.class public Lsm/a$f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lsm/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "f"
.end annotation


# static fields
.field public static final a:Lsm/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lsm/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lsm/a;-><init>(Lcom/roblox/universalapp/messagebus/MessageBus;)V

    sput-object v0, Lsm/a$f;->a:Lsm/a;

    return-void
.end method

.method public static bridge synthetic a()Lsm/a;
    .locals 1

    sget-object v0, Lsm/a$f;->a:Lsm/a;

    return-object v0
.end method
