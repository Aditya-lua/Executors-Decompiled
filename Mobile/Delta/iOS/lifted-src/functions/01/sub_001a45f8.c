/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a45f8..0x1a4660 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a45f8_0 {
    char padding_0[8];
    struct st_1a45f8_0 *field_8;
} st_1a45f8_0;


st_1a45f8_0 * sub_1a45f8(st_1a45f8_0 *a0, st_1a45f8_0 *a1)
{
    st_1a45f8_0 *v2;  // x22
    st_1a45f8_0 *i;  // x0
    st_1a45f8_0 *v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_8;
    i = a0;
    if (i->field_8 != a1)
    {
        do
        {
            v2 = (char *)v2 - 96;
            i = v2;
        } while (i != a1);
    }
    v4 = i;
    a0->field_8 = a1;
    return v4;
}
