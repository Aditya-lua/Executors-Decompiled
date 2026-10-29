/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa549dc..0xa54a84 (168 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a549dc_0 {
    char padding_0[120];
    long long field_78;
} st_a549dc_0;

typedef struct st_a549dc_2 {
    struct st_a549dc_1 *field_0;
    char padding_8[8];
    unsigned int field_10;
} st_a549dc_2;

typedef struct st_a549dc_1 {
    char padding_0[4];
    unsigned int field_4;
    char padding_8[24];
    unsigned long long field_20;
} st_a549dc_1;


st_a549dc_2 * sub_a549dc(st_a549dc_0 *a0, st_a549dc_1 *a1, unsigned int a2)
{
    unsigned int v2;  // w0
    unsigned int v3;  // x23
    st_a549dc_2 *v4;  // x0
    st_a549dc_1 *v5;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_ad69e4(a0->field_78);
    if ((int)v2 >= 1)
    {
        v3 = 0;
        do
        {
            v4 = sub_ad69f8(a0->field_78, v3);
            if (!(a2 & ~v4->field_10))
            {
                v5 = v4->field_0;
                if (v5 == a1)
                {
                    return v4;
                }
                else if (a1->field_4 == v5->field_4 && a1->field_20 == v5->field_20)
                {
                    return v4;
                }
            }
        } while ((v3 += 1, v2 != v3));
    }
    return 0;
}
