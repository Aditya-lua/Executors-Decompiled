.class public final synthetic Lhn/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lhn/b0;


# direct methods
.method public synthetic constructor <init>(Lhn/b0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhn/y;->a:Lhn/b0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lhn/y;->a:Lhn/b0;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lhn/b0;->a(Lhn/b0;Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method
