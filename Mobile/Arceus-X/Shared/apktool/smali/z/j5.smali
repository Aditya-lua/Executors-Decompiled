.class public final synthetic Lz/j5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr0/a;


# instance fields
.field public final synthetic a:Lz/n5;

.field public final synthetic b:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lz/n5;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/j5;->a:Lz/n5;

    iput-object p2, p0, Lz/j5;->b:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Lne/x;
    .locals 2

    iget-object v0, p0, Lz/j5;->a:Lz/n5;

    iget-object v1, p0, Lz/j5;->b:Ljava/util/List;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, v1, p1}, Lz/n5;->A(Lz/n5;Ljava/util/List;Ljava/util/List;)Lne/x;

    move-result-object p1

    return-object p1
.end method
