.class public Llm/g$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llm/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# static fields
.field public static final a:Llm/g;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llm/g;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Llm/g;-><init>(Lcom/roblox/universalapp/messagebus/MessageBus;)V

    sput-object v0, Llm/g$b;->a:Llm/g;

    return-void
.end method

.method public static bridge synthetic a()Llm/g;
    .locals 1

    sget-object v0, Llm/g$b;->a:Llm/g;

    return-object v0
.end method
