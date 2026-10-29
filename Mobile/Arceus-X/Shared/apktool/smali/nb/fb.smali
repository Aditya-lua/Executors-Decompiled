.class public final Lnb/fb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:Lnb/jb;


# direct methods
.method public constructor <init>(Lnb/jb;J)V
    .locals 0

    iput-wide p2, p0, Lnb/fb;->a:J

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/fb;->b:Lnb/jb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lnb/fb;->b:Lnb/jb;

    iget-object v1, v0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v1}, Lnb/g7;->M()Lnb/y1;

    move-result-object v1

    iget-wide v2, p0, Lnb/fb;->a:J

    invoke-virtual {v1, v2, v3}, Lnb/y1;->k(J)V

    const/4 v1, 0x0

    iput-object v1, v0, Lnb/jb;->e:Lnb/bb;

    return-void
.end method
