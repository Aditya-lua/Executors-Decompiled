.class public final synthetic Lkotlin/collections/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lkotlin/collections/b;


# direct methods
.method public synthetic constructor <init>(Lkotlin/collections/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkotlin/collections/a;->a:Lkotlin/collections/b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lkotlin/collections/a;->a:Lkotlin/collections/b;

    invoke-static {v0, p1}, Lkotlin/collections/b;->a(Lkotlin/collections/b;Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method
