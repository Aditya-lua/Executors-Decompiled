/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x394b8..0x39510 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_394b8_0 {
    char padding_0[16];
    struct st_394b8_0 *field_10;
} st_394b8_0;


st_394b8_0 * sub_394b8(st_394b8_0 *a0, st_394b8_0 *a1)
{
    st_394b8_0 *v3;  // x0
    st_394b8_0 *v0;  // [bp-0x28]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = a1;
    if (a0->field_10)
        return a0;
    v3 = sub_40b90(a0 + 1, &v0);
    if (v3)
    {
        a0->field_10 = v0;
        return v3;
    }
    return v3;
}
