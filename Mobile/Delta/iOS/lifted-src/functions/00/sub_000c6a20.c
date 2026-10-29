/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc6a20..0xc6a78 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c6a20_0 {
    char padding_0[4];
    unsigned int field_4;
} st_c6a20_0;


unsigned long long sub_c6a20(st_c6a20_0 *a0, unsigned int a1)
{
    unsigned long long v0;  // x8
    unsigned long long v1;  // w9
    unsigned long long v2;  // w11
    char v3;  // x10
    unsigned int v4;  // w13

    if (!a1)
        return 0;
    v0 = 0;
    v1 = 0;
    v2 = 0;
    v3 = a0->field_4;
    do
    {
        v4 = a0[1 + v2].padding_0[2];
        if (v4 < (unsigned int)v0)
            v0 &= 0xffffffff;
        else
            v0 = v4 & 0xff;
        if (v4 > 22)
            v1 += 1;
        v2 += 1;
    } while (!(v2 >> (v3 & 31)));
    return v1 << ((char)(8 - v3) & 31) | v0 * 0x100000000;
}
