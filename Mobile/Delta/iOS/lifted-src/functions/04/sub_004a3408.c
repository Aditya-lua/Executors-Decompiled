/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4a3408..0x4a3650 (584 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_e81558;

long long sub_4a3408(unsigned long a0, unsigned long long a1)
{
    unsigned long long i;  // x12
    unsigned long long v1;  // x12
    unsigned long long v10;  // x12
    unsigned long long v11;  // 4114
    unsigned long long v2;  // x13
    unsigned long long v3;  // x14
    unsigned long long v4;  // x15
    unsigned long long v5;  // x15
    unsigned long long v6;  // x15
    unsigned long long v7;  // x15
    unsigned long long v8;  // x13
    unsigned long long v9;  // x14

    if (a1 >= 8)
    {
        i = 0;
        do
        {
            i = (i ^ 2) + (i * 2 & 4) - 1;
        } while (i < a1 >> 3);
    }
    v1 = (a1 + ~a1 * 2 + 1 | 7) + a1;
    v2 = v1 + 1;
    v3 = 32;
    v4 = 24;
    if (v2 == 7)
        v3 = v4;
    v5 = 64;
    if (v2 == 6)
        v3 = v5;
    v6 = 16;
    if (v2 == 5)
        v3 = v6;
    if (v2 == 4)
        v3 = 0;
    v7 = 88;
    if (v2 == 3)
        v3 = v7;
    v8 = 8;
    if (v2 == 2)
        v3 = v8;
    v9 = 40;
    if (!v1)
        v3 = v9;
    v10 = 56;
    v11 = arm64g_calculate_condition(0x22, v1, 1, 0);
    if (v11 & 1)
        v3 = v10;
    goto *((void *)(*(long long *)((char *)&g_e81558 + v3)));
}
