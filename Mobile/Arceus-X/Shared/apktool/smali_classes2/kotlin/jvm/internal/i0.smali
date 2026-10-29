.class public final synthetic Lkotlin/jvm/internal/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lkotlin/jvm/internal/j0;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/internal/j0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkotlin/jvm/internal/i0;->a:Lkotlin/jvm/internal/j0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lkotlin/jvm/internal/i0;->a:Lkotlin/jvm/internal/j0;

    check-cast p1, Lkotlin/reflect/KTypeProjection;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/j0;->d(Lkotlin/jvm/internal/j0;Lkotlin/reflect/KTypeProjection;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method
