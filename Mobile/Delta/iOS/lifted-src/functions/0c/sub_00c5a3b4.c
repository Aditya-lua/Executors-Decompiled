/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc5a3b4..0xc5a4a8 (244 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_c5a3b4(unsigned long long *a0, unsigned long a1)
{
    long long v2;  // x21
    unsigned long long *i;  // x8
    void* v12;  // x8
    long long j;  // x8
    unsigned long long *v14;  // x8
    unsigned long long *v4;  // x25
    unsigned long long *v5;  // x23
    unsigned long v6;  // x20
    unsigned long v7;  // x24
    unsigned long long v8;  // x0
    long long v9;  // x8
    unsigned long v10;  // x25
    long long v11;  // x26
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = 0;
    i = a0 + 3;
    v4 = a0;
    do
    {
        v5 = i;
        v6 = v4[3];
        v7 = v4[4];
        v8 = _memcmp();
        v9 = (int)v8;
        if (!(unsigned int)v8)
            v9 = v7 - v4[1];
        if (v9 < 0)
        {
            v10 = v4[5];
            v11 = v2;
            do
            {
                v12 = (char *)a0 + v11;
                *(int128_t *)&v12[24] = *(int128_t *)v12;
                *(long long *)&v12[40] = (long long)v12[16];
                if (!v11)
                {
                    v14 = a0;
                    goto LABEL_c5a3f0;
                }
                v8 = _memcmp();
                j = (int)v8;
                if (!(unsigned int)v8)
                    j = v7 - *(long long *)((char *)v12 - 16);
                v11 -= 24;
            } while (j < 0);
            v14 = (char *)a0 + v11 + 24;
LABEL_c5a3f0:
            *v14 = v6;
            v14[1] = v7;
            v14[2] = v10;
        }
        i = v5 + 3;
        v2 += 24;
        v4 = v5;
    } while (i != &a0[3 * a1]);
    return v8;
}
