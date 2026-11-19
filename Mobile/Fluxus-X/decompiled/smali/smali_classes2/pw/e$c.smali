.class public final enum Lpw/e$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpw/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lpw/e$c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lpw/e$c;

.field public static final enum b:Lpw/e$c;

.field public static final synthetic c:[Lpw/e$c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lpw/e$c;

    const-string v1, "UNINITIALIZED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lpw/e$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpw/e$c;->a:Lpw/e$c;

    new-instance v0, Lpw/e$c;

    const-string v1, "RUNNING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lpw/e$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpw/e$c;->b:Lpw/e$c;

    invoke-static {}, Lpw/e$c;->a()[Lpw/e$c;

    move-result-object v0

    sput-object v0, Lpw/e$c;->c:[Lpw/e$c;

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

.method public static synthetic a()[Lpw/e$c;
    .locals 2

    sget-object v0, Lpw/e$c;->a:Lpw/e$c;

    sget-object v1, Lpw/e$c;->b:Lpw/e$c;

    filled-new-array {v0, v1}, [Lpw/e$c;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lpw/e$c;
    .locals 1

    const-class v0, Lpw/e$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lpw/e$c;

    return-object p0
.end method

.method public static values()[Lpw/e$c;
    .locals 1

    sget-object v0, Lpw/e$c;->c:[Lpw/e$c;

    invoke-virtual {v0}, [Lpw/e$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lpw/e$c;

    return-object v0
.end method
