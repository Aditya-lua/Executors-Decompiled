/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1ad984..0x1ad99c (24 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1ad984_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    char padding_10[8];
    struct st_1ad984_0 *field_18;
} st_1ad984_0;

extern char g_e70380;

st_1ad984_0 * sub_1ad984(st_1ad984_0 *a0, unsigned long long *a1)
{
    unsigned long long v0;  // x8

    v0 = *a1;
    a0->field_0 = &g_e70380;
    a0->field_8 = v0;
    a0->field_18 = a0;
    return a0;
}
