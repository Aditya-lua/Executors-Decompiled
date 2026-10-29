.class public Lpm/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpm/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static final a:Lpm/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpm/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpm/a;-><init>(Lcom/roblox/universalapp/messagebus/MessageBus;)V

    sput-object v0, Lpm/a$a;->a:Lpm/a;

    return-void
.end method

.method public static bridge synthetic a()Lpm/a;
    .locals 1

    sget-object v0, Lpm/a$a;->a:Lpm/a;

    return-object v0
.end method
