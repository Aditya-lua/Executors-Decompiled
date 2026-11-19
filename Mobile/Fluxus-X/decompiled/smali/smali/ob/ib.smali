.class public final Lob/ib;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lob/gb;

.field public final synthetic b:Lob/gb;

.field public final synthetic c:J

.field public final synthetic d:Z

.field public final synthetic e:Lob/ob;


# direct methods
.method public constructor <init>(Lob/ob;Lob/gb;Lob/gb;JZ)V
    .locals 0

    iput-object p2, p0, Lob/ib;->a:Lob/gb;

    iput-object p3, p0, Lob/ib;->b:Lob/gb;

    iput-wide p4, p0, Lob/ib;->c:J

    iput-boolean p6, p0, Lob/ib;->d:Z

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lob/ib;->e:Lob/ob;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    iget-object v0, p0, Lob/ib;->e:Lob/ob;

    iget-object v1, p0, Lob/ib;->a:Lob/gb;

    iget-object v2, p0, Lob/ib;->b:Lob/gb;

    iget-wide v3, p0, Lob/ib;->c:J

    iget-boolean v5, p0, Lob/ib;->d:Z

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v6}, Lob/ob;->B(Lob/gb;Lob/gb;JZLandroid/os/Bundle;)V

    return-void
.end method
