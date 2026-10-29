.class public final enum La8/k$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La8/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "La8/k$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:La8/k$b;

.field public static final enum c:La8/k$b;

.field public static final synthetic d:[La8/k$b;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, La8/k$b;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, La8/k$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, La8/k$b;->b:La8/k$b;

    new-instance v1, La8/k$b;

    const/4 v2, 0x1

    const/16 v3, 0x17

    const-string v4, "ANDROID_FIREBASE"

    invoke-direct {v1, v4, v2, v3}, La8/k$b;-><init>(Ljava/lang/String;II)V

    sput-object v1, La8/k$b;->c:La8/k$b;

    filled-new-array {v0, v1}, [La8/k$b;

    move-result-object v0

    sput-object v0, La8/k$b;->d:[La8/k$b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, La8/k$b;->a:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La8/k$b;
    .locals 1

    const-class v0, La8/k$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, La8/k$b;

    return-object p0
.end method

.method public static values()[La8/k$b;
    .locals 1

    sget-object v0, La8/k$b;->d:[La8/k$b;

    invoke-virtual {v0}, [La8/k$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [La8/k$b;

    return-object v0
.end method
