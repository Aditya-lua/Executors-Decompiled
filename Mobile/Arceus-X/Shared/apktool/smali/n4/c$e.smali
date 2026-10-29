.class public final enum Ln4/c$e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln4/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ln4/c$e;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Ln4/c$e;

.field public static final enum b:Ln4/c$e;

.field public static final enum c:Ln4/c$e;

.field public static final synthetic d:[Ln4/c$e;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Ln4/c$e;

    const-string v1, "PENDING"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ln4/c$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln4/c$e;->a:Ln4/c$e;

    new-instance v1, Ln4/c$e;

    const-string v2, "RUNNING"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ln4/c$e;-><init>(Ljava/lang/String;I)V

    sput-object v1, Ln4/c$e;->b:Ln4/c$e;

    new-instance v2, Ln4/c$e;

    const-string v3, "FINISHED"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ln4/c$e;-><init>(Ljava/lang/String;I)V

    sput-object v2, Ln4/c$e;->c:Ln4/c$e;

    filled-new-array {v0, v1, v2}, [Ln4/c$e;

    move-result-object v0

    sput-object v0, Ln4/c$e;->d:[Ln4/c$e;

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

.method public static valueOf(Ljava/lang/String;)Ln4/c$e;
    .locals 1

    const-class v0, Ln4/c$e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ln4/c$e;

    return-object p0
.end method

.method public static values()[Ln4/c$e;
    .locals 1

    sget-object v0, Ln4/c$e;->d:[Ln4/c$e;

    invoke-virtual {v0}, [Ln4/c$e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ln4/c$e;

    return-object v0
.end method
