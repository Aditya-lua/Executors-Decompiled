/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xd6188..0xd62c4 (316 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_d6188_1 {
    uint128_t field_0;
} st_d6188_1;

typedef struct st_d6188_0 {
    unsigned long long field_0;
    struct st_d6188_1 *field_8;
    char *field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    unsigned long long field_28;
    unsigned int field_30;
    unsigned int field_34;
} st_d6188_0;

typedef struct st_d6188_2 {
    char field_0;
} st_d6188_2;


double sub_d6188(st_d6188_0 *a0, void* a1)
{
    unsigned long v4;  // x8
    unsigned long long v5;  // x8
    uint128_t *v15;  // x23
    uint128_t v16;  // q0
    unsigned long v6;  // x9
    unsigned long long v7;  // x22
    unsigned long long idx;  // x21
    char *v9;  // x8
    unsigned long long i;  // w10
    unsigned long long v11;  // x9
    char *v12;  // x8
    char *v13;  // x8
    st_d6188_2 **v0;  // [bp-0x50], Other Possible Types: char
    st_d6188_2 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (!a0->field_28 && !(sub_d6f78(a0) & 1))
        sub_e2504(a0);
    v4 = *(long long *)a1 ^ (unsigned long long)(*(long long *)a1) >> 33;
    v5 = a0->field_0 * (0xff51afd7ed558ccd * v4 ^ 0xff51afd7ed558ccd * v4 >> 33) ^ a0->field_0 * (0xff51afd7ed558ccd * v4 ^ 0xff51afd7ed558ccd * v4 >> 33) >> 33;
    v6 = a0->field_30;
    v7 = v6 + ((v5 & 31) >> ((char)a0->field_34 & 63));
    idx = a0->field_20 & v5 >> 5;
    v9 = a0->field_10;
    i = v9[idx];
    if (i >= (unsigned int)v7)
    {
        do
        {
            v7 += v6;
            i = v9[1 + idx];
            idx += 1;
        } while ((unsigned int)v7 <= i);
    }
    if ((unsigned int)v6 + ((unsigned int)v7 & 0xff) >= 0x100)
    {
        a0->field_28 = 0;
        i = v9[idx];
    }
    if (i)
    {
        v11 = 0;
        v12 = v9 + 1;
        do
        {
            v13 = v12;
            v11 -= 1;
            v12 = v13 + 1;
        } while (v13[idx]);
        v15 = a0->field_8;
        if (v11)
            sub_d705c(a0, idx - v11, idx);
    }
    else
    {
        v15 = a0->field_8;
    }
    v16 = *(int128_t *)a1;
    v15[idx] = v16;
    a0->field_10[idx] = v7;
    a0->field_18 = a0->field_18 + 1;
    return *(unsigned long long *)&v16;
}
