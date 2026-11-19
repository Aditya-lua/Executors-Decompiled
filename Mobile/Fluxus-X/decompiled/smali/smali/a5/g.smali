.class public final synthetic La5/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lg5/c;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lg5/c;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La5/g;->a:Lg5/c;

    iput-object p2, p0, La5/g;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, La5/g;->a:Lg5/c;

    iget-object v1, p0, La5/g;->b:Ljava/lang/String;

    invoke-static {v0, v1}, La5/h;->d(Lg5/c;Ljava/lang/String;)Lg5/b;

    move-result-object v0

    return-object v0
.end method
