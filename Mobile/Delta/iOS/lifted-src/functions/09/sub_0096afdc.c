/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x96afdc..0x96b0bc (224 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

long long sub_96afdc(long long *a0, long long a1, long long a2, long long a3)
{
    long long v11;  // x0
    uint128_t v0;  // [bp-0xb0]
    uint128_t v1;  // [bp-0xa0]
    unsigned long long v2;  // [bp-0x90]
    char v3;  // [bp-0x88]
    uint128_t v4;  // [bp-0x60]
    uint128_t v5;  // [bp-0x50]
    unsigned long long v6;  // [bp-0x40]
    unsigned long v7;  // [bp-0x38]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v7 = *(long long *)&g_10002b0;
    if (*a0)
    {
        sub_a71bbc(sub_a71618("digest", a3, 0), a3, 0);
        v4 = v0;
        v5 = v1;
        v6 = v2;
        if (!sub_a58104(*a0, a1, a2, &v3))
            goto LABEL_96b068;
        v11 = 1;
    }
    else
    {
LABEL_96b068:
        if (a0[1])
            v11 = sub_9706a0(a0, a1, a2, a3);
        else
            v11 = 0;
    }
    if (*(long long *)&g_10002b0 == v7)
        return v11;
    ___stack_chk_fail();
}
