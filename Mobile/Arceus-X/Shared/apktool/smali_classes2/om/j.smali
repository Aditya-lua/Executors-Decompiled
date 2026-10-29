.class public final synthetic Lom/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmm/j;


# instance fields
.field public final synthetic a:Lom/k;


# direct methods
.method public synthetic constructor <init>(Lom/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lom/j;->a:Lom/k;

    return-void
.end method


# virtual methods
.method public final a(Lorg/json/JSONObject;Lmm/m;)V
    .locals 1

    iget-object v0, p0, Lom/j;->a:Lom/k;

    invoke-static {v0, p1, p2}, Lom/k;->f(Lom/k;Lorg/json/JSONObject;Lmm/m;)V

    return-void
.end method
