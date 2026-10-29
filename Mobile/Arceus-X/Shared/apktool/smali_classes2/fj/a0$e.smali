.class public final enum Lfj/a0$e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lfj/a0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lfj/a0$e;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lfj/a0$e;

.field public static final enum b:Lfj/a0$e;

.field public static final enum c:Lfj/a0$e;

.field public static final synthetic d:[Lfj/a0$e;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lfj/a0$e;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lfj/a0$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lfj/a0$e;->a:Lfj/a0$e;

    new-instance v0, Lfj/a0$e;

    const-string v1, "CONNECTING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lfj/a0$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lfj/a0$e;->b:Lfj/a0$e;

    new-instance v0, Lfj/a0$e;

    const-string v1, "READY"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lfj/a0$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lfj/a0$e;->c:Lfj/a0$e;

    invoke-static {}, Lfj/a0$e;->a()[Lfj/a0$e;

    move-result-object v0

    sput-object v0, Lfj/a0$e;->d:[Lfj/a0$e;

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

.method public static synthetic a()[Lfj/a0$e;
    .locals 3

    sget-object v0, Lfj/a0$e;->a:Lfj/a0$e;

    sget-object v1, Lfj/a0$e;->b:Lfj/a0$e;

    sget-object v2, Lfj/a0$e;->c:Lfj/a0$e;

    filled-new-array {v0, v1, v2}, [Lfj/a0$e;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lfj/a0$e;
    .locals 1

    const-class v0, Lfj/a0$e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lfj/a0$e;

    return-object p0
.end method

.method public static values()[Lfj/a0$e;
    .locals 1

    sget-object v0, Lfj/a0$e;->d:[Lfj/a0$e;

    invoke-virtual {v0}, [Lfj/a0$e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lfj/a0$e;

    return-object v0
.end method
