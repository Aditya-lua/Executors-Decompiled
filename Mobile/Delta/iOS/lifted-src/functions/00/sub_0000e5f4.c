/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xe5f4..0xebbc (1480 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_e5f4_7 {
    unsigned long long field_0;
    long long field_8;
} st_e5f4_7;

typedef struct st_e5f4_6 {
    char padding_0[8];
    struct st_e5f4_5 *field_8;
} st_e5f4_6;

typedef struct st_e5f4_3 {
    char padding_0[164];
    unsigned int field_a4;
} st_e5f4_3;

typedef struct st_e5f4_8 {
    uint128_t field_0;
    unsigned long long field_10;
} st_e5f4_8;

typedef struct st_e5f4_1 {
    char padding_0[12];
    uint128_t field_c;
} st_e5f4_1;

typedef struct st_e5f4_9 {
    char padding_0[48];
    char field_30;
} st_e5f4_9;

typedef struct st_e5f4_5 {
    unsigned long long field_0;
    uint128_t field_8;
    struct st_e5f4_5 *field_18;
    unsigned long long field_20;
    unsigned long long field_28;
    char field_30;
} st_e5f4_5;

typedef struct st_e5f4_4 {
    char padding_0[128];
    long long field_80;
    unsigned long long field_84;
    unsigned long long field_8c;
    char padding_94[68];
    long long field_d8;
    char padding_e0[104];
    unsigned long long field_148;
    unsigned int *field_150;
    char padding_158[16];
    char field_168;
    char padding_169[39];
    unsigned long long field_190;
    unsigned long long field_198;
    char padding_1a0[72];
    struct st_e5f4_3 *field_1e8;
    char padding_1f0[256];
    unsigned long long field_2f0;
    long long field_2f8;
} st_e5f4_4;

typedef struct st_e5f4_2 {
    struct st_e5f4_1 *field_0;
} st_e5f4_2;

typedef struct st_e5f4_0 {
    char field_0;
} st_e5f4_0;


long long sub_e5f4(st_e5f4_4 *a0, long long a1, void* a2, long long a3, st_e5f4_8 *a4, st_e5f4_2 **a5, char a6, char a7)
{
    char idx;  // x21
    char v29;  // w24
    st_e5f4_9 *v38;  // x27
    unsigned long v39;  // x23
    unsigned long v40;  // x0
    char v30;  // x25
    long long v31;  // x0
    st_e5f4_6 *v32;  // x26
    unsigned long long v33;  // x22
    unsigned int *v34;  // x23
    st_e5f4_5 *v35;  // x0
    st_e5f4_5 *v36;  // x9
    unsigned long v37;  // x10
    st_e5f4_5 *v0;  // [bp-0x180], Other Possible Types: char
    char v1;  // [bp-0x178]
    st_e5f4_0 **v2;  // [bp-0x160], Other Possible Types: char
    st_e5f4_0 *v3;  // [bp-0x158]
    st_e5f4_0 *v4;  // [bp-0x150], Other Possible Types: unsigned int, unsigned long
    unsigned long v5;  // [bp-0x14c]
    unsigned long v6;  // [bp-0x148]
    uint192_t v7;  // [bp-0x140]
    char v8;  // [bp-0x128]
    char v9;  // [bp-0x120]
    char v10;  // [bp-0x104]
    char v11;  // [bp-0xf4]
    char v12;  // [bp-0xf0]
    uint128_t v13;  // [bp-0xf0]
    uint128_t v14;  // [bp-0xf0]
    char v15;  // [bp-0xe8]
    st_e5f4_7 *v16;  // [bp-0xd8]
    unsigned long long v17;  // [bp-0xd0]
    char v18;  // [bp-0xc8]
    long long v19;  // [bp-0xbc]
    unsigned long v20;  // [bp-0xb8]
    char v21;  // [bp-0xb0]
    char v22;  // [bp-0xa0]
    uint128_t v23;  // [bp-0x90]
    st_e5f4_0 **v24;  // [bp-0x78], Other Possible Types: char
    char v25;  // [bp-0x74]
    char *v26;  // [bp-0x10]
    char v27;  // [bp+0x0]

    v26 = &v27;
    v3 = &v2;
    v2 = &v3;
    v23 = (int128_t)a2[4];
    if (a5[1])
        v23 = *(int128_t *)(*(long long *)*a5 + 12);
    if (a0->padding_0[88] & 1)
    {
        idx = sub_404c(*(long long *)&a0->padding_94[64], 112);
        sub_8808(idx, 112);
        if (a7 && idx)
        {
            *(unsigned long long *)(idx + 8) = sub_ef54(a0, a7);
            *(unsigned long long *)(idx + 16) = a7;
        }
        else if (!idx)
        {
            goto LABEL_e6c8;
        }
        sub_11190(a0, 0, idx + 32, idx + 40, idx + 56);
        v29 = 1;
    }
    else
    {
LABEL_e6c8:
        sub_11190(a0, 0, 0, 0, 0);
        idx = 0;
        v29 = 0;
    }
    v19 = (int)a0->field_80;
    v20 = *(long long *)((char *)&a0->field_80 + 4);
    sub_1f3d4(a0, 40, "function");
    *(int *)(*(long long *)&a0->padding_1a0[64] + 164) = *(int *)(*(long long *)&a0->padding_1a0[64] + 164) + 1;
    v16 = &a0->padding_1f0[248];
    v17 = 12297829382473034411 * ((long long)(a0->field_2f0 - *(long long *)&a0->padding_1f0[248]) >> 4);
    v18 = 0;
    v12 = 0;
    v15 = 0;
    if ((int)a0->field_80 == 41)
    {
        v30 = 0;
        v1 = 0;
        v10 = 0;
        v11 = 0;
        if (v19 == 40)
            goto LABEL_e810;
    }
    else if (v29)
    {
        sub_199b8(a0, &v16, 1, idx + 80, 0, idx + 96, 0);
        v30 = *(char *)&v7;
        v13 = *(uint128_t *)((void*)&v7 + 4);
        v1 = v8;
        v10 = 0;
        v11 = 0;
        if (v19 == 40)
            goto LABEL_e810;
    }
    else
    {
        sub_199b8(a0, &v16, 1, 0, 0, 0, 0);
        v30 = *(char *)&v7;
        v14 = *(uint128_t *)((void*)&v7 + 4);
        v1 = v8;
        v10 = 0;
        v11 = 0;
        if (v19 == 40)
        {
LABEL_e810:
            if ((int)a0->field_80 == 41)
            {
                *(unsigned long *)&v7 = v20;
                *(long long *)((char *)&v7 + 8) = *(long long *)((char *)&a0->field_84 + 4);
                sub_1f158(&v10, &v7);
            }
        }
    }
    sub_1ef30(a0, 41, &v19, 1);
    *(int *)(*(long long *)&a0->padding_1a0[64] + 164) = *(int *)(*(long long *)&a0->padding_1a0[64] + 164) - 1;
    v31 = sub_18b88();
    if (a4)
    {
        *(uint128_t *)&v7 = a4->field_0;
        v8 = 0;
        v9 = 0;
        *(unsigned long long *)((char *)&v7 + 16) = a4->field_10;
        v4 = &v24;
        v24 = &v4;
        sub_1dd64(&a0->padding_158[8], &v7);
        v32 = sub_fb84(&a0->padding_158[8], &v7);
        v33 = *(long long *)&a0->padding_e0[96];
        v34 = a0->field_148;
        v35 = sub_404c(*(long long *)&a0->padding_94[64], 64);
        v36 = v32->field_8;
        v37 = *(int *)(a0->field_148 - 4);
        v35->field_0 = *(unsigned long long *)&v7;
        *(uint128_t *)&(&v35->field_0)[1] = *(uint128_t *)((void*)&v7 + 8);
        *(st_e5f4_5 **)((char *)&v35->field_8 + 8) = v36;
        v35->field_18 = ((char *)v34 - v33 >> 3) - 1;
        v35->field_20 = v37;
        *(char *)&v35->field_28 = a6;
        *((char *)&v35->field_28 + 1) = 0;
        *(unsigned long long *)&v35->field_30 = v8;
        v32->field_8 = v35;
        sub_103a8(&a0->padding_169[31], &v32->field_8);
        v0 = v32->field_8;
    }
    else
    {
        v0 = 0;
    }
    v25 = 0;
    v24 = v30;
    sub_f2b8(&a0->padding_e0[96], &v24);
    sub_22670(a0, &v23, a1, &v16);
    v38 = sub_10a78(a0);
    sub_16df8(a0, a0->field_190 - *(long long *)&a0->padding_169[31] >> 3);
    sub_c84c(&a0->padding_e0[96], a0->field_148 - 8);
    sub_16df8(a0, a0->field_190 - *(long long *)&a0->padding_169[31] >> 3);
    v39 = *(long long *)((char *)&a0->field_84 + 4);
    v4 = *(int *)a2;
    v5 = (long long)a2[4];
    v38->field_30 = sub_1e5c4(a0, 296, &v4);
    v4 = *(unsigned long long *)&v23;
    v6 = v39;
    v40 = sub_404c(*(long long *)&a0->padding_94[64], 192);
    sub_4f18(v40, &v4, a5, &v21, &v22, *(unsigned long long *)&v7, (char *)&v7 + 8, v30, &v13, v38, (long long)(a0->field_148 - *(long long *)&a0->padding_e0[96]) >> 3, a3, v31, v1, &v10);
    if (a0->padding_0[88] == 1)
    {
        *(long long *)(idx + 24) = (long long)a2[4];
        *(unsigned long long *)(idx + 64) = sub_13c40(a0, &v16);
        *(st_e5f4_7 ***)(idx + 72) = &v16;
        v4 = v40;
        sub_1c9f0(&a0[1].field_190, &v4);
        *(unsigned long long *)(sub_12484(&a0[1].field_190, &v4) + 8) = idx;
    }
    sub_1d9ac(v16, v16->field_0 + 48 * v17, v16->field_8);
    return v40;
}
