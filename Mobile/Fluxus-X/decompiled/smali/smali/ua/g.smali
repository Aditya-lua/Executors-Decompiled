.class public final synthetic Lua/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm9/q;


# instance fields
.field public final synthetic a:Lta/o0;


# direct methods
.method public synthetic constructor <init>(Lta/o0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lua/g;->a:Lta/o0;

    return-void
.end method


# virtual methods
.method public final synthetic accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    check-cast p2, Ltb/k;

    iget-object v0, p0, Lua/g;->a:Lta/o0;

    check-cast p1, Lua/d;

    invoke-static {v0, p1, p2}, Lua/e;->U(Lta/o0;Lua/d;Ltb/k;)V

    return-void
.end method
