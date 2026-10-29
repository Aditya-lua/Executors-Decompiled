package fj;

import android.content.Context;
import p105ej.AbstractC5153k;
import p105ej.InterfaceC5148f;
import sg.C11347q0;

/* JADX INFO: renamed from: fj.e */
/* JADX INFO: loaded from: classes2.dex */
public class C5620e extends AbstractC5153k implements InterfaceC5148f {

    /* JADX INFO: renamed from: a */
    public final b f21529a;

    /* JADX INFO: renamed from: b */
    public final String f21530b;

    /* JADX INFO: renamed from: c */
    public final String f21531c;

    /* JADX INFO: renamed from: fj.e$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f21532a;

        static {
            int[] iArr = new int[b.values().length];
            f21532a = iArr;
            try {
                iArr[b.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21532a[b.ALREADY_ACKNOWLEDGED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21532a[b.IS_EMULATOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21532a[b.VALIDATION_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21532a[b.VALIDATION_RETRY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21532a[b.VALIDATION_LIMIT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21532a[b.VALIDATION_LIMIT_UNDER_13.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21532a[b.REQUEST_BALANCE_ERROR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f21532a[b.USER_CANCELLED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f21532a[b.FAILED_PRODUCT_NOT_FOUND.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f21532a[b.ACKNOWLEDGE_ERROR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f21532a[b.IAB_LAUNCH_PURCHASE_FLOW_ERROR.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f21532a[b.IAB_HANDLE_ACTIVITY_RESULT_ERROR.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f21532a[b.IAB_QUERY_INVENTORY_ERROR.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f21532a[b.IAB_CONSUME_ERROR.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f21532a[b.RECEIPT_VERIFICATION_ERROR.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f21532a[b.RECEIPT_EMPTY.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f21532a[b.EMPTY_USERNAME.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f21532a[b.FAILED_PURCHASE_RESPONSE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f21532a[b.FAILED_PURCHASE_UPDATE_RESPONSE.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f21532a[b.UNKNOWN.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f21532a[b.FAILED_NOT_ALLOWED.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
        }
    }

    /* JADX INFO: renamed from: fj.e$b */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5620e(b bVar, String str) {
        this(bVar, str, "");
    }

    @Override // p105ej.InterfaceC5148f
    /* JADX INFO: renamed from: b */
    public String mo23965b() {
        return this.f21531c;
    }

    @Override // p105ej.AbstractC5153k
    /* JADX INFO: renamed from: c */
    public CharSequence mo23984c(Context context) {
        context.getString(C11347q0.f39945W);
        switch (a.f21532a[this.f21529a.ordinal()]) {
            case 1:
            case 2:
                return context.getText(C11347q0.f40009s1);
            case 3:
                return context.getString(C11347q0.f39997o1);
            case 4:
                return context.getString(C11347q0.f40000p1);
            case 5:
                return context.getText(C11347q0.f39991m1);
            case 6:
                return context.getString(C11347q0.f40021w1);
            case 7:
                return context.getText(C11347q0.f40024x1);
            case 8:
                return context.getString(C11347q0.f40000p1);
            case 9:
                return context.getString(C11347q0.f39994n1);
            default:
                return context.getString(C11347q0.f40000p1);
        }
    }

    @Override // p105ej.AbstractC5153k
    /* JADX INFO: renamed from: d */
    public boolean mo23985d() {
        b bVar = this.f21529a;
        return bVar == b.SUCCESS || bVar == b.ALREADY_ACKNOWLEDGED;
    }

    @Override // p105ej.AbstractC5153k
    /* JADX INFO: renamed from: f */
    public boolean mo23986f() {
        int i10 = a.f21532a[this.f21529a.ordinal()];
        return (i10 == 1 || i10 == 2 || i10 == 5 || i10 == 7) ? false : true;
    }

    /* JADX DEBUG: Method merged with bridge method: a()Ljava/lang/CharSequence; */
    @Override // p105ej.InterfaceC5148f
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public String mo23964a() {
        return this.f21530b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C5620e(b bVar, String str, String str2) {
        this.f21529a = bVar;
        this.f21530b = str;
        this.f21531c = str2 == null ? "" : str2;
    }
}
