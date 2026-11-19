.class public final Lgb/k2;
.super Lp9/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lgb/k2;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final f:Landroid/content/Intent;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lgb/l2;

    invoke-direct {v0}, Lgb/l2;-><init>()V

    sput-object v0, Lgb/k2;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/content/Intent;)V
    .locals 0

    invoke-direct {p0}, Lp9/a;-><init>()V

    iput-object p1, p0, Lgb/k2;->f:Landroid/content/Intent;

    return-void
.end method

.method public static a(Landroid/content/Intent;)Lgb/k2;
    .locals 1

    new-instance v0, Lgb/k2;

    invoke-direct {v0, p0}, Lgb/k2;-><init>(Landroid/content/Intent;)V

    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lgb/k2;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Lgb/k2;

    iget-object v0, p0, Lgb/k2;->f:Landroid/content/Intent;

    iget-object p1, p1, Lgb/k2;->f:Landroid/content/Intent;

    invoke-static {v0, p1}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lgb/k2;->f:Landroid/content/Intent;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lo9/q;->d(Ljava/lang/Object;)Lo9/q$a;

    move-result-object v0

    const-string v1, "resultData"

    iget-object v2, p0, Lgb/k2;->f:Landroid/content/Intent;

    invoke-virtual {v0, v1, v2}, Lo9/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lo9/q$a;

    move-result-object v0

    invoke-virtual {v0}, Lo9/q$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    iget-object v0, p0, Lgb/k2;->f:Landroid/content/Intent;

    invoke-static {p1}, Lp9/c;->a(Landroid/os/Parcel;)I

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p1, v2, v0, p2, v3}, Lp9/c;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v1}, Lp9/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
