.class public final Lea/d0;
.super Lha/p;
.source "SourceFile"

# interfaces
.implements Lea/o;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lea/d0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final f:I

.field public final g:Ljava/lang/String;

.field public final h:Ljava/lang/String;

.field public final i:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lea/e0;

    invoke-direct {v0}, Lea/e0;-><init>()V

    sput-object v0, Lea/d0;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lha/p;-><init>()V

    iput p1, p0, Lea/d0;->f:I

    iput-object p2, p0, Lea/d0;->g:Ljava/lang/String;

    iput-object p3, p0, Lea/d0;->h:Ljava/lang/String;

    iput-object p4, p0, Lea/d0;->i:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lea/o;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Lha/p;-><init>()V

    .line 3
    invoke-interface {p1}, Lea/o;->c0()I

    move-result v0

    iput v0, p0, Lea/d0;->f:I

    .line 4
    invoke-interface {p1}, Lea/o;->zza()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lea/d0;->g:Ljava/lang/String;

    .line 5
    invoke-interface {p1}, Lea/o;->zzb()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lea/d0;->h:Ljava/lang/String;

    .line 6
    invoke-interface {p1}, Lea/o;->zzc()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lea/d0;->i:Ljava/lang/String;

    return-void
.end method

.method public static A3(Lea/o;Ljava/lang/Object;)Z
    .locals 4

    instance-of v0, p1, Lea/o;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x1

    if-ne p1, p0, :cond_1

    return v0

    :cond_1
    check-cast p1, Lea/o;

    invoke-interface {p1}, Lea/o;->c0()I

    move-result v2

    invoke-interface {p0}, Lea/o;->c0()I

    move-result v3

    if-ne v2, v3, :cond_2

    invoke-interface {p1}, Lea/o;->zza()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0}, Lea/o;->zza()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lea/o;->zzb()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0}, Lea/o;->zzb()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lea/o;->zzc()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0}, Lea/o;->zzc()Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p0}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    return v0

    :cond_2
    return v1
.end method

.method public static B3(Lea/o;)Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lo9/q;->d(Ljava/lang/Object;)Lo9/q$a;

    move-result-object v0

    invoke-interface {p0}, Lea/o;->c0()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "FriendStatus"

    invoke-virtual {v0, v2, v1}, Lo9/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lo9/q$a;

    invoke-interface {p0}, Lea/o;->zza()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Lea/o;->zza()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Nickname"

    invoke-virtual {v0, v2, v1}, Lo9/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lo9/q$a;

    :cond_0
    invoke-interface {p0}, Lea/o;->zzb()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Lea/o;->zzb()Ljava/lang/String;

    move-result-object v1

    const-string v2, "InvitationNickname"

    invoke-virtual {v0, v2, v1}, Lo9/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lo9/q$a;

    :cond_1
    invoke-interface {p0}, Lea/o;->zzc()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Lea/o;->zzb()Ljava/lang/String;

    move-result-object p0

    const-string v1, "NicknameAbuseReportToken"

    invoke-virtual {v0, v1, p0}, Lo9/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lo9/q$a;

    :cond_2
    invoke-virtual {v0}, Lo9/q$a;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static a(Lea/o;)I
    .locals 3

    invoke-interface {p0}, Lea/o;->c0()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p0}, Lea/o;->zza()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p0}, Lea/o;->zzb()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0}, Lea/o;->zzc()Ljava/lang/String;

    move-result-object p0

    filled-new-array {v0, v1, v2, p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lo9/q;->c([Ljava/lang/Object;)I

    move-result p0

    return p0
.end method


# virtual methods
.method public final c0()I
    .locals 1

    iget v0, p0, Lea/d0;->f:I

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lea/d0;->A3(Lea/o;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final bridge synthetic freeze()Ljava/lang/Object;
    .locals 0

    return-object p0
.end method

.method public final hashCode()I
    .locals 1

    invoke-static {p0}, Lea/d0;->a(Lea/o;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lea/d0;->B3(Lea/o;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lea/e0;->a(Lea/d0;Landroid/os/Parcel;I)V

    return-void
.end method

.method public final zza()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lea/d0;->g:Ljava/lang/String;

    return-object v0
.end method

.method public final zzb()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lea/d0;->h:Ljava/lang/String;

    return-object v0
.end method

.method public final zzc()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lea/d0;->i:Ljava/lang/String;

    return-object v0
.end method
