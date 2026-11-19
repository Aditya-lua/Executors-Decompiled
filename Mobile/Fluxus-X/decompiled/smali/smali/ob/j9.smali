.class public final Lob/j9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lob/va;


# direct methods
.method public constructor <init>(Lob/va;)V
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lob/j9;->a:Lob/va;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lob/j9;->a:Lob/va;

    iget-object v0, v0, Lob/va;->r:Lob/of;

    invoke-virtual {v0}, Lob/of;->a()V

    return-void
.end method
