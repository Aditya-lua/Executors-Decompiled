/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac2c58..0xac2c64 (12 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ac2c58_0 {
    char padding_0[8];
    unsigned long long field_8;
} st_ac2c58_0;


st_ac2c58_0 * sub_ac2c58(st_ac2c58_0 *a0, unsigned long a1)
{
    a0->field_8 = __builtin_bswap64(a1);
    return a0;
}
