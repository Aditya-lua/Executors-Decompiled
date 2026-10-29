/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa80d70..0xa80e88 (280 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a80d70_0 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
} st_a80d70_0;

extern char g_7fe001;
extern st_a80d70_0 g_def6d8;

unsigned int * sub_a80d70(unsigned int *a0)
{
    unsigned int v0;  // w8
    unsigned int v1;  // x16
    unsigned int v10;  // w6
    unsigned int v11;  // w6
    unsigned int v2;  // x13
    unsigned long i;  // x14
    unsigned long v4;  // x15
    unsigned long v5;  // x17
    void* v6;  // x1
    unsigned long long iter;  // x4
    unsigned int v8;  // w5
    unsigned long v9;  // x6

    v0 = 1;
    v1 = 0x100;
    do
    {
        v2 = v1 >> 1;
        if ((int)v0 >= 1)
        {
            i = 0;
            v4 = 0;
            v5 = v0;
            v6 = &a0[v2 & 0xffffffff];
            do
            {
                iter = v4;
                do
                {
                    v8 = a0[iter];
                    v9 = *(int *)((char *)v6 + 4 * iter) * (&g_def6d8.field_0)[v5 + i];
                    v10 = v9 + (0xfc7fdfff * (unsigned int)v9) * 0x7fe001 >> 32;
                    v11 = v10 + 0xff801fff & ~((int)(v10 + 0xff801fff & ~v10) >> 31) | (int)(v10 + 0xff801fff & ~v10) >> 31 & v10;
                    a0[iter] = v11 + v8 + 0xff801fff & ~((int)(v11 + v8 + 0xff801fff & ~(v11 + v8)) >> 31) | v11 + v8 & (int)(v11 + v8 + 0xff801fff & ~(v11 + v8)) >> 31;
                    *(unsigned int *)((char *)v6 + 4 * iter) = v8 - v11 & ~((long long)(v8 - v11 & ~&(&g_7fe001)[v8 + -1 * v11]) >> 31) | &(&g_7fe001)[v8 + -1 * v11] & (long long)(v8 - v11 & ~&(&g_7fe001)[v8 + -1 * v11]) >> 31;
                    iter += 1;
                } while (iter < v4 + v2);
                v4 += v1 & 0x1fe;
                i += 1;
            } while (i != v5);
        }
    } while ((v0 *= 2, v1 = v2, 0x100 > (int)v0));
    return a0;
}
