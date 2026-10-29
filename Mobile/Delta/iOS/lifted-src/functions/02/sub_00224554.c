/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x224554..0x22470c (440 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_224554_2 {
    char padding_0[8];
    unsigned long long field_8;
} st_224554_2;

typedef struct st_224554_1 {
    char padding_0[8];
    struct st_224554_1 *field_8;
} st_224554_1;

typedef struct st_224554_4 {
    char padding_0[24];
    struct st_224554_3 *field_18;
} st_224554_4;

typedef struct st_224554_5 {
    struct st_224554_1 *field_0;
    char padding_8[16];
    struct st_224554_4 *field_18;
} st_224554_5;

typedef struct st_224554_3 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[416];
    struct st_224554_2 *field_1b0;
} st_224554_3;

typedef struct st_224554_0 {
    char field_0;
} st_224554_0;

extern long long g_cbed28;
extern long long g_f11490;

st_224554_1 * sub_224554(st_224554_5 *a0)
{
    st_224554_3 *v8;  // x20
    long long *v9;  // x0
    st_224554_1 *v10;  // x0
    long long *v11;  // x0
    st_224554_1 *v12;  // x0
    st_224554_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_224554_0 *v1;  // [bp-0x58]
    st_224554_1 *v2;  // [bp-0x50], Other Possible Types: unsigned long
    st_224554_1 *v3;  // [bp-0x48]
    st_224554_1 *v4;  // [bp-0x40]
    st_224554_1 **v5;  // [bp-0x38]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v1 = &v0;
    v0 = &v1;
    if (!a0->field_0)
    {
        return 0;
    }
    else if (a0->field_0->field_8)
    {
        v8 = a0->field_18->field_18;
        if (sub_22470c(&g_f11490, v8->field_8))
        {
            v2 = v8->field_8;
            v9 = sub_2237c4(&g_f11490, v8->field_8, &g_cbed28, &v2, &v5);
            v3 = 0;
            v4 = 0;
            v2 = 0;
            sub_1754ac(&v2, v9[5], v9[6], 12297829382473034411 * (v9[6] - v9[5] >> 3));
            v10 = sub_d0d44(v2, v3, a0->field_0->field_8, &v5);
            v5 = &v2;
            sub_271a8(&v5);
            if (v10 == v3)
                return 0;
            return 1;
        }
        else if (sub_22470c(&g_f11490, v8->field_1b0->field_8))
        {
            v2 = v8->field_1b0->field_8;
            v11 = sub_2237c4(&g_f11490, v8->field_1b0->field_8, &g_cbed28, &v2, &v5);
            v3 = 0;
            v4 = 0;
            v2 = 0;
            sub_1754ac(&v2, v11[5], v11[6], 12297829382473034411 * (v11[6] - v11[5] >> 3));
            v12 = sub_d0d44(v2, v3, a0->field_0->field_8, &v5);
            v5 = &v2;
            sub_271a8(&v5);
            if (v12 == v3)
                return 0;
            return 1;
        }
        else
        {
            return 0;
        }
    }
    else
    {
        return 0;
    }
}
