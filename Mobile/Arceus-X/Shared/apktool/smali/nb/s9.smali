.class public final Lnb/s9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnb/ue;


# instance fields
.field public final synthetic a:Lnb/qa;


# direct methods
.method public constructor <init>(Lnb/qa;)V
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/s9;->a:Lnb/qa;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    const-string v0, "auto"

    const-string v1, "_err"

    if-nez p2, :cond_0

    iget-object p2, p0, Lnb/s9;->a:Lnb/qa;

    invoke-virtual {p2, v0, v1, p3, p1}, Lnb/qa;->w(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object p1, p0, Lnb/s9;->a:Lnb/qa;

    invoke-virtual {p1, v0, v1, p3}, Lnb/qa;->p(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method
