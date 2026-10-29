.class public final enum Lf7/h0$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf7/h0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lf7/h0$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lf7/h0$b;

.field public static final enum b:Lf7/h0$b;

.field public static final enum c:Lf7/h0$b;

.field public static final synthetic d:[Lf7/h0$b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lf7/h0$b;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lf7/h0$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf7/h0$b;->a:Lf7/h0$b;

    new-instance v0, Lf7/h0$b;

    const-string v1, "PLAY"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lf7/h0$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf7/h0$b;->b:Lf7/h0$b;

    new-instance v0, Lf7/h0$b;

    const-string v1, "RESUME"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lf7/h0$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf7/h0$b;->c:Lf7/h0$b;

    invoke-static {}, Lf7/h0$b;->a()[Lf7/h0$b;

    move-result-object v0

    sput-object v0, Lf7/h0$b;->d:[Lf7/h0$b;

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

.method public static synthetic a()[Lf7/h0$b;
    .locals 3

    sget-object v0, Lf7/h0$b;->a:Lf7/h0$b;

    sget-object v1, Lf7/h0$b;->b:Lf7/h0$b;

    sget-object v2, Lf7/h0$b;->c:Lf7/h0$b;

    filled-new-array {v0, v1, v2}, [Lf7/h0$b;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lf7/h0$b;
    .locals 1

    const-class v0, Lf7/h0$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lf7/h0$b;

    return-object p0
.end method

.method public static values()[Lf7/h0$b;
    .locals 1

    sget-object v0, Lf7/h0$b;->d:[Lf7/h0$b;

    invoke-virtual {v0}, [Lf7/h0$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lf7/h0$b;

    return-object v0
.end method
