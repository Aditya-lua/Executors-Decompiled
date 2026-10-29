.class public Lcom/roblox/client/components/RobloxToolbar$i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/client/components/RobloxToolbar;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "i"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lol/a;)Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/roblox/client/components/RobloxToolbar$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    const-string p1, "SourceSansPro-Semibold.ttf"

    return-object p1

    :cond_0
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->b1()Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "BuilderSans-Bold.otf"

    return-object p1

    :cond_1
    const-string p1, "BuilderSans-Medium.otf"

    return-object p1
.end method
