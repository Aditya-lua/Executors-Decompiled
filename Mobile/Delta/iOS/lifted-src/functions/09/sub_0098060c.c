/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98060c..0x9806fc (240 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_98060c_1 {
    char padding_0[16];
    unsigned long long field_10;
} st_98060c_1;

typedef struct st_98060c_0 {
    char padding_0[24];
    long long field_18;
} st_98060c_0;

extern char g_10002b0;

char sub_98060c(st_98060c_0 *a0, unsigned long a1, void* a2)
{
    unsigned long long v6;  // 4124
    char idx;  // x0
    char *v8;  // x20
    uint128_t v0;  // [bp-0x70]
    unsigned long v1;  // [bp-0x63]
    st_98060c_1 *v2;  // [bp-0x50]
    unsigned long v3;  // [bp-0x38]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v3 = *(long long *)&g_10002b0;
    if (a2 && !(v6 = arm64g_calculate_condition(49, *(char *)a2 - 21, 13, 0), v6 & 1))
    {
        idx = sub_9806fc();
        if (idx)
        {
            if (*(char *)(idx + 40) & 1 || (v8 = (char *)idx, v0 = *(int128_t *)a2, v1 = (long long)a2[13], v2 = &a0->padding_0[8], sub_a66b6c(a0->field_18, &v0)))
                goto LABEL_980688;
            idx = sub_9807e4(a0, v8, a2);
            if (idx)
            {
                *(unsigned long *)(idx + 24) = 0xffffffffffffffff;
                *(char *)(idx + 48) = *(char *)(idx + 48) & 252;
                *(unsigned long long *)&v8[24] = idx;
                v8[40] = v8[40] | 1;
                idx = 1;
            }
        }
    }
    else
    {
LABEL_980688:
        idx = 0;
    }
    if (*(long long *)&g_10002b0 == v3)
        return idx;
    ___stack_chk_fail();
}
