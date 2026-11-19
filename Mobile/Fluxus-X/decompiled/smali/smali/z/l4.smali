.class public final synthetic Lz/l4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lz/m4;


# direct methods
.method public synthetic constructor <init>(Lz/m4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/l4;->a:Lz/m4;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lz/l4;->a:Lz/m4;

    invoke-static {v0}, Lz/m4;->b(Lz/m4;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
