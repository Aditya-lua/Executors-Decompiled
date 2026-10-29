/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a5ea0..0x1a5efc (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a5ea0_0 {
    char padding_0[912];
    struct st_1a5ea0_0 *field_390;
} st_1a5ea0_0;


st_1a5ea0_0 * sub_1a5ea0(st_1a5ea0_0 *a0, st_1a5ea0_0 *a1)
{
    st_1a5ea0_0 *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a1)
    {
        return a0;
    }
    else if (a0->field_390)
    {
        v2 = sub_962b90(a0->field_390);
        if (v2 == a1)
            return v2;
    }
}
