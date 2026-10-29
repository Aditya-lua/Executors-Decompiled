/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x31a80..0x31a98 (24 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_31a80_0 {
    char padding_0[752];
    unsigned long long field_2f0;
} st_31a80_0;


st_31a80_0 * sub_31a80(st_31a80_0 *a0, unsigned int a1)
{
    *(char *)(a0->field_2f0 + a1 * 32 + 28) = 1;
    return a0;
}
