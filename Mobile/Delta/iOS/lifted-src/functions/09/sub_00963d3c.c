/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x963d3c..0x963e34 (248 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

long long sub_963d3c(long long a0, long long a1, long long a2)
{
    unsigned long v11;  // x0
    unsigned long v12;  // x0
    unsigned long v13;  // x20
    uint128_t v0;  // [bp-0xb8]
    uint128_t v1;  // [bp-0xa8]
    unsigned long long v2;  // [bp-0x98]
    unsigned int v3;  // [bp-0x8c]
    char v4;  // [bp-0x88]
    uint128_t v5;  // [bp-0x60]
    uint128_t v6;  // [bp-0x50]
    unsigned long long v7;  // [bp-0x40]
    unsigned long v8;  // [bp-0x38]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v8 = *(long long *)&g_10002b0;
    v11 = sub_970594(a1);
    if (!v11)
    {
        sub_a36c8c();
        v12 = sub_a4e104(a0, sub_a9976c(a1), a2);
        if (v12)
        {
            v3 = 0;
            v13 = v12;
            sub_a71bbc(sub_a6ffac("decrypt-only", &v3), &v3);
            v5 = v0;
            v6 = v1;
            v7 = v2;
            v11 = v13;
            if (!sub_a4dc90(v13, &v4) || !v3)
                goto LABEL_963dfc;
            sub_a4bbe4(v11);
        }
        v11 = 0;
LABEL_963dfc:
        sub_a36cd4();
    }
    if (*(long long *)&g_10002b0 == v8)
        return v11;
    ___stack_chk_fail();
}
