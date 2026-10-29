.class public final Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0000\n\u0002\u0008\u0015\u0008\u0087\u0008\u0018\u0000 +2\u00020\u0001:\u0001\u001bB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\r\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u000cJ\u001a\u0010\u0019\u001a\u00020\u00062\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008!\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008#\u0010$\u001a\u0004\u0008%\u0010&R\u0011\u0010(\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\u0008\'\u0010&R\u0011\u0010*\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\u0008)\u0010&\u00a8\u0006,"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;",
        "Landroid/os/Parcelable;",
        "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsCollectionRequirement;",
        "gpsCollectionRequirement",
        "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsPrecisionRequirement;",
        "gpsPrecisionRequirement",
        "",
        "usePlayIntegrity",
        "<init>",
        "(Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsCollectionRequirement;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsPrecisionRequirement;Z)V",
        "",
        "describeContents",
        "()I",
        "Landroid/os/Parcel;",
        "dest",
        "flags",
        "",
        "writeToParcel",
        "(Landroid/os/Parcel;I)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsCollectionRequirement;",
        "f",
        "()Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsCollectionRequirement;",
        "b",
        "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsPrecisionRequirement;",
        "g",
        "()Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsPrecisionRequirement;",
        "c",
        "Z",
        "i",
        "()Z",
        "j",
        "isDefault",
        "k",
        "isGpsRequired",
        "d",
        "shared_release"
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
            "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final d:Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final e:Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsCollectionRequirement;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsPrecisionRequirement;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;->d:Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig$a;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig$b;

    invoke-direct {v0}, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig$b;-><init>()V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;->CREATOR:Landroid/os/Parcelable$Creator;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;

    sget-object v1, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsCollectionRequirement;->c:Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsCollectionRequirement;

    sget-object v2, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsPrecisionRequirement;->b:Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsPrecisionRequirement;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;-><init>(Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsCollectionRequirement;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsPrecisionRequirement;Z)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;->e:Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;

    return-void
.end method

.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsCollectionRequirement;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsPrecisionRequirement;Z)V
    .locals 1
    .param p1    # Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsCollectionRequirement;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsPrecisionRequirement;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "gpsCollectionRequirement"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "gpsPrecisionRequirement"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;->a:Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsCollectionRequirement;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;->b:Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsPrecisionRequirement;

    iput-boolean p3, p0, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;->c:Z

    return-void
.end method

.method public static final synthetic a()Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;->e:Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;

    return-object v0
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;->a:Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsCollectionRequirement;

    iget-object v3, p1, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;->a:Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsCollectionRequirement;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;->b:Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsPrecisionRequirement;

    iget-object v3, p1, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;->b:Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsPrecisionRequirement;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;->c:Z

    iget-boolean p1, p1, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;->c:Z

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final f()Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsCollectionRequirement;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;->a:Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsCollectionRequirement;

    return-object v0
.end method

.method public final g()Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsPrecisionRequirement;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;->b:Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsPrecisionRequirement;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;->a:Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsCollectionRequirement;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;->b:Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsPrecisionRequirement;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;->c:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final i()Z
    .locals 1

    iget-boolean v0, p0, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;->c:Z

    return v0
.end method

.method public final j()Z
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;->e:Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final k()Z
    .locals 2

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;->a:Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsCollectionRequirement;

    sget-object v1, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsCollectionRequirement;->a:Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsCollectionRequirement;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;->a:Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsCollectionRequirement;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;->b:Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsPrecisionRequirement;

    iget-boolean v2, p0, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;->c:Z

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "InquirySessionConfig(gpsCollectionRequirement="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", gpsPrecisionRequirement="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", usePlayIntegrity="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1
    .param p1    # Landroid/os/Parcel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;->a:Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsCollectionRequirement;

    invoke-virtual {v0, p1, p2}, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsCollectionRequirement;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;->b:Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsPrecisionRequirement;

    invoke-virtual {v0, p1, p2}, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsPrecisionRequirement;->writeToParcel(Landroid/os/Parcel;I)V

    iget-boolean p2, p0, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;->c:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
