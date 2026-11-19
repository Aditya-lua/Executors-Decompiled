.class public Lmi/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmi/k$a;
    }
.end annotation


# instance fields
.field public a:Lmv/d0;

.field public b:I

.field public c:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x5

    iput v0, p0, Lmi/k;->b:I

    iput v0, p0, Lmi/k;->c:I

    return-void
.end method

.method public static a()Lmi/k;
    .locals 1

    invoke-static {}, Lmi/k$a;->a()Lmi/k;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public b()Lmv/d0;
    .locals 5

    iget-object v0, p0, Lmi/k;->a:Lmv/d0;

    if-nez v0, :cond_0

    new-instance v0, Ldl/c;

    iget v1, p0, Lmi/k;->b:I

    iget v2, p0, Lmi/k;->c:I

    invoke-static {}, Lcl/g;->e()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-direct {v0, v4, v1, v2, v3}, Ldl/c;-><init>(Lmv/o;IILjava/lang/String;)V

    invoke-virtual {v0}, Ldl/c;->a()Lmv/d0;

    move-result-object v0

    iput-object v0, p0, Lmi/k;->a:Lmv/d0;

    :cond_0
    iget-object v0, p0, Lmi/k;->a:Lmv/d0;

    return-object v0
.end method
