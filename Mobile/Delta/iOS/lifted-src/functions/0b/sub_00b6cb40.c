/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb6cb40..0xb6cca8 (360 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b6cb40_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned int field_10;
} st_b6cb40_0;

extern long long g_efac50;

double sub_b6cb40(void* a0, void* a1)
{
    unsigned long v2;  // x8
    unsigned long v3;  // x9
    unsigned long v12;  // x15
    unsigned long long *v13;  // x4
    unsigned int *v14;  // x3
    unsigned long v15;  // x3
    unsigned int *v16;  // x3
    st_b6cb40_0 *v17;  // x4
    uint128_t v18;  // q0
    uint128_t v19;  // q1
    uint128_t v21;  // q1
    unsigned long v4;  // x12
    unsigned long v5;  // x10
    unsigned long long *v6;  // x16
    unsigned long v7;  // x11
    unsigned int *v8;  // x13
    unsigned long v9;  // x13
    unsigned int *v10;  // x13
    unsigned long v11;  // x14
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = *(long long *)a1;
    v3 = (long long)a1[8];
    v4 = (int)a1[20];
    v5 = (int)a1[24];
    v6 = (long long)a1[32];
    v7 = (int)a1[16];
    while (1)
    {
        if (v3 > v7)
        {
            v8 = v2 + 48 * v7;
            v7 = v8[8];
            *(unsigned int *)&a1[16] = v7;
            v9 = v8[11];
        }
        else
        {
            do
            {
                if (v3 <= v4)
                {
                    v18 = *(int128_t *)a1;
                    v21 = (int128_t)a1[16];
                    *(uint128_t *)a0 = v18;
                    *(uint128_t *)&a0[16] = v21;
                    *(long long *)&a0[32] = (long long)a1[32];
                    *(unsigned int *)&a0[40] = 2;
                    return *(unsigned long long *)&v18;
                }
            } while ((v10 = v2 + 48 * v4, v4 = v10[9], v9 = v10[10], *(unsigned int *)&a1[20] = v4, v9 == v5));
        }
        v11 = v6[5];
        if (v11 <= v9)
            sub_c73c64(&g_efac50);
        v12 = v6[4];
        v13 = v12 + v9 * 32;
        if (*v13 == 0x8000000000000000)
        {
            sub_c73c64(&g_efac50);
        }
        else if (v13[2] && *(long long *)(v13[1] + 264 * v13[2] - 240) == 22)
        {
            while (1)
            {
                if (v3 > v7)
                {
                    v14 = v2 + 48 * v7;
                    v7 = v14[8];
                    *(unsigned int *)&a1[16] = v7;
                    v15 = v14[11];
                }
                else
                {
                    do
                    {
                        if (v3 <= v4)
                        {
                            *(unsigned int *)a0 = v9;
                            *(unsigned int *)&a0[40] = 3;
                            return *(unsigned long long *)&v18;
                        }
                    } while ((v16 = v2 + 48 * v4, v4 = v16[9], v15 = v16[10], *(unsigned int *)&a1[20] = v4, v15 == v5));
                }
                if (v11 <= v15)
                    sub_c73c64(&g_efac50);
                v17 = v12 + v15 * 32;
                if (v17->field_0 == 0x8000000000000000)
                {
                    sub_c73c64(&g_efac50);
                }
                else if (*(long long *)&v17->field_10 && *(long long *)(v17->field_8 + 264 * *(long long *)&v17->field_10 - 240) == 22)
                {
                    v18 = *(int128_t *)a1;
                    v19 = (int128_t)a1[16];
                    *(uint128_t *)a0 = v18;
                    *(uint128_t *)&a0[16] = v19;
                    *(long long *)&a0[32] = (long long)a1[32];
                    *(unsigned int *)&a0[40] = 0;
                    *(unsigned long long *)&a0[44] = v9 | v15 * 0x100000000;
                    return *(unsigned long long *)&v18;
                }
            }
        }
    }
}
