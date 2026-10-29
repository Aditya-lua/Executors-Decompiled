/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf0a8c..0xaf0b5c (208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_af0a8c(unsigned long a0, unsigned long a1, unsigned long a2, unsigned long a3)
{
    unsigned long long v3;  // x11
    unsigned long long v4;  // x8
    unsigned long long v13;  // x30
    unsigned long long v5;  // 4114
    unsigned long long v6;  // x11
    unsigned long long v7;  // w13
    unsigned long long v8;  // w12
    unsigned int v9;  // w13
    unsigned int v10;  // w12
    unsigned long long v12;  // 4106
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (a1 != a3)
        return 0;
    v3 = 0xffffffffffffffff;
    do
    {
        v4 = v3;
        v5 = arm64g_calculate_condition(2, a1 + v3, 1, 0);
        if (v5 & 1)
            goto LABEL_af0b34;
    } while (*(char *)(a0 + a1 + v4) != 64 && (v3 = v4 - 1, *(char *)(a2 + a1 + v4) != 64));
    if (v4)
    {
        v6 = v4;
        do
        {
            v7 = *(char *)(a0 + a1 + v6);
            if (!v7)
                return 0;
            v8 = *(char *)(a2 + a1 + v6);
            if (v7 != v8)
            {
                if (v7 - 65 < 26)
                    v9 = v7 | 32;
                else
                    v9 = v7 & 0xff;
                if (v8 - 65 < 26)
                    v10 = v8 | 32;
                else
                    v10 = v8 & 0xff;
                if (v9 != v10)
                    return 0;
            }
            v12 = arm64g_calculate_condition(0x22, v6, 1, 0);
            v6 += 1;
        } while (!(v12 & 1));
    }
    if (!(a1 + v4))
LABEL_af0b34:
    v0 = &v2;
    v1 = v13;
    return !_memcmp();
}
