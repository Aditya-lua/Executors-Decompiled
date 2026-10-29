.class public final Lnb/je;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public b:J


# direct methods
.method public constructor <init>(Lnb/me;Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lnb/je;->a:Ljava/lang/String;

    .line 3
    invoke-virtual {p1}, Lnb/me;->e()Lu9/e;

    move-result-object p1

    invoke-interface {p1}, Lu9/e;->b()J

    move-result-wide p1

    iput-wide p1, p0, Lnb/je;->b:J

    return-void
.end method

.method public synthetic constructor <init>(Lnb/me;Ljava/lang/String;[B)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lnb/je;-><init>(Lnb/me;Ljava/lang/String;)V

    return-void
.end method

.method public synthetic constructor <init>(Lnb/me;[B)V
    .locals 0

    .line 4
    invoke-virtual {p1}, Lnb/me;->N0()Lnb/ve;

    move-result-object p2

    invoke-virtual {p2}, Lnb/ve;->l0()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lnb/je;-><init>(Lnb/me;Ljava/lang/String;)V

    return-void
.end method
