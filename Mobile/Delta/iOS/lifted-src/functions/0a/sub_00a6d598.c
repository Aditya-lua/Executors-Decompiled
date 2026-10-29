/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6d598..0xa6d688 (240 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_f12eb0;
extern unsigned long long g_f12eb8;
extern char g_f12ec8;
extern unsigned long long g_f12ee8;

void sub_a6d598(unsigned long a0, unsigned long long a1, char *a2)
{
    unsigned long long v2;  // x8
    unsigned long long v3;  // x9
    unsigned long long v12;  // x8
    unsigned long v13;  // x9
    unsigned long long v14;  // x10
    unsigned long long v4;  // x10
    unsigned long long v5;  // x11
    unsigned long v6;  // cc_dep1
    unsigned long long v7;  // x10
    unsigned long long v8;  // 4110
    unsigned long long v9;  // 4102
    unsigned long long v10;  // 4110
    unsigned long long v11;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!(a1 >> 31 & 1) && !(v2 = a1 & 0xffffffff, *(long long *)&g_f12ec8 <= (long long)v2))
    {
        v3 = a0 - g_f12eb0;
        v4 = g_f12eb8 >> ((char)v2 & 63);
        v5 = v4 - 1;
        v6 = v5 & v3;
        if (v5 & v3)
            goto LABEL_a6d640;
        v7 = v3 / v4 + (1 << ((char)v2 & 63));
        if (v7)
        {
            v8 = arm64g_calculate_condition(26, v6, 0, 0);
            v9 = arm64g_calculate_condition(36, (v8 & 1 ? v7 : 0x20000000), (v8 & 1 ? g_f12ee8 : 0), 0);
            if (!(v9 & 1))
            {
                v12 = v7 >> 3;
                v13 = a2[v12];
                v14 = 1 << ((char)v7 & 7 & 63);
                if (!(v14 & v13))
                {
                    a2[v12] = (char)v13 | (char)v14;
                    return;
                }
                sub_a69928("assertion failed: !TESTBIT(table, bit)", "crypto/mem_sec.c", 386);
            }
        }
        else
        {
            v10 = arm64g_calculate_condition(26, v6, 0, 0);
            v11 = arm64g_calculate_condition(32, (v10 & 1 ? 0 : 0x20000000), (v10 & 1 ? g_f12ee8 : 0), 0);
            if (!(v11 & 1))
            {
                v12 = v7 >> 3;
                v13 = a2[v12];
                v14 = 1 << ((char)v7 & 7 & 63);
                if (!(v14 & v13))
                {
                    a2[v12] = (char)v13 | (char)v14;
                    return;
                }
                sub_a69928("assertion failed: !TESTBIT(table, bit)", "crypto/mem_sec.c", 386);
            }
        }
    }
    else
    {
        sub_a69928("assertion failed: list >= 0 && list < sh.freelist_size", "crypto/mem_sec.c", 382);
LABEL_a6d640:
        sub_a69928("assertion failed: ((ptr - sh.arena) & ((sh.arena_size >> list) - 1)) == 0", "crypto/mem_sec.c", 383);
    }
    sub_a69928("assertion failed: bit > 0 && bit < sh.bittable_size", "crypto/mem_sec.c", 385);
    sub_a69928("assertion failed: !TESTBIT(table, bit)", "crypto/mem_sec.c", 386);
}
