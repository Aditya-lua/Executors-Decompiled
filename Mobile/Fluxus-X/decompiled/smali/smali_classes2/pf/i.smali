.class public final synthetic Lpf/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lpf/o;

.field public final synthetic b:Ljava/lang/Runnable;

.field public final synthetic c:Lpf/p$b;


# direct methods
.method public synthetic constructor <init>(Lpf/o;Ljava/lang/Runnable;Lpf/p$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpf/i;->a:Lpf/o;

    iput-object p2, p0, Lpf/i;->b:Ljava/lang/Runnable;

    iput-object p3, p0, Lpf/i;->c:Lpf/p$b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lpf/i;->a:Lpf/o;

    iget-object v1, p0, Lpf/i;->b:Ljava/lang/Runnable;

    iget-object v2, p0, Lpf/i;->c:Lpf/p$b;

    invoke-static {v0, v1, v2}, Lpf/o;->g(Lpf/o;Ljava/lang/Runnable;Lpf/p$b;)V

    return-void
.end method
