.class public Lji/j$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltk/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lji/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final synthetic a:Lji/j;


# direct methods
.method public constructor <init>(Lji/j;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lji/j$b;->a:Lji/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lji/j;Lji/k;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lji/j$b;-><init>(Lji/j;)V

    return-void
.end method


# virtual methods
.method public a(Ltk/a;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RBHybridModuleOverlay SetSubmitState.execute() "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ltk/a;->f()Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "RBHybridModuleOverlay"

    invoke-static {v0, p1}, Lgk/q;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method
