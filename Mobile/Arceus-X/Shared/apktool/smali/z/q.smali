.class public final synthetic Lz/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr0/a;


# instance fields
.field public final synthetic a:Lz/y;

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:I

.field public final synthetic d:I

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(Lz/y;Ljava/util/List;III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/q;->a:Lz/y;

    iput-object p2, p0, Lz/q;->b:Ljava/util/List;

    iput p3, p0, Lz/q;->c:I

    iput p4, p0, Lz/q;->d:I

    iput p5, p0, Lz/q;->e:I

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Lne/x;
    .locals 6

    iget-object v0, p0, Lz/q;->a:Lz/y;

    iget-object v1, p0, Lz/q;->b:Ljava/util/List;

    iget v2, p0, Lz/q;->c:I

    iget v3, p0, Lz/q;->d:I

    iget v4, p0, Lz/q;->e:I

    move-object v5, p1

    check-cast v5, Ljava/lang/Void;

    invoke-static/range {v0 .. v5}, Lz/y;->z(Lz/y;Ljava/util/List;IIILjava/lang/Void;)Lne/x;

    move-result-object p1

    return-object p1
.end method
