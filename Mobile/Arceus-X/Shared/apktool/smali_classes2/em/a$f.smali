.class public Lem/a$f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lem/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "f"
.end annotation


# static fields
.field public static final a:Lem/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lem/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lem/a;-><init>(Lcom/roblox/universalapp/messagebus/MessageBus;)V

    sput-object v0, Lem/a$f;->a:Lem/a;

    return-void
.end method

.method public static bridge synthetic a()Lem/a;
    .locals 1

    sget-object v0, Lem/a$f;->a:Lem/a;

    return-object v0
.end method
