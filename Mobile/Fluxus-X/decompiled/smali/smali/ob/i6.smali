.class public final Lob/i6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Lob/j6;


# direct methods
.method public constructor <init>(Lob/j6;Z)V
    .locals 0

    iput-boolean p2, p0, Lob/i6;->a:Z

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lob/i6;->b:Lob/j6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lob/i6;->b:Lob/j6;

    invoke-virtual {v0}, Lob/j6;->c()Lob/ve;

    move-result-object v0

    iget-boolean v1, p0, Lob/i6;->a:Z

    invoke-virtual {v0, v1}, Lob/ve;->s0(Z)V

    return-void
.end method
