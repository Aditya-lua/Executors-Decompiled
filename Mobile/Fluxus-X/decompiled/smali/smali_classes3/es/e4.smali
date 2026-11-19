.class public final synthetic Les/e4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Les/h4;

.field public final synthetic b:Les/s6$d$a;


# direct methods
.method public synthetic constructor <init>(Les/h4;Les/s6$d$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Les/e4;->a:Les/h4;

    iput-object p2, p0, Les/e4;->b:Les/s6$d$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Les/e4;->a:Les/h4;

    iget-object v1, p0, Les/e4;->b:Les/s6$d$a;

    invoke-static {v0, v1}, Les/h4;->s(Les/h4;Les/s6$d$a;)V

    return-void
.end method
