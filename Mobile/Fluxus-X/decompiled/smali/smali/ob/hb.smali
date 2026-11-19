.class public final Lob/hb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroid/os/Bundle;

.field public final synthetic b:Lob/gb;

.field public final synthetic c:Lob/gb;

.field public final synthetic d:J

.field public final synthetic e:Lob/ob;


# direct methods
.method public constructor <init>(Lob/ob;Landroid/os/Bundle;Lob/gb;Lob/gb;J)V
    .locals 0

    iput-object p2, p0, Lob/hb;->a:Landroid/os/Bundle;

    iput-object p3, p0, Lob/hb;->b:Lob/gb;

    iput-object p4, p0, Lob/hb;->c:Lob/gb;

    iput-wide p5, p0, Lob/hb;->d:J

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lob/hb;->e:Lob/ob;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lob/hb;->e:Lob/ob;

    iget-object v1, p0, Lob/hb;->a:Landroid/os/Bundle;

    iget-object v2, p0, Lob/hb;->b:Lob/gb;

    iget-object v3, p0, Lob/hb;->c:Lob/gb;

    iget-wide v4, p0, Lob/hb;->d:J

    invoke-virtual/range {v0 .. v5}, Lob/ob;->A(Landroid/os/Bundle;Lob/gb;Lob/gb;J)V

    return-void
.end method
