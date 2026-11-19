.class public final Lob/me;
.super Lob/z;
.source "SourceFile"


# instance fields
.field public final synthetic e:Lob/ve;


# direct methods
.method public constructor <init>(Lob/ve;Lob/q8;)V
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lob/me;->e:Lob/ve;

    invoke-direct {p0, p2}, Lob/z;-><init>(Lob/q8;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    iget-object v0, p0, Lob/me;->e:Lob/ve;

    invoke-virtual {v0}, Lob/ve;->b()Lob/h7;

    move-result-object v1

    invoke-virtual {v1}, Lob/o8;->h()V

    invoke-virtual {v0}, Lob/ve;->y0()Ljava/util/Deque;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Deque;->pollFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lob/ve;->e()Lv9/e;

    move-result-object v2

    invoke-interface {v2}, Lv9/e;->b()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lob/ve;->z0(J)V

    invoke-virtual {v0}, Lob/ve;->a()Lob/b6;

    move-result-object v2

    invoke-virtual {v2}, Lob/b6;->w()Lob/z5;

    move-result-object v2

    const-string v3, "Sending trigger URI notification to app"

    invoke-virtual {v2, v3, v1}, Lob/z5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    const-string v3, "com.google.android.gms.measurement.TRIGGERS_AVAILABLE"

    invoke-virtual {v2, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {v2, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {v0}, Lob/ve;->d()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v2}, Lob/ve;->w0(Landroid/content/Context;Landroid/content/Intent;)V

    :cond_0
    invoke-virtual {v0}, Lob/ve;->v0()V

    return-void
.end method
