/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a93cc..0x1a93e4 (24 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a93cc_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    char padding_10[8];
    struct st_1a93cc_0 *field_18;
} st_1a93cc_0;

extern char g_e6ffa8;

st_1a93cc_0 * sub_1a93cc(st_1a93cc_0 *a0, unsigned long long *a1)
{
    unsigned long long v0;  // x8

    v0 = *a1;
    a0->field_0 = &g_e6ffa8;
    a0->field_8 = v0;
    a0->field_18 = a0;
    return a0;
}
