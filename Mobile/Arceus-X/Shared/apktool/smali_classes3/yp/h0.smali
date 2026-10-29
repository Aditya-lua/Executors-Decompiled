.class public final synthetic Lyp/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/withpersona/sdk2/inquiry/selfie/l$b$a;

    check-cast p2, Lcom/withpersona/sdk2/inquiry/selfie/l$b$a;

    invoke-static {p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/l$b;->C(Lcom/withpersona/sdk2/inquiry/selfie/l$b$a;Lcom/withpersona/sdk2/inquiry/selfie/l$b$a;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
