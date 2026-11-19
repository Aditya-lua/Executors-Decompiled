.class public final Lob/je;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lob/we;

.field public final synthetic b:Lob/ve;


# direct methods
.method public constructor <init>(Lob/ve;Lob/we;)V
    .locals 0

    iput-object p2, p0, Lob/je;->a:Lob/we;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lob/je;->b:Lob/ve;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lob/je;->b:Lob/ve;

    iget-object v1, p0, Lob/je;->a:Lob/we;

    invoke-virtual {v0, v1}, Lob/ve;->u0(Lob/we;)V

    invoke-virtual {v0}, Lob/ve;->A0()V

    return-void
.end method
