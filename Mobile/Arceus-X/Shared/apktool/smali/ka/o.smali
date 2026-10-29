.class public final Lka/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 12

    invoke-static {p1}, Lo9/a;->D(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    move-object v8, v1

    move-object v10, v8

    move-object v11, v10

    move v9, v2

    move-wide v6, v3

    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v1

    if-ge v1, v0, :cond_5

    invoke-static {p1}, Lo9/a;->u(Landroid/os/Parcel;)I

    move-result v1

    invoke-static {v1}, Lo9/a;->n(I)I

    move-result v2

    const/4 v3, 0x1

    if-eq v2, v3, :cond_4

    const/4 v3, 0x2

    if-eq v2, v3, :cond_3

    const/4 v3, 0x3

    if-eq v2, v3, :cond_2

    const/4 v3, 0x4

    if-eq v2, v3, :cond_1

    const/4 v3, 0x5

    if-eq v2, v3, :cond_0

    invoke-static {p1, v1}, Lo9/a;->C(Landroid/os/Parcel;I)V

    goto :goto_0

    :cond_0
    invoke-static {p1, v1}, Lo9/a;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v1

    move-object v11, v1

    goto :goto_0

    :cond_1
    sget-object v2, Landroid/content/ComponentName;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p1, v1, v2}, Lo9/a;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Landroid/content/ComponentName;

    move-object v10, v1

    goto :goto_0

    :cond_2
    invoke-static {p1, v1}, Lo9/a;->w(Landroid/os/Parcel;I)I

    move-result v1

    move v9, v1

    goto :goto_0

    :cond_3
    invoke-static {p1, v1}, Lo9/a;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v1

    move-object v8, v1

    goto :goto_0

    :cond_4
    invoke-static {p1, v1}, Lo9/a;->y(Landroid/os/Parcel;I)J

    move-result-wide v1

    move-wide v6, v1

    goto :goto_0

    :cond_5
    invoke-static {p1, v0}, Lo9/a;->m(Landroid/os/Parcel;I)V

    new-instance v5, Lcom/google/android/gms/games/internal/v2/appshortcuts/zzr;

    invoke-direct/range {v5 .. v11}, Lcom/google/android/gms/games/internal/v2/appshortcuts/zzr;-><init>(JLjava/lang/String;ILandroid/content/ComponentName;Ljava/lang/String;)V

    return-object v5
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    new-array p1, p1, [Lcom/google/android/gms/games/internal/v2/appshortcuts/zzr;

    return-object p1
.end method
