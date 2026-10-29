.class public final enum Lak/k0$g;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lak/k0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lak/k0$g;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lak/k0$g;

.field public static final enum b:Lak/k0$g;

.field public static final enum c:Lak/k0$g;

.field public static final enum d:Lak/k0$g;

.field public static final enum e:Lak/k0$g;

.field public static final enum f:Lak/k0$g;

.field public static final enum g:Lak/k0$g;

.field public static final synthetic h:[Lak/k0$g;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lak/k0$g;

    const-string v1, "INIT_STATE_NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lak/k0$g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lak/k0$g;->a:Lak/k0$g;

    new-instance v0, Lak/k0$g;

    const-string v1, "INIT_STATE_IN_PROGRESS"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lak/k0$g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lak/k0$g;->b:Lak/k0$g;

    new-instance v0, Lak/k0$g;

    const-string v1, "INIT_STATE_SETTINGS_LOADED_OK"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lak/k0$g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lak/k0$g;->c:Lak/k0$g;

    new-instance v0, Lak/k0$g;

    const-string v1, "INIT_STATE_DONE_OK"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lak/k0$g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lak/k0$g;->d:Lak/k0$g;

    new-instance v0, Lak/k0$g;

    const-string v1, "INIT_STATE_NO_USER_ID"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lak/k0$g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lak/k0$g;->e:Lak/k0$g;

    new-instance v0, Lak/k0$g;

    const-string v1, "INIT_STATE_UNAUTHORIZED"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lak/k0$g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lak/k0$g;->f:Lak/k0$g;

    new-instance v0, Lak/k0$g;

    const-string v1, "INIT_STATE_FAILED_APP_SETTINGS"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lak/k0$g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lak/k0$g;->g:Lak/k0$g;

    invoke-static {}, Lak/k0$g;->a()[Lak/k0$g;

    move-result-object v0

    sput-object v0, Lak/k0$g;->h:[Lak/k0$g;

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

.method public static synthetic a()[Lak/k0$g;
    .locals 7

    sget-object v0, Lak/k0$g;->a:Lak/k0$g;

    sget-object v1, Lak/k0$g;->b:Lak/k0$g;

    sget-object v2, Lak/k0$g;->c:Lak/k0$g;

    sget-object v3, Lak/k0$g;->d:Lak/k0$g;

    sget-object v4, Lak/k0$g;->e:Lak/k0$g;

    sget-object v5, Lak/k0$g;->f:Lak/k0$g;

    sget-object v6, Lak/k0$g;->g:Lak/k0$g;

    filled-new-array/range {v0 .. v6}, [Lak/k0$g;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lak/k0$g;
    .locals 1

    const-class v0, Lak/k0$g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lak/k0$g;

    return-object p0
.end method

.method public static values()[Lak/k0$g;
    .locals 1

    sget-object v0, Lak/k0$g;->h:[Lak/k0$g;

    invoke-virtual {v0}, [Lak/k0$g;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lak/k0$g;

    return-object v0
.end method
