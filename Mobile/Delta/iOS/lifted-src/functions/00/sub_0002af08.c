/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2af08..0x2af88 (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2af08_0 {
    char padding_0[16];
    struct st_2af08_0 *field_10;
} st_2af08_0;

typedef struct st_2af08_1 {
    char padding_0[64];
    struct st_2af08_0 *field_40;
} st_2af08_1;


st_2af08_0 * sub_2af08(st_2af08_0 *a0, st_2af08_0 *i)
{
    st_2af08_0 *v3;  // x22
    st_2af08_0 *v4;  // x22
    st_2af08_1 *v0;  // [bp-0x38]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = a0->field_10;
    if (a0->field_10 == i)
        return a0;
    do
    {
        v4 = v3;
        a0->field_10 = (char *)v4 - 0x88;
        v0 = (char *)v4 - 48;
        sub_1aedc(&v0);
        v3 = a0->field_10;
    } while (a0->field_10 != i);
    return (char *)v4 - 0x88;
}
