.class public final enum Lwf/d$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwf/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lwf/d$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lwf/d$a;

.field public static final enum b:Lwf/d$a;

.field public static final enum c:Lwf/d$a;

.field public static final synthetic d:[Lwf/d$a;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lwf/d$a;

    const-string v1, "DEFAULT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lwf/d$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lwf/d$a;->a:Lwf/d$a;

    new-instance v1, Lwf/d$a;

    const-string v2, "SIGNED"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lwf/d$a;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lwf/d$a;->b:Lwf/d$a;

    new-instance v2, Lwf/d$a;

    const-string v3, "FIXED"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lwf/d$a;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lwf/d$a;->c:Lwf/d$a;

    filled-new-array {v0, v1, v2}, [Lwf/d$a;

    move-result-object v0

    sput-object v0, Lwf/d$a;->d:[Lwf/d$a;

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

.method public static valueOf(Ljava/lang/String;)Lwf/d$a;
    .locals 1

    const-class v0, Lwf/d$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lwf/d$a;

    return-object p0
.end method

.method public static values()[Lwf/d$a;
    .locals 1

    sget-object v0, Lwf/d$a;->d:[Lwf/d$a;

    invoke-virtual {v0}, [Lwf/d$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lwf/d$a;

    return-object v0
.end method
