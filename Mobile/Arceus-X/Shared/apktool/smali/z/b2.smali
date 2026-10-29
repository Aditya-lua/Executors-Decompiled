.class public final synthetic Lz/b2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr0/a;


# instance fields
.field public final synthetic a:Lz/g1$g;

.field public final synthetic b:Lne/x;


# direct methods
.method public synthetic constructor <init>(Lz/g1$g;Lne/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/b2;->a:Lz/g1$g;

    iput-object p2, p0, Lz/b2;->b:Lne/x;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Lne/x;
    .locals 2

    iget-object v0, p0, Lz/b2;->a:Lz/g1$g;

    iget-object v1, p0, Lz/b2;->b:Lne/x;

    invoke-static {v0, v1, p1}, Lz/g1$g;->p(Lz/g1$g;Lne/x;Ljava/lang/Object;)Lne/x;

    move-result-object p1

    return-object p1
.end method
