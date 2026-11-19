.class public final synthetic Luv/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Luv/o;

.field public final synthetic b:I

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Luv/o;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luv/p;->a:Luv/o;

    iput p2, p0, Luv/p;->b:I

    iput p3, p0, Luv/p;->c:I

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Luv/p;->a:Luv/o;

    iget v1, p0, Luv/p;->b:I

    iget v2, p0, Luv/p;->c:I

    invoke-static {v0, v1, v2}, Luv/o$d;->q(Luv/o;II)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
