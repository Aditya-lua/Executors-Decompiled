.class public final synthetic Lyu/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Lxu/g;

.field public final synthetic b:Lkotlin/jvm/internal/c0;

.field public final synthetic c:Lkotlin/jvm/internal/c0;

.field public final synthetic d:Lkotlin/jvm/internal/c0;


# direct methods
.method public synthetic constructor <init>(Lxu/g;Lkotlin/jvm/internal/c0;Lkotlin/jvm/internal/c0;Lkotlin/jvm/internal/c0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyu/q;->a:Lxu/g;

    iput-object p2, p0, Lyu/q;->b:Lkotlin/jvm/internal/c0;

    iput-object p3, p0, Lyu/q;->c:Lkotlin/jvm/internal/c0;

    iput-object p4, p0, Lyu/q;->d:Lkotlin/jvm/internal/c0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lyu/q;->a:Lxu/g;

    iget-object v1, p0, Lyu/q;->b:Lkotlin/jvm/internal/c0;

    iget-object v2, p0, Lyu/q;->c:Lkotlin/jvm/internal/c0;

    iget-object v3, p0, Lyu/q;->d:Lkotlin/jvm/internal/c0;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v4

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    invoke-static/range {v0 .. v6}, Lyu/t;->a(Lxu/g;Lkotlin/jvm/internal/c0;Lkotlin/jvm/internal/c0;Lkotlin/jvm/internal/c0;IJ)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
