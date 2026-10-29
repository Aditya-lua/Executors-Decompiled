/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa80e88..0xa80fd4 (332 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a80e88_0 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
} st_a80e88_0;

extern char g_7fe001;
extern st_a80e88_0 g_def6d8;

unsigned int * sub_a80e88(unsigned int *a0)
{
    unsigned int v0;  // w13
    unsigned long long v1;  // x10
    unsigned int v10;  // w6
    unsigned int v11;  // w7
    unsigned long v12;  // x6
    unsigned int v13;  // w6
    unsigned long long i;  // x9
    unsigned int v15;  // w13
    unsigned long long j;  // x14
    unsigned long long v3;  // x15
    unsigned long long v4;  // x10
    unsigned int *v5;  // x2
    unsigned int v6;  // w13
    unsigned long v7;  // x1
    unsigned int v8;  // w4
    unsigned long long iter;  // x5

    v0 = 1;
    v1 = 0x100;
    do
    {
        j = 0;
        v3 = 0;
        v4 = (unsigned int)v1 >> 1;
        v5 = &a0[v0];
        v6 = v0 * 2;
        v7 = v6;
        do
        {
            v8 = (&g_def6d8.field_0)[~j + ((unsigned int)v1 & 0x1fe)];
            iter = v3;
            do
            {
                v10 = a0[iter];
                v11 = v5[iter];
                a0[iter] = ~((int)(v11 + v10 + 0xff801fff & ~(v11 + v10)) >> 31) & v11 + v10 + 0xff801fff | (int)(v11 + v10 + 0xff801fff & ~(v11 + v10)) >> 31 & v11 + v10;
                v12 = (unsigned int)&(&g_7fe001)[-1 * v8] * &(&g_7fe001)[v10 + -1 * v11];
                v13 = v12 + 0x7fe001 * (0xfc7fdfff * (unsigned int)v12) >> 32;
                v5[iter] = v13 + 0xff801fff & ~((int)(v13 + 0xff801fff & ~v13) >> 31) | (int)(v13 + 0xff801fff & ~v13) >> 31 & v13;
                iter += 1;
            } while ((long long)iter < (long long)(v3 + v0));
            v3 += v7;
            j += 1;
        } while (j != v4);
        v0 = v6;
        v1 = v4;
    } while ((int)v7 < 0x100);
    i = 0;
    do
    {
        v15 = *(int *)((char *)a0 + i) * 41978 + 0x7fe001 * (8395782 * *(int *)((char *)a0 + i)) >> 32;
        *(unsigned int *)((char *)a0 + i) = v15 + 0xff801fff & ~((int)(v15 + 0xff801fff & ~v15) >> 31) | (int)(v15 + 0xff801fff & ~v15) >> 31 & v15;
        i += 4;
    } while (i != 0x400);
    return a0;
}
