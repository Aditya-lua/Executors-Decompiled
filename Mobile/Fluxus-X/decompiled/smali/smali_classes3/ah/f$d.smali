.class public final enum Lah/f$d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lah/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lah/f$d;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lah/f$d;

.field public static final enum c:Lah/f$d;

.field public static final enum d:Lah/f$d;

.field public static final synthetic e:[Lah/f$d;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lah/f$d;

    const/4 v1, 0x0

    const-string v2, "version 1-9"

    const-string v3, "SMALL"

    invoke-direct {v0, v3, v1, v2}, Lah/f$d;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lah/f$d;->b:Lah/f$d;

    new-instance v1, Lah/f$d;

    const/4 v2, 0x1

    const-string v3, "version 10-26"

    const-string v4, "MEDIUM"

    invoke-direct {v1, v4, v2, v3}, Lah/f$d;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lah/f$d;->c:Lah/f$d;

    new-instance v2, Lah/f$d;

    const/4 v3, 0x2

    const-string v4, "version 27-40"

    const-string v5, "LARGE"

    invoke-direct {v2, v5, v3, v4}, Lah/f$d;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Lah/f$d;->d:Lah/f$d;

    filled-new-array {v0, v1, v2}, [Lah/f$d;

    move-result-object v0

    sput-object v0, Lah/f$d;->e:[Lah/f$d;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lah/f$d;->a:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lah/f$d;
    .locals 1

    const-class v0, Lah/f$d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lah/f$d;

    return-object p0
.end method

.method public static values()[Lah/f$d;
    .locals 1

    sget-object v0, Lah/f$d;->e:[Lah/f$d;

    invoke-virtual {v0}, [Lah/f$d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lah/f$d;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lah/f$d;->a:Ljava/lang/String;

    return-object v0
.end method
