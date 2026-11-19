.class public final synthetic Lis/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lis/c;


# direct methods
.method public synthetic constructor <init>(Lis/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lis/b;->a:Lis/c;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lis/b;->a:Lis/c;

    check-cast p1, Landroidx/lifecycle/l0;

    invoke-static {v0, p1}, Lis/c;->j2(Lis/c;Landroidx/lifecycle/l0;)Lis/f;

    move-result-object p1

    return-object p1
.end method
