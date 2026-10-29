.class public final enum Lhv/e$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhv/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lhv/e$c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lhv/e$c;

.field public static final enum b:Lhv/e$c;

.field public static final synthetic c:[Lhv/e$c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lhv/e$c;

    const-string v1, "UNINITIALIZED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lhv/e$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhv/e$c;->a:Lhv/e$c;

    new-instance v0, Lhv/e$c;

    const-string v1, "RUNNING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lhv/e$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhv/e$c;->b:Lhv/e$c;

    invoke-static {}, Lhv/e$c;->a()[Lhv/e$c;

    move-result-object v0

    sput-object v0, Lhv/e$c;->c:[Lhv/e$c;

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

.method public static synthetic a()[Lhv/e$c;
    .locals 2

    sget-object v0, Lhv/e$c;->a:Lhv/e$c;

    sget-object v1, Lhv/e$c;->b:Lhv/e$c;

    filled-new-array {v0, v1}, [Lhv/e$c;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lhv/e$c;
    .locals 1

    const-class v0, Lhv/e$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lhv/e$c;

    return-object p0
.end method

.method public static values()[Lhv/e$c;
    .locals 1

    sget-object v0, Lhv/e$c;->c:[Lhv/e$c;

    invoke-virtual {v0}, [Lhv/e$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lhv/e$c;

    return-object v0
.end method
