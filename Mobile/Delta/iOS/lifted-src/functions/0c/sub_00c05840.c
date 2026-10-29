/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc05840..0xc05a74 (564 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c05840_3 {
    struct st_c05840_2 *field_0;
    unsigned long long field_8;
    unsigned long long field_9;
} st_c05840_3;

typedef struct st_c05840_0 {
    char padding_0[24];
    struct st_c05840_1 *field_18;
} st_c05840_0;

typedef struct st_c05840_2 {
    unsigned long long field_0[2];
    struct st_c05840_0 *field_8;
    char field_10[8];
    char field_12;
} st_c05840_2;

typedef struct st_c05840_1 {
    unsigned long long field_0;
} st_c05840_1;

extern st_c05840_0 g_efa758;

st_c05840_3 * sub_c05840(st_c05840_3 *a0, long long a1, long long a2)
{
    st_c05840_2 *v8;  // x21
    long long v9;  // x22
    unsigned long long v10;  // x0
    unsigned long v11;  // x8
    uint128_t v0;  // [bp-0xa0]
    char *v1;  // [bp-0x90]
    unsigned long long v2;  // [bp-0x79]
    char *v3;  // [bp-0x78]
    st_c05840_0 *v4;  // [bp-0x70]
    unsigned long v5;  // [bp-0x68]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    if (a1 == a2)
        return a0;
    v8 = a0->field_0;
    v9 = a1 + 1;
    v10 = 1;
    if (!((char)a0->field_8 & 1))
    {
        v11 = *((char *)&a0->field_8 + 1);
        if (*((char *)&v8->field_8 + 2) >= 0)
        {
            if (v11 & 1)
                (*(long long *)(v8->field_0[1] + 24))();
            v10 = sub_be52a4(a1, v8);
        }
        else
        {
            if (!(v11 & 1))
                (*(long long *)(v8->field_0[1] + 24))();
            v2 = 1;
            v0 = (uint128_t)v8->field_0;
            v1 = &v2;
            v3 = &v0;
            v4 = &g_efa758.padding_0[0];
            v5 = v8->field_8;
            if (!(sub_be52a4(a1, &v3) & 1))
                v4->field_18();
            v10 = 1;
        }
    }
    *(char *)&a0->field_8 = v10;
    *((char *)&a0->field_8 + 1) = 1;
    if (v9 == a2)
        return a0;
    while (1)
    {
        if (!(v10 & 1))
        {
            if (*((char *)&v8->field_8 + 2) >= 0)
                (*(long long *)(v8->field_0[1] + 24))();
            v2 = 1;
            v0 = (uint128_t)v8->field_0;
            v1 = &v2;
            v4 = &g_efa758.padding_0[0];
            v5 = v8->field_8;
            v3 = &v0;
            if (!sub_be52a4(v9, &v3))
                v4->field_18();
        }
        v10 = 1;
        v9 += 1;
        *(char *)&a0->field_8 = 1;
        *((char *)&a0->field_8 + 1) = 1;
        if (v9 == a2)
            return a0;
    }
}
