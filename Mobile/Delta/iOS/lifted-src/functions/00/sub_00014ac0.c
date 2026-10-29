/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x14ac0..0x14f1c (1116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_14ac0_5 {
    unsigned long long field_0;
    long long field_8;
} st_14ac0_5;

typedef struct st_14ac0_6 {
    char padding_0[12];
    unsigned long long field_c;
} st_14ac0_6;

typedef struct st_14ac0_4 {
    unsigned long long field_0;
    void* field_8;
    char padding_10[392];
    unsigned long long field_198;
    long long field_1a0;
} st_14ac0_4;

typedef struct st_14ac0_3 {
    unsigned long long field_0;
    unsigned long long field_8;
    char padding_10[8];
    unsigned long long field_18;
    void* field_20;
    char padding_28[392];
    unsigned long long field_1b0;
    unsigned long long field_1b8;
} st_14ac0_3;

typedef struct st_14ac0_2 {
    char padding_0[128];
    unsigned int field_80;
    char field_84;
    char padding_85[27];
    long long field_a0;
    char padding_a8[48];
    long long field_d8;
    char padding_e0[432];
    unsigned long long field_290;
    long long field_298;
    char padding_2a0[8];
    unsigned long long field_2a8;
    void* field_2b0;
    char padding_2b8[392];
    unsigned long long field_440;
    long long field_448;
} st_14ac0_2;

typedef struct st_14ac0_0 {
    char field_0;
} st_14ac0_0;

typedef struct st_14ac0_7 {
    st_14ac0_0 field_0;
} st_14ac0_7;

extern char g_f0ca10;
extern char g_10002b0;

long long sub_14ac0(st_14ac0_2 *a0, st_14ac0_6 *a1)
{
    st_14ac0_6 *v24;  // x0
    st_14ac0_7 **v25;  // x21
    st_14ac0_7 **v26;  // x0
    long long v27;  // x21
    unsigned long v28;  // x0
    long long v29;  // x0
    long long v30;  // x0
    long long v31;  // x0
    long long v32;  // x0
    long long v33;  // x0
    st_14ac0_0 **v0;  // [bp-0x110], Other Possible Types: char
    st_14ac0_0 *v1;  // [bp-0x108]
    unsigned long v2;  // [bp-0x100]
    st_14ac0_4 **v3;  // [bp-0xf8]
    unsigned long v4;  // [bp-0xf0]
    st_14ac0_3 **v5;  // [bp-0xe8]
    st_14ac0_7 **v6;  // [bp-0xe0], Other Possible Types: unsigned long
    unsigned long v7;  // [bp-0xd8]
    st_14ac0_4 *v8;  // [bp-0xd0], Other Possible Types: char *, unsigned long
    char *v9;  // [bp-0xc8], Other Possible Types: long long
    unsigned long long v10;  // [bp-0xc0]
    st_14ac0_3 *v11;  // [bp-0xb8], Other Possible Types: unsigned long
    st_14ac0_6 **v12;  // [bp-0xb0], Other Possible Types: long long
    unsigned long long iter;  // [bp-0xa8]
    st_14ac0_6 *v14;  // [bp-0xa0]
    st_14ac0_5 *v15;  // [bp-0x98], Other Possible Types: st_14ac0_7 **, char
    long long v16;  // [bp-0x90]
    unsigned long long v17;  // [bp-0x88]
    st_14ac0_5 *v18;  // [bp-0x80], Other Possible Types: st_14ac0_6 *
    long long v19;  // [bp-0x78]
    unsigned long long v20;  // [bp-0x70]
    unsigned long v21;  // [bp-0x68]
    char *v22;  // [bp-0x10]
    char v23;  // [bp+0x0]

    v22 = &v23;
    v21 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v14 = a1;
    if (!(sub_ecd4() & 1))
    {
        if (g_f0ca10 == 1)
        {
            v24 = sub_1af8c(a0, a1);
        }
        else
        {
            v18 = a1;
            v11 = sub_19088(a0, &v18, 1);
            v12 = &v18;
            v24 = sub_11094(a0, (a1->padding_0)[1], &v11, "Assigned expression must be a variable or a field");
        }
        v14 = v24;
    }
    v11 = &a0->field_290;
    v12 = (long long)(a0->field_298 - a0->field_290) >> 3;
    iter = 0;
    v18 = &a0->field_440;
    v19 = (long long)(a0->field_448 - a0->field_440) >> 3;
    v20 = 0;
    v8 = &v15;
    v15 = &v8;
    sub_103a8(v11, &v14);
    iter += 1;
    if (a0->field_80 == 44)
    {
        do
        {
            if (a0->padding_0[88] == 1)
            {
                v8 = &v15;
                v15 = &v8;
                sub_f2b8(v18, &a0->field_84);
                v20 += 1;
            }
            sub_f8d0(a0);
            v6 = sub_efe0(a0, 1);
            if (!(sub_ecd4(a0, v6) & 1))
            {
                v25 = v6;
                if (g_f0ca10 == 1)
                {
                    v26 = sub_1af8c(a0, v25);
                }
                else
                {
                    v15 = v25;
                    v8 = sub_19088(a0, &v15, 1);
                    v9 = &v15;
                    v26 = sub_11094(a0, (char *)&v25[1] + 4, &v8, "Assigned expression must be a variable or a field");
                }
                v6 = v26;
            }
            v8 = &v15;
            v15 = &v8;
            sub_103a8(v11, &v6);
            iter += 1;
        } while (a0->field_80 == 44);
    }
    if (sub_1f3d4(a0, 61, "assignment"))
        v27 = a0->field_a0;
    else
        v27 = -0x1;
    v8 = &a0->field_2a8;
    v9 = a0->field_2b0 - a0->field_2a8 >> 3;
    v10 = 0;
    v15 = v18;
    v16 = (long long)(a0->field_448 - a0->field_440) >> 3;
    v17 = 0;
    sub_ff50();
    v6 = *(long long *)&(v14->padding_0)[1];
    v7 = *(long long *)(*(long long *)((char *)v8->field_8 - 8) + 20);
    v4 = sub_ef54(a0, &v11);
    v5 = &v11;
    v2 = sub_ef54(a0, &v8);
    v3 = &v8;
    v28 = sub_404c(a0->field_d8, 64);
    sub_4e94(v28, &v6, &v4, &v2);
    if (a0->padding_0[88] == 1)
    {
        v29 = sub_ef54(a0, &v18);
        v30 = sub_ef54(a0, &v15);
        v31 = sub_404c(a0->field_d8, 48);
        sub_8530(v31, v29, &v18, v27, v30, &v15);
        v6 = v28;
        sub_1c9f0(&a0[1].padding_0[80], &v6);
        *(long long *)(sub_12484(&a0[1].padding_0[80], &v6) + 8) = v31;
    }
    sub_dd88(v15, v15->field_0 + v16 * 8, v15->field_8);
    sub_dd88(v8, v8->field_0 + v9 * 8, v8->field_8);
    sub_dd88(v18, v18->field_0 + v19 * 8, v18->field_8);
    sub_dd88(v11, v11->field_0 + v12 * 8, v11->field_8);
    if (*(long long *)&g_10002b0 == v21)
        return v28;
    v32 = ___stack_chk_fail();
    sub_2128c(&v15);
    sub_1e73c(&v8);
    sub_2128c(&v18);
    sub_1e73c(&v11);
    v33 = __Unwind_Resume(v32);
    sub_2128c(&v18);
    sub_1e73c(&v11);
    __Unwind_Resume(v33);
}
