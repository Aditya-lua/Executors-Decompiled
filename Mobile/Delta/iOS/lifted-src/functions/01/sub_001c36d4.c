/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c36d4..0x1c36ec (24 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1c36d4_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    char padding_10[8];
    struct st_1c36d4_0 *field_18;
} st_1c36d4_0;

extern char g_e70458;

st_1c36d4_0 * sub_1c36d4(st_1c36d4_0 *a0, unsigned long long *a1)
{
    unsigned long long v0;  // x8

    v0 = *a1;
    a0->field_0 = &g_e70458;
    a0->field_8 = v0;
    a0->field_18 = a0;
    return a0;
}
