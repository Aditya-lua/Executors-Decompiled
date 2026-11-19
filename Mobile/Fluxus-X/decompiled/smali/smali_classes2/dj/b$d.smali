.class public final enum Ldj/b$d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldj/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ldj/b$d;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Ldj/b$d;

.field public static final enum b:Ldj/b$d;

.field public static final enum c:Ldj/b$d;

.field public static final enum d:Ldj/b$d;

.field public static final enum e:Ldj/b$d;

.field public static final synthetic f:[Ldj/b$d;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ldj/b$d;

    const-string v1, "LOGOUT_BY_USER_IN_NATIVE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ldj/b$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldj/b$d;->a:Ldj/b$d;

    new-instance v0, Ldj/b$d;

    const-string v1, "LOGOUT_BY_USER_IN_LUA"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ldj/b$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldj/b$d;->b:Ldj/b$d;

    new-instance v0, Ldj/b$d;

    const-string v1, "LOGOUT_BY_401_ERROR_IN_NATIVE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ldj/b$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldj/b$d;->c:Ldj/b$d;

    new-instance v0, Ldj/b$d;

    const-string v1, "LOGOUT_BY_401_ERROR_IN_WEB"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Ldj/b$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldj/b$d;->d:Ldj/b$d;

    new-instance v0, Ldj/b$d;

    const-string v1, "LOGOUT_BY_401_ERROR_IN_LUA"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Ldj/b$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldj/b$d;->e:Ldj/b$d;

    invoke-static {}, Ldj/b$d;->a()[Ldj/b$d;

    move-result-object v0

    sput-object v0, Ldj/b$d;->f:[Ldj/b$d;

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

.method public static synthetic a()[Ldj/b$d;
    .locals 5

    sget-object v0, Ldj/b$d;->a:Ldj/b$d;

    sget-object v1, Ldj/b$d;->b:Ldj/b$d;

    sget-object v2, Ldj/b$d;->c:Ldj/b$d;

    sget-object v3, Ldj/b$d;->d:Ldj/b$d;

    sget-object v4, Ldj/b$d;->e:Ldj/b$d;

    filled-new-array {v0, v1, v2, v3, v4}, [Ldj/b$d;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ldj/b$d;
    .locals 1

    const-class v0, Ldj/b$d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ldj/b$d;

    return-object p0
.end method

.method public static values()[Ldj/b$d;
    .locals 1

    sget-object v0, Ldj/b$d;->f:[Ldj/b$d;

    invoke-virtual {v0}, [Ldj/b$d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ldj/b$d;

    return-object v0
.end method
