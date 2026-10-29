/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4b24c..0xb4b494 (584 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f14390;
extern unsigned int g_f14394;
extern unsigned long long g_f14398;
extern unsigned short g_f143a0;
extern unsigned int g_f143a4;
extern unsigned int g_f143a8;
extern unsigned int g_f143ac;
extern unsigned long long g_f143b0;
extern unsigned short g_f143b8;
extern unsigned int g_f143bc;
extern unsigned int g_f143c0;
extern unsigned int g_f143c4;
extern unsigned long long g_f143c8;
extern unsigned short g_f143d0;
extern unsigned int g_f143d4;
extern unsigned int g_f143d8;
extern unsigned int g_f143dc;
extern unsigned long long g_f143e0;
extern unsigned short g_f143e8;
extern unsigned int g_f143ec;

unsigned int sub_b4b24c(void)
{
    unsigned long v6;  // x0
    unsigned long long v7;  // 4140
    unsigned long long v16;  // 4127
    unsigned long long v17;  // 4112
    unsigned long long v8;  // 4112
    unsigned long v9;  // x0
    unsigned long long v10;  // 4127
    unsigned long long v11;  // 4112
    unsigned long v12;  // x0
    unsigned long long v13;  // 4127
    unsigned long long v14;  // 4112
    unsigned int v15;  // w0
    char v0;  // [bp-0xb0], Other Possible Types: unsigned int
    unsigned short v1;  // [bp-0xac]
    unsigned long v2;  // [bp-0xa8]
    unsigned int v3;  // [bp-0x98]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = g_f14390;
    v7 = arm64g_calculate_condition(1, v6 & 0xffffffff, 1, 0);
    if (!(v7 & 1))
    {
        v8 = arm64g_calculate_condition(1, _fstat(v6, &v0) & 0xffffffff, 1, 0);
        if (!(v8 & 1) && g_f14394 == v0 && g_f14398 == v2 && 0x200 > (v1 ^ g_f143a0) && g_f143a4 == v3)
            _close(g_f14390);
    }
    g_f14390 = 0xffffffff;
    v9 = g_f143a8;
    v10 = arm64g_calculate_condition(1, v9 & 0xffffffff, 1, 0);
    if (!(v10 & 1))
    {
        v11 = arm64g_calculate_condition(1, _fstat(v9, &v0) & 0xffffffff, 1, 0);
        if (!(v11 & 1) && g_f143ac == v0 && g_f143b0 == v2 && 0x1ff >= (v1 ^ g_f143b8) && g_f143bc == v3)
            _close(g_f143a8);
    }
    g_f143a8 = 0xffffffff;
    v12 = g_f143c0;
    v13 = arm64g_calculate_condition(1, v12 & 0xffffffff, 1, 0);
    if (!(v13 & 1))
    {
        v14 = arm64g_calculate_condition(1, _fstat(v12, &v0) & 0xffffffff, 1, 0);
        if (!(v14 & 1) && g_f143c4 == v0 && g_f143c8 == v2 && 0x1ff >= (v1 ^ g_f143d0) && g_f143d4 == v3)
            _close(g_f143c0);
    }
    g_f143c0 = 0xffffffff;
    v15 = g_f143d8;
    v16 = arm64g_calculate_condition(1, g_f143d8, 1, 0);
    if (!(v16 & 1))
    {
        v15 = _fstat(g_f143d8, &v0);
        v17 = arm64g_calculate_condition(1, v15, 1, 0);
        if (!(v17 & 1) && g_f143dc == v0 && g_f143e0 == v2 && 0x1ff >= (v1 ^ g_f143e8) && g_f143ec == v3)
            v15 = _close(g_f143d8);
    }
    g_f143d8 = 0xffffffff;
    return v15;
}
