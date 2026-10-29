/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x108e0..0x10900 (32 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_108e0_0 {
    unsigned long long field_0;
    struct st_108e0_0 *field_8;
    char padding_10[8];
    struct st_108e0_0 *field_18;
} st_108e0_0;

extern char g_e61f48;

st_108e0_0 * sub_108e0(st_108e0_0 *a0, st_108e0_0 **a1)
{
    st_108e0_0 *v0;  // x8

    a0->field_18 = 0;
    v0 = *a1;
    if (v0)
    {
        a0->field_0 = &g_e61f48;
        a0->field_8 = v0;
        a0->field_18 = a0;
    }
    return a0;
}
