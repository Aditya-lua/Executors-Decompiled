.class public final synthetic Lm6/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lm6/c;


# direct methods
.method public synthetic constructor <init>(Lm6/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm6/b;->a:Lm6/c;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lm6/b;->a:Lm6/c;

    invoke-static {v0}, Lm6/c;->b(Lm6/c;)Lm6/g;

    move-result-object v0

    return-object v0
.end method
