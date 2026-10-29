.class public final enum Lom/n;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lom/n;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lom/n;

.field public static final enum b:Lom/n;

.field public static final enum c:Lom/n;

.field public static final enum d:Lom/n;

.field public static final enum e:Lom/n;

.field public static final enum f:Lom/n;

.field public static final enum g:Lom/n;

.field public static final enum h:Lom/n;

.field public static final synthetic i:[Lom/n;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lom/n;

    const-string v1, "CAMERA"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lom/n;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lom/n;->a:Lom/n;

    new-instance v0, Lom/n;

    const-string v1, "CONTACT"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lom/n;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lom/n;->b:Lom/n;

    new-instance v0, Lom/n;

    const-string v1, "RECORD_AUDIO"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lom/n;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lom/n;->c:Lom/n;

    new-instance v0, Lom/n;

    const-string v1, "MODIFY_AUDIO_SETTINGS"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lom/n;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lom/n;->d:Lom/n;

    new-instance v0, Lom/n;

    const-string v1, "WRITE_EXTERNAL_STORAGE"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lom/n;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lom/n;->e:Lom/n;

    new-instance v0, Lom/n;

    const-string v1, "READ_EXTERNAL_STORAGE"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lom/n;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lom/n;->f:Lom/n;

    new-instance v0, Lom/n;

    const-string v1, "POST_NOTIFICATIONS"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lom/n;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lom/n;->g:Lom/n;

    new-instance v0, Lom/n;

    const-string v1, "MEDIA_PICKER"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lom/n;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lom/n;->h:Lom/n;

    invoke-static {}, Lom/n;->a()[Lom/n;

    move-result-object v0

    sput-object v0, Lom/n;->i:[Lom/n;

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

.method public static synthetic a()[Lom/n;
    .locals 8

    sget-object v0, Lom/n;->a:Lom/n;

    sget-object v1, Lom/n;->b:Lom/n;

    sget-object v2, Lom/n;->c:Lom/n;

    sget-object v3, Lom/n;->d:Lom/n;

    sget-object v4, Lom/n;->e:Lom/n;

    sget-object v5, Lom/n;->f:Lom/n;

    sget-object v6, Lom/n;->g:Lom/n;

    sget-object v7, Lom/n;->h:Lom/n;

    filled-new-array/range {v0 .. v7}, [Lom/n;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lom/n;
    .locals 1

    const-class v0, Lom/n;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lom/n;

    return-object p0
.end method

.method public static values()[Lom/n;
    .locals 1

    sget-object v0, Lom/n;->i:[Lom/n;

    invoke-virtual {v0}, [Lom/n;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lom/n;

    return-object v0
.end method
