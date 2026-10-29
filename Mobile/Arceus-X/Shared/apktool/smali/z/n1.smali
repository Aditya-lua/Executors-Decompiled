.class public final synthetic Lz/n1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr0/a;


# instance fields
.field public final synthetic a:Lz/g1$d;


# direct methods
.method public synthetic constructor <init>(Lz/g1$d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/n1;->a:Lz/g1$d;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Lne/x;
    .locals 1

    iget-object v0, p0, Lz/n1;->a:Lz/g1$d;

    check-cast p1, Ljava/lang/Boolean;

    invoke-static {v0, p1}, Lz/g1$d;->d(Lz/g1$d;Ljava/lang/Boolean;)Lne/x;

    move-result-object p1

    return-object p1
.end method
