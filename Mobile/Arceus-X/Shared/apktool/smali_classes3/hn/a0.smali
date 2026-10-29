.class public final synthetic Lhn/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lhn/b0;


# direct methods
.method public synthetic constructor <init>(Lhn/b0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhn/a0;->a:Lhn/b0;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lhn/a0;->a:Lhn/b0;

    invoke-static {v0}, Lhn/b0;->d(Lhn/b0;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
