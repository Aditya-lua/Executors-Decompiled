.class public final Lga/u;
.super Lga/b;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ll9/d;)V
    .locals 0

    invoke-direct {p0, p1}, Lga/b;-><init>(Ll9/d;)V

    return-void
.end method


# virtual methods
.method public final e()V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, Lda/p;->a(I)Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    invoke-virtual {p0, v0}, Lga/b;->s2(Ljava/lang/Object;)V

    return-void
.end method
