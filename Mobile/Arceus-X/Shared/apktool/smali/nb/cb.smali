.class public final Lnb/cb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroid/os/Bundle;

.field public final synthetic b:Lnb/bb;

.field public final synthetic c:Lnb/bb;

.field public final synthetic d:J

.field public final synthetic e:Lnb/jb;


# direct methods
.method public constructor <init>(Lnb/jb;Landroid/os/Bundle;Lnb/bb;Lnb/bb;J)V
    .locals 0

    iput-object p2, p0, Lnb/cb;->a:Landroid/os/Bundle;

    iput-object p3, p0, Lnb/cb;->b:Lnb/bb;

    iput-object p4, p0, Lnb/cb;->c:Lnb/bb;

    iput-wide p5, p0, Lnb/cb;->d:J

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/cb;->e:Lnb/jb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lnb/cb;->e:Lnb/jb;

    iget-object v1, p0, Lnb/cb;->a:Landroid/os/Bundle;

    iget-object v2, p0, Lnb/cb;->b:Lnb/bb;

    iget-object v3, p0, Lnb/cb;->c:Lnb/bb;

    iget-wide v4, p0, Lnb/cb;->d:J

    invoke-virtual/range {v0 .. v5}, Lnb/jb;->A(Landroid/os/Bundle;Lnb/bb;Lnb/bb;J)V

    return-void
.end method
