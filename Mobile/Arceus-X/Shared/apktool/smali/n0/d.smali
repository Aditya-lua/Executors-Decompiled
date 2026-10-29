.class public final synthetic Ln0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt/a;


# instance fields
.field public final synthetic a:Landroid/util/Range;


# direct methods
.method public synthetic constructor <init>(Landroid/util/Range;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln0/d;->a:Landroid/util/Range;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ln0/d;->a:Landroid/util/Range;

    check-cast p1, Lg0/z2;

    invoke-static {v0, p1}, Ln0/e;->B(Landroid/util/Range;Lg0/z2;)Lg0/z2;

    move-result-object p1

    return-object p1
.end method
