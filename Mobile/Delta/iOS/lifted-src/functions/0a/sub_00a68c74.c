/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa68c74..0xa68d40 (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_a69594;

char sub_a68c74(unsigned long a0)
{
    char idx;  // x19
    char v7;  // x0
    char v8;  // x0
    char v9;  // x0
    unsigned long v0;  // [bp-0x48]
    uint128_t v1;  // [bp-0x40]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = __double_as_longlong(0) * 0x10000000000000000;
    v2 = 0x200;
    v3 = 4294967297;
    v0 = a0;
    idx = sub_a6bffc(40, "crypto/core_namemap.c", 528);
    if (!idx)
        return idx;
    v7 = sub_a7c11c();
    *(unsigned long long *)(idx + 16) = v7;
    if (v7)
    {
        v8 = sub_a632f4(&v0);
        *(unsigned long long *)(idx + 8) = v8;
        if (v8)
        {
            v9 = sub_ad61b4();
            *(unsigned long long *)(idx + 24) = v9;
            if (v9)
                return idx;
        }
    }
    if (*(char *)idx & 1)
        return 0;
    sub_ad6958(*(long long *)(idx + 24), &g_a69594);
    sub_a635e4(*(long long *)(idx + 8));
    sub_a7c1d0(v7);
    sub_a6c2e4(idx, "crypto/core_namemap.c", 557);
    return 0;
}
