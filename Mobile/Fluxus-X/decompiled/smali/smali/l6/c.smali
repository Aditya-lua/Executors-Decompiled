.class public final synthetic Ll6/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Ll6/h;


# direct methods
.method public synthetic constructor <init>(Ll6/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll6/c;->a:Ll6/h;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ll6/c;->a:Ll6/h;

    invoke-static {v0}, Ll6/h;->a(Ll6/h;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
