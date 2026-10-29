.class public final synthetic Lh5/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lh5/g;


# direct methods
.method public synthetic constructor <init>(Lh5/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh5/f;->a:Lh5/g;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lh5/f;->a:Lh5/g;

    invoke-static {v0}, Lh5/g;->a(Lh5/g;)Lh5/g$c;

    move-result-object v0

    return-object v0
.end method
