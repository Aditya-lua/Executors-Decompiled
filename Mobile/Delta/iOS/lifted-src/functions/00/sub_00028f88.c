/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x28f88..0x29008 (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_28f88_0 {
    char padding_0[8];
    struct st_28f88_0 *field_8;
} st_28f88_0;

typedef struct st_28f88_1 {
    char padding_0[56];
    struct st_28f88_0 *field_38;
} st_28f88_1;


st_28f88_0 * sub_28f88(st_28f88_0 *a0, st_28f88_0 *a1)
{
    st_28f88_0 *i;  // x22
    st_28f88_0 *v4;  // x0
    st_28f88_0 *v5;  // x0
    st_28f88_1 *v0;  // [bp-0x38]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    i = a0->field_8;
    v4 = a0;
    if (v4->field_8 != a1)
    {
        do
        {
            v4 = (char *)i - 0x88;
            v0 = (char *)i - 48;
            sub_1aedc(&v0);
            i = v4;
        } while (i != a1);
    }
    v5 = v4;
    a0->field_8 = a1;
    return v5;
}
