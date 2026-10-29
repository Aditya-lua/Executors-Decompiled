.class public final synthetic Lp1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt/a;


# instance fields
.field public final synthetic a:Lp1/i;


# direct methods
.method public synthetic constructor <init>(Lp1/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp1/b;->a:Lp1/i;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lp1/b;->a:Lp1/i;

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-virtual {v0, p1}, Lp1/i;->G(F)Lne/x;

    move-result-object p1

    return-object p1
.end method
