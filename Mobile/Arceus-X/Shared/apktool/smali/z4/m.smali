.class public final synthetic Lz4/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lz4/n;


# direct methods
.method public synthetic constructor <init>(Lz4/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz4/m;->a:Lz4/n;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lz4/m;->a:Lz4/n;

    invoke-static {v0}, Lz4/n;->a(Lz4/n;)Lf5/b;

    move-result-object v0

    return-object v0
.end method
