.class public final Llp/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llp/c$a;


# instance fields
.field public final a:Llp/d;


# direct methods
.method public constructor <init>(Llp/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llp/e;->a:Llp/d;

    return-void
.end method

.method public static b(Llp/d;)Lwt/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llp/d;",
            ")",
            "Lwt/i<",
            "Llp/c$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Llp/e;

    invoke-direct {v0, p0}, Llp/e;-><init>(Llp/d;)V

    invoke-static {v0}, Lwt/e;->a(Ljava/lang/Object;)Lwt/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;Llp/a;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$IntegrationStepBrowserType;)Llp/c;
    .locals 1

    iget-object v0, p0, Llp/e;->a:Llp/d;

    invoke-virtual {v0, p1, p2, p3, p4}, Llp/d;->b(Ljava/lang/String;Ljava/lang/String;Llp/a;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$IntegrationStepBrowserType;)Llp/c;

    move-result-object p1

    return-object p1
.end method
