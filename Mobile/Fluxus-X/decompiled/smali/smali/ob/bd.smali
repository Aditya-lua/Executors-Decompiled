.class public final Lob/bd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lob/ve;

.field public final synthetic b:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Lob/gd;Lob/ve;Ljava/lang/Runnable;)V
    .locals 0

    iput-object p2, p0, Lob/bd;->a:Lob/ve;

    iput-object p3, p0, Lob/bd;->b:Ljava/lang/Runnable;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lob/bd;->a:Lob/ve;

    invoke-virtual {v0}, Lob/ve;->E()V

    iget-object v1, p0, Lob/bd;->b:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Lob/ve;->D(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lob/ve;->r()V

    return-void
.end method
