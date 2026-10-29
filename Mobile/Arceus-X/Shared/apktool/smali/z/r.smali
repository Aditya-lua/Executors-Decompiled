.class public final synthetic Lz/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr0/a;


# instance fields
.field public final synthetic a:Lz/y;

.field public final synthetic b:I

.field public final synthetic c:I

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(Lz/y;III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/r;->a:Lz/y;

    iput p2, p0, Lz/r;->b:I

    iput p3, p0, Lz/r;->c:I

    iput p4, p0, Lz/r;->d:I

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Lne/x;
    .locals 4

    iget-object v0, p0, Lz/r;->a:Lz/y;

    iget v1, p0, Lz/r;->b:I

    iget v2, p0, Lz/r;->c:I

    iget v3, p0, Lz/r;->d:I

    check-cast p1, Ljava/lang/Void;

    invoke-static {v0, v1, v2, v3, p1}, Lz/y;->t(Lz/y;IIILjava/lang/Void;)Lne/x;

    move-result-object p1

    return-object p1
.end method
