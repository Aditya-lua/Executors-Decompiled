.class public Lcn/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcn/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static final a:Lcn/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcn/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcn/a;-><init>(Lcom/roblox/universalapp/messagebus/MessageBus;)V

    sput-object v0, Lcn/a$a;->a:Lcn/a;

    return-void
.end method

.method public static bridge synthetic a()Lcn/a;
    .locals 1

    sget-object v0, Lcn/a$a;->a:Lcn/a;

    return-object v0
.end method
