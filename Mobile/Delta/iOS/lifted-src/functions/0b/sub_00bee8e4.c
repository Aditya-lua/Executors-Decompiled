/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbee8e4..0xbeec20 (828 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_e07f98;
extern long long g_efa710;

long long sub_bee8e4(unsigned long a0, unsigned long long a1, unsigned int a2, double a3)
{
    unsigned long long v17;  // x19
    unsigned long v18;  // x9
    unsigned long long v27;  // 4107
    unsigned long long v28;  // 4107
    unsigned long long v29;  // x16
    unsigned long long v30;  // 4110
    unsigned long long v31;  // 4110
    unsigned int v32;  // w17
    unsigned long v33;  // cc_dep1
    unsigned long long v34;  // 4105
    unsigned long long v35;  // 4105
    unsigned long long v36;  // 4108
    unsigned int v19;  // w8
    unsigned long long v37;  // 4108
    unsigned int v38;  // w2
    unsigned long long v39;  // 4108
    unsigned long long v40;  // 4108
    unsigned long long v41;  // x10
    unsigned long long v42;  // x8
    unsigned long long v43;  // x11
    unsigned long v44;  // cc_dep1
    unsigned long long v45;  // 4115
    unsigned long long v46;  // x10
    unsigned long long v20;  // w14
    unsigned long long v47;  // x9
    unsigned long long v48;  // 4107
    unsigned long long v49;  // 4107
    unsigned long v50;  // cc_dep1
    unsigned long long v51;  // x22
    unsigned long long v52;  // 4105
    unsigned long long v53;  // 4105
    unsigned long long v54;  // w8
    unsigned long long v55;  // x1
    unsigned long long *v56;  // x8
    unsigned int v21;  // w10
    unsigned long v57;  // cc_dep1
    unsigned long long v58;  // 4115
    unsigned long long v59;  // x10
    unsigned long long v60;  // x9
    unsigned long long v61;  // 4107
    unsigned long long v62;  // 4107
    unsigned long v63;  // cc_dep1
    unsigned long long v64;  // 4105
    unsigned long long v65;  // 4105
    unsigned long long v66;  // x9
    unsigned long long v22;  // x8
    unsigned long v67;  // x9
    unsigned long long v68;  // 4130
    short v69;  // x5
    unsigned long v70;  // x21
    unsigned long long v23;  // x11
    char v24;  // x12
    unsigned long v25;  // cc_dep1
    unsigned long long v26;  // x15
    unsigned long long v0;  // [bp-0x4f0]
    uint128_t v1;  // [bp-0xf0], Other Possible Types: unsigned short, unsigned long long
    unsigned long long v2;  // [bp-0xe8]
    unsigned long long v3;  // [bp-0xe0]
    unsigned long long v4;  // [bp-0xd8]
    unsigned long long v5;  // [bp-0xd0]
    uint128_t v6;  // [bp-0x90], Other Possible Types: unsigned long long
    unsigned long long v7;  // [bp-0x88]
    unsigned long long *v8;  // [bp-0x80], Other Possible Types: short, unsigned long long
    unsigned long long v9;  // [bp-0x78]
    unsigned long v10;  // [bp-0x70]
    unsigned long long v11;  // [bp-0x68]
    unsigned long long v12;  // [bp-0x60]
    unsigned short v13;  // [bp-0x58]
    unsigned long long v14;  // [bp-0x56]
    char *v15;  // [bp-0x10]
    char v16;  // [bp+0x0]

    v15 = &v16;
    v0 = 0;
    v17 = a2 & 0xffff;
    v18 = __double_as_longlong(a3);
    v19 = v18 >> 52;
    if (!(v18 & 0xfffffffffffff))
        v20 = 2;
    else
        v20 = 3;
    v21 = v19 & 0x7ff;
    v22 = (v18 * 2 | v18 >> 63) & 0x1ffffffffffffe & 0x1fffffffffffff;
    if (v19 & 0x7ff)
        v22 = v18 & 0xfffffffffffff | 0x10000000000000;
    if (v18 & 0x7ff0000000000000)
        v20 = 4;
    if ((v18 & 0x7ff0000000000000) == 0x7ff0000000000000)
        v23 = !(v18 & 0xfffffffffffff);
    else
        v23 = v20;
    if ((int)v23 <= 1)
    {
        v22 = 3;
        if (!(unsigned int)v23)
            v41 = 2;
        else
            v41 = 3;
        v38 = a2;
    }
    else if ((unsigned int)v23 != 2)
    {
        v24 = (char)v22 & 1;
        v25 = v22;
        if (v22 == 0x10000000000000)
        {
            v26 = 0x40000000000000;
            v27 = arm64g_calculate_condition(20, v25, 0x10000000000000, 0);
            if (!(v27 & 1))
                goto LABEL_bee982;
LABEL_bee981:
            v29 = 1;
            v30 = arm64g_calculate_condition(4, v25, 0x10000000000000, 0);
            if (!(v30 & 1))
                goto LABEL_bee98a;
LABEL_bee989:
            v32 = 0xfffffbcb;
        }
        else
        {
            v26 = v22 * 2;
            v28 = arm64g_calculate_condition(20, v25, 0x10000000000000, 0);
            if (v28 & 1)
                goto LABEL_bee981;
LABEL_bee982:
            v29 = 2;
            v31 = arm64g_calculate_condition(4, v25, 0x10000000000000, 0);
            if (v31 & 1)
                goto LABEL_bee989;
LABEL_bee98a:
            v32 = 0xfffffbcc;
        }
        v33 = v23 & 0xffffffff;
        if ((unsigned int)v23 == 3)
        {
            v22 = v22;
            v34 = arm64g_calculate_condition(19, v33, 3, 0);
            if (!(v34 & 1))
                goto LABEL_bee99e;
LABEL_bee99d:
            v23 = v29;
            v36 = arm64g_calculate_condition(3, v33, 3, 0);
            if (!(v36 & 1))
                goto LABEL_bee9a2;
LABEL_bee9a1:
            v38 = v21 - 1075;
            v39 = arm64g_calculate_condition(3, v33, 3, 0);
            if (!(v39 & 1))
                goto LABEL_bee9a6;
LABEL_bee9a5:
            v41 = v24 ^ 1;
        }
        else
        {
            v22 = v26;
            v35 = arm64g_calculate_condition(19, v33, 3, 0);
            if (v35 & 1)
                goto LABEL_bee99d;
LABEL_bee99e:
            v23 = 1;
            v37 = arm64g_calculate_condition(3, v33, 3, 0);
            if (v37 & 1)
                goto LABEL_bee9a1;
LABEL_bee9a2:
            v38 = v32 + v21;
            v40 = arm64g_calculate_condition(3, v33, 3, 0);
            if (v40 & 1)
                goto LABEL_bee9a5;
LABEL_bee9a6:
            v41 = v24 ^ 1;
        }
    }
    else
    {
        v41 = 4;
        v38 = a2;
    }
    v10 = v22;
    v11 = 1;
    v12 = v23;
    v13 = v38;
    v14 = v41;
    if (v41 > 1)
    {
        v42 = v41 - 2;
        if (v42)
        {
            v43 = "-fn() + : punycode{}.llvm.";
            v44 = v18;
            v45 = arm64g_calculate_condition(0x44, v18, 0, 0);
            if (v45 & 1)
            {
                v46 = "-fn() + : punycode{}.llvm.";
                v47 = v18 >> 63;
                v48 = arm64g_calculate_condition(0x44, v44, 0, 0);
                if (!(v48 & 1))
                    goto LABEL_beea0a;
LABEL_beea09:
            }
            else
            {
                v46 = "+";
                v47 = v18 >> 63;
                v49 = arm64g_calculate_condition(0x44, v44, 0, 0);
                if (v49 & 1)
                    goto LABEL_beea09;
LABEL_beea0a:
                v43 = 1;
            }
            v50 = a1;
            if (!a1)
            {
                v51 = v47;
                v52 = arm64g_calculate_condition(19, v50, 0, 0);
                if (!(v52 & 1))
                    goto LABEL_beea16;
LABEL_beea15:
                v43 = v46;
            }
            else
            {
                v51 = 1;
                v53 = arm64g_calculate_condition(19, v50, 0, 0);
                if (v53 & 1)
                    goto LABEL_beea15;
LABEL_beea16:
            }
            v54 = (unsigned int)v42;
            if (v54 == 2)
            {
                v1 = v54;
                if ((unsigned short)a2)
                {
                    v55 = 2;
                    v2 = "0.0e0";
                    v3 = 2;
                    v4 = 0;
                    v5 = v17;
                    v56 = &v1;
                }
                else
                {
                    v55 = 1;
                    v2 = "0[]::::{closure:#<>& *const ; (,_false{ {  } = 0x'..= | !nullstr()i8i16i32i64isizeu8u16u32u64usizef32f64!...";
                    v3 = 1;
                    v56 = &v1;
                }
            }
            else
            {
                v1 = 2;
                v2 = "inf";
                v3 = 3;
                v56 = &v1;
                v55 = 1;
            }
        }
        else
        {
            v51 = 0;
            v1 = 2;
            v2 = "NaN";
            v3 = 3;
            v56 = &v1;
            v43 = 1;
            v55 = 1;
        }
    }
    else
    {
        v43 = "-fn() + : punycode{}.llvm.";
        v57 = v18;
        v58 = arm64g_calculate_condition(0x44, v18, 0, 0);
        if (v58 & 1)
        {
            v59 = "-fn() + : punycode{}.llvm.";
            v60 = v18 >> 63;
            v61 = arm64g_calculate_condition(0x44, v57, 0, 0);
            if (!(v61 & 1))
                goto LABEL_beea6e;
LABEL_beea6d:
        }
        else
        {
            v59 = "+";
            v60 = v18 >> 63;
            v62 = arm64g_calculate_condition(0x44, v57, 0, 0);
            if (v62 & 1)
                goto LABEL_beea6d;
LABEL_beea6e:
            v43 = 1;
        }
        v63 = a1;
        if (!a1)
        {
            v51 = v60;
            v64 = arm64g_calculate_condition(19, v63, 0, 0);
            if (!(v64 & 1))
                goto LABEL_beea7a;
LABEL_beea79:
            v43 = v59;
        }
        else
        {
            v51 = 1;
            v65 = arm64g_calculate_condition(19, v63, 0, 0);
            if (v65 & 1)
                goto LABEL_beea79;
LABEL_beea7a:
        }
        v66 = 5;
        if (v38 & 0x8000)
            v66 = 0xfffffffffffffff4;
        v67 = (short)v38 * v66;
        if (251 <= v67 >> 6)
            sub_c73c80(&g_e07f98, 37, &g_efa710);
        v68 = arm64g_calculate_condition(209, (short)a2, 1, 0);
        if (v68 & 1)
            v69 = 0x8000;
        else
            v69 = -a2;
        v70 = v69;
        sub_beafa0();
        if ((unsigned long long)v1)
        {
            v6 = v1;
            v8 = v3;
            if ((short)v8 <= (int)v70)
                goto LABEL_beeb5c;
LABEL_beeaf4:
            v55 = *(unsigned long long *)((void*)&v6 + 8);
            v56 = sub_beada0(v6, v55);
        }
        else
        {
            sub_beb2b8(&v6, &v10, &v0, (v67 >> 4) + 21, v70);
            if ((int)v70 < v8)
                goto LABEL_beeaf4;
LABEL_beeb5c:
            v1 = 2;
            if ((unsigned short)a2)
            {
                v55 = 2;
                v2 = "0.0e0";
                v3 = 2;
                v4 = 0;
                v5 = v17;
            }
            else
            {
                v55 = 1;
                v2 = "0[]::::{closure:#<>& *const ; (,_false{ {  } = 0x'..= | !nullstr()i8i16i32i64isizeu8u16u32u64usizef32f64!...";
                v3 = 1;
            }
            v56 = &v1;
        }
    }
    v6 = v43;
    v7 = v51;
    v8 = v56;
    v9 = v55;
    return sub_bed46c();
}
