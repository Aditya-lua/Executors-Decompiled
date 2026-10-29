/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaaabf4..0xaaad94 (416 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void* sub_aaabf4(void* a0, unsigned long long a1, char *a2)
{
    unsigned long long v0;  // x8
    unsigned long long v1;  // w10
    char v10;  // x13
    char v11;  // x11
    unsigned long v12;  // x14
    unsigned long long v13;  // w10
    char v14;  // x14
    char v15;  // x11
    unsigned long v16;  // x13
    unsigned long long v17;  // w10
    char v18;  // x13
    unsigned long v19;  // x14
    unsigned long long v2;  // x11
    void* v3;  // x9
    unsigned long long i;  // x8
    char *v5;  // x12
    char v6;  // x13
    char v7;  // x11
    unsigned long v8;  // x14
    unsigned long long v9;  // w10

    v0 = 0;
    v1 = 0;
    v2 = 0;
    *(uint128_t *)&a0[2] = 0xf0e0d0c0b0a09080706050403020100;
    v3 = a0 + 2;
    *(uint128_t *)&a0[18] = 0x1f1e1d1c1b1a19181716151413121110;
    *(uint128_t *)&a0[0x22] = 0x2f2e2d2c2b2a29282726252423222120;
    *(uint128_t *)&a0[50] = 0x3f3e3d3c3b3a39383736353433323130;
    *(uint128_t *)&a0[66] = 0x4f4e4d4c4b4a49484746454443424140;
    *(uint128_t *)&a0[82] = 0x5f5e5d5c5b5a59585756555453525150;
    *(uint128_t *)&a0[98] = 0x6f6e6d6c6b6a69686766656463626160;
    *(uint128_t *)&a0[114] = 0x7f7e7d7c7b7a79787776757473727170;
    *(uint128_t *)&a0[130] = 0x8f8e8d8c8b8a89888786858483828180;
    *(uint128_t *)&a0[146] = 0x9f9e9d9c9b9a99989796959493929190;
    *(uint128_t *)&a0[162] = 0xafaeadacabaaa9a8a7a6a5a4a3a2a1a0;
    *(uint128_t *)&a0[178] = 0xbfbebdbcbbbab9b8b7b6b5b4b3b2b1b0;
    *(uint128_t *)&a0[194] = 0xcfcecdcccbcac9c8c7c6c5c4c3c2c1c0;
    *(uint128_t *)&a0[210] = 0xdfdedddcdbdad9d8d7d6d5d4d3d2d1d0;
    *(uint128_t *)&a0[226] = 0xefeeedecebeae9e8e7e6e5e4e3e2e1e0;
    *(unsigned short *)a0 = 0;
    *(uint128_t *)&a0[242] = 0xfffefdfcfbfaf9f8f7f6f5f4f3f2f1f0;
    do
    {
        i = v0;
        v5 = a0 + i;
        v6 = v5[2];
        v7 = v2 + v6 + a2[v1];
        v8 = v7;
        if (v1 + 1 == a1)
            v9 = 0;
        else
            v9 = v1 + 1;
        v5[2] = *((char *)v3 + v8);
        *((char *)v3 + v8) = v6;
        v10 = v5[3];
        v11 = v7 + v10 + a2[v9];
        v12 = v11;
        if (v9 + 1 == a1)
            v13 = 0;
        else
            v13 = v9 + 1;
        v5[3] = *((char *)v3 + v12);
        *((char *)v3 + v12) = v10;
        v14 = v5[4];
        v15 = v11 + v14 + a2[v13];
        v16 = v15;
        if (v13 + 1 == a1)
            v17 = 0;
        else
            v17 = v13 + 1;
        v5[4] = *((char *)v3 + v16);
        *((char *)v3 + v16) = v14;
        v18 = v5[5];
        v2 = v18 + v15 + a2[v17];
        if (v17 + 1 == a1)
            v1 = 0;
        else
            v1 = v17 + 1;
        v19 = v2;
        v5[5] = *((char *)v3 + v19);
        *((char *)v3 + v19) = v18;
        v0 = i + 4;
    } while (i < 252);
    return a0;
}
