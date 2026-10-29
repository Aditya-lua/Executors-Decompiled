package c2;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class b {
    /* JADX WARN: Code duplicated, block: B:100:0x016d  */
    /* JADX WARN: Code duplicated, block: B:102:0x0173  */
    /* JADX WARN: Code duplicated, block: B:104:0x0194  */
    /* JADX WARN: Code duplicated, block: B:16:0x0033 A[PHI: r15 r16
      0x0033: PHI (r15v26 boolean) = (r15v1 boolean), (r15v28 boolean) binds: [B:26:0x0047, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]
      0x0033: PHI (r16v5 boolean) = (r16v1 boolean), (r16v7 boolean) binds: [B:26:0x0047, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:17:0x0035 A[PHI: r15 r16
      0x0035: PHI (r15v3 boolean) = (r15v1 boolean), (r15v28 boolean) binds: [B:26:0x0047, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]
      0x0035: PHI (r16v3 boolean) = (r16v1 boolean), (r16v7 boolean) binds: [B:26:0x0047, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:218:0x038a  */
    /* JADX WARN: Code duplicated, block: B:289:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:292:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:293:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:296:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:297:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:299:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:301:0x04da  */
    /* JADX WARN: Code duplicated, block: B:304:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:317:0x038b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x016a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [z1.d] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [z1.d] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [c2.e] */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r5v17, types: [z1.i] */
    public static void a(f fVar, z1.d dVar, int i10, int i11, c cVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        float f10;
        ?? r8;
        z1.d dVar2;
        d dVar3;
        z1.i iVar;
        z1.i iVar2;
        int i12;
        d dVar4;
        z1.i iVar3;
        int i13;
        d[] dVarArr;
        int i14;
        d dVar5;
        d dVar6;
        z1.i iVar4;
        d dVar7;
        Object obj;
        int size;
        d dVar8;
        int i15;
        int i16 = i10;
        e eVar = cVar.f4322a;
        e eVar2 = cVar.f4323c;
        e eVar3 = cVar.b;
        e eVar4 = cVar.f4324d;
        e eVar5 = cVar.f4325e;
        float f11 = cVar.f4331k;
        boolean z13 = fVar.Z[i16] == e.b.WRAP_CONTENT;
        if (i16 == 0) {
            int i17 = eVar5.f4410z0;
            z10 = i17 == 0;
            z11 = i17 == 1;
            if (i17 == 2) {
                z12 = true;
            } else {
                z12 = false;
            }
        } else {
            int i18 = eVar5.A0;
            z10 = i18 == 0;
            z11 = i18 == 1;
            if (i18 == 2) {
                z12 = true;
            } else {
                z12 = false;
            }
        }
        ?? r14 = eVar;
        boolean z14 = false;
        while (true) {
            f10 = f11;
            Object obj2 = null;
            if (z14) {
                break;
            }
            d dVar9 = r14.W[i11];
            int i19 = z12 ? 1 : 4;
            int iF = dVar9.f();
            e.b bVar = r14.Z[i16];
            boolean z15 = z13;
            e.b bVar2 = e.b.MATCH_CONSTRAINT;
            boolean z16 = bVar == bVar2 && r14.f4407y[i16] == 0;
            boolean z17 = z12;
            d dVar10 = dVar9.f4347f;
            if (dVar10 != null && r14 != eVar) {
                iF += dVar10.f();
            }
            int i20 = iF;
            if (z17 && r14 != eVar && r14 != eVar3) {
                i19 = 8;
            }
            boolean z18 = z16;
            d dVar11 = dVar9.f4347f;
            if (dVar11 != null) {
                if (r14 == eVar3) {
                    dVar.h(dVar9.f4350i, dVar11.f4350i, i20, 6);
                } else {
                    dVar.h(dVar9.f4350i, dVar11.f4350i, i20, 8);
                }
                if (z18 && !z17) {
                    i19 = 5;
                }
                dVar.e(dVar9.f4350i, dVar9.f4347f.f4350i, i20, (r14 == eVar3 && z17 && r14.h0(i16)) ? 5 : i19);
            } else {
                z14 = z14;
                z10 = z10;
            }
            if (z15) {
                if (r14.V() == 8 || r14.Z[i16] != bVar2) {
                    i15 = 0;
                } else {
                    d[] dVarArr2 = r14.W;
                    i15 = 0;
                    dVar.h(dVarArr2[i11 + 1].f4350i, dVarArr2[i11].f4350i, 0, 5);
                }
                dVar.h(r14.W[i11].f4350i, fVar.W[i11].f4350i, i15, 8);
            }
            d dVar12 = r14.W[i11 + 1].f4347f;
            if (dVar12 != null) {
                e eVar6 = dVar12.f4345d;
                d dVar13 = eVar6.W[i11].f4347f;
                if (dVar13 != null && dVar13.f4345d == r14) {
                    obj2 = eVar6;
                }
            }
            if (obj2 != null) {
                r14 = obj2;
                z14 = z14;
            } else {
                z14 = true;
            }
            f11 = f10;
            z13 = z15;
            z12 = z17;
            z10 = z10;
            r14 = r14;
        }
        boolean z19 = z13;
        boolean z20 = z12;
        boolean z21 = z10;
        if (eVar4 != null) {
            int i21 = i11 + 1;
            if (eVar2.W[i21].f4347f != null) {
                d dVar14 = eVar4.W[i21];
                if (eVar4.Z[i16] == e.b.MATCH_CONSTRAINT && eVar4.f4407y[i16] == 0 && !z20) {
                    d dVar15 = dVar14.f4347f;
                    if (dVar15.f4345d == fVar) {
                        dVar.e(dVar14.f4350i, dVar15.f4350i, -dVar14.f(), 5);
                    } else if (z20) {
                        dVar8 = dVar14.f4347f;
                        if (dVar8.f4345d == fVar) {
                            dVar.e(dVar14.f4350i, dVar8.f4350i, -dVar14.f(), 4);
                        }
                    }
                } else if (z20) {
                    dVar8 = dVar14.f4347f;
                    if (dVar8.f4345d == fVar) {
                        dVar.e(dVar14.f4350i, dVar8.f4350i, -dVar14.f(), 4);
                    }
                }
                dVar.j(dVar14.f4350i, eVar2.W[i21].f4347f.f4350i, -dVar14.f(), 6);
            }
        }
        if (z19) {
            int i22 = i11 + 1;
            z1.i iVar5 = fVar.W[i22].f4350i;
            d dVar16 = eVar2.W[i22];
            dVar.h(iVar5, dVar16.f4350i, dVar16.f(), 8);
        }
        ArrayList<e> arrayList = cVar.f4328h;
        if (arrayList != null && (size = arrayList.size()) > 1) {
            float f12 = (!cVar.f4338r || cVar.f4340t) ? f10 : cVar.f4330j;
            float f13 = 0.0f;
            float f14 = 0.0f;
            e eVar7 = null;
            int i23 = 0;
            while (i23 < size) {
                e eVar8 = arrayList.get(i23);
                float f15 = eVar8.D0[i16];
                if (f15 < f13) {
                    if (cVar.f4340t) {
                        d[] dVarArr3 = eVar8.W;
                        f13 = f13;
                        dVar.e(dVarArr3[i11 + 1].f4350i, dVarArr3[i11].f4350i, 0, 4);
                    } else {
                        f15 = 1.0f;
                    }
                    arrayList = arrayList;
                    i23++;
                    f13 = f13;
                    arrayList = arrayList;
                }
                float f16 = f15;
                if (f16 == f13) {
                    d[] dVarArr4 = eVar8.W;
                    dVar.e(dVarArr4[i11 + 1].f4350i, dVarArr4[i11].f4350i, 0, 8);
                    arrayList = arrayList;
                } else {
                    if (eVar7 != null) {
                        d[] dVarArr5 = eVar7.W;
                        z1.i iVar6 = dVarArr5[i11].f4350i;
                        int i24 = i11 + 1;
                        z1.i iVar7 = dVarArr5[i24].f4350i;
                        d[] dVarArr6 = eVar8.W;
                        z1.i iVar8 = dVarArr6[i11].f4350i;
                        z1.i iVar9 = dVarArr6[i24].f4350i;
                        z1.b bVarR = dVar.r();
                        bVarR.l(f14, f12, f16, iVar6, iVar7, iVar8, iVar9);
                        dVar.d(bVarR);
                    }
                    eVar7 = eVar8;
                    f14 = f16;
                }
                i23++;
                f13 = f13;
                arrayList = arrayList;
            }
        }
        if (eVar3 != null && (eVar3 == eVar4 || z20)) {
            d dVar17 = eVar.W[i11];
            int i25 = i11 + 1;
            d dVar18 = eVar2.W[i25];
            d dVar19 = dVar17.f4347f;
            z1.i iVar10 = dVar19 != null ? dVar19.f4350i : null;
            d dVar20 = dVar18.f4347f;
            z1.i iVar11 = dVar20 != null ? dVar20.f4350i : null;
            d dVar21 = eVar3.W[i11];
            if (eVar4 != null) {
                dVar18 = eVar4.W[i25];
            }
            if (iVar10 != null && iVar11 != null) {
                dVar.c(dVar21.f4350i, iVar10, dVar21.f(), i16 == 0 ? eVar5.f4388o0 : eVar5.f4390p0, iVar11, dVar18.f4350i, dVar18.f(), 7);
            }
        } else {
            if (!z21 || eVar3 == null) {
                if (z11 && eVar3 != null) {
                    int i26 = cVar.f4330j;
                    boolean z22 = i26 > 0 && cVar.f4329i == i26;
                    e eVar9 = eVar3;
                    e eVar10 = eVar9;
                    while (eVar9 != null) {
                        e eVar11 = eVar9.F0[i10];
                        while (eVar11 != null && eVar11.V() == 8) {
                            eVar11 = eVar11.F0[i10];
                        }
                        if (eVar9 != eVar3 && eVar9 != eVar4 && eVar11 != null) {
                            if (eVar11 == eVar4) {
                                eVar11 = null;
                            }
                            d dVar22 = eVar9.W[i11];
                            z1.i iVar12 = dVar22.f4350i;
                            d dVar23 = dVar22.f4347f;
                            if (dVar23 != null) {
                                z1.i iVar13 = dVar23.f4350i;
                            }
                            int i27 = i11 + 1;
                            z1.i iVar14 = eVar10.W[i27].f4350i;
                            int iF2 = dVar22.f();
                            int iF3 = eVar9.W[i27].f();
                            if (eVar11 != null) {
                                dVar3 = eVar11.W[i11];
                                iVar = dVar3.f4350i;
                                d dVar24 = dVar3.f4347f;
                                iVar2 = dVar24 != null ? dVar24.f4350i : null;
                            } else {
                                dVar3 = eVar4.W[i11];
                                iVar = dVar3 != null ? dVar3.f4350i : null;
                                iVar2 = eVar9.W[i27].f4350i;
                            }
                            if (dVar3 != null) {
                                iF3 += dVar3.f();
                            }
                            int iF4 = iF2 + eVar10.W[i27].f();
                            int i28 = z22 ? 8 : 4;
                            if (iVar12 != null && iVar14 != null && iVar != null && iVar2 != null) {
                                dVar.c(iVar12, iVar14, iF4, 0.5f, iVar, iVar2, iF3, i28);
                            }
                            eVar11 = eVar11;
                        }
                        if (eVar9.V() != 8) {
                            eVar10 = eVar9;
                        }
                        eVar9 = eVar11;
                    }
                    d dVar25 = eVar3.W[i11];
                    d dVar26 = eVar.W[i11].f4347f;
                    int i29 = i11 + 1;
                    d dVar27 = eVar4.W[i29];
                    d dVar28 = eVar2.W[i29].f4347f;
                    if (dVar26 == null) {
                        r8 = dVar;
                    } else {
                        if (eVar3 != eVar4) {
                            dVar.e(dVar25.f4350i, dVar26.f4350i, dVar25.f(), 5);
                        } else if (dVar28 != null) {
                            dVar2 = dVar;
                            dVar2.c(dVar25.f4350i, dVar26.f4350i, dVar25.f(), 0.5f, dVar27.f4350i, dVar28.f4350i, dVar27.f(), 5);
                        }
                        r8 = dVar;
                    }
                    if (dVar28 != null && eVar3 != eVar4) {
                        r8.e(dVar27.f4350i, dVar28.f4350i, -dVar27.f(), 5);
                    }
                }
                if ((z21 && !z11) || eVar3 == null || eVar3 == eVar4) {
                    return;
                }
                dVarArr = eVar3.W;
                d dVar29 = dVarArr[i11];
                if (eVar4 == null) {
                    eVar4 = eVar3;
                }
                i14 = i11 + 1;
                dVar5 = eVar4.W[i14];
                dVar6 = dVar29.f4347f;
                if (dVar6 != null) {
                    iVar4 = dVar6.f4350i;
                } else {
                    iVar4 = null;
                }
                dVar7 = dVar5.f4347f;
                if (dVar7 != null) {
                    obj = dVar7.f4350i;
                } else {
                    obj = null;
                }
                if (eVar2 != eVar4) {
                    d dVar30 = eVar2.W[i14].f4347f;
                    obj = dVar30 != null ? dVar30.f4350i : null;
                }
                if (eVar3 == eVar4) {
                    dVar5 = dVarArr[i14];
                }
                if (iVar4 != null || obj == null) {
                }
                r8.c(dVar29.f4350i, iVar4, dVar29.f(), 0.5f, obj, dVar5.f4350i, eVar4.W[i14].f(), 5);
                return;
            }
            int i30 = cVar.f4330j;
            boolean z23 = i30 > 0 && cVar.f4329i == i30;
            e eVar12 = eVar3;
            e eVar13 = eVar12;
            while (eVar12 != null) {
                e eVar14 = eVar12.F0[i16];
                while (true) {
                    if (eVar14 == null) {
                        i12 = 8;
                        break;
                    }
                    i12 = 8;
                    if (eVar14.V() != 8) {
                        break;
                    } else {
                        eVar14 = eVar14.F0[i16];
                    }
                }
                if (eVar14 != null || eVar12 == eVar4) {
                    d dVar31 = eVar12.W[i11];
                    z1.i iVar15 = dVar31.f4350i;
                    d dVar32 = dVar31.f4347f;
                    z1.i iVar16 = dVar32 != null ? dVar32.f4350i : null;
                    if (eVar13 != eVar12) {
                        iVar16 = eVar13.W[i11 + 1].f4350i;
                    } else if (eVar12 == eVar3) {
                        d dVar33 = eVar.W[i11].f4347f;
                        iVar16 = dVar33 != null ? dVar33.f4350i : null;
                    }
                    int iF5 = dVar31.f();
                    int i31 = i11 + 1;
                    int iF6 = eVar12.W[i31].f();
                    if (eVar14 != null) {
                        dVar4 = eVar14.W[i11];
                        iVar3 = dVar4.f4350i;
                    } else {
                        dVar4 = eVar2.W[i31].f4347f;
                        iVar3 = dVar4 != null ? dVar4.f4350i : null;
                    }
                    z1.i iVar17 = eVar12.W[i31].f4350i;
                    if (dVar4 != null) {
                        iF6 += dVar4.f();
                    }
                    int iF7 = iF5 + eVar13.W[i31].f();
                    if (iVar15 == null || iVar16 == null || iVar3 == null || iVar17 == null) {
                        i13 = 8;
                    } else {
                        if (eVar12 == eVar3) {
                            iF7 = eVar3.W[i11].f();
                        }
                        if (eVar12 == eVar4) {
                            iF6 = eVar4.W[i31].f();
                        }
                        eVar14 = eVar14;
                        i13 = 8;
                        dVar.c(iVar15, iVar16, iF7, 0.5f, iVar3, iVar17, iF6, z23 ? 8 : 5);
                    }
                    if (eVar12.V() != i13) {
                        eVar13 = eVar12;
                    }
                    i16 = i10;
                    eVar12 = eVar14;
                } else {
                    i13 = i12;
                }
                if (eVar12.V() != i13) {
                    eVar13 = eVar12;
                }
                i16 = i10;
                eVar12 = eVar14;
            }
        }
        r8 = dVar;
        if (z21) {
        }
        dVarArr = eVar3.W;
        d dVar210 = dVarArr[i11];
        if (eVar4 == null) {
            eVar4 = eVar3;
        }
        i14 = i11 + 1;
        dVar5 = eVar4.W[i14];
        dVar6 = dVar210.f4347f;
        if (dVar6 != null) {
            iVar4 = dVar6.f4350i;
        } else {
            iVar4 = null;
        }
        dVar7 = dVar5.f4347f;
        if (dVar7 != null) {
            obj = dVar7.f4350i;
        } else {
            obj = null;
        }
        if (eVar2 != eVar4) {
            d dVar34 = eVar2.W[i14].f4347f;
            obj = dVar34 != null ? dVar34.f4350i : null;
        }
        if (eVar3 == eVar4) {
            dVar5 = dVarArr[i14];
        }
        if (iVar4 != null) {
        }
    }

    public static void b(f fVar, z1.d dVar, ArrayList<e> arrayList, int i10) {
        int i11;
        c[] cVarArr;
        int i12;
        if (i10 == 0) {
            i11 = fVar.W0;
            cVarArr = fVar.Z0;
            i12 = 0;
        } else {
            i11 = fVar.X0;
            cVarArr = fVar.Y0;
            i12 = 2;
        }
        for (int i13 = 0; i13 < i11; i13++) {
            c cVar = cVarArr[i13];
            cVar.a();
            if (arrayList == null || arrayList.contains(cVar.f4322a)) {
                a(fVar, dVar, i10, i12, cVar);
            }
        }
    }
}
