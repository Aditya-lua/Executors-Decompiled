/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x988d34..0x988d60 (44 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_988d34_0 {
    char padding_0[16];
    unsigned long long field_10;
    char padding_18[56];
    char field_50;
} st_988d34_0;


unsigned long long sub_988d34(st_988d34_0 *a0, unsigned long a1)
{
    unsigned long v0;  // x8

    v0 = a0->field_50;
    if (!(v0 & 1))
    {
        return 0;
    }
    else if (a0->field_10 == a1)
    {
        a0->field_50 = (char)v0 | 2;
        return 1;
    }
    else
    {
        return 0;
    }
}
