.class public final Lce/w;
.super Lce/z;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lce/a0;Ltb/k;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lce/z;-><init>(Lce/a0;Ltb/k;)V

    return-void
.end method


# virtual methods
.method public final Z0(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Lce/z;->Z0(Landroid/os/Bundle;)V

    iget-object p1, p0, Lce/z;->a:Ltb/k;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ltb/k;->e(Ljava/lang/Object;)Z

    return-void
.end method
