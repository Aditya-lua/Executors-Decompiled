/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbd84b8..0xbd8578 (192 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void* sub_bd84b8(void* a0, unsigned long a1)
{
    unsigned long long v4;  // x8
    void* iter;  // x10
    unsigned long v6;  // x11
    unsigned long long node;  // x12
    void* v8;  // x13
    uint128_t v9;  // q1
    uint128_t v10;  // q2
    void* v11;  // x12
    uint128_t v0;  // [bp-0x40]
    uint128_t v1;  // [bp-0x30]
    uint128_t v2;  // [bp-0x20]
    uint128_t v3;  // [bp-0x10]

    v4 = 0;
    iter = a0 + 72;
    do
    {
        v6 = *(long long *)iter;
        if ((unsigned long long)*(long long *)((char *)iter - 72) > v6)
        {
            v0 = (int128_t)iter[8];
            v1 = (int128_t)iter[24];
            v2 = (int128_t)iter[40];
            v3 = (int128_t)iter[56];
            node = v4;
            do
            {
                v8 = a0 + node;
                v9 = *(int128_t *)v8;
                *(int128_t *)&v8[88] = (int128_t)v8[16];
                v10 = (int128_t)v8[48];
                *(int128_t *)&v8[104] = (int128_t)v8[32];
                *(uint128_t *)&v8[120] = v10;
                *(long long *)&v8[0x88] = (long long)v8[64];
                *(uint128_t *)&v8[72] = v9;
                if (!node)
                {
                    v11 = a0;
                    goto LABEL_bd84d4;
                }
            } while ((node -= 72, v6 < (unsigned long long)*(long long *)((char *)v8 - 72)));
            v11 = a0 + node + 72;
LABEL_bd84d4:
            *(unsigned long *)v11 = v6;
            *(uint128_t *)&v11[8] = v0;
            *(uint128_t *)&v11[24] = v1;
            *(uint128_t *)&v11[40] = v2;
            *(uint128_t *)&v11[56] = v3;
        }
    } while ((iter += 72, v4 += 72, iter != a0 + a1 * 72));
    return a0;
}
