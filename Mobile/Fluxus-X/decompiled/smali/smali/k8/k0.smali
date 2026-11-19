.class public final synthetic Lk8/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk8/m0$b;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/database/Cursor;

    invoke-static {p1}, Lk8/m0;->g(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
