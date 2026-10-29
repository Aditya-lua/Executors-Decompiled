/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbeee6c..0xbef158 (748 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_beee6c_1 {
    char padding_0[1];
    char field_1;
} st_beee6c_1;

typedef struct st_beee6c_0 {
    char padding_0[8];
    unsigned long long field_8;
    unsigned int field_10;
    char padding_14[6];
    unsigned short field_1a;
} st_beee6c_0;

extern unsigned long long g_e08112;
extern long long g_efa860;
extern long long g_efa878;

double sub_beee6c(unsigned long a0, unsigned int a1, double a2)
{
    unsigned long v24;  // x8
    unsigned int v25;  // w9
    unsigned long long v34;  // 4107
    unsigned long long v35;  // 4110
    unsigned long long v36;  // 4110
    unsigned long long v37;  // x13
    unsigned int v38;  // x9
    unsigned int v39;  // x11
    unsigned long v40;  // cc_dep1
    unsigned long long v41;  // 4115
    unsigned int v42;  // x10
    unsigned long long v43;  // x8
    unsigned int v26;  // x10
    unsigned long long v44;  // 4107
    unsigned long long v45;  // 4107
    unsigned long v46;  // cc_dep1
    unsigned int v47;  // x20
    unsigned long long v48;  // 4105
    unsigned long long v49;  // 4105
    unsigned long long v50;  // x8
    unsigned int v51;  // x10
    unsigned long v52;  // cc_dep1
    unsigned long long v53;  // 4119
    unsigned int v27;  // w14
    unsigned long long v54;  // x8
    unsigned long long v55;  // 4107
    unsigned long long v56;  // 4107
    unsigned long v57;  // cc_dep1
    unsigned long long v58;  // 4105
    unsigned long long v59;  // 4105
    unsigned int v60;  // x12
    unsigned int v61;  // x8
    unsigned int v62;  // w9
    st_beee6c_0 *v63;  // x12
    unsigned long long v28;  // x12
    unsigned int v64;  // x8
    unsigned long v65;  // cc_dep1
    unsigned long long v66;  // x13
    unsigned long long v67;  // 4106
    unsigned long long v68;  // 4106
    unsigned int v69;  // x14
    unsigned long long v70;  // 4130
    unsigned short v71;  // x9
    unsigned long long v29;  // x9
    unsigned int v30;  // x11
    char v31;  // x10
    unsigned long v32;  // cc_dep1
    unsigned long long v33;  // 4107
    char v0;  // [bp-0x141]
    unsigned int v1;  // [bp-0x130]
    unsigned int v2;  // [bp-0x128], Other Possible Types: unsigned long long
    unsigned int v3;  // [bp-0x120]
    st_beee6c_0 v4;  // [bp-0x118], Other Possible Types: unsigned int
    unsigned long long v5;  // [bp-0x110]
    unsigned int v6;  // [bp-0x108]
    unsigned int v7;  // [bp-0x100]
    unsigned long v8;  // [bp-0xf8]
    st_beee6c_1 *v9;  // [bp-0xf0]
    st_beee6c_0 v10;  // [bp-0xe8]
    uint128_t v11;  // [bp-0xa0], Other Possible Types: unsigned long long
    unsigned long long v12;  // [bp-0x98]
    char *v13;  // [bp-0x90], Other Possible Types: unsigned long long
    unsigned long long v14;  // [bp-0x88]
    unsigned long v15;  // [bp-0x80]
    unsigned int v16;  // [bp-0x78]
    unsigned int v17;  // [bp-0x70]
    unsigned short v18;  // [bp-0x68]
    unsigned int v19;  // [bp-0x66]
    uint128_t v20;  // [bp-0x60]
    unsigned long long v21;  // [bp-0x50]
    char *v22;  // [bp-0x10]
    char v23;  // [bp+0x0]

    v22 = &v23;
    v24 = (unsigned long long)a2;
    v25 = v24 >> 52;
    v26 = 2;
    if (!(v24 & 0xfffffffffffff))
        v27 = 2;
    else
        v27 = 3;
    v28 = v25 & 0x7ff;
    v29 = (v24 * 2 | v24 >> 63) & 0x1ffffffffffffe & 0x1fffffffffffff;
    if (v25 & 0x7ff)
        v29 = v24 & 0xfffffffffffff | 0x10000000000000;
    if (v24 & 0x7ff0000000000000)
        v27 = 4;
    if ((v24 & 0x7ff0000000000000) == 0x7ff0000000000000)
        v30 = !(v24 & 0xfffffffffffff);
    else
        v30 = v27;
    if ((int)v30 > 1)
    {
        if (v30 != 2)
        {
            v31 = (char)v29 & 1;
            if (v30 == 3)
            {
                v28 = (unsigned int)v28 - 1075;
                v26 = v31 ^ 1;
                v30 = 1;
            }
            else
            {
                v32 = v29;
                if (v29 == 0x10000000000000)
                {
                    v29 = 0x40000000000000;
                    v33 = arm64g_calculate_condition(20, v32, 0x10000000000000, 0);
                    if (!(v33 & 1))
                        goto LABEL_beef22;
LABEL_beef21:
                    v30 = 1;
                    v35 = arm64g_calculate_condition(4, v32, 0x10000000000000, 0);
                    if (!(v35 & 1))
                        goto LABEL_beef2a;
LABEL_beef29:
                    v37 = 0xfffffbcb;
                }
                else
                {
                    v29 *= 2;
                    v34 = arm64g_calculate_condition(20, v32, 0x10000000000000, 0);
                    if (v34 & 1)
                        goto LABEL_beef21;
LABEL_beef22:
                    v30 = 2;
                    v36 = arm64g_calculate_condition(4, v32, 0x10000000000000, 0);
                    if (v36 & 1)
                        goto LABEL_beef29;
LABEL_beef2a:
                    v37 = 0xfffffbcc;
                }
                v28 += v37;
                v26 = v31 ^ 1;
            }
        }
        else
        {
            v26 = 4;
LABEL_beef04:
        }
    }
    else
    {
        if (v30)
        {
            v26 = 3;
            goto LABEL_beef04;
        }
    }
    v15 = v29;
    v16 = 1;
    v17 = v30;
    v18 = v28;
    v19 = v26;
    if (v26 > 1)
    {
        v38 = v26 - 2;
        if (v38)
        {
            v39 = (unsigned int)"-fn() + : punycode{}.llvm.0[]::::{closure:#<>& *const ; (,_false{ {  } = 0x'..= | !nullstr()i8i16i32i64isizeu8u16u32u64usizef32f64!...";
            v40 = v24;
            v41 = arm64g_calculate_condition(0x44, v24, 0, 0);
            if (v41 & 1)
            {
                v42 = (unsigned int)"-fn() + : punycode{}.llvm.0[]::::{closure:#<>& *const ; (,_false{ {  } = 0x'..= | !nullstr()i8i16i32i64isizeu8u16u32u64usizef32f64!...";
                v43 = v24 >> 63;
                v44 = arm64g_calculate_condition(0x44, v40, 0, 0);
                if (!(v44 & 1))
                    goto LABEL_beef7e;
LABEL_beef7d:
            }
            else
            {
                v42 = (unsigned int)"+";
                v43 = v24 >> 63;
                v45 = arm64g_calculate_condition(0x44, v40, 0, 0);
                if (v45 & 1)
                    goto LABEL_beef7d;
LABEL_beef7e:
                v39 = 1;
            }
            v46 = a1;
            if (!a1)
            {
                v47 = v43;
                v48 = arm64g_calculate_condition(19, v46, 0, 0);
                if (!(v48 & 1))
                    goto LABEL_beef8a;
LABEL_beef89:
                v39 = v42;
            }
            else
            {
                v47 = 1;
                v49 = arm64g_calculate_condition(19, v46, 0, 0);
                if (v49 & 1)
                    goto LABEL_beef89;
LABEL_beef8a:
            }
            v1 = 2;
            if (v38 != 2)
                goto LABEL_bef100;
            v50 = "0e0assertion failed: buf.len() >= maxlen {\n,\n(\nassertion failed: other > 0assertion failed: noborrowassertion failed: digits < 400000000000000000000000000000000000000000000000000000000000000000[...]called `Option::unwrap()` on a `None` valuepanic in a destructor during cleanup==panic in a function that cannot unwind";
LABEL_bef108:
            v2 = v50;
            v3 = 3;
        }
        else
        {
            v47 = 0;
            v1 = 2;
            v2 = "NaN";
            v3 = 3;
            v39 = 1;
        }
        v11 = v39;
        v12 = v47;
        v13 = &v1;
        v14 = 1;
        sub_bed46c();
        return (unsigned long long)a2;
    }
    v51 = (unsigned int)"-fn() + : punycode{}.llvm.0[]::::{closure:#<>& *const ; (,_false{ {  } = 0x'..= | !nullstr()i8i16i32i64isizeu8u16u32u64usizef32f64!...";
    v52 = v24;
    v53 = arm64g_calculate_condition(0x44, v24, 0, 0);
    if (v53 & 1)
    {
        v39 = (unsigned int)"-fn() + : punycode{}.llvm.0[]::::{closure:#<>& *const ; (,_false{ {  } = 0x'..= | !nullstr()i8i16i32i64isizeu8u16u32u64usizef32f64!...";
        v54 = v24 >> 63;
        v55 = arm64g_calculate_condition(0x44, v52, 0, 0);
        if (!(v55 & 1))
            goto LABEL_beefce;
LABEL_beefcd:
    }
    else
    {
        v39 = (unsigned int)"+";
        v54 = v24 >> 63;
        v56 = arm64g_calculate_condition(0x44, v52, 0, 0);
        if (v56 & 1)
            goto LABEL_beefcd;
LABEL_beefce:
        v51 = 1;
    }
    v57 = a1;
    if (!a1)
    {
        v47 = v54;
        v58 = arm64g_calculate_condition(19, v57, 0, 0);
        if (!(v58 & 1))
            goto LABEL_beefda;
LABEL_beefd9:
    }
    else
    {
        v47 = 1;
        v59 = arm64g_calculate_condition(19, v57, 0, 0);
        if (v59 & 1)
            goto LABEL_beefd9;
LABEL_beefda:
        v39 = v51;
    }
    sub_bec090();
    if ((unsigned long long)v11)
    {
        a2 = v11;
        v20 = a2;
        v21 = v13;
        v60 = *(unsigned long long *)((void*)&v20 + 8);
        if (!v60)
            goto LABEL_bef0e8;
LABEL_bef00c:
        v61 = v20;
        if ((char)*(char *)v61 > 48)
        {
            v62 = (short)v21;
            v1 = 2;
            v2 = v61;
            v3 = 1;
            if (v60 == 1)
            {
                v63 = &v4;
                v64 = 3;
            }
            else
            {
                v63 = &v10;
                v4 = 2;
                v5 = ".{size limit reached}`fmt::Error` from `SizeLimitedFmtAdapter` was discardedSizeLimitExhaustedParseIntErrorEmptyInvalidDigitPosOverflowNegOverflow00010203040506070809101112131415161718192021222324252627282930313233343536373839404142434445464748495051525354555657585960616263646566676869707172737475767778798081828384858687888990919293949596979899";
                v6 = 1;
                v7 = 2;
                v8 = v2 + 1;
                v9 = v60 - 1;
                v64 = 5;
            }
            v65 = v62;
            if ((int)v62 < 1)
            {
                v66 = &g_e08112;
                v67 = arm64g_calculate_condition(163, v65, 1, 0);
                if (!(v67 & 1))
                    goto LABEL_bef08e;
LABEL_bef08d:
                v69 = 1;
            }
            else
            {
                v66 = "e";
                v68 = arm64g_calculate_condition(163, v65, 1, 0);
                if (v68 & 1)
                    goto LABEL_bef08d;
LABEL_bef08e:
                v69 = 2;
            }
            *(unsigned short *)&v63->padding_0[0] = 2;
            v63->field_8 = v66;
            *(unsigned long long *)&v63->field_10 = v69;
            v70 = arm64g_calculate_condition(83, v65, 1, 0);
            if (v70 & 1)
                v71 = v62 - 1;
            else
                v71 = 1 - v62;
            *(unsigned short *)&v63->padding_14[4] = 1;
            v63->field_1a = v71;
            v11 = v39;
            v12 = v47;
            v13 = &v1;
            v14 = v64;
            sub_bed46c();
            return (unsigned long long)a2;
        }
        sub_c73c80("assertion failed: buf[0] > b'0'", 31, &g_efa878);
    }
    else
    {
        sub_bec5f0(&v20, &v15, &v0);
        v60 = *(unsigned long long *)((void*)&v20 + 8);
        if (v60)
            goto LABEL_bef00c;
LABEL_bef0e8:
        sub_c73c80("assertion failed: !buf.is_empty()", 33, &g_efa860);
    }
LABEL_bef100:
    v50 = "inf0.";
    goto LABEL_bef108;
}
