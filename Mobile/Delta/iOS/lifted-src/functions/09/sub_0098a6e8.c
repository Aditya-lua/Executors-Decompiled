/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98a6e8..0x98a710 (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_98a6e8_0 {
    char padding_0[144];
    unsigned long long field_90;
    unsigned long long field_98;
    unsigned long long field_a0;
    char field_a8;
} st_98a6e8_0;


unsigned int sub_98a6e8(st_98a6e8_0 *a0, unsigned long long *a1, unsigned long long *a2, unsigned long long *a3)
{
    unsigned long v0;  // x8
    unsigned long long v1;  // x9

    v0 = a0->field_a8;
    if (v0 >> 1 & 1)
    {
        *a2 = a0->field_a0;
        v1 = a0->field_90;
        *a1 = a0->field_98;
        *a3 = v1;
        v0 = a0->field_a8;
    }
    return __ROL__((unsigned int)v0, 31) & 0x80000001 & 1;
}
