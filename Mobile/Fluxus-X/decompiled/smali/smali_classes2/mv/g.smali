.class public final synthetic Lmv/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lmv/h;

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lmv/h;Ljava/util/List;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmv/g;->a:Lmv/h;

    iput-object p2, p0, Lmv/g;->b:Ljava/util/List;

    iput-object p3, p0, Lmv/g;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lmv/g;->a:Lmv/h;

    iget-object v1, p0, Lmv/g;->b:Ljava/util/List;

    iget-object v2, p0, Lmv/g;->c:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lmv/h;->a(Lmv/h;Ljava/util/List;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
