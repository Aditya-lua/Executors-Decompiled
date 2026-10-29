.class public final Lnb/tb;
.super Lnb/w;
.source "SourceFile"


# instance fields
.field public final synthetic e:Lnb/tc;


# direct methods
.method public constructor <init>(Lnb/tc;Lnb/l8;)V
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/tb;->e:Lnb/tc;

    invoke-direct {p0, p2}, Lnb/w;-><init>(Lnb/l8;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Lnb/tb;->e:Lnb/tc;

    invoke-virtual {v0}, Lnb/j8;->h()V

    invoke-virtual {v0}, Lnb/tc;->W()Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    iget-object v1, v0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v1}, Lnb/g7;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->w()Lnb/u5;

    move-result-object v1

    const-string v2, "Inactivity, disconnecting from the service"

    invoke-virtual {v1, v2}, Lnb/u5;->a(Ljava/lang/String;)V

    invoke-virtual {v0}, Lnb/tc;->A()V

    return-void
.end method
