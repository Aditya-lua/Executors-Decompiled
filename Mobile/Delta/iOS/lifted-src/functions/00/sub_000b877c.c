/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb877c..0xb94b0 (3380 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b877c_2 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[8];
    unsigned int field_18;
    char padding_1c[16];
    unsigned int field_2c;
    char padding_30[96];
    char field_90;
    char padding_91[31];
    unsigned long long field_b0;
    unsigned long long field_b8;
    char padding_c0[80];
    unsigned long long field_110;
    unsigned int field_114;
    char padding_118[8];
    struct st_b877c_1 *field_120;
} st_b877c_2;

typedef struct st_b877c_1 {
    struct st_b877c_1 *field_0;
    char padding_8[8];
    uint128_t field_10;
    unsigned long long field_20;
} st_b877c_1;

typedef struct st_b877c_0 {
    char field_0;
} st_b877c_0;

extern char g_10002b0;

long long sub_b877c(st_b877c_2 *a0, unsigned long long a1, unsigned long long a2, long long a3, long long a4, unsigned long a5)
{
    unsigned int v32;  // w8
    unsigned long long v33;  // x8
    st_b877c_1 *v34;  // x8
    long long v35;  // x21
    unsigned long long v36;  // x9
    unsigned long long v37;  // x8
    unsigned long long v38;  // x11
    unsigned long v39;  // x10
    unsigned long long v0;  // [bp-0x1e0]
    unsigned long v1;  // [bp-0x1d8]
    unsigned long long v2;  // [bp-0x1d0]
    unsigned long v3;  // [bp-0x1c8]
    unsigned long long v4;  // [bp-0x1c0]
    unsigned long long v5;  // [bp-0x1b8]
    st_b877c_1 *v6;  // [bp-0x1ac]
    unsigned long long v7;  // [bp-0x1a8]
    unsigned int v8;  // [bp-0x1a0]
    unsigned long long *v9;  // [bp-0x198]
    long long v10;  // [bp-0x188]
    long long v11;  // [bp-0x180]
    long long v12;  // [bp-0x178]
    long long v13;  // [bp-0x170]
    unsigned long long v14;  // [bp-0x160]
    unsigned long long v15;  // [bp-0x150]
    unsigned long v16;  // [bp-0x148]
    unsigned long v17;  // [bp-0x108]
    unsigned long v18;  // [bp-0x100]
    st_b877c_0 **v19;  // [bp-0xf8], Other Possible Types: char
    st_b877c_0 *v20;  // [bp-0xf0]
    st_b877c_1 *v21;  // [bp-0xe0]
    st_b877c_1 *v22;  // [bp-0xd0], Other Possible Types: uint128_t
    st_b877c_1 *v23;  // [bp-0xc0], Other Possible Types: unsigned long
    st_b877c_1 *v24;  // [bp-0xb8]
    st_b877c_1 *v25;  // [bp-0xb4]
    unsigned int v26;  // [bp-0x9c]
    st_b877c_1 *v27;  // [bp-0x80]
    st_b877c_1 *v28;  // [bp-0x78]
    unsigned long v29;  // [bp-0x70]
    char *v30;  // [bp-0x10]
    char v31;  // [bp+0x0]

    v30 = &v31;
    v14 = a1;
    v29 = *(long long *)&g_10002b0;
    v20 = &v19;
    v19 = &v20;
    v11 = a3 + a4;
    v12 = v11 - 8;
    v9 = sub_bc5c4();
    v32 = *(int *)((char *)&a0->field_110 + 4);
    if ((unsigned int)*(int *)((char *)&a0->field_110 + 4) >= 0xfff)
        v32 = 0xfff;
    v8 = v32;
    if ((int)a0->field_110 == 3)
        v33 = 3;
    else
        v33 = 4;
    v15 = v33;
    v26 = a0->field_2c;
    v17 = a0->field_b8;
    v16 = a0->field_b0;
    v27 = 0;
    v28 = (st_b877c_1 *)0;
    v34 = *(long long *)&a0->padding_118[4];
    if (v34)
    {
        v21 = (st_b877c_1 *)*(int128_t *)&v34->field_0;
        v22 = v34->field_10;
        v23 = v34->field_20;
    }
    else
    {
        v23 = 0;
        v21 = (st_b877c_1 *)0;
        v22 = (st_b877c_1 *)0;
    }
    v25 = 0;
    v24 = (st_b877c_1 *)0;
    sub_b9e50(&v21, 0, a4);
    v35 = a3;
    sub_ba948(&a0->field_90, v35, a4, 0);
    if (a0->field_8 + a0->field_18 == v35)
        v35 += 1;
    if ((unsigned long long)v12 > (unsigned long long)v35)
    {
        v6 = (st_b877c_1 *)0;
        v13 = v11 - 32;
        v36 = v15;
        v37 = v36 - 1;
        v4 = v37;
        v5 = v37 & 0xfffffffffffffffe;
        v38 = v37 | 1;
        v39 = v17;
        v2 = v38;
        v3 = v39 + 36;
        v1 = v39 + 28 * v38 + 12;
        v0 = v36 - v38;
        v18 = v39 + 40;
        v7 = a2;
        v10 = a3;
        v9();
    }
    if (*(long long *)&g_10002b0 == v29)
        return v11 - a3;
    ___stack_chk_fail();
}
