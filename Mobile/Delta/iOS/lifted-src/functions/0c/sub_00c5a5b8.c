/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc5a5b8..0xc5a670 (184 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void* sub_c5a5b8(void* a0, unsigned long a1)
{
    unsigned long long v2;  // x8
    void* v3;  // x11
    void* v12;  // x13
    void* v4;  // x12
    void* v5;  // x10
    unsigned long v6;  // x11
    unsigned long long v7;  // x13
    unsigned long long v8;  // x12
    void* v9;  // x13
    uint128_t v10;  // q1
    void* v11;  // x12
    uint128_t v0;  // [bp-0x20]
    uint128_t v1;  // [bp-0x10]

    v2 = 0;
    v3 = a0 + 40;
    v4 = a0;
    do
    {
        v5 = v3;
        v6 = (long long)v4[56];
        if ((unsigned long long)(long long)v4[16] > v6)
        {
            v0 = (int128_t)v4[64];
            v1 = *(int128_t *)v5;
            v7 = v2;
            do
            {
                v8 = v7;
                v9 = a0 + v7;
                v10 = (int128_t)v9[16];
                *(int128_t *)&v9[40] = *(int128_t *)v9;
                *(uint128_t *)&v9[56] = v10;
                *(long long *)&v9[72] = (long long)v9[32];
                if (!v8)
                {
                    v11 = v9 + 40;
                    v12 = a0;
                    goto LABEL_c5a5dc;
                }
            } while ((v7 = v8 - 40, v6 < (unsigned long long)*(long long *)((char *)v9 - 24)));
            v11 = a0 + v8 + 40;
            v12 = a0 + v7 + 40;
LABEL_c5a5dc:
            *(uint128_t *)v12 = v1;
            *(unsigned long *)((char *)v11 - 24) = v6;
            *(uint128_t *)((char *)v11 - 16) = v0;
        }
    } while ((v3 = v5 + 40, v2 += 40, v4 = v5, v3 != a0 + a1 * 40));
    return a0;
}
