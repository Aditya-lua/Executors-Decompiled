.class public final enum Lx7/g$e0$e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx7/g$e0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lx7/g$e0$e;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lx7/g$e0$e;

.field public static final enum b:Lx7/g$e0$e;

.field public static final enum c:Lx7/g$e0$e;

.field public static final synthetic d:[Lx7/g$e0$e;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lx7/g$e0$e;

    const-string v1, "auto"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lx7/g$e0$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lx7/g$e0$e;->a:Lx7/g$e0$e;

    new-instance v1, Lx7/g$e0$e;

    const-string v2, "optimizeQuality"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lx7/g$e0$e;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lx7/g$e0$e;->b:Lx7/g$e0$e;

    new-instance v2, Lx7/g$e0$e;

    const-string v3, "optimizeSpeed"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lx7/g$e0$e;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lx7/g$e0$e;->c:Lx7/g$e0$e;

    filled-new-array {v0, v1, v2}, [Lx7/g$e0$e;

    move-result-object v0

    sput-object v0, Lx7/g$e0$e;->d:[Lx7/g$e0$e;

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

.method public static valueOf(Ljava/lang/String;)Lx7/g$e0$e;
    .locals 1

    const-class v0, Lx7/g$e0$e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lx7/g$e0$e;

    return-object p0
.end method

.method public static values()[Lx7/g$e0$e;
    .locals 1

    sget-object v0, Lx7/g$e0$e;->d:[Lx7/g$e0$e;

    invoke-virtual {v0}, [Lx7/g$e0$e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lx7/g$e0$e;

    return-object v0
.end method
