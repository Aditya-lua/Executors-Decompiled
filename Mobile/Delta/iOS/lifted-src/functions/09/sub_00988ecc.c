/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x988ecc..0x988ef0 (36 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_988ecc_0 {
    char padding_0[16];
    unsigned long long field_10;
    char padding_18[56];
    char field_50;
} st_988ecc_0;


char sub_988ecc(st_988ecc_0 *a0, char a1)
{
    if (!(a0->field_50 & 1))
        return 0;
    if (!a1)
        return 1;
    *(unsigned long long *)a1 = a0->field_10;
    return 1;
}
