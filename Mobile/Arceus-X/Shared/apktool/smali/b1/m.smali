.class public final synthetic Lb1/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr0/a;


# instance fields
.field public final synthetic a:Lne/x;


# direct methods
.method public synthetic constructor <init>(Lne/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb1/m;->a:Lne/x;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Lne/x;
    .locals 1

    iget-object v0, p0, Lb1/m;->a:Lne/x;

    check-cast p1, Lm0/m;

    invoke-static {v0, p1}, Lb1/p;->r(Lne/x;Lm0/m;)Lne/x;

    move-result-object p1

    return-object p1
.end method
