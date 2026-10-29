.class public final synthetic Lz/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lz/y;

.field public final synthetic b:Ln0/u;


# direct methods
.method public synthetic constructor <init>(Lz/y;Ln0/u;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/j;->a:Lz/y;

    iput-object p2, p0, Lz/j;->b:Ln0/u;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lz/j;->a:Lz/y;

    iget-object v1, p0, Lz/j;->b:Ln0/u;

    invoke-static {v0, v1}, Lz/y;->u(Lz/y;Ln0/u;)V

    return-void
.end method
