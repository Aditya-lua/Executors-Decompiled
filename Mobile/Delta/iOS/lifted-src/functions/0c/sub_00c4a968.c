/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc4a968..0xc4aa0c (164 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void* sub_c4a968(void* a0, unsigned long a1)
{
    unsigned long long v1;  // x8
    void* v2;  // x11
    void* v11;  // x13
    void* v12;  // x14
    void* v3;  // x12
    void* v4;  // x10
    unsigned long v5;  // x11
    unsigned long v6;  // x12
    unsigned long long v7;  // x14
    unsigned long long v8;  // x13
    void* v9;  // x14
    uint128_t v10;  // q1
    uint128_t v0;  // [bp-0x10]

    v1 = 0;
    v2 = a0 + 32;
    v3 = a0;
    do
    {
        v4 = v2;
        v5 = (long long)v3[48];
        if ((unsigned long long)(long long)v3[16] > v5)
        {
            v0 = *(int128_t *)v4;
            v6 = (long long)v3[56];
            v7 = v1;
            do
            {
                v8 = v7;
                v9 = a0 + v7;
                v10 = (int128_t)v9[16];
                *(int128_t *)&v9[32] = *(int128_t *)v9;
                *(uint128_t *)&v9[48] = v10;
                if (!v8)
                {
                    v11 = v9 + 32;
                    v12 = a0;
                    goto LABEL_c4a988;
                }
            } while ((v7 = v8 - 32, v5 < (unsigned long long)*(long long *)((char *)v9 - 16)));
            v11 = a0 + v8 + 32;
            v12 = a0 + v7 + 32;
LABEL_c4a988:
            *(uint128_t *)v12 = v0;
            *(unsigned long *)((char *)v11 - 16) = v5;
            *(unsigned long *)((char *)v11 - 8) = v6;
        }
    } while ((v2 = v4 + 32, v1 += 32, v3 = v4, v2 != a0 + a1 * 32));
    return a0;
}
