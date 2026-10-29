/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbedb98..0xbedecc (820 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_800000;
extern long long g_e07f98;
extern long long g_efa710;

long long sub_bedb98(unsigned long a0, unsigned int a1, unsigned int a2, float a3)
{
    unsigned long long v17;  // x19
    unsigned int v18;  // w9
    unsigned long long v27;  // 4107
    unsigned int v28;  // x16
    unsigned long long v29;  // 4110
    unsigned long long v30;  // 4110
    unsigned int v31;  // w17
    unsigned long v32;  // cc_dep1
    unsigned long long v33;  // 4105
    unsigned long long v34;  // 4105
    unsigned int v35;  // x11
    unsigned long long v36;  // 4108
    unsigned int v19;  // x10
    unsigned long long v37;  // 4108
    unsigned int v38;  // w2
    unsigned long long v39;  // 4108
    unsigned long long v40;  // 4108
    unsigned int v41;  // x8
    unsigned int v42;  // x11
    unsigned long v43;  // cc_dep1
    unsigned long long v44;  // 4121
    unsigned int v45;  // x10
    unsigned long long v46;  // x9
    unsigned int v20;  // w13
    unsigned long long v47;  // 4109
    unsigned long long v48;  // 4109
    unsigned long v49;  // cc_dep1
    unsigned int v50;  // x22
    unsigned long long v51;  // 4105
    unsigned long long v52;  // 4105
    unsigned int v53;  // w8
    unsigned int v54;  // x1
    unsigned int *v55;  // x8
    unsigned int v56;  // x11
    unsigned long long v21;  // x11
    unsigned long v57;  // cc_dep1
    unsigned long long v58;  // 4121
    unsigned long long v59;  // x9
    unsigned long long v60;  // 4109
    unsigned long long v61;  // 4109
    unsigned long v62;  // cc_dep1
    unsigned long long v63;  // 4105
    unsigned long long v64;  // 4105
    unsigned long long v65;  // x9
    unsigned long v66;  // x9
    unsigned long v22;  // x8
    unsigned long long v67;  // 4130
    short v68;  // x5
    unsigned long v69;  // x21
    char v23;  // x10
    unsigned long v24;  // cc_dep1
    unsigned long long v25;  // x15
    unsigned long long v26;  // 4107
    unsigned int v0;  // [bp-0x4f0]
    uint128_t v1;  // [bp-0xf0], Other Possible Types: unsigned short, unsigned int
    unsigned long long v2;  // [bp-0xe8]
    unsigned long long v3;  // [bp-0xe0], Other Possible Types: unsigned int
    unsigned int v4;  // [bp-0xd8]
    unsigned long long v5;  // [bp-0xd0]
    uint128_t v6;  // [bp-0x90], Other Possible Types: unsigned long long
    unsigned long long v7;  // [bp-0x88]
    unsigned int *v8;  // [bp-0x80], Other Possible Types: short, unsigned long long
    unsigned long long v9;  // [bp-0x78]
    unsigned long v10;  // [bp-0x70]
    unsigned int v11;  // [bp-0x68]
    unsigned long long v12;  // [bp-0x60]
    unsigned short v13;  // [bp-0x58]
    unsigned int v14;  // [bp-0x56]
    char *v15;  // [bp-0x10]
    char v16;  // [bp+0x0]

    v15 = &v16;
    v0 = 0;
    v17 = a2 & 0xffff;
    v18 = __float_as_int(a3);
    v19 = 2;
    if (!(v18 & 0x7fffff))
        v20 = 2;
    else
        v20 = 3;
    v21 = 0xff & v18 >> 23;
    if (!(v18 & 0x7f800000))
        v22 = (v18 * 2 | v18 >> 31) & 0xfffffe & 0xffffff;
    else
        v22 = v18 & 0x7fffff | 0x800000;
    if (v18 & 0x7f800000)
        v20 = 4;
    if ((v18 & 0x7f800000) == 0x7f800000)
        v20 = !(v18 & 0x7fffff);
    if ((int)v20 <= 1)
    {
        v38 = a2;
        v35 = v21;
        if (v20)
        {
            v19 = 3;
            v38 = a2;
            v35 = v21;
        }
    }
    else if (v20 != 2)
    {
        v23 = (char)v22 & 1;
        v24 = v22 & 0xffffffff;
        if ((unsigned int)v22 == &g_800000)
        {
            v25 = 0x2000000;
            v26 = arm64g_calculate_condition(19, v24, &g_800000, 0);
            if (!(v26 & 1))
                goto LABEL_bedc32;
LABEL_bedc31:
            v28 = 1;
            v29 = arm64g_calculate_condition(3, v24, &g_800000, 0);
            if (!(v29 & 1))
                goto LABEL_bedc3a;
LABEL_bedc39:
            v31 = 0xffffff68;
        }
        else
        {
            v25 = v22 * 2;
            v27 = arm64g_calculate_condition(19, v24, &g_800000, 0);
            if (v27 & 1)
                goto LABEL_bedc31;
LABEL_bedc32:
            v28 = 2;
            v30 = arm64g_calculate_condition(3, v24, &g_800000, 0);
            if (v30 & 1)
                goto LABEL_bedc39;
LABEL_bedc3a:
            v31 = 0xffffff69;
        }
        v32 = v20;
        if (v20 == 3)
        {
            v22 = v22;
            v33 = arm64g_calculate_condition(19, v32, 3, 0);
            if (!(v33 & 1))
                goto LABEL_bedc4e;
LABEL_bedc4d:
            v35 = v28;
            v36 = arm64g_calculate_condition(3, v32, 3, 0);
            if (!(v36 & 1))
                goto LABEL_bedc52;
LABEL_bedc51:
            v38 = (unsigned int)v21 - 150;
            v39 = arm64g_calculate_condition(3, v32, 3, 0);
            if (!(v39 & 1))
                goto LABEL_bedc56;
LABEL_bedc55:
            v19 = v23 ^ 1;
        }
        else
        {
            v22 = v25;
            v34 = arm64g_calculate_condition(19, v32, 3, 0);
            if (v34 & 1)
                goto LABEL_bedc4d;
LABEL_bedc4e:
            v35 = 1;
            v37 = arm64g_calculate_condition(3, v32, 3, 0);
            if (v37 & 1)
                goto LABEL_bedc51;
LABEL_bedc52:
            v38 = v31 + (unsigned int)v21;
            v40 = arm64g_calculate_condition(3, v32, 3, 0);
            if (v40 & 1)
                goto LABEL_bedc55;
LABEL_bedc56:
            v19 = v23 ^ 1;
        }
    }
    else
    {
        v19 = 4;
        v38 = a2;
        v35 = v21;
    }
    v10 = v22;
    v11 = 1;
    v12 = v35;
    v13 = v38;
    v14 = v19;
    if (v19 > 1)
    {
        v41 = v19 - 2;
        if (v41)
        {
            v42 = (unsigned int)"-fn() + : punycode{}.llvm.";
            v43 = v18;
            v44 = arm64g_calculate_condition(67, v18, 0, 0);
            if (v44 & 1)
            {
                v45 = (unsigned int)"-fn() + : punycode{}.llvm.";
                v46 = v18 >> 31;
                v47 = arm64g_calculate_condition(67, v43, 0, 0);
                if (!(v47 & 1))
                    goto LABEL_bedcb6;
LABEL_bedcb5:
            }
            else
            {
                v45 = (unsigned int)"+";
                v46 = v18 >> 31;
                v48 = arm64g_calculate_condition(67, v43, 0, 0);
                if (v48 & 1)
                    goto LABEL_bedcb5;
LABEL_bedcb6:
                v42 = 1;
            }
            v49 = a1;
            if (!a1)
            {
                v50 = v46;
                v51 = arm64g_calculate_condition(19, v49, 0, 0);
                if (!(v51 & 1))
                    goto LABEL_bedcc2;
LABEL_bedcc1:
            }
            else
            {
                v50 = 1;
                v52 = arm64g_calculate_condition(19, v49, 0, 0);
                if (v52 & 1)
                    goto LABEL_bedcc1;
LABEL_bedcc2:
                v45 = v42;
            }
            v53 = v41;
            if (v53 == 2)
            {
                v1 = v53;
                if ((unsigned short)a2)
                {
                    v54 = 2;
                    v2 = "0.0e0";
                    v3 = 2;
                    v4 = 0;
                    v5 = v17;
                    v55 = &v1;
                }
                else
                {
                    v54 = 1;
                    v2 = "0[]::::{closure:#<>& *const ; (,_false{ {  } = 0x'..= | !nullstr()i8i16i32i64isizeu8u16u32u64usizef32f64!...";
                    v3 = 1;
                    v55 = &v1;
                }
            }
            else
            {
                v1 = 2;
                v2 = "inf";
                v3 = 3;
                v55 = &v1;
                v54 = 1;
            }
        }
        else
        {
            v50 = 0;
            v1 = 2;
            v2 = "NaN";
            v3 = 3;
            v55 = &v1;
            v45 = 1;
            v54 = 1;
        }
    }
    else
    {
        v56 = (unsigned int)"-fn() + : punycode{}.llvm.";
        v57 = v18;
        v58 = arm64g_calculate_condition(67, v18, 0, 0);
        if (v58 & 1)
        {
            v45 = (unsigned int)"-fn() + : punycode{}.llvm.";
            v59 = v18 >> 31;
            v60 = arm64g_calculate_condition(67, v57, 0, 0);
            if (!(v60 & 1))
                goto LABEL_bedd1a;
LABEL_bedd19:
        }
        else
        {
            v45 = (unsigned int)"+";
            v59 = v18 >> 31;
            v61 = arm64g_calculate_condition(67, v57, 0, 0);
            if (v61 & 1)
                goto LABEL_bedd19;
LABEL_bedd1a:
            v56 = 1;
        }
        v62 = a1;
        if (!a1)
        {
            v50 = v59;
            v63 = arm64g_calculate_condition(19, v62, 0, 0);
            if (!(v63 & 1))
                goto LABEL_bedd26;
LABEL_bedd25:
        }
        else
        {
            v50 = 1;
            v64 = arm64g_calculate_condition(19, v62, 0, 0);
            if (v64 & 1)
                goto LABEL_bedd25;
LABEL_bedd26:
            v45 = v56;
        }
        v65 = 5;
        if (v38 & 0x8000)
            v65 = 0xfffffffffffffff4;
        v66 = (short)v38 * v65;
        if (251 <= v66 >> 6)
            sub_c73c80(&g_e07f98, 37, &g_efa710);
        v67 = arm64g_calculate_condition(209, (short)a2, 1, 0);
        if (v67 & 1)
            v68 = 0x8000;
        else
            v68 = -a2;
        v69 = v68;
        sub_beafa0();
        if ((unsigned long long)v1)
        {
            v6 = v1;
            v8 = v3;
            if ((short)v8 <= (int)v69)
                goto LABEL_bede08;
LABEL_bedda0:
            v54 = *(unsigned long long *)((void*)&v6 + 8);
            v55 = sub_beada0(v6, v54);
        }
        else
        {
            sub_beb2b8(&v6, &v10, &v0, (v66 >> 4) + 21, v69);
            if ((int)v69 < v8)
                goto LABEL_bedda0;
LABEL_bede08:
            v1 = 2;
            if ((unsigned short)a2)
            {
                v54 = 2;
                v2 = "0.0e0";
                v3 = 2;
                v4 = 0;
                v5 = v17;
            }
            else
            {
                v54 = 1;
                v2 = "0[]::::{closure:#<>& *const ; (,_false{ {  } = 0x'..= | !nullstr()i8i16i32i64isizeu8u16u32u64usizef32f64!...";
                v3 = 1;
            }
            v55 = &v1;
        }
    }
    v6 = v45;
    v7 = v50;
    v8 = v55;
    v9 = v54;
    return sub_bed46c();
}
