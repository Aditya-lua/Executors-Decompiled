.class public final synthetic Ln6/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Ln6/c;


# direct methods
.method public synthetic constructor <init>(Ln6/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln6/b;->a:Ln6/c;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ln6/b;->a:Ln6/c;

    invoke-static {v0}, Ln6/c;->b(Ln6/c;)Ln6/g;

    move-result-object v0

    return-object v0
.end method
