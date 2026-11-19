.class public final synthetic Lz/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lz/u0;

.field public final synthetic b:Z


# direct methods
.method public synthetic constructor <init>(Lz/u0;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/j0;->a:Lz/u0;

    iput-boolean p2, p0, Lz/j0;->b:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lz/j0;->a:Lz/u0;

    iget-boolean v1, p0, Lz/j0;->b:Z

    invoke-static {v0, v1}, Lz/u0;->B(Lz/u0;Z)V

    return-void
.end method
