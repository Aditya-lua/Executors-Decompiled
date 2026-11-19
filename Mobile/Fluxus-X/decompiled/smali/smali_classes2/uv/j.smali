.class public final synthetic Luv/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Luv/o;

.field public final synthetic b:I

.field public final synthetic c:Luv/b;


# direct methods
.method public synthetic constructor <init>(Luv/o;ILuv/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luv/j;->a:Luv/o;

    iput p2, p0, Luv/j;->b:I

    iput-object p3, p0, Luv/j;->c:Luv/b;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Luv/j;->a:Luv/o;

    iget v1, p0, Luv/j;->b:I

    iget-object v2, p0, Luv/j;->c:Luv/b;

    invoke-static {v0, v1, v2}, Luv/o;->h(Luv/o;ILuv/b;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
