.class public final synthetic Lbh/o1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lbh/y1;

.field public final synthetic b:Lf4/v;

.field public final synthetic c:Lmj/p;


# direct methods
.method public synthetic constructor <init>(Lbh/y1;Lf4/v;Lmj/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbh/o1;->a:Lbh/y1;

    iput-object p2, p0, Lbh/o1;->b:Lf4/v;

    iput-object p3, p0, Lbh/o1;->c:Lmj/p;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lbh/o1;->a:Lbh/y1;

    iget-object v1, p0, Lbh/o1;->b:Lf4/v;

    iget-object v2, p0, Lbh/o1;->c:Lmj/p;

    invoke-static {v0, v1, v2}, Lbh/y1;->b2(Lbh/y1;Lf4/v;Lmj/p;)V

    return-void
.end method
