.class public final Lm9/d1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lrb/l;

.field public final synthetic b:Lm9/f1;


# direct methods
.method public constructor <init>(Lm9/f1;Lrb/l;)V
    .locals 0

    iput-object p1, p0, Lm9/d1;->b:Lm9/f1;

    iput-object p2, p0, Lm9/d1;->a:Lrb/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lm9/d1;->b:Lm9/f1;

    iget-object v1, p0, Lm9/d1;->a:Lrb/l;

    invoke-static {v0, v1}, Lm9/f1;->t2(Lm9/f1;Lrb/l;)V

    return-void
.end method
