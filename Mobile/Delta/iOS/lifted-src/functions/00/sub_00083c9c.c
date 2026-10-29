/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x83c9c..0x83cec (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_83c9c_0 {
    unsigned long long field_0;
    char padding_8[64];
    unsigned int field_48;
    unsigned int field_4c;
} st_83c9c_0;


unsigned long long sub_83c9c(st_83c9c_0 *a0, unsigned short *a1)
{
    unsigned int v0;  // w9
    unsigned int v1;  // w10
    unsigned long v2;  // x8

    v0 = a1[2];
    v1 = a1[3];
    v2 = v1 + 3;
    if (a0->field_4c == (unsigned int)((char *)a1 - a0->field_0 >> 3))
    {
        if (a0->field_48 == 1)
            v0 |= 0x10000;
        else
            v0 &= 0xffff;
        if (a0->field_48 == 2)
            v2 = v1 + 65539;
        else
            v2 &= 0xffffffff;
    }
    return v0 | v2 * 0x100000000;
}
