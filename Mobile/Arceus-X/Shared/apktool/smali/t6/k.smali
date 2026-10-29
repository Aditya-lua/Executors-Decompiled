.class public final synthetic Lt6/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lk6/s;


# direct methods
.method public synthetic constructor <init>(Lk6/s;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt6/k;->a:Lk6/s;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lt6/k;->a:Lk6/s;

    invoke-static {v0}, Lt6/m$a;->c(Lk6/s;)Ln6/a;

    move-result-object v0

    return-object v0
.end method
