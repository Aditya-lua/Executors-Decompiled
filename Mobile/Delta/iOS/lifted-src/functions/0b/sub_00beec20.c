/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbeec20..0xbeee6c (588 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_e07f93;

long long sub_beec20(unsigned long a0, unsigned long long a1, double a2)
{
    unsigned long v17;  // x8
    unsigned int v18;  // w9
    unsigned long long v27;  // 4107
    unsigned long long v28;  // 4107
    unsigned long long v29;  // x16
    unsigned long long v30;  // 4110
    unsigned long long v31;  // 4110
    unsigned short v32;  // x17
    unsigned long v33;  // cc_dep1
    unsigned long v34;  // x10
    unsigned long long v35;  // 4105
    unsigned long long v36;  // 4105
    unsigned long long v19;  // x12
    unsigned long long v37;  // 4108
    unsigned long long v38;  // 4108
    unsigned long long v39;  // 4108
    unsigned long long v40;  // 4108
    unsigned long long v41;  // x9
    unsigned long long v42;  // x9
    unsigned long long v43;  // x11
    unsigned long v44;  // cc_dep1
    unsigned long long v45;  // 4115
    unsigned long long v46;  // x10
    unsigned long long v20;  // w14
    unsigned long long v47;  // x8
    unsigned long long v48;  // 4107
    unsigned long long v49;  // 4107
    unsigned long v50;  // cc_dep1
    unsigned long long v51;  // x20
    unsigned long long v52;  // 4105
    unsigned long long v53;  // 4105
    unsigned long long v54;  // x1
    unsigned long long *v55;  // x8
    unsigned long long v56;  // x10
    unsigned long v21;  // x10
    unsigned long v57;  // cc_dep1
    unsigned long long v58;  // 4119
    unsigned long long v59;  // x8
    unsigned long long v60;  // 4107
    unsigned long long v61;  // 4107
    unsigned long v62;  // cc_dep1
    unsigned long long v63;  // 4105
    unsigned long long v64;  // 4105
    unsigned long long v22;  // x9
    unsigned long long v23;  // x11
    char v24;  // x12
    unsigned long v25;  // cc_dep1
    unsigned long long v26;  // x15
    char v0;  // [bp-0xe1]
    uint128_t v1;  // [bp-0xd0], Other Possible Types: unsigned long long
    unsigned long long v2;  // [bp-0xc8]
    unsigned long long v3;  // [bp-0xc0]
    unsigned long long v4;  // [bp-0xb8]
    unsigned long long v5;  // [bp-0xb0]
    uint128_t v6;  // [bp-0x70], Other Possible Types: unsigned long long
    unsigned long long v7;  // [bp-0x68]
    unsigned long long *v8;  // [bp-0x60], Other Possible Types: unsigned long long
    unsigned long long v9;  // [bp-0x58]
    unsigned long v10;  // [bp-0x50]
    unsigned long long v11;  // [bp-0x48]
    unsigned long long v12;  // [bp-0x40]
    unsigned long long v13;  // [bp-0x38]
    unsigned long long v14;  // [bp-0x36]
    char *v15;  // [bp-0x10]
    char v16;  // [bp+0x0]

    v15 = &v16;
    v17 = __double_as_longlong(a2);
    v18 = v17 >> 52;
    v19 = 2;
    if (!(v17 & 0xfffffffffffff))
        v20 = 2;
    else
        v20 = 3;
    v21 = v18 & 0x7ff;
    v22 = (v17 * 2 | v17 >> 63) & 0x1ffffffffffffe & 0x1fffffffffffff;
    if (v18 & 0x7ff)
        v22 = v17 & 0xfffffffffffff | 0x10000000000000;
    if (v17 & 0x7ff0000000000000)
        v20 = 4;
    if ((v17 & 0x7ff0000000000000) == 0x7ff0000000000000)
        v23 = !(v17 & 0xfffffffffffff);
    else
        v23 = v20;
    if ((int)v23 <= 1)
    {
        if (!(unsigned int)v23)
            v41 = 2;
        else
            v41 = 3;
        v34 = v21;
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
                goto LABEL_beecae;
LABEL_beecad:
            v29 = 1;
            v30 = arm64g_calculate_condition(4, v25, 0x10000000000000, 0);
            if (!(v30 & 1))
                goto LABEL_beecb6;
LABEL_beecb5:
            v32 = 64459;
        }
        else
        {
            v26 = v22 * 2;
            v28 = arm64g_calculate_condition(20, v25, 0x10000000000000, 0);
            if (v28 & 1)
                goto LABEL_beecad;
LABEL_beecae:
            v29 = 2;
            v31 = arm64g_calculate_condition(4, v25, 0x10000000000000, 0);
            if (v31 & 1)
                goto LABEL_beecb5;
LABEL_beecb6:
            v32 = 64460;
        }
        v33 = v23 & 0xffffffff;
        if ((unsigned int)v23 == 3)
        {
            v34 = v22;
            v35 = arm64g_calculate_condition(19, v33, 3, 0);
            if (!(v35 & 1))
                goto LABEL_beecca;
LABEL_beecc9:
            v23 = v29;
            v37 = arm64g_calculate_condition(3, v33, 3, 0);
            if (!(v37 & 1))
                goto LABEL_beecce;
LABEL_beeccd:
            v19 = (unsigned short)((unsigned int)v21 - 1075);
            v39 = arm64g_calculate_condition(3, v33, 3, 0);
            if (!(v39 & 1))
                goto LABEL_beecd2;
LABEL_beecd1:
            v41 = v24 ^ 1;
        }
        else
        {
            v34 = v26;
            v36 = arm64g_calculate_condition(19, v33, 3, 0);
            if (v36 & 1)
                goto LABEL_beecc9;
LABEL_beecca:
            v23 = 1;
            v38 = arm64g_calculate_condition(3, v33, 3, 0);
            if (v38 & 1)
                goto LABEL_beeccd;
LABEL_beecce:
            v19 = v32 + (unsigned short)v21;
            v40 = arm64g_calculate_condition(3, v33, 3, 0);
            if (v40 & 1)
                goto LABEL_beecd1;
LABEL_beecd2:
            v41 = v24 ^ 1;
        }
    }
    else
    {
        v41 = 4;
        v34 = v21;
    }
    v10 = v34;
    v11 = 1;
    v12 = v23;
    v13 = v19;
    v14 = v41;
    if (v41 > 1)
    {
        v42 = v41 - 2;
        if (v42)
        {
            v43 = "-fn() + : punycode{}.llvm.0[]::::{closure:#<>& *const ; (,_false{ {  } = 0x'..= | !nullstr()i8i16i32i64isizeu8u16u32u64usizef32f64!...";
            v44 = v17;
            v45 = arm64g_calculate_condition(0x44, v17, 0, 0);
            if (v45 & 1)
            {
                v46 = "-fn() + : punycode{}.llvm.0[]::::{closure:#<>& *const ; (,_false{ {  } = 0x'..= | !nullstr()i8i16i32i64isizeu8u16u32u64usizef32f64!...";
                v47 = v17 >> 63;
                v48 = arm64g_calculate_condition(0x44, v44, 0, 0);
                if (!(v48 & 1))
                    goto LABEL_beed36;
LABEL_beed35:
            }
            else
            {
                v46 = "+";
                v47 = v17 >> 63;
                v49 = arm64g_calculate_condition(0x44, v44, 0, 0);
                if (v49 & 1)
                    goto LABEL_beed35;
LABEL_beed36:
                v43 = 1;
            }
            v50 = a1;
            if (!a1)
            {
                v51 = v47;
                v52 = arm64g_calculate_condition(19, v50, 0, 0);
                if (!(v52 & 1))
                    goto LABEL_beed42;
LABEL_beed41:
                v43 = v46;
            }
            else
            {
                v51 = 1;
                v53 = arm64g_calculate_condition(19, v50, 0, 0);
                if (v53 & 1)
                    goto LABEL_beed41;
LABEL_beed42:
            }
            v1 = 2;
            if (v42 == 2)
            {
                v54 = 2;
                v2 = &g_e07f93;
                v3 = 2;
                v4 = 0;
                v5 = 1;
                v55 = &v1;
            }
            else
            {
                v2 = "inf";
                v3 = 3;
                v55 = &v1;
LABEL_beee44:
                v54 = 1;
            }
        }
        else
        {
            v51 = 0;
            v1 = 2;
            v2 = "NaN";
            v3 = 3;
            v55 = &v1;
            v43 = 1;
            goto LABEL_beee44;
        }
    }
    else
    {
        v56 = "-fn() + : punycode{}.llvm.0[]::::{closure:#<>& *const ; (,_false{ {  } = 0x'..= | !nullstr()i8i16i32i64isizeu8u16u32u64usizef32f64!...";
        v57 = v17;
        v58 = arm64g_calculate_condition(0x44, v17, 0, 0);
        if (v58 & 1)
        {
            v43 = "-fn() + : punycode{}.llvm.0[]::::{closure:#<>& *const ; (,_false{ {  } = 0x'..= | !nullstr()i8i16i32i64isizeu8u16u32u64usizef32f64!...";
            v59 = v17 >> 63;
            v60 = arm64g_calculate_condition(0x44, v57, 0, 0);
            if (!(v60 & 1))
                goto LABEL_beed9e;
LABEL_beed9d:
        }
        else
        {
            v43 = "+";
            v59 = v17 >> 63;
            v61 = arm64g_calculate_condition(0x44, v57, 0, 0);
            if (v61 & 1)
                goto LABEL_beed9d;
LABEL_beed9e:
            v56 = 1;
        }
        v62 = a1;
        if (!a1)
        {
            v51 = v59;
            v63 = arm64g_calculate_condition(19, v62, 0, 0);
            if (!(v63 & 1))
                goto LABEL_beedaa;
LABEL_beeda9:
        }
        else
        {
            v51 = 1;
            v64 = arm64g_calculate_condition(19, v62, 0, 0);
            if (v64 & 1)
                goto LABEL_beeda9;
LABEL_beedaa:
            v43 = v56;
        }
        sub_bec090();
        if (*(unsigned long long *)&v1)
        {
            v6 = v1;
            v8 = v3;
        }
        else
        {
            sub_bec5f0(&v6, &v10, &v0);
        }
        v54 = *(unsigned long long *)((void*)&v6 + 8);
        v55 = sub_beada0(*(unsigned long long *)&v6, v54, (unsigned short)v8, 1, &v1);
    }
    v6 = v43;
    v7 = v51;
    v8 = v55;
    v9 = v54;
    return sub_bed46c();
}
