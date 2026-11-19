.class public final Lea/p;
.super Lha/p;
.source "SourceFile"

# interfaces
.implements Lea/d;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lea/p;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final f:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lea/q;

    invoke-direct {v0}, Lea/q;-><init>()V

    sput-object v0, Lea/p;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lha/p;-><init>()V

    iput p1, p0, Lea/p;->f:I

    return-void
.end method

.method public constructor <init>(Lea/d;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lha/p;-><init>()V

    .line 3
    invoke-interface {p1}, Lea/d;->C1()I

    move-result p1

    iput p1, p0, Lea/p;->f:I

    return-void
.end method

.method public static A3(Lea/d;Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lea/d;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x1

    if-ne p1, p0, :cond_1

    return v0

    :cond_1
    check-cast p1, Lea/d;

    invoke-interface {p1}, Lea/d;->C1()I

    move-result p1

    invoke-interface {p0}, Lea/d;->C1()I

    move-result p0

    if-ne p1, p0, :cond_2

    return v0

    :cond_2
    return v1
.end method

.method public static B3(Lea/d;)Ljava/lang/String;
    .locals 2

    invoke-static {p0}, Lo9/q;->d(Ljava/lang/Object;)Lo9/q$a;

    move-result-object v0

    invoke-interface {p0}, Lea/d;->C1()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const-string v1, "FriendsListVisibilityStatus"

    invoke-virtual {v0, v1, p0}, Lo9/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lo9/q$a;

    invoke-virtual {v0}, Lo9/q$a;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static a(Lea/d;)I
    .locals 0

    invoke-interface {p0}, Lea/d;->C1()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lo9/q;->c([Ljava/lang/Object;)I

    move-result p0

    return p0
.end method


# virtual methods
.method public final C1()I
    .locals 1

    iget v0, p0, Lea/p;->f:I

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lea/p;->A3(Lea/d;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final bridge synthetic freeze()Ljava/lang/Object;
    .locals 0

    return-object p0
.end method

.method public final hashCode()I
    .locals 1

    invoke-static {p0}, Lea/p;->a(Lea/d;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lea/p;->B3(Lea/d;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lea/q;->a(Lea/p;Landroid/os/Parcel;I)V

    return-void
.end method
