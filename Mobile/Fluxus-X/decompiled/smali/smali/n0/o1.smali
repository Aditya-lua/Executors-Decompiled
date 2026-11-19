.class public final synthetic Ln0/o1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ln0/p1;

.field public final synthetic b:Ln0/a3$a;


# direct methods
.method public synthetic constructor <init>(Ln0/p1;Ln0/a3$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln0/o1;->a:Ln0/p1;

    iput-object p2, p0, Ln0/o1;->b:Ln0/a3$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ln0/o1;->a:Ln0/p1;

    iget-object v1, p0, Ln0/o1;->b:Ln0/a3$a;

    invoke-static {v0, v1}, Ln0/p1;->a(Ln0/p1;Ln0/a3$a;)V

    return-void
.end method
