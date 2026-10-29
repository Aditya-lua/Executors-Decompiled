.class public final enum Li1/n$e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li1/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Li1/n$e;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Li1/n$e;

.field public static final enum b:Li1/n$e;

.field public static final enum c:Li1/n$e;

.field public static final synthetic d:[Li1/n$e;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Li1/n$e;

    const-string v1, "CONFIGURED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Li1/n$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Li1/n$e;->a:Li1/n$e;

    new-instance v0, Li1/n$e;

    const-string v1, "STARTED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Li1/n$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Li1/n$e;->b:Li1/n$e;

    new-instance v0, Li1/n$e;

    const-string v1, "RELEASED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Li1/n$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Li1/n$e;->c:Li1/n$e;

    invoke-static {}, Li1/n$e;->a()[Li1/n$e;

    move-result-object v0

    sput-object v0, Li1/n$e;->d:[Li1/n$e;

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

.method public static synthetic a()[Li1/n$e;
    .locals 3

    sget-object v0, Li1/n$e;->a:Li1/n$e;

    sget-object v1, Li1/n$e;->b:Li1/n$e;

    sget-object v2, Li1/n$e;->c:Li1/n$e;

    filled-new-array {v0, v1, v2}, [Li1/n$e;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Li1/n$e;
    .locals 1

    const-class v0, Li1/n$e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Li1/n$e;

    return-object p0
.end method

.method public static values()[Li1/n$e;
    .locals 1

    sget-object v0, Li1/n$e;->d:[Li1/n$e;

    invoke-virtual {v0}, [Li1/n$e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Li1/n$e;

    return-object v0
.end method
