/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1e45c4..0x1e4cec (1832 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1e45c4_3 {
    char padding_0[2];
    char field_2;
    unsigned long long field_3;
    char padding_b[53];
    struct st_1e45c4_1 *field_40;
    unsigned long long field_48;
    struct st_1e45c4_2 *field_50;
    struct st_1e45c4_4 *field_58;
    char padding_60[24];
    unsigned long long field_78;
} st_1e45c4_3;

typedef struct st_1e45c4_4 {
    uint128_t field_0;
} st_1e45c4_4;

typedef struct st_1e45c4_2 {
    char padding_0[32];
    struct st_1e45c4_3 *field_20;
} st_1e45c4_2;

typedef struct st_1e45c4_1 {
    char padding_0[24];
    unsigned long long field_18;
    char padding_20[12];
    unsigned int field_2c;
} st_1e45c4_1;

typedef struct st_1e45c4_0 {
    char field_0;
} st_1e45c4_0;

typedef struct st_1e45c4_7 {
    char padding_0[112];
    char field_70;
} st_1e45c4_7;

typedef struct st_1e45c4_6 {
    unsigned long long field_0;
} st_1e45c4_6;

typedef struct st_1e45c4_5 {
    char padding_0[376];
    struct st_1e45c4_6 *field_178;
} st_1e45c4_5;

extern st_1e45c4_5 *g_f0d3d8;
extern unsigned long long g_f0d528;

unsigned long long sub_1e45c4(st_1e45c4_7 *a0, st_1e45c4_3 *a1, st_1e45c4_3 *a2)
{
    uint128_t *v11;  // x9
    unsigned long long v12;  // x10
    uint128_t *v21;  // x12
    long long v22;  // x10
    uint128_t *v23;  // x12
    unsigned long long v13;  // x25
    uint128_t *v14;  // x8
    long long v15;  // x13
    st_1e45c4_2 *v16;  // x10
    unsigned long v17;  // x11
    uint128_t *v18;  // x9
    long long i;  // x10
    uint128_t *iter;  // x11
    long long v0;  // [bp-0xf8]
    st_1e45c4_0 **v1;  // [bp-0xf0], Other Possible Types: char
    st_1e45c4_0 *v2;  // [bp-0xe8]
    st_1e45c4_0 **v3;  // [bp-0xe0], Other Possible Types: char
    st_1e45c4_0 *v4;  // [bp-0xd8]
    st_1e45c4_0 **v5;  // [bp-0xd0], Other Possible Types: char
    st_1e45c4_0 *v6;  // [bp-0xc8]
    st_1e45c4_0 *v7;  // [bp-0xc0]
    st_1e45c4_0 **v8;  // [bp-0xb8], Other Possible Types: char
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v2 = &v1;
    v1 = &v2;
    v11 = a2->field_50;
    v12 = v11 - a2->field_40;
    v13 = v12 >> 4;
    if (!(v13 >> 31 & 1))
    {
        v14 = a1->field_50;
        v15 = (v12 * 0x1000000000000000 | v12 >> 4) & 0xf00000007fffffff & 0x7fffffff;
        if (v15 <= (long long)(*(long long *)(*(long long *)&a1->padding_b[48] + 24) - (char *)v14 >> 4))
        {
            if ((unsigned int)v13)
            {
                v4 = &v3;
                v3 = &v4;
                if (a2 != a1)
                {
                    v16 = a1->field_48;
                    if (a2->field_48 != v16)
                    {
                        v0 = v15;
                        v6 = &v5;
                        v5 = &v6;
                        v7 = &v8;
                        v8 = &v7;
                        g_f0d3d8->field_178();
                    }
                    v17 = a1->field_2;
                    if (v17 >> 2 & 1)
                    {
                        a1->field_2 = (char)v17 & 251;
                        *(struct st_1e45c4_3 **)&a1->padding_60[16] = v16->field_20;
                        v16->field_20 = a1;
                        v14 = a1->field_50;
                        v11 = a2->field_50;
                    }
                    v18 = &v11[-1 * v15];
                    i = v15;
                    iter = v14;
                    v21 = v18;
                    do
                    {
                        v22 = i;
                        v23 = v21 + 1;
                        *iter = *v21;
                        iter += 1;
                        i = v22 - 1;
                        v21 = v23;
                    } while (i);
                    a2->field_50 = v18;
                    a1->field_50 = &v14[v15];
                }
            }
            a0->field_70 = 2;
            *(unsigned int *)(*(long long *)&a1->padding_b[48] + 32) = 0;
            *(unsigned int *)(*(long long *)&a1->padding_b[48] + 44) = *(int *)(*(long long *)&a1->padding_b[48] + 44) | 2;
            a1->field_40 = &a1->field_50->padding_0[-16 * v15];
            (&a1->field_2)[1] = 1;
            return 0xffffffff;
        }
    }
    a0->field_70 = 2;
    sub_1dd788(a0);
    sub_d5c30(a1, g_f0d528 + 2242);
    return 0;
}
