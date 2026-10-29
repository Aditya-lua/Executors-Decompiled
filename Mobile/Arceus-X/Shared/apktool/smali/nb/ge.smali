.class public final Lnb/ge;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Landroid/os/Bundle;

.field public final synthetic d:Lnb/he;


# direct methods
.method public constructor <init>(Lnb/he;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    iput-object p2, p0, Lnb/ge;->a:Ljava/lang/String;

    iput-object p3, p0, Lnb/ge;->b:Ljava/lang/String;

    iput-object p4, p0, Lnb/ge;->c:Landroid/os/Bundle;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/ge;->d:Lnb/he;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    iget-object v0, p0, Lnb/ge;->d:Lnb/he;

    iget-object v0, v0, Lnb/he;->a:Lnb/me;

    invoke-virtual {v0}, Lnb/me;->N0()Lnb/ve;

    move-result-object v1

    invoke-virtual {v0}, Lnb/me;->e()Lu9/e;

    move-result-object v2

    invoke-interface {v2}, Lu9/e;->a()J

    move-result-wide v6

    iget-object v2, p0, Lnb/ge;->a:Ljava/lang/String;

    iget-object v3, p0, Lnb/ge;->b:Ljava/lang/String;

    iget-object v4, p0, Lnb/ge;->c:Landroid/os/Bundle;

    const/4 v8, 0x0

    const/4 v9, 0x1

    const-string v5, "auto"

    invoke-virtual/range {v1 .. v9}, Lnb/ve;->R(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;JZZ)Lcom/google/android/gms/measurement/internal/zzbg;

    move-result-object v1

    invoke-static {v1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/measurement/internal/zzbg;

    invoke-virtual {v0, v1, v2}, Lnb/me;->i(Lcom/google/android/gms/measurement/internal/zzbg;Ljava/lang/String;)V

    return-void
.end method
