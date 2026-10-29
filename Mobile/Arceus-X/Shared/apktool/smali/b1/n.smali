.class public final synthetic Lb1/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr0/a;


# instance fields
.field public final synthetic a:Lb1/p;

.field public final synthetic b:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lb1/p;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb1/n;->a:Lb1/p;

    iput-object p2, p0, Lb1/n;->b:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Lne/x;
    .locals 2

    iget-object v0, p0, Lb1/n;->a:Lb1/p;

    iget-object v1, p0, Lb1/n;->b:Ljava/util/List;

    check-cast p1, Ljava/lang/Void;

    invoke-static {v0, v1, p1}, Lb1/p;->p(Lb1/p;Ljava/util/List;Ljava/lang/Void;)Lne/x;

    move-result-object p1

    return-object p1
.end method
