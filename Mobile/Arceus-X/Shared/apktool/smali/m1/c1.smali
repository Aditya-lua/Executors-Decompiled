.class public final synthetic Lm1/c1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lm1/m;

.field public final synthetic b:Lm1/k;


# direct methods
.method public synthetic constructor <init>(Lm1/m;Lm1/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm1/c1;->a:Lm1/m;

    iput-object p2, p0, Lm1/c1;->b:Lm1/k;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lm1/c1;->a:Lm1/m;

    iget-object v1, p0, Lm1/c1;->b:Lm1/k;

    invoke-static {v0, v1}, Lm1/i0$g;->c(Lm1/m;Lm1/k;)V

    return-void
.end method
