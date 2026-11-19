.class public final synthetic Lf1/l1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lf1/p1;

.field public final synthetic b:Ln0/u1;


# direct methods
.method public synthetic constructor <init>(Lf1/p1;Ln0/u1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf1/l1;->a:Lf1/p1;

    iput-object p2, p0, Lf1/l1;->b:Ln0/u1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lf1/l1;->a:Lf1/p1;

    iget-object v1, p0, Lf1/l1;->b:Ln0/u1;

    invoke-static {v0, v1}, Lf1/p1;->j0(Lf1/p1;Ln0/u1;)V

    return-void
.end method
