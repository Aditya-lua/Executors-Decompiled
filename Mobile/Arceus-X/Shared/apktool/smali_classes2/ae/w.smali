.class public final Lae/w;
.super Lae/z;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lae/a0;Lsb/k;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lae/z;-><init>(Lae/a0;Lsb/k;)V

    return-void
.end method


# virtual methods
.method public final R0(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Lae/z;->R0(Landroid/os/Bundle;)V

    iget-object p1, p0, Lae/z;->a:Lsb/k;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lsb/k;->e(Ljava/lang/Object;)Z

    return-void
.end method
