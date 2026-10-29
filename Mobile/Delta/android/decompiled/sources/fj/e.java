package fj;

import android.content.Context;
import sg.q0;

/* JADX INFO: loaded from: classes2.dex */
public class e extends ej.k implements ej.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f16656a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16657c;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16658a;

        static {
            int[] iArr = new int[b.values().length];
            f16658a = iArr;
            try {
                iArr[b.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16658a[b.ALREADY_ACKNOWLEDGED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16658a[b.IS_EMULATOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16658a[b.VALIDATION_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16658a[b.VALIDATION_RETRY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16658a[b.VALIDATION_LIMIT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16658a[b.VALIDATION_LIMIT_UNDER_13.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16658a[b.REQUEST_BALANCE_ERROR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f16658a[b.USER_CANCELLED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f16658a[b.FAILED_PRODUCT_NOT_FOUND.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f16658a[b.ACKNOWLEDGE_ERROR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f16658a[b.IAB_LAUNCH_PURCHASE_FLOW_ERROR.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f16658a[b.IAB_HANDLE_ACTIVITY_RESULT_ERROR.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f16658a[b.IAB_QUERY_INVENTORY_ERROR.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f16658a[b.IAB_CONSUME_ERROR.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f16658a[b.RECEIPT_VERIFICATION_ERROR.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f16658a[b.RECEIPT_EMPTY.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f16658a[b.EMPTY_USERNAME.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f16658a[b.FAILED_PURCHASE_RESPONSE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f16658a[b.FAILED_PURCHASE_UPDATE_RESPONSE.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f16658a[b.UNKNOWN.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f16658a[b.FAILED_NOT_ALLOWED.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
        }
    }

    public enum b {
        SUCCESS,
        IS_EMULATOR,
        VALIDATION_ERROR,
        VALIDATION_RETRY,
        VALIDATION_LIMIT,
        VALIDATION_LIMIT_UNDER_13,
        REQUEST_BALANCE_ERROR,
        ACKNOWLEDGE_ERROR,
        CONSUME_ERROR,
        USER_CANCELLED,
        ALREADY_ACKNOWLEDGED,
        IAB_LAUNCH_PURCHASE_FLOW_ERROR,
        IAB_HANDLE_ACTIVITY_RESULT_ERROR,
        IAB_QUERY_INVENTORY_ERROR,
        IAB_CONSUME_ERROR,
        RECEIPT_VERIFICATION_ERROR,
        RECEIPT_EMPTY,
        EMPTY_USERNAME,
        FAILED_PURCHASE_RESPONSE,
        FAILED_PURCHASE_UPDATE_RESPONSE,
        FAILED_NOT_ALLOWED,
        FAILED_PRODUCT_NOT_FOUND,
        UNKNOWN
    }

    public e(b bVar, String str) {
        this(bVar, str, "");
    }

    @Override // ej.f
    public String b() {
        return this.f16657c;
    }

    @Override // ej.k
    public CharSequence c(Context context) {
        context.getString(q0.W);
        switch (a.f16658a[this.f16656a.ordinal()]) {
            case 1:
            case 2:
                return context.getText(q0.f30968s1);
            case 3:
                return context.getString(q0.f30956o1);
            case 4:
                return context.getString(q0.f30959p1);
            case 5:
                return context.getText(q0.f30950m1);
            case 6:
                return context.getString(q0.f30980w1);
            case 7:
                return context.getText(q0.f30983x1);
            case 8:
                return context.getString(q0.f30959p1);
            case 9:
                return context.getString(q0.f30953n1);
            default:
                return context.getString(q0.f30959p1);
        }
    }

    @Override // ej.k
    public boolean d() {
        b bVar = this.f16656a;
        return bVar == b.SUCCESS || bVar == b.ALREADY_ACKNOWLEDGED;
    }

    @Override // ej.k
    public boolean f() {
        int i10 = a.f16658a[this.f16656a.ordinal()];
        return (i10 == 1 || i10 == 2 || i10 == 5 || i10 == 7) ? false : true;
    }

    @Override // ej.f
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public String a() {
        return this.b;
    }

    public e(b bVar, String str, String str2) {
        this.f16656a = bVar;
        this.b = str;
        this.f16657c = str2 == null ? "" : str2;
    }
}
