package com.google.android.gms.internal.mlkit_vision_common;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import qf.c;
import qf.d;
import qf.e;
import qf.f;
import qf.g;

/* JADX INFO: loaded from: classes.dex */
final class zzak implements f {
    private static final Charset zza = Charset.forName("UTF-8");
    private static final d zzb;
    private static final d zzc;
    private static final e zzd;
    private OutputStream zze;
    private final Map zzf;
    private final Map zzg;
    private final e zzh;
    private final zzao zzi = new zzao(this);

    static {
        d.b bVarA = d.a("key");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        zzb = bVarA.b(zzaeVar.zzb()).a();
        d.b bVarA2 = d.a("value");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        zzc = bVarA2.b(zzaeVar2.zzb()).a();
        zzd = new e() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzaj
            @Override // qf.b
            public final void encode(Object obj, f fVar) {
                zzak.zzg((Map.Entry) obj, fVar);
            }
        };
    }

    public zzak(OutputStream outputStream, Map map, Map map2, e eVar) {
        this.zze = outputStream;
        this.zzf = map;
        this.zzg = map2;
        this.zzh = eVar;
    }

    public static /* synthetic */ void zzg(Map.Entry entry, f fVar) {
        fVar.add(zzb, entry.getKey());
        fVar.add(zzc, entry.getValue());
    }

    private static int zzh(d dVar) {
        zzai zzaiVar = (zzai) dVar.c(zzai.class);
        if (zzaiVar != null) {
            return zzaiVar.zza();
        }
        throw new c("Field has no @Protobuf config");
    }

    private final long zzi(e eVar, Object obj) throws IOException {
        zzaf zzafVar = new zzaf();
        try {
            OutputStream outputStream = this.zze;
            this.zze = zzafVar;
            try {
                eVar.encode(obj, this);
                this.zze = outputStream;
                long jZza = zzafVar.zza();
                zzafVar.close();
                return jZza;
            } catch (Throwable th2) {
                this.zze = outputStream;
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                zzafVar.close();
            } catch (Throwable th4) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                } catch (Exception unused) {
                }
            }
            throw th3;
        }
    }

    private static zzai zzj(d dVar) {
        zzai zzaiVar = (zzai) dVar.c(zzai.class);
        if (zzaiVar != null) {
            return zzaiVar;
        }
        throw new c("Field has no @Protobuf config");
    }

    private final zzak zzk(e eVar, d dVar, Object obj, boolean z10) throws IOException {
        long jZzi = zzi(eVar, obj);
        if (z10 && jZzi == 0) {
            return this;
        }
        zzn((zzh(dVar) << 3) | 2);
        zzo(jZzi);
        eVar.encode(obj, this);
        return this;
    }

    private final zzak zzl(g gVar, d dVar, Object obj, boolean z10) {
        this.zzi.zza(dVar, z10);
        gVar.encode(obj, this.zzi);
        return this;
    }

    private static ByteBuffer zzm(int i10) {
        return ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
    }

    private final void zzn(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            this.zze.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.zze.write(i10 & 127);
    }

    private final void zzo(long j10) throws IOException {
        while (((-128) & j10) != 0) {
            this.zze.write((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        this.zze.write(((int) j10) & 127);
    }

    @NonNull
    public final f add(@NonNull d dVar, double d10) throws IOException {
        zza(dVar, d10, true);
        return this;
    }

    @NonNull
    public final f inline(Object obj) {
        zzf(obj);
        return this;
    }

    @NonNull
    public final f nested(@NonNull d dVar) {
        throw new c("nested() is not implemented for protobuf encoding.");
    }

    public final f zza(@NonNull d dVar, double d10, boolean z10) throws IOException {
        if (z10 && d10 == 0.0d) {
            return this;
        }
        zzn((zzh(dVar) << 3) | 1);
        this.zze.write(zzm(8).putDouble(d10).array());
        return this;
    }

    public final f zzb(@NonNull d dVar, float f10, boolean z10) throws IOException {
        if (z10 && f10 == 0.0f) {
            return this;
        }
        zzn((zzh(dVar) << 3) | 5);
        this.zze.write(zzm(4).putFloat(f10).array());
        return this;
    }

    public final f zzc(@NonNull d dVar, Object obj, boolean z10) throws IOException {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z10 || charSequence.length() != 0) {
                    zzn((zzh(dVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(zza);
                    zzn(bytes.length);
                    this.zze.write(bytes);
                    return this;
                }
            } else if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    zzc(dVar, it.next(), false);
                }
            } else if (obj instanceof Map) {
                Iterator it2 = ((Map) obj).entrySet().iterator();
                while (it2.hasNext()) {
                    zzk(zzd, dVar, (Map.Entry) it2.next(), false);
                }
            } else {
                if (obj instanceof Double) {
                    zza(dVar, ((Double) obj).doubleValue(), z10);
                    return this;
                }
                if (obj instanceof Float) {
                    zzb(dVar, ((Float) obj).floatValue(), z10);
                    return this;
                }
                if (obj instanceof Number) {
                    zze(dVar, ((Number) obj).longValue(), z10);
                    return this;
                }
                if (obj instanceof Boolean) {
                    zzd(dVar, ((Boolean) obj).booleanValue() ? 1 : 0, z10);
                    return this;
                }
                if (!(obj instanceof byte[])) {
                    e eVar = (e) this.zzf.get(obj.getClass());
                    if (eVar != null) {
                        zzk(eVar, dVar, obj, z10);
                        return this;
                    }
                    g gVar = (g) this.zzg.get(obj.getClass());
                    if (gVar != null) {
                        zzl(gVar, dVar, obj, z10);
                        return this;
                    }
                    if (obj instanceof zzag) {
                        zzd(dVar, ((zzag) obj).zza(), true);
                        return this;
                    }
                    if (obj instanceof Enum) {
                        zzd(dVar, ((Enum) obj).ordinal(), true);
                        return this;
                    }
                    zzk(this.zzh, dVar, obj, z10);
                    return this;
                }
                byte[] bArr = (byte[]) obj;
                if (!z10 || bArr.length != 0) {
                    zzn((zzh(dVar) << 3) | 2);
                    zzn(bArr.length);
                    this.zze.write(bArr);
                    return this;
                }
            }
        }
        return this;
    }

    public final zzak zzd(@NonNull d dVar, int i10, boolean z10) throws IOException {
        if (!z10 || i10 != 0) {
            zzai zzaiVarZzj = zzj(dVar);
            zzah zzahVar = zzah.DEFAULT;
            int iOrdinal = zzaiVarZzj.zzb().ordinal();
            if (iOrdinal == 0) {
                zzn(zzaiVarZzj.zza() << 3);
                zzn(i10);
                return this;
            }
            if (iOrdinal == 1) {
                zzn(zzaiVarZzj.zza() << 3);
                zzn((i10 + i10) ^ (i10 >> 31));
                return this;
            }
            if (iOrdinal == 2) {
                zzn((zzaiVarZzj.zza() << 3) | 5);
                this.zze.write(zzm(4).putInt(i10).array());
                return this;
            }
        }
        return this;
    }

    public final zzak zze(@NonNull d dVar, long j10, boolean z10) throws IOException {
        if (!z10 || j10 != 0) {
            zzai zzaiVarZzj = zzj(dVar);
            zzah zzahVar = zzah.DEFAULT;
            int iOrdinal = zzaiVarZzj.zzb().ordinal();
            if (iOrdinal == 0) {
                zzn(zzaiVarZzj.zza() << 3);
                zzo(j10);
                return this;
            }
            if (iOrdinal == 1) {
                zzn(zzaiVarZzj.zza() << 3);
                zzo((j10 >> 63) ^ (j10 + j10));
                return this;
            }
            if (iOrdinal == 2) {
                zzn((zzaiVarZzj.zza() << 3) | 1);
                this.zze.write(zzm(8).putLong(j10).array());
                return this;
            }
        }
        return this;
    }

    public final zzak zzf(Object obj) {
        if (obj == null) {
            return this;
        }
        e eVar = (e) this.zzf.get(obj.getClass());
        if (eVar == null) {
            throw new c("No encoder for ".concat(String.valueOf(obj.getClass())));
        }
        eVar.encode(obj, this);
        return this;
    }

    @NonNull
    public final f add(@NonNull d dVar, float f10) throws IOException {
        zzb(dVar, f10, true);
        return this;
    }

    @NonNull
    public final f nested(@NonNull String str) {
        return nested(d.d(str));
    }

    @Override // qf.f
    @NonNull
    public final /* synthetic */ f add(@NonNull d dVar, int i10) throws IOException {
        zzd(dVar, i10, true);
        return this;
    }

    @Override // qf.f
    @NonNull
    public final /* synthetic */ f add(@NonNull d dVar, long j10) throws IOException {
        zze(dVar, j10, true);
        return this;
    }

    @Override // qf.f
    @NonNull
    public final f add(@NonNull d dVar, Object obj) throws IOException {
        zzc(dVar, obj, true);
        return this;
    }

    @NonNull
    public final /* synthetic */ f add(@NonNull d dVar, boolean z10) throws IOException {
        zzd(dVar, z10 ? 1 : 0, true);
        return this;
    }

    @NonNull
    public final f add(@NonNull String str, double d10) throws IOException {
        zza(d.d(str), d10, true);
        return this;
    }

    @NonNull
    public final f add(@NonNull String str, int i10) throws IOException {
        zzd(d.d(str), i10, true);
        return this;
    }

    @NonNull
    public final f add(@NonNull String str, long j10) throws IOException {
        zze(d.d(str), j10, true);
        return this;
    }

    @NonNull
    public final f add(@NonNull String str, Object obj) throws IOException {
        zzc(d.d(str), obj, true);
        return this;
    }

    @NonNull
    public final f add(@NonNull String str, boolean z10) throws IOException {
        zzd(d.d(str), z10 ? 1 : 0, true);
        return this;
    }
}
