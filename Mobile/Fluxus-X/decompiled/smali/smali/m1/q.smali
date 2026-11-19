.class public final synthetic Lm1/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lm1/i0;

.field public final synthetic b:J


# direct methods
.method public synthetic constructor <init>(Lm1/i0;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm1/q;->a:Lm1/i0;

    iput-wide p2, p0, Lm1/q;->b:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lm1/q;->a:Lm1/i0;

    iget-wide v1, p0, Lm1/q;->b:J

    invoke-static {v0, v1, v2}, Lm1/i0;->t(Lm1/i0;J)V

    return-void
.end method
