.class public final synthetic Lz/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ln0/u;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Ln0/u;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/x;->a:Ln0/u;

    iput p2, p0, Lz/x;->b:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lz/x;->a:Ln0/u;

    iget v1, p0, Lz/x;->b:I

    invoke-static {v0, v1}, Lz/y$a;->g(Ln0/u;I)V

    return-void
.end method
