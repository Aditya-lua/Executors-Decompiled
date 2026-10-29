.class public final Lae/y;
.super Lae/z;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lae/a0;Lsb/k;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lae/z;-><init>(Lae/a0;Lsb/k;)V

    return-void
.end method


# virtual methods
.method public final k0(ILandroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1, p2}, Lae/z;->k0(ILandroid/os/Bundle;)V

    iget-object p2, p0, Lae/z;->a:Lsb/k;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p2, p1}, Lsb/k;->e(Ljava/lang/Object;)Z

    return-void
.end method
