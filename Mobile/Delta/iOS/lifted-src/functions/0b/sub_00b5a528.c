/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5a528..0xb5a60c (228 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

long long sub_b5a528(long long a0)
{
    unsigned long v8;  // x0
    long long *v9;  // x19
    unsigned long v10;  // x19
    long long v11;  // x0
    uint128_t v0;  // [bp-0x90]
    uint128_t v1;  // [bp-0x80]
    uint128_t v2;  // [bp-0x70]
    uint128_t v3;  // [bp-0x60]
    uint128_t v4;  // [bp-0x50]
    unsigned long v5;  // [bp-0x38]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v5 = *(long long *)&g_10002b0;
    if (sub_a2f9e0())
    {
        v8 = sub_a6bffc(64, "providers/implementations/kdfs/pvkkdf.c", 48);
        if (v8)
        {
            v9 = v8;
            *v9 = a0;
            v10 = v9 + 5;
            v3 = 0;
            v4 = 0;
            v1 = 0;
            v2 = 0;
            v0 = 0;
            v11 = sub_9f2aec(a0);
            sub_a71618("digest", "SHA1", 0);
            if (!sub_afe114(v10, &v0, v11))
                sub_afe028(v10);
        }
    }
    else
    {
        v8 = 0;
    }
    if (*(long long *)&g_10002b0 == v5)
        return v8;
    ___stack_chk_fail();
}
