.class public Lq/z$g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq/z$g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lq/z$g;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lq/z$g;
    .locals 1

    new-instance v0, Lq/z$g;

    invoke-direct {v0, p1}, Lq/z$g;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public b(I)[Lq/z$g;
    .locals 0

    new-array p1, p1, [Lq/z$g;

    return-object p1
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lq/z$g$a;->a(Landroid/os/Parcel;)Lq/z$g;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lq/z$g$a;->b(I)[Lq/z$g;

    move-result-object p1

    return-object p1
.end method
