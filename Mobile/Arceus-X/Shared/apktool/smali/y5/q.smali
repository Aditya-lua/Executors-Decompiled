.class public final synthetic Ly5/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ly5/s;

.field public final synthetic b:Lne/x;

.field public final synthetic c:Ly5/q1;


# direct methods
.method public synthetic constructor <init>(Ly5/s;Lne/x;Ly5/q1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly5/q;->a:Ly5/s;

    iput-object p2, p0, Ly5/q;->b:Lne/x;

    iput-object p3, p0, Ly5/q;->c:Ly5/q1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Ly5/q;->a:Ly5/s;

    iget-object v1, p0, Ly5/q;->b:Lne/x;

    iget-object v2, p0, Ly5/q;->c:Ly5/q1;

    invoke-static {v0, v1, v2}, Ly5/s;->d(Ly5/s;Lne/x;Ly5/q1;)V

    return-void
.end method
