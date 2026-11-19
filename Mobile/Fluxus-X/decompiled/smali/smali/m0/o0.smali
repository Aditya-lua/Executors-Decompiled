.class public final synthetic Lm0/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lm0/u0;

.field public final synthetic b:Lm0/u0$b;


# direct methods
.method public synthetic constructor <init>(Lm0/u0;Lm0/u0$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/o0;->a:Lm0/u0;

    iput-object p2, p0, Lm0/o0;->b:Lm0/u0$b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lm0/o0;->a:Lm0/u0;

    iget-object v1, p0, Lm0/o0;->b:Lm0/u0$b;

    invoke-static {v0, v1}, Lm0/u0;->e(Lm0/u0;Lm0/u0$b;)V

    return-void
.end method
