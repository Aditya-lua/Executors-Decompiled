.class public final synthetic Lcv/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpu/n;


# instance fields
.field public final synthetic a:Lcv/e;


# direct methods
.method public synthetic constructor <init>(Lcv/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcv/b;->a:Lcv/e;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcv/b;->a:Lcv/e;

    check-cast p1, Ljv/l;

    invoke-static {v0, p1, p2, p3}, Lcv/e;->d(Lcv/e;Ljv/l;Ljava/lang/Object;Ljava/lang/Object;)Lpu/n;

    move-result-object p1

    return-object p1
.end method
