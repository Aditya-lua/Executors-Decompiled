.class public final enum Lw7/g$e0$g;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw7/g$e0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lw7/g$e0$g;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lw7/g$e0$g;

.field public static final enum b:Lw7/g$e0$g;

.field public static final enum c:Lw7/g$e0$g;

.field public static final enum d:Lw7/g$e0$g;

.field public static final enum e:Lw7/g$e0$g;

.field public static final synthetic f:[Lw7/g$e0$g;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lw7/g$e0$g;

    const-string v1, "None"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lw7/g$e0$g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lw7/g$e0$g;->a:Lw7/g$e0$g;

    new-instance v1, Lw7/g$e0$g;

    const-string v2, "Underline"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lw7/g$e0$g;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lw7/g$e0$g;->b:Lw7/g$e0$g;

    new-instance v2, Lw7/g$e0$g;

    const-string v3, "Overline"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lw7/g$e0$g;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lw7/g$e0$g;->c:Lw7/g$e0$g;

    new-instance v3, Lw7/g$e0$g;

    const-string v4, "LineThrough"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Lw7/g$e0$g;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lw7/g$e0$g;->d:Lw7/g$e0$g;

    new-instance v4, Lw7/g$e0$g;

    const-string v5, "Blink"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6}, Lw7/g$e0$g;-><init>(Ljava/lang/String;I)V

    sput-object v4, Lw7/g$e0$g;->e:Lw7/g$e0$g;

    filled-new-array {v0, v1, v2, v3, v4}, [Lw7/g$e0$g;

    move-result-object v0

    sput-object v0, Lw7/g$e0$g;->f:[Lw7/g$e0$g;

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

.method public static valueOf(Ljava/lang/String;)Lw7/g$e0$g;
    .locals 1

    const-class v0, Lw7/g$e0$g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lw7/g$e0$g;

    return-object p0
.end method

.method public static values()[Lw7/g$e0$g;
    .locals 1

    sget-object v0, Lw7/g$e0$g;->f:[Lw7/g$e0$g;

    invoke-virtual {v0}, [Lw7/g$e0$g;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lw7/g$e0$g;

    return-object v0
.end method
