.class public final Lca/h;
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
    .locals 10

    invoke-static {p1}, Lo9/a;->D(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move v6, v1

    move-object v3, v2

    move-object v4, v3

    move-object v5, v4

    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v7

    if-ge v7, v0, :cond_4

    invoke-static {p1}, Lo9/a;->u(Landroid/os/Parcel;)I

    move-result v7

    invoke-static {v7}, Lo9/a;->n(I)I

    move-result v8

    const/4 v9, 0x1

    if-eq v8, v9, :cond_3

    const/4 v9, 0x2

    if-eq v8, v9, :cond_2

    const/4 v9, 0x3

    if-eq v8, v9, :cond_1

    const/4 v9, 0x4

    if-eq v8, v9, :cond_0

    invoke-static {p1, v7}, Lo9/a;->C(Landroid/os/Parcel;I)V

    goto :goto_0

    :cond_0
    invoke-static {p1, v7}, Lo9/a;->w(Landroid/os/Parcel;I)I

    move-result v6

    goto :goto_0

    :cond_1
    invoke-static {p1, v7}, Lo9/a;->c(Landroid/os/Parcel;I)[B

    move-result-object v5

    goto :goto_0

    :cond_2
    invoke-static {p1, v7}, Lo9/a;->c(Landroid/os/Parcel;I)[B

    move-result-object v4

    goto :goto_0

    :cond_3
    invoke-static {p1, v7}, Lo9/a;->c(Landroid/os/Parcel;I)[B

    move-result-object v3

    goto :goto_0

    :cond_4
    invoke-static {p1, v0}, Lo9/a;->m(Landroid/os/Parcel;I)V

    new-instance p1, Lcom/google/android/gms/fido/fido2/api/common/zzai;

    if-nez v3, :cond_5

    move-object v0, v2

    goto :goto_1

    :cond_5
    array-length v0, v3

    invoke-static {v3, v1, v0}, Leb/m3;->m([BII)Leb/m3;

    move-result-object v0

    :goto_1
    if-nez v4, :cond_6

    move-object v3, v2

    goto :goto_2

    :cond_6
    array-length v3, v4

    invoke-static {v4, v1, v3}, Leb/m3;->m([BII)Leb/m3;

    move-result-object v3

    :goto_2
    if-nez v5, :cond_7

    goto :goto_3

    :cond_7
    array-length v2, v5

    invoke-static {v5, v1, v2}, Leb/m3;->m([BII)Leb/m3;

    move-result-object v2

    :goto_3
    invoke-direct {p1, v0, v3, v2, v6}, Lcom/google/android/gms/fido/fido2/api/common/zzai;-><init>(Leb/m3;Leb/m3;Leb/m3;I)V

    return-object p1
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    new-array p1, p1, [Lcom/google/android/gms/fido/fido2/api/common/zzai;

    return-object p1
.end method
