/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa80bf4..0xa80d10 (284 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a80bf4_0 {
    long long field_0;
    unsigned long long field_8;
} st_a80bf4_0;


long long sub_a80bf4(long long *a0, unsigned long long *a1, st_a80bf4_0 *a2)
{
    long long v3;  // x22
    long long v4;  // x8
    unsigned long v5;  // x23
    unsigned long v6;  // x24
    unsigned long v7;  // x9
    unsigned long i;  // x27
    unsigned long j;  // x8
    unsigned int *v10;  // x9
    unsigned int v11;  // w10
    char v0;  // [bp-0x460]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = *a0;
    if (a2->field_0)
        _bzero(a2->field_0, a2->field_8 * 0x400);
    v4 = a0[1];
    if (!v4)
        return sub_a66ec0(&v0, 0x400);
    v5 = 0;
    v6 = 0;
    v7 = a0[2];
    do
    {
        if (v7)
        {
            i = 0;
            do
            {
                sub_a80d10(v3, *a1 + i * 0x400, &v0);
                j = 0;
                v10 = a2->field_0 + v5;
                do
                {
                    v11 = *(int *)((char *)v10 + j) + *(int *)&(&v0)[j];
                    *(unsigned int *)((char *)v10 + j) = ~((int)(v11 + 0xff801fff & ~v11) >> 31) & v11 + 0xff801fff | (int)(v11 + 0xff801fff & ~v11) >> 31 & v11;
                    j += 4;
                } while (j != 0x400);
                v3 += 0x400;
                i += 1;
                v7 = a0[2];
            } while (i < (unsigned long long)a0[2]);
            v4 = a0[1];
        }
    } while ((v6 += 1, v5 += 0x400, (unsigned long long)v4 > v6));
    return sub_a66ec0(&v0, 0x400);
}
