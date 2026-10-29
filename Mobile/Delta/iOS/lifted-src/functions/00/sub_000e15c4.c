/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xe15c4..0xe173c (376 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_e15c4_0 {
    int field_0;
    char padding_4[4];
    uint128_t field_8;
} st_e15c4_0;

typedef struct st_e15c4_2 {
    unsigned long long field_0;
    unsigned long long field_8;
    char *field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    unsigned long long field_28;
    unsigned int field_30;
    unsigned int field_34;
} st_e15c4_2;

typedef struct st_e15c4_1 {
    char field_0;
} st_e15c4_1;


double sub_e15c4(st_e15c4_2 *a0, st_e15c4_0 *a1)
{
    unsigned long v5;  // x8
    unsigned long long v6;  // x9
    st_e15c4_0 *v16;  // x23
    uint128_t v17;  // q0
    unsigned long v7;  // x10
    unsigned long long v8;  // x22
    unsigned long long v9;  // x21
    char *v10;  // x9
    unsigned int i;  // w11
    unsigned long long v12;  // x10
    char *v13;  // x9
    char *v14;  // x9
    st_e15c4_1 **v0;  // [bp-0x60], Other Possible Types: char
    st_e15c4_1 *v1;  // [bp-0x58]
    uint128_t v2;  // [bp-0x50]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    if (!a0->field_28 && !(sub_d6f78(a0) & 1))
        sub_e2504(a0);
    v5 = a1->field_0;
    v6 = a0->field_0 * (0xff51afd7ed558ccd * (v5 ^ v5 >> 33) ^ 0xff51afd7ed558ccd * (v5 ^ v5 >> 33) >> 33) ^ a0->field_0 * (0xff51afd7ed558ccd * (v5 ^ v5 >> 33) ^ 0xff51afd7ed558ccd * (v5 ^ v5 >> 33) >> 33) >> 33;
    v7 = a0->field_30;
    v8 = v7 + ((v6 & 31) >> ((char)a0->field_34 & 63));
    v9 = a0->field_20 & v6 >> 5;
    v10 = a0->field_10;
    i = v10[v9];
    if (i >= (unsigned int)v8)
    {
        do
        {
            v8 += v7;
            i = v10[1 + v9];
            v9 += 1;
        } while ((unsigned int)v8 <= i);
    }
    if ((unsigned int)v7 + ((unsigned int)v8 & 0xff) >= 0x100)
    {
        a0->field_28 = 0;
        i = v10[v9];
    }
    if (i)
    {
        v12 = 0;
        v13 = v10 + 1;
        do
        {
            v14 = v13;
            v12 -= 1;
            v13 = v14 + 1;
        } while (v14[v9]);
        v16 = a0->field_8 + 24 * v9;
        if (!v12)
            goto LABEL_e1700;
        sub_d29a8(a0, v9 - v12, v9);
        v16->field_0 = a1->field_0;
        v17 = *(int128_t *)(a1->padding_4)[1];
        *(unsigned long long *)(a1->padding_4)[1] = 0;
        *(unsigned long long *)&a1->field_8 = 0;
        v2 = *(int128_t *)(v16->padding_4)[1];
        *(uint128_t *)(v16->padding_4)[1] = v17;
        sub_60b78(&v2);
    }
    else
    {
        v16 = a0->field_8 + 24 * v9;
LABEL_e1700:
        v16->field_0 = v5;
        v17 = *(int128_t *)(a1->padding_4)[1];
        *(uint128_t *)(v16->padding_4)[1] = v17;
        *(unsigned long long *)(a1->padding_4)[1] = 0;
        *(unsigned long long *)&a1->field_8 = 0;
    }
    a0->field_10[v9] = v8;
    a0->field_18 = a0->field_18 + 1;
    return *(unsigned long long *)&v17;
}
