.class public final synthetic Lz/e5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lz/g5;

.field public final synthetic b:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lz/g5;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/e5;->a:Lz/g5;

    iput-object p2, p0, Lz/e5;->b:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lz/e5;->a:Lz/g5;

    iget-object v1, p0, Lz/e5;->b:Ljava/util/List;

    invoke-static {v0, v1}, Lz/g5;->a(Lz/g5;Ljava/util/List;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
