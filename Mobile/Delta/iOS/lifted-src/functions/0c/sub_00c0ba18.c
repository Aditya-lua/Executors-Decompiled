/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc0ba18..0xc0c4e8 (2768 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_bed184;
extern long long g_cba67f;
extern char g_e06a9c;
extern unsigned long long g_efb458;
extern long long g_efb488;

double sub_c0ba18(void* a0, char *a1, unsigned long a2)
{
    unsigned long v5;  // x10
    char *v6;  // x8
    unsigned long long v7;  // x9
    unsigned long long v8;  // x0
    unsigned long long v9;  // x11
    unsigned long long v10;  // x1
    unsigned long v11;  // x9
    unsigned long long v12;  // x8
    uint128_t v13;  // q0
    char v0[11];  // [bp-0xe1]
    char *v1;  // [bp-0xc0]
    unsigned long long v2;  // [bp-0xb8]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    if (a2)
    {
        v5 = *a1;
        *v0 = v5;
        if (9 >= (unsigned int)v5)
        {
            goto *((void *)(sub_c0ba7c + (&g_e06a9c)[v5] * 4));
        }
        else
        {
            v6 = &v0[0];
            v7 = &g_bed184;
            v1 = &v0[0];
            v2 = &g_bed184;
            v8 = sub_c73b38(&g_cba67f, &v1, &g_efb458);
            do
            {
                v10 = &g_efb458;
                sub_c73bb0(v8, &g_efb458, &g_efb458, &g_efb488);
                if (v7 == 6)
                {
LABEL_c0bc2c:
                    v12 = 0;
                    v10 = 1;
                    goto LABEL_c0bc34;
                }
                else
                {
                    v5 = v5 & 0xfffffff800000000 | (v5 & 0xfffffff80fffffff | (v9 * 0x10000000 | v9 >> 36) & 0x7f0000000) & 0x7ffffffff;
                    v9 = v6[6];
                    if (!(v9 >> 31 & 1))
                    {
                        v6 = 35;
                        v8 = 6;
                        continue;
                    }
                    if (v7 == 7)
                        goto LABEL_c0bc2c;
                    v5 |= ((unsigned int)v9 & 127) * 0x800000000;
                    v9 = v6[7];
                    if (!(v9 >> 31 & 1))
                    {
                        v6 = 42;
                        v8 = 7;
                        continue;
                    }
                    if (v7 == 8)
                        goto LABEL_c0bc2c;
                    v5 |= ((unsigned int)v9 & 127) * 0x40000000000;
                    v9 = v6[8];
                    if (!(v9 >> 31 & 1))
                    {
                        v6 = 49;
                        v8 = 8;
                        continue;
                    }
                    if (v7 == 9)
                        goto LABEL_c0bc2c;
                    v5 |= ((unsigned int)v9 & 127) * 0x2000000000000;
                    v9 = v6[9];
                    if (!(v9 >> 31 & 1))
                    {
                        v6 = 56;
                        v8 = 9;
                        continue;
                    }
                    if (v7 == 10)
                        goto LABEL_c0bc2c;
                    v11 = v6[10];
                    if (!(v11 >> 31 & 1))
                    {
                        v5 |= ((unsigned int)v9 & 127) * 0x100000000000000;
                        v6 = 63;
                        v8 = 10;
                        v9 = v11;
                    }
                    else
                    {
                        v13 = __double_as_longlong(0x2f2f2f2f2f2f2f2f) * 0x10000000000000000;
                        v12 = 1;
LABEL_c0bc34:
                        *(unsigned long long *)&a0[16] = v10;
                        *(uint128_t *)&a0[24] = v13;
                        *(unsigned long long *)a0 = 1;
                        *(unsigned long long *)&a0[8] = v12;
                        goto LABEL_c0bce4;
                    }
                }
            } while ((v7 = (char *)&g_efb458 - v8, &g_efb458 < v8));
            *(unsigned long long *)&a0[16] = v7;
            *(char *)&a0[24] = 3;
            *(unsigned long *)&a0[32] = (int)v9 << ((char)v6 & 63) | v5;
            *(unsigned long long **)&a0[8] = (char *)&g_efb458 + v8;
            *(unsigned long long *)a0 = 0;
        }
    }
    else
    {
        *(char **)&a0[16] = a1;
        *(unsigned long long *)&a0[24] = 0;
        *(char *)&a0[32] = 23;
        v13 = CONCAT(1, 1);
        *(uint128_t *)a0 = v13;
    }
LABEL_c0bce4:
    return (unsigned long long)v13;
}
