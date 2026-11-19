.class public final synthetic Luv/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Luv/o$d;

.field public final synthetic b:Z

.field public final synthetic c:Luv/z;


# direct methods
.method public synthetic constructor <init>(Luv/o$d;ZLuv/z;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luv/r;->a:Luv/o$d;

    iput-boolean p2, p0, Luv/r;->b:Z

    iput-object p3, p0, Luv/r;->c:Luv/z;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Luv/r;->a:Luv/o$d;

    iget-boolean v1, p0, Luv/r;->b:Z

    iget-object v2, p0, Luv/r;->c:Luv/z;

    invoke-static {v0, v1, v2}, Luv/o$d;->s(Luv/o$d;ZLuv/z;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
