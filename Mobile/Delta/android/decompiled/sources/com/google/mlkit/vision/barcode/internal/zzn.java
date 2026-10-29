package com.google.mlkit.vision.barcode.internal;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxq;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxr;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxs;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxt;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxu;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxv;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxw;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxx;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxy;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxz;
import com.google.android.gms.internal.mlkit_vision_barcode.zzya;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyb;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.google.mlkit.vision.barcode.common.internal.BarcodeSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import n9.m;

/* JADX INFO: loaded from: classes2.dex */
public final class zzn implements BarcodeSource {
    private final zzyb zza;

    public zzn(zzyb zzybVar) {
        this.zza = zzybVar;
    }

    private static Barcode.CalendarDateTime zza(zzxq zzxqVar) {
        if (zzxqVar == null) {
            return null;
        }
        return new Barcode.CalendarDateTime(zzxqVar.zzf(), zzxqVar.zzd(), zzxqVar.zza(), zzxqVar.zzb(), zzxqVar.zzc(), zzxqVar.zze(), zzxqVar.zzh(), zzxqVar.zzg());
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final Rect getBoundingBox() {
        Point[] pointArrZzo = this.zza.zzo();
        if (pointArrZzo == null) {
            return null;
        }
        int iMax = Integer.MIN_VALUE;
        int iMin = Integer.MAX_VALUE;
        int iMin2 = Integer.MAX_VALUE;
        int iMax2 = Integer.MIN_VALUE;
        for (Point point : pointArrZzo) {
            iMin = Math.min(iMin, point.x);
            iMax = Math.max(iMax, point.x);
            iMin2 = Math.min(iMin2, point.y);
            iMax2 = Math.max(iMax2, point.y);
        }
        return new Rect(iMin, iMin2, iMax, iMax2);
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final Barcode.CalendarEvent getCalendarEvent() {
        zzxr zzxrVarZzc = this.zza.zzc();
        if (zzxrVarZzc != null) {
            return new Barcode.CalendarEvent(zzxrVarZzc.zzg(), zzxrVarZzc.zzc(), zzxrVarZzc.zzd(), zzxrVarZzc.zze(), zzxrVarZzc.zzf(), zza(zzxrVarZzc.zzb()), zza(zzxrVarZzc.zza()));
        }
        return null;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final Barcode.ContactInfo getContactInfo() {
        zzxs zzxsVarZzd = this.zza.zzd();
        if (zzxsVarZzd == null) {
            return null;
        }
        zzxw zzxwVarZza = zzxsVarZzd.zza();
        Barcode.PersonName personName = zzxwVarZza == null ? null : new Barcode.PersonName(zzxwVarZza.zzb(), zzxwVarZza.zzf(), zzxwVarZza.zze(), zzxwVarZza.zza(), zzxwVarZza.zzd(), zzxwVarZza.zzc(), zzxwVarZza.zzg());
        String strZzb = zzxsVarZzd.zzb();
        String strZzc = zzxsVarZzd.zzc();
        zzxx[] zzxxVarArrZzf = zzxsVarZzd.zzf();
        ArrayList arrayList = new ArrayList();
        if (zzxxVarArrZzf != null) {
            for (zzxx zzxxVar : zzxxVarArrZzf) {
                if (zzxxVar != null) {
                    arrayList.add(new Barcode.Phone(zzxxVar.zzb(), zzxxVar.zza()));
                }
            }
        }
        zzxu[] zzxuVarArrZze = zzxsVarZzd.zze();
        ArrayList arrayList2 = new ArrayList();
        if (zzxuVarArrZze != null) {
            for (zzxu zzxuVar : zzxuVarArrZze) {
                if (zzxuVar != null) {
                    arrayList2.add(new Barcode.Email(zzxuVar.zza(), zzxuVar.zzb(), zzxuVar.zzd(), zzxuVar.zzc()));
                }
            }
        }
        List listAsList = zzxsVarZzd.zzg() != null ? Arrays.asList((String[]) m.l(zzxsVarZzd.zzg())) : new ArrayList();
        zzxp[] zzxpVarArrZzd = zzxsVarZzd.zzd();
        ArrayList arrayList3 = new ArrayList();
        if (zzxpVarArrZzd != null) {
            for (zzxp zzxpVar : zzxpVarArrZzd) {
                if (zzxpVar != null) {
                    arrayList3.add(new Barcode.Address(zzxpVar.zza(), zzxpVar.zzb()));
                }
            }
        }
        return new Barcode.ContactInfo(personName, strZzb, strZzc, arrayList, arrayList2, listAsList, arrayList3);
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final Point[] getCornerPoints() {
        return this.zza.zzo();
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final String getDisplayValue() {
        return this.zza.zzl();
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final Barcode.DriverLicense getDriverLicense() {
        zzxt zzxtVarZze = this.zza.zze();
        if (zzxtVarZze != null) {
            return new Barcode.DriverLicense(zzxtVarZze.zzf(), zzxtVarZze.zzh(), zzxtVarZze.zzn(), zzxtVarZze.zzl(), zzxtVarZze.zzi(), zzxtVarZze.zzc(), zzxtVarZze.zza(), zzxtVarZze.zzb(), zzxtVarZze.zzd(), zzxtVarZze.zzm(), zzxtVarZze.zzj(), zzxtVarZze.zzg(), zzxtVarZze.zze(), zzxtVarZze.zzk());
        }
        return null;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final Barcode.Email getEmail() {
        zzxu zzxuVarZzf = this.zza.zzf();
        if (zzxuVarZzf == null) {
            return null;
        }
        return new Barcode.Email(zzxuVarZzf.zza(), zzxuVarZzf.zzb(), zzxuVarZzf.zzd(), zzxuVarZzf.zzc());
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final int getFormat() {
        return this.zza.zza();
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final Barcode.GeoPoint getGeoPoint() {
        zzxv zzxvVarZzg = this.zza.zzg();
        if (zzxvVarZzg != null) {
            return new Barcode.GeoPoint(zzxvVarZzg.zza(), zzxvVarZzg.zzb());
        }
        return null;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final Barcode.Phone getPhone() {
        zzxx zzxxVarZzh = this.zza.zzh();
        if (zzxxVarZzh != null) {
            return new Barcode.Phone(zzxxVarZzh.zzb(), zzxxVarZzh.zza());
        }
        return null;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final byte[] getRawBytes() {
        return this.zza.zzn();
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final String getRawValue() {
        return this.zza.zzm();
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final Barcode.Sms getSms() {
        zzxy zzxyVarZzi = this.zza.zzi();
        if (zzxyVarZzi != null) {
            return new Barcode.Sms(zzxyVarZzi.zza(), zzxyVarZzi.zzb());
        }
        return null;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final Barcode.UrlBookmark getUrl() {
        zzxz zzxzVarZzj = this.zza.zzj();
        if (zzxzVarZzj != null) {
            return new Barcode.UrlBookmark(zzxzVarZzj.zza(), zzxzVarZzj.zzb());
        }
        return null;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final int getValueType() {
        return this.zza.zzb();
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final Barcode.WiFi getWifi() {
        zzya zzyaVarZzk = this.zza.zzk();
        if (zzyaVarZzk != null) {
            return new Barcode.WiFi(zzyaVarZzk.zzc(), zzyaVarZzk.zzb(), zzyaVarZzk.zza());
        }
        return null;
    }
}
