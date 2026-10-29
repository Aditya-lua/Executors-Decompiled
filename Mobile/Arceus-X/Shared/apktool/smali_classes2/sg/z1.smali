.class public final synthetic Lsg/z1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lsg/y1$i;


# direct methods
.method public synthetic constructor <init>(Lsg/y1$i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsg/z1;->a:Lsg/y1$i;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lsg/z1;->a:Lsg/y1$i;

    invoke-static {v0}, Lsg/y1$i;->b(Lsg/y1$i;)V

    return-void
.end method
