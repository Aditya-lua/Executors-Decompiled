.class public abstract Ln0/a2$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln0/a2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln0/a2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "b"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static h(IILjava/util/List;Ljava/util/List;)Ln0/a2$b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/List<",
            "Ln0/a2$a;",
            ">;",
            "Ljava/util/List<",
            "Ln0/a2$c;",
            ">;)",
            "Ln0/a2$b;"
        }
    .end annotation

    new-instance v0, Ln0/l;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, p3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p3

    invoke-direct {v0, p0, p1, p2, p3}, Ln0/l;-><init>(IILjava/util/List;Ljava/util/List;)V

    return-object v0
.end method
