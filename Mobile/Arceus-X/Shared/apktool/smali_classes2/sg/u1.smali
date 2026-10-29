.class public final synthetic Lsg/u1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lsg/y1;

.field public final synthetic b:Le4/q;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lsg/y1;Le4/q;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsg/u1;->a:Lsg/y1;

    iput-object p2, p0, Lsg/u1;->b:Le4/q;

    iput-object p3, p0, Lsg/u1;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lsg/u1;->a:Lsg/y1;

    iget-object v1, p0, Lsg/u1;->b:Le4/q;

    iget-object v2, p0, Lsg/u1;->c:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lsg/y1;->e2(Lsg/y1;Le4/q;Ljava/lang/String;)V

    return-void
.end method
