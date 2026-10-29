.class public final synthetic Lf1/q1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lf1/p1$b;

.field public final synthetic b:Ln0/o3$b;


# direct methods
.method public synthetic constructor <init>(Lf1/p1$b;Ln0/o3$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf1/q1;->a:Lf1/p1$b;

    iput-object p2, p0, Lf1/q1;->b:Ln0/o3$b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lf1/q1;->a:Lf1/p1$b;

    iget-object v1, p0, Lf1/q1;->b:Ln0/o3$b;

    invoke-static {v0, v1}, Lf1/p1$b;->e(Lf1/p1$b;Ln0/o3$b;)V

    return-void
.end method
