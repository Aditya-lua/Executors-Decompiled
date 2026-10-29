/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbeafa0..0xbeb2b8 (792 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_989680;
extern void g_e088a0;
extern long long g_efa8f0;
extern long long g_efa908;
extern long long g_efa920;
extern long long g_efa938;

void sub_beafa0(unsigned long a0, unsigned long a1, unsigned short a2, char *a3, unsigned long long a4, unsigned short a5)
{
    unsigned short v3;  // x9
    unsigned short v4;  // x10
    unsigned long long v13;  // x6
    unsigned long long v14;  // x11
    unsigned long long v15;  // w13
    unsigned long v16;  // cc_dep1
    unsigned int v17;  // w15
    unsigned long long v18;  // 4110
    unsigned long long v19;  // 4110
    unsigned int v20;  // w16
    unsigned long v21;  // cc_dep1
    unsigned long v22;  // x13
    long long v5;  // x8
    unsigned long long v23;  // 4108
    unsigned long long v24;  // 4108
    char v25;  // x12
    unsigned int v26;  // w13
    unsigned long v27;  // cc_dep1
    unsigned int v28;  // w13
    unsigned long long v29;  // 4110
    unsigned long long v30;  // 4110
    unsigned long v31;  // cc_dep1
    unsigned int v32;  // w17
    int v6;  // w11
    unsigned long long v33;  // 4110
    unsigned long long v34;  // 4110
    unsigned int v35;  // w1
    unsigned long v36;  // cc_dep1
    unsigned int v37;  // w2
    unsigned long long v38;  // 4110
    unsigned long long v39;  // 4110
    unsigned int v40;  // w19
    unsigned long v41;  // cc_dep1
    unsigned int v42;  // w16
    unsigned long v7;  // x8
    unsigned long long v43;  // 4108
    unsigned long long v44;  // 4108
    unsigned long v45;  // cc_dep1
    unsigned long long v46;  // 4108
    unsigned long long v47;  // 4108
    unsigned long long v48;  // x15
    unsigned long long v49;  // x9
    unsigned long v50;  // x13
    unsigned int v51;  // w2
    unsigned long long v52;  // x11
    void* v8;  // x8
    unsigned long long v53;  // x13
    unsigned long long v54;  // x15
    unsigned long long v9;  // x9
    char v10;  // x14
    unsigned long long v11;  // x7
    unsigned long long v12;  // x10
    unsigned long long v0;  // [bp-0x30]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (a1)
    {
        v3 = Clz(a1);
        v4 = a2 - v3;
        v5 = (86960 + 80 * (short)(0xffffffa0 - v4)) * 2068695443;
        v6 = (int)(v5 >> 42) + (int)((unsigned long long)(v5) >> 63);
        v7 = v6;
        if (80 < (unsigned int)v6)
            sub_c73c94(v7, 81, &g_efa908);
        v8 = &(&g_e088a0)[16 * v7];
        v9 = (*(long long *)v8 * (a1 << ((char)v3 & 63)) >> 64) + ((a1 << ((char)v3 & 63)) * *(long long *)v8 >> 63);
        v10 = 0xffffffc0 - v4 - (short)v8[8];
        v11 = 1 << (v10 & 63);
        v12 = v11 - 1;
        v13 = v12 & v9;
        if (!(v12 & v9))
        {
            *(unsigned long long *)a0 = 0;
            return;
        }
        v14 = v9 >> (v10 & 63);
        if (625 > (unsigned int)v14 >> 4)
        {
            if (9 < (unsigned int)v14)
                v15 = 10;
            else
                v15 = 1;
            v16 = v14 & 0xffffffff;
            if ((unsigned int)v14 < 1000)
            {
                v17 = 100;
                v18 = arm64g_calculate_condition(0x33, v16, 1000, 0);
                if (!(v18 & 1))
                    goto LABEL_beb076;
LABEL_beb075:
                v20 = 2;
            }
            else
            {
                v17 = 1000;
                v19 = arm64g_calculate_condition(0x33, v16, 1000, 0);
                if (v19 & 1)
                    goto LABEL_beb075;
LABEL_beb076:
                v20 = 3;
            }
            v21 = v14 & 0xffffffff;
            if ((unsigned int)v14 < 100)
            {
                v22 = v15;
                v23 = arm64g_calculate_condition(0x33, v21, 100, 0);
                if (!(v23 & 1))
                    goto LABEL_beb082;
LABEL_beb081:
                v20 = (unsigned int)v14 > 9;
            }
            else
            {
                v22 = v17;
                v24 = arm64g_calculate_condition(0x33, v21, 100, 0);
                if (v24 & 1)
                    goto LABEL_beb081;
LABEL_beb082:
            }
            v25 = v10 & 63;
            v7 = (unsigned short)(v20 - (short)v8[10]) + 1;
            if (a5 >= (int)v7)
            {
                v0 = v11;
                sub_bebec0();
                return;
            }
        }
        else
        {
            v26 = (unsigned int)v14 >> 5;
            v27 = v26;
            if (v26 < 3125)
            {
                v28 = 10000;
                v29 = arm64g_calculate_condition(0x33, v27, 3125, 0);
                if (!(v29 & 1))
                    goto LABEL_beb0f6;
LABEL_beb0f5:
                v20 = 4;
            }
            else
            {
                v28 = 100000;
                v30 = arm64g_calculate_condition(0x33, v27, 3125, 0);
                if (v30 & 1)
                    goto LABEL_beb0f5;
LABEL_beb0f6:
                v20 = 5;
            }
            v31 = v14 & 0xffffffff;
            if ((unsigned int)v14 < &g_989680)
            {
                v32 = 1000000;
                v33 = arm64g_calculate_condition(0x33, v31, &g_989680, 0);
                if (!(v33 & 1))
                    goto LABEL_beb116;
LABEL_beb115:
                v35 = 6;
            }
            else
            {
                v32 = (unsigned int)&g_989680;
                v34 = arm64g_calculate_condition(0x33, v31, &g_989680, 0);
                if (v34 & 1)
                    goto LABEL_beb115;
LABEL_beb116:
                v35 = 7;
            }
            v36 = v14 & 0xffffffff;
            if ((unsigned int)v14 < 1000000000)
            {
                v37 = 100000000;
                v38 = arm64g_calculate_condition(0x33, v36, 1000000000, 0);
                if (!(v38 & 1))
                    goto LABEL_beb12e;
LABEL_beb12d:
                v40 = 8;
            }
            else
            {
                v37 = 1000000000;
                v39 = arm64g_calculate_condition(0x33, v36, 1000000000, 0);
                if (v39 & 1)
                    goto LABEL_beb12d;
LABEL_beb12e:
                v40 = 9;
            }
            v41 = v14 & 0xffffffff;
            if ((unsigned int)v14 < 100000000)
            {
                v42 = v32;
                v43 = arm64g_calculate_condition(0x33, v41, 100000000, 0);
                if (!(v43 & 1))
                    goto LABEL_beb13a;
LABEL_beb139:
            }
            else
            {
                v42 = v37;
                v44 = arm64g_calculate_condition(0x33, v41, 100000000, 0);
                if (v44 & 1)
                    goto LABEL_beb139;
LABEL_beb13a:
                v35 = v40;
            }
            v45 = v14 & 0xffffffff;
            if ((unsigned int)v14 < 1000000)
            {
                v22 = v28;
                v46 = arm64g_calculate_condition(0x33, v45, 1000000, 0);
                if (!(v46 & 1))
                    goto LABEL_beb146;
LABEL_beb145:
            }
            else
            {
                v22 = v42;
                v47 = arm64g_calculate_condition(0x33, v45, 1000000, 0);
                if (v47 & 1)
                    goto LABEL_beb145;
LABEL_beb146:
                v20 = v35;
            }
            v25 = v10 & 63;
            v7 = (unsigned short)(v20 - (short)v8[10]) + 1;
            if ((int)v7 <= a5)
            {
                v0 = v11;
                sub_bebec0();
                return;
            }
        }
        v48 = 0;
        if ((int)v7 - a5 < a4)
            v49 = (short)(v7 - a5);
        else
            v49 = a4;
        while (1)
        {
            v50 = v22;
            v51 = v14 / v50;
            v14 = (unsigned int)v14 - (unsigned int)v50 * v51;
            a3[v48] = (char)v51 + 48;
            if (v49 - 1 == v48)
            {
                v0 = v11;
                sub_bebec0();
                return;
            }
            if (v20 == v48)
                break;
            v48 += 1;
            v22 = (unsigned int)v50 / 10;
            if (10 > (unsigned int)v50)
            {
                sub_c73e3c(&g_efa920);
                v0 = v11;
                sub_bebec0();
                return;
            }
        }
        v52 = v48 + 1;
        v53 = 1;
        while (1)
        {
            if (v53 >> (v10 - 1 & 63))
            {
                *(unsigned long long *)a0 = 0;
                return;
            }
            if (a4 == v52)
                break;
            v54 = v13 * 10;
            v13 = v54 & v12;
            v53 *= 10;
            a3[v52] = (char)(v54 >> (v25 & 63)) + 48;
            v52 += 1;
            if (v49 == v52)
            {
                v0 = v53;
                sub_bebec0();
                return;
            }
        }
    }
    else
    {
        sub_c73c80("assertion failed: d.mant > 0assertion failed: d.minus > 0assertion failed: d.plus > 0assertion failed: d.mant + d.plus < (1 << 61)assertion failed: d.mant.checked_sub(d.minus).is_some()assertion failed: d.mant.checked_add(d.plus).is_some()", 28, &g_efa8f0);
    }
    sub_c73c94(a4, a4, &g_efa938);
    sub_c73c94(v7, 81, &g_efa908);
}
