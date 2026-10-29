.class public final enum Lw7/g$e0$f;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw7/g$e0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lw7/g$e0$f;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lw7/g$e0$f;

.field public static final enum b:Lw7/g$e0$f;

.field public static final enum c:Lw7/g$e0$f;

.field public static final synthetic d:[Lw7/g$e0$f;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lw7/g$e0$f;

    const-string v1, "Start"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lw7/g$e0$f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lw7/g$e0$f;->a:Lw7/g$e0$f;

    new-instance v1, Lw7/g$e0$f;

    const-string v2, "Middle"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lw7/g$e0$f;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lw7/g$e0$f;->b:Lw7/g$e0$f;

    new-instance v2, Lw7/g$e0$f;

    const-string v3, "End"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lw7/g$e0$f;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lw7/g$e0$f;->c:Lw7/g$e0$f;

    filled-new-array {v0, v1, v2}, [Lw7/g$e0$f;

    move-result-object v0

    sput-object v0, Lw7/g$e0$f;->d:[Lw7/g$e0$f;

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

.method public static valueOf(Ljava/lang/String;)Lw7/g$e0$f;
    .locals 1

    const-class v0, Lw7/g$e0$f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lw7/g$e0$f;

    return-object p0
.end method

.method public static values()[Lw7/g$e0$f;
    .locals 1

    sget-object v0, Lw7/g$e0$f;->d:[Lw7/g$e0$f;

    invoke-virtual {v0}, [Lw7/g$e0$f;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lw7/g$e0$f;

    return-object v0
.end method
