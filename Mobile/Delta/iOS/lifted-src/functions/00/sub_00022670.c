/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x22670..0x228dc (620 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_22670_3 {
    char padding_0[8];
    struct st_22670_2 *field_8;
} st_22670_3;

typedef struct st_22670_8 {
    unsigned long long field_0;
    long long field_8;
} st_22670_8;

typedef struct st_22670_4 {
    struct st_22670_5 *field_0;
    unsigned long long field_8;
    struct st_22670_2 *field_10;
} st_22670_4;

typedef struct st_22670_7 {
    unsigned long long field_0;
    uint128_t field_8;
    unsigned long long field_18;
    char padding_20[8];
    char field_28;
} st_22670_7;

typedef struct st_22670_2 {
    unsigned long long field_0;
    char field_1;
    char padding_2[6];
    uint128_t field_8;
    unsigned long long field_18;
    unsigned long long field_20;
    unsigned long long field_28;
    char field_30;
    char field_31;
    char padding_32[6];
    unsigned long long field_38;
} st_22670_2;

typedef struct st_22670_1 {
    char padding_0[216];
    long long field_d8;
    char padding_e0[56];
    unsigned long long field_118;
    char padding_120[40];
    unsigned long long field_148;
    unsigned int *field_150;
    char padding_158[16];
    char field_168;
    char padding_169[39];
    char field_190;
    char padding_191[375];
    unsigned long long field_308;
    long long field_310;
} st_22670_1;

typedef struct st_22670_6 {
    unsigned long long field_0;
    uint128_t field_8;
    struct st_22670_6 *field_18;
    unsigned long long field_20;
    unsigned long long field_28;
    char field_30;
    struct st_22670_2 *field_31;
    unsigned long long field_38;
} st_22670_6;

typedef struct st_22670_5 {
    unsigned long long field_0;
} st_22670_5;

typedef struct st_22670_9 {
    struct st_22670_10 *field_0;
} st_22670_9;

typedef struct st_22670_10 {
    struct st_22670_9 *field_0;
} st_22670_10;

typedef struct st_22670_0 {
    char field_0;
} st_22670_0;


long long sub_22670(st_22670_1 *a0, uint128_t *a1, st_22670_2 *a2, st_22670_4 *a3)
{
    st_22670_3 *v14;  // x22
    unsigned long long v15;  // x23
    unsigned long v24;  // x26
    unsigned int *v25;  // x19
    st_22670_6 *v26;  // x0
    st_22670_7 *v27;  // x8
    st_22670_6 *v28;  // x10
    unsigned long v29;  // x11
    unsigned long v30;  // x12
    char v31;  // x13
    unsigned long long v32;  // x0
    void* v33;  // x8
    void* v16;  // x0
    st_22670_2 *v17;  // x8
    st_22670_2 **v18;  // x22
    unsigned long v19;  // x9
    st_22670_2 *v20;  // x24
    st_22670_2 *i;  // x25
    unsigned long long v22;  // x23
    st_22670_3 *v23;  // x22
    st_22670_2 *v0;  // [bp-0xc8]
    st_22670_0 **v1;  // [bp-0xb8], Other Possible Types: char
    st_22670_0 *v2;  // [bp-0xb0]
    st_22670_6 *v3;  // [bp-0xa8]
    st_22670_8 *v4;  // [bp-0xa0], Other Possible Types: unsigned long
    uint128_t v5;  // [bp-0x98], Other Possible Types: long long
    st_22670_2 *v6;  // [bp-0x90]
    st_22670_2 *v7;  // [bp-0x88]
    st_22670_2 *v8;  // [bp-0x80]
    st_22670_2 *v9;  // [bp-0x78]
    st_22670_10 **v10;  // [bp-0x70]
    st_22670_10 **v11;  // [bp-0x68]
    char *v12;  // [bp-0x10]
    char v13;  // [bp+0x0]

    v12 = &v13;
    v2 = &v1;
    v1 = &v2;
    if (a2)
    {
        v5 = *a1;
        v4 = a0->field_118;
        v7 = 0;
        v8 = 0;
        v9 = (st_22670_2 *)0;
        v11 = &v10;
        v10 = &v11;
        sub_1dd64(&a0->field_168, &v4);
        v14 = sub_fb84(&a0->field_168, &v4);
        v15 = ((char *)a0->field_150 - a0->field_148 >> 3) - 1;
        v16 = sub_404c(a0->field_d8, 64);
        v17 = v14->field_8;
        v18 = &v14->field_8;
        v19 = *(int *)((char *)a0->field_150 - 4);
        *(unsigned long *)v16 = v4;
        *(uint128_t *)&v16[8] = v5;
        *(st_22670_2 **)&v16[24] = v17;
        *(unsigned long long *)&v16[32] = v15;
        *(unsigned long *)&v16[40] = v19;
        *(char *)&v16[48] = (char)v9;
        *(char *)&v16[49] = 0;
        *(st_22670_2 **)&v16[56] = v7;
        *v18 = v16;
        sub_103a8(&a0->field_190, v18);
        v0 = *v18;
    }
    else
    {
        v0 = 0;
    }
    v4 = &a0->field_308;
    v5 = (long long)(a0->field_310 - a0->field_308) >> 3;
    v6 = 0;
    if (a3->field_10)
    {
        v20 = 0;
        i = 0;
        do
        {
            v22 = *(long long *)a3->field_0 + 48 * a3->field_8;
            v11 = &v10;
            v10 = &v11;
            sub_1dd64(&a0->field_168, v22 + (char *)v20);
            v23 = sub_fb84(&a0->field_168, v22 + (char *)v20);
            v24 = a0->field_148;
            v25 = a0->field_150;
            v26 = sub_404c(a0->field_d8, 64);
            v27 = v22 + (char *)v20;
            v28 = v23->field_8;
            v29 = *(int *)((char *)v25 - 4);
            v30 = *(long long *)((char *)&v27->field_8 + 8);
            v31 = v27->padding_20[0];
            v26->field_0 = v27->field_0;
            *(int128_t *)&(&v26->field_0)[1] = *(int128_t *)&(&v27->field_0)[1];
            *(st_22670_6 **)((char *)&v26->field_8 + 8) = v28;
            v26->field_18 = ((char *)v25 - v24 >> 3) - 1;
            v26->field_20 = v29;
            *(char *)&v26->field_28 = v31;
            *((char *)&v26->field_28 + 1) = 0;
            *(unsigned long *)&v26->field_30 = v30;
            v23->field_8 = v26;
            sub_103a8(&a0->field_190, &v23->field_8);
            v3 = v23->field_8;
            v11 = &v10;
            v10 = &v11;
            sub_103a8(v4, &v3);
            v6 = (char *)&v6->field_0 + 1;
            i = (char *)&i->field_0 + 1;
            v20 = &v20->field_28;
        } while (i < a3->field_10);
    }
    v32 = sub_ef54(a0, &v4);
    *(st_22670_2 **)v33 = v0;
    *(unsigned long long *)&v33[8] = v32;
    *(st_22670_8 ***)&v33[16] = &v4;
    return sub_dd88(v4, v4->field_0 + v5 * 8, v4->field_8);
}
