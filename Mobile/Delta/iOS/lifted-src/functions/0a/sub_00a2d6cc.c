/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2d6cc..0xa2d6f0 (36 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a2d6cc_0 {
    struct st_a2d6cc_0 *field_0;
} st_a2d6cc_0;


st_a2d6cc_0 ** sub_a2d6cc(st_a2d6cc_0 **a0)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (!a0)
    {
        v0 = &v2;
        v1 = v3;
        sub_c66b70();
        return 0;
    }
    return *a0;
}
