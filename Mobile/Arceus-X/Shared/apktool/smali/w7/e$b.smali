.class public final enum Lw7/e$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw7/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lw7/e$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lw7/e$b;

.field public static final enum b:Lw7/e$b;

.field public static final synthetic c:[Lw7/e$b;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lw7/e$b;

    const-string v1, "meet"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lw7/e$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lw7/e$b;->a:Lw7/e$b;

    new-instance v1, Lw7/e$b;

    const-string v2, "slice"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lw7/e$b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lw7/e$b;->b:Lw7/e$b;

    filled-new-array {v0, v1}, [Lw7/e$b;

    move-result-object v0

    sput-object v0, Lw7/e$b;->c:[Lw7/e$b;

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

.method public static valueOf(Ljava/lang/String;)Lw7/e$b;
    .locals 1

    const-class v0, Lw7/e$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lw7/e$b;

    return-object p0
.end method

.method public static values()[Lw7/e$b;
    .locals 1

    sget-object v0, Lw7/e$b;->c:[Lw7/e$b;

    invoke-virtual {v0}, [Lw7/e$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lw7/e$b;

    return-object v0
.end method
