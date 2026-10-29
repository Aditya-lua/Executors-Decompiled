.class public final Lnb/db;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lnb/bb;

.field public final synthetic b:Lnb/bb;

.field public final synthetic c:J

.field public final synthetic d:Z

.field public final synthetic e:Lnb/jb;


# direct methods
.method public constructor <init>(Lnb/jb;Lnb/bb;Lnb/bb;JZ)V
    .locals 0

    iput-object p2, p0, Lnb/db;->a:Lnb/bb;

    iput-object p3, p0, Lnb/db;->b:Lnb/bb;

    iput-wide p4, p0, Lnb/db;->c:J

    iput-boolean p6, p0, Lnb/db;->d:Z

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/db;->e:Lnb/jb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    iget-object v0, p0, Lnb/db;->e:Lnb/jb;

    iget-object v1, p0, Lnb/db;->a:Lnb/bb;

    iget-object v2, p0, Lnb/db;->b:Lnb/bb;

    iget-wide v3, p0, Lnb/db;->c:J

    iget-boolean v5, p0, Lnb/db;->d:Z

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v6}, Lnb/jb;->B(Lnb/bb;Lnb/bb;JZLandroid/os/Bundle;)V

    return-void
.end method
