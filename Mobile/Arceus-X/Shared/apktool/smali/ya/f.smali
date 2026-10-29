.class public final synthetic Lya/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll9/q;


# instance fields
.field public final synthetic a:Lya/o;

.field public final synthetic b:Lcom/google/android/gms/auth/api/identity/GetPhoneNumberHintIntentRequest;


# direct methods
.method public synthetic constructor <init>(Lya/o;Lcom/google/android/gms/auth/api/identity/GetPhoneNumberHintIntentRequest;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lya/f;->a:Lya/o;

    iput-object p2, p0, Lya/f;->b:Lcom/google/android/gms/auth/api/identity/GetPhoneNumberHintIntentRequest;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lya/f;->a:Lya/o;

    iget-object v1, p0, Lya/f;->b:Lcom/google/android/gms/auth/api/identity/GetPhoneNumberHintIntentRequest;

    check-cast p1, Lya/p;

    check-cast p2, Lsb/k;

    invoke-virtual {v0, v1, p1, p2}, Lya/o;->P(Lcom/google/android/gms/auth/api/identity/GetPhoneNumberHintIntentRequest;Lya/p;Lsb/k;)V

    return-void
.end method
