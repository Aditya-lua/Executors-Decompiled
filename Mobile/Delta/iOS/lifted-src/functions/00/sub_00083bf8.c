/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x83bf8..0x83c9c (164 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char _NSHomeDirectory;

unsigned long long sub_83bf8(unsigned short *a0, unsigned int *a1, unsigned int a2)
{
    unsigned int v0;  // w8
    unsigned long long v1;  // x9
    unsigned int v2;  // w10
    unsigned long v3;  // x9
    unsigned int v4;  // w15

    v0 = *a0;
    v1 = 1 << ((char)(v0 - 1) & 31);
    if (!v0)
        v1 = 1;
    if (a2 > a0[1])
        return 0xffffffffffffffff;
    v2 = 0;
    v3 = 0;
    while (1)
    {
        if (a1[v2])
        {
            v4 = (((unsigned int)(*(int *)&a0[4 + 4 * v2 + 2 * v1]) >> 16) + 1) * 0x100 - ((((unsigned int)(*(int *)&a0[4 + 4 * v2 + 2 * v1]) >> 16) + 1) * &_NSHomeDirectory - (*(int *)&a0[4 + 4 * v2 + 2 * v1] + (1 << ((char)v0 & 31))) * 0x100 >> ((char)v0 & 31));
            if (v0 * 0x100 + 0x100 <= v4)
                return 0xffffffffffffffff;
            v3 += a1[v2] * v4;
        }
        v2 += 1;
        if (a2 < v2)
            return v3 >> 8;
    }
}
