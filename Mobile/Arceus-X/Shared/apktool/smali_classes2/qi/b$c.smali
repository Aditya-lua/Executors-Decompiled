.class public final enum Lqi/b$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqi/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lqi/b$c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lqi/b$c;

.field public static final enum b:Lqi/b$c;

.field public static final synthetic c:[Lqi/b$c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lqi/b$c;

    const-string v1, "LOCALE_MODE_LOGIN_SIGN_UP"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lqi/b$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lqi/b$c;->a:Lqi/b$c;

    new-instance v0, Lqi/b$c;

    const-string v1, "LOCALE_MODE_GENERAL_EXPERIENCE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lqi/b$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lqi/b$c;->b:Lqi/b$c;

    invoke-static {}, Lqi/b$c;->a()[Lqi/b$c;

    move-result-object v0

    sput-object v0, Lqi/b$c;->c:[Lqi/b$c;

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

.method public static synthetic a()[Lqi/b$c;
    .locals 2

    sget-object v0, Lqi/b$c;->a:Lqi/b$c;

    sget-object v1, Lqi/b$c;->b:Lqi/b$c;

    filled-new-array {v0, v1}, [Lqi/b$c;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lqi/b$c;
    .locals 1

    const-class v0, Lqi/b$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lqi/b$c;

    return-object p0
.end method

.method public static values()[Lqi/b$c;
    .locals 1

    sget-object v0, Lqi/b$c;->c:[Lqi/b$c;

    invoke-virtual {v0}, [Lqi/b$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lqi/b$c;

    return-object v0
.end method
