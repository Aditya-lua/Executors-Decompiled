.class public final Lcom/google/firebase/appindexing/internal/zzj;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/firebase/appindexing/internal/zzj;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final f:Z

.field public final g:I

.field public final h:Ljava/lang/String;

.field public final i:Landroid/os/Bundle;

.field public final j:Landroid/os/Bundle;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Llf/e;

    invoke-direct {v0}, Llf/e;-><init>()V

    sput-object v0, Lcom/google/firebase/appindexing/internal/zzj;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ZILjava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput-boolean p1, p0, Lcom/google/firebase/appindexing/internal/zzj;->f:Z

    iput p2, p0, Lcom/google/firebase/appindexing/internal/zzj;->g:I

    iput-object p3, p0, Lcom/google/firebase/appindexing/internal/zzj;->h:Ljava/lang/String;

    if-nez p4, :cond_0

    new-instance p4, Landroid/os/Bundle;

    invoke-direct {p4}, Landroid/os/Bundle;-><init>()V

    :cond_0
    iput-object p4, p0, Lcom/google/firebase/appindexing/internal/zzj;->i:Landroid/os/Bundle;

    iput-object p5, p0, Lcom/google/firebase/appindexing/internal/zzj;->j:Landroid/os/Bundle;

    const-class p1, Lcom/google/firebase/appindexing/internal/zzj;

    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p1

    invoke-static {p1}, Lva/u;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p5, p1}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/google/firebase/appindexing/internal/zzj;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/google/firebase/appindexing/internal/zzj;

    iget-boolean v1, p0, Lcom/google/firebase/appindexing/internal/zzj;->f:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iget-boolean v3, p1, Lcom/google/firebase/appindexing/internal/zzj;->f:Z

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v1, v3}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget v1, p0, Lcom/google/firebase/appindexing/internal/zzj;->g:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget v3, p1, Lcom/google/firebase/appindexing/internal/zzj;->g:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/firebase/appindexing/internal/zzj;->h:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/firebase/appindexing/internal/zzj;->h:Ljava/lang/String;

    invoke-static {v1, v3}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/firebase/appindexing/internal/zzj;->i:Landroid/os/Bundle;

    iget-object v3, p1, Lcom/google/firebase/appindexing/internal/zzj;->i:Landroid/os/Bundle;

    invoke-static {v1, v3}, Lcom/google/firebase/appindexing/internal/Thing;->w3(Landroid/os/Bundle;Landroid/os/Bundle;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/firebase/appindexing/internal/zzj;->j:Landroid/os/Bundle;

    iget-object p1, p1, Lcom/google/firebase/appindexing/internal/zzj;->j:Landroid/os/Bundle;

    invoke-static {v1, p1}, Lcom/google/firebase/appindexing/internal/Thing;->w3(Landroid/os/Bundle;Landroid/os/Bundle;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 5

    iget-boolean v0, p0, Lcom/google/firebase/appindexing/internal/zzj;->f:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iget v1, p0, Lcom/google/firebase/appindexing/internal/zzj;->g:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, Lcom/google/firebase/appindexing/internal/zzj;->h:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/firebase/appindexing/internal/zzj;->i:Landroid/os/Bundle;

    invoke-static {v3}, Lcom/google/firebase/appindexing/internal/Thing;->a(Landroid/os/Bundle;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget-object v4, p0, Lcom/google/firebase/appindexing/internal/zzj;->j:Landroid/os/Bundle;

    invoke-static {v4}, Lcom/google/firebase/appindexing/internal/Thing;->a(Landroid/os/Bundle;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    filled-new-array {v0, v1, v2, v3, v4}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ln9/k;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "worksOffline: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/google/firebase/appindexing/internal/zzj;->f:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", score: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/google/firebase/appindexing/internal/zzj;->g:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/google/firebase/appindexing/internal/zzj;->h:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, ", accountEmail: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/google/firebase/appindexing/internal/zzj;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    iget-object v1, p0, Lcom/google/firebase/appindexing/internal/zzj;->i:Landroid/os/Bundle;

    const-string v2, "}"

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/os/BaseBundle;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, ", Properties { "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/google/firebase/appindexing/internal/zzj;->i:Landroid/os/Bundle;

    invoke-static {v1, v0}, Lcom/google/firebase/appindexing/internal/Thing;->v3(Landroid/os/Bundle;Ljava/lang/StringBuilder;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    iget-object v1, p0, Lcom/google/firebase/appindexing/internal/zzj;->j:Landroid/os/Bundle;

    invoke-virtual {v1}, Landroid/os/BaseBundle;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, ", embeddingProperties { "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/google/firebase/appindexing/internal/zzj;->j:Landroid/os/Bundle;

    invoke-static {v1, v0}, Lcom/google/firebase/appindexing/internal/Thing;->v3(Landroid/os/Bundle;Ljava/lang/StringBuilder;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    invoke-static {p1}, Lo9/b;->a(Landroid/os/Parcel;)I

    move-result p2

    const/4 v0, 0x1

    iget-boolean v1, p0, Lcom/google/firebase/appindexing/internal/zzj;->f:Z

    invoke-static {p1, v0, v1}, Lo9/b;->c(Landroid/os/Parcel;IZ)V

    const/4 v0, 0x2

    iget v1, p0, Lcom/google/firebase/appindexing/internal/zzj;->g:I

    invoke-static {p1, v0, v1}, Lo9/b;->n(Landroid/os/Parcel;II)V

    iget-object v0, p0, Lcom/google/firebase/appindexing/internal/zzj;->h:Ljava/lang/String;

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-static {p1, v1, v0, v2}, Lo9/b;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v0, 0x4

    iget-object v1, p0, Lcom/google/firebase/appindexing/internal/zzj;->i:Landroid/os/Bundle;

    invoke-static {p1, v0, v1, v2}, Lo9/b;->f(Landroid/os/Parcel;ILandroid/os/Bundle;Z)V

    const/4 v0, 0x5

    iget-object v1, p0, Lcom/google/firebase/appindexing/internal/zzj;->j:Landroid/os/Bundle;

    invoke-static {p1, v0, v1, v2}, Lo9/b;->f(Landroid/os/Parcel;ILandroid/os/Bundle;Z)V

    invoke-static {p1, p2}, Lo9/b;->b(Landroid/os/Parcel;I)V

    return-void
.end method
