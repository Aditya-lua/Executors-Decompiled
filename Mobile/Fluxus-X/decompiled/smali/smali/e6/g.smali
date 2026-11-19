.class public final synthetic Le6/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ljava/util/List;

.field public final synthetic b:Le6/h;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Le6/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le6/g;->a:Ljava/util/List;

    iput-object p2, p0, Le6/g;->b:Le6/h;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Le6/g;->a:Ljava/util/List;

    iget-object v1, p0, Le6/g;->b:Le6/h;

    invoke-static {v0, v1}, Le6/h;->a(Ljava/util/List;Le6/h;)V

    return-void
.end method
