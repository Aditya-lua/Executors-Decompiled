.class public final synthetic Lrq/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lrq/c;

.field public final synthetic b:Ljava/io/File;


# direct methods
.method public synthetic constructor <init>(Lrq/c;Ljava/io/File;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrq/b;->a:Lrq/c;

    iput-object p2, p0, Lrq/b;->b:Ljava/io/File;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lrq/b;->a:Lrq/c;

    iget-object v1, p0, Lrq/b;->b:Ljava/io/File;

    invoke-static {v0, v1}, Lrq/c;->b(Lrq/c;Ljava/io/File;)Ljt/n;

    move-result-object v0

    return-object v0
.end method
