.class public final enum Lon/k$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lon/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lon/k$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lon/k$a;

.field public static final enum b:Lon/k$a;

.field public static final synthetic c:[Lon/k$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lon/k$a;

    const-string v1, "WRAP"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lon/k$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lon/k$a;->a:Lon/k$a;

    new-instance v0, Lon/k$a;

    const-string v1, "REPLACE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lon/k$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lon/k$a;->b:Lon/k$a;

    invoke-static {}, Lon/k$a;->a()[Lon/k$a;

    move-result-object v0

    sput-object v0, Lon/k$a;->c:[Lon/k$a;

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

.method public static synthetic a()[Lon/k$a;
    .locals 2

    sget-object v0, Lon/k$a;->a:Lon/k$a;

    sget-object v1, Lon/k$a;->b:Lon/k$a;

    filled-new-array {v0, v1}, [Lon/k$a;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lon/k$a;
    .locals 1

    const-class v0, Lon/k$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lon/k$a;

    return-object p0
.end method

.method public static values()[Lon/k$a;
    .locals 1

    sget-object v0, Lon/k$a;->c:[Lon/k$a;

    invoke-virtual {v0}, [Lon/k$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lon/k$a;

    return-object v0
.end method
