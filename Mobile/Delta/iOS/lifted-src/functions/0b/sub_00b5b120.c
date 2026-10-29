/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5b120..0xb5b12c (12 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b5b120_0 {
    char padding_0[16];
    unsigned long long field_10;
} st_b5b120_0;


st_b5b120_0 * sub_b5b120(st_b5b120_0 *a0, unsigned long a1)
{
    if (a0)
        a0->field_10 = a1;
    return a0;
}
