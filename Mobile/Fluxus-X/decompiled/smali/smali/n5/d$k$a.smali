.class public Ln5/d$k$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln5/d$k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Ln5/d$k;",
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
.method public a(Landroid/os/Parcel;)Ln5/d$k;
    .locals 1

    new-instance v0, Ln5/d$k;

    invoke-direct {v0, p1}, Ln5/d$k;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public b(I)[Ln5/d$k;
    .locals 0

    new-array p1, p1, [Ln5/d$k;

    return-object p1
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Ln5/d$k$a;->a(Landroid/os/Parcel;)Ln5/d$k;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Ln5/d$k$a;->b(I)[Ln5/d$k;

    move-result-object p1

    return-object p1
.end method
