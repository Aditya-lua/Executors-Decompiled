.class public final Leb/a1;
.super Leb/v0;
.source "SourceFile"


# instance fields
.field public final c:Leb/e1;


# direct methods
.method public constructor <init>(Leb/e1;I)V
    .locals 1

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    invoke-direct {p0, v0, p2}, Leb/v0;-><init>(II)V

    iput-object p1, p0, Leb/a1;->c:Leb/e1;

    return-void
.end method


# virtual methods
.method public final a(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Leb/a1;->c:Leb/e1;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
