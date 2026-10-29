.class public Lkm/f$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmm/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkm/f;->E(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lkm/f;


# direct methods
.method public constructor <init>(Lkm/f;)V
    .locals 0

    iput-object p1, p0, Lkm/f$c;->a:Lkm/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lorg/json/JSONObject;)Lmm/l;
    .locals 1

    iget-object v0, p0, Lkm/f$c;->a:Lkm/f;

    invoke-static {v0, p1}, Lkm/f;->c(Lkm/f;Lorg/json/JSONObject;)Lmm/l;

    move-result-object p1

    return-object p1
.end method
