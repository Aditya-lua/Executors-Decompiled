.class public final Lha/x;
.super Lha/a;
.source "SourceFile"


# instance fields
.field public final a:Ltb/k;


# direct methods
.method public constructor <init>(Ltb/k;)V
    .locals 0

    invoke-direct {p0}, Lha/a;-><init>()V

    iput-object p1, p0, Lha/x;->a:Ltb/k;

    return-void
.end method


# virtual methods
.method public final G0(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 3

    invoke-virtual {p1}, Lcom/google/android/gms/common/data/DataHolder;->D3()I

    move-result v0

    const/4 v1, 0x3

    if-eqz v0, :cond_1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lha/x;->a:Ltb/k;

    invoke-static {v1, v0}, Lea/h;->b(Ltb/k;I)V

    invoke-virtual {p1}, Lcom/google/android/gms/common/data/DataHolder;->close()V

    return-void

    :cond_1
    :goto_0
    new-instance v2, Lfa/b;

    invoke-direct {v2, p1}, Lfa/b;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    if-ne v0, v1, :cond_2

    const/4 p1, 0x1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    iget-object v0, p0, Lha/x;->a:Ltb/k;

    new-instance v1, Lea/b;

    invoke-direct {v1, v2, p1}, Lea/b;-><init>(Ljava/lang/Object;Z)V

    invoke-virtual {v0, v1}, Ltb/k;->c(Ljava/lang/Object;)V

    return-void
.end method
