/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x5ada0..0x5ae6c (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_5ada0_2 {
    struct st_5ada0_3 *field_0;
    struct st_5ada0_2 *field_8;
} st_5ada0_2;

typedef struct st_5ada0_1 {
    long long field_0;
    struct st_5ada0_2 *field_8;
} st_5ada0_1;

typedef struct st_5ada0_3 {
    char field_0;
    char padding_1[7];
    struct st_5ada0_1 *field_8;
} st_5ada0_3;

typedef struct st_5ada0_4 {
    char padding_0[2112];
    struct st_5ada0_2 *field_840;
} st_5ada0_4;

typedef struct st_5ada0_0 {
    char field_0;
} st_5ada0_0;

extern st_5ada0_2 g_f011d0;

st_5ada0_3 * sub_5ada0(st_5ada0_4 *a0, long long a1)
{
    st_5ada0_2 *v4;  // x23
    st_5ada0_2 *v5;  // x23
    st_5ada0_3 *v6;  // x21
    unsigned long long v7;  // x0
    st_5ada0_1 *v8;  // x0
    st_5ada0_2 *v9;  // x20
    st_5ada0_2 *v10;  // x0
    st_5ada0_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_5ada0_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = a0->field_840;
    if (a0->field_840 != &g_f011d0.field_0)
    {
        do
        {
            v5 = v4;
            if (sub_5b15c(v5->field_0->field_8->field_0, a1))
                return v5->field_0;
        } while ((v4 = v5->field_8, v5->field_8 != &g_f011d0.field_0));
    }
    v6 = sub_60194(a0);
    v6->field_0 = 0x11;
    v7 = sub_58cbc(a0, a1);
    v8 = sub_60194(a0);
    v8->field_0 = v7;
    v8->field_8 = &g_f011d0.field_0;
    v6->field_8 = v8;
    v9 = a0->field_840;
    v10 = sub_60194(a0);
    v10->field_0 = v6;
    v10->field_8 = v9;
    a0->field_840 = v10;
    return v6;
}
