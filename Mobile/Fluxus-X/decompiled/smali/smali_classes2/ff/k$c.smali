.class public final enum Lff/k$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lff/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lff/k$c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lff/k$c;

.field public static final enum b:Lff/k$c;

.field public static final synthetic c:[Lff/k$c;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lff/k$c;

    const-string v1, "IEEE_P1363"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lff/k$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lff/k$c;->a:Lff/k$c;

    new-instance v1, Lff/k$c;

    const-string v2, "DER"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lff/k$c;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lff/k$c;->b:Lff/k$c;

    filled-new-array {v0, v1}, [Lff/k$c;

    move-result-object v0

    sput-object v0, Lff/k$c;->c:[Lff/k$c;

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

.method public static valueOf(Ljava/lang/String;)Lff/k$c;
    .locals 1

    const-class v0, Lff/k$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lff/k$c;

    return-object p0
.end method

.method public static values()[Lff/k$c;
    .locals 1

    sget-object v0, Lff/k$c;->c:[Lff/k$c;

    invoke-virtual {v0}, [Lff/k$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lff/k$c;

    return-object v0
.end method
