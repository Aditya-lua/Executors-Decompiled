.class public final synthetic Lz4/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lz4/h;

.field public final synthetic b:Z


# direct methods
.method public synthetic constructor <init>(Lz4/h;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz4/f;->a:Lz4/h;

    iput-boolean p2, p0, Lz4/f;->b:Z

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lz4/f;->a:Lz4/h;

    iget-boolean v1, p0, Lz4/f;->b:Z

    invoke-static {v0, v1}, Lz4/h;->a(Lz4/h;Z)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
