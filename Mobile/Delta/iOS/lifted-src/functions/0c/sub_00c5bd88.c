/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc5bd88..0xc5bee4 (348 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void* sub_c5bd88(void* a0)
{
    unsigned long long v4;  // x1
    unsigned long long i;  // x11
    unsigned long long v14;  // x25
    unsigned long long j;  // x22
    unsigned long long v16;  // x8
    unsigned long long v17;  // x8
    unsigned long long v18;  // w0
    unsigned long v19;  // x8
    unsigned long long v20;  // x26
    void* v21;  // x27
    void* v22;  // x28
    unsigned long v23;  // x21
    void* v6;  // x0
    unsigned long v24;  // x19
    unsigned long v25;  // x23
    unsigned long long v26;  // x8
    unsigned long v27;  // x8
    unsigned long long v7;  // x1
    unsigned long long v8;  // x11
    unsigned long long v9;  // x21
    void* v10;  // x8
    unsigned long v11;  // x9
    uint128_t v12;  // q0
    unsigned long v13;  // x10
    unsigned long long v0;  // [bp-0x90]
    unsigned long long v1;  // [bp-0x88]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    i = v4 + (v4 >> 1);
    v0 = v4;
    v6 = a0;
    do
    {
        v8 = i - 1;
        v9 = v8 - v7;
        if (v7 > v8)
        {
            v9 = 0;
            v10 = a0 + 24 * v8;
            v11 = (long long)a0[16];
            v12 = *(int128_t *)a0;
            v13 = (long long)v10[16];
            *(int128_t *)a0 = *(int128_t *)v10;
            *(unsigned long *)&a0[16] = v13;
            *(uint128_t *)v10 = v12;
            *(unsigned long *)&v10[16] = v11;
        }
        v1 = v8;
        if (v7 < v8)
            v14 = v7;
        else
            v14 = v8;
        j = (1 | (v9 * 2 | v9 >> 63) & 0x7ffffffffffffffe) & 0x7fffffffffffffff;
        if (v14 > j)
        {
            v16 = v9 * 2;
            do
            {
                v17 = v16 + 2;
                if (v14 > v17)
                {
                    v18 = (unsigned int)_memcmp();
                    v19 = v18;
                    if (!v18)
                        v19 = *(long long *)((char *)a0 + 24 * j + 8) - *(long long *)((char *)a0 + 24 * v17 + 8);
                    v20 = j + (v19 >> 63);
                }
                else
                {
                    v20 = j;
                }
                v21 = a0 + 24 * v9;
                v22 = a0 + 24 * v20;
                v23 = *(long long *)v21;
                v24 = (long long)v21[8];
                v25 = (long long)v22[8];
                v6 = _memcmp();
                v26 = (unsigned int)v6;
                if (!(unsigned int)v6)
                    v26 = v24 - v25;
                if ((long long)v26 >= 0)
                    break;
                *(long long *)v21 = *(long long *)v22;
                *(unsigned long *)&v21[8] = v25;
                *(unsigned long *)v22 = v23;
                *(unsigned long *)&v22[8] = v24;
                v27 = (long long)v21[16];
                *(long long *)&v21[16] = (long long)v22[16];
                *(unsigned long *)&v22[16] = v27;
                v16 = v20 * 2;
                j = (1 | (v20 * 2 | v20 >> 63) & 0x7ffffffffffffffe) & 0x7fffffffffffffff;
                v9 = v20;
            } while (j < v14);
        }
        i = v1;
        v7 = v0;
    } while (i);
    return v6;
}
