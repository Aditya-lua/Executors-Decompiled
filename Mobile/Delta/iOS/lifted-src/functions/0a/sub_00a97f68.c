/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa97f68..0xa97f88 (32 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a97f68_0 {
    char padding_0[16];
    uint128_t field_10;
} st_a97f68_0;


int sub_a97f68(st_a97f68_0 *a0, uint128_t *a1, unsigned long a2)
{
    if (a2 != 16)
        return 0;
    a0->field_10 = *a1;
    return 1;
}
