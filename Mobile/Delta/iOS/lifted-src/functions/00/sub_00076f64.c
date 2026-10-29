/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x76f64..0x77038 (212 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_76f64_0 {
    unsigned long long field_0;
    unsigned long long field_8;
} st_76f64_0;

typedef struct st_76f64_1 {
    unsigned long long field_0;
    unsigned int field_8;
    char padding_c[4];
    struct st_76f64_2 *field_10;
    struct st_76f64_2 *field_18;
    struct st_76f64_2 *field_20;
} st_76f64_1;

typedef struct st_76f64_2 {
    unsigned long long field_0;
} st_76f64_2;

typedef struct st_76f64_4 {
    char field_0;
} st_76f64_4;

typedef struct st_76f64_3 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
} st_76f64_3;

extern st_76f64_3 g_cbeec8;
extern unsigned long long g_cbef48;

st_76f64_0 * sub_76f64(st_76f64_0 *a0, st_76f64_1 *a1, unsigned short *a2)
{
    unsigned long v2;  // x9
    unsigned int v3;  // w8
    unsigned long v4;  // x9
    unsigned long v5;  // x10
    unsigned long long *v6;  // x9
    unsigned long long *v7;  // x10
    unsigned long v8;  // x11
    unsigned long long v9;  // x10
    unsigned long long *v10;  // x9
    unsigned int v11;  // w8
    st_76f64_4 **v0;  // [bp-0x10], Other Possible Types: char
    st_76f64_4 *v1;  // [bp-0x8]

    v2 = *a2;
    v3 = a1->field_8 + (unsigned int)v2;
    v4 = (&g_cbeec8.field_0)[v2];
    v5 = a1->field_0 >> ((char)-v3 & 63);
    a1->field_8 = v3;
    a0->field_0 = v5 & v4;
    v1 = &v0;
    v0 = &v1;
    if (65 <= v3)
    {
        a1->field_10 = &g_cbef48;
        a0->field_8 = a2 + 2;
        return a0;
    }
    v6 = a1->field_10;
    if (a1->field_20 > v6)
    {
        v7 = a1->field_18;
        if (v6 == v7)
        {
            a0->field_8 = a2 + 2;
            return a0;
        }
        v8 = v3 >> 3;
        if ((char *)v6 - v8 < v7)
            v9 = v6 - v7 & 0xffffffff;
        else
            v9 = v8 & 0xffffffff;
        v10 = (char *)v6 - v9;
        a1->field_10 = v10;
        v11 = v3 - (unsigned int)v9 * 8;
    }
    else
    {
        v10 = (char *)v6 - (v3 >> 3);
        a1->field_10 = v10;
        v11 = v3 & 7;
    }
    a1->field_8 = v11;
    a1->field_0 = *v10;
    a0->field_8 = a2 + 2;
    return a0;
}
