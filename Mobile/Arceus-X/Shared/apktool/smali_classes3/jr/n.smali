.class public final synthetic Ljr/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lkotlin/jvm/internal/c0;

.field public final synthetic b:Z


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/internal/c0;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljr/n;->a:Lkotlin/jvm/internal/c0;

    iput-boolean p2, p0, Ljr/n;->b:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ljr/n;->a:Lkotlin/jvm/internal/c0;

    iget-boolean v1, p0, Ljr/n;->b:Z

    invoke-static {v0, v1}, Ljr/o;->a(Lkotlin/jvm/internal/c0;Z)V

    return-void
.end method
