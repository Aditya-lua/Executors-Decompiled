.class public final synthetic Lz7/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg8/a;


# instance fields
.field public final synthetic a:Lz7/d;


# direct methods
.method public synthetic constructor <init>(Lz7/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz7/b;->a:Lz7/d;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lz7/b;->a:Lz7/d;

    check-cast p1, Lz7/d$a;

    invoke-static {v0, p1}, Lz7/d;->c(Lz7/d;Lz7/d$a;)Lz7/d$b;

    move-result-object p1

    return-object p1
.end method
