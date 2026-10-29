.class public final synthetic Lne/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lne/g;

.field public final synthetic b:Lie/r;


# direct methods
.method public synthetic constructor <init>(Lne/g;Lie/r;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lne/f;->a:Lne/g;

    iput-object p2, p0, Lne/f;->b:Lie/r;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lne/f;->a:Lne/g;

    iget-object v1, p0, Lne/f;->b:Lie/r;

    invoke-static {v0, v1}, Lne/g;->O(Lne/g;Lie/r;)V

    return-void
.end method
