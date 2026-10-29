package p306nb;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C2361vf;
import java.util.Arrays;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p305n9.C8953m;

/* JADX INFO: renamed from: nb.g6 */
/* JADX INFO: loaded from: classes.dex */
public final class C9093g6 {

    /* JADX INFO: renamed from: a */
    public final String f32941a;

    /* JADX INFO: renamed from: b */
    public final Bundle f32942b;

    /* JADX INFO: renamed from: c */
    public Bundle f32943c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C9157k6 f32944d;

    public C9093g6(C9157k6 c9157k6, String str, Bundle bundle) {
        Objects.requireNonNull(c9157k6);
        this.f32944d = c9157k6;
        C8953m.m36041f(str);
        this.f32941a = str;
        this.f32942b = new Bundle();
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00fc A[Catch: NumberFormatException | JSONException -> 0x010c, NumberFormatException | JSONException -> 0x010c, TRY_LEAVE, TryCatch #1 {NumberFormatException | JSONException -> 0x010c, blocks: (B:10:0x0027, B:24:0x005b, B:24:0x005b, B:26:0x006c, B:26:0x006c, B:28:0x007e, B:28:0x007e, B:29:0x0087, B:29:0x0087, B:51:0x00fc, B:51:0x00fc, B:33:0x0094, B:33:0x0094, B:35:0x00a5, B:35:0x00a5, B:37:0x00b7, B:37:0x00b7, B:38:0x00c0, B:38:0x00c0, B:42:0x00cc, B:42:0x00cc, B:46:0x00dc, B:46:0x00dc, B:50:0x00f0, B:50:0x00f0), top: B:65:0x0027, outer: #0 }] */
    /* JADX INFO: renamed from: a */
    public final Bundle m36298a() {
        if (this.f32943c == null) {
            C9157k6 c9157k6 = this.f32944d;
            String string = c9157k6.m36443p().getString(this.f32941a, null);
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
                                                C2361vf.m10862a();
                                                if (c9157k6.f33067a.m36338w().m36406H(null, C9395z4.f33740R0)) {
                                                    JSONArray jSONArray2 = new JSONArray(jSONObject.getString("v"));
                                                    int length = jSONArray2.length();
                                                    long[] jArr = new long[length];
                                                    for (int i11 = 0; i11 < length; i11++) {
                                                        jArr[i11] = jSONArray2.optLong(i11);
                                                    }
                                                    bundle.putLongArray(string2, jArr);
                                                }
                                            } else {
                                                c9157k6.f33067a.mo36321a().m37003o().m36912b("Unrecognized persisted bundle type. Type", string3);
                                            }
                                        } else if (string3.equals("ia")) {
                                            C2361vf.m10862a();
                                            if (c9157k6.f33067a.m36338w().m36406H(null, C9395z4.f33740R0)) {
                                                JSONArray jSONArray3 = new JSONArray(jSONObject.getString("v"));
                                                int length2 = jSONArray3.length();
                                                int[] iArr = new int[length2];
                                                for (int i12 = 0; i12 < length2; i12++) {
                                                    iArr[i12] = jSONArray3.optInt(i12);
                                                }
                                                bundle.putIntArray(string2, iArr);
                                            }
                                        } else {
                                            c9157k6.f33067a.mo36321a().m37003o().m36912b("Unrecognized persisted bundle type. Type", string3);
                                        }
                                    } else if (string3.equals("s")) {
                                        bundle.putString(string2, jSONObject.getString("v"));
                                    } else {
                                        c9157k6.f33067a.mo36321a().m37003o().m36912b("Unrecognized persisted bundle type. Type", string3);
                                    }
                                } else if (string3.equals("l")) {
                                    bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                                } else {
                                    c9157k6.f33067a.mo36321a().m37003o().m36912b("Unrecognized persisted bundle type. Type", string3);
                                }
                            } else if (string3.equals("d")) {
                                bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                            } else {
                                c9157k6.f33067a.mo36321a().m37003o().m36912b("Unrecognized persisted bundle type. Type", string3);
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            this.f32944d.f33067a.mo36321a().m37003o().m36911a("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.f32943c = bundle;
                } catch (JSONException unused2) {
                    this.f32944d.f33067a.mo36321a().m37003o().m36911a("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (this.f32943c == null) {
                this.f32943c = this.f32942b;
            }
        }
        return new Bundle((Bundle) C8953m.m36047l(this.f32943c));
    }

    /* JADX INFO: renamed from: b */
    public final void m36299b(Bundle bundle) {
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        C9157k6 c9157k6 = this.f32944d;
        SharedPreferences.Editor editorEdit = c9157k6.m36443p().edit();
        if (bundle2.size() == 0) {
            editorEdit.remove(this.f32941a);
        } else {
            String str = this.f32941a;
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle2.keySet()) {
                Object obj = bundle2.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        C2361vf.m10862a();
                        C9094g7 c9094g7 = c9157k6.f33067a;
                        if (c9094g7.m36338w().m36406H(null, C9395z4.f33740R0)) {
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
                                c9094g7.mo36321a().m37003o().m36912b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
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
                                c9094g7.mo36321a().m37003o().m36912b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                            }
                            jSONArray.put(jSONObject);
                        }
                    } catch (JSONException e10) {
                        this.f32944d.f33067a.mo36321a().m37003o().m36912b("Cannot serialize bundle value to SharedPreferences", e10);
                    }
                }
            }
            editorEdit.putString(str, jSONArray.toString());
        }
        editorEdit.apply();
        this.f32943c = bundle2;
    }
}
