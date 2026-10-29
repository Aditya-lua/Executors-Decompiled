.class public final synthetic Le4/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lkotlin/jvm/internal/c0;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/internal/c0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le4/c;->a:Lkotlin/jvm/internal/c0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Le4/c;->a:Lkotlin/jvm/internal/c0;

    invoke-static {v0}, Landroidx/fragment/app/b$g;->k(Lkotlin/jvm/internal/c0;)V

    return-void
.end method
