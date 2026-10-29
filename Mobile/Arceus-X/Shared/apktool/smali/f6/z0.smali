.class public final synthetic Lf6/z0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf6/z0;->a:Ljava/lang/String;

    iput-object p2, p0, Lf6/z0;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lf6/z0;->a:Ljava/lang/String;

    iget-object v1, p0, Lf6/z0;->b:Ljava/lang/String;

    check-cast p1, Lf5/b;

    invoke-static {v0, v1, p1}, Lf6/n1;->N(Ljava/lang/String;Ljava/lang/String;Lf5/b;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
