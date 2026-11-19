.class public final synthetic Llk/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/engine/jni/memstorage/Callback;


# instance fields
.field public final synthetic a:Llk/i;


# direct methods
.method public synthetic constructor <init>(Llk/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llk/g;->a:Llk/i;

    return-void
.end method


# virtual methods
.method public final onItemSet(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Llk/g;->a:Llk/i;

    invoke-virtual {v0, p1}, Llk/i;->c(Ljava/lang/String;)V

    return-void
.end method
