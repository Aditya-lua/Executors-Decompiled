.class public final synthetic Ltl/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmm/j;


# instance fields
.field public final synthetic a:Ltl/d0;


# direct methods
.method public synthetic constructor <init>(Ltl/d0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltl/a0;->a:Ltl/d0;

    return-void
.end method


# virtual methods
.method public final a(Lorg/json/JSONObject;Lmm/m;)V
    .locals 1

    iget-object v0, p0, Ltl/a0;->a:Ltl/d0;

    invoke-static {v0, p1, p2}, Ltl/d0;->j(Ltl/d0;Lorg/json/JSONObject;Lmm/m;)V

    return-void
.end method
