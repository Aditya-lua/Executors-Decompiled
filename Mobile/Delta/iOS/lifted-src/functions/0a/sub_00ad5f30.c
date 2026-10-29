/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad5f30..0xad5f4c (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ad5f30_0 {
    char padding_0[16];
    unsigned int field_10;
    char padding_14[4];
    unsigned long long field_18;
} st_ad5f30_0;


unsigned long long sub_ad5f30(st_ad5f30_0 *a0, unsigned long long a1)
{
    unsigned long long v0;  // x0

    v0 = a0->field_18;
    if (v0 != a1)
        a0->field_10 = 0;
    a0->field_18 = a1;
    return v0;
}
