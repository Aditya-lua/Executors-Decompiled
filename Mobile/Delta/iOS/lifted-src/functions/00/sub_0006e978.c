/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6e978..0x6ea7c (260 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void* sub_6e978(void* a0, unsigned long a1, unsigned long long a2)
{
    unsigned long long v0;  // x8
    unsigned long long v1;  // x9
    unsigned long v2;  // x8
    unsigned long v3;  // x10
    unsigned int v4;  // w10

    *(unsigned long *)a0 = a1;
    *(unsigned long long *)&a0[8] = a2;
    v0 = a2 / 30;
    if (!(a2 - v0 * 30))
        v1 = v0;
    else
        v1 = v0 + 1;
    v2 = a2 / v1;
    *(unsigned long *)&a0[16] = v2;
    *(unsigned long long *)&a0[24] = v1;
    if (v2 < 32)
        v3 = 0xffffffff << ((char)v2 & 31) & 0x7ffffffe;
    else
        v3 = 0;
    *(unsigned int *)&a0[40] = v3;
    if (((unsigned int)v3 ^ 0x7ffffffe) > v3 / v1)
    {
        v1 += 1;
        v2 = a2 / v1;
        *(unsigned long *)&a0[16] = v2;
        *(unsigned long long *)&a0[24] = v1;
        if (31 < v2)
        {
            *(unsigned long *)&a0[32] = v1 + -a2 + v1 * v2;
            *(unsigned long long *)&a0[40] = 0;
            *(unsigned int *)&a0[48] = 0xffffffff >> ((char)-(unsigned int)v2 & 31);
            *(unsigned int *)&a0[52] = 0xffffffff;
            return a0;
        }
        *(unsigned int *)&a0[40] = 0xffffffff << ((char)v2 & 31) & 0x7ffffffe;
    }
    *(unsigned long long *)&a0[32] = v1 + -a2 + v1 * a2 / v1;
    if (31 <= v2)
    {
        *(unsigned int *)&a0[44] = 0;
        *(unsigned int *)&a0[48] = 0xffffffff >> ((char)-(unsigned int)v2 & 31);
        *(unsigned int *)&a0[52] = 0xffffffff;
        return a0;
    }
    if (!v2)
        v4 = 0;
    else
        v4 = 0xffffffff >> ((char)-(unsigned int)v2 & 31);
    *(unsigned int *)&a0[44] = 0xfffffffe << ((char)v2 & 31) & 0x7ffffffe;
    *(unsigned int *)&a0[48] = v4;
    *(unsigned int *)&a0[52] = 0xffffffff >> ((char)~(unsigned int)v2 & 31);
    return a0;
}
