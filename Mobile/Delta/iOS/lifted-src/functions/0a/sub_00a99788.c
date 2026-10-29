/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa99788..0xa997a4 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a99788_0 {
    char padding_0[8];
    struct st_a99788_0 *field_8;
} st_a99788_0;


st_a99788_0 * sub_a99788(void)
{
    st_a99788_0 *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a99624();
    if (!v2)
        return v2;
    return v2->field_8;
}
