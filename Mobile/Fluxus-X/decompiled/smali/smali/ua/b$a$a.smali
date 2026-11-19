.class public Lua/b$a$a;
.super Lhb/a;
.source "SourceFile"

# interfaces
.implements Lua/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lua/b$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# direct methods
.method public constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.gms.identitycredentials.internal.IIdentityCredentialService"

    invoke-direct {p0, p1, v0}, Lhb/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public I(Lua/a;Lta/o0;Ll9/c;)V
    .locals 1
    .param p1    # Lua/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lta/o0;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ll9/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p0}, Lhb/a;->r2()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lhb/c;->c(Landroid/os/Parcel;Landroid/os/IInterface;)V

    invoke-static {v0, p2}, Lhb/c;->b(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v0, p3}, Lhb/c;->b(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/16 p1, 0xa

    invoke-virtual {p0, p1, v0}, Lhb/a;->s2(ILandroid/os/Parcel;)V

    return-void
.end method

.method public q1(Lua/a;Lta/k;Ll9/c;)V
    .locals 1
    .param p1    # Lua/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lta/k;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ll9/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p0}, Lhb/a;->r2()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lhb/c;->c(Landroid/os/Parcel;Landroid/os/IInterface;)V

    invoke-static {v0, p2}, Lhb/c;->b(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v0, p3}, Lhb/c;->b(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/4 p1, 0x6

    invoke-virtual {p0, p1, v0}, Lhb/a;->s2(ILandroid/os/Parcel;)V

    return-void
.end method

.method public v0(Lua/a;Lcom/google/android/gms/identitycredentials/GetCredentialRequest;Ll9/c;)V
    .locals 1
    .param p1    # Lua/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/android/gms/identitycredentials/GetCredentialRequest;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ll9/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p0}, Lhb/a;->r2()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lhb/c;->c(Landroid/os/Parcel;Landroid/os/IInterface;)V

    invoke-static {v0, p2}, Lhb/c;->b(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v0, p3}, Lhb/c;->b(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1, v0}, Lhb/a;->s2(ILandroid/os/Parcel;)V

    return-void
.end method
