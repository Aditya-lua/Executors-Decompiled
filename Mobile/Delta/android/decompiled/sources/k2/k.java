package k2;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class k {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Bundle f22261a;
        public IconCompat b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final t[] f22262c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final t[] f22263d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f22264e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f22265f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f22266g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f22267h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Deprecated
        public int f22268i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public CharSequence f22269j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public PendingIntent f22270k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f22271l;

        /* JADX INFO: renamed from: k2.k$a$a, reason: collision with other inner class name */
        public static final class C0389a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final IconCompat f22272a;
            public final CharSequence b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final PendingIntent f22273c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public boolean f22274d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final Bundle f22275e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public ArrayList<t> f22276f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public int f22277g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public boolean f22278h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public boolean f22279i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public boolean f22280j;

            public C0389a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
                this(iconCompat, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            public C0389a a(t tVar) {
                if (this.f22276f == null) {
                    this.f22276f = new ArrayList<>();
                }
                if (tVar != null) {
                    this.f22276f.add(tVar);
                }
                return this;
            }

            public a b() {
                c();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<t> arrayList3 = this.f22276f;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    int i10 = 0;
                    while (i10 < size) {
                        t tVar = arrayList3.get(i10);
                        i10++;
                        t tVar2 = tVar;
                        if (tVar2.k()) {
                            arrayList.add(tVar2);
                        } else {
                            arrayList2.add(tVar2);
                        }
                    }
                }
                return new a(this.f22272a, this.b, this.f22273c, this.f22275e, arrayList2.isEmpty() ? null : (t[]) arrayList2.toArray(new t[arrayList2.size()]), arrayList.isEmpty() ? null : (t[]) arrayList.toArray(new t[arrayList.size()]), this.f22274d, this.f22277g, this.f22278h, this.f22279i, this.f22280j);
            }

            public final void c() {
                if (this.f22279i && this.f22273c == null) {
                    throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
                }
            }

            public C0389a d(boolean z10) {
                this.f22274d = z10;
                return this;
            }

            public C0389a e(boolean z10) {
                this.f22280j = z10;
                return this;
            }

            public C0389a f(boolean z10) {
                this.f22278h = z10;
                return this;
            }

            public C0389a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
                this(i10 != 0 ? IconCompat.e(null, "", i10) : null, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            public C0389a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, t[] tVarArr, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
                this.f22274d = true;
                this.f22278h = true;
                this.f22272a = iconCompat;
                this.b = f.e(charSequence);
                this.f22273c = pendingIntent;
                this.f22275e = bundle;
                this.f22276f = tVarArr == null ? null : new ArrayList<>(Arrays.asList(tVarArr));
                this.f22274d = z10;
                this.f22277g = i10;
                this.f22278h = z11;
                this.f22279i = z12;
                this.f22280j = z13;
            }
        }

        public a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i10 != 0 ? IconCompat.e(null, "", i10) : null, charSequence, pendingIntent);
        }

        public PendingIntent a() {
            return this.f22270k;
        }

        public boolean b() {
            return this.f22264e;
        }

        public Bundle c() {
            return this.f22261a;
        }

        public IconCompat d() {
            int i10;
            if (this.b == null && (i10 = this.f22268i) != 0) {
                this.b = IconCompat.e(null, "", i10);
            }
            return this.b;
        }

        public t[] e() {
            return this.f22262c;
        }

        public int f() {
            return this.f22266g;
        }

        public boolean g() {
            return this.f22265f;
        }

        public CharSequence h() {
            return this.f22269j;
        }

        public boolean i() {
            return this.f22271l;
        }

        public boolean j() {
            return this.f22267h;
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false, false);
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, t[] tVarArr, t[] tVarArr2, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
            this.f22265f = true;
            this.b = iconCompat;
            if (iconCompat != null && iconCompat.i() == 2) {
                this.f22268i = iconCompat.g();
            }
            this.f22269j = f.e(charSequence);
            this.f22270k = pendingIntent;
            this.f22261a = bundle == null ? new Bundle() : bundle;
            this.f22262c = tVarArr;
            this.f22263d = tVarArr2;
            this.f22264e = z10;
            this.f22266g = i10;
            this.f22265f = z11;
            this.f22267h = z12;
            this.f22271l = z13;
        }
    }

    public static class b {
        public static String a(Notification notification) {
            return notification.getGroup();
        }
    }

    public static class c extends i {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public IconCompat f22281e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public IconCompat f22282f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f22283g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public CharSequence f22284h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f22285i;

        public static class a {
            public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        public static class b {
            public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            public static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            public static void c(Notification.BigPictureStyle bigPictureStyle, boolean z10) {
                bigPictureStyle.showBigPictureWhenCollapsed(z10);
            }
        }

        @Override // k2.k.i
        public void b(j jVar) {
            Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(jVar.a()).setBigContentTitle(this.b);
            IconCompat iconCompat = this.f22281e;
            if (iconCompat != null) {
                if (Build.VERSION.SDK_INT >= 31) {
                    b.a(bigContentTitle, this.f22281e.p(jVar instanceof l ? ((l) jVar).f() : null));
                } else if (iconCompat.i() == 1) {
                    bigContentTitle = bigContentTitle.bigPicture(this.f22281e.f());
                }
            }
            if (this.f22283g) {
                if (this.f22282f == null) {
                    bigContentTitle.bigLargeIcon((Bitmap) null);
                } else {
                    a.a(bigContentTitle, this.f22282f.p(jVar instanceof l ? ((l) jVar).f() : null));
                }
            }
            if (this.f22325d) {
                bigContentTitle.setSummaryText(this.f22324c);
            }
            if (Build.VERSION.SDK_INT >= 31) {
                b.c(bigContentTitle, this.f22285i);
                b.b(bigContentTitle, this.f22284h);
            }
        }

        @Override // k2.k.i
        public String c() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        public c h(Bitmap bitmap) {
            this.f22282f = bitmap == null ? null : IconCompat.c(bitmap);
            this.f22283g = true;
            return this;
        }

        public c i(Bitmap bitmap) {
            this.f22281e = bitmap == null ? null : IconCompat.c(bitmap);
            return this;
        }
    }

    public static class d extends i {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public CharSequence f22286e;

        @Override // k2.k.i
        public void a(Bundle bundle) {
            super.a(bundle);
        }

        @Override // k2.k.i
        public void b(j jVar) {
            Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(jVar.a()).setBigContentTitle(this.b).bigText(this.f22286e);
            if (this.f22325d) {
                bigTextStyleBigText.setSummaryText(this.f22324c);
            }
        }

        @Override // k2.k.i
        public String c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        public d h(CharSequence charSequence) {
            this.f22286e = f.e(charSequence);
            return this;
        }
    }

    public static final class e {
        public static Notification.BubbleMetadata a(e eVar) {
            return null;
        }
    }

    public static class g extends i {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f22312e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public r f22313f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public PendingIntent f22314g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public PendingIntent f22315h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public PendingIntent f22316i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f22317j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Integer f22318k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Integer f22319l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public IconCompat f22320m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public CharSequence f22321n;

        public static class a {
            public static Notification.Builder a(Notification.Builder builder, String str) {
                return builder.addPerson(str);
            }

            public static Notification.Builder b(Notification.Builder builder, String str) {
                return builder.setCategory(str);
            }
        }

        public static class b {
            public static Parcelable a(Icon icon) {
                return icon;
            }

            public static void b(Notification.Builder builder, Icon icon) {
                builder.setLargeIcon(icon);
            }
        }

        public static class c {
            public static Notification.Builder a(Notification.Builder builder, Person person) {
                return builder.addPerson(person);
            }

            public static Parcelable b(Person person) {
                return person;
            }
        }

        public static class d {
            public static Notification.CallStyle a(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
                return Notification.CallStyle.forIncomingCall(person, pendingIntent, pendingIntent2);
            }

            public static Notification.CallStyle b(Person person, PendingIntent pendingIntent) {
                return Notification.CallStyle.forOngoingCall(person, pendingIntent);
            }

            public static Notification.CallStyle c(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
                return Notification.CallStyle.forScreeningCall(person, pendingIntent, pendingIntent2);
            }

            public static Notification.CallStyle d(Notification.CallStyle callStyle, int i10) {
                return callStyle.setAnswerButtonColorHint(i10);
            }

            public static Notification.CallStyle e(Notification.CallStyle callStyle, int i10) {
                return callStyle.setDeclineButtonColorHint(i10);
            }

            public static Notification.CallStyle f(Notification.CallStyle callStyle, boolean z10) {
                return callStyle.setIsVideo(z10);
            }

            public static Notification.CallStyle g(Notification.CallStyle callStyle, Icon icon) {
                return callStyle.setVerificationIcon(icon);
            }

            public static Notification.CallStyle h(Notification.CallStyle callStyle, CharSequence charSequence) {
                return callStyle.setVerificationText(charSequence);
            }
        }

        public g() {
        }

        public static g h(r rVar, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
            Objects.requireNonNull(pendingIntent, "declineIntent is required");
            Objects.requireNonNull(pendingIntent2, "answerIntent is required");
            return new g(1, rVar, null, pendingIntent, pendingIntent2);
        }

        @Override // k2.k.i
        public void a(Bundle bundle) {
            super.a(bundle);
            bundle.putInt("android.callType", this.f22312e);
            bundle.putBoolean("android.callIsVideo", this.f22317j);
            r rVar = this.f22313f;
            if (rVar != null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable("android.callPerson", c.b(rVar.i()));
                } else {
                    bundle.putParcelable("android.callPersonCompat", rVar.j());
                }
            }
            IconCompat iconCompat = this.f22320m;
            if (iconCompat != null) {
                bundle.putParcelable("android.verificationIcon", b.a(iconCompat.p(this.f22323a.f22287a)));
            }
            bundle.putCharSequence("android.verificationText", this.f22321n);
            bundle.putParcelable("android.answerIntent", this.f22314g);
            bundle.putParcelable("android.declineIntent", this.f22315h);
            bundle.putParcelable("android.hangUpIntent", this.f22316i);
            Integer num = this.f22318k;
            if (num != null) {
                bundle.putInt("android.answerColor", num.intValue());
            }
            Integer num2 = this.f22319l;
            if (num2 != null) {
                bundle.putInt("android.declineColor", num2.intValue());
            }
        }

        @Override // k2.k.i
        public void b(j jVar) {
            int i10 = Build.VERSION.SDK_INT;
            CharSequence charSequenceJ = null;
            callStyleA = null;
            Notification.CallStyle callStyleA = null;
            charSequenceJ = null;
            if (i10 < 31) {
                Notification.Builder builderA = jVar.a();
                r rVar = this.f22313f;
                builderA.setContentTitle(rVar != null ? rVar.d() : null);
                Bundle bundle = this.f22323a.E;
                if (bundle != null && bundle.containsKey("android.text")) {
                    charSequenceJ = this.f22323a.E.getCharSequence("android.text");
                }
                if (charSequenceJ == null) {
                    charSequenceJ = j();
                }
                builderA.setContentText(charSequenceJ);
                r rVar2 = this.f22313f;
                if (rVar2 != null) {
                    if (rVar2.b() != null) {
                        b.b(builderA, this.f22313f.b().p(this.f22323a.f22287a));
                    }
                    if (i10 >= 28) {
                        c.a(builderA, this.f22313f.i());
                    } else {
                        a.a(builderA, this.f22313f.e());
                    }
                }
                a.b(builderA, "call");
                return;
            }
            int i11 = this.f22312e;
            if (i11 == 1) {
                callStyleA = d.a(this.f22313f.i(), this.f22315h, this.f22314g);
            } else if (i11 == 2) {
                callStyleA = d.b(this.f22313f.i(), this.f22316i);
            } else if (i11 == 3) {
                callStyleA = d.c(this.f22313f.i(), this.f22316i, this.f22314g);
            } else if (Log.isLoggable("NotifCompat", 3)) {
                Log.d("NotifCompat", "Unrecognized call type in CallStyle: " + String.valueOf(this.f22312e));
            }
            if (callStyleA != null) {
                callStyleA.setBuilder(jVar.a());
                Integer num = this.f22318k;
                if (num != null) {
                    d.d(callStyleA, num.intValue());
                }
                Integer num2 = this.f22319l;
                if (num2 != null) {
                    d.e(callStyleA, num2.intValue());
                }
                d.h(callStyleA, this.f22321n);
                IconCompat iconCompat = this.f22320m;
                if (iconCompat != null) {
                    d.g(callStyleA, iconCompat.p(this.f22323a.f22287a));
                }
                d.f(callStyleA, this.f22317j);
            }
        }

        @Override // k2.k.i
        public String c() {
            return "androidx.core.app.NotificationCompat$CallStyle";
        }

        public ArrayList<a> i() {
            a aVarN = n();
            a aVarM = m();
            ArrayList<a> arrayList = new ArrayList<>(3);
            arrayList.add(aVarN);
            ArrayList<a> arrayList2 = this.f22323a.b;
            int i10 = 2;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                int i11 = 0;
                while (i11 < size) {
                    a aVar = arrayList2.get(i11);
                    i11++;
                    a aVar2 = aVar;
                    if (aVar2.j()) {
                        arrayList.add(aVar2);
                    } else if (!k(aVar2)) {
                        arrayList.add(aVar2);
                        i10--;
                    }
                    if (aVarM != null && i10 == 1) {
                        arrayList.add(aVarM);
                        i10--;
                    }
                }
            }
            if (aVarM != null && i10 >= 1) {
                arrayList.add(aVarM);
            }
            return arrayList;
        }

        public final String j() {
            int i10 = this.f22312e;
            if (i10 == 1) {
                return this.f22323a.f22287a.getResources().getString(j2.f.f21634e);
            }
            if (i10 == 2) {
                return this.f22323a.f22287a.getResources().getString(j2.f.f21635f);
            }
            if (i10 != 3) {
                return null;
            }
            return this.f22323a.f22287a.getResources().getString(j2.f.f21636g);
        }

        public final boolean k(a aVar) {
            return aVar != null && aVar.c().getBoolean("key_action_priority");
        }

        public final a l(int i10, int i11, Integer num, int i12, PendingIntent pendingIntent) {
            if (num == null) {
                num = Integer.valueOf(l2.b.c(this.f22323a.f22287a, i12));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.f22323a.f22287a.getResources().getString(i11));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
            a aVarB = new a.C0389a(IconCompat.d(this.f22323a.f22287a, i10), spannableStringBuilder, pendingIntent).b();
            aVarB.c().putBoolean("key_action_priority", true);
            return aVarB;
        }

        public final a m() {
            int i10 = j2.d.b;
            int i11 = j2.d.f21604a;
            PendingIntent pendingIntent = this.f22314g;
            if (pendingIntent == null) {
                return null;
            }
            boolean z10 = this.f22317j;
            return l(z10 ? i10 : i11, z10 ? j2.f.b : j2.f.f21631a, this.f22318k, j2.b.f21602a, pendingIntent);
        }

        public final a n() {
            int i10 = j2.d.f21605c;
            PendingIntent pendingIntent = this.f22315h;
            return pendingIntent == null ? l(i10, j2.f.f21633d, this.f22319l, j2.b.b, this.f22316i) : l(i10, j2.f.f21632c, this.f22319l, j2.b.b, pendingIntent);
        }

        public g o(int i10) {
            this.f22318k = Integer.valueOf(i10);
            return this;
        }

        public g p(int i10) {
            this.f22319l = Integer.valueOf(i10);
            return this;
        }

        public g(int i10, r rVar, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3) {
            if (rVar == null || TextUtils.isEmpty(rVar.d())) {
                throw new IllegalArgumentException("person must have a non-empty a name");
            }
            this.f22312e = i10;
            this.f22313f = rVar;
            this.f22314g = pendingIntent3;
            this.f22315h = pendingIntent2;
            this.f22316i = pendingIntent;
        }
    }

    public static class h extends i {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ArrayList<CharSequence> f22322e = new ArrayList<>();

        @Override // k2.k.i
        public void b(j jVar) {
            Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(jVar.a()).setBigContentTitle(this.b);
            if (this.f22325d) {
                bigContentTitle.setSummaryText(this.f22324c);
            }
            ArrayList<CharSequence> arrayList = this.f22322e;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                CharSequence charSequence = arrayList.get(i10);
                i10++;
                bigContentTitle.addLine(charSequence);
            }
        }

        @Override // k2.k.i
        public String c() {
            return "androidx.core.app.NotificationCompat$InboxStyle";
        }

        public h h(CharSequence charSequence) {
            if (charSequence != null) {
                this.f22322e.add(f.e(charSequence));
            }
            return this;
        }

        public h i(CharSequence charSequence) {
            this.b = f.e(charSequence);
            return this;
        }
    }

    public static abstract class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public f f22323a;
        public CharSequence b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public CharSequence f22324c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f22325d = false;

        public void a(Bundle bundle) {
            if (this.f22325d) {
                bundle.putCharSequence("android.summaryText", this.f22324c);
            }
            CharSequence charSequence = this.b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String strC = c();
            if (strC != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strC);
            }
        }

        public abstract void b(j jVar);

        public abstract String c();

        public RemoteViews d(j jVar) {
            return null;
        }

        public RemoteViews e(j jVar) {
            return null;
        }

        public RemoteViews f(j jVar) {
            return null;
        }

        public void g(f fVar) {
            if (this.f22323a != fVar) {
                this.f22323a = fVar;
                if (fVar != null) {
                    fVar.B(this);
                }
            }
        }
    }

    @Deprecated
    public static Bundle a(Notification notification) {
        return notification.extras;
    }

    public static String b(Notification notification) {
        return b.a(notification);
    }

    public static boolean c(Notification notification) {
        return (notification.flags & Barcode.FORMAT_UPC_A) != 0;
    }

    public static Bitmap d(Context context, Bitmap bitmap) {
        if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
            return bitmap;
        }
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(j2.c.b);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(j2.c.f21603a);
        if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
            return bitmap;
        }
        double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
        return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmap.getHeight()) * dMin), true);
    }

    public static class f {
        public boolean A;
        public boolean B;
        public boolean C;
        public String D;
        public Bundle E;
        public int F;
        public int G;
        public Notification H;
        public RemoteViews I;
        public RemoteViews J;
        public RemoteViews K;
        public String L;
        public int M;
        public String N;
        public l2.d O;
        public long P;
        public int Q;
        public int R;
        public boolean S;
        public Notification T;
        public boolean U;
        public Object V;

        @Deprecated
        public ArrayList<String> W;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f22287a;
        public ArrayList<a> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ArrayList<r> f22288c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ArrayList<a> f22289d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public CharSequence f22290e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public CharSequence f22291f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f22292g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public PendingIntent f22293h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public PendingIntent f22294i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public RemoteViews f22295j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public IconCompat f22296k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public CharSequence f22297l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f22298m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f22299n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f22300o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f22301p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public i f22302q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public CharSequence f22303r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public CharSequence f22304s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public CharSequence[] f22305t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f22306u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f22307v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public boolean f22308w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public String f22309x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public boolean f22310y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public String f22311z;

        public static class a {
            public static AudioAttributes a(AudioAttributes.Builder builder) {
                return builder.build();
            }

            public static AudioAttributes.Builder b() {
                return new AudioAttributes.Builder();
            }

            public static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i10) {
                return builder.setContentType(i10);
            }

            public static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i10) {
                return builder.setUsage(i10);
            }
        }

        public f(Context context, String str) {
            this.b = new ArrayList<>();
            this.f22288c = new ArrayList<>();
            this.f22289d = new ArrayList<>();
            this.f22300o = true;
            this.A = false;
            this.F = 0;
            this.G = 0;
            this.M = 0;
            this.Q = 0;
            this.R = 0;
            Notification notification = new Notification();
            this.T = notification;
            this.f22287a = context;
            this.L = str;
            notification.when = System.currentTimeMillis();
            this.T.audioStreamType = -1;
            this.f22299n = 0;
            this.W = new ArrayList<>();
            this.S = true;
        }

        public static CharSequence e(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        public f A(Uri uri) {
            Notification notification = this.T;
            notification.sound = uri;
            notification.audioStreamType = -1;
            AudioAttributes.Builder builderD = a.d(a.c(a.b(), 4), 5);
            this.T.audioAttributes = a.a(builderD);
            return this;
        }

        public f B(i iVar) {
            if (this.f22302q != iVar) {
                this.f22302q = iVar;
                if (iVar != null) {
                    iVar.g(this);
                }
            }
            return this;
        }

        public f C(CharSequence charSequence) {
            this.T.tickerText = e(charSequence);
            return this;
        }

        public f D(long j10) {
            this.P = j10;
            return this;
        }

        public f E(long[] jArr) {
            this.T.vibrate = jArr;
            return this;
        }

        public f F(int i10) {
            this.G = i10;
            return this;
        }

        public f G(long j10) {
            this.T.when = j10;
            return this;
        }

        public f a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this.b.add(new a(i10, charSequence, pendingIntent));
            return this;
        }

        public f b(a aVar) {
            if (aVar != null) {
                this.b.add(aVar);
            }
            return this;
        }

        public Notification c() {
            return new l(this).c();
        }

        public Bundle d() {
            if (this.E == null) {
                this.E = new Bundle();
            }
            return this.E;
        }

        public f f(boolean z10) {
            o(16, z10);
            return this;
        }

        public f g(String str) {
            this.L = str;
            return this;
        }

        public f h(int i10) {
            this.F = i10;
            return this;
        }

        public f i(RemoteViews remoteViews) {
            this.T.contentView = remoteViews;
            return this;
        }

        public f j(PendingIntent pendingIntent) {
            this.f22293h = pendingIntent;
            return this;
        }

        public f k(CharSequence charSequence) {
            this.f22291f = e(charSequence);
            return this;
        }

        public f l(CharSequence charSequence) {
            this.f22290e = e(charSequence);
            return this;
        }

        public f m(int i10) {
            Notification notification = this.T;
            notification.defaults = i10;
            if ((i10 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public f n(PendingIntent pendingIntent) {
            this.T.deleteIntent = pendingIntent;
            return this;
        }

        public final void o(int i10, boolean z10) {
            if (z10) {
                Notification notification = this.T;
                notification.flags = i10 | notification.flags;
            } else {
                Notification notification2 = this.T;
                notification2.flags = (~i10) & notification2.flags;
            }
        }

        public f p(PendingIntent pendingIntent, boolean z10) {
            this.f22294i = pendingIntent;
            o(128, z10);
            return this;
        }

        public f q(String str) {
            this.f22309x = str;
            return this;
        }

        public f r(boolean z10) {
            this.f22310y = z10;
            return this;
        }

        public f s(Bitmap bitmap) {
            this.f22296k = bitmap == null ? null : IconCompat.c(k.d(this.f22287a, bitmap));
            return this;
        }

        public f t(int i10, int i11, int i12) {
            Notification notification = this.T;
            notification.ledARGB = i10;
            notification.ledOnMS = i11;
            notification.ledOffMS = i12;
            notification.flags = ((i11 == 0 || i12 == 0) ? 0 : 1) | (notification.flags & (-2));
            return this;
        }

        public f u(boolean z10) {
            this.A = z10;
            return this;
        }

        public f v(int i10) {
            this.f22298m = i10;
            return this;
        }

        public f w(boolean z10) {
            o(2, z10);
            return this;
        }

        public f x(int i10) {
            this.f22299n = i10;
            return this;
        }

        public f y(boolean z10) {
            this.f22300o = z10;
            return this;
        }

        public f z(int i10) {
            this.T.icon = i10;
            return this;
        }

        @Deprecated
        public f(Context context) {
            this(context, null);
        }
    }
}
