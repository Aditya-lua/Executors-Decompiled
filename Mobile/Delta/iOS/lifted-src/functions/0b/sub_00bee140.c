/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbee140..0xbee42c (748 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bee140_1 {
    char padding_0[1];
    char field_1;
} st_bee140_1;

typedef struct st_bee140_0 {
    char padding_0[8];
    unsigned long long field_8;
    unsigned int field_10;
    char padding_14[6];
    unsigned short field_1a;
} st_bee140_0;

extern char g_800000;
extern unsigned long long g_e08112;
extern long long g_efa860;
extern long long g_efa878;

double sub_bee140(unsigned long a0, unsigned int a1, float a2)
{
    unsigned int v24;  // w8
    unsigned int v25;  // x9
    unsigned int v34;  // x16
    unsigned long long v35;  // 4110
    unsigned long long v36;  // 4110
    unsigned int v37;  // w17
    unsigned long v38;  // cc_dep1
    unsigned long long v39;  // 4105
    unsigned long long v40;  // 4105
    unsigned int v41;  // x11
    unsigned long long v42;  // 4108
    unsigned long long v43;  // 4108
    unsigned int v26;  // w13
    unsigned long long v44;  // 4108
    unsigned long long v45;  // 4108
    unsigned int v46;  // x9
    unsigned int v47;  // x11
    unsigned long v48;  // cc_dep1
    unsigned long long v49;  // 4121
    unsigned int v50;  // x10
    unsigned long long v51;  // x8
    unsigned long long v52;  // 4109
    unsigned long long v53;  // 4109
    unsigned long long v27;  // x11
    unsigned long v54;  // cc_dep1
    unsigned int v55;  // x20
    unsigned long long v56;  // 4105
    unsigned long long v57;  // 4105
    unsigned long long v58;  // x8
    unsigned long v59;  // cc_dep1
    unsigned long long v60;  // 4125
    unsigned int v61;  // x9
    unsigned long long v62;  // x8
    unsigned long long v63;  // 4109
    unsigned long v28;  // x10
    unsigned long long v64;  // 4109
    unsigned long v65;  // cc_dep1
    unsigned long long v66;  // 4105
    unsigned long long v67;  // 4105
    unsigned int v68;  // x12
    unsigned int v69;  // x8
    unsigned int v70;  // w9
    st_bee140_0 *v71;  // x12
    unsigned int v72;  // x8
    unsigned long v73;  // cc_dep1
    char v29;  // x9
    unsigned long long v74;  // x13
    unsigned long long v75;  // 4106
    unsigned long long v76;  // 4106
    unsigned int v77;  // x14
    unsigned long long v78;  // 4130
    unsigned short v79;  // x9
    unsigned long v30;  // cc_dep1
    unsigned long long v31;  // x15
    unsigned long long v32;  // 4107
    unsigned long long v33;  // 4107
    char v0;  // [bp-0x141]
    unsigned int v1;  // [bp-0x130]
    unsigned int v2;  // [bp-0x128], Other Possible Types: unsigned long long
    unsigned int v3;  // [bp-0x120]
    st_bee140_0 v4;  // [bp-0x118], Other Possible Types: unsigned int
    unsigned long long v5;  // [bp-0x110]
    unsigned int v6;  // [bp-0x108]
    unsigned int v7;  // [bp-0x100]
    unsigned long v8;  // [bp-0xf8]
    st_bee140_1 *v9;  // [bp-0xf0]
    st_bee140_0 v10;  // [bp-0xe8]
    uint128_t v11;  // [bp-0xa0], Other Possible Types: unsigned long long
    unsigned long long v12;  // [bp-0x98]
    char *v13;  // [bp-0x90], Other Possible Types: unsigned long long
    unsigned long long v14;  // [bp-0x88]
    unsigned long v15;  // [bp-0x80]
    unsigned int v16;  // [bp-0x78]
    unsigned long long v17;  // [bp-0x70]
    unsigned short v18;  // [bp-0x68]
    unsigned int v19;  // [bp-0x66]
    uint128_t v20;  // [bp-0x60]
    unsigned long long v21;  // [bp-0x50]
    char *v22;  // [bp-0x10]
    char v23;  // [bp+0x0]

    v22 = &v23;
    v24 = (unsigned int)a2;
    v25 = 2;
    if (!(v24 & 0x7fffff))
        v26 = 2;
    else
        v26 = 3;
    v27 = 0xff & v24 >> 23;
    if (!(v24 & 0x7f800000))
        v28 = (v24 * 2 | v24 >> 31) & 0xfffffe & 0xffffff;
    else
        v28 = v24 & 0x7fffff | 0x800000;
    if (v24 & 0x7f800000)
        v26 = 4;
    if ((v24 & 0x7f800000) == 0x7f800000)
        v26 = !(v24 & 0x7fffff);
    if ((int)v26 <= 1)
    {
        v41 = v27;
        if (v26)
        {
            v25 = 3;
            v41 = v27;
        }
    }
    else if (v26 != 2)
    {
        v29 = (char)v28 & 1;
        v30 = v28 & 0xffffffff;
        if ((unsigned int)v28 == &g_800000)
        {
            v31 = 0x2000000;
            v32 = arm64g_calculate_condition(19, v30, &g_800000, 0);
            if (!(v32 & 1))
                goto LABEL_bee1ce;
LABEL_bee1cd:
            v34 = 1;
            v35 = arm64g_calculate_condition(3, v30, &g_800000, 0);
            if (!(v35 & 1))
                goto LABEL_bee1d6;
LABEL_bee1d5:
            v37 = 0xffffff68;
        }
        else
        {
            v31 = v28 * 2;
            v33 = arm64g_calculate_condition(19, v30, &g_800000, 0);
            if (v33 & 1)
                goto LABEL_bee1cd;
LABEL_bee1ce:
            v34 = 2;
            v36 = arm64g_calculate_condition(3, v30, &g_800000, 0);
            if (v36 & 1)
                goto LABEL_bee1d5;
LABEL_bee1d6:
            v37 = 0xffffff69;
        }
        v38 = v26;
        if (v26 == 3)
        {
            v28 = v28;
            v39 = arm64g_calculate_condition(19, v38, 3, 0);
            if (!(v39 & 1))
                goto LABEL_bee1ea;
LABEL_bee1e9:
            v41 = v34;
            v42 = arm64g_calculate_condition(3, v38, 3, 0);
            if (!(v42 & 1))
                goto LABEL_bee1ee;
LABEL_bee1ed:
            v26 = (unsigned int)v27 - 150;
            v44 = arm64g_calculate_condition(3, v38, 3, 0);
            if (!(v44 & 1))
                goto LABEL_bee1f2;
LABEL_bee1f1:
            v25 = v29 ^ 1;
        }
        else
        {
            v28 = v31;
            v40 = arm64g_calculate_condition(19, v38, 3, 0);
            if (v40 & 1)
                goto LABEL_bee1e9;
LABEL_bee1ea:
            v41 = 1;
            v43 = arm64g_calculate_condition(3, v38, 3, 0);
            if (v43 & 1)
                goto LABEL_bee1ed;
LABEL_bee1ee:
            v26 = v37 + (unsigned int)v27;
            v45 = arm64g_calculate_condition(3, v38, 3, 0);
            if (v45 & 1)
                goto LABEL_bee1f1;
LABEL_bee1f2:
            v25 = v29 ^ 1;
        }
    }
    else
    {
        v25 = 4;
        v41 = v27;
    }
    v15 = v28;
    v16 = 1;
    v17 = v41;
    v18 = v26;
    v19 = v25;
    if (v25 > 1)
    {
        v46 = v25 - 2;
        if (v46)
        {
            v47 = (unsigned int)"-fn() + : punycode{}.llvm.0[]::::{closure:#<>& *const ; (,_false{ {  } = 0x'..= | !nullstr()i8i16i32i64isizeu8u16u32u64usizef32f64!...";
            v48 = v24;
            v49 = arm64g_calculate_condition(67, v24, 0, 0);
            if (v49 & 1)
            {
                v50 = (unsigned int)"-fn() + : punycode{}.llvm.0[]::::{closure:#<>& *const ; (,_false{ {  } = 0x'..= | !nullstr()i8i16i32i64isizeu8u16u32u64usizef32f64!...";
                v51 = v24 >> 31;
                v52 = arm64g_calculate_condition(67, v48, 0, 0);
                if (!(v52 & 1))
                    goto LABEL_bee252;
LABEL_bee251:
            }
            else
            {
                v50 = (unsigned int)"+";
                v51 = v24 >> 31;
                v53 = arm64g_calculate_condition(67, v48, 0, 0);
                if (v53 & 1)
                    goto LABEL_bee251;
LABEL_bee252:
                v47 = 1;
            }
            v54 = a1;
            if (!a1)
            {
                v55 = v51;
                v56 = arm64g_calculate_condition(19, v54, 0, 0);
                if (!(v56 & 1))
                    goto LABEL_bee25e;
LABEL_bee25d:
            }
            else
            {
                v55 = 1;
                v57 = arm64g_calculate_condition(19, v54, 0, 0);
                if (v57 & 1)
                    goto LABEL_bee25d;
LABEL_bee25e:
                v50 = v47;
            }
            v1 = 2;
            if (v46 != 2)
                goto LABEL_bee3d4;
            v58 = "0e0assertion failed: buf.len() >= maxlen {\n,\n(\nassertion failed: other > 0assertion failed: noborrowassertion failed: digits < 400000000000000000000000000000000000000000000000000000000000000000[...]called `Option::unwrap()` on a `None` valuepanic in a destructor during cleanup==panic in a function that cannot unwind";
LABEL_bee3dc:
            v2 = v58;
            v3 = 3;
        }
        else
        {
            v55 = 0;
            v1 = 2;
            v2 = "NaN";
            v3 = 3;
            v50 = 1;
        }
        v11 = v50;
        v12 = v55;
        v13 = &v1;
        v14 = 1;
        sub_bed46c();
        return (unsigned long long)a2;
    }
    v50 = (unsigned int)"-fn() + : punycode{}.llvm.0[]::::{closure:#<>& *const ; (,_false{ {  } = 0x'..= | !nullstr()i8i16i32i64isizeu8u16u32u64usizef32f64!...";
    v59 = v24;
    v60 = arm64g_calculate_condition(67, v24, 0, 0);
    if (v60 & 1)
    {
        v61 = (unsigned int)"-fn() + : punycode{}.llvm.0[]::::{closure:#<>& *const ; (,_false{ {  } = 0x'..= | !nullstr()i8i16i32i64isizeu8u16u32u64usizef32f64!...";
        v62 = v24 >> 31;
        v63 = arm64g_calculate_condition(67, v59, 0, 0);
        if (!(v63 & 1))
            goto LABEL_bee2a2;
LABEL_bee2a1:
    }
    else
    {
        v61 = (unsigned int)"+";
        v62 = v24 >> 31;
        v64 = arm64g_calculate_condition(67, v59, 0, 0);
        if (v64 & 1)
            goto LABEL_bee2a1;
LABEL_bee2a2:
        v50 = 1;
    }
    v65 = a1;
    if (!a1)
    {
        v55 = v62;
        v66 = arm64g_calculate_condition(19, v65, 0, 0);
        if (!(v66 & 1))
            goto LABEL_bee2ae;
LABEL_bee2ad:
        v50 = v61;
    }
    else
    {
        v55 = 1;
        v67 = arm64g_calculate_condition(19, v65, 0, 0);
        if (v67 & 1)
            goto LABEL_bee2ad;
LABEL_bee2ae:
    }
    sub_bec090();
    if ((unsigned long long)v11)
    {
        a2 = v11;
        v20 = a2;
        v21 = v13;
        v68 = *(unsigned long long *)((void*)&v20 + 8);
        if (!v68)
            goto LABEL_bee3bc;
LABEL_bee2e0:
        v69 = v20;
        if ((char)*(char *)v69 > 48)
        {
            v70 = (short)v21;
            v1 = 2;
            v2 = v69;
            v3 = 1;
            if (v68 == 1)
            {
                v71 = &v4;
                v72 = 3;
            }
            else
            {
                v71 = &v10;
                v4 = 2;
                v5 = ".{size limit reached}`fmt::Error` from `SizeLimitedFmtAdapter` was discardedSizeLimitExhaustedParseIntErrorEmptyInvalidDigitPosOverflowNegOverflow00010203040506070809101112131415161718192021222324252627282930313233343536373839404142434445464748495051525354555657585960616263646566676869707172737475767778798081828384858687888990919293949596979899";
                v6 = 1;
                v7 = 2;
                v8 = v2 + 1;
                v9 = v68 - 1;
                v72 = 5;
            }
            v73 = v70;
            if ((int)v70 < 1)
            {
                v74 = &g_e08112;
                v75 = arm64g_calculate_condition(163, v73, 1, 0);
                if (!(v75 & 1))
                    goto LABEL_bee362;
LABEL_bee361:
                v77 = 1;
            }
            else
            {
                v74 = "e";
                v76 = arm64g_calculate_condition(163, v73, 1, 0);
                if (v76 & 1)
                    goto LABEL_bee361;
LABEL_bee362:
                v77 = 2;
            }
            *(unsigned short *)&v71->padding_0[0] = 2;
            v71->field_8 = v74;
            *(unsigned long long *)&v71->field_10 = v77;
            v78 = arm64g_calculate_condition(83, v73, 1, 0);
            if (v78 & 1)
                v79 = v70 - 1;
            else
                v79 = 1 - v70;
            *(unsigned short *)&v71->padding_14[4] = 1;
            v71->field_1a = v79;
            v11 = v50;
            v12 = v55;
            v13 = &v1;
            v14 = v72;
            sub_bed46c();
            return (unsigned long long)a2;
        }
        sub_c73c80("assertion failed: buf[0] > b'0'", 31, &g_efa878);
    }
    else
    {
        sub_bec5f0(&v20, &v15, &v0);
        v68 = *(unsigned long long *)((void*)&v20 + 8);
        if (v68)
            goto LABEL_bee2e0;
LABEL_bee3bc:
        sub_c73c80("assertion failed: !buf.is_empty()", 33, &g_efa860);
    }
LABEL_bee3d4:
    v58 = "inf0.";
    goto LABEL_bee3dc;
}
