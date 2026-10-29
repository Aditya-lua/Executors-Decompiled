/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x40304..0x40644 (832 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_40304_3 {
    char padding_0[1532];
    unsigned int field_5fc;
} st_40304_3;

typedef struct st_40304_2 {
    long long field_0;
    char padding_8[616];
    char field_270;
    char padding_271[907];
    unsigned int field_5fc;
} st_40304_2;

typedef struct st_40304_1 {
    char padding_0[8];
    unsigned int field_8;
    char field_c;
    char padding_d[19];
    struct st_40304_1 *field_20;
    long long field_28;
} st_40304_1;

typedef struct st_40304_0 {
    char field_0;
} st_40304_0;

extern unsigned int g_f00b50;
extern unsigned int g_f00b80;
extern char g_f0ca50;

unsigned long long sub_40304(st_40304_2 *a0, st_40304_1 *a1, unsigned long long a2, unsigned long long a3)
{
    unsigned long long v6;  // x21
    st_40304_1 *v7;  // x20
    unsigned long v12;  // cc_op
    unsigned long v13;  // cc_dep1
    unsigned long v14;  // cc_dep2
    unsigned long v15;  // cc_ndep
    unsigned long long v16;  // 4112
    unsigned long long v17;  // 4102
    st_40304_1 *v8;  // x25
    unsigned long long v18;  // x27
    st_40304_1 *v19;  // x25
    st_40304_1 *v20;  // x23
    unsigned int v9;  // w8
    long long len;  // x0
    unsigned long long v22;  // x23
    long long len1;  // x0
    unsigned long long v24;  // x0
    unsigned long long v25;  // x24
    long long len2;  // x0
    unsigned int v27;  // w0
    unsigned int v28;  // w2
    unsigned long long v29;  // 4112
    unsigned long long v30;  // 4105
    unsigned long long v31;  // w8
    unsigned long long v36;  // 4112
    unsigned long long v37;  // 4105
    unsigned long long v38;  // x0
    unsigned long long v39;  // x1
    long long v40;  // x23
    unsigned int v41;  // w0
    long long v42;  // x0
    long long v43;  // x0
    long long v44;  // x0
    unsigned long long v45;  // x0
    long long v46;  // x24
    long long v47;  // x25
    unsigned long long v48;  // x0
    char v49;  // x0
    unsigned long long v50;  // x0
    unsigned long long v10;  // 4112
    unsigned long long v11;  // 4102
    st_40304_0 **v0;  // [bp-0x80], Other Possible Types: char
    st_40304_0 *v1;  // [bp-0x78]
    st_40304_2 *v2;  // [bp-0x70], Other Possible Types: st_40304_3 *
    unsigned int v3;  // [bp-0x68]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = a2;
    v7 = a1;
    v1 = &v0;
    v0 = &v1;
    sub_395b0();
    v8 = v7->field_20;
    v9 = v8->field_8;
    if (v8)
    {
        v10 = arm64g_calculate_condition(v12 | 16, v13, v14, v15);
        v11 = arm64g_calculate_condition(3, (v10 & 1 ? v9 : 0), (v10 & 1 ? g_f00b80 : 0), 0);
        if (v11 & 1)
            goto LABEL_40384;
LABEL_40368:
        if (v9 == g_f00b50)
        {
            v18 = 0;
            v19 = v7;
            v20 = v8;
            goto LABEL_4039c;
        }
    }
    else
    {
        v16 = arm64g_calculate_condition(v12 | 16, v13, v14, v15);
        v17 = arm64g_calculate_condition(0, (v16 & 1 ? v9 : 0), (v16 & 1 ? g_f00b80 : 0), 0);
        if (!(v17 & 1))
            goto LABEL_40368;
LABEL_40384:
        v20 = v8->field_20;
        v18 = v7;
        v19 = v8;
        if (v19->field_20->field_8 == g_f00b50)
        {
LABEL_4039c:
            if (sub_3c230(a0, v20) && (g_f0ca50 != 1 || !sub_10160(&a0->field_270, &v20->field_20)))
            {
                len = _strlen(v20->field_20);
                v22 = sub_2df40(a0->field_0, v20->field_20, len);
                len1 = _strlen(v19->field_28);
                v24 = sub_2df40(a0->field_0, v19->field_28, len1);
                v25 = v24;
                if (v18)
                {
                    len2 = _strlen(*(long long *)(v18 + 40));
                    v27 = sub_2df40(a0->field_0, *(long long *)(v18 + 40), len2);
                    v28 = v27;
                    v29 = arm64g_calculate_condition(v12 | 16, v13, v14, v15);
                    v30 = arm64g_calculate_condition(163, (v29 & 1 ? v28 : 0), 0, 0);
                    v31 = (unsigned int)!(v30 & 1);
                    if (!(v22 >> 31 & 1))
                        goto LABEL_40468;
LABEL_40604:
                    v42 = sub_45808(&v7->field_c, "Exceeded constant limit; simplify the code to compile");
                    v2->field_5fc = v3;
                    v43 = __Unwind_Resume(v42, "Exceeded constant limit; simplify the code to compile");
                    v2->field_5fc = v3;
                    v44 = __Unwind_Resume(v43);
                    v2->field_5fc = v3;
                    __Unwind_Resume(v44);
                }
                else
                {
                    v28 = 0xffffffff;
                    v36 = arm64g_calculate_condition(v12 | 16, v13, v14, v15);
                    v37 = arm64g_calculate_condition(160, (v36 & 1 ? 0xffffffff : 0), 0, 0);
                    v31 = (unsigned int)!(v37 & 1);
                    if (v22 >> 31 & 1)
                        goto LABEL_40604;
LABEL_40468:
                    if (v25 >> 31 & 1 || v31)
                        goto LABEL_40604;
                    if (0x3ff >= (unsigned int)v22 && 0x3ff >= (unsigned int)v25 && 0x3ff >= (int)v28)
                    {
                        v38 = v22;
                        v39 = v25;
                        if (v18)
                        {
                            v40 = sub_2ad6c(v38, v39);
                            v41 = sub_2dbc0(a0->field_0, v40);
                            if (v41 <= 0x7fff)
                            {
                                sub_2fdb0(a0->field_0, 12, v6, (short)v41);
                                return sub_31514(a0->field_0, v40);
                            }
                        }
                        else
                        {
                            v40 = sub_2a0dc(v38, v39);
                            v41 = sub_2dbc0(a0->field_0, v40);
                            if (v41 <= 0x7fff)
                            {
                                sub_2fdb0(a0->field_0, 12, v6, (short)v41);
                                return sub_31514(a0->field_0, v40);
                            }
                        }
                    }
                }
            }
        }
    }
    v2 = a0;
    v3 = a0->field_5fc;
    v45 = sub_42480(a0, v7->field_20);
    if (v45 >> 31 & 1)
    {
        if (a3)
        {
            sub_47e48(a0);
            v45 = v6;
        }
        else
        {
            v45 = sub_385b8(a0);
        }
    }
    sub_38fe4(a0, v7 + 1);
    v46 = v7->field_28;
    v47 = _strlen(v46);
    v48 = sub_2df40(a0->field_0, v46, v47);
    if (!(v48 >> 31 & 1))
    {
        v49 = sub_2ffe8(v46, v47);
        sub_2ad10(a0->field_0, 15, v6, (unsigned int)v45 & 0xff, v49);
        sub_31514(a0->field_0, v48);
        v50 = sub_46e8c(a0, v7->field_20, (unsigned int)v45 & 0xff, 4, 2);
        v2->field_5fc = v3;
        return v50;
    }
    sub_45808(&v7->field_c, "Exceeded constant limit; simplify the code to compile");
    __debugbreak();
}
