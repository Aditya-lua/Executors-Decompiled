.class public final Lm9/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lm9/j0;


# direct methods
.method public constructor <init>(Lm9/j0;I)V
    .locals 0

    iput-object p1, p0, Lm9/g0;->b:Lm9/j0;

    iput p2, p0, Lm9/g0;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lm9/g0;->b:Lm9/j0;

    iget v1, p0, Lm9/g0;->a:I

    invoke-static {v0, v1}, Lm9/j0;->y(Lm9/j0;I)V

    return-void
.end method
