.class public final synthetic Lm1/v0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lm1/i0$g;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Lm1/i0$g;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm1/v0;->a:Lm1/i0$g;

    iput p2, p0, Lm1/v0;->b:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lm1/v0;->a:Lm1/i0$g;

    iget v1, p0, Lm1/v0;->b:I

    invoke-static {v0, v1}, Lm1/i0$g;->g(Lm1/i0$g;I)V

    return-void
.end method
