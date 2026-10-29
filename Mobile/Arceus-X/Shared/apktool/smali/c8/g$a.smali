.class public final enum Lc8/g$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc8/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lc8/g$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lc8/g$a;

.field public static final enum b:Lc8/g$a;

.field public static final enum c:Lc8/g$a;

.field public static final enum d:Lc8/g$a;

.field public static final synthetic e:[Lc8/g$a;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lc8/g$a;

    const-string v1, "OK"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lc8/g$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc8/g$a;->a:Lc8/g$a;

    new-instance v1, Lc8/g$a;

    const-string v2, "TRANSIENT_ERROR"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lc8/g$a;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lc8/g$a;->b:Lc8/g$a;

    new-instance v2, Lc8/g$a;

    const-string v3, "FATAL_ERROR"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lc8/g$a;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lc8/g$a;->c:Lc8/g$a;

    new-instance v3, Lc8/g$a;

    const-string v4, "INVALID_PAYLOAD"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Lc8/g$a;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lc8/g$a;->d:Lc8/g$a;

    filled-new-array {v0, v1, v2, v3}, [Lc8/g$a;

    move-result-object v0

    sput-object v0, Lc8/g$a;->e:[Lc8/g$a;

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

.method public static valueOf(Ljava/lang/String;)Lc8/g$a;
    .locals 1

    const-class v0, Lc8/g$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lc8/g$a;

    return-object p0
.end method

.method public static values()[Lc8/g$a;
    .locals 1

    sget-object v0, Lc8/g$a;->e:[Lc8/g$a;

    invoke-virtual {v0}, [Lc8/g$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lc8/g$a;

    return-object v0
.end method
