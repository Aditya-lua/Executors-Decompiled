.class public final enum Lmq/y0$h;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmq/y0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "h"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lmq/y0$h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0007\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lmq/y0$h;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "a",
        "b",
        "c",
        "d",
        "selfie_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final enum a:Lmq/y0$h;

.field public static final enum b:Lmq/y0$h;

.field public static final enum c:Lmq/y0$h;

.field public static final enum d:Lmq/y0$h;

.field public static final synthetic e:[Lmq/y0$h;

.field public static final synthetic f:Lhu/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lmq/y0$h;

    const-string v1, "Disabled"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lmq/y0$h;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmq/y0$h;->a:Lmq/y0$h;

    new-instance v0, Lmq/y0$h;

    const-string v1, "Enabled"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lmq/y0$h;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmq/y0$h;->b:Lmq/y0$h;

    new-instance v0, Lmq/y0$h;

    const-string v1, "FlashOn"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lmq/y0$h;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmq/y0$h;->c:Lmq/y0$h;

    new-instance v0, Lmq/y0$h;

    const-string v1, "ReadyToCapture"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lmq/y0$h;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmq/y0$h;->d:Lmq/y0$h;

    invoke-static {}, Lmq/y0$h;->a()[Lmq/y0$h;

    move-result-object v0

    sput-object v0, Lmq/y0$h;->e:[Lmq/y0$h;

    invoke-static {v0}, Lhu/b;->a([Ljava/lang/Enum;)Lhu/a;

    move-result-object v0

    sput-object v0, Lmq/y0$h;->f:Lhu/a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static final synthetic a()[Lmq/y0$h;
    .locals 4

    sget-object v0, Lmq/y0$h;->a:Lmq/y0$h;

    sget-object v1, Lmq/y0$h;->b:Lmq/y0$h;

    sget-object v2, Lmq/y0$h;->c:Lmq/y0$h;

    sget-object v3, Lmq/y0$h;->d:Lmq/y0$h;

    filled-new-array {v0, v1, v2, v3}, [Lmq/y0$h;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lmq/y0$h;
    .locals 1

    const-class v0, Lmq/y0$h;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lmq/y0$h;

    return-object p0
.end method

.method public static values()[Lmq/y0$h;
    .locals 1

    sget-object v0, Lmq/y0$h;->e:[Lmq/y0$h;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lmq/y0$h;

    return-object v0
.end method
