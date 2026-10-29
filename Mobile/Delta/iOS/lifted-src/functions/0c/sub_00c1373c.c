/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc1373c..0xc1386c (304 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c1373c_1 {
    char padding_0[1];
    unsigned short field_1;
} st_c1373c_1;

typedef struct st_c1373c_0 {
    unsigned long long field_0;
} st_c1373c_0;

extern unsigned long long g_98967f;

long long sub_c1373c(st_c1373c_0 **a0, long long a1)
{
    unsigned long long v3;  // x9
    st_c1373c_1 *iter;  // x11
    unsigned long long v5;  // x10
    unsigned long long i;  // x17
    unsigned int v7;  // w0
    unsigned int v8;  // w2
    unsigned long long node;  // x10
    unsigned long long v10;  // x11
    uint224_t v0;  // [bp-0x24]
    uint96_t v1;  // [bp-0x14]
    char v2;  // [bp+0x0]

    v1 = _INSERT(*(uint96_t *)((void*)&v0 + 4), 4, &v2);
    v3 = *(long long *)*a0;
    if (v3 >= 1000)
    {
        iter = (char *)&v1 + 3;
        v5 = 0xffffffffffffffec;
        do
        {
            i = v3;
            v3 /= 10000;
            v7 = (unsigned int)i - 10000 * (unsigned int)v3;
            v8 = 5243 * ((v7 * 0x40000000 | v7 >> 2) & 0xc0003fff & 0x3fff) >> 0x11;
            *(short *)((char *)iter - 3) = *(short *)(2 * v8 + 14721940);
            *(short *)((char *)iter - 1) = *(short *)(2 * (v7 - 100 * v8 & 0xffff) + 14721940);
            v5 += 4;
            iter = (char *)iter - 4;
        } while (&g_98967f < i);
        node = -v5;
        if (9 < v3)
            goto LABEL_c137f0;
    }
    else
    {
        node = 20;
        if (v3 > 9)
        {
LABEL_c137f0:
            node -= 2;
            v10 = 5243 * (__ROL__((unsigned int)v3, 30) & 0xc0003fff & 0x3fff) >> 0x11;
            *(short *)((char *)&v0 + node) = *(short *)(2 * ((unsigned int)v3 - 100 * (unsigned int)v10 & 0xffff) + 14721940);
            v3 = v10;
        }
    }
    if (v3)
    {
        node -= 1;
        *((char *)&v0 + node) = *(char *)(((v3 * 2 | v3 >> 63) & 30 & 31) + 14721941);
    }
    return sub_be8310(a1, 1, 1, 0, (char *)&v0 + node, 20 - node);
}
