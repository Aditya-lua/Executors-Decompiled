.class public final enum Lne/g$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lne/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lne/g$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lne/g$a;

.field public static final enum b:Lne/g$a;

.field public static final synthetic c:[Lne/g$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lne/g$a;

    const-string v1, "OUTPUT_FUTURE_DONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lne/g$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lne/g$a;->a:Lne/g$a;

    new-instance v0, Lne/g$a;

    const-string v1, "ALL_INPUT_FUTURES_PROCESSED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lne/g$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lne/g$a;->b:Lne/g$a;

    invoke-static {}, Lne/g$a;->a()[Lne/g$a;

    move-result-object v0

    sput-object v0, Lne/g$a;->c:[Lne/g$a;

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

.method public static synthetic a()[Lne/g$a;
    .locals 2

    sget-object v0, Lne/g$a;->a:Lne/g$a;

    sget-object v1, Lne/g$a;->b:Lne/g$a;

    filled-new-array {v0, v1}, [Lne/g$a;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lne/g$a;
    .locals 1

    const-class v0, Lne/g$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lne/g$a;

    return-object p0
.end method

.method public static values()[Lne/g$a;
    .locals 1

    sget-object v0, Lne/g$a;->c:[Lne/g$a;

    invoke-virtual {v0}, [Lne/g$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lne/g$a;

    return-object v0
.end method
