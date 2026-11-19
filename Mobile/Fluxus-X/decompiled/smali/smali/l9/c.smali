.class public final Ll9/c;
.super Lp9/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll9/c$a;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Ll9/c;",
            ">;"
        }
    .end annotation
.end field

.field public static final i:Ll9/c;

.field public static final j:Ll9/c;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# instance fields
.field public final f:Ll9/f;

.field public final g:Z

.field public h:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    invoke-static {}, Ll9/v;->a()Ll9/v;

    move-result-object v0

    sput-object v0, Ll9/c;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {}, Ll9/c;->B3()Ll9/c$a;

    move-result-object v0

    invoke-virtual {v0}, Ll9/c$a;->a()Ll9/c;

    move-result-object v0

    sput-object v0, Ll9/c;->i:Ll9/c;

    invoke-static {}, Ll9/c;->B3()Ll9/c$a;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ll9/c$a;->c(Z)Ll9/c$a;

    invoke-virtual {v0}, Ll9/c$a;->a()Ll9/c;

    move-result-object v0

    sput-object v0, Ll9/c;->j:Ll9/c;

    return-void
.end method

.method public constructor <init>(Ll9/f;Z)V
    .locals 0

    invoke-direct {p0}, Lp9/a;-><init>()V

    iput-object p1, p0, Ll9/c;->f:Ll9/f;

    iput-boolean p2, p0, Ll9/c;->g:Z

    return-void
.end method

.method public static final A3()Ll9/c;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    sget-object v0, Ll9/c;->i:Ll9/c;

    return-object v0
.end method

.method public static B3()Ll9/c$a;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Ll9/c$a;

    invoke-direct {v0}, Ll9/c$a;-><init>()V

    return-object v0
.end method

.method public static final a(Ll9/f;)Ll9/c;
    .locals 1
    .param p0    # Ll9/f;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-static {}, Ll9/c;->B3()Ll9/c$a;

    move-result-object v0

    invoke-virtual {v0, p0}, Ll9/c$a;->b(Ll9/f;)Ll9/c$a;

    invoke-virtual {v0}, Ll9/c$a;->a()Ll9/c;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final synthetic C3(Z)V
    .locals 0

    iput-boolean p1, p0, Ll9/c;->h:Z

    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Ll9/c;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Ll9/c;

    iget-object v0, p0, Ll9/c;->f:Ll9/f;

    iget-object v2, p1, Ll9/c;->f:Ll9/f;

    invoke-static {v0, v2}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Ll9/c;->h:Z

    iget-boolean v2, p1, Ll9/c;->h:Z

    if-ne v0, v2, :cond_1

    iget-boolean v0, p0, Ll9/c;->g:Z

    iget-boolean p1, p1, Ll9/c;->g:Z

    if-ne v0, p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Ll9/c;->f:Ll9/f;

    iget-boolean v1, p0, Ll9/c;->h:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iget-boolean v2, p0, Ll9/c;->g:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    filled-new-array {v0, v1, v2}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lo9/q;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Ll9/c;->f:Ll9/f;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x1f

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "ApiMetadata(complianceOptions="

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4
    .param p1    # Landroid/os/Parcel;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-boolean v0, p0, Ll9/c;->h:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    move-result p2

    add-int/lit8 p2, p2, -0x4

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->setDataPosition(I)V

    invoke-virtual {p1}, Landroid/os/Parcel;->dataSize()I

    move-result p2

    add-int/lit8 p2, p2, -0x4

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->setDataSize(I)V

    return-void

    :cond_0
    const v0, -0xc2a5d3a

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-static {p1}, Lp9/c;->a(Landroid/os/Parcel;)I

    move-result v0

    iget-object v1, p0, Ll9/c;->f:Ll9/f;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {p1, v3, v1, p2, v2}, Lp9/c;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 p2, 0x2

    iget-boolean v1, p0, Ll9/c;->g:Z

    invoke-static {p1, p2, v1}, Lp9/c;->c(Landroid/os/Parcel;IZ)V

    invoke-static {p1, v0}, Lp9/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
