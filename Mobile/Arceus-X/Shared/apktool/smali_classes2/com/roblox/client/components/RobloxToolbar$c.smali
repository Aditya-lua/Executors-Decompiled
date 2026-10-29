.class public Lcom/roblox/client/components/RobloxToolbar$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/client/components/RobloxToolbar$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/client/components/RobloxToolbar;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lol/a;)I
    .locals 1

    sget-object v0, Lcom/roblox/client/components/RobloxToolbar$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    sget p1, Lsg/l0;->q:I

    return p1

    :cond_0
    sget p1, Lsg/l0;->s:I

    return p1

    :cond_1
    sget p1, Lsg/l0;->r:I

    return p1
.end method
