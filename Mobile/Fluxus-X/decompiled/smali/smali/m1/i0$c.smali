.class public Lm1/i0$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm1/o1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm1/i0;->f0(Lm1/o1;Lt/a;)Lm1/o1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lt/a;

.field public final synthetic b:Lm1/o1;


# direct methods
.method public constructor <init>(Lt/a;Lm1/o1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lm1/i0$c;->a:Lt/a;

    iput-object p2, p0, Lm1/i0$c;->b:Lm1/o1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()J
    .locals 3

    iget-object v0, p0, Lm1/i0$c;->a:Lt/a;

    iget-object v1, p0, Lm1/i0$c;->b:Lm1/o1;

    invoke-interface {v1}, Lm1/o1;->a()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, Lt/a;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public b()J
    .locals 3

    iget-object v0, p0, Lm1/i0$c;->a:Lt/a;

    iget-object v1, p0, Lm1/i0$c;->b:Lm1/o1;

    invoke-interface {v1}, Lm1/o1;->b()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, Lt/a;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method
