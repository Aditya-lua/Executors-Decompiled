.class public final La9/a$c;
.super Lp9/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La9/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La9/a$c$a;
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "La9/a$c;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final f:Z

.field public final g:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, La9/s;

    invoke-direct {v0}, La9/s;-><init>()V

    sput-object v0, La9/a$c;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ZLjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lp9/a;-><init>()V

    if-eqz p1, :cond_0

    invoke-static {p2}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iput-boolean p1, p0, La9/a$c;->f:Z

    iput-object p2, p0, La9/a$c;->g:Ljava/lang/String;

    return-void
.end method

.method public static A3()La9/a$c$a;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, La9/a$c$a;

    invoke-direct {v0}, La9/a$c$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public B3()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, La9/a$c;->g:Ljava/lang/String;

    return-object v0
.end method

.method public C3()Z
    .locals 1

    iget-boolean v0, p0, La9/a$c;->f:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, La9/a$c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, La9/a$c;

    iget-boolean v1, p0, La9/a$c;->f:Z

    iget-boolean v3, p1, La9/a$c;->f:Z

    if-ne v1, v3, :cond_2

    iget-object v1, p0, La9/a$c;->g:Ljava/lang/String;

    iget-object p1, p1, La9/a$c;->g:Ljava/lang/String;

    invoke-static {v1, p1}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public hashCode()I
    .locals 2

    iget-boolean v0, p0, La9/a$c;->f:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iget-object v1, p0, La9/a$c;->g:Ljava/lang/String;

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lo9/q;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3
    .param p1    # Landroid/os/Parcel;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p1}, Lp9/c;->a(Landroid/os/Parcel;)I

    move-result p2

    const/4 v0, 0x1

    invoke-virtual {p0}, La9/a$c;->C3()Z

    move-result v1

    invoke-static {p1, v0, v1}, Lp9/c;->c(Landroid/os/Parcel;IZ)V

    invoke-virtual {p0}, La9/a$c;->B3()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p1, v2, v0, v1}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-static {p1, p2}, Lp9/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
