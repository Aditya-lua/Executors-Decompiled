/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ada10..0x9add70 (864 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9ada10_2 {
    char padding_0[128];
    struct st_9ada10_3 *field_80;
} st_9ada10_2;

typedef struct st_9ada10_5 {
    char padding_0[24];
    struct st_9ada10_2 *field_18;
    char padding_20[1232];
    struct st_9ada10_4 *field_4f0;
    char padding_4f8[1232];
    long long field_9c8;
} st_9ada10_5;

typedef struct st_9ada10_4 {
    char padding_0[280];
    long long field_118;
} st_9ada10_4;

typedef struct st_9ada10_3 {
    unsigned long long field_0;
} st_9ada10_3;

extern char g_10002b0;

unsigned int sub_9ada10(st_9ada10_5 *a0, void* a1)
{
    void* v5;  // x22
    long long v6;  // x9
    unsigned long v7;  // x8
    void* v8;  // x21
    void* v9;  // x0
    void* v10;  // q1
    uint128_t v11;  // q0
    uint128_t v12;  // q2
    unsigned long v13;  // x9
    void* v0;  // [bp-0x50]
    unsigned short v1;  // [bp-0x4a]
    unsigned long v2;  // [bp-0x48]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v2 = *(long long *)&g_10002b0;
    v5 = (long long)a1[32];
    if ((unsigned long long)(long long)a1[8] >= (long long)a1[24] + v5)
    {
        v6 = a0->field_9c8;
        if (17740 >= (unsigned long long)a0->field_9c8)
            v6 = 17740;
        if ((unsigned long long)(long long)a1[8] <= (unsigned long long)v6)
        {
            if (!v5)
            {
                if (*(long long *)&g_10002b0 == v2)
                    return 0xfffffffd;
                ___stack_chk_fail();
            }
            v0 = 0;
            v7 = (short)a1[16];
            v1 = (((((v7 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v7 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v7 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v7 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 48;
            v8 = sub_954360(a0->field_4f0->field_118, &v0);
            if (!v8)
            {
                v9 = sub_9ad744((long long)a1[8], 1);
                if (v9)
                {
                    v10 = (void*)(int128_t)a1[32];
                    v11 = (int128_t)a1[48];
                    v12 = (int128_t)a1[16];
                    *(int128_t *)v9 = *(int128_t *)a1;
                    *(uint128_t *)&v9[16] = v12;
                    *(uint128_t *)&v9[32] = (uint128_t)v10;
                    *(uint128_t *)&v9[48] = v11;
                    v13 = (long long)v9[8];
                    *(unsigned long long *)&v9[24] = 0;
                    *(unsigned long *)&v9[32] = v13;
                    if ((long long)v9[72])
                        a0->field_18->field_80();
LABEL_9adbb0:
                    a0->field_18->field_80();
                }
            }
            else if (*(long long *)((long long)v8[8] + 8) == (long long)a1[8])
            {
                if (*(long long *)((long long)v8[8] + 72))
                    a0->field_18->field_80();
                goto LABEL_9adbb0;
            }
        }
    }
    if (*(long long *)&g_10002b0 == v2)
        return 0xffffffff;
    ___stack_chk_fail();
}
