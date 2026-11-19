.class public Lo9/h;
.super Lp9/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lo9/h;",
            ">;"
        }
    .end annotation
.end field

.field public static final t:[Lcom/google/android/gms/common/api/Scope;

.field public static final u:[Lk9/d;


# instance fields
.field public final f:I

.field public final g:I

.field public final h:I

.field public i:Ljava/lang/String;

.field public j:Landroid/os/IBinder;

.field public k:[Lcom/google/android/gms/common/api/Scope;

.field public l:Landroid/os/Bundle;

.field public m:Landroid/accounts/Account;

.field public n:[Lk9/d;

.field public o:[Lk9/d;

.field public final p:Z

.field public final q:I

.field public r:Z

.field public final s:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lo9/o1;

    invoke-direct {v0}, Lo9/o1;-><init>()V

    sput-object v0, Lo9/h;->CREATOR:Landroid/os/Parcelable$Creator;

    const/4 v0, 0x0

    new-array v1, v0, [Lcom/google/android/gms/common/api/Scope;

    sput-object v1, Lo9/h;->t:[Lcom/google/android/gms/common/api/Scope;

    new-array v0, v0, [Lk9/d;

    sput-object v0, Lo9/h;->u:[Lk9/d;

    return-void
.end method

.method public constructor <init>(IIILjava/lang/String;Landroid/os/IBinder;[Lcom/google/android/gms/common/api/Scope;Landroid/os/Bundle;Landroid/accounts/Account;[Lk9/d;[Lk9/d;ZIZLjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lp9/a;-><init>()V

    if-nez p6, :cond_0

    sget-object p6, Lo9/h;->t:[Lcom/google/android/gms/common/api/Scope;

    :cond_0
    if-nez p7, :cond_1

    new-instance p7, Landroid/os/Bundle;

    invoke-direct {p7}, Landroid/os/Bundle;-><init>()V

    :cond_1
    if-nez p9, :cond_2

    sget-object p9, Lo9/h;->u:[Lk9/d;

    :cond_2
    if-nez p10, :cond_3

    sget-object p10, Lo9/h;->u:[Lk9/d;

    :cond_3
    iput p1, p0, Lo9/h;->f:I

    iput p2, p0, Lo9/h;->g:I

    iput p3, p0, Lo9/h;->h:I

    const-string p2, "com.google.android.gms"

    invoke-virtual {p2, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_4

    iput-object p2, p0, Lo9/h;->i:Ljava/lang/String;

    goto :goto_0

    :cond_4
    iput-object p4, p0, Lo9/h;->i:Ljava/lang/String;

    :goto_0
    const/4 p2, 0x2

    if-ge p1, p2, :cond_6

    if-eqz p5, :cond_5

    invoke-static {p5}, Lo9/l$a;->s2(Landroid/os/IBinder;)Lo9/l;

    move-result-object p1

    invoke-static {p1}, Lo9/a;->t2(Lo9/l;)Landroid/accounts/Account;

    move-result-object p1

    goto :goto_1

    :cond_5
    const/4 p1, 0x0

    :goto_1
    iput-object p1, p0, Lo9/h;->m:Landroid/accounts/Account;

    goto :goto_2

    :cond_6
    iput-object p5, p0, Lo9/h;->j:Landroid/os/IBinder;

    iput-object p8, p0, Lo9/h;->m:Landroid/accounts/Account;

    :goto_2
    iput-object p6, p0, Lo9/h;->k:[Lcom/google/android/gms/common/api/Scope;

    iput-object p7, p0, Lo9/h;->l:Landroid/os/Bundle;

    iput-object p9, p0, Lo9/h;->n:[Lk9/d;

    iput-object p10, p0, Lo9/h;->o:[Lk9/d;

    iput-boolean p11, p0, Lo9/h;->p:Z

    iput p12, p0, Lo9/h;->q:I

    iput-boolean p13, p0, Lo9/h;->r:Z

    iput-object p14, p0, Lo9/h;->s:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public A3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lo9/h;->s:Ljava/lang/String;

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0
    .param p1    # Landroid/os/Parcel;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p0, p1, p2}, Lo9/o1;->a(Lo9/h;Landroid/os/Parcel;I)V

    return-void
.end method
