.class public final synthetic Lx0/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lx0/t;

.field public final synthetic b:Lx0/t$b;


# direct methods
.method public synthetic constructor <init>(Lx0/t;Lx0/t$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx0/j;->a:Lx0/t;

    iput-object p2, p0, Lx0/j;->b:Lx0/t$b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lx0/j;->a:Lx0/t;

    iget-object v1, p0, Lx0/j;->b:Lx0/t$b;

    invoke-static {v0, v1}, Lx0/t;->e(Lx0/t;Lx0/t$b;)V

    return-void
.end method
