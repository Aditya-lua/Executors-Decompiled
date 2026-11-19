.class public final synthetic La8/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh8/a;


# instance fields
.field public final synthetic a:La8/d;


# direct methods
.method public synthetic constructor <init>(La8/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La8/b;->a:La8/d;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, La8/b;->a:La8/d;

    check-cast p1, La8/d$a;

    invoke-static {v0, p1}, La8/d;->c(La8/d;La8/d$a;)La8/d$b;

    move-result-object p1

    return-object p1
.end method
