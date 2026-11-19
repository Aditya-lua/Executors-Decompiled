.class public final Lob/se;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public b:J


# direct methods
.method public constructor <init>(Lob/ve;Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lob/se;->a:Ljava/lang/String;

    .line 3
    invoke-virtual {p1}, Lob/ve;->e()Lv9/e;

    move-result-object p1

    invoke-interface {p1}, Lv9/e;->b()J

    move-result-wide p1

    iput-wide p1, p0, Lob/se;->b:J

    return-void
.end method

.method public synthetic constructor <init>(Lob/ve;Ljava/lang/String;[B)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lob/se;-><init>(Lob/ve;Ljava/lang/String;)V

    return-void
.end method

.method public synthetic constructor <init>(Lob/ve;[B)V
    .locals 0

    .line 4
    invoke-virtual {p1}, Lob/ve;->N0()Lob/ff;

    move-result-object p2

    invoke-virtual {p2}, Lob/ff;->l0()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lob/se;-><init>(Lob/ve;Ljava/lang/String;)V

    return-void
.end method
