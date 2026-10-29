.class public final enum Lwh/t0;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lwh/t0;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lwh/t0;

.field public static final enum b:Lwh/t0;

.field public static final synthetic c:[Lwh/t0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lwh/t0;

    const-string v1, "EXPERIENCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lwh/t0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lwh/t0;->a:Lwh/t0;

    new-instance v0, Lwh/t0;

    const-string v1, "APP"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lwh/t0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lwh/t0;->b:Lwh/t0;

    invoke-static {}, Lwh/t0;->a()[Lwh/t0;

    move-result-object v0

    sput-object v0, Lwh/t0;->c:[Lwh/t0;

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

.method public static synthetic a()[Lwh/t0;
    .locals 2

    sget-object v0, Lwh/t0;->a:Lwh/t0;

    sget-object v1, Lwh/t0;->b:Lwh/t0;

    filled-new-array {v0, v1}, [Lwh/t0;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lwh/t0;
    .locals 1

    const-class v0, Lwh/t0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lwh/t0;

    return-object p0
.end method

.method public static values()[Lwh/t0;
    .locals 1

    sget-object v0, Lwh/t0;->c:[Lwh/t0;

    invoke-virtual {v0}, [Lwh/t0;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lwh/t0;

    return-object v0
.end method
