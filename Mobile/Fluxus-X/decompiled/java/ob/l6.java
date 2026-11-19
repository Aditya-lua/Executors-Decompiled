package ob;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zf;
import java.util.Arrays;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class l6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27531a;
    public final Bundle b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f27532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p6 f27533d;

    public l6(p6 p6Var, String str, Bundle bundle) {
        Objects.requireNonNull(p6Var);
        this.f27533d = p6Var;
        o9.s.f(str);
        this.f27531a = str;
        this.b = new Bundle();
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00fc A[Catch: NumberFormatException | JSONException -> 0x010c, NumberFormatException | JSONException -> 0x010c, TRY_LEAVE, TryCatch #1 {NumberFormatException | JSONException -> 0x010c, blocks: (B:10:0x0027, B:24:0x005b, B:24:0x005b, B:26:0x006c, B:26:0x006c, B:28:0x007e, B:28:0x007e, B:29:0x0087, B:29:0x0087, B:51:0x00fc, B:51:0x00fc, B:33:0x0094, B:33:0x0094, B:35:0x00a5, B:35:0x00a5, B:37:0x00b7, B:37:0x00b7, B:38:0x00c0, B:38:0x00c0, B:42:0x00cc, B:42:0x00cc, B:46:0x00dc, B:46:0x00dc, B:50:0x00f0, B:50:0x00f0), top: B:65:0x0027, outer: #0 }] */
    public final Bundle a() {
        if (this.f27532c == null) {
            p6 p6Var = this.f27533d;
            String string = p6Var.p().getString(this.f27531a, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i10);
                            String string2 = jSONObject.getString("n");
                            String string3 = jSONObject.getString("t");
                            int iHashCode = string3.hashCode();
                            if (iHashCode != 100) {
                                if (iHashCode != 108) {
                                    if (iHashCode != 115) {
                                        if (iHashCode != 3352) {
                                            if (iHashCode == 3445 && string3.equals("la")) {
                                                zf.a();
                                                if (p6Var.f27641a.w().H(null, e5.R0)) {
                                                    JSONArray jSONArray2 = new JSONArray(jSONObject.getString("v"));
                                                    int length = jSONArray2.length();
                                                    long[] jArr = new long[length];
                                                    for (int i11 = 0; i11 < length; i11++) {
                                                        jArr[i11] = jSONArray2.optLong(i11);
                                                    }
                                                    bundle.putLongArray(string2, jArr);
                                                }
                                            } else {
                                                p6Var.f27641a.a().o().b("Unrecognized persisted bundle type. Type", string3);
                                            }
                                        } else if (string3.equals("ia")) {
                                            zf.a();
                                            if (p6Var.f27641a.w().H(null, e5.R0)) {
                                                JSONArray jSONArray3 = new JSONArray(jSONObject.getString("v"));
                                                int length2 = jSONArray3.length();
                                                int[] iArr = new int[length2];
                                                for (int i12 = 0; i12 < length2; i12++) {
                                                    iArr[i12] = jSONArray3.optInt(i12);
                                                }
                                                bundle.putIntArray(string2, iArr);
                                            }
                                        } else {
                                            p6Var.f27641a.a().o().b("Unrecognized persisted bundle type. Type", string3);
                                        }
                                    } else if (string3.equals("s")) {
                                        bundle.putString(string2, jSONObject.getString("v"));
                                    } else {
                                        p6Var.f27641a.a().o().b("Unrecognized persisted bundle type. Type", string3);
                                    }
                                } else if (string3.equals("l")) {
                                    bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                                } else {
                                    p6Var.f27641a.a().o().b("Unrecognized persisted bundle type. Type", string3);
                                }
                            } else if (string3.equals("d")) {
                                bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                            } else {
                                p6Var.f27641a.a().o().b("Unrecognized persisted bundle type. Type", string3);
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            this.f27533d.f27641a.a().o().a("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.f27532c = bundle;
                } catch (JSONException unused2) {
                    this.f27533d.f27641a.a().o().a("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (this.f27532c == null) {
                this.f27532c = this.b;
            }
        }
        return new Bundle((Bundle) o9.s.l(this.f27532c));
    }

    public final void b(Bundle bundle) {
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        p6 p6Var = this.f27533d;
        SharedPreferences.Editor editorEdit = p6Var.p().edit();
        if (bundle2.size() == 0) {
            editorEdit.remove(this.f27531a);
        } else {
            String str = this.f27531a;
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle2.keySet()) {
                Object obj = bundle2.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        zf.a();
                        l7 l7Var = p6Var.f27641a;
                        if (l7Var.w().H(null, e5.R0)) {
                            if (obj instanceof String) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "l");
                            } else if (obj instanceof int[]) {
                                jSONObject.put("v", Arrays.toString((int[]) obj));
                                jSONObject.put("t", "ia");
                            } else if (obj instanceof long[]) {
                                jSONObject.put("v", Arrays.toString((long[]) obj));
                                jSONObject.put("t", "la");
                            } else if (obj instanceof Double) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "d");
                            } else {
                                l7Var.a().o().b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                            }
                            jSONArray.put(jSONObject);
                        } else {
                            jSONObject.put("v", obj.toString());
                            if (obj instanceof String) {
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("t", "l");
                            } else if (obj instanceof Double) {
                                jSONObject.put("t", "d");
                            } else {
                                l7Var.a().o().b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                            }
                            jSONArray.put(jSONObject);
                        }
                    } catch (JSONException e10) {
                        this.f27533d.f27641a.a().o().b("Cannot serialize bundle value to SharedPreferences", e10);
                    }
                }
            }
            editorEdit.putString(str, jSONArray.toString());
        }
        editorEdit.apply();
        this.f27532c = bundle2;
    }
}
