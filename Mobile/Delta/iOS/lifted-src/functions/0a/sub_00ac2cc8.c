/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac2cc8..0xac2cd4 (12 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ac2cc8_0 {
    char padding_0[1];
    unsigned long long field_1;
} st_ac2cc8_0;


st_ac2cc8_0 * sub_ac2cc8(st_ac2cc8_0 *a0, unsigned long a1)
{
    *(unsigned long long *)(a0->padding_0)[1] = __builtin_bswap64(a1);
    return a0;
}
