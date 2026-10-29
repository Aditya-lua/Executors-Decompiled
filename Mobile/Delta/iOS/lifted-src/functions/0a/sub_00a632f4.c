/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa632f4..0xa634a8 (436 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_a632bc;
extern char g_a634a8;

char * sub_a632f4(void* a0)
{
    char *v2;  // x19
    char *v3;  // x0
    char *v12;  // x9
    char *v13;  // x0
    char *v14;  // x0
    uint128_t v4;  // q0
    char *v5;  // x8
    unsigned long long v6;  // x10
    char *v7;  // x8
    char *v8;  // x0
    unsigned long long v9;  // x21
    char *v10;  // x0
    char *v11;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(88, "crypto/hashtable/hashtable.c", 179);
    if (!v2)
        return v2;
    v3 = sub_a7c11c();
    *(char **)&v2[48] = v3;
    if (v3)
    {
        v4 = (int128_t)a0[16];
        *(int128_t *)v2 = *(int128_t *)a0;
        *(uint128_t *)&v2[16] = v4;
        *(long long *)&v2[32] = (long long)a0[32];
        v5 = *(long long *)&v2[24];
        v6 = v5 - 1 | v5 - 1 >> 1 | (v5 - 1 | v5 - 1 >> 1) >> 2 | (v5 - 1 | v5 - 1 >> 1 | (v5 - 1 | v5 - 1 >> 1) >> 2) >> 4;
        if (!*(long long *)&v2[24])
            v7 = 16;
        else
            v7 = (v6 | v6 >> 8 | (v6 | v6 >> 8) >> 16) + 1;
        *(char **)&v2[64] = v7;
        if (!*(long long *)&v2[8])
            *(char **)&v2[8] = &g_a634a8;
        v8 = sub_a6bffc(24, "crypto/hashtable/hashtable.c", 207);
        *(char **)&v2[56] = v8;
        if (v8)
        {
            v9 = *(long long *)&v2[64] * 64;
            v10 = sub_a6c0cc(v9, 64, v8 + 8, "crypto/hashtable/hashtable.c", 160);
            if (v10 || (v10 = sub_a6bf4c(v9, "crypto/hashtable/hashtable.c", 164), *(char **)&v8[8] = v10, v10))
            {
                _bzero();
                v11 = *(long long *)&v2[56];
                v12 = *(long long *)&v2[64];
                *(char **)v11 = v10;
                *(char **)&v11[16] = v12 - 1;
                v13 = sub_a7bf38(1, *(long long *)a0);
                *(char **)&v2[40] = v13;
                if (v13)
                {
                    if (*(long long *)&v2[16])
                        return v2;
                    *(char **)&v2[16] = &g_a632bc;
                    return v2;
                }
            }
            else
            {
                *(unsigned long long *)*(long long *)&v2[56] = 0;
            }
        }
    }
    sub_a7c1d0(*(long long *)&v2[48]);
    sub_a7c0a8(*(long long *)&v2[40]);
    if (*(long long *)&v2[56])
    {
        sub_a6c2e4(*(long long *)(*(long long *)&v2[56] + 8), "crypto/hashtable/hashtable.c", 230);
        v14 = *(long long *)&v2[56];
    }
    else
    {
        v14 = 0;
    }
    sub_a6c2e4(v14, "crypto/hashtable/hashtable.c", 231);
    sub_a6c2e4(v2, "crypto/hashtable/hashtable.c", 232);
    return 0;
}
