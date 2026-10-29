.class public final synthetic Lhn/p;
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

    iput-object p1, p0, Lhn/p;->a:Lhn/s;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lhn/p;->a:Lhn/s;

    invoke-static {v0}, Lhn/s;->e(Lhn/s;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
