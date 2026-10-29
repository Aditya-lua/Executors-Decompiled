/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb442e4..0xb44374 (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b442e4_1 {
    char padding_0[8];
    long long field_8;
    char padding_10[40];
    struct st_b442e4_0 *field_38;
    char padding_40[20];
    char field_54;
    char padding_55[67];
    struct st_b442e4_0 *field_98;
} st_b442e4_1;

typedef struct st_b442e4_0 {
    struct st_b442e4_0 *field_0;
} st_b442e4_0;


st_b442e4_0 ** sub_b442e4(st_b442e4_1 *a0, long long a1, st_b442e4_0 **a2)
{
    st_b442e4_0 **v3;  // x0
    st_b442e4_0 **v4;  // x0
    char v0;  // [bp-0x34], Other Possible Types: unsigned int
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = sub_a2f9e0();
    if (!(unsigned int)v3)
        return v3;
    if (!a0->field_38)
    {
        v4 = sub_a64344(a0->field_8, a1, &v0);
        if (!(unsigned int)v4)
            return v4;
        *a2 = v0;
    }
    else if (a0->field_98)
    {
        if (a2)
            *a2 = a0->field_98;
        _memcpy(a1, &a0->field_54);
    }
    else
    {
        return 0;
    }
    return 1;
}
