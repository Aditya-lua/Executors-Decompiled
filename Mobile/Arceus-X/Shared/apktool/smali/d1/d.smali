.class public final synthetic Ld1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lg0/f0;


# direct methods
.method public synthetic constructor <init>(Lg0/f0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld1/d;->a:Lg0/f0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ld1/d;->a:Lg0/f0;

    check-cast p1, Ljava/lang/Void;

    invoke-static {v0, p1}, Ld1/g;->b(Lg0/f0;Ljava/lang/Void;)Lne/x;

    move-result-object p1

    return-object p1
.end method
