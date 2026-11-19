.class public final synthetic Lh6/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lz5/f1;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lz5/f1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh6/g;->a:Ljava/lang/String;

    iput-object p2, p0, Lh6/g;->b:Lz5/f1;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lh6/g;->a:Ljava/lang/String;

    iget-object v1, p0, Lh6/g;->b:Lz5/f1;

    invoke-static {v0, v1}, Lh6/h;->a(Ljava/lang/String;Lz5/f1;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
