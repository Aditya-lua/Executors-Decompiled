.class public final synthetic Lcom/google/gson/internal/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/gson/internal/ObjectConstructor;


# instance fields
.field public final synthetic a:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/gson/internal/k;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final construct()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/gson/internal/k;->a:Ljava/lang/String;

    invoke-static {v0}, Lcom/google/gson/internal/ConstructorConstructor;->k(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
