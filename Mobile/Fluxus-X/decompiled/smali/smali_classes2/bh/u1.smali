.class public final synthetic Lbh/u1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lbh/y1;

.field public final synthetic b:Lf4/v;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lbh/y1;Lf4/v;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbh/u1;->a:Lbh/y1;

    iput-object p2, p0, Lbh/u1;->b:Lf4/v;

    iput-object p3, p0, Lbh/u1;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lbh/u1;->a:Lbh/y1;

    iget-object v1, p0, Lbh/u1;->b:Lf4/v;

    iget-object v2, p0, Lbh/u1;->c:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lbh/y1;->e2(Lbh/y1;Lf4/v;Ljava/lang/String;)V

    return-void
.end method
