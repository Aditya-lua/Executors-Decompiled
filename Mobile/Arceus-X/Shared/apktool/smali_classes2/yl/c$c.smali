.class public Lyl/c$c;
.super Landroid/net/ConnectivityManager$NetworkCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lyl/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field public final synthetic a:Lyl/c;


# direct methods
.method public constructor <init>(Lyl/c;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lyl/c$c;->a:Lyl/c;

    invoke-direct {p0}, Landroid/net/ConnectivityManager$NetworkCallback;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lyl/c;Lyl/d;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lyl/c$c;-><init>(Lyl/c;)V

    return-void
.end method


# virtual methods
.method public onAvailable(Landroid/net/Network;)V
    .locals 1
    .param p1    # Landroid/net/Network;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object p1, p0, Lyl/c$c;->a:Lyl/c;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lyl/c;->c(Lyl/c;I)V

    return-void
.end method

.method public onCapabilitiesChanged(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V
    .locals 0
    .param p1    # Landroid/net/Network;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/net/NetworkCapabilities;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object p1, p0, Lyl/c$c;->a:Lyl/c;

    invoke-static {p2}, Lgk/s;->b(Landroid/net/NetworkCapabilities;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x2

    :goto_0
    invoke-static {p1, p2}, Lyl/c;->c(Lyl/c;I)V

    return-void
.end method

.method public onLost(Landroid/net/Network;)V
    .locals 1
    .param p1    # Landroid/net/Network;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object p1, p0, Lyl/c$c;->a:Lyl/c;

    const/4 v0, 0x2

    invoke-static {p1, v0}, Lyl/c;->c(Lyl/c;I)V

    return-void
.end method
