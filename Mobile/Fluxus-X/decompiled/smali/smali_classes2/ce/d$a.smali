.class public Lce/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lce/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:Ljava/util/List;

.field public final b:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lce/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lce/d$a;->a:Ljava/util/List;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lce/d$a;->b:Ljava/util/List;

    return-void
.end method

.method public static bridge synthetic c(Lce/d$a;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lce/d$a;->b:Ljava/util/List;

    return-object p0
.end method

.method public static bridge synthetic d(Lce/d$a;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lce/d$a;->a:Ljava/util/List;

    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lce/d$a;
    .locals 1

    iget-object v0, p0, Lce/d$a;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public b()Lce/d;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lce/d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lce/d;-><init>(Lce/d$a;Lce/q;)V

    return-object v0
.end method
