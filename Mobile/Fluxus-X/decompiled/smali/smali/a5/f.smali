.class public final synthetic La5/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:La5/h;

.field public final synthetic b:Z


# direct methods
.method public synthetic constructor <init>(La5/h;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La5/f;->a:La5/h;

    iput-boolean p2, p0, La5/f;->b:Z

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, La5/f;->a:La5/h;

    iget-boolean v1, p0, La5/f;->b:Z

    invoke-static {v0, v1}, La5/h;->a(La5/h;Z)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
