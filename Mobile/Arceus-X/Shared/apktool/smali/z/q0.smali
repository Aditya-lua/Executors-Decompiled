.class public final synthetic Lz/q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr0/a;


# instance fields
.field public final synthetic a:Lz/k3;

.field public final synthetic b:Ln0/u1;


# direct methods
.method public synthetic constructor <init>(Lz/k3;Ln0/u1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/q0;->a:Lz/k3;

    iput-object p2, p0, Lz/q0;->b:Ln0/u1;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Lne/x;
    .locals 2

    iget-object v0, p0, Lz/q0;->a:Lz/k3;

    iget-object v1, p0, Lz/q0;->b:Ln0/u1;

    check-cast p1, Ljava/lang/Void;

    invoke-static {v0, v1, p1}, Lz/u0;->A(Lz/k3;Ln0/u1;Ljava/lang/Void;)Lne/x;

    move-result-object p1

    return-object p1
.end method
