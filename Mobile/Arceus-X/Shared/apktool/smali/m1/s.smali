.class public final synthetic Lm1/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lm1/i0;

.field public final synthetic b:J

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(Lm1/i0;JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm1/s;->a:Lm1/i0;

    iput-wide p2, p0, Lm1/s;->b:J

    iput-wide p4, p0, Lm1/s;->c:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lm1/s;->a:Lm1/i0;

    iget-wide v1, p0, Lm1/s;->b:J

    iget-wide v3, p0, Lm1/s;->c:J

    invoke-static {v0, v1, v2, v3, v4}, Lm1/i0;->s(Lm1/i0;JJ)V

    return-void
.end method
