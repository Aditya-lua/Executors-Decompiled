.class public final synthetic Lm1/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lm1/i0;

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Lm1/i0;Ljava/util/List;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm1/u;->a:Lm1/i0;

    iput-object p2, p0, Lm1/u;->b:Ljava/util/List;

    iput-object p3, p0, Lm1/u;->c:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lm1/u;->a:Lm1/i0;

    iget-object v1, p0, Lm1/u;->b:Ljava/util/List;

    iget-object v2, p0, Lm1/u;->c:Ljava/lang/Runnable;

    invoke-static {v0, v1, v2}, Lm1/i0;->x(Lm1/i0;Ljava/util/List;Ljava/lang/Runnable;)V

    return-void
.end method
