.class public final synthetic Lep/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lep/m;


# direct methods
.method public synthetic constructor <init>(Lep/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lep/h;->a:Lep/m;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lep/h;->a:Lep/m;

    invoke-static {v0}, Lep/m;->n2(Lep/m;)Lnn/z;

    move-result-object v0

    return-object v0
.end method
