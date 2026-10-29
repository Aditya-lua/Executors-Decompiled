.class public final synthetic Lv0/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic a:Lv0/g;


# direct methods
.method public synthetic constructor <init>(Lv0/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv0/f;->a:Lv0/g;

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, Lv0/f;->a:Lv0/g;

    check-cast p1, Ln0/o3$f;

    check-cast p2, Ln0/o3$f;

    invoke-static {v0, p1, p2}, Lv0/g;->a(Lv0/g;Ln0/o3$f;Ln0/o3$f;)I

    move-result p1

    return p1
.end method
