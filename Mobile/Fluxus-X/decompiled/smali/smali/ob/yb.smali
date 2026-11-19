.class public final Lob/yb;
.super Lob/z;
.source "SourceFile"


# instance fields
.field public final synthetic e:Lob/yc;


# direct methods
.method public constructor <init>(Lob/yc;Lob/q8;)V
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lob/yb;->e:Lob/yc;

    invoke-direct {p0, p2}, Lob/z;-><init>(Lob/q8;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Lob/yb;->e:Lob/yc;

    invoke-virtual {v0}, Lob/o8;->h()V

    invoke-virtual {v0}, Lob/yc;->W()Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    iget-object v1, v0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v1}, Lob/l7;->a()Lob/b6;

    move-result-object v1

    invoke-virtual {v1}, Lob/b6;->w()Lob/z5;

    move-result-object v1

    const-string v2, "Inactivity, disconnecting from the service"

    invoke-virtual {v1, v2}, Lob/z5;->a(Ljava/lang/String;)V

    invoke-virtual {v0}, Lob/yc;->A()V

    return-void
.end method
