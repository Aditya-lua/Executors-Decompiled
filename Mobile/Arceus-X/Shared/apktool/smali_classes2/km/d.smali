.class public final synthetic Lkm/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmm/i;


# instance fields
.field public final synthetic a:Lkm/f;


# direct methods
.method public synthetic constructor <init>(Lkm/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkm/d;->a:Lkm/f;

    return-void
.end method


# virtual methods
.method public final a(Lorg/json/JSONObject;)Lmm/l;
    .locals 1

    iget-object v0, p0, Lkm/d;->a:Lkm/f;

    invoke-static {v0, p1}, Lkm/f;->a(Lkm/f;Lorg/json/JSONObject;)Lmm/l;

    move-result-object p1

    return-object p1
.end method
