.class public final enum Ljh/b$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljh/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ljh/b$c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Ljh/b$c;

.field public static final enum b:Ljh/b$c;

.field public static final synthetic c:[Ljh/b$c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ljh/b$c;

    const-string v1, "IDLE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljh/b$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljh/b$c;->a:Ljh/b$c;

    new-instance v0, Ljh/b$c;

    const-string v1, "PROCESSING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ljh/b$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljh/b$c;->b:Ljh/b$c;

    invoke-static {}, Ljh/b$c;->a()[Ljh/b$c;

    move-result-object v0

    sput-object v0, Ljh/b$c;->c:[Ljh/b$c;

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

.method public static synthetic a()[Ljh/b$c;
    .locals 2

    sget-object v0, Ljh/b$c;->a:Ljh/b$c;

    sget-object v1, Ljh/b$c;->b:Ljh/b$c;

    filled-new-array {v0, v1}, [Ljh/b$c;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ljh/b$c;
    .locals 1

    const-class v0, Ljh/b$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ljh/b$c;

    return-object p0
.end method

.method public static values()[Ljh/b$c;
    .locals 1

    sget-object v0, Ljh/b$c;->c:[Ljh/b$c;

    invoke-virtual {v0}, [Ljh/b$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljh/b$c;

    return-object v0
.end method
