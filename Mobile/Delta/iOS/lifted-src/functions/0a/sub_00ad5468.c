/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad5468..0xad55f0 (392 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

unsigned long long sub_ad5468(long long a0, long long a1, long long a2, unsigned long a3, unsigned long a4)
{
    unsigned int v4;  // w0
    unsigned long long v5;  // 4125
    unsigned int v6;  // w24
    unsigned long long v7;  // x0
    unsigned long long v8;  // x19
    unsigned long long v9;  // x20
    unsigned long long v10;  // x24
    long long v11;  // x23
    unsigned long long v12;  // x21
    char v0;  // [bp-0x5c]
    unsigned long v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = *(long long *)&g_10002b0;
    v4 = sub_9e46a8(a2);
    v5 = arm64g_calculate_condition(177, v4, 7, 0);
    if (v5 & 1)
        v6 = v4 + 14;
    else
        v6 = v4 + 7;
    v7 = sub_a40ca8();
    if (v7)
    {
        v8 = v7;
        if (a0 != a2 && !(sub_9e53a8(a0, a2) >> 31 & 1) || a1 != a2 && !(sub_9e53a8(a1, a2) >> 31 & 1))
        {
            v9 = 0;
LABEL_ad5508:
            v12 = 0;
        }
        else
        {
            v10 = (int)(v6) >> 3;
            v11 = (unsigned int)v10 * 2;
            v9 = sub_a6bf4c(v11, "crypto/srp/srp_lib.c", 42);
            if (!v9 || sub_9e5174(a0, v9, v10) >> 31 & 1 || sub_9e5174(a1, v9 + (int)v10, v10) >> 31 & 1 || !sub_a40abc(v9, v11, &v0, 0, v8, 0))
                goto LABEL_ad5508;
            v12 = sub_9e4db0(&v0, 20, 0);
        }
        sub_a3f52c(v8);
        sub_a6c2e4(v9, "crypto/srp/srp_lib.c", 0x33);
    }
    else
    {
        v12 = 0;
    }
    if (*(long long *)&g_10002b0 == v1)
        return v12;
    ___stack_chk_fail();
}
