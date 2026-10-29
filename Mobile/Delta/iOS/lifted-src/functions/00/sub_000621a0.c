/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x621a0..0x6220c (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_621a0_1 {
    char padding_0[24];
    struct st_621a0_0 *field_18;
    struct st_621a0_0 *field_20;
    char padding_28[8];
    struct st_621a0_0 *field_30;
    char padding_38[32];
    struct st_621a0_0 *field_58;
    char field_60;
} st_621a0_1;

typedef struct st_621a0_0 {
    char field_0;
} st_621a0_0;


unsigned long long sub_621a0(st_621a0_1 *a0)
{
    char *v2;  // x8
    char *v3;  // x9
    char *v4;  // x9
    st_621a0_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_621a0_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    v2 = a0->field_58;
    v3 = a0->field_30;
    if (v3 > v2)
    {
        a0->field_58 = v3;
        v2 = v3;
    }
    if (!(a0->field_60 >> 3 & 1))
        return 0xffffffff;
    v4 = a0->field_20;
    if (v2 > v4)
    {
        a0->field_20 = v2;
        v4 = v2;
    }
    if (v4 <= a0->field_18)
        return 0xffffffff;
    return *(char *)a0->field_18;
}
