.class public final synthetic Lua/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm9/q;


# instance fields
.field public final synthetic a:Lta/k;


# direct methods
.method public synthetic constructor <init>(Lta/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lua/f;->a:Lta/k;

    return-void
.end method


# virtual methods
.method public final synthetic accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    check-cast p2, Ltb/k;

    iget-object v0, p0, Lua/f;->a:Lta/k;

    check-cast p1, Lua/d;

    invoke-static {v0, p1, p2}, Lua/e;->T(Lta/k;Lua/d;Ltb/k;)V

    return-void
.end method
