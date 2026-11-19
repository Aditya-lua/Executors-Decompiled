.class public Lri/j$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lal/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lri/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public final synthetic a:Lri/j;


# direct methods
.method public constructor <init>(Lri/j;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lri/j$a;->a:Lri/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lri/j;Lri/k;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lri/j$a;-><init>(Lri/j;)V

    return-void
.end method


# virtual methods
.method public a(Lal/a;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RBHybridModuleOverlay CloseOverlay.execute() "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lal/a;->f()Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "RBHybridModuleOverlay"

    invoke-static {v0, p1}, Lok/q;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lmw/c;->d()Lmw/c;

    move-result-object p1

    new-instance v0, Lyh/d;

    invoke-direct {v0}, Lyh/d;-><init>()V

    invoke-virtual {p1, v0}, Lmw/c;->j(Ljava/lang/Object;)V

    return-void
.end method
