.class public final synthetic Luv/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Luv/o;

.field public final synthetic b:I

.field public final synthetic c:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Luv/o;ILjava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luv/l;->a:Luv/o;

    iput p2, p0, Luv/l;->b:I

    iput-object p3, p0, Luv/l;->c:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Luv/l;->a:Luv/o;

    iget v1, p0, Luv/l;->b:I

    iget-object v2, p0, Luv/l;->c:Ljava/util/List;

    invoke-static {v0, v1, v2}, Luv/o;->a(Luv/o;ILjava/util/List;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
