.class public final Leb/f;
.super Leb/v;
.source "SourceFile"


# instance fields
.field public final c:Leb/i;


# direct methods
.method public constructor <init>(Leb/i;I)V
    .locals 1

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    invoke-direct {p0, v0, p2}, Leb/v;-><init>(II)V

    iput-object p1, p0, Leb/f;->c:Leb/i;

    return-void
.end method


# virtual methods
.method public final a(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Leb/f;->c:Leb/i;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
