.class public abstract Lqd/b$a;
.super Lib/b;
.source "SourceFile"

# interfaces
.implements Lqd/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqd/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "com.google.android.play.agesignals.protocol.IAgeSignalsServiceCallback"

    invoke-direct {p0, v0}, Lib/b;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public r2(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 0
    .param p2    # Landroid/os/Parcel;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Landroid/os/Parcel;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 p3, 0x1

    if-eq p1, p3, :cond_1

    const/4 p4, 0x3

    if-eq p1, p4, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    sget-object p1, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lib/c;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/os/Bundle;

    invoke-static {p2}, Lib/c;->b(Landroid/os/Parcel;)V

    invoke-interface {p0, p1}, Lqd/b;->C0(Landroid/os/Bundle;)V

    goto :goto_0

    :cond_1
    sget-object p1, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lib/c;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/os/Bundle;

    invoke-static {p2}, Lib/c;->b(Landroid/os/Parcel;)V

    invoke-interface {p0, p1}, Lqd/b;->O(Landroid/os/Bundle;)V

    :goto_0
    return p3
.end method
