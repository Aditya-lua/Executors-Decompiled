.class public final synthetic Lm0/d1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lm0/f1;

.field public final synthetic b:Lm0/y0;


# direct methods
.method public synthetic constructor <init>(Lm0/f1;Lm0/y0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/d1;->a:Lm0/f1;

    iput-object p2, p0, Lm0/d1;->b:Lm0/y0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lm0/d1;->a:Lm0/f1;

    iget-object v1, p0, Lm0/d1;->b:Lm0/y0;

    invoke-static {v0, v1}, Lm0/f1;->g(Lm0/f1;Lm0/y0;)V

    return-void
.end method
