.class public final synthetic Lx6/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lk6/n;


# direct methods
.method public synthetic constructor <init>(Lk6/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx6/f;->a:Lk6/n;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lx6/f;->a:Lk6/n;

    check-cast p1, Lx6/g;

    invoke-static {v0, p1}, Lx6/g$a;->a(Lk6/n;Lx6/g;)Lk6/n;

    move-result-object p1

    return-object p1
.end method
