/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbea10c..0xbea21c (272 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_98967f;

long long sub_bea10c(unsigned long long a0, void* a1)
{
    unsigned long long iter;  // x9
    unsigned long long v1;  // x17
    unsigned long long i;  // x17
    void* v3;  // x2
    unsigned long long v4;  // x10
    unsigned int v5;  // w3
    unsigned int v6;  // w4
    unsigned long long v7;  // x11

    if (a0 >= 1000)
    {
        iter = 20;
        v1 = a0;
        do
        {
            i = v1;
            v3 = a1 + 19 + iter;
            iter -= 4;
            v4 = i / 10000;
            v5 = (unsigned int)i - 10000 * (unsigned int)v4;
            v6 = 5243 * ((v5 * 0x40000000 | v5 >> 2) & 0xc0003fff & 0x3fff) >> 0x11;
            *(short *)((char *)v3 - 23) = *(short *)(2 * v6 + 14721940);
            *(short *)((char *)v3 - 21) = *(short *)(2 * (v5 - 100 * v6 & 0xffff) + 14721940);
            v1 = v4;
        } while (&g_98967f < i);
        if (v4 > 9)
            goto LABEL_bea198;
    }
    else
    {
        iter = 20;
        v4 = a0;
        if (9 < a0)
        {
LABEL_bea198:
            iter -= 2;
            v7 = 5243 * (__ROL__((unsigned int)v4, 30) & 0xc0003fff & 0x3fff) >> 0x11;
            *(short *)((char *)a1 + iter) = *(short *)(2 * ((unsigned int)v4 - 100 * (unsigned int)v7 & 0xffff) + 14721940);
            v4 = v7;
        }
    }
    if (a0 && !v4)
        return a1 + iter;
    *((char *)a1 + iter - 1) = *(char *)(((v4 * 2 | v4 >> 63) & 30 & 31) + 14721941);
    return a1 + iter - 1;
}
