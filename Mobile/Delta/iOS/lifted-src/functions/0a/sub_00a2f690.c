/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2f690..0xa2f6bc (44 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a2f690_0 {
    char padding_0[8];
    struct st_a2f690_0 *field_8;
} st_a2f690_0;


st_a2f690_0 * sub_a2f690(st_a2f690_0 *a0, st_a2f690_0 *a1)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (a0 && a1)
    {
        a0->field_8 = a1;
        return 1;
    }
    v0 = &v2;
    v1 = v3;
    sub_c66d08();
    return 0;
}
