.class public final synthetic Lz/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ln0/u;

.field public final synthetic b:I

.field public final synthetic c:Ln0/e0;


# direct methods
.method public synthetic constructor <init>(Ln0/u;ILn0/e0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/w;->a:Ln0/u;

    iput p2, p0, Lz/w;->b:I

    iput-object p3, p0, Lz/w;->c:Ln0/e0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lz/w;->a:Ln0/u;

    iget v1, p0, Lz/w;->b:I

    iget-object v2, p0, Lz/w;->c:Ln0/e0;

    invoke-static {v0, v1, v2}, Lz/y$a;->f(Ln0/u;ILn0/e0;)V

    return-void
.end method
