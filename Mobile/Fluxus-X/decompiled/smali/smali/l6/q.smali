.class public final synthetic Ll6/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Ll6/s$a;


# direct methods
.method public synthetic constructor <init>(Ll6/s$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll6/q;->a:Ll6/s$a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ll6/q;->a:Ll6/s$a;

    invoke-static {v0}, Ll6/s$a;->b(Ll6/s$a;)Lt6/d;

    move-result-object v0

    return-object v0
.end method
