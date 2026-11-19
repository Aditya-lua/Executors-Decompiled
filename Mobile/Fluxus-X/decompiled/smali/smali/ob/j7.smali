.class public final Lob/j7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lob/c9;

.field public final synthetic b:Lob/l7;


# direct methods
.method public constructor <init>(Lob/l7;Lob/c9;)V
    .locals 0

    iput-object p2, p0, Lob/j7;->a:Lob/c9;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lob/j7;->b:Lob/l7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lob/j7;->b:Lob/l7;

    iget-object v1, p0, Lob/j7;->a:Lob/c9;

    invoke-virtual {v0, v1}, Lob/l7;->p(Lob/c9;)V

    iget-object v1, v1, Lob/c9;->d:Lcom/google/android/gms/internal/measurement/h2;

    invoke-virtual {v0, v1}, Lob/l7;->v(Lcom/google/android/gms/internal/measurement/h2;)V

    return-void
.end method
