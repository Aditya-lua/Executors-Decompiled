/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2d2c8..0x2d334 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2d2c8_0 {
    char padding_0[8];
    unsigned long long field_8;
} st_2d2c8_0;


st_2d2c8_0 * sub_2d2c8(st_2d2c8_0 *a0, unsigned long a1)
{
    unsigned long i;  // x21
    st_2d2c8_0 *v4;  // x0
    st_2d2c8_0 *v5;  // x0
    unsigned long v0;  // [bp-0x38]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    i = a0->field_8;
    v4 = a0;
    if (v4->field_8 != a1)
    {
        do
        {
            v0 = i - 24;
            sub_1aedc(&v0);
            v0 = i - 48;
            v4 = sub_1aedc(&v0);
            i -= 56;
        } while (i != a1);
    }
    v5 = v4;
    a0->field_8 = a1;
    return v5;
}
