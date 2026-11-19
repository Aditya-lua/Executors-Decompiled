.class public final synthetic Lkv/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpu/n;


# instance fields
.field public final synthetic a:Lkv/f;


# direct methods
.method public synthetic constructor <init>(Lkv/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkv/b;->a:Lkv/f;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lkv/b;->a:Lkv/f;

    check-cast p1, Ljv/l;

    invoke-static {v0, p1, p2, p3}, Lkv/f;->x(Lkv/f;Ljv/l;Ljava/lang/Object;Ljava/lang/Object;)Lpu/n;

    move-result-object p1

    return-object p1
.end method
