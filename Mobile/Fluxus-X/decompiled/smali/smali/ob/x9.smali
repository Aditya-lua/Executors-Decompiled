.class public final Lob/x9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lob/ef;


# instance fields
.field public final synthetic a:Lob/va;


# direct methods
.method public constructor <init>(Lob/va;)V
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lob/x9;->a:Lob/va;

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

    iget-object p2, p0, Lob/x9;->a:Lob/va;

    invoke-virtual {p2, v0, v1, p3, p1}, Lob/va;->w(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object p1, p0, Lob/x9;->a:Lob/va;

    invoke-virtual {p1, v0, v1, p3}, Lob/va;->p(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method
