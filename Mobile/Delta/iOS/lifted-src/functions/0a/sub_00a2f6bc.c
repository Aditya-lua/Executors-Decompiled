/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2f6bc..0xa2f6e8 (44 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a2f6bc_0 {
    char padding_0[16];
    struct st_a2f6bc_0 *field_10;
} st_a2f6bc_0;


st_a2f6bc_0 * sub_a2f6bc(st_a2f6bc_0 *a0, st_a2f6bc_0 *a1)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (a0 && a1)
    {
        a0->field_10 = a1;
        return 1;
    }
    v0 = &v2;
    v1 = v3;
    sub_c66d38();
    return 0;
}
