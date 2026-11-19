.class public final enum Lds/d;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lds/d;",
        ">;",
        "Landroid/os/Parcelable;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u000f\u0008\u0087\u0081\u0002\u0018\u00002\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00000\u0002B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001d\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u000c\u0010\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015j\u0002\u0008\u0016j\u0002\u0008\u0017j\u0002\u0008\u0018j\u0002\u0008\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lds/d;",
        "Landroid/os/Parcelable;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "",
        "describeContents",
        "()I",
        "Landroid/os/Parcel;",
        "dest",
        "flags",
        "",
        "writeToParcel",
        "(Landroid/os/Parcel;I)V",
        "a",
        "b",
        "c",
        "d",
        "e",
        "f",
        "g",
        "h",
        "i",
        "j",
        "k",
        "l",
        "inquiry-types_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lds/d;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final enum a:Lds/d;

.field public static final enum b:Lds/d;

.field public static final enum c:Lds/d;

.field public static final enum d:Lds/d;

.field public static final enum e:Lds/d;

.field public static final enum f:Lds/d;

.field public static final enum g:Lds/d;

.field public static final enum h:Lds/d;

.field public static final enum i:Lds/d;

.field public static final enum j:Lds/d;

.field public static final enum k:Lds/d;

.field public static final enum l:Lds/d;

.field public static final synthetic m:[Lds/d;

.field public static final synthetic n:Lhu/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lds/d;

    const-string v1, "NetworkError"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lds/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lds/d;->a:Lds/d;

    new-instance v0, Lds/d;

    const-string v1, "CameraPermissionError"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lds/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lds/d;->b:Lds/d;

    new-instance v0, Lds/d;

    const-string v1, "SdkConfigurationError"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lds/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lds/d;->c:Lds/d;

    new-instance v0, Lds/d;

    const-string v1, "CameraCompatibilityError"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lds/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lds/d;->d:Lds/d;

    new-instance v0, Lds/d;

    const-string v1, "IntegrationError"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lds/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lds/d;->e:Lds/d;

    new-instance v0, Lds/d;

    const-string v1, "SessionTokenError"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lds/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lds/d;->f:Lds/d;

    new-instance v0, Lds/d;

    const-string v1, "RateLimitExceeded"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lds/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lds/d;->g:Lds/d;

    new-instance v0, Lds/d;

    const-string v1, "UnexpectedError"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lds/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lds/d;->h:Lds/d;

    new-instance v0, Lds/d;

    const-string v1, "NoDiskSpaceError"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lds/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lds/d;->i:Lds/d;

    new-instance v0, Lds/d;

    const-string v1, "WebRtcIntegrationError"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lds/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lds/d;->j:Lds/d;

    new-instance v0, Lds/d;

    const-string v1, "InvalidOneTimeLinkCode"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, Lds/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lds/d;->k:Lds/d;

    new-instance v0, Lds/d;

    const-string v1, "ExceptionError"

    const/16 v2, 0xb

    invoke-direct {v0, v1, v2}, Lds/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lds/d;->l:Lds/d;

    invoke-static {}, Lds/d;->a()[Lds/d;

    move-result-object v0

    sput-object v0, Lds/d;->m:[Lds/d;

    invoke-static {v0}, Lhu/b;->a([Ljava/lang/Enum;)Lhu/a;

    move-result-object v0

    sput-object v0, Lds/d;->n:Lhu/a;

    new-instance v0, Lds/d$a;

    invoke-direct {v0}, Lds/d$a;-><init>()V

    sput-object v0, Lds/d;->CREATOR:Landroid/os/Parcelable$Creator;

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

.method public static final synthetic a()[Lds/d;
    .locals 12

    sget-object v0, Lds/d;->a:Lds/d;

    sget-object v1, Lds/d;->b:Lds/d;

    sget-object v2, Lds/d;->c:Lds/d;

    sget-object v3, Lds/d;->d:Lds/d;

    sget-object v4, Lds/d;->e:Lds/d;

    sget-object v5, Lds/d;->f:Lds/d;

    sget-object v6, Lds/d;->g:Lds/d;

    sget-object v7, Lds/d;->h:Lds/d;

    sget-object v8, Lds/d;->i:Lds/d;

    sget-object v9, Lds/d;->j:Lds/d;

    sget-object v10, Lds/d;->k:Lds/d;

    sget-object v11, Lds/d;->l:Lds/d;

    filled-new-array/range {v0 .. v11}, [Lds/d;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lds/d;
    .locals 1

    const-class v0, Lds/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lds/d;

    return-object p0
.end method

.method public static values()[Lds/d;
    .locals 1

    sget-object v0, Lds/d;->m:[Lds/d;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lds/d;

    return-object v0
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0
    .param p1    # Landroid/os/Parcel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
