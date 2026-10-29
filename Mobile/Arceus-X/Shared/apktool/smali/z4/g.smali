.class public final synthetic Lz4/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lf5/c;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lf5/c;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz4/g;->a:Lf5/c;

    iput-object p2, p0, Lz4/g;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lz4/g;->a:Lf5/c;

    iget-object v1, p0, Lz4/g;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lz4/h;->d(Lf5/c;Ljava/lang/String;)Lf5/b;

    move-result-object v0

    return-object v0
.end method
