/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbedecc..0xbee140 (628 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_800000;
extern unsigned long long g_e07f93;

long long sub_bedecc(unsigned long a0, unsigned int a1, unsigned int a2, float a3)
{
    unsigned int v17;  // w8
    unsigned int v18;  // x9
    unsigned int v27;  // x16
    unsigned long long v28;  // 4110
    unsigned long long v29;  // 4110
    unsigned int v30;  // w17
    unsigned long v31;  // cc_dep1
    unsigned long long v32;  // 4105
    unsigned long long v33;  // 4105
    unsigned int v34;  // x11
    unsigned long long v35;  // 4108
    unsigned long long v36;  // 4108
    unsigned int v19;  // w13
    unsigned long long v37;  // 4108
    unsigned long long v38;  // 4108
    unsigned int v39;  // x9
    unsigned int v40;  // x11
    unsigned long v41;  // cc_dep1
    unsigned long long v42;  // 4121
    unsigned int v43;  // x10
    unsigned long long v44;  // x8
    unsigned long long v45;  // 4109
    unsigned long long v46;  // 4109
    unsigned long long v20;  // x11
    unsigned long v47;  // cc_dep1
    unsigned int v48;  // x21
    unsigned long long v49;  // 4105
    unsigned long long v50;  // 4105
    unsigned int v51;  // w8
    unsigned int v52;  // x1
    unsigned int *v53;  // x8
    unsigned long v54;  // cc_dep1
    unsigned long long v55;  // 4125
    unsigned int v56;  // x9
    unsigned long v21;  // x10
    unsigned long long v57;  // x8
    unsigned long long v58;  // 4109
    unsigned long long v59;  // 4109
    unsigned long v60;  // cc_dep1
    unsigned long long v61;  // 4105
    unsigned long long v62;  // 4105
    char v22;  // x9
    unsigned long v23;  // cc_dep1
    unsigned long long v24;  // x15
    unsigned long long v25;  // 4107
    unsigned long long v26;  // 4107
    char v0;  // [bp-0xf1]
    uint128_t v1;  // [bp-0xe0], Other Possible Types: unsigned short, unsigned int
    unsigned long long v2;  // [bp-0xd8]
    unsigned long long v3;  // [bp-0xd0], Other Possible Types: unsigned int
    unsigned int v4;  // [bp-0xc8]
    unsigned int v5;  // [bp-0xc0]
    uint128_t v6;  // [bp-0x80], Other Possible Types: unsigned long long
    unsigned long long v7;  // [bp-0x78]
    unsigned int *v8;  // [bp-0x70], Other Possible Types: unsigned long long
    unsigned long long v9;  // [bp-0x68]
    unsigned long v10;  // [bp-0x60]
    unsigned int v11;  // [bp-0x58]
    unsigned long long v12;  // [bp-0x50]
    unsigned short v13;  // [bp-0x48]
    unsigned int v14;  // [bp-0x46]
    char *v15;  // [bp-0x10]
    char v16;  // [bp+0x0]

    v15 = &v16;
    v17 = __float_as_int(a3);
    v18 = 2;
    if (!(v17 & 0x7fffff))
        v19 = 2;
    else
        v19 = 3;
    v20 = 0xff & v17 >> 23;
    if (!(v17 & 0x7f800000))
        v21 = (v17 * 2 | v17 >> 31) & 0xfffffe & 0xffffff;
    else
        v21 = v17 & 0x7fffff | 0x800000;
    if (v17 & 0x7f800000)
        v19 = 4;
    if ((v17 & 0x7f800000) == 0x7f800000)
        v19 = !(v17 & 0x7fffff);
    if ((int)v19 <= 1)
    {
        v34 = v20;
        if (v19)
        {
            v18 = 3;
            v34 = v20;
        }
    }
    else if (v19 != 2)
    {
        v22 = (char)v21 & 1;
        v23 = v21 & 0xffffffff;
        if ((unsigned int)v21 == &g_800000)
        {
            v24 = 0x2000000;
            v25 = arm64g_calculate_condition(19, v23, &g_800000, 0);
            if (!(v25 & 1))
                goto LABEL_bedf5e;
LABEL_bedf5d:
            v27 = 1;
            v28 = arm64g_calculate_condition(3, v23, &g_800000, 0);
            if (!(v28 & 1))
                goto LABEL_bedf66;
LABEL_bedf65:
            v30 = 0xffffff68;
        }
        else
        {
            v24 = v21 * 2;
            v26 = arm64g_calculate_condition(19, v23, &g_800000, 0);
            if (v26 & 1)
                goto LABEL_bedf5d;
LABEL_bedf5e:
            v27 = 2;
            v29 = arm64g_calculate_condition(3, v23, &g_800000, 0);
            if (v29 & 1)
                goto LABEL_bedf65;
LABEL_bedf66:
            v30 = 0xffffff69;
        }
        v31 = v19;
        if (v19 == 3)
        {
            v21 = v21;
            v32 = arm64g_calculate_condition(19, v31, 3, 0);
            if (!(v32 & 1))
                goto LABEL_bedf7a;
LABEL_bedf79:
            v34 = v27;
            v35 = arm64g_calculate_condition(3, v31, 3, 0);
            if (!(v35 & 1))
                goto LABEL_bedf7e;
LABEL_bedf7d:
            v19 = (unsigned int)v20 - 150;
            v37 = arm64g_calculate_condition(3, v31, 3, 0);
            if (!(v37 & 1))
                goto LABEL_bedf82;
LABEL_bedf81:
            v18 = v22 ^ 1;
        }
        else
        {
            v21 = v24;
            v33 = arm64g_calculate_condition(19, v31, 3, 0);
            if (v33 & 1)
                goto LABEL_bedf79;
LABEL_bedf7a:
            v34 = 1;
            v36 = arm64g_calculate_condition(3, v31, 3, 0);
            if (v36 & 1)
                goto LABEL_bedf7d;
LABEL_bedf7e:
            v19 = v30 + (unsigned int)v20;
            v38 = arm64g_calculate_condition(3, v31, 3, 0);
            if (v38 & 1)
                goto LABEL_bedf81;
LABEL_bedf82:
            v18 = v22 ^ 1;
        }
    }
    else
    {
        v18 = 4;
        v34 = v20;
    }
    v10 = v21;
    v11 = 1;
    v12 = v34;
    v13 = v19;
    v14 = v18;
    if (v18 > 1)
    {
        v39 = v18 - 2;
        if (v39)
        {
            v40 = (unsigned int)"-fn() + : punycode{}.llvm.";
            v41 = v17;
            v42 = arm64g_calculate_condition(67, v17, 0, 0);
            if (v42 & 1)
            {
                v43 = (unsigned int)"-fn() + : punycode{}.llvm.";
                v44 = v17 >> 31;
                v45 = arm64g_calculate_condition(67, v41, 0, 0);
                if (!(v45 & 1))
                    goto LABEL_bedfe2;
LABEL_bedfe1:
            }
            else
            {
                v43 = (unsigned int)"+";
                v44 = v17 >> 31;
                v46 = arm64g_calculate_condition(67, v41, 0, 0);
                if (v46 & 1)
                    goto LABEL_bedfe1;
LABEL_bedfe2:
                v40 = 1;
            }
            v47 = a1;
            if (!a1)
            {
                v48 = v44;
                v49 = arm64g_calculate_condition(19, v47, 0, 0);
                if (!(v49 & 1))
                    goto LABEL_bedfee;
LABEL_bedfed:
            }
            else
            {
                v48 = 1;
                v50 = arm64g_calculate_condition(19, v47, 0, 0);
                if (v50 & 1)
                    goto LABEL_bedfed;
LABEL_bedfee:
                v43 = v40;
            }
            v51 = v39;
            if (v51 == 2)
            {
                v1 = v51;
                if (a2)
                {
                    v52 = 2;
                    v2 = &g_e07f93;
                    v3 = 2;
                    v4 = 0;
                    v5 = 1;
                }
                else
                {
                    v52 = 1;
                    v2 = "0[]::::{closure:#<>& *const ; (,_false{ {  } = 0x'..= | !nullstr()i8i16i32i64isizeu8u16u32u64usizef32f64!...";
                    v3 = 1;
                }
                v53 = &v1;
            }
            else
            {
                v1 = 2;
                v2 = "inf";
                v3 = 3;
                v53 = &v1;
                v52 = 1;
            }
        }
        else
        {
            v48 = 0;
            v1 = 2;
            v2 = "NaN";
            v3 = 3;
            v53 = &v1;
            v43 = 1;
            v52 = 1;
        }
    }
    else
    {
        v43 = (unsigned int)"-fn() + : punycode{}.llvm.";
        v54 = v17;
        v55 = arm64g_calculate_condition(67, v17, 0, 0);
        if (v55 & 1)
        {
            v56 = (unsigned int)"-fn() + : punycode{}.llvm.";
            v57 = v17 >> 31;
            v58 = arm64g_calculate_condition(67, v54, 0, 0);
            if (!(v58 & 1))
                goto LABEL_bee04a;
LABEL_bee049:
        }
        else
        {
            v56 = (unsigned int)"+";
            v57 = v17 >> 31;
            v59 = arm64g_calculate_condition(67, v54, 0, 0);
            if (v59 & 1)
                goto LABEL_bee049;
LABEL_bee04a:
            v43 = 1;
        }
        v60 = a1;
        if (!a1)
        {
            v48 = v57;
            v61 = arm64g_calculate_condition(19, v60, 0, 0);
            if (!(v61 & 1))
                goto LABEL_bee056;
LABEL_bee055:
            v43 = v56;
        }
        else
        {
            v48 = 1;
            v62 = arm64g_calculate_condition(19, v60, 0, 0);
            if (v62 & 1)
                goto LABEL_bee055;
LABEL_bee056:
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
        v52 = *(unsigned long long *)((void*)&v6 + 8);
        v53 = sub_beada0(*(unsigned long long *)&v6, v52, (unsigned short)v8, a2, &v1);
    }
    v6 = v43;
    v7 = v48;
    v8 = v53;
    v9 = v52;
    return sub_bed46c();
}
