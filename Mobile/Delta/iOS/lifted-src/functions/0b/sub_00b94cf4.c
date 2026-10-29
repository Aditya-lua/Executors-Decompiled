/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb94cf4..0xb94e50 (348 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b94cf4_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    char field_18;
} st_b94cf4_0;

extern unsigned long long g_e0dbf0[4];
extern unsigned long long g_e0dc70[4];
extern unsigned long long g_e0dcf0[4];
extern unsigned long long g_e0dd70[4];

long long sub_b94cf4(st_b94cf4_0 *a0, char a1)
{
    unsigned long long v0;  // x9
    unsigned long long v1;  // x8
    unsigned long long v10;  // x11
    unsigned long long v11;  // 4121
    unsigned long long v12;  // 4110
    unsigned long long v13;  // 4107
    unsigned long long v14;  // 4110
    unsigned long long v15;  // 4107
    unsigned long long v16;  // x11
    unsigned long long v2;  // x11
    unsigned long long v3;  // 4121
    unsigned long long v4;  // 4110
    unsigned long long v5;  // 4107
    unsigned long long v6;  // 4110
    unsigned long long v7;  // 4107
    unsigned long long v8;  // x11
    unsigned long long v9;  // x10

    v0 = g_e0dbf0[a1];
    v1 = a0->field_0;
    switch (v1)
    {
    case 9:
        if (g_e0dc70[a0->field_18] < v0)
            return 1;
        break;
    case 8:
        if (7 < v0)
            return 1;
        break;
    case 6:
        if (a0->field_8 != 9223372036854775810)
            goto LABEL_b94d60;
        v2 = a0->field_10 & 0x7fffffffffffffff;
        v3 = arm64g_calculate_condition(210, a0->field_10, 1, 0);
        if (v3 & 1)
        {
            v4 = arm64g_calculate_condition(212, a0->field_8, 9223372036854775810, 0);
            v5 = arm64g_calculate_condition(196, (v4 & 1 ? v2 : 0), (v4 & 1 ? 0x7fefffffffffffff : 0), 0);
            if (!(v5 & 1))
                goto LABEL_b94d52;
            v8 = 9;
LABEL_b94d51:
        }
        else
        {
            v6 = arm64g_calculate_condition(212, a0->field_8, 9223372036854775810, 0);
            v7 = arm64g_calculate_condition(192, (v6 & 1 ? v2 : 0), (v6 & 1 ? 0x7fefffffffffffff : 0), 0);
            if (v7 & 1)
                goto LABEL_b94d51;
            v8 = 7;
LABEL_b94d52:
        }
        if (v8 < v0)
            return 1;
        break;
    default:
LABEL_b94d60:
        if (v0 > 9)
            return 1;
    }
    v9 = g_e0dcf0[a1];
    switch (v1)
    {
    case 9:
        if (v9 != g_e0dd70[a0->field_18])
            return 0;
        break;
    case 8:
        if (v9 != 7)
            return 0;
        break;
    case 6:
        if (a0->field_8 != 9223372036854775810)
            goto LABEL_b94e04;
        v10 = a0->field_10 & 0x7fffffffffffffff;
        v11 = arm64g_calculate_condition(210, a0->field_10, 1, 0);
        if (v11 & 1)
        {
            v12 = arm64g_calculate_condition(212, a0->field_8, 9223372036854775810, 0);
            v13 = arm64g_calculate_condition(196, (v12 & 1 ? v10 : 0), (v12 & 1 ? 0x7fefffffffffffff : 0), 0);
            if (!(v13 & 1))
                goto LABEL_b94dda;
            v16 = 9;
LABEL_b94dd9:
        }
        else
        {
            v14 = arm64g_calculate_condition(212, a0->field_8, 9223372036854775810, 0);
            v15 = arm64g_calculate_condition(192, (v14 & 1 ? v10 : 0), (v14 & 1 ? 0x7fefffffffffffff : 0), 0);
            if (v15 & 1)
                goto LABEL_b94dd9;
            v16 = 7;
LABEL_b94dda:
        }
        if (v9 != v16)
            return 0;
        break;
    default:
LABEL_b94e04:
        if (v9 != 9)
            return 0;
    }
    return 2 > a1 - 5;
}
