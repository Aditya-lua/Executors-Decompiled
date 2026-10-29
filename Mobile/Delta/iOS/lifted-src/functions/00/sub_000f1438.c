/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xf1438..0xf14ac (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_f1438_1 {
    char padding_0[8];
    unsigned long long field_8;
    struct st_f1438_0 *field_10;
    char padding_18[24];
    unsigned int field_30;
} st_f1438_1;

typedef struct st_f1438_0 {
    char field_0;
} st_f1438_0;


double sub_f1438(st_f1438_1 *a0, unsigned long long a1)
{
    char *v2;  // x8
    unsigned int i;  // w10
    char v4;  // x11
    unsigned long long v5;  // x9
    uint128_t *v6;  // x8
    unsigned long v7;  // d0
    st_f1438_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_f1438_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    v2 = a0->field_10;
    i = v2[1 + a1];
    v4 = a0->field_30;
    if (i >= a0->field_30 * 2)
    {
        v5 = a1 * 16;
        do
        {
            v2[a1] = i - v4;
            v6 = a0->field_8 + v5;
            *v6 = v6[1];
            v2 = a0->field_10;
            i = v2[2 + a1];
            v4 = a0->field_30;
            a1 += 1;
            v5 += 16;
        } while (a0->field_30 * 2 <= i);
    }
    v2[a1] = 0;
    return v7;
}
