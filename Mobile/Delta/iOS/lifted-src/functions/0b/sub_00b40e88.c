/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb40e88..0xb40fd4 (332 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b40e88_2 {
    unsigned long long field_0;
    unsigned long long field_8;
    char padding_10[8];
    unsigned long long field_18;
} st_b40e88_2;

typedef struct st_b40e88_1 {
    char padding_0[16];
    struct st_b40e88_2 *field_10;
    struct st_b40e88_0 *field_18;
    unsigned long long field_20;
    unsigned long long field_28;
} st_b40e88_1;

typedef struct st_b40e88_0 {
    unsigned long long field_0;
    char padding_8[8];
    unsigned long long field_10[2];
    unsigned long long field_18;
    char padding_20[8];
    int field_28;
} st_b40e88_0;

extern long long g_b40fd4;

unsigned long long sub_b40e88(unsigned long long *a0, long long a1, st_b40e88_1 *a2)
{
    st_b40e88_0 *v2;  // x8
    unsigned long v3;  // x9
    unsigned long v12;  // x0
    unsigned long long *v13;  // x9
    unsigned long v14;  // x8
    unsigned long long v15;  // x9
    unsigned long long v16;  // x10
    unsigned long v4;  // x0
    unsigned long long v5;  // x9
    unsigned long long v6;  // x10
    unsigned long v7;  // x8
    unsigned long long *v8;  // x8
    unsigned long long v9;  // x0
    st_b40e88_0 *v10;  // x8
    unsigned long v11;  // x9
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    a0[3] = 0;
    v2 = a2->field_18;
    v3 = *(int *)&v2->padding_20[0];
    if ((unsigned int)v3)
    {
        v4 = a2->field_28;
        *a0 = v2->field_0;
        v5 = 1 - v3;
        v6 = a2->field_10->field_8;
        a0[4] = v5 * a2->field_10->field_18;
        a0[5] = v5 * v6;
        a0[6] = v2->field_10[0];
        v7 = &v2->field_10[1];
    }
    else
    {
        v4 = a2->field_20;
        v8 = &a2->field_10->field_0;
        *a0 = *v8;
        a0[4] = 0;
        a0[5] = 0;
        a0[6] = v8[3];
        v7 = v8 + 1;
    }
    a0[7] = *(long long *)v7;
    v9 = sub_a5d0c8(v4, a1, &g_b40fd4, a0);
    if (!(unsigned int)v9)
        return v9;
    v10 = a2->field_18;
    v11 = *(int *)&v10->padding_20[0];
    if ((unsigned int)v11 == 1)
    {
        v12 = a2->field_20;
        v13 = &a2->field_10->field_0;
        *a0 = *v13;
        *(unsigned long long [2])&a0[4] = v10->field_10;
        a0[6] = v13[3];
        v14 = v13 + 1;
    }
    else
    {
        v12 = a2->field_28;
        *a0 = v10->field_0;
        v15 = 1 - v11;
        v16 = a2->field_10->field_8;
        a0[4] = v15 * a2->field_10->field_18;
        a0[5] = v15 * v16;
        a0[6] = v10->field_10[0];
        v14 = &v10->field_10[1];
    }
    a0[7] = *(long long *)v14;
    return sub_a5d0c8(v12, a1, &g_b40fd4, a0) != 0;
}
