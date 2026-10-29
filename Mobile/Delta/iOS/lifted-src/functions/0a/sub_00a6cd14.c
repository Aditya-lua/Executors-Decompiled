/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6cd14..0xa6ce80 (364 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a6cd14_0 {
    char field_0;
} st_a6cd14_0;

extern unsigned long long g_f12eb0;
extern unsigned long long g_f12eb8;
extern long long g_f12ec8;
extern unsigned long long g_f12ed0;
extern st_a6cd14_0 *g_f12ed8;
extern unsigned long long g_f12ee8;

long long sub_a6cd14(unsigned long a0)
{
    unsigned long long v2;  // x9
    unsigned long v3;  // cc_op
    unsigned long v6;  // cc_ndep
    unsigned long long v7;  // 4110
    unsigned long long v8;  // 4102
    unsigned long v9;  // cc_dep1
    unsigned long v10;  // cc_dep2
    unsigned long long v11;  // x13
    unsigned long v12;  // x9
    unsigned long long v13;  // x14
    unsigned long long v14;  // x13
    unsigned long long v15;  // x13
    unsigned long long v16;  // x11
    unsigned long long v17;  // x12
    unsigned long long v18;  // x14
    unsigned long v19;  // cc_dep1
    unsigned long long v20;  // x11
    unsigned long long v21;  // 4110
    unsigned long long v22;  // 4102
    unsigned long long v23;  // 4110
    unsigned long long v24;  // 4102
    unsigned long long v4;  // 4110
    unsigned long long v5;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = g_f12eb0 + g_f12eb8;
    if (g_f12eb0 <= a0)
    {
        v4 = arm64g_calculate_condition(v3 | 144, v9, v10, v6);
        v5 = arm64g_calculate_condition(148, (v4 & 1 ? v2 : 0), (v4 & 1 ? a0 : 0), 0);
        if (v5 & 1)
            goto LABEL_a6ce08;
LABEL_a6cd38:
        v11 = a0 + g_f12eb8 - g_f12eb0;
        v12 = g_f12ec8 - 1;
        if (v11 >= g_f12ed0)
        {
            v13 = v11 / g_f12ed0;
            while (1)
            {
                v14 = v13;
                if ((char)(*(char *)&g_f12ed8[v13 >> 3]) >> ((char)v14 & 7 & 63) & 1)
                    break;
                if (!(v14 & 1))
                {
                    v13 = v14 >> 1;
                    v12 -= 1;
                    if (!v14)
                        break;
                }
                else
                {
                    sub_a69928("assertion failed: (bit & 1) == 0", "crypto/mem_sec.c", 349);
                    goto LABEL_a6ce08;
                }
            }
        }
        if (v12 >> 31 & 1 || (v15 = v12 & 0xffffffff, g_f12ec8 <= (long long)v15))
            goto LABEL_a6ce20;
        v16 = a0 - g_f12eb0;
        v17 = g_f12eb8 >> ((char)v15 & 63);
        v18 = v17 - 1;
        v19 = v18 & v16;
        if (v18 & v16)
            goto LABEL_a6ce38;
        v20 = v16 / v17 + (1 << ((char)v15 & 63));
        if (v20)
        {
            v21 = arm64g_calculate_condition(26, v19, 0, 0);
            v22 = arm64g_calculate_condition(36, (v21 & 1 ? v20 : 0x20000000), (v21 & 1 ? g_f12ee8 : 0), 0);
            if (!(v22 & 1))
            {
                if ((char)(*(char *)&g_f12ed8[v20 >> 3]) >> ((char)v20 & 7 & 63) & 1)
                    return g_f12eb8 >> ((char)v12 & 63);
                sub_a69928("assertion failed: sh_testbit(ptr, list, sh.bittable)", "crypto/mem_sec.c", 741);
            }
        }
        else
        {
            v23 = arm64g_calculate_condition(26, v19, 0, 0);
            v24 = arm64g_calculate_condition(32, (v23 & 1 ? 0 : 0x20000000), (v23 & 1 ? g_f12ee8 : 0), 0);
            if (!(v24 & 1))
            {
                if ((char)(*(char *)&g_f12ed8[v20 >> 3]) >> ((char)v20 & 7 & 63) & 1)
                    return g_f12eb8 >> ((char)v12 & 63);
                sub_a69928("assertion failed: sh_testbit(ptr, list, sh.bittable)", "crypto/mem_sec.c", 741);
            }
        }
    }
    else
    {
        v7 = arm64g_calculate_condition(v3 | 144, v9, v10, v6);
        v8 = arm64g_calculate_condition(144, (v7 & 1 ? v2 : 0), (v7 & 1 ? a0 : 0), 0);
        if (!(v8 & 1))
            goto LABEL_a6cd38;
LABEL_a6ce08:
        sub_a69928("assertion failed: WITHIN_ARENA(ptr)", "crypto/mem_sec.c", 737);
LABEL_a6ce20:
        sub_a69928("assertion failed: list >= 0 && list < sh.freelist_size", "crypto/mem_sec.c", 359);
LABEL_a6ce38:
        sub_a69928("assertion failed: ((ptr - sh.arena) & ((sh.arena_size >> list) - 1)) == 0", "crypto/mem_sec.c", 360);
    }
    sub_a69928("assertion failed: bit > 0 && bit < sh.bittable_size", "crypto/mem_sec.c", 362);
    sub_a69928("assertion failed: sh_testbit(ptr, list, sh.bittable)", "crypto/mem_sec.c", 741);
}
