.class public final synthetic Lg6/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lg6/g0;

.field public final synthetic b:Ljava/util/UUID;

.field public final synthetic c:Landroidx/work/b;


# direct methods
.method public synthetic constructor <init>(Lg6/g0;Ljava/util/UUID;Landroidx/work/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg6/f0;->a:Lg6/g0;

    iput-object p2, p0, Lg6/f0;->b:Ljava/util/UUID;

    iput-object p3, p0, Lg6/f0;->c:Landroidx/work/b;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lg6/f0;->a:Lg6/g0;

    iget-object v1, p0, Lg6/f0;->b:Ljava/util/UUID;

    iget-object v2, p0, Lg6/f0;->c:Landroidx/work/b;

    invoke-static {v0, v1, v2}, Lg6/g0;->b(Lg6/g0;Ljava/util/UUID;Landroidx/work/b;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
