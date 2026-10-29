/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5b68..0xb6a4c (3812 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b5b68_2 {
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
    struct st_b5b68_1 *field_120;
} st_b5b68_2;

typedef struct st_b5b68_1 {
    struct st_b5b68_1 *field_0;
    char padding_8[8];
    uint128_t field_10;
    unsigned long long field_20;
} st_b5b68_1;

typedef struct st_b5b68_0 {
    char field_0;
} st_b5b68_0;

extern char g_10002b0;

long long sub_b5b68(st_b5b68_2 *a0, unsigned long long a1, unsigned long long a2, long long a3, long long a4, unsigned long a5)
{
    unsigned int v34;  // w8
    unsigned long long v35;  // x8
    unsigned long v36;  // x26
    st_b5b68_1 *v37;  // x8
    long long v38;  // x21
    unsigned long long v39;  // x9
    unsigned long long v40;  // x8
    unsigned long long v41;  // x10
    unsigned long long v0;  // [bp-0x1e8]
    unsigned long v1;  // [bp-0x1e0]
    unsigned long long v2;  // [bp-0x1d8]
    unsigned long v3;  // [bp-0x1d0]
    unsigned long long v4;  // [bp-0x1c8]
    unsigned long long v5;  // [bp-0x1c0]
    st_b5b68_1 *v6;  // [bp-0x1b4]
    unsigned long long v7;  // [bp-0x1b0]
    unsigned int v8;  // [bp-0x1a4]
    long long v9;  // [bp-0x1a0]
    unsigned long long *v10;  // [bp-0x198]
    long long v11;  // [bp-0x188]
    long long v12;  // [bp-0x180]
    long long v13;  // [bp-0x178]
    unsigned long long v14;  // [bp-0x170]
    long long v15;  // [bp-0x168]
    st_b5b68_2 *v16;  // [bp-0x160]
    unsigned long long v17;  // [bp-0x150]
    unsigned long v18;  // [bp-0x148]
    unsigned long v19;  // [bp-0x118]
    unsigned long v20;  // [bp-0x110]
    st_b5b68_0 **v21;  // [bp-0xf8], Other Possible Types: char
    st_b5b68_0 *v22;  // [bp-0xf0]
    st_b5b68_1 *v23;  // [bp-0xe0]
    st_b5b68_1 *v24;  // [bp-0xd0], Other Possible Types: uint128_t
    st_b5b68_1 *v25;  // [bp-0xc0], Other Possible Types: unsigned long
    st_b5b68_1 *v26;  // [bp-0xb8]
    st_b5b68_1 *v27;  // [bp-0xb4]
    unsigned int v28;  // [bp-0x9c]
    st_b5b68_1 *v29;  // [bp-0x80]
    st_b5b68_1 *v30;  // [bp-0x78]
    unsigned long v31;  // [bp-0x70]
    char *v32;  // [bp-0x10]
    char v33;  // [bp+0x0]

    v32 = &v33;
    v7 = a2;
    v14 = a1;
    v31 = *(long long *)&g_10002b0;
    v22 = &v21;
    v21 = &v22;
    v11 = a3 + a4;
    v12 = v11 - 8;
    v10 = sub_bc5c4();
    v34 = *(int *)((char *)&a0->field_110 + 4);
    if ((unsigned int)*(int *)((char *)&a0->field_110 + 4) >= 0xfff)
        v34 = 0xfff;
    v8 = v34;
    if ((int)a0->field_110 == 3)
        v35 = 3;
    else
        v35 = 4;
    v17 = v35;
    v28 = a0->field_2c;
    v36 = a0->field_b8;
    v29 = 0;
    v30 = (st_b5b68_1 *)0;
    v37 = *(long long *)&a0->padding_118[4];
    if (v37)
    {
        v23 = (st_b5b68_1 *)*(int128_t *)&v37->field_0;
        v24 = v37->field_10;
        v25 = v37->field_20;
    }
    else
    {
        v25 = 0;
        v23 = (st_b5b68_1 *)0;
        v24 = (st_b5b68_1 *)0;
    }
    v27 = 0;
    v26 = (st_b5b68_1 *)0;
    sub_b9e50(&v23, 0, a4);
    v38 = a3;
    sub_ba948(&a0->field_90, v38, a4, 2);
    if (a0->field_8 + a0->field_18 == v38)
        v38 += 1;
    if ((unsigned long long)v12 > (unsigned long long)v38)
    {
        v18 = a0->field_b0;
        v6 = (st_b5b68_1 *)0;
        v13 = v11 - 32;
        v39 = v17;
        v40 = v39 - 1;
        v4 = v40;
        v5 = v40 & 0xfffffffffffffffe;
        v41 = v40 | 1;
        v2 = v41;
        v3 = v36 + 36;
        v0 = v39 - v41;
        v1 = v36 + 28 * v41 + 12;
        v19 = v36;
        v20 = v36 + 40;
        v16 = a0;
        v15 = v38;
        v9 = a3;
        v10();
    }
    if (*(long long *)&g_10002b0 == v31)
        return v11 - a3;
    ___stack_chk_fail();
}
