.class public final synthetic Lhn/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lhn/c;


# direct methods
.method public synthetic constructor <init>(Lhn/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhn/d;->a:Lhn/c;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lhn/d;->a:Lhn/c;

    invoke-static {v0}, Lhn/c$c$a;->b(Lhn/c;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
