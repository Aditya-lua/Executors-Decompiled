/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbfbb08..0xbfbc00 (248 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


double sub_bfbb08(void* a0, void* a1, unsigned long long a2)
{
    unsigned long long v0;  // x8
    uint128_t v1;  // q0
    void* v10;  // x9
    void* v11;  // x10
    unsigned long long v12;  // x8
    unsigned int v13;  // w8
    unsigned short v14;  // x11
    char v15;  // x11
    uint128_t v2;  // q1
    uint128_t v3;  // q3
    unsigned long long v4;  // x9
    unsigned long v5;  // x10
    unsigned long v6;  // x10
    unsigned long v7;  // x10
    unsigned long v8;  // x9
    unsigned long long v9;  // x10

    v0 = a2 & 7;
    if (a2 < 32 || a1 + 32 > a0 && a0 + 32 > a1)
    {
        v4 = a2 >> 3;
        v5 = *(long long *)a0;
        *(long long *)a0 = *(long long *)a1;
        *(unsigned long *)a1 = v5;
        v6 = (long long)a0[8];
        *(long long *)&a0[8] = (long long)a1[8];
        *(unsigned long *)&a1[8] = v6;
        if (v4 != 2)
        {
            v7 = (long long)a0[16];
            *(long long *)&a0[16] = (long long)a1[16];
            *(unsigned long *)&a1[16] = v7;
            if (v4 != 3)
            {
                v8 = (long long)a0[24];
                *(long long *)&a0[24] = (long long)a1[24];
                *(unsigned long *)&a1[24] = v8;
            }
        }
        if (v0)
            goto LABEL_bfbb84;
    }
    else
    {
        v1 = *(int128_t *)a0;
        v2 = (int128_t)a0[16];
        v3 = (int128_t)a1[16];
        *(int128_t *)a0 = *(int128_t *)a1;
        *(uint128_t *)&a0[16] = v3;
        *(uint128_t *)a1 = v1;
        *(uint128_t *)&a1[16] = v2;
        if (v0)
        {
LABEL_bfbb84:
            v9 = a2 & 56;
            v10 = a0 + v9;
            v11 = a1 + v9;
            if (4 > v0)
            {
                v12 = 0;
                if (a2 >> 1 & 1)
                    goto LABEL_bfbbbc;
            }
            else
            {
                v13 = *(int *)v10;
                *(int *)v10 = *(int *)v11;
                *(unsigned int *)v11 = v13;
                v12 = 4;
                if (a2 >> 1 & 1)
                {
LABEL_bfbbbc:
                    v14 = *(short *)((char *)v10 + v12);
                    *(short *)((char *)v10 + v12) = *(short *)((char *)v11 + v12);
                    *(unsigned short *)((char *)v11 + v12) = v14;
                    v12 |= 2;
                }
            }
            if (a2 & 1)
            {
                v15 = *((char *)v10 + v12);
                *((char *)v10 + v12) = *((char *)v11 + v12);
                *((char *)v11 + v12) = v15;
                return *(unsigned long long *)&v1;
            }
        }
    }
    return *(unsigned long long *)&v1;
}
