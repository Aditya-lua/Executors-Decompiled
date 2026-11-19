.class public final enum Lbn/o;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lbn/o;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lbn/o;

.field public static final enum b:Lbn/o;

.field public static final enum c:Lbn/o;

.field public static final enum d:Lbn/o;

.field public static final enum e:Lbn/o;

.field public static final enum f:Lbn/o;

.field public static final enum g:Lbn/o;

.field public static final enum h:Lbn/o;

.field public static final synthetic i:[Lbn/o;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lbn/o;

    const-string v1, "CAMERA"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lbn/o;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbn/o;->a:Lbn/o;

    new-instance v0, Lbn/o;

    const-string v1, "CONTACT"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lbn/o;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbn/o;->b:Lbn/o;

    new-instance v0, Lbn/o;

    const-string v1, "RECORD_AUDIO"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lbn/o;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbn/o;->c:Lbn/o;

    new-instance v0, Lbn/o;

    const-string v1, "MODIFY_AUDIO_SETTINGS"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lbn/o;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbn/o;->d:Lbn/o;

    new-instance v0, Lbn/o;

    const-string v1, "WRITE_EXTERNAL_STORAGE"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lbn/o;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbn/o;->e:Lbn/o;

    new-instance v0, Lbn/o;

    const-string v1, "READ_EXTERNAL_STORAGE"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lbn/o;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbn/o;->f:Lbn/o;

    new-instance v0, Lbn/o;

    const-string v1, "POST_NOTIFICATIONS"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lbn/o;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbn/o;->g:Lbn/o;

    new-instance v0, Lbn/o;

    const-string v1, "MEDIA_PICKER"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lbn/o;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbn/o;->h:Lbn/o;

    invoke-static {}, Lbn/o;->a()[Lbn/o;

    move-result-object v0

    sput-object v0, Lbn/o;->i:[Lbn/o;

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

.method public static synthetic a()[Lbn/o;
    .locals 8

    sget-object v0, Lbn/o;->a:Lbn/o;

    sget-object v1, Lbn/o;->b:Lbn/o;

    sget-object v2, Lbn/o;->c:Lbn/o;

    sget-object v3, Lbn/o;->d:Lbn/o;

    sget-object v4, Lbn/o;->e:Lbn/o;

    sget-object v5, Lbn/o;->f:Lbn/o;

    sget-object v6, Lbn/o;->g:Lbn/o;

    sget-object v7, Lbn/o;->h:Lbn/o;

    filled-new-array/range {v0 .. v7}, [Lbn/o;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lbn/o;
    .locals 1

    const-class v0, Lbn/o;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lbn/o;

    return-object p0
.end method

.method public static values()[Lbn/o;
    .locals 1

    sget-object v0, Lbn/o;->i:[Lbn/o;

    invoke-virtual {v0}, [Lbn/o;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lbn/o;

    return-object v0
.end method
