.class public final synthetic Lsg/x1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lsg/y1;

.field public final synthetic b:Le4/q;


# direct methods
.method public synthetic constructor <init>(Lsg/y1;Le4/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsg/x1;->a:Lsg/y1;

    iput-object p2, p0, Lsg/x1;->b:Le4/q;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lsg/x1;->a:Lsg/y1;

    iget-object v1, p0, Lsg/x1;->b:Le4/q;

    invoke-static {v0, v1}, Lsg/y1;->k2(Lsg/y1;Le4/q;)V

    return-void
.end method
