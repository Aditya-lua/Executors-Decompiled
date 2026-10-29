.class public final synthetic Ln0/s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ln0/y0$b;

.field public final synthetic b:Ljava/util/Set;


# direct methods
.method public synthetic constructor <init>(Ln0/y0$b;Ljava/util/Set;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln0/s0;->a:Ln0/y0$b;

    iput-object p2, p0, Ln0/s0;->b:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ln0/s0;->a:Ln0/y0$b;

    iget-object v1, p0, Ln0/s0;->b:Ljava/util/Set;

    invoke-static {v0, v1}, Ln0/y0;->b(Ln0/y0$b;Ljava/util/Set;)V

    return-void
.end method
