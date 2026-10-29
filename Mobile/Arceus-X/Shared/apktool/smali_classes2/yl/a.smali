.class public final synthetic Lyl/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmm/i;


# instance fields
.field public final synthetic a:Lyl/c;


# direct methods
.method public synthetic constructor <init>(Lyl/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyl/a;->a:Lyl/c;

    return-void
.end method


# virtual methods
.method public final a(Lorg/json/JSONObject;)Lmm/l;
    .locals 1

    iget-object v0, p0, Lyl/a;->a:Lyl/c;

    invoke-static {v0, p1}, Lyl/c;->a(Lyl/c;Lorg/json/JSONObject;)Lmm/l;

    move-result-object p1

    return-object p1
.end method
