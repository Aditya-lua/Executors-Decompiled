.class public final synthetic Lz/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ln0/u;

.field public final synthetic b:I

.field public final synthetic c:Ln0/w;


# direct methods
.method public synthetic constructor <init>(Ln0/u;ILn0/w;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/v;->a:Ln0/u;

    iput p2, p0, Lz/v;->b:I

    iput-object p3, p0, Lz/v;->c:Ln0/w;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lz/v;->a:Ln0/u;

    iget v1, p0, Lz/v;->b:I

    iget-object v2, p0, Lz/v;->c:Ln0/w;

    invoke-static {v0, v1, v2}, Lz/y$a;->e(Ln0/u;ILn0/w;)V

    return-void
.end method
