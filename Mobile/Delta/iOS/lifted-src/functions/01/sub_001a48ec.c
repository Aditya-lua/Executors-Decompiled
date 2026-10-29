/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a48ec..0x1a490c (32 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a48ec_0 {
    unsigned long long field_0;
    struct st_1a48ec_0 *field_8;
    char padding_10[8];
    struct st_1a48ec_0 *field_18;
} st_1a48ec_0;

extern char g_e6ff18;

st_1a48ec_0 * sub_1a48ec(st_1a48ec_0 *a0, st_1a48ec_0 **a1)
{
    st_1a48ec_0 *v0;  // x8

    a0->field_18 = 0;
    v0 = *a1;
    if (v0)
    {
        a0->field_0 = &g_e6ff18;
        a0->field_8 = v0;
        a0->field_18 = a0;
    }
    return a0;
}
