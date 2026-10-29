.class public final synthetic Lhn/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lhn/s;


# direct methods
.method public synthetic constructor <init>(Lhn/s;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhn/o;->a:Lhn/s;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lhn/o;->a:Lhn/s;

    invoke-static {v0}, Lhn/s;->a(Lhn/s;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
