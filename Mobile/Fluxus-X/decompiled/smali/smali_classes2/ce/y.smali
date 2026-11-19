.class public final Lce/y;
.super Lce/z;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lce/a0;Ltb/k;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lce/z;-><init>(Lce/a0;Ltb/k;)V

    return-void
.end method


# virtual methods
.method public final j0(ILandroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1, p2}, Lce/z;->j0(ILandroid/os/Bundle;)V

    iget-object p2, p0, Lce/z;->a:Ltb/k;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p2, p1}, Ltb/k;->e(Ljava/lang/Object;)Z

    return-void
.end method
