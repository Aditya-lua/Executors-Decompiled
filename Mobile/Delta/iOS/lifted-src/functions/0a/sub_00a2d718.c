/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2d718..0xa2d73c (36 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a2d718_0 {
    char padding_0[32];
    struct st_a2d718_0 *field_20;
} st_a2d718_0;


st_a2d718_0 * sub_a2d718(st_a2d718_0 *a0)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (!a0)
    {
        v0 = &v2;
        v1 = v3;
        sub_c66bd0();
        return 0;
    }
    return a0->field_20;
}
