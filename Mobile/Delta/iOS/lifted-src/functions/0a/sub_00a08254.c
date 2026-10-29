/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa08254..0xa08450 (508 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_c90746;
extern long long g_d3c838;
extern char g_10002b0;

long long sub_a08254(long long a0, char *a1, long long a2, long long a3, long long a4, long long a5, long long a6, unsigned int a7)
{
    char *v7;  // x19
    unsigned int v8;  // w8
    long long v17;  // x8
    long long v18;  // x20
    long long v19;  // x8
    long long v20;  // x8
    long long v21;  // x8
    long long v22;  // x8
    unsigned int v9;  // w10
    unsigned int v10;  // w11
    unsigned long long v11;  // 4102
    unsigned long long v12;  // 4118
    long long v13;  // x0
    unsigned long long v14;  // 4112
    unsigned long long v15;  // 4112
    long long v16;  // x8
    char v0;  // [bp-0x320]
    char v1;  // [bp-0x2a8]
    char v2;  // [bp-0x270]
    char v3;  // [bp-0x170]
    unsigned long v4;  // [bp-0x70]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0], Other Possible Types: long long

    v5 = &v6;
    v4 = *(long long *)&g_10002b0;
    v7 = a1 + 57;
    v8 = 56;
    while (1)
    {
        v9 = v7[v8];
        v10 = (&g_c90746)[v8];
        if (v10 < v9)
        {
            if (*(long long *)&g_10002b0 == v4)
                return 0;
            ___stack_chk_fail();
        }
        v11 = arm64g_calculate_condition(0x33, v9 & 0xff, v10 & 0xff, 0);
        if (v11 & 1)
            break;
        v8 -= 1;
        v12 = arm64g_calculate_condition(0x11, v8, 1, 0);
        if (!(v12 & 1))
        {
            if (*(long long *)&g_10002b0 == v4)
                return 0;
            ___stack_chk_fail();
        }
    }
    v13 = sub_a06060(&v3, a2);
    v14 = arm64g_calculate_condition(0x11, v13 & 0xffffffff, 1, 0);
    if (!(v14 & 1))
    {
        v13 = sub_a06060(&v2, a1);
        v15 = arm64g_calculate_condition(1, v13 & 0xffffffff, 1, 0);
        if (v15 & 1)
        {
            v16 = sub_a3f728();
            v17 = v16;
            if (v17 && (v18 = v16, v19 = v18, v17 = v19, sub_a08140(a0, v16, a5, a6, a7, v6) && (v20 = v18, v17 = v20, sub_a3fe10(v19, a1, 57) && (v21 = v18, v17 = v21, sub_a3fe10(v20, a2, 57) && (v22 = v18, v17 = v22, sub_a3fe10(v21, a3, a4) && (v17 = v18, sub_a400f8(v22, &v0, 114)))))))
            {
                sub_a3f73c(v17);
                sub_a0a0cc(&v1, &v0, 114);
                sub_a66ec0(&v0, 114);
                sub_a099dc(&v1, &g_d3c838, &v1);
                sub_a0a0cc(&v0, v7, 57);
                sub_a06ed0(&v3, &v0, &v3, &v1);
                v13 = sub_a054c4(&v3, &v2);
            }
            else
            {
                sub_a3f73c(v17);
                if (*(long long *)&g_10002b0 == v4)
                    return 0;
                ___stack_chk_fail();
            }
        }
    }
    if (*(long long *)&g_10002b0 == v4)
        return v13;
    ___stack_chk_fail();
}
