.class public final enum Lw0/b$a$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw0/b$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lw0/b$a$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lw0/b$a$a;

.field public static final enum b:Lw0/b$a$a;

.field public static final enum c:Lw0/b$a$a;

.field public static final synthetic d:[Lw0/b$a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lw0/b$a$a;

    const-string v1, "ENCODE_FAILED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lw0/b$a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lw0/b$a$a;->a:Lw0/b$a$a;

    new-instance v0, Lw0/b$a$a;

    const-string v1, "DECODE_FAILED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lw0/b$a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lw0/b$a$a;->b:Lw0/b$a$a;

    new-instance v0, Lw0/b$a$a;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lw0/b$a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lw0/b$a$a;->c:Lw0/b$a$a;

    invoke-static {}, Lw0/b$a$a;->a()[Lw0/b$a$a;

    move-result-object v0

    sput-object v0, Lw0/b$a$a;->d:[Lw0/b$a$a;

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

.method public static synthetic a()[Lw0/b$a$a;
    .locals 3

    sget-object v0, Lw0/b$a$a;->a:Lw0/b$a$a;

    sget-object v1, Lw0/b$a$a;->b:Lw0/b$a$a;

    sget-object v2, Lw0/b$a$a;->c:Lw0/b$a$a;

    filled-new-array {v0, v1, v2}, [Lw0/b$a$a;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lw0/b$a$a;
    .locals 1

    const-class v0, Lw0/b$a$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lw0/b$a$a;

    return-object p0
.end method

.method public static values()[Lw0/b$a$a;
    .locals 1

    sget-object v0, Lw0/b$a$a;->d:[Lw0/b$a$a;

    invoke-virtual {v0}, [Lw0/b$a$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lw0/b$a$a;

    return-object v0
.end method
