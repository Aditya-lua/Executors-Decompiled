/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaaa3dc..0xaaa590 (436 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_df6c5d;

void* sub_aaa3dc(void* a0, unsigned long long a1, void* a2, unsigned long long a3)
{
    unsigned long long v0;  // x11
    unsigned long long v1;  // w9
    unsigned long long v10;  // x15
    void* v11;  // x13
    unsigned long long v13;  // 4112
    void* iter;  // x13
    void* v15;  // x14
    unsigned long long i;  // x12
    unsigned long long v17;  // x12
    void* v18;  // x14
    unsigned long long v2;  // x12
    char v20;  // x12
    unsigned long long j;  // x10
    void* iter1;  // x11
    unsigned long long v23;  // x10
    char v24;  // x12
    unsigned long long v26;  // x10
    unsigned long long v27;  // x11
    char v28;  // x9
    unsigned long long k;  // x11
    uint128_t v3;  // q1
    char *v30;  // x12
    unsigned long long v31;  // x11
    char v32;  // x9
    unsigned long long v34;  // x9
    unsigned long long v35;  // x8
    unsigned long long v36;  // x9
    uint128_t v4;  // q1
    uint128_t v5;  // q1
    uint128_t v6;  // q1
    unsigned long long v7;  // x15
    void* v8;  // x13
    void* node;  // x14

    *(char *)a0 = 0;
    if (a1 < 128)
        v0 = a1;
    else
        v0 = 128;
    if (a3 < 0x400)
        v1 = a3;
    else
        v1 = 0x400;
    if (a3 < 1)
        v1 = 0x400;
    if (a1 >= 1)
    {
        v2 = 0;
        if (a1 >= 8 && a0 - a2 >= 32)
        {
            if (32 > a1)
            {
                v2 = 0;
LABEL_aaa484:
                v7 = v2;
                v2 = v0 & 248;
                v8 = a2 + v7;
                node = a0 + v7;
                v10 = v7 - v2;
                do
                {
                    v11 = v8 + 8;
                    *(double *)node = *(double *)v8;
                    node += 8;
                    v13 = arm64g_calculate_condition(18, v10, 8, 0);
                    v8 = v11;
                    v10 += 8;
                } while (v13 & 1);
                if (v2 == v0)
                    goto LABEL_aaa4cc;
            }
            else
            {
                v2 = v0 & 224;
                v3 = (int128_t)a2[16];
                *(int128_t *)a0 = *(int128_t *)a2;
                *(uint128_t *)&a0[16] = v3;
                if (v2 != 32)
                {
                    v4 = (int128_t)a2[48];
                    *(int128_t *)&a0[32] = (int128_t)a2[32];
                    *(uint128_t *)&a0[48] = v4;
                    if (v2 != 64)
                    {
                        v5 = (int128_t)a2[80];
                        *(int128_t *)&a0[64] = (int128_t)a2[64];
                        *(uint128_t *)&a0[80] = v5;
                        if (v2 != 96)
                        {
                            v6 = (int128_t)a2[112];
                            *(int128_t *)&a0[96] = (int128_t)a2[96];
                            *(uint128_t *)&a0[112] = v6;
                        }
                    }
                }
                if (v2 == v0)
                    goto LABEL_aaa4cc;
                if (v0 & 24)
                    goto LABEL_aaa484;
            }
        }
        iter = a0 + v2;
        v15 = a2 + v2;
        i = v0 - v2;
        do
        {
            v17 = i;
            v18 = v15 + 1;
            *(char *)iter = *(char *)v15;
            iter += 1;
            i = v17 - 1;
            v15 = v18;
        } while (i);
LABEL_aaa4cc:
        if (127 < a1)
            goto LABEL_aaa504;
    }
    v20 = *((char *)a0 + v0 - 1);
    j = 128 - v0;
    iter1 = a0;
    do
    {
        v23 = j;
        v24 = (&g_df6c5d)[*(char *)iter1 + v20 & 0xff];
        *((char *)iter1 + a1) = (&g_df6c5d)[*(char *)iter1 + v20 & 0xff];
        iter1 += 1;
        j = v23 - 1;
        v20 = v24;
    } while (j);
LABEL_aaa504:
    v26 = v1 + 7 >> 3;
    v27 = 128 - v26;
    v28 = (&g_df6c5d)[0xff >> ((char)-v1 & 7 & 31) & *((char *)a0 + v27)];
    *((char *)a0 + v27) = v28;
    if ((unsigned int)v26 != 128)
    {
        k = v27 & 0xffffffff;
        v30 = a0 - 1;
        do
        {
            v31 = k;
            v32 = (&g_df6c5d)[(v30[v31 + (v26 & 0xffffffff)] ^ v28) & 0xff];
            v30[v31] = (&g_df6c5d)[(v30[v31 + (v26 & 0xffffffff)] ^ v28) & 0xff];
            k = v31 - 1;
            v28 = v32;
        } while (k);
    }
    v34 = 0;
    v35 = 252;
    do
    {
        v36 = v34;
        *(unsigned int *)((char *)a0 + v35) = *(short *)((char *)a0 + v36 + 126);
        v35 -= 4;
        v34 = v36 - 2;
    } while (1 < v36 + 127);
    return a0;
}
