.class public final synthetic Lyn/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lyn/z;


# direct methods
.method public synthetic constructor <init>(Lyn/z;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyn/w;->a:Lyn/z;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lyn/w;->a:Lyn/z;

    check-cast p1, Lx8/c;

    invoke-static {v0, p1}, Lyn/z;->c(Lyn/z;Lx8/c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
