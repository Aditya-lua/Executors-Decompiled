/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x10780..0x107a4 (36 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_10780_0 {
    char padding_0[16];
    unsigned long long field_10;
} st_10780_0;


st_10780_0 * sub_10780(st_10780_0 *a0, unsigned long long a1)
{
    unsigned long long v0;  // x8

    v0 = a0->field_10;
    if (v0 != a1)
        a0->field_10 = v0 + (a1 - v0 + 7 & 0xfffffffffffffff8);
    return a0;
}
