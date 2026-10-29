package com.android.billingclient.api;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    public static final d A;
    public static final d B;
    public static final d C;
    public static final d D;
    public static final d E;
    public static final d F;
    public static final d G;
    public static final d H;
    public static final d I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f5165a;
    public static final d b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f5166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f5167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f5168e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f5169f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f5170g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d f5171h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final d f5172i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final d f5173j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final d f5174k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final d f5175l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final d f5176m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final d f5177n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final d f5178o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final d f5179p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final d f5180q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final d f5181r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final d f5182s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final d f5183t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final d f5184u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final d f5185v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final d f5186w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final d f5187x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final d f5188y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final d f5189z;

    static {
        d.a aVarD = d.d();
        aVarD.d(3);
        aVarD.b("Google Play In-app Billing API version is less than 3");
        aVarD.a();
        d.a aVarD2 = d.d();
        aVarD2.d(3);
        aVarD2.b("Google Play In-app Billing API version is less than 9");
        f5165a = aVarD2.a();
        d.a aVarD3 = d.d();
        aVarD3.d(3);
        aVarD3.b("Billing service unavailable on device.");
        b = aVarD3.a();
        d.a aVarD4 = d.d();
        aVarD4.d(2);
        aVarD4.b("Billing service unavailable on device.");
        f5166c = aVarD4.a();
        d.a aVarD5 = d.d();
        aVarD5.d(5);
        aVarD5.b("Client is already in the process of connecting to billing service.");
        f5167d = aVarD5.a();
        d.a aVarD6 = d.d();
        aVarD6.d(5);
        aVarD6.b("The list of SKUs can't be empty.");
        aVarD6.a();
        d.a aVarD7 = d.d();
        aVarD7.d(5);
        aVarD7.b("SKU type can't be empty.");
        aVarD7.a();
        d.a aVarD8 = d.d();
        aVarD8.d(5);
        aVarD8.b("Product type can't be empty.");
        f5168e = aVarD8.a();
        d.a aVarD9 = d.d();
        aVarD9.d(-2);
        aVarD9.b("Client does not support extra params.");
        f5169f = aVarD9.a();
        d.a aVarD10 = d.d();
        aVarD10.d(5);
        aVarD10.b("Invalid purchase token.");
        f5170g = aVarD10.a();
        d.a aVarD11 = d.d();
        aVarD11.d(6);
        aVarD11.b("An internal error occurred.");
        f5171h = aVarD11.a();
        d.a aVarD12 = d.d();
        aVarD12.d(5);
        aVarD12.b("SKU can't be null.");
        aVarD12.a();
        d.a aVarD13 = d.d();
        aVarD13.d(0);
        f5172i = aVarD13.a();
        d.a aVarD14 = d.d();
        aVarD14.d(-1);
        aVarD14.b("Service connection is disconnected.");
        f5173j = aVarD14.a();
        d.a aVarD15 = d.d();
        aVarD15.d(2);
        aVarD15.b("Timeout communicating with service.");
        f5174k = aVarD15.a();
        d.a aVarD16 = d.d();
        aVarD16.d(-2);
        aVarD16.b("Client does not support subscriptions.");
        f5175l = aVarD16.a();
        d.a aVarD17 = d.d();
        aVarD17.d(-2);
        aVarD17.b("Client does not support subscriptions update.");
        f5176m = aVarD17.a();
        d.a aVarD18 = d.d();
        aVarD18.d(-2);
        aVarD18.b("Client does not support get purchase history.");
        aVarD18.a();
        d.a aVarD19 = d.d();
        aVarD19.d(-2);
        aVarD19.b("Client does not support price change confirmation.");
        f5177n = aVarD19.a();
        d.a aVarD20 = d.d();
        aVarD20.d(-2);
        aVarD20.b("Play Store version installed does not support cross selling products.");
        f5178o = aVarD20.a();
        d.a aVarD21 = d.d();
        aVarD21.d(-2);
        aVarD21.b("Client does not support multi-item purchases.");
        f5179p = aVarD21.a();
        d.a aVarD22 = d.d();
        aVarD22.d(-2);
        aVarD22.b("Client does not support offer_id_token.");
        f5180q = aVarD22.a();
        d.a aVarD23 = d.d();
        aVarD23.d(-2);
        aVarD23.b("Play Store version installed does not support gift code purchase.");
        f5181r = aVarD23.a();
        d.a aVarD24 = d.d();
        aVarD24.d(-2);
        aVarD24.b("Client does not support ProductDetails.");
        f5182s = aVarD24.a();
        d.a aVarD25 = d.d();
        aVarD25.d(-2);
        aVarD25.b("Client does not support launching subscription management action flow.");
        aVarD25.a();
        d.a aVarD26 = d.d();
        aVarD26.d(-2);
        aVarD26.b("Client does not support in-app messages.");
        f5183t = aVarD26.a();
        d.a aVarD27 = d.d();
        aVarD27.d(-2);
        aVarD27.b("Client does not support user choice billing.");
        aVarD27.a();
        d.a aVarD28 = d.d();
        aVarD28.d(-2);
        aVarD28.b("Play Store version installed does not support external offer.");
        f5184u = aVarD28.a();
        d.a aVarD29 = d.d();
        aVarD29.d(-2);
        aVarD29.b("Play Store version installed does not support multi-item purchases with season pass in one cart.");
        f5185v = aVarD29.a();
        d.a aVarD30 = d.d();
        aVarD30.d(-2);
        aVarD30.b("Play Store version installed does not support querying AutoPay plan purchase.");
        f5186w = aVarD30.a();
        d.a aVarD31 = d.d();
        aVarD31.d(-2);
        aVarD31.b("Play Store version installed does not support including suspended subscriptions.");
        f5187x = aVarD31.a();
        d.a aVarD32 = d.d();
        aVarD32.d(5);
        aVarD32.b("Unknown feature");
        f5188y = aVarD32.a();
        d.a aVarD33 = d.d();
        aVarD33.d(-2);
        aVarD33.b("Play Store version installed does not support get billing config.");
        f5189z = aVarD33.a();
        d.a aVarD34 = d.d();
        aVarD34.d(-2);
        aVarD34.b("Query product details with serialized docid is not supported.");
        A = aVarD34.a();
        d.a aVarD35 = d.d();
        aVarD35.d(-2);
        aVarD35.b("Play Store version installed does not support launching external offer flow.");
        aVarD35.a();
        d.a aVarD36 = d.d();
        aVarD36.d(4);
        aVarD36.b("Item is unavailable for purchase.");
        B = aVarD36.a();
        d.a aVarD37 = d.d();
        aVarD37.d(-2);
        aVarD37.b("Query product details with developer specified account is not supported.");
        C = aVarD37.a();
        d.a aVarD38 = d.d();
        aVarD38.d(-2);
        aVarD38.b("Play Store version installed does not support alternative billing only.");
        D = aVarD38.a();
        d.a aVarD39 = d.d();
        aVarD39.d(5);
        aVarD39.b("To use this API you must specify a PurchasesUpdateListener when initializing a BillingClient.");
        E = aVarD39.a();
        d.a aVarD40 = d.d();
        aVarD40.d(6);
        aVarD40.b("An error occurred while retrieving billing override.");
        F = aVarD40.a();
        d.a aVarD41 = d.d();
        aVarD41.d(-2);
        aVarD41.b("Play Store version installed does not support the provided billing program.");
        G = aVarD41.a();
        d.a aVarD42 = d.d();
        aVarD42.d(-2);
        aVarD42.b("Play Store version installed does not support launching external links.");
        H = aVarD42.a();
        d.a aVarD43 = d.d();
        aVarD43.d(5);
        aVarD43.b("A DeveloperProvidedBillingListener must be provided when initializing the BillingClient in order to use multiple payment options for this billing program.");
        I = aVarD43.a();
        d.a aVarD44 = d.d();
        aVarD44.d(5);
        aVarD44.b("A listener must be provided calling this method.");
        aVarD44.a();
        d.a aVarD45 = d.d();
        aVarD45.d(-2);
        aVarD45.b("Play Store version installed does not support show billing program information dialog.");
        aVarD45.a();
        d.a aVarD46 = d.d();
        aVarD46.d(-2);
        aVarD46.b("Play Store version installed does not support get billing choice info.");
        aVarD46.a();
    }

    public static d a(int i10, String str) {
        d.a aVarD = d.d();
        aVarD.d(i10);
        aVarD.b(str);
        return aVarD.a();
    }
}
